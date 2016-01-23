package com.threshold.dagger2study.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.threshold.dagger2study.App;
import com.threshold.dagger2study.R;
import com.threshold.dagger2study.component.DaggerMainComponent;
import com.threshold.dagger2study.model.GreetManager;
import com.threshold.dagger2study.module.MainModule;
import com.threshold.dagger2study.presenter.interfaces.MainPresenter;
import com.threshold.dagger2study.ui.interfaces.MainView;
import com.threshold.dagger2study.utils.ToastUtil;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainView {

    private static final String TAG = "MainActivity";


    @Inject
    App app;

    @Inject
    GreetManager mGreetManager;

    @Inject
    MainPresenter mMainPresenter;


    @Bind(R.id.button1)
    Button mButton1;
    @Bind(R.id.button2)
    Button mButton2;
    @Bind(R.id.tvContent)
    TextView mTvContent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setUpMainComponent();
    }

    private void setUpMainComponent() {
        DaggerMainComponent.builder()
                .appComponent(App.getInstance(this).getAppComponent())
                .mainModule(new MainModule(this))
                .build()
                .inject(this);
        Log.w(TAG, "App injected?" + String.valueOf(app != null));
    }

    @OnClick({R.id.button1,R.id.button2})
     void onButtonClicked(View v) {
        switch (v.getId()) {
            case R.id.button1:
                mGreetManager.showNiHao();
                //mToastUtil.showShort("button1");
                Log.d(TAG, "button1 clicked");
                break;
            case R.id.button2:
                mGreetManager.showHello();
              //  mToastUtil.showLong("button2");
                Log.d(TAG, "button2 clicked");
                break;
        }
    }


    @Override
    protected void onResume() {
        super.onResume();
        mMainPresenter.onResume();
    }

    @Override
    public void showToast(CharSequence charSequence) {
        Toast.makeText(this,charSequence,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        mMainPresenter.onDestroy();
        super.onDestroy();
    }
}

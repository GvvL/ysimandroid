package com.yisheng.ysim.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.yisheng.ysim.DemoApplication;
import com.yisheng.easeui.ui.EaseBaseActivity;
import com.yisheng.ysim.R;

public class BaseActivity extends EaseBaseActivity {

    /**
     * OKHTTP3请求
     */



    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        Log.e("-----",this.getClass().getName());
        DemoApplication.getInstance().saveActivity(this);

    }

    @Override
    protected void onResume() {
        super.onResume();
      }

    @Override
    protected void onStart() {
        super.onStart();
      }

    public void back(View view) {
        finish();
    }

}

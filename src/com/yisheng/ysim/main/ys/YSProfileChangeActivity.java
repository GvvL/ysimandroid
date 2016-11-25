package com.yisheng.ysim.main.ys;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;

import com.yisheng.ysim.R;
import com.yisheng.ysim.ui.BaseActivity;

/**
 * Created by giw on 2016/11/25.
 */

public class YSProfileChangeActivity extends BaseActivity {

    private ViewDataBinding binding;

    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        binding = DataBindingUtil.setContentView(this, R.layout.ys_act_profile_change);
    }
}

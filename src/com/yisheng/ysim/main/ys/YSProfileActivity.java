package com.yisheng.ysim.main.ys;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.fastjson.JSONObject;
import com.bumptech.glide.Glide;
import com.yisheng.ysim.DemoApplication;
import com.yisheng.ysim.DemoHelper;
import com.yisheng.ysim.R;
import com.yisheng.ysim.databinding.YsActProfileBinding;
import com.yisheng.ysim.main.FXConstant;
import com.yisheng.ysim.ui.BaseActivity;

/**
 * Created by giw on 2016/11/25.
 */

public class YSProfileActivity extends BaseActivity implements View.OnClickListener {
    YsActProfileBinding binding;

    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        binding = DataBindingUtil.setContentView(this, R.layout.ys_act_profile);
        TextView titletv= (TextView) findViewById(R.id.ysnavber_title);
        titletv.setText("个人中心");
        initData(DemoApplication.getInstance().getUserJson());


    }
    private void initData(JSONObject object){
        if(!TextUtils.isEmpty(object.getString(FXConstant.JSON_KEY_AVATAR))) Glide.with(this).load(FXConstant.URL_AVATAR+object.getString(FXConstant.JSON_KEY_AVATAR)).into(binding.avatar);
        binding.name.setText(object.getString(FXConstant.JSON_KEY_NICK));
        String tel=object.getString(FXConstant.JSON_KEY_TEL);
        binding.tel.setText(tel.substring(0,3)+"****"+tel.substring(7,11));
        binding.score.setText(object.getString(FXConstant.JSON_KEY_SCORE));
        binding.yue.setText("¥ "+object.getString(FXConstant.JSON_KEY_MONEY));


        binding.btnAddr.setOnClickListener(this);
        binding.btnMessage.setOnClickListener(this);
        binding.btnSec.setOnClickListener(this);
        binding.btnYaoqing.setOnClickListener(this);
        binding.btnYouhui.setOnClickListener(this);
        binding.quit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_addr:
                startActivity(new Intent(this,YSAddrActivity.class));
                break;
            case R.id.btn_youhui:
                startActivity(new Intent(this,YSOrderActivity.class));
                break;
            case R.id.btn_sec:
                startActivity(new Intent(this,YSSecMainActivity.class));
                break;
            case R.id.btn_message:
                startActivity(new Intent());
                break;
            case R.id.btn_yaoqing:
                break;
            default:
        }
    }
    public void orderClick(View v){
        startActivity(new Intent(this,YSOrderActivity.class));
    }
}

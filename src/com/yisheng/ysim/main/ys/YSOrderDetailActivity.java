package com.yisheng.ysim.main.ys;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.widget.TextView;

import com.yisheng.ysim.R;
import com.yisheng.ysim.databinding.YsActOrderDetailBinding;
import com.yisheng.ysim.ui.BaseActivity;

/**
 * Created by giw on 2016/11/25.
 */

public class YSOrderDetailActivity extends BaseActivity {

    private YsActOrderDetailBinding binding;

    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        binding = DataBindingUtil.setContentView(this, R.layout.ys_act_order_detail);
        TextView titletv= (TextView) findViewById(R.id.ysnavber_title);
        titletv.setText("订单详情");
    }
}

package com.yisheng.ysim.main.ys;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.widget.TextView;

import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;
import com.yisheng.ysim.R;
import com.yisheng.ysim.databinding.YsActOrderBinding;
import com.yisheng.ysim.ui.BaseActivity;

/**
 * Created by giw on 2016/11/25.
 */

public class YSOrderActivity extends BaseActivity {

    private YsActOrderBinding binding;

    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        binding = DataBindingUtil.setContentView(this, R.layout.ys_act_order);
        TextView titletv= (TextView) findViewById(R.id.ysnavber_title);
        titletv.setText("订单管理");
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add("已完成", YSOrderFragment.class)
                .add("全部", YSOrderFragment.class)
                .add("待付款", YSOrderFragment.class)
                .create());
        binding.viewpager.setAdapter(adapter);
        binding.viewpager.setOffscreenPageLimit(5);
        binding.tablayout.setViewPager(binding.viewpager);
    }
}

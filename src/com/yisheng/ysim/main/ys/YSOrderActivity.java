package com.yisheng.ysim.main.ys;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;

import android.os.Bundle;
import android.widget.TextView;

import com.ogaclejapan.smarttablayout.utils.v4.Bundler;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;
import com.yisheng.ysim.R;
import com.yisheng.ysim.databinding.YsActOrderBinding;
import com.yisheng.ysim.main.ys.adapter.OrderAdapter;
import com.yisheng.ysim.ui.BaseActivity;

/**
 * Created by giw on 2016/11/25.
 */

public class YSOrderActivity extends BaseActivity {

    public static int curr_select=0;
    private YsActOrderBinding binding;
    public OrderAdapter orderAdapter;


    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        binding = DataBindingUtil.setContentView(this, R.layout.ys_act_order);
        TextView titletv= (TextView) findViewById(R.id.ysnavber_title);
        titletv.setText("订单管理");
        orderAdapter=new OrderAdapter(this);
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add("全部", YSOrderFragment.class,new Bundler().putInt("flag",0).get())
                .add("已支付", YSOrderFragment.class,new Bundler().putInt("flag",1).get())
                .add("未支付", YSOrderFragment.class,new Bundler().putInt("flag",2).get())
                .add("已完成", YSOrderFragment.class,new Bundler().putInt("flag",3).get())
                .create());
        binding.viewpager.setAdapter(adapter);
        binding.viewpager.setOffscreenPageLimit(5);
        binding.tablayout.setViewPager(binding.viewpager);
        binding.viewpager.setCurrentItem(curr_select);

    }
}

package com.yisheng.ysim.main.ys;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;
import com.yisheng.ysim.R;
import com.yisheng.ysim.databinding.YsActAddrBinding;
import com.yisheng.ysim.main.ys.adapter.AddrAdapter;
import com.yisheng.ysim.ui.BaseActivity;

import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;

/**
 * Created by giw on 2016/11/25.
 */

public class YSAddrActivity extends BaseActivity {

    private YsActAddrBinding binding;
    private AddrAdapter adapter;

    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        binding = DataBindingUtil.setContentView(this, R.layout.ys_act_addr);
        TextView titletv= (TextView) findViewById(R.id.ysnavber_title);
        titletv.setText("地址管理");

        binding.refreshLayout.setPtrHandler(new PtrDefaultHandler() {
            @Override
            public void onRefreshBegin(final PtrFrameLayout frame) {
                frame.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        adapter=new AddrAdapter(YSAddrActivity.this);
                        binding.listview.setAdapter(adapter);
                        frame.refreshComplete();
                    }
                }, 2000);
            }
        });
        binding.refreshLayout.postDelayed(new Runnable() {
            @Override
            public void run() {
                binding.refreshLayout.autoRefresh();
            }
        }, 600);

    }
}

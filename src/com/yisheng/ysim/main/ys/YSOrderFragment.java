package com.yisheng.ysim.main.ys;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.yisheng.ysim.R;
import com.yisheng.ysim.main.ys.adapter.OrderAdapter;

import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;

/**
 * Created by giw on 2016/11/25.
 */

public class YSOrderFragment extends Fragment {
    private ListView listView;
    private PtrClassicFrameLayout ptrClassicFrameLayout;
    private boolean isFirst=true;
    OrderAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.ys_frg_order,null);
        listView= (ListView) view.findViewById(R.id.listview);

        ptrClassicFrameLayout= (PtrClassicFrameLayout) view.findViewById(R.id.refreshLayout);

        ptrClassicFrameLayout.setPtrHandler(new PtrDefaultHandler() {
            @Override
            public void onRefreshBegin(final PtrFrameLayout frame) {
                frame.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        adapter=new OrderAdapter(getActivity());
                        listView.setAdapter(adapter);
                        frame.refreshComplete();
                        adapter.notifyDataSetChanged();
                    }
                },2000);
            }
        });
        ptrClassicFrameLayout.postDelayed(new Runnable() {
            @Override
            public void run() {
              ptrClassicFrameLayout.autoRefresh();
            }
        },1000);
        return view;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if(isVisibleToUser&&isFirst){
            isFirst=false;
            //执行加载

        }
    }
}

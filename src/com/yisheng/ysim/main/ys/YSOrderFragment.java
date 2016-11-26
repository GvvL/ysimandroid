package com.yisheng.ysim.main.ys;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yisheng.ysim.DemoApplication;
import com.yisheng.ysim.R;
import com.yisheng.ysim.main.FXConstant;
import com.yisheng.ysim.main.utils.OkHttpManager;
import com.yisheng.ysim.main.utils.Param;
import com.yisheng.ysim.main.ys.adapter.OrderAdapter;

import java.util.ArrayList;
import java.util.List;

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
    private OrderAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.ys_frg_order,null);
        listView= (ListView) view.findViewById(R.id.listview);
//        adapter=((YSOrderActivity)getActivity()).orderAdapter;
        adapter=new OrderAdapter(getActivity());
        listView.setAdapter(adapter);
        ptrClassicFrameLayout= (PtrClassicFrameLayout) view.findViewById(R.id.refreshLayout);

        ptrClassicFrameLayout.setPtrHandler(new PtrDefaultHandler() {
            @Override
            public void onRefreshBegin(final PtrFrameLayout frame) {
//                frame.postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//
//                        listView.setAdapter(adapter);
//                        frame.refreshComplete();
//                        adapter.notifyDataSetChanged();
//                    }
//                },2000);
                List<Param> params=new ArrayList<Param>();
                params.add(new Param("uid","8"));
                OkHttpManager.getInstance().post(params, FXConstant.URL_GET_ORDER, new OkHttpManager.HttpCallBack() {
                    @Override
                    public void onResponse(JSONObject jsonObject) {
                        frame.refreshComplete();
                        JSONArray array=jsonObject.getJSONArray("data");
                        adapter.setData(array);
                     }

                    @Override
                    public void onFailure(String errorMsg) {
                        frame.refreshComplete();
                        Toast.makeText(getActivity(),"加载失败",Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
        if(getArguments().getInt("flag",0)==0){
            ptrClassicFrameLayout.postDelayed(new Runnable() {
                @Override
                public void run() {
                    ptrClassicFrameLayout.autoRefresh();
                }
            },600);
        }


        return view;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if(isVisibleToUser&&isFirst&&getArguments().getInt("flag",0)!=0){
            isFirst=false;
            //执行加载
            if(null!=ptrClassicFrameLayout){
                ptrClassicFrameLayout.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ptrClassicFrameLayout.autoRefresh();
                    }
                },600);
            }


        }
    }
}

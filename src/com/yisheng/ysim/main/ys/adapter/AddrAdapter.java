package com.yisheng.ysim.main.ys.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.yisheng.ysim.R;
import com.yisheng.ysim.main.ys.YSOrderDetailActivity;

/**
 * Created by giw on 2016/11/25.
 */

public class AddrAdapter extends BaseAdapter {
    private Context mContext;
    public AddrAdapter(Context context){
        mContext=context;
    }

    @Override
    public int getCount() {
        return 8;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;
        if(null==convertView){

            convertView=LayoutInflater.from(mContext).inflate(R.layout.ys_cell_addr,null);
            vh=new ViewHolder();
            convertView.setTag(vh);
        }else{
            vh= (ViewHolder) convertView.getTag();
        }



        return convertView;
    }

    class ViewHolder{
        public ViewHolder(){

        }
    }
}

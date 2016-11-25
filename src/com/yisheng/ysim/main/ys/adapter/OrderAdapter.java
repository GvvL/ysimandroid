package com.yisheng.ysim.main.ys.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.yisheng.ysim.R;
import com.yisheng.ysim.main.moments.SocialFriendAdapter;
import com.yisheng.ysim.main.ys.YSOrderDetailActivity;

/**
 * Created by giw on 2016/11/25.
 */

public class OrderAdapter extends BaseAdapter {
    private Context mContext;
    public OrderAdapter(Context context){
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

            convertView=LayoutInflater.from(mContext).inflate(R.layout.ys_cell_order,null);
            vh=new ViewHolder();
            vh.time= (TextView) convertView.findViewById(R.id.time);
            vh.num= (TextView) convertView.findViewById(R.id.num);
            vh.type= (TextView) convertView.findViewById(R.id.type);
            vh.price= (TextView) convertView.findViewById(R.id.price);
            vh.is_pay= (TextView) convertView.findViewById(R.id.is_pay);
            vh.detail= (TextView) convertView.findViewById(R.id.detail);
            vh.detail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(mContext, YSOrderDetailActivity.class);
                    intent.putExtra("orderid","1");
                    mContext.startActivity(intent);
                }
            });
            convertView.setTag(vh);
        }else{
            vh= (ViewHolder) convertView.getTag();
        }



        return convertView;
    }

    class ViewHolder{
        TextView time,num,type,price,is_pay,detail;
        public ViewHolder(){

        }
    }
}

package com.siokagami.android.goodrecyclerview_simple;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by yilun.xin on 2016/5/31.
 */
public class GSAdapter extends RecyclerView.Adapter<GSAdapter.ViewHolder>
{
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {







        public ViewHolder(View itemView) {
            super(itemView);


        }

    }
}

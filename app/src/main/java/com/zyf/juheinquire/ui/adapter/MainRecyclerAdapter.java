package com.zyf.juheinquire.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zyf.juheinquire.R;
import com.zyf.juheinquire.mvp.model.ExpCompanyInfo;
import com.zyf.juheinquire.ui.activity.ExpQueryActivity;

import java.util.List;

/**
 * Created by zyf on 16/5/20.
 */
public class MainRecyclerAdapter extends RecyclerView.Adapter<MainRecyclerAdapter.MainRecyclerViewHolder> implements View.OnClickListener {


    private Context context;
    private List<ExpCompanyInfo.ResultBean> resultBeens;

    public MainRecyclerAdapter(Context context, List<ExpCompanyInfo.ResultBean> resultBeens) {
        this.context = context;
        this.resultBeens = resultBeens;
    }


    @Override
    public MainRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.item_expfragment_company, null);
        MainRecyclerViewHolder holder = new MainRecyclerViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MainRecyclerViewHolder holder, int position) {
        holder.mTvName.setText(resultBeens.get(position).getCom());
        holder.mTvName.setTag(resultBeens.get(position).getNo());
        holder.mTvName.setOnClickListener(this);
    }


    @Override
    public int getItemCount() {
        return resultBeens.size();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(context, ExpQueryActivity.class);
        intent.putExtra("no", (String) v.getTag());
        context.startActivity(intent);
    }


    class MainRecyclerViewHolder extends RecyclerView.ViewHolder {

        public TextView mTvName;

        public MainRecyclerViewHolder(View itemView) {
            super(itemView);
            mTvName = (TextView) itemView.findViewById(R.id.tv_company);

        }
    }
}

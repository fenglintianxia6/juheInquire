package com.zyf.juheinquire.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.zyf.juheinquire.R;
import com.zyf.juheinquire.mvp.QueryData;
import com.zyf.juheinquire.mvp.model.ExpCompanyInfo;
import com.zyf.juheinquire.mvp.presenter.QueryCompanyPrensenter;
import com.zyf.juheinquire.ui.adapter.MainRecyclerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by zyf on 16/5/19.
 */
public class ExpFragment extends BaseFragment implements QueryData.View<ExpCompanyInfo> {


    @BindView(R.id.ll_loading)
    LinearLayout mLoadingLayout;
    @BindView(R.id.mCompanyRecycler)
    RecyclerView mCompanyRecycler;

    private QueryData.Presenter presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayout(), null);
        ButterKnife.bind(this, view);
        setPresenter(new QueryCompanyPrensenter(getActivity()));
        presenter.getData(this);
        return view;

    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_exp;
    }

    @Override
    public void onStartLoding() {
        mLoadingLayout.setVisibility(View.VISIBLE);
    }

    @Override
    public void onLodingFinish(ExpCompanyInfo expCompanyInfo) {
        mLoadingLayout.setVisibility(View.GONE);
        mCompanyRecycler.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        mCompanyRecycler.setAdapter(new MainRecyclerAdapter(getActivity(), expCompanyInfo.getResult()));
    }

    @Override
    public void onLogingFailed() {

    }


    @Override
    public void setPresenter(QueryData.Presenter presenter) {
        this.presenter = presenter;
    }
}

package com.zyf.juheinquire.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zyf.juheinquire.R;
import com.zyf.juheinquire.mvp.QueryExpCompany;
import com.zyf.juheinquire.mvp.presenter.QueryCompanyPrensenter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by zyf on 16/5/19.
 */
public class ExpFragment extends BaseFragment implements QueryExpCompany.View {

    private View view;

    @BindView(R.id.tv)
    TextView tv;

    private QueryExpCompany.Presenter presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(getLayout(), null);
        ButterKnife.bind(this, view);
        setPresenter(new QueryCompanyPrensenter(getActivity()));
        return view;

    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_exp;
    }

    @Override
    public void onStartLoding() {

    }

    @Override
    public void onLodingFinish() {

    }

    @Override
    public void onLogingFailed() {

    }


    @Override
    public void setPresenter(QueryExpCompany.Presenter presenter) {
        this.presenter = presenter;
    }
}

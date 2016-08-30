package com.zyf.juheinquire.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.zyf.juheinquire.R;
import com.zyf.juheinquire.mvp.QueryData;
import com.zyf.juheinquire.mvp.presenter.QueryExpStatePresenter;

import java.util.List;

import butterknife.ButterKnife;

/**
 * Created by zyf on 16/5/20.
 */
public class ExpQueryActivity extends Activity implements QueryData.View<List> {


    private QueryData.Presenter<String> presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query_exp);
        ButterKnife.bind(this);
        setPresenter(new QueryExpStatePresenter(this, getIntent().getStringExtra("no")));
    }

    public void getExpInfo(View view) {
        presenter.getData(this);
    }

    @Override
    public void onStartLoding() {

    }

    @Override
    public void onLodingFinish(List list) {

    }


    @Override
    public void onLogingFailed() {

    }


    @Override
    public void setPresenter(QueryData.Presenter presenter) {
        this.presenter = presenter;
    }
}

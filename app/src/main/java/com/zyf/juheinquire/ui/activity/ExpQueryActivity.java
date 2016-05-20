package com.zyf.juheinquire.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
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
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
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

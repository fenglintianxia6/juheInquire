package com.zyf.juheinquire.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zyf.juheinquire.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by zyf on 16/5/19.
 */
public class ExpFragment extends BaseFragment {

    private View view;
    private static String text;

    @BindView(R.id.tv)
    TextView tv;

    public static ExpFragment newInstance(String s) {
        text = s;
        ExpFragment fragment = new ExpFragment();
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(getLayout(), null);
        ButterKnife.bind(this, view);
        tv.setText(text);
        return view;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_exp;
    }
}

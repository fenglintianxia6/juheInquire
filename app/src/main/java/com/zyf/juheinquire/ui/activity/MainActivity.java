package com.zyf.juheinquire.ui.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListView;

import com.zyf.juheinquire.R;
import com.zyf.juheinquire.ui.adapter.MainMenuAdapter;
import com.zyf.juheinquire.ui.fragments.BaseFragment;
import com.zyf.juheinquire.ui.fragments.ExpFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.drawerLayout)
    DrawerLayout mDrawerMenu;

    @BindView(R.id.drawer_menu_list)
    ListView mMenuList;

    @BindView(R.id.frameLayout)
    FrameLayout frameLayout;


    private List<BaseFragment> fragmentList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setData();
    }

    private void setData() {
        fragmentList = new ArrayList<>();
        mDrawerMenu.setDrawerShadow(null, Gravity.LEFT);
        mMenuList.setAdapter(new MainMenuAdapter(this));
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frameLayout, new ExpFragment()).commit();
    }


    public void transFragment(int position) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.setCustomAnimations(R.anim.fragment_fade_in, R.anim.fragment_fade_out);
        for (int i = 0; i < fragmentList.size(); i++) {
            if (position == i) {
                ft.show(fragmentList.get(i));
            } else {
                ft.hide(fragmentList.get(i));
            }
        }
        ft.commit();
    }


    public void toggle(View view) {
        if (mDrawerMenu.isDrawerOpen(Gravity.LEFT)) {
            mDrawerMenu.closeDrawer(Gravity.LEFT);
        } else {
            mDrawerMenu.openDrawer(Gravity.LEFT);
        }

    }
}

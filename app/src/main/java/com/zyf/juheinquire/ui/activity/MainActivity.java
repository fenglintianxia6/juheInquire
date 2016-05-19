package com.zyf.juheinquire.ui.activity;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ListView;

import com.zyf.juheinquire.R;
import com.zyf.juheinquire.ui.adapter.MainMenuAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.drawerLayout)
    DrawerLayout mDrawerMenu;

    @BindView(R.id.drawer_menu_list)
    ListView mMenuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setData();
    }

    private void setData() {
        mDrawerMenu.setDrawerShadow(null, Gravity.LEFT);
        mMenuList.setAdapter(new MainMenuAdapter(this));
    }


    public void toggle(View view) {
        if (mDrawerMenu.isDrawerOpen(Gravity.LEFT)) {
            mDrawerMenu.closeDrawer(Gravity.LEFT);
        } else {
            mDrawerMenu.openDrawer(Gravity.LEFT);
        }
    }
}

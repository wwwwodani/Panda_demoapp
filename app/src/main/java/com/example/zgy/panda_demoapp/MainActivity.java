package com.example.zgy.panda_demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.zgy.panda_demoapp.base.BaseActivity;
import com.example.zgy.panda_demoapp.base.BaseFragment;
import com.example.zgy.panda_demoapp.fragment.ShouyeFragment;
import com.example.zgy.panda_demoapp.fragment.ZhiboFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    private List<String> mList;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void init() {
        mList = new ArrayList<>();
        onCreateView(ShouyeFragment.class);
    }

    @Override
    public void loadData() {

    }

}

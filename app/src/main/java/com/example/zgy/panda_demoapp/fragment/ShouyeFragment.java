package com.example.zgy.panda_demoapp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.zgy.panda_demoapp.R;
import com.example.zgy.panda_demoapp.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShouyeFragment extends BaseFragment {

    private TextView shouyi_tv;

    @Override
    protected void loadData() {


    }

    @Override
    protected void init(View view) {
        initView(view);

    }

    private void initView(View view) {
        shouyi_tv = view.findViewById(R.id.shouyi_tv);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_shouye;
    }

}

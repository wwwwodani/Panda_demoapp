package com.example.zgy.panda_demoapp.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.zgy.panda_demoapp.R;

/**
 * Created by ZGY on 2018/3/17.
 */

public abstract class BaseActivity extends AppCompatActivity {
    private BaseFragment lastFragment;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(getLayoutId());
        init();
        loadData();
    }

    public abstract int getLayoutId();

    public abstract void init();

    public abstract void loadData();

    public void onCreateView(Class<? extends BaseFragment> classFragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        String tag = classFragment.getSimpleName();

        BaseFragment fragment = (BaseFragment) fragmentManager.findFragmentByTag(tag);
        try {
            if (fragment == null) {
                fragment = classFragment.newInstance();
                transaction.add(R.id.main_layout, fragment, tag);
            }
            if (lastFragment != null) {
                transaction.hide(lastFragment);
            }

            transaction.show(fragment);

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        lastFragment = fragment;
        transaction.commit();
    }
}

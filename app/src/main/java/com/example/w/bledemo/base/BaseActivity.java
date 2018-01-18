package com.example.w.bledemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.trello.rxlifecycle.components.support.RxAppCompatActivity;

/**
 * BaseActivity
 *
 * @author W
 * @date 2018/1/12 10:35
 */


public abstract class BaseActivity extends RxAppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }



    public abstract int getLayoutId();

    public abstract void initView();

    public abstract void loadData();

}

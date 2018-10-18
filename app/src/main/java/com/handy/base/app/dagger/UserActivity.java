package com.handy.base.app.dagger;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.handy.base.app.BaseActivity;
import com.handy.base.app.R;

/**
 * 中文名称
 *
 * @author LiuJie https://github.com/Handy045
 * @description 功能描述
 * @date Created in 2018/2/2 上午1:35
 * @modified By LiuJie
 */
public class UserActivity extends BaseActivity<UserContract.userPresenter> implements UserContract.userView {

    UserObject userObject = new UserObject();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerUserComponent.builder().userModule(new UserModule(this)).build().inject(this);
    }

    @Override
    public String getViewTag() {
        return getClass().getSimpleName();
    }

    @Override
    public BaseActivity getBaseActivity() {
        return this;
    }
}

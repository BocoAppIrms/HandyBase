package com.handy.base.app.dagger;

import android.support.annotation.NonNull;

import com.blankj.utilcode.util.LogUtils;
import com.handy.base.mvp.BasePresenter;

import javax.inject.Inject;

/**
 * 中文名称
 *
 * @author LiuJie https://github.com/Handy045
 * @description 功能描述
 * @date Created in 2018/2/2 上午1:37
 * @modified By LiuJie
 */
public class UserPresenter extends BasePresenter<UserContract.userView> implements UserContract.userPresenter {

    UserContract.userModel model;

    @Inject
    public UserPresenter(@NonNull UserContract.userModel userModel, @NonNull UserContract.userView view) {
        super(view);
        addIModel(this.model = userModel);
        LogUtils.d("UserPresenter is Created");
    }
}

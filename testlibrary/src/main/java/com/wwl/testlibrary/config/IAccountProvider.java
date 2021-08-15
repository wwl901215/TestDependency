package com.wwl.testlibrary.config;

import android.app.Activity;

import com.wwl.testlibrary.TestCallback;

/**
 * 实现获取主工程中的各种用户信息
 */
public interface IAccountProvider {

    /**
     * 获取用户token
     *
     * @return access token
     */
    String getAccessToken();

    /**
     * 获取用户ID
     *
     * @return user id
     */
    String getUserId();

    /**
     * 登陆
     *
     * @param activity 当前TestDependencyActivity
     * @param callback 登陆成功失败等的回调信息
     */
    void goLogin(Activity activity, TestCallback callback);
}

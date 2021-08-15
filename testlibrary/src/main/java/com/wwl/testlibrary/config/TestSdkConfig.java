package com.wwl.testlibrary.config;

import android.content.Context;

public final class TestSdkConfig {
    private static final TestSdkConfig sdkConfig = new TestSdkConfig();
    private IAccountProvider accountProvider;

    private TestSdkConfig() {
    }

    public static TestSdkConfig getInstance() {
        return sdkConfig;
    }

    /**
     * 初始化config
     *
     * @param context 主工程Application的上下文
     */
    public void init(Context context) {

    }

    public void setAccountProvider(IAccountProvider accountProvider) {
        this.accountProvider = accountProvider;
    }

    public IAccountProvider getAccountProvider() {
        return accountProvider;
    }
}

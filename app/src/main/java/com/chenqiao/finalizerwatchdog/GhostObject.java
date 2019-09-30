package com.chenqiao.finalizerwatchdog;

import android.util.Log;

/**
 * Created by chenqiao on 2019-09-30.
 * e-mail : mrjctech@gmail.com
 */
public class GhostObject {

    @Override
    protected void finalize() throws Throwable {
        Log.d("ghost", "=============fire finalize============="+Thread.currentThread().getName());
        super.finalize();
        Thread.sleep(80000);//每个手机触发 Timeout 的时长不同，比如 模拟器统一都是10秒钟，在模拟器上效果明显
    }
}

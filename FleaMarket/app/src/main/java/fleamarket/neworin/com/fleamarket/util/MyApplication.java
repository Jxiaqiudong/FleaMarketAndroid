package fleamarket.neworin.com.fleamarket.util;

import android.app.Application;

import cn.bmob.v3.Bmob;

/**
 * Created by NewOr on 2016/2/27.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Bmob.initialize(this, Constant.APPLICATION_ID);
    }
}
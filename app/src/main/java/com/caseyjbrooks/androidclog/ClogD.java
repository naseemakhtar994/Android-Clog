package com.caseyjbrooks.androidclog;

import android.util.Log;

import com.caseyjbrooks.clog.ClogLogger;

public class ClogD implements ClogLogger {

    @Override
    public boolean isActive() {
        return true;
    }

    @Override
    public int log(String tag, String message) {
        return Log.d(tag, message);
    }

    @Override
    public int log(String tag, String message, Throwable throwable) {
        return Log.d(tag, message, throwable);
    }

    @Override
    public int priority() {
        return 2;
    }
}

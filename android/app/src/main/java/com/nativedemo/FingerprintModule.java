package com.nativedemo;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import android.util.Log;


public class FingerprintModule extends ReactContextBaseJavaModule {
    public FingerprintModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "FingerprintModule";
    }

    @ReactMethod    
    public void createFingerprintEvent(String a, Callback cb) {
        String response = a + "test";
        cb.invoke(response);
    }
}

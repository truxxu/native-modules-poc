package com.nativedemo;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;

import fingerprint.plusti.com.fingerprintsoftoken.Handler.FingerprintCreate;


public class FingerprintModule extends ReactContextBaseJavaModule {
    private FingerprintCreate fpdCreate;
    private ReactApplicationContext reactContext;

    public FingerprintModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
        fpdCreate = new FingerprintCreate();
    }

    @Override
    public String getName() {
        return "FingerprintModule";
    }

    @ReactMethod    
    public void createFingerprintEvent(Promise promise) {
        try {
            String fingerprint = fpdCreate.generateFingerpintKey(reactContext).toString();
            promise.resolve(fingerprint);
        } catch (Exception e) {
            promise.reject(e);
        }
    }
}

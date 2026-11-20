package com.appsflyer.internal;

import java.util.HashMap;

/* loaded from: classes.dex */
public class AFa1nSDK extends HashMap<Integer, String> {

    /* renamed from: d, reason: collision with root package name */
    private static AFa1nSDK f5260d;
    private final Object AFKeystoreWrapper = new Object();

    private AFa1nSDK() {
    }

    public static synchronized AFa1nSDK afErrorLog() {
        AFa1nSDK aFa1nSDK;
        synchronized (AFa1nSDK.class) {
            try {
                if (f5260d == null) {
                    f5260d = new AFa1nSDK();
                }
                aFa1nSDK = f5260d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aFa1nSDK;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public String put(Integer num, String str) {
        String str2;
        synchronized (this.AFKeystoreWrapper) {
            str2 = (String) super.put((AFa1nSDK) num, (Integer) str);
        }
        return str2;
    }

    @Override // java.util.HashMap, java.util.Map
    public boolean remove(Object obj, Object obj2) {
        boolean remove;
        synchronized (this.AFKeystoreWrapper) {
            remove = super.remove(obj, obj2);
        }
        return remove;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public String remove(Object obj) {
        String str;
        synchronized (this.AFKeystoreWrapper) {
            str = (String) super.remove(obj);
        }
        return str;
    }
}

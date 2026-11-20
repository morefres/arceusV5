package com.roblox.universalapp.cookie;

/* loaded from: classes2.dex */
public class JNICookieProtocol {

    public interface OnSetCookieHandler {
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final JNICookieProtocol f9841a = new JNICookieProtocol();
    }

    public static JNICookieProtocol a() {
        return a.f9841a;
    }

    public native void updateOnSetCookieHandler(OnSetCookieHandler onSetCookieHandler);
}

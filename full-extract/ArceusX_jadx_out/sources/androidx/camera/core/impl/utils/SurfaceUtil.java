package androidx.camera.core.impl.utils;

import android.view.Surface;

/* loaded from: classes.dex */
public class SurfaceUtil {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f1234a = 0;
        public int b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f1235c = 0;
    }

    static {
        System.loadLibrary("surface_util_jni");
    }

    public static a a(Surface surface) {
        int[] nativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        a aVar = new a();
        aVar.f1234a = nativeGetSurfaceInfo[0];
        aVar.b = nativeGetSurfaceInfo[1];
        aVar.f1235c = nativeGetSurfaceInfo[2];
        return aVar;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}

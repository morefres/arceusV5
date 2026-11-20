package u2;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static long f32597a;
    public static Method b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f32598c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f32599d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f32600e;

    public static class a {
        public static boolean a() {
            return Trace.isEnabled();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f32597a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f32598c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f32599d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f32600e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }

    public static boolean c() {
        if (Build.VERSION.SDK_INT >= 29) {
            return a.a();
        }
        try {
            return ((Boolean) b.invoke(null, Long.valueOf(f32597a))).booleanValue();
        } catch (Exception unused) {
            Log.v("TraceCompat", "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }
}

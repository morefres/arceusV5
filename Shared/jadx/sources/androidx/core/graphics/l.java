package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import n2.e;

/* loaded from: classes.dex */
public class l extends q {
    public static Class<?> b;

    /* renamed from: c, reason: collision with root package name */
    public static Constructor<?> f1636c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f1637d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f1638e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f1639f;

    public static boolean h(Object obj, String str, int i10, boolean z10) {
        j();
        try {
            return ((Boolean) f1637d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Typeface i(Object obj) {
        j();
        try {
            Object newInstance = Array.newInstance(b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f1638e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void j() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f1639f) {
            return;
        }
        f1639f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f1636c = constructor;
        b = cls;
        f1637d = method2;
        f1638e = method;
    }

    private static Object k() {
        j();
        try {
            return f1636c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // androidx.core.graphics.q
    public Typeface a(Context context, e.c cVar, Resources resources, int i10) {
        Object k10 = k();
        for (e.d dVar : cVar.a()) {
            File d10 = r.d(context);
            if (d10 == null) {
                return null;
            }
            try {
                if (!r.b(d10, resources, dVar.b())) {
                    return null;
                }
                if (!h(k10, d10.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
                d10.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                d10.delete();
            }
        }
        return i(k10);
    }
}

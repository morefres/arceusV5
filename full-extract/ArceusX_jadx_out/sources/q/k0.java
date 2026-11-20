package q;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f29328a = {R.attr.state_checked};
    public static final int[] b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f29329c = new Rect();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final boolean f29330a;
        public static final Method b;

        /* renamed from: c, reason: collision with root package name */
        public static final Field f29331c;

        /* renamed from: d, reason: collision with root package name */
        public static final Field f29332d;

        /* renamed from: e, reason: collision with root package name */
        public static final Field f29333e;

        /* renamed from: f, reason: collision with root package name */
        public static final Field f29334f;

        /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L40 java.lang.NoSuchMethodException -> L43
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.reflect.Method r4 = r4.getMethod(r5, r1)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L40 java.lang.NoSuchMethodException -> L43
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L34 java.lang.ClassNotFoundException -> L37 java.lang.NoSuchMethodException -> L3a
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L2d java.lang.ClassNotFoundException -> L30 java.lang.NoSuchMethodException -> L32
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L46
                r8 = r0
                goto L48
            L2b:
                r7 = r1
                goto L46
            L2d:
                r6 = r1
            L2e:
                r7 = r6
                goto L46
            L30:
                r6 = r1
                goto L2e
            L32:
                r6 = r1
                goto L2e
            L34:
                r5 = r1
            L35:
                r6 = r5
                goto L2e
            L37:
                r5 = r1
            L38:
                r6 = r5
                goto L2e
            L3a:
                r5 = r1
            L3b:
                r6 = r5
                goto L2e
            L3d:
                r4 = r1
                r5 = r4
                goto L35
            L40:
                r4 = r1
                r5 = r4
                goto L38
            L43:
                r4 = r1
                r5 = r4
                goto L3b
            L46:
                r3 = r1
                r8 = r2
            L48:
                if (r8 == 0) goto L57
                q.k0.a.b = r4
                q.k0.a.f29331c = r5
                q.k0.a.f29332d = r6
                q.k0.a.f29333e = r7
                q.k0.a.f29334f = r3
                q.k0.a.f29330a = r0
                goto L63
            L57:
                q.k0.a.b = r1
                q.k0.a.f29331c = r1
                q.k0.a.f29332d = r1
                q.k0.a.f29333e = r1
                q.k0.a.f29334f = r1
                q.k0.a.f29330a = r2
            L63:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q.k0.a.<clinit>():void");
        }

        @NonNull
        public static Rect a(@NonNull Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f29330a) {
                try {
                    Object invoke = b.invoke(drawable, null);
                    if (invoke != null) {
                        return new Rect(f29331c.getInt(invoke), f29332d.getInt(invoke), f29333e.getInt(invoke), f29334f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return k0.f29329c;
        }
    }

    public static class b {
        public static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    @Deprecated
    public static boolean a(@NonNull Drawable drawable) {
        return true;
    }

    public static void b(@NonNull Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || i10 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        c(drawable);
    }

    public static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f29328a);
        } else {
            drawable.setState(b);
        }
        drawable.setState(state);
    }

    @NonNull
    public static Rect d(@NonNull Drawable drawable) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (Build.VERSION.SDK_INT < 29) {
            return a.a(q2.a.q(drawable));
        }
        Insets a10 = b.a(drawable);
        i10 = a10.left;
        i11 = a10.top;
        i12 = a10.right;
        i13 = a10.bottom;
        return new Rect(i10, i11, i12, i13);
    }

    public static PorterDuff.Mode e(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}

package o5;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f27649a;
    public static final Property<View, Float> b;

    /* renamed from: c, reason: collision with root package name */
    public static final Property<View, Rect> f27650c;

    public class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(i0.b(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            i0.e(view, f10.floatValue());
        }
    }

    public class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f27649a = new n0();
        } else {
            f27649a = new m0();
        }
        b = new a(Float.class, "translationAlpha");
        f27650c = new b(Rect.class, "clipBounds");
    }

    public static void a(@NonNull View view) {
        f27649a.a(view);
    }

    public static float b(@NonNull View view) {
        return f27649a.b(view);
    }

    public static void c(@NonNull View view) {
        f27649a.c(view);
    }

    public static void d(@NonNull View view, int i10, int i11, int i12, int i13) {
        f27649a.d(view, i10, i11, i12, i13);
    }

    public static void e(@NonNull View view, float f10) {
        f27649a.e(view, f10);
    }

    public static void f(@NonNull View view, int i10) {
        f27649a.f(view, i10);
    }

    public static void g(@NonNull View view, @NonNull Matrix matrix) {
        f27649a.g(view, matrix);
    }

    public static void h(@NonNull View view, @NonNull Matrix matrix) {
        f27649a.h(view, matrix);
    }
}

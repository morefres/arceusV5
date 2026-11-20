package com.google.android.material.carousel;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.material.carousel.b;
import ic.d;
import qc.f;

/* loaded from: classes2.dex */
public final class a {
    public static float a(float f10, float f11, int i10) {
        return f10 + (Math.max(0, i10 - 1) * f11);
    }

    public static float b(float f10, float f11, int i10) {
        return i10 > 0 ? f10 + (f11 / 2.0f) : f10;
    }

    public static b c(@NonNull Context context, float f10, float f11, @NonNull qc.a aVar) {
        float f12;
        float f13;
        float min = Math.min(f(context) + f10, aVar.f29627f);
        float f14 = min / 2.0f;
        float f15 = 0.0f - f14;
        float b = b(0.0f, aVar.b, aVar.f29624c);
        float j10 = j(0.0f, a(b, aVar.b, (int) Math.floor(aVar.f29624c / 2.0f)), aVar.b, aVar.f29624c);
        float b10 = b(j10, aVar.f29626e, aVar.f29625d);
        float j11 = j(j10, a(b10, aVar.f29626e, (int) Math.floor(aVar.f29625d / 2.0f)), aVar.f29626e, aVar.f29625d);
        float b11 = b(j11, aVar.f29627f, aVar.f29628g);
        float j12 = j(j11, a(b11, aVar.f29627f, aVar.f29628g), aVar.f29627f, aVar.f29628g);
        float b12 = b(j12, aVar.f29626e, aVar.f29625d);
        float b13 = b(j(j12, a(b12, aVar.f29626e, (int) Math.ceil(aVar.f29625d / 2.0f)), aVar.f29626e, aVar.f29625d), aVar.b, aVar.f29624c);
        float f16 = f14 + f11;
        float b14 = f.b(min, aVar.f29627f, f10);
        float b15 = f.b(aVar.b, aVar.f29627f, f10);
        float b16 = f.b(aVar.f29626e, aVar.f29627f, f10);
        b.C0124b a10 = new b.C0124b(aVar.f29627f, f11).a(f15, b14, min);
        if (aVar.f29624c > 0) {
            f12 = 2.0f;
            f13 = f16;
            a10.g(b, b15, aVar.b, (int) Math.floor(r7 / 2.0f));
        } else {
            f12 = 2.0f;
            f13 = f16;
        }
        if (aVar.f29625d > 0) {
            a10.g(b10, b16, aVar.f29626e, (int) Math.floor(r4 / f12));
        }
        a10.h(b11, 0.0f, aVar.f29627f, aVar.f29628g, true);
        if (aVar.f29625d > 0) {
            a10.g(b12, b16, aVar.f29626e, (int) Math.ceil(r4 / f12));
        }
        if (aVar.f29624c > 0) {
            a10.g(b13, b15, aVar.b, (int) Math.ceil(r0 / f12));
        }
        a10.a(f13, b14, min);
        return a10.i();
    }

    public static b d(@NonNull Context context, float f10, float f11, @NonNull qc.a aVar, int i10) {
        return i10 == 1 ? c(context, f10, f11, aVar) : e(context, f10, f11, aVar);
    }

    public static b e(@NonNull Context context, float f10, float f11, @NonNull qc.a aVar) {
        float min = Math.min(f(context) + f10, aVar.f29627f);
        float f12 = min / 2.0f;
        float f13 = 0.0f - f12;
        float b = b(0.0f, aVar.f29627f, aVar.f29628g);
        float j10 = j(0.0f, a(b, aVar.f29627f, aVar.f29628g), aVar.f29627f, aVar.f29628g);
        float b10 = b(j10, aVar.f29626e, aVar.f29625d);
        float b11 = b(j(j10, b10, aVar.f29626e, aVar.f29625d), aVar.b, aVar.f29624c);
        float f14 = f12 + f11;
        float b12 = f.b(min, aVar.f29627f, f10);
        float b13 = f.b(aVar.b, aVar.f29627f, f10);
        float b14 = f.b(aVar.f29626e, aVar.f29627f, f10);
        b.C0124b h10 = new b.C0124b(aVar.f29627f, f11).a(f13, b12, min).h(b, 0.0f, aVar.f29627f, aVar.f29628g, true);
        if (aVar.f29625d > 0) {
            h10.b(b10, b14, aVar.f29626e);
        }
        int i10 = aVar.f29624c;
        if (i10 > 0) {
            h10.g(b11, b13, aVar.b, i10);
        }
        h10.a(f14, b12, min);
        return h10.i();
    }

    public static float f(@NonNull Context context) {
        return context.getResources().getDimension(d.f20454o);
    }

    public static float g(@NonNull Context context) {
        return context.getResources().getDimension(d.f20455p);
    }

    public static float h(@NonNull Context context) {
        return context.getResources().getDimension(d.f20456q);
    }

    public static int i(int[] iArr) {
        int i10 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        for (int i11 : iArr) {
            if (i11 > i10) {
                i10 = i11;
            }
        }
        return i10;
    }

    public static float j(float f10, float f11, float f12, int i10) {
        return i10 > 0 ? f11 + (f12 / 2.0f) : f10;
    }
}

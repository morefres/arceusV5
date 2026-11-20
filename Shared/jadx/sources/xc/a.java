package xc;

import android.content.Context;
import android.graphics.Color;
import androidx.annotation.NonNull;
import androidx.core.graphics.c;
import ed.b;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f35494f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f35495a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35496c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35497d;

    /* renamed from: e, reason: collision with root package name */
    public final float f35498e;

    public a(@NonNull Context context) {
        this(b.b(context, ic.b.f20412s, false), uc.a.b(context, ic.b.f20411r, 0), uc.a.b(context, ic.b.f20410q, 0), uc.a.b(context, ic.b.f20408o, 0), context.getResources().getDisplayMetrics().density);
    }

    public float a(float f10) {
        if (this.f35498e <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i10, float f10) {
        int i11;
        float a10 = a(f10);
        int alpha = Color.alpha(i10);
        int j10 = uc.a.j(c.l(i10, 255), this.b, a10);
        if (a10 > 0.0f && (i11 = this.f35496c) != 0) {
            j10 = uc.a.i(j10, c.l(i11, f35494f));
        }
        return c.l(j10, alpha);
    }

    public int c(int i10, float f10) {
        return (this.f35495a && e(i10)) ? b(i10, f10) : i10;
    }

    public boolean d() {
        return this.f35495a;
    }

    public final boolean e(int i10) {
        return c.l(i10, 255) == this.f35497d;
    }

    public a(boolean z10, int i10, int i11, int i12, float f10) {
        this.f35495a = z10;
        this.b = i10;
        this.f35496c = i11;
        this.f35497d = i12;
        this.f35498e = f10;
    }
}

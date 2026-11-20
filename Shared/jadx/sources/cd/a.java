package cd;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.mlkit.common.MlKitException;
import e.BackEventCompat;

/* loaded from: classes2.dex */
public abstract class a<V extends View> {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f4823a;

    @NonNull
    public final V b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4824c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4825d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4826e;

    /* renamed from: f, reason: collision with root package name */
    public BackEventCompat f4827f;

    public a(@NonNull V v5) {
        this.b = v5;
        Context context = v5.getContext();
        this.f4823a = h.g(context, ic.b.R, z2.a.a(0.0f, 0.0f, 0.0f, 1.0f));
        this.f4824c = h.f(context, ic.b.H, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE);
        this.f4825d = h.f(context, ic.b.L, 150);
        this.f4826e = h.f(context, ic.b.K, 100);
    }

    public float a(float f10) {
        return this.f4823a.getInterpolation(f10);
    }

    public BackEventCompat b() {
        if (this.f4827f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        BackEventCompat backEventCompat = this.f4827f;
        this.f4827f = null;
        return backEventCompat;
    }

    public BackEventCompat c() {
        BackEventCompat backEventCompat = this.f4827f;
        this.f4827f = null;
        return backEventCompat;
    }

    public void d(@NonNull BackEventCompat backEventCompat) {
        this.f4827f = backEventCompat;
    }

    public BackEventCompat e(@NonNull BackEventCompat backEventCompat) {
        if (this.f4827f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        BackEventCompat backEventCompat2 = this.f4827f;
        this.f4827f = backEventCompat;
        return backEventCompat2;
    }
}

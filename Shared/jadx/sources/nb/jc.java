package nb;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
public final class jc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nc f26344a;

    public jc(nc ncVar) {
        Objects.requireNonNull(ncVar);
        this.f26344a = ncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.f26344a.f26504c;
        g7 g7Var = tcVar.f26328a;
        Context d10 = g7Var.d();
        g7Var.c();
        tcVar.K(new ComponentName(d10, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}

package nb;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* loaded from: classes.dex */
public final class hc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.x1 f26287a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public hc(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.x1 x1Var) {
        this.f26287a = x1Var;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.b;
        appMeasurementDynamiteService.f7454a.C().e0(this.f26287a, appMeasurementDynamiteService.f7454a.f());
    }
}

package nb;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* loaded from: classes.dex */
public final class fa implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fe f26220a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public fa(AppMeasurementDynamiteService appMeasurementDynamiteService, fe feVar) {
        this.f26220a = feVar;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f7454a.B().I(this.f26220a);
    }
}

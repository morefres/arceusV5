package nb;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzbg;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.x1 f26187a;
    public final /* synthetic */ zzbg b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26188c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f26189d;

    public e8(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.x1 x1Var, zzbg zzbgVar, String str) {
        this.f26187a = x1Var;
        this.b = zzbgVar;
        this.f26188c = str;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f26189d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26189d.f7454a.J().B(this.f26187a, this.b, this.f26188c);
    }
}

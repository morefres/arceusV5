package nb;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.x1 f26216a;
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26217c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f26218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f26219e;

    public f9(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.x1 x1Var, String str, String str2, boolean z10) {
        this.f26216a = x1Var;
        this.b = str;
        this.f26217c = str2;
        this.f26218d = z10;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f26219e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26219e.f7454a.J().h0(this.f26216a, this.b, this.f26217c, this.f26218d);
    }
}

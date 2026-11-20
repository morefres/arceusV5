package nb;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzpl;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f26523a;
    public final /* synthetic */ qa b;

    public o9(qa qaVar, Bundle bundle) {
        this.f26523a = bundle;
        Objects.requireNonNull(qaVar);
        this.b = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qa qaVar = this.b;
        qaVar.h();
        qaVar.j();
        Bundle bundle = this.f26523a;
        n9.m.l(bundle);
        String f10 = n9.m.f(bundle.getString("name"));
        if (!qaVar.f26328a.g()) {
            qaVar.f26328a.a().w().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            qaVar.f26328a.J().d0(new zzah(bundle.getString("app_id"), "", new zzpl(f10, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), qaVar.f26328a.C().R(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}

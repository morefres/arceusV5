package nb;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.t0 f26427a;
    public final /* synthetic */ ServiceConnection b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m6 f26428c;

    public l6(m6 m6Var, com.google.android.gms.internal.measurement.t0 t0Var, ServiceConnection serviceConnection) {
        this.f26427a = t0Var;
        this.b = serviceConnection;
        Objects.requireNonNull(m6Var);
        this.f26428c = m6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        m6 m6Var = this.f26428c;
        n6 n6Var = m6Var.b;
        g7 g7Var = n6Var.f26489a;
        g7Var.b().h();
        Bundle bundle2 = new Bundle();
        String a10 = m6Var.a();
        bundle2.putString("package_name", a10);
        try {
            bundle = this.f26427a.j(bundle2);
        } catch (Exception e10) {
            n6Var.f26489a.a().o().b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
        }
        if (bundle == null) {
            g7Var.a().o().a("Install Referrer Service returned a null response");
            bundle = null;
        }
        g7 g7Var2 = n6Var.f26489a;
        g7Var2.b().h();
        g7.q();
        if (bundle != null) {
            long j10 = bundle.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                g7Var2.a().r().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    g7Var2.a().o().a("No referrer defined in Install Referrer response");
                } else {
                    g7Var2.a().w().b("InstallReferrer API result", string);
                    Bundle s02 = g7Var2.C().s0(Uri.parse("?".concat(string)));
                    if (s02 == null) {
                        g7Var2.a().o().a("No campaign params defined in Install Referrer result");
                    } else {
                        List asList = Arrays.asList(((String) z4.f26874h1.b(null)).split(","));
                        Iterator<String> it = s02.keySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (asList.contains(it.next())) {
                                long j11 = bundle.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                                if (j11 > 0) {
                                    s02.putLong("click_timestamp", j11);
                                }
                            }
                        }
                        if (j10 == g7Var2.x().f26375g.a()) {
                            g7Var2.a().w().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (g7Var2.g()) {
                            g7Var2.x().f26375g.b(j10);
                            g7Var2.a().w().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            s02.putString("_cis", "referrer API v2");
                            g7Var2.B().w("auto", "_cmp", s02, a10);
                        }
                    }
                }
            }
        }
        t9.a.b().c(g7Var2.d(), this.b);
    }
}

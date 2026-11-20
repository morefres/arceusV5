package nb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.vf;
import java.util.Objects;

/* loaded from: classes.dex */
public final class bf extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final g7 f26079a;

    public bf(g7 g7Var) {
        this.f26079a = g7Var;
    }

    public final /* synthetic */ void a() {
        this.f26079a.N().o(((Long) z4.D.b(null)).longValue());
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.f26079a.a().r().a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f26079a.a().r().a("App receiver called with null action");
            return;
        }
        int hashCode = action.hashCode();
        if (hashCode != -1928239649) {
            if (hashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                g7 g7Var = this.f26079a;
                g7Var.a().w().a("[sgtm] App Receiver notified batches are available");
                g7Var.b().t(new Runnable() { // from class: nb.ye
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        bf.this.a();
                    }
                });
                return;
            }
        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            final g7 g7Var2 = this.f26079a;
            vf.a();
            if (g7Var2.w().H(null, z4.R0)) {
                g7Var2.a().w().a("App receiver notified triggers are available");
                g7Var2.b().t(new Runnable() { // from class: nb.ze
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        g7 g7Var3 = g7.this;
                        if (!g7Var3.C().G()) {
                            g7Var3.a().r().a("registerTrigger called but app not eligible");
                            return;
                        }
                        g7Var3.B().t0();
                        final qa B = g7Var3.B();
                        Objects.requireNonNull(B);
                        new Thread(new Runnable() { // from class: nb.af
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                qa.this.u0();
                            }
                        }).start();
                    }
                });
                return;
            }
            return;
        }
        this.f26079a.a().r().a("App receiver called with unknown action");
    }
}

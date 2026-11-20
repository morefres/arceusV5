package nb;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m6 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final String f26449a;
    public final /* synthetic */ n6 b;

    public m6(n6 n6Var, String str) {
        Objects.requireNonNull(n6Var);
        this.b = n6Var;
        this.f26449a = str;
    }

    public final /* synthetic */ String a() {
        return this.f26449a;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.b.f26489a.a().r().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.t0 s22 = com.google.android.gms.internal.measurement.s0.s2(iBinder);
            if (s22 == null) {
                this.b.f26489a.a().r().a("Install Referrer Service implementation was not found");
                return;
            }
            g7 g7Var = this.b.f26489a;
            g7Var.a().w().a("Install Referrer Service connected");
            g7Var.b().t(new l6(this, s22, this));
        } catch (RuntimeException e10) {
            this.b.f26489a.a().r().b("Exception occurred while calling Install Referrer API", e10);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.b.f26489a.a().w().a("Install Referrer Service disconnected");
    }
}

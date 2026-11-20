package nb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;
import n9.c;

/* loaded from: classes.dex */
public final class nc implements ServiceConnection, c.a, c.b {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f26503a;
    public volatile q5 b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tc f26504c;

    public nc(tc tcVar) {
        Objects.requireNonNull(tcVar);
        this.f26504c = tcVar;
    }

    public final void a(Intent intent) {
        tc tcVar = this.f26504c;
        tcVar.h();
        Context d10 = tcVar.f26328a.d();
        t9.a b = t9.a.b();
        synchronized (this) {
            try {
                if (this.f26503a) {
                    this.f26504c.f26328a.a().w().a("Connection attempt already in progress");
                    return;
                }
                tc tcVar2 = this.f26504c;
                tcVar2.f26328a.a().w().a("Using local app measurement service");
                this.f26503a = true;
                b.a(d10, intent, tcVar2.M(), 129);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        if (this.b != null && (this.b.isConnected() || this.b.isConnecting())) {
            this.b.disconnect();
        }
        this.b = null;
    }

    public final void c() {
        tc tcVar = this.f26504c;
        tcVar.h();
        Context d10 = tcVar.f26328a.d();
        synchronized (this) {
            try {
                if (this.f26503a) {
                    this.f26504c.f26328a.a().w().a("Connection attempt already in progress");
                    return;
                }
                if (this.b != null && (this.b.isConnecting() || this.b.isConnected())) {
                    this.f26504c.f26328a.a().w().a("Already awaiting connection attempt");
                    return;
                }
                this.b = new q5(d10, Looper.getMainLooper(), this, this);
                this.f26504c.f26328a.a().w().a("Connecting to remote service");
                this.f26503a = true;
                n9.m.l(this.b);
                this.b.checkAvailabilityAndConnect();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ void d(boolean z10) {
        this.f26503a = false;
    }

    @Override // n9.c.a
    public final void onConnected(Bundle bundle) {
        this.f26504c.f26328a.b().o();
        synchronized (this) {
            try {
                n9.m.l(this.b);
                this.f26504c.f26328a.b().t(new ic(this, (d5) this.b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.f26503a = false;
            }
        }
    }

    @Override // n9.c.b
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        tc tcVar = this.f26504c;
        tcVar.f26328a.b().o();
        w5 y10 = tcVar.f26328a.y();
        if (y10 != null) {
            y10.w().b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f26503a = false;
            this.b = null;
        }
        this.f26504c.f26328a.b().t(new mc(this, connectionResult));
    }

    @Override // n9.c.a
    public final void onConnectionSuspended(int i10) {
        g7 g7Var = this.f26504c.f26328a;
        g7Var.b().o();
        g7Var.a().v().a("Service connection suspended");
        g7Var.b().t(new jc(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f26504c.f26328a.b().o();
        synchronized (this) {
            if (iBinder == null) {
                this.f26503a = false;
                this.f26504c.f26328a.a().o().a("Service connected with null binder");
                return;
            }
            d5 d5Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    d5Var = queryLocalInterface instanceof d5 ? (d5) queryLocalInterface : new a5(iBinder);
                    this.f26504c.f26328a.a().w().a("Bound to IMeasurementService interface");
                } else {
                    this.f26504c.f26328a.a().o().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f26504c.f26328a.a().o().a("Service connect failed to get IMeasurementService");
            }
            if (d5Var == null) {
                this.f26503a = false;
                try {
                    t9.a b = t9.a.b();
                    tc tcVar = this.f26504c;
                    b.c(tcVar.f26328a.d(), tcVar.M());
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f26504c.f26328a.b().t(new fc(this, d5Var));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        g7 g7Var = this.f26504c.f26328a;
        g7Var.b().o();
        g7Var.a().v().a("Service disconnected");
        g7Var.b().t(new gc(this, componentName));
    }
}

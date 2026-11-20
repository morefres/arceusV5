package nb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class e6 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final me f26184a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26185c;

    public e6(me meVar) {
        n9.m.l(meVar);
        this.f26184a = meVar;
    }

    public final void a() {
        me meVar = this.f26184a;
        meVar.O0();
        meVar.b().h();
        if (this.b) {
            return;
        }
        meVar.d().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f26185c = meVar.E0().m();
        meVar.a().w().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f26185c));
        this.b = true;
    }

    public final void b() {
        me meVar = this.f26184a;
        meVar.O0();
        meVar.b().h();
        meVar.b().h();
        if (this.b) {
            meVar.a().w().a("Unregistering connectivity change receiver");
            this.b = false;
            this.f26185c = false;
            try {
                meVar.d().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f26184a.a().o().b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    public final /* synthetic */ me c() {
        return this.f26184a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        me meVar = this.f26184a;
        meVar.O0();
        String action = intent.getAction();
        meVar.a().w().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            meVar.a().r().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean m10 = meVar.E0().m();
        if (this.f26185c != m10) {
            this.f26185c = m10;
            meVar.b().t(new d6(this, m10));
        }
    }
}

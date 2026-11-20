package vi;

import android.R;
import android.view.View;
import e4.q;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public q f33424a;

    public a(q qVar) {
        this.f33424a = qVar;
    }

    public boolean a() {
        q qVar = this.f33424a;
        if (qVar == null) {
            return false;
        }
        return ((qVar instanceof com.roblox.client.a) && ((com.roblox.client.a) qVar).N1()) ? false : true;
    }

    public int b() {
        View findViewById = this.f33424a.findViewById(R.id.content);
        lk.b a10 = lk.b.a(findViewById.getRootView(), this.f33424a.getWindowManager(), findViewById, ((com.roblox.client.a) this.f33424a).G1().c());
        return (a10.b - a10.f23484g) - a10.f23480c;
    }
}

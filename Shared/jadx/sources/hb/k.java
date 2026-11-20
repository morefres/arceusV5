package hb;

import android.location.Location;
import l9.k;

/* loaded from: classes.dex */
public final class k implements k.b<lb.e> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Location f19190a;

    public k(l lVar, Location location) {
        this.f19190a = location;
    }

    @Override // l9.k.b
    public final /* bridge */ /* synthetic */ void a(lb.e eVar) {
        eVar.onLocationChanged(this.f19190a);
    }

    @Override // l9.k.b
    public final void b() {
    }
}

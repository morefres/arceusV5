package n9;

import android.os.Bundle;
import n9.c;

/* loaded from: classes.dex */
public final class b0 implements c.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l9.e f25936a;

    public b0(l9.e eVar) {
        this.f25936a = eVar;
    }

    @Override // n9.c.a
    public final void onConnected(Bundle bundle) {
        this.f25936a.onConnected(bundle);
    }

    @Override // n9.c.a
    public final void onConnectionSuspended(int i10) {
        this.f25936a.onConnectionSuspended(i10);
    }
}

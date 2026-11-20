package d9;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import m4.a;

/* loaded from: classes.dex */
public final class x implements a.InterfaceC0422a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SignInHubActivity f14454a;

    public /* synthetic */ x(SignInHubActivity signInHubActivity, w wVar) {
        this.f14454a = signInHubActivity;
    }

    @Override // m4.a.InterfaceC0422a
    public final /* bridge */ /* synthetic */ void a(n4.b bVar, Object obj) {
        int i10;
        Intent intent;
        SignInHubActivity signInHubActivity = this.f14454a;
        i10 = signInHubActivity.F;
        intent = signInHubActivity.G;
        signInHubActivity.setResult(i10, intent);
        this.f14454a.finish();
    }

    @Override // m4.a.InterfaceC0422a
    public final n4.b b(int i10, Bundle bundle) {
        return new f(this.f14454a, k9.f.b());
    }

    @Override // m4.a.InterfaceC0422a
    public final void c(n4.b bVar) {
    }
}

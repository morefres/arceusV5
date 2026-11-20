package n9;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z0 extends l0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f26014g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(c cVar, int i10, Bundle bundle) {
        super(cVar, i10, bundle);
        Objects.requireNonNull(cVar);
        this.f26014g = cVar;
    }

    @Override // n9.l0
    public final boolean e() {
        this.f26014g.zzc.a(ConnectionResult.f5736k);
        return true;
    }

    @Override // n9.l0
    public final void f(ConnectionResult connectionResult) {
        c cVar = this.f26014g;
        if (cVar.enableLocalFallback() && cVar.zzg()) {
            cVar.zzf(16);
        } else {
            cVar.zzc.a(connectionResult);
            cVar.onConnectionFailed(connectionResult);
        }
    }
}

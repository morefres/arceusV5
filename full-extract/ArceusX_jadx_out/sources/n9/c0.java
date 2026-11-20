package n9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import n9.c;

/* loaded from: classes.dex */
public final class c0 implements c.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l9.n f25938a;

    public c0(l9.n nVar) {
        this.f25938a = nVar;
    }

    @Override // n9.c.b
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.f25938a.onConnectionFailed(connectionResult);
    }
}

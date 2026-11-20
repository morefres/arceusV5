package n9;

import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class r0 extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectionResult f26001a;

    public r0(ConnectionResult connectionResult) {
        m.b(connectionResult.z3(), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.f26001a = connectionResult;
    }
}

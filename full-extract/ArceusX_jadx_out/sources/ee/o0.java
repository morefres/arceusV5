package ee;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class o0 extends a implements q0 {
    public o0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ee.q0
    public final void F1(Bundle bundle, s0 s0Var) {
        Parcel r22 = r2();
        f0.c(r22, bundle);
        r22.writeStrongBinder(s0Var);
        s2(2, r22);
    }
}

package be;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes2.dex */
public final class i0 extends g1 implements k0 {
    public i0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // be.k0
    public final void E0(String str, List list, Bundle bundle, m0 m0Var) {
        Parcel r22 = r2();
        r22.writeString(str);
        r22.writeTypedList(list);
        i1.c(r22, bundle);
        r22.writeStrongBinder(m0Var);
        s2(2, r22);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // be.k0
    public final void I0(String str, List list, Bundle bundle, m0 m0Var) {
        Parcel r22 = r2();
        r22.writeString(str);
        r22.writeTypedList(list);
        i1.c(r22, bundle);
        r22.writeStrongBinder(m0Var);
        s2(8, r22);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // be.k0
    public final void n0(String str, List list, Bundle bundle, m0 m0Var) {
        Parcel r22 = r2();
        r22.writeString(str);
        r22.writeTypedList(list);
        i1.c(r22, bundle);
        r22.writeStrongBinder(m0Var);
        s2(7, r22);
    }
}

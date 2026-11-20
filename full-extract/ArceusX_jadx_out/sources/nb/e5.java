package nb;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public final class e5 extends com.google.android.gms.internal.measurement.o0 implements g5 {
    public e5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // nb.g5
    public final void x0(List list) {
        Parcel s22 = s2();
        s22.writeTypedList(list);
        u2(2, s22);
    }
}

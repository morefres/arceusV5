package xd;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class d extends a implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xd.f
    public final void r1(String str, Bundle bundle, h hVar) {
        Parcel r22 = r2();
        r22.writeString(str);
        int i10 = c.f35500a;
        r22.writeInt(1);
        bundle.writeToParcel(r22, 0);
        r22.writeStrongBinder(hVar);
        s2(2, r22);
    }
}

package s9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;

/* loaded from: classes.dex */
public final class h extends bb.a implements IInterface {
    public h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void u2(g gVar, ApiFeatureRequest apiFeatureRequest) {
        Parcel r22 = r2();
        bb.c.d(r22, gVar);
        bb.c.c(r22, apiFeatureRequest);
        s2(1, r22);
    }

    public final void v2(g gVar, ApiFeatureRequest apiFeatureRequest, j jVar) {
        Parcel r22 = r2();
        bb.c.d(r22, gVar);
        bb.c.c(r22, apiFeatureRequest);
        bb.c.d(r22, jVar);
        s2(2, r22);
    }

    public final void w2(l9.g gVar, j jVar) {
        Parcel r22 = r2();
        bb.c.d(r22, gVar);
        bb.c.d(r22, jVar);
        s2(6, r22);
    }
}

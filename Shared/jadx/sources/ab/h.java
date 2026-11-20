package ab;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.StoreBytesData;

/* loaded from: classes.dex */
public final class h extends a implements IInterface {
    public h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
    }

    public final void t2(j jVar, DeleteBytesRequest deleteBytesRequest) {
        Parcel r22 = r2();
        e.c(r22, jVar);
        e.b(r22, deleteBytesRequest);
        s2(13, r22);
    }

    public final void u2(l lVar) {
        Parcel r22 = r2();
        e.c(r22, lVar);
        s2(11, r22);
    }

    public final void v2(n nVar, RetrieveBytesRequest retrieveBytesRequest) {
        Parcel r22 = r2();
        e.c(r22, nVar);
        e.b(r22, retrieveBytesRequest);
        s2(12, r22);
    }

    public final void w2(p pVar, StoreBytesData storeBytesData) {
        Parcel r22 = r2();
        e.c(r22, pVar);
        e.b(r22, storeBytesData);
        s2(10, r22);
    }
}

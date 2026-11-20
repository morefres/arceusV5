package p9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.TelemetryData;

/* loaded from: classes.dex */
public final class a extends bb.a implements IInterface {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void u2(TelemetryData telemetryData) {
        Parcel r22 = r2();
        bb.c.c(r22, telemetryData);
        t2(1, r22);
    }
}

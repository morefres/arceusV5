package n9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.zzj;

/* loaded from: classes.dex */
public final class b1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        Bundle bundle = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int i10 = 0;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                bundle = o9.a.b(parcel, u8);
            } else if (n10 == 2) {
                featureArr = (Feature[]) o9.a.k(parcel, u8, Feature.CREATOR);
            } else if (n10 == 3) {
                i10 = o9.a.w(parcel, u8);
            } else if (n10 != 4) {
                o9.a.C(parcel, u8);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) o9.a.g(parcel, u8, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        o9.a.m(parcel, D);
        return new zzj(bundle, featureArr, i10, connectionTelemetryConfiguration);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzj[i10];
    }
}

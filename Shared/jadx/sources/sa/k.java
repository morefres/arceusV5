package sa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponse;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator<ExportCredentialsToDeviceSetupResponse> {
    public static void c(ExportCredentialsToDeviceSetupResponse exportCredentialsToDeviceSetupResponse, Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.f(parcel, 1, exportCredentialsToDeviceSetupResponse.getResponseBundle(), false);
        o9.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ExportCredentialsToDeviceSetupResponse createFromParcel(@NonNull Parcel parcel) {
        int D = o9.a.D(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            if (o9.a.n(u8) != 1) {
                o9.a.C(parcel, u8);
            } else {
                bundle = o9.a.b(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new ExportCredentialsToDeviceSetupResponse(bundle);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExportCredentialsToDeviceSetupResponse[] newArray(int i10) {
        return new ExportCredentialsToDeviceSetupResponse[i10];
    }
}

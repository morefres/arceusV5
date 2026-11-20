package sa;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.RegisterExportResponse;

/* loaded from: classes.dex */
public final class u implements Parcelable.Creator<RegisterExportResponse> {
    public static void c(RegisterExportResponse registerExportResponse, Parcel parcel, int i10) {
        o9.b.b(parcel, o9.b.a(parcel));
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public RegisterExportResponse createFromParcel(@NonNull Parcel parcel) {
        int D = o9.a.D(parcel);
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            o9.a.n(u8);
            o9.a.C(parcel, u8);
        }
        o9.a.m(parcel, D);
        return new RegisterExportResponse();
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RegisterExportResponse[] newArray(int i10) {
        return new RegisterExportResponse[i10];
    }
}

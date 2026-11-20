package sa;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.ClearExportResponse;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<ClearExportResponse> {
    public static void c(ClearExportResponse clearExportResponse, Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.c(parcel, 1, clearExportResponse.getIsDeleted());
        o9.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ClearExportResponse createFromParcel(@NonNull Parcel parcel) {
        int D = o9.a.D(parcel);
        boolean z10 = false;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            if (o9.a.n(u8) != 1) {
                o9.a.C(parcel, u8);
            } else {
                z10 = o9.a.o(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new ClearExportResponse(z10);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ClearExportResponse[] newArray(int i10) {
        return new ClearExportResponse[i10];
    }
}

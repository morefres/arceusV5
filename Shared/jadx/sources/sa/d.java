package sa;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.ClearRegistryResponse;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator<ClearRegistryResponse> {
    public static void c(ClearRegistryResponse clearRegistryResponse, Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.c(parcel, 1, clearRegistryResponse.getIsDeleted());
        o9.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ClearRegistryResponse createFromParcel(@NonNull Parcel parcel) {
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
        return new ClearRegistryResponse(z10);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ClearRegistryResponse[] newArray(int i10) {
        return new ClearRegistryResponse[i10];
    }
}

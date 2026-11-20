package sa;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;
import com.google.android.gms.identitycredentials.CreateCredentialResponse;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator<CreateCredentialHandle> {
    public static void c(CreateCredentialHandle createCredentialHandle, Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.t(parcel, 1, createCredentialHandle.getPendingIntent(), i10, false);
        o9.b.t(parcel, 2, createCredentialHandle.getCreateCredentialResponse(), i10, false);
        o9.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public CreateCredentialHandle createFromParcel(@NonNull Parcel parcel) {
        int D = o9.a.D(parcel);
        PendingIntent pendingIntent = null;
        CreateCredentialResponse createCredentialResponse = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                pendingIntent = (PendingIntent) o9.a.g(parcel, u8, PendingIntent.CREATOR);
            } else if (n10 != 2) {
                o9.a.C(parcel, u8);
            } else {
                createCredentialResponse = (CreateCredentialResponse) o9.a.g(parcel, u8, CreateCredentialResponse.CREATOR);
            }
        }
        o9.a.m(parcel, D);
        return new CreateCredentialHandle(pendingIntent, createCredentialResponse);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CreateCredentialHandle[] newArray(int i10) {
        return new CreateCredentialHandle[i10];
    }
}

package sa;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.PendingImportCredentialsHandle;

/* loaded from: classes.dex */
public final class s implements Parcelable.Creator<PendingImportCredentialsHandle> {
    public static void c(PendingImportCredentialsHandle pendingImportCredentialsHandle, Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.t(parcel, 1, pendingImportCredentialsHandle.getPendingIntent(), i10, false);
        o9.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PendingImportCredentialsHandle createFromParcel(@NonNull Parcel parcel) {
        int D = o9.a.D(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            if (o9.a.n(u8) != 1) {
                o9.a.C(parcel, u8);
            } else {
                pendingIntent = (PendingIntent) o9.a.g(parcel, u8, PendingIntent.CREATOR);
            }
        }
        o9.a.m(parcel, D);
        return new PendingImportCredentialsHandle(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PendingImportCredentialsHandle[] newArray(int i10) {
        return new PendingImportCredentialsHandle[i10];
    }
}

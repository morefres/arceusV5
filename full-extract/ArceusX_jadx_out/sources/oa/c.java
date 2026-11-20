package oa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;

/* loaded from: classes.dex */
public class c implements Parcelable.Creator {
    public RoomEntity a(Parcel parcel) {
        int D = o9.a.D(parcel);
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            o9.a.n(u8);
            o9.a.C(parcel, u8);
        }
        o9.a.m(parcel, D);
        return new RoomEntity();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new RoomEntity[i10];
    }
}

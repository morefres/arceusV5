package oa;

import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;

/* loaded from: classes.dex */
public final class b extends c {
    @Override // oa.c
    public final RoomEntity a(Parcel parcel) {
        Integer v32;
        boolean x32;
        boolean a10;
        v32 = DowngradeableSafeParcel.v3();
        x32 = GamesDowngradeableSafeParcel.x3(v32);
        if (!x32) {
            a10 = DowngradeableSafeParcel.a(RoomEntity.class.getCanonicalName());
            if (!a10) {
                return new RoomEntity();
            }
        }
        return super.a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }
}

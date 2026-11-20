package na;

import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.ParticipantEntity;

/* loaded from: classes.dex */
public final class a extends b {
    @Override // na.b
    public final ParticipantEntity a(Parcel parcel) {
        Integer v32;
        boolean x32;
        boolean a10;
        v32 = DowngradeableSafeParcel.v3();
        x32 = GamesDowngradeableSafeParcel.x3(v32);
        if (!x32) {
            a10 = DowngradeableSafeParcel.a(ParticipantEntity.class.getCanonicalName());
            if (!a10) {
                return new ParticipantEntity();
            }
        }
        return super.a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }
}

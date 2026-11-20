package ia;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.game.GameBadgeEntity;

/* loaded from: classes.dex */
public final class a extends b {
    @Override // ia.b
    public final GameBadgeEntity a(Parcel parcel) {
        Integer v32;
        boolean x32;
        boolean a10;
        v32 = DowngradeableSafeParcel.v3();
        x32 = GamesDowngradeableSafeParcel.x3(v32);
        if (!x32) {
            a10 = DowngradeableSafeParcel.a(GameBadgeEntity.class.getCanonicalName());
            if (!a10) {
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                return new GameBadgeEntity(readInt, readString, readString2, readString3 == null ? null : Uri.parse(readString3));
            }
        }
        return super.a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }
}

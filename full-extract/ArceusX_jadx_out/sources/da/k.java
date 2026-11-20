package da;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

/* loaded from: classes.dex */
public final class k extends l {
    @Override // da.l
    public final GameEntity a(Parcel parcel) {
        Integer v32;
        boolean x32;
        boolean a10;
        boolean z10;
        v32 = DowngradeableSafeParcel.v3();
        x32 = GamesDowngradeableSafeParcel.x3(v32);
        if (!x32) {
            a10 = DowngradeableSafeParcel.a(GameEntity.class.getCanonicalName());
            if (!a10) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                Uri parse = readString7 == null ? null : Uri.parse(readString7);
                String readString8 = parcel.readString();
                Uri parse2 = readString8 == null ? null : Uri.parse(readString8);
                String readString9 = parcel.readString();
                Uri parse3 = readString9 != null ? Uri.parse(readString9) : null;
                boolean z11 = true;
                if (parcel.readInt() > 0) {
                    z10 = true;
                } else {
                    z10 = true;
                    z11 = false;
                }
                return new GameEntity(readString, readString2, readString3, readString4, readString5, readString6, parse, parse2, parse3, z11, parcel.readInt() > 0 ? z10 : false, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), false, false, null, null, null, false, false, false, null, false, false);
            }
        }
        return super.a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }
}

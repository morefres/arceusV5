package na;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.multiplayer.ParticipantEntity;

/* loaded from: classes.dex */
public class b implements Parcelable.Creator {
    public ParticipantEntity a(Parcel parcel) {
        int D = o9.a.D(parcel);
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            o9.a.n(u8);
            o9.a.C(parcel, u8);
        }
        o9.a.m(parcel, D);
        return new ParticipantEntity();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ParticipantEntity[i10];
    }
}

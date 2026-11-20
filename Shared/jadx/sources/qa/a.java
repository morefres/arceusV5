package qa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.stats.PlayerStatsEntity;
import o9.b;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    public static void a(PlayerStatsEntity playerStatsEntity, Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.k(parcel, 1, playerStatsEntity.t3());
        b.k(parcel, 2, playerStatsEntity.F());
        b.n(parcel, 3, playerStatsEntity.u1());
        b.n(parcel, 4, playerStatsEntity.M0());
        b.n(parcel, 5, playerStatsEntity.Q1());
        b.k(parcel, 6, playerStatsEntity.H0());
        b.k(parcel, 7, playerStatsEntity.W());
        b.f(parcel, 8, playerStatsEntity.v3(), false);
        b.k(parcel, 9, playerStatsEntity.J0());
        b.k(parcel, 10, playerStatsEntity.g3());
        b.k(parcel, 11, playerStatsEntity.a2());
        b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        Bundle bundle = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 1:
                    f10 = o9.a.s(parcel, u8);
                    break;
                case 2:
                    f11 = o9.a.s(parcel, u8);
                    break;
                case 3:
                    i10 = o9.a.w(parcel, u8);
                    break;
                case 4:
                    i11 = o9.a.w(parcel, u8);
                    break;
                case 5:
                    i12 = o9.a.w(parcel, u8);
                    break;
                case 6:
                    f12 = o9.a.s(parcel, u8);
                    break;
                case 7:
                    f13 = o9.a.s(parcel, u8);
                    break;
                case 8:
                    bundle = o9.a.b(parcel, u8);
                    break;
                case 9:
                    f14 = o9.a.s(parcel, u8);
                    break;
                case 10:
                    f15 = o9.a.s(parcel, u8);
                    break;
                case 11:
                    f16 = o9.a.s(parcel, u8);
                    break;
                default:
                    o9.a.C(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new PlayerStatsEntity(f10, f11, i10, i11, i12, f12, f13, bundle, f14, f15, f16);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PlayerStatsEntity[i10];
    }
}

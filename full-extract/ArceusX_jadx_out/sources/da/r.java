package da;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.MotionEventCompat;
import backtraceio.library.services.BacktraceMetrics;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.PlayerLevelInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import com.google.android.gms.games.zza;
import com.google.android.gms.games.zzo;

/* loaded from: classes.dex */
public class r implements Parcelable.Creator {
    public PlayerEntity a(Parcel parcel) {
        int D = o9.a.D(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        Uri uri2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        MostRecentGameInfoEntity mostRecentGameInfoEntity = null;
        PlayerLevelInfo playerLevelInfo = null;
        String str6 = null;
        String str7 = null;
        Uri uri3 = null;
        String str8 = null;
        Uri uri4 = null;
        String str9 = null;
        zzo zzoVar = null;
        zza zzaVar = null;
        String str10 = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        long j10 = -1;
        long j11 = 0;
        long j12 = 0;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 1:
                    str = o9.a.h(parcel, u8);
                    break;
                case 2:
                    str2 = o9.a.h(parcel, u8);
                    break;
                case 3:
                    uri = (Uri) o9.a.g(parcel, u8, Uri.CREATOR);
                    break;
                case 4:
                    uri2 = (Uri) o9.a.g(parcel, u8, Uri.CREATOR);
                    break;
                case 5:
                    j11 = o9.a.y(parcel, u8);
                    break;
                case 6:
                    i10 = o9.a.w(parcel, u8);
                    break;
                case 7:
                    j12 = o9.a.y(parcel, u8);
                    break;
                case 8:
                    str3 = o9.a.h(parcel, u8);
                    break;
                case 9:
                    str4 = o9.a.h(parcel, u8);
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 17:
                case MotionEventCompat.AXIS_SCROLL /* 26 */:
                case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                case 31:
                case 32:
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                default:
                    o9.a.C(parcel, u8);
                    break;
                case 14:
                    str5 = o9.a.h(parcel, u8);
                    break;
                case 15:
                    mostRecentGameInfoEntity = (MostRecentGameInfoEntity) o9.a.g(parcel, u8, MostRecentGameInfoEntity.CREATOR);
                    break;
                case 16:
                    playerLevelInfo = (PlayerLevelInfo) o9.a.g(parcel, u8, PlayerLevelInfo.CREATOR);
                    break;
                case 18:
                    z10 = o9.a.o(parcel, u8);
                    break;
                case 19:
                    z11 = o9.a.o(parcel, u8);
                    break;
                case 20:
                    str6 = o9.a.h(parcel, u8);
                    break;
                case MotionEventCompat.AXIS_WHEEL /* 21 */:
                    str7 = o9.a.h(parcel, u8);
                    break;
                case MotionEventCompat.AXIS_GAS /* 22 */:
                    uri3 = (Uri) o9.a.g(parcel, u8, Uri.CREATOR);
                    break;
                case MotionEventCompat.AXIS_BRAKE /* 23 */:
                    str8 = o9.a.h(parcel, u8);
                    break;
                case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                    uri4 = (Uri) o9.a.g(parcel, u8, Uri.CREATOR);
                    break;
                case 25:
                    str9 = o9.a.h(parcel, u8);
                    break;
                case 29:
                    j10 = o9.a.y(parcel, u8);
                    break;
                case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
                    zzoVar = (zzo) o9.a.g(parcel, u8, zzo.CREATOR);
                    break;
                case 35:
                    zzaVar = (zza) o9.a.g(parcel, u8, zza.CREATOR);
                    break;
                case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                    z12 = o9.a.o(parcel, u8);
                    break;
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    str10 = o9.a.h(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new PlayerEntity(str, str2, uri, uri2, j11, i10, j12, str3, str4, str5, mostRecentGameInfoEntity, playerLevelInfo, z10, z11, str6, str7, uri3, str8, uri4, str9, j10, zzoVar, zzaVar, z12, str10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PlayerEntity[i10];
    }
}

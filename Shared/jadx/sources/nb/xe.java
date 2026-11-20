package nb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.MotionEventCompat;
import backtraceio.library.services.BacktraceMetrics;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class xe implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        boolean z10 = false;
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        int i11 = 0;
        int i12 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        String str = "";
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str11 = null;
        String str12 = null;
        int i13 = 100;
        boolean z13 = true;
        boolean z14 = true;
        long j17 = -2147483648L;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 2:
                    str5 = o9.a.h(parcel, u8);
                    break;
                case 3:
                    str6 = o9.a.h(parcel, u8);
                    break;
                case 4:
                    str7 = o9.a.h(parcel, u8);
                    break;
                case 5:
                    str8 = o9.a.h(parcel, u8);
                    break;
                case 6:
                    j10 = o9.a.y(parcel, u8);
                    break;
                case 7:
                    j11 = o9.a.y(parcel, u8);
                    break;
                case 8:
                    str9 = o9.a.h(parcel, u8);
                    break;
                case 9:
                    z13 = o9.a.o(parcel, u8);
                    break;
                case 10:
                    z10 = o9.a.o(parcel, u8);
                    break;
                case 11:
                    j17 = o9.a.y(parcel, u8);
                    break;
                case 12:
                    str10 = o9.a.h(parcel, u8);
                    break;
                case 13:
                case 17:
                case 19:
                case 20:
                case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
                default:
                    o9.a.C(parcel, u8);
                    break;
                case 14:
                    j12 = o9.a.y(parcel, u8);
                    break;
                case 15:
                    i10 = o9.a.w(parcel, u8);
                    break;
                case 16:
                    z14 = o9.a.o(parcel, u8);
                    break;
                case 18:
                    z11 = o9.a.o(parcel, u8);
                    break;
                case MotionEventCompat.AXIS_WHEEL /* 21 */:
                    bool = o9.a.p(parcel, u8);
                    break;
                case MotionEventCompat.AXIS_GAS /* 22 */:
                    j13 = o9.a.y(parcel, u8);
                    break;
                case MotionEventCompat.AXIS_BRAKE /* 23 */:
                    arrayList = o9.a.j(parcel, u8);
                    break;
                case 25:
                    str = o9.a.h(parcel, u8);
                    break;
                case MotionEventCompat.AXIS_SCROLL /* 26 */:
                    str2 = o9.a.h(parcel, u8);
                    break;
                case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                    str11 = o9.a.h(parcel, u8);
                    break;
                case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                    z12 = o9.a.o(parcel, u8);
                    break;
                case 29:
                    j14 = o9.a.y(parcel, u8);
                    break;
                case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                    i13 = o9.a.w(parcel, u8);
                    break;
                case 31:
                    str3 = o9.a.h(parcel, u8);
                    break;
                case 32:
                    i11 = o9.a.w(parcel, u8);
                    break;
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                    j15 = o9.a.y(parcel, u8);
                    break;
                case 35:
                    str12 = o9.a.h(parcel, u8);
                    break;
                case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                    str4 = o9.a.h(parcel, u8);
                    break;
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    j16 = o9.a.y(parcel, u8);
                    break;
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    i12 = o9.a.w(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new zzr(str5, str6, str7, str8, j10, j11, str9, z13, z10, j17, str10, j12, i10, z14, z11, bool, j13, arrayList, str, str2, str11, z12, j14, i13, str3, i11, j15, str12, str4, j16, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzr[i10];
    }
}

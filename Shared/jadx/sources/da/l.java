package da;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.MotionEventCompat;
import com.google.android.gms.games.GameEntity;

/* loaded from: classes.dex */
public class l implements Parcelable.Creator {
    public GameEntity a(Parcel parcel) {
        int D = o9.a.D(parcel);
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 != 28) {
                switch (n10) {
                    case 1:
                        str = o9.a.h(parcel, u8);
                        break;
                    case 2:
                        str2 = o9.a.h(parcel, u8);
                        break;
                    case 3:
                        str3 = o9.a.h(parcel, u8);
                        break;
                    case 4:
                        str4 = o9.a.h(parcel, u8);
                        break;
                    case 5:
                        str5 = o9.a.h(parcel, u8);
                        break;
                    case 6:
                        str6 = o9.a.h(parcel, u8);
                        break;
                    case 7:
                        uri = (Uri) o9.a.g(parcel, u8, Uri.CREATOR);
                        break;
                    case 8:
                        uri2 = (Uri) o9.a.g(parcel, u8, Uri.CREATOR);
                        break;
                    case 9:
                        uri3 = (Uri) o9.a.g(parcel, u8, Uri.CREATOR);
                        break;
                    case 10:
                        z10 = o9.a.o(parcel, u8);
                        break;
                    case 11:
                        z11 = o9.a.o(parcel, u8);
                        break;
                    case 12:
                        str7 = o9.a.h(parcel, u8);
                        break;
                    case 13:
                        i10 = o9.a.w(parcel, u8);
                        break;
                    case 14:
                        i11 = o9.a.w(parcel, u8);
                        break;
                    case 15:
                        i12 = o9.a.w(parcel, u8);
                        break;
                    case 16:
                        z12 = o9.a.o(parcel, u8);
                        break;
                    case 17:
                        z13 = o9.a.o(parcel, u8);
                        break;
                    case 18:
                        str8 = o9.a.h(parcel, u8);
                        break;
                    case 19:
                        str9 = o9.a.h(parcel, u8);
                        break;
                    case 20:
                        str10 = o9.a.h(parcel, u8);
                        break;
                    case MotionEventCompat.AXIS_WHEEL /* 21 */:
                        z14 = o9.a.o(parcel, u8);
                        break;
                    case MotionEventCompat.AXIS_GAS /* 22 */:
                        z15 = o9.a.o(parcel, u8);
                        break;
                    case MotionEventCompat.AXIS_BRAKE /* 23 */:
                        z16 = o9.a.o(parcel, u8);
                        break;
                    case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                        str11 = o9.a.h(parcel, u8);
                        break;
                    case 25:
                        z17 = o9.a.o(parcel, u8);
                        break;
                    default:
                        o9.a.C(parcel, u8);
                        break;
                }
            } else {
                z18 = o9.a.o(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new GameEntity(str, str2, str3, str4, str5, str6, uri, uri2, uri3, z10, z11, str7, i10, i11, i12, z12, z13, str8, str9, str10, z14, z15, z16, str11, z17, z18);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GameEntity[i10];
    }
}

package nb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.core.view.MotionEventCompat;
import backtraceio.library.services.BacktraceMetrics;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c5 extends com.google.android.gms.internal.measurement.p0 implements d5 {
    public c5() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        j5 j5Var = null;
        g5 g5Var = null;
        switch (i10) {
            case 1:
                zzbg zzbgVar = (zzbg) com.google.android.gms.internal.measurement.q0.b(parcel, zzbg.CREATOR);
                zzr zzrVar = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                V(zzbgVar, zzrVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzpl zzplVar = (zzpl) com.google.android.gms.internal.measurement.q0.b(parcel, zzpl.CREATOR);
                zzr zzrVar2 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                j0(zzplVar, zzrVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case MotionEventCompat.AXIS_GAS /* 22 */:
            case MotionEventCompat.AXIS_BRAKE /* 23 */:
            case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
            default:
                return false;
            case 4:
                zzr zzrVar3 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                K1(zzrVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbg zzbgVar2 = (zzbg) com.google.android.gms.internal.measurement.q0.b(parcel, zzbg.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                com.google.android.gms.internal.measurement.q0.f(parcel);
                Q0(zzbgVar2, readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                zzr zzrVar4 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                W(zzrVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                zzr zzrVar5 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                boolean a10 = com.google.android.gms.internal.measurement.q0.a(parcel);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                List G0 = G0(zzrVar5, a10);
                parcel2.writeNoException();
                parcel2.writeTypedList(G0);
                return true;
            case 9:
                zzbg zzbgVar3 = (zzbg) com.google.android.gms.internal.measurement.q0.b(parcel, zzbg.CREATOR);
                String readString3 = parcel.readString();
                com.google.android.gms.internal.measurement.q0.f(parcel);
                byte[] e02 = e0(zzbgVar3, readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(e02);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                com.google.android.gms.internal.measurement.q0.f(parcel);
                V0(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                zzr zzrVar6 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                String A0 = A0(zzrVar6);
                parcel2.writeNoException();
                parcel2.writeString(A0);
                return true;
            case 12:
                zzah zzahVar = (zzah) com.google.android.gms.internal.measurement.q0.b(parcel, zzah.CREATOR);
                zzr zzrVar7 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                q(zzahVar, zzrVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                zzah zzahVar2 = (zzah) com.google.android.gms.internal.measurement.q0.b(parcel, zzah.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                f0(zzahVar2);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean a11 = com.google.android.gms.internal.measurement.q0.a(parcel);
                zzr zzrVar8 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                List Y1 = Y1(readString7, readString8, a11, zzrVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(Y1);
                return true;
            case 15:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                boolean a12 = com.google.android.gms.internal.measurement.q0.a(parcel);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                List o8 = o(readString9, readString10, readString11, a12);
                parcel2.writeNoException();
                parcel2.writeTypedList(o8);
                return true;
            case 16:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                zzr zzrVar9 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                List e22 = e2(readString12, readString13, zzrVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(e22);
                return true;
            case 17:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                com.google.android.gms.internal.measurement.q0.f(parcel);
                List K = K(readString14, readString15, readString16);
                parcel2.writeNoException();
                parcel2.writeTypedList(K);
                return true;
            case 18:
                zzr zzrVar10 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                W0(zzrVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) com.google.android.gms.internal.measurement.q0.b(parcel, Bundle.CREATOR);
                zzr zzrVar11 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                E1(bundle, zzrVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                zzr zzrVar12 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                p2(zzrVar12);
                parcel2.writeNoException();
                return true;
            case MotionEventCompat.AXIS_WHEEL /* 21 */:
                zzr zzrVar13 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                zzao C1 = C1(zzrVar13);
                parcel2.writeNoException();
                if (C1 == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    C1.writeToParcel(parcel2, 1);
                }
                return true;
            case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                zzr zzrVar14 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                Bundle bundle2 = (Bundle) com.google.android.gms.internal.measurement.q0.b(parcel, Bundle.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                List S = S(zzrVar14, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(S);
                return true;
            case 25:
                zzr zzrVar15 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                P(zzrVar15);
                parcel2.writeNoException();
                return true;
            case MotionEventCompat.AXIS_SCROLL /* 26 */:
                zzr zzrVar16 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                c0(zzrVar16);
                parcel2.writeNoException();
                return true;
            case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                zzr zzrVar17 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                S1(zzrVar17);
                parcel2.writeNoException();
                return true;
            case 29:
                zzr zzrVar18 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                zzoo zzooVar = (zzoo) com.google.android.gms.internal.measurement.q0.b(parcel, zzoo.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    j5Var = queryLocalInterface instanceof j5 ? (j5) queryLocalInterface : new h5(readStrongBinder);
                }
                com.google.android.gms.internal.measurement.q0.f(parcel);
                H(zzrVar18, zzooVar, j5Var);
                parcel2.writeNoException();
                return true;
            case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                zzr zzrVar19 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                zzaf zzafVar = (zzaf) com.google.android.gms.internal.measurement.q0.b(parcel, zzaf.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                u1(zzrVar19, zzafVar);
                parcel2.writeNoException();
                return true;
            case 31:
                zzr zzrVar20 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                Bundle bundle3 = (Bundle) com.google.android.gms.internal.measurement.q0.b(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    g5Var = queryLocalInterface2 instanceof g5 ? (g5) queryLocalInterface2 : new e5(readStrongBinder2);
                }
                com.google.android.gms.internal.measurement.q0.f(parcel);
                g1(zzrVar20, bundle3, g5Var);
                parcel2.writeNoException();
                return true;
        }
    }
}

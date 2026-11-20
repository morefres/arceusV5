package nb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a5 extends com.google.android.gms.internal.measurement.o0 implements d5 {
    public a5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // nb.d5
    public final String A0(zzr zzrVar) {
        Parcel s22 = s2();
        com.google.android.gms.internal.measurement.q0.c(s22, zzrVar);
        Parcel r22 = r2(11, s22);
        String readString = r22.readString();
        r22.recycle();
        return readString;
    }

    @Override // nb.d5
    public final zzao C1(zzr zzrVar) {
        Parcel s22 = s2();
        com.google.android.gms.internal.measurement.q0.c(s22, zzrVar);
        Parcel r22 = r2(21, s22);
        zzao zzaoVar = (zzao) com.google.android.gms.internal.measurement.q0.b(r22, zzao.CREATOR);
        r22.recycle();
        return zzaoVar;
    }

    @Override // nb.d5
    public final void E1(Bundle bundle, zzr zzrVar) {
        Parcel s22 = s2();
        com.google.android.gms.internal.measurement.q0.c(s22, bundle);
        com.google.android.gms.internal.measurement.q0.c(s22, zzrVar);
        t2(19, s22);
    }

    @Override // nb.d5
    public final void H(zzr zzrVar, zzoo zzooVar, j5 j5Var) {
        Parcel s22 = s2();
        com.google.android.gms.internal.measurement.q0.c(s22, zzrVar);
        com.google.android.gms.internal.measurement.q0.c(s22, zzooVar);
        com.google.android.gms.internal.measurement.q0.d(s22, j5Var);
        t2(29, s22);
    }

    @Override // nb.d5
    public final List K(String str, String str2, String str3) {
        Parcel s22 = s2();
        s22.writeString(null);
        s22.writeString(str2);
        s22.writeString(str3);
        Parcel r22 = r2(17, s22);
        ArrayList createTypedArrayList = r22.createTypedArrayList(zzah.CREATOR);
        r22.recycle();
        return createTypedArrayList;
    }

    @Override // nb.d5
    public final void K1(zzr zzrVar) {
        Parcel s22 = s2();
        com.google.android.gms.internal.measurement.q0.c(s22, zzrVar);
        t2(4, s22);
    }

    @Override // nb.d5
    public final void P(zzr zzrVar) {
        Parcel s22 = s2();
        com.google.android.gms.internal.measurement.q0.c(s22, zzrVar);
        t2(25, s22);
    }

    @Override // nb.d5
    public final void S1(zzr zzrVar) {
        Parcel s22 = s2();
        com.google.android.gms.internal.measurement.q0.c(s22, zzrVar);
        t2(27, s22);
    }

    @Override // nb.d5
    public final void V(zzbg zzbgVar, zzr zzrVar) {
        Parcel s22 = s2();
        com.google.android.gms.internal.measurement.q0.c(s22, zzbgVar);
        com.google.android.gms.internal.measurement.q0.c(s22, zzrVar);
        t2(1, s22);
    }

    @Override // nb.d5
    public final void V0(long j10, String str, String str2, String str3) {
        Parcel s22 = s2();
        s22.writeLong(j10);
        s22.writeString(str);
        s22.writeString(str2);
        s22.writeString(str3);
        t2(10, s22);
    }

    @Override // nb.d5
    public final void W(zzr zzrVar) {
        Parcel s22 = s2();
        com.google.android.gms.internal.measurement.q0.c(s22, zzrVar);
        t2(6, s22);
    }

    @Override // nb.d5
    public final void W0(zzr zzrVar) {
        Parcel s22 = s2();
        com.google.android.gms.internal.measurement.q0.c(s22, zzrVar);
        t2(18, s22);
    }

    @Override // nb.d5
    public final List Y1(String str, String str2, boolean z10, zzr zzrVar) {
        Parcel s22 = s2();
        s22.writeString(str);
        s22.writeString(str2);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.q0.f6793a;
        s22.writeInt(z10 ? 1 : 0);
        com.google.android.gms.internal.measurement.q0.c(s22, zzrVar);
        Parcel r22 = r2(14, s22);
        ArrayList createTypedArrayList = r22.createTypedArrayList(zzpl.CREATOR);
        r22.recycle();
        return createTypedArrayList;
    }

    @Override // nb.d5
    public final void c0(zzr zzrVar) {
        Parcel s22 = s2();
        com.google.android.gms.internal.measurement.q0.c(s22, zzrVar);
        t2(26, s22);
    }

    @Override // nb.d5
    public final byte[] e0(zzbg zzbgVar, String str) {
        Parcel s22 = s2();
        com.google.android.gms.internal.measurement.q0.c(s22, zzbgVar);
        s22.writeString(str);
        Parcel r22 = r2(9, s22);
        byte[] createByteArray = r22.createByteArray();
        r22.recycle();
        return createByteArray;
    }

    @Override // nb.d5
    public final List e2(String str, String str2, zzr zzrVar) {
        Parcel s22 = s2();
        s22.writeString(str);
        s22.writeString(str2);
        com.google.android.gms.internal.measurement.q0.c(s22, zzrVar);
        Parcel r22 = r2(16, s22);
        ArrayList createTypedArrayList = r22.createTypedArrayList(zzah.CREATOR);
        r22.recycle();
        return createTypedArrayList;
    }

    @Override // nb.d5
    public final void g1(zzr zzrVar, Bundle bundle, g5 g5Var) {
        Parcel s22 = s2();
        com.google.android.gms.internal.measurement.q0.c(s22, zzrVar);
        com.google.android.gms.internal.measurement.q0.c(s22, bundle);
        com.google.android.gms.internal.measurement.q0.d(s22, g5Var);
        t2(31, s22);
    }

    @Override // nb.d5
    public final void j0(zzpl zzplVar, zzr zzrVar) {
        Parcel s22 = s2();
        com.google.android.gms.internal.measurement.q0.c(s22, zzplVar);
        com.google.android.gms.internal.measurement.q0.c(s22, zzrVar);
        t2(2, s22);
    }

    @Override // nb.d5
    public final List o(String str, String str2, String str3, boolean z10) {
        Parcel s22 = s2();
        s22.writeString(null);
        s22.writeString(str2);
        s22.writeString(str3);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.q0.f6793a;
        s22.writeInt(z10 ? 1 : 0);
        Parcel r22 = r2(15, s22);
        ArrayList createTypedArrayList = r22.createTypedArrayList(zzpl.CREATOR);
        r22.recycle();
        return createTypedArrayList;
    }

    @Override // nb.d5
    public final void p2(zzr zzrVar) {
        Parcel s22 = s2();
        com.google.android.gms.internal.measurement.q0.c(s22, zzrVar);
        t2(20, s22);
    }

    @Override // nb.d5
    public final void q(zzah zzahVar, zzr zzrVar) {
        Parcel s22 = s2();
        com.google.android.gms.internal.measurement.q0.c(s22, zzahVar);
        com.google.android.gms.internal.measurement.q0.c(s22, zzrVar);
        t2(12, s22);
    }

    @Override // nb.d5
    public final void u1(zzr zzrVar, zzaf zzafVar) {
        Parcel s22 = s2();
        com.google.android.gms.internal.measurement.q0.c(s22, zzrVar);
        com.google.android.gms.internal.measurement.q0.c(s22, zzafVar);
        t2(30, s22);
    }
}

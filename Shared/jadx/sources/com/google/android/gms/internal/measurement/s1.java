package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class s1 extends o0 implements u1 {
    public s1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void beginAdUnitExposure(String str, long j10) {
        Parcel s22 = s2();
        s22.writeString(str);
        s22.writeLong(j10);
        t2(23, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel s22 = s2();
        s22.writeString(str);
        s22.writeString(str2);
        q0.c(s22, bundle);
        t2(9, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void endAdUnitExposure(String str, long j10) {
        Parcel s22 = s2();
        s22.writeString(str);
        s22.writeLong(j10);
        t2(24, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void generateEventId(x1 x1Var) {
        Parcel s22 = s2();
        q0.d(s22, x1Var);
        t2(22, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void getCachedAppInstanceId(x1 x1Var) {
        Parcel s22 = s2();
        q0.d(s22, x1Var);
        t2(19, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void getConditionalUserProperties(String str, String str2, x1 x1Var) {
        Parcel s22 = s2();
        s22.writeString(str);
        s22.writeString(str2);
        q0.d(s22, x1Var);
        t2(10, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void getCurrentScreenClass(x1 x1Var) {
        Parcel s22 = s2();
        q0.d(s22, x1Var);
        t2(17, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void getCurrentScreenName(x1 x1Var) {
        Parcel s22 = s2();
        q0.d(s22, x1Var);
        t2(16, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void getGmpAppId(x1 x1Var) {
        Parcel s22 = s2();
        q0.d(s22, x1Var);
        t2(21, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void getMaxUserProperties(String str, x1 x1Var) {
        Parcel s22 = s2();
        s22.writeString(str);
        q0.d(s22, x1Var);
        t2(6, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void getUserProperties(String str, String str2, boolean z10, x1 x1Var) {
        Parcel s22 = s2();
        s22.writeString(str);
        s22.writeString(str2);
        ClassLoader classLoader = q0.f6793a;
        s22.writeInt(z10 ? 1 : 0);
        q0.d(s22, x1Var);
        t2(5, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void initialize(y9.a aVar, zzdd zzddVar, long j10) {
        Parcel s22 = s2();
        q0.d(s22, aVar);
        q0.c(s22, zzddVar);
        s22.writeLong(j10);
        t2(1, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        Parcel s22 = s2();
        s22.writeString(str);
        s22.writeString(str2);
        q0.c(s22, bundle);
        s22.writeInt(z10 ? 1 : 0);
        s22.writeInt(z11 ? 1 : 0);
        s22.writeLong(j10);
        t2(2, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void logHealthData(int i10, String str, y9.a aVar, y9.a aVar2, y9.a aVar3) {
        Parcel s22 = s2();
        s22.writeInt(5);
        s22.writeString(str);
        q0.d(s22, aVar);
        q0.d(s22, aVar2);
        q0.d(s22, aVar3);
        t2(33, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j10) {
        Parcel s22 = s2();
        q0.c(s22, zzdfVar);
        q0.c(s22, bundle);
        s22.writeLong(j10);
        t2(53, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j10) {
        Parcel s22 = s2();
        q0.c(s22, zzdfVar);
        s22.writeLong(j10);
        t2(54, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j10) {
        Parcel s22 = s2();
        q0.c(s22, zzdfVar);
        s22.writeLong(j10);
        t2(55, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j10) {
        Parcel s22 = s2();
        q0.c(s22, zzdfVar);
        s22.writeLong(j10);
        t2(56, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, x1 x1Var, long j10) {
        Parcel s22 = s2();
        q0.c(s22, zzdfVar);
        q0.d(s22, x1Var);
        s22.writeLong(j10);
        t2(57, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j10) {
        Parcel s22 = s2();
        q0.c(s22, zzdfVar);
        s22.writeLong(j10);
        t2(51, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j10) {
        Parcel s22 = s2();
        q0.c(s22, zzdfVar);
        s22.writeLong(j10);
        t2(52, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void performAction(Bundle bundle, x1 x1Var, long j10) {
        Parcel s22 = s2();
        q0.c(s22, bundle);
        q0.d(s22, x1Var);
        s22.writeLong(j10);
        t2(32, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void registerOnMeasurementEventListener(e2 e2Var) {
        Parcel s22 = s2();
        q0.d(s22, e2Var);
        t2(35, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void retrieveAndUploadBatches(a2 a2Var) {
        Parcel s22 = s2();
        q0.d(s22, a2Var);
        t2(58, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel s22 = s2();
        q0.c(s22, bundle);
        s22.writeLong(j10);
        t2(8, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j10) {
        Parcel s22 = s2();
        q0.c(s22, zzdfVar);
        s22.writeString(str);
        s22.writeString(str2);
        s22.writeLong(j10);
        t2(50, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void setDataCollectionEnabled(boolean z10) {
        Parcel s22 = s2();
        ClassLoader classLoader = q0.f6793a;
        s22.writeInt(z10 ? 1 : 0);
        t2(39, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void setEventInterceptor(e2 e2Var) {
        Parcel s22 = s2();
        q0.d(s22, e2Var);
        t2(34, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void setUserProperty(String str, String str2, y9.a aVar, boolean z10, long j10) {
        Parcel s22 = s2();
        s22.writeString(str);
        s22.writeString(str2);
        q0.d(s22, aVar);
        s22.writeInt(z10 ? 1 : 0);
        s22.writeLong(j10);
        t2(4, s22);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void unregisterOnMeasurementEventListener(e2 e2Var) {
        Parcel s22 = s2();
        q0.d(s22, e2Var);
        t2(36, s22);
    }
}

package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.core.view.MotionEventCompat;
import backtraceio.library.services.BacktraceMetrics;
import com.appsflyer.share.attribution.RequestError;
import java.util.HashMap;
import y9.a;

/* loaded from: classes.dex */
public abstract class t1 extends p0 implements u1 {
    public t1() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static u1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof u1 ? (u1) queryLocalInterface : new s1(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        x1 x1Var = null;
        a2 a2Var = null;
        x1 x1Var2 = null;
        x1 x1Var3 = null;
        x1 x1Var4 = null;
        x1 x1Var5 = null;
        e2 e2Var = null;
        e2 e2Var2 = null;
        e2 e2Var3 = null;
        x1 x1Var6 = null;
        x1 x1Var7 = null;
        x1 x1Var8 = null;
        x1 x1Var9 = null;
        x1 x1Var10 = null;
        x1 x1Var11 = null;
        g2 g2Var = null;
        x1 x1Var12 = null;
        x1 x1Var13 = null;
        x1 x1Var14 = null;
        x1 x1Var15 = null;
        x1 x1Var16 = null;
        switch (i10) {
            case 1:
                y9.a s22 = a.AbstractBinderC0675a.s2(parcel.readStrongBinder());
                zzdd zzddVar = (zzdd) q0.b(parcel, zzdd.CREATOR);
                long readLong = parcel.readLong();
                q0.f(parcel);
                initialize(s22, zzddVar, readLong);
                break;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) q0.b(parcel, Bundle.CREATOR);
                boolean a10 = q0.a(parcel);
                boolean a11 = q0.a(parcel);
                long readLong2 = parcel.readLong();
                q0.f(parcel);
                logEvent(readString, readString2, bundle, a10, a11, readLong2);
                break;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) q0.b(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    x1Var = queryLocalInterface instanceof x1 ? (x1) queryLocalInterface : new v1(readStrongBinder);
                }
                long readLong3 = parcel.readLong();
                q0.f(parcel);
                logEventAndBundle(readString3, readString4, bundle2, x1Var, readLong3);
                break;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                y9.a s23 = a.AbstractBinderC0675a.s2(parcel.readStrongBinder());
                boolean a12 = q0.a(parcel);
                long readLong4 = parcel.readLong();
                q0.f(parcel);
                setUserProperty(readString5, readString6, s23, a12, readLong4);
                break;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean a13 = q0.a(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    x1Var16 = queryLocalInterface2 instanceof x1 ? (x1) queryLocalInterface2 : new v1(readStrongBinder2);
                }
                q0.f(parcel);
                getUserProperties(readString7, readString8, a13, x1Var16);
                break;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    x1Var15 = queryLocalInterface3 instanceof x1 ? (x1) queryLocalInterface3 : new v1(readStrongBinder3);
                }
                q0.f(parcel);
                getMaxUserProperties(readString9, x1Var15);
                break;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                q0.f(parcel);
                setUserId(readString10, readLong5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) q0.b(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                q0.f(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                break;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) q0.b(parcel, Bundle.CREATOR);
                q0.f(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                break;
            case 10:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    x1Var14 = queryLocalInterface4 instanceof x1 ? (x1) queryLocalInterface4 : new v1(readStrongBinder4);
                }
                q0.f(parcel);
                getConditionalUserProperties(readString13, readString14, x1Var14);
                break;
            case 11:
                boolean a14 = q0.a(parcel);
                long readLong7 = parcel.readLong();
                q0.f(parcel);
                setMeasurementEnabled(a14, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                q0.f(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                q0.f(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                q0.f(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                y9.a s24 = a.AbstractBinderC0675a.s2(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                q0.f(parcel);
                setCurrentScreen(s24, readString15, readString16, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    x1Var13 = queryLocalInterface5 instanceof x1 ? (x1) queryLocalInterface5 : new v1(readStrongBinder5);
                }
                q0.f(parcel);
                getCurrentScreenName(x1Var13);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    x1Var12 = queryLocalInterface6 instanceof x1 ? (x1) queryLocalInterface6 : new v1(readStrongBinder6);
                }
                q0.f(parcel);
                getCurrentScreenClass(x1Var12);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    g2Var = queryLocalInterface7 instanceof g2 ? (g2) queryLocalInterface7 : new f2(readStrongBinder7);
                }
                q0.f(parcel);
                setInstanceIdProvider(g2Var);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    x1Var11 = queryLocalInterface8 instanceof x1 ? (x1) queryLocalInterface8 : new v1(readStrongBinder8);
                }
                q0.f(parcel);
                getCachedAppInstanceId(x1Var11);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    x1Var10 = queryLocalInterface9 instanceof x1 ? (x1) queryLocalInterface9 : new v1(readStrongBinder9);
                }
                q0.f(parcel);
                getAppInstanceId(x1Var10);
                break;
            case MotionEventCompat.AXIS_WHEEL /* 21 */:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    x1Var9 = queryLocalInterface10 instanceof x1 ? (x1) queryLocalInterface10 : new v1(readStrongBinder10);
                }
                q0.f(parcel);
                getGmpAppId(x1Var9);
                break;
            case MotionEventCompat.AXIS_GAS /* 22 */:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    x1Var8 = queryLocalInterface11 instanceof x1 ? (x1) queryLocalInterface11 : new v1(readStrongBinder11);
                }
                q0.f(parcel);
                generateEventId(x1Var8);
                break;
            case MotionEventCompat.AXIS_BRAKE /* 23 */:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                q0.f(parcel);
                beginAdUnitExposure(readString17, readLong12);
                break;
            case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                q0.f(parcel);
                endAdUnitExposure(readString18, readLong13);
                break;
            case 25:
                y9.a s25 = a.AbstractBinderC0675a.s2(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                q0.f(parcel);
                onActivityStarted(s25, readLong14);
                break;
            case MotionEventCompat.AXIS_SCROLL /* 26 */:
                y9.a s26 = a.AbstractBinderC0675a.s2(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                q0.f(parcel);
                onActivityStopped(s26, readLong15);
                break;
            case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                y9.a s27 = a.AbstractBinderC0675a.s2(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) q0.b(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                q0.f(parcel);
                onActivityCreated(s27, bundle5, readLong16);
                break;
            case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                y9.a s28 = a.AbstractBinderC0675a.s2(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                q0.f(parcel);
                onActivityDestroyed(s28, readLong17);
                break;
            case 29:
                y9.a s29 = a.AbstractBinderC0675a.s2(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                q0.f(parcel);
                onActivityPaused(s29, readLong18);
                break;
            case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                y9.a s210 = a.AbstractBinderC0675a.s2(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                q0.f(parcel);
                onActivityResumed(s210, readLong19);
                break;
            case 31:
                y9.a s211 = a.AbstractBinderC0675a.s2(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    x1Var7 = queryLocalInterface12 instanceof x1 ? (x1) queryLocalInterface12 : new v1(readStrongBinder12);
                }
                long readLong20 = parcel.readLong();
                q0.f(parcel);
                onActivitySaveInstanceState(s211, x1Var7, readLong20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) q0.b(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    x1Var6 = queryLocalInterface13 instanceof x1 ? (x1) queryLocalInterface13 : new v1(readStrongBinder13);
                }
                long readLong21 = parcel.readLong();
                q0.f(parcel);
                performAction(bundle6, x1Var6, readLong21);
                break;
            case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                y9.a s212 = a.AbstractBinderC0675a.s2(parcel.readStrongBinder());
                y9.a s213 = a.AbstractBinderC0675a.s2(parcel.readStrongBinder());
                y9.a s214 = a.AbstractBinderC0675a.s2(parcel.readStrongBinder());
                q0.f(parcel);
                logHealthData(readInt, readString19, s212, s213, s214);
                break;
            case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    e2Var3 = queryLocalInterface14 instanceof e2 ? (e2) queryLocalInterface14 : new b2(readStrongBinder14);
                }
                q0.f(parcel);
                setEventInterceptor(e2Var3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    e2Var2 = queryLocalInterface15 instanceof e2 ? (e2) queryLocalInterface15 : new b2(readStrongBinder15);
                }
                q0.f(parcel);
                registerOnMeasurementEventListener(e2Var2);
                break;
            case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    e2Var = queryLocalInterface16 instanceof e2 ? (e2) queryLocalInterface16 : new b2(readStrongBinder16);
                }
                q0.f(parcel);
                unregisterOnMeasurementEventListener(e2Var);
                break;
            case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                HashMap e10 = q0.e(parcel);
                q0.f(parcel);
                initForTests(e10);
                break;
            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    x1Var5 = queryLocalInterface17 instanceof x1 ? (x1) queryLocalInterface17 : new v1(readStrongBinder17);
                }
                int readInt2 = parcel.readInt();
                q0.f(parcel);
                getTestFlag(x1Var5, readInt2);
                break;
            case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                boolean a15 = q0.a(parcel);
                q0.f(parcel);
                setDataCollectionEnabled(a15);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    x1Var4 = queryLocalInterface18 instanceof x1 ? (x1) queryLocalInterface18 : new v1(readStrongBinder18);
                }
                q0.f(parcel);
                isDataCollectionEnabled(x1Var4);
                break;
            case 41:
            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
            case 49:
            default:
                return false;
            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                Bundle bundle7 = (Bundle) q0.b(parcel, Bundle.CREATOR);
                q0.f(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                long readLong22 = parcel.readLong();
                q0.f(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                Bundle bundle8 = (Bundle) q0.b(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                q0.f(parcel);
                setConsent(bundle8, readLong23);
                break;
            case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                Bundle bundle9 = (Bundle) q0.b(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                q0.f(parcel);
                setConsentThirdParty(bundle9, readLong24);
                break;
            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    x1Var3 = queryLocalInterface19 instanceof x1 ? (x1) queryLocalInterface19 : new v1(readStrongBinder19);
                }
                q0.f(parcel);
                getSessionId(x1Var3);
                break;
            case 48:
                Intent intent = (Intent) q0.b(parcel, Intent.CREATOR);
                q0.f(parcel);
                setSgtmDebugInfo(intent);
                break;
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                zzdf zzdfVar = (zzdf) q0.b(parcel, zzdf.CREATOR);
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                long readLong25 = parcel.readLong();
                q0.f(parcel);
                setCurrentScreenByScionActivityInfo(zzdfVar, readString20, readString21, readLong25);
                break;
            case 51:
                zzdf zzdfVar2 = (zzdf) q0.b(parcel, zzdf.CREATOR);
                long readLong26 = parcel.readLong();
                q0.f(parcel);
                onActivityStartedByScionActivityInfo(zzdfVar2, readLong26);
                break;
            case 52:
                zzdf zzdfVar3 = (zzdf) q0.b(parcel, zzdf.CREATOR);
                long readLong27 = parcel.readLong();
                q0.f(parcel);
                onActivityStoppedByScionActivityInfo(zzdfVar3, readLong27);
                break;
            case 53:
                zzdf zzdfVar4 = (zzdf) q0.b(parcel, zzdf.CREATOR);
                Bundle bundle10 = (Bundle) q0.b(parcel, Bundle.CREATOR);
                long readLong28 = parcel.readLong();
                q0.f(parcel);
                onActivityCreatedByScionActivityInfo(zzdfVar4, bundle10, readLong28);
                break;
            case 54:
                zzdf zzdfVar5 = (zzdf) q0.b(parcel, zzdf.CREATOR);
                long readLong29 = parcel.readLong();
                q0.f(parcel);
                onActivityDestroyedByScionActivityInfo(zzdfVar5, readLong29);
                break;
            case 55:
                zzdf zzdfVar6 = (zzdf) q0.b(parcel, zzdf.CREATOR);
                long readLong30 = parcel.readLong();
                q0.f(parcel);
                onActivityPausedByScionActivityInfo(zzdfVar6, readLong30);
                break;
            case 56:
                zzdf zzdfVar7 = (zzdf) q0.b(parcel, zzdf.CREATOR);
                long readLong31 = parcel.readLong();
                q0.f(parcel);
                onActivityResumedByScionActivityInfo(zzdfVar7, readLong31);
                break;
            case 57:
                zzdf zzdfVar8 = (zzdf) q0.b(parcel, zzdf.CREATOR);
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    x1Var2 = queryLocalInterface20 instanceof x1 ? (x1) queryLocalInterface20 : new v1(readStrongBinder20);
                }
                long readLong32 = parcel.readLong();
                q0.f(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(zzdfVar8, x1Var2, readLong32);
                break;
            case 58:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    a2Var = queryLocalInterface21 instanceof a2 ? (a2) queryLocalInterface21 : new y1(readStrongBinder21);
                }
                q0.f(parcel);
                retrieveAndUploadBatches(a2Var);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}

package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class n0 implements Parcelable.Creator<RemoteMessage> {
    public static void c(RemoteMessage remoteMessage, Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.f(parcel, 2, remoteMessage.f8766f, false);
        o9.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public RemoteMessage createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            if (o9.a.n(u8) != 2) {
                o9.a.C(parcel, u8);
            } else {
                bundle = o9.a.b(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new RemoteMessage(bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RemoteMessage[] newArray(int i10) {
        return new RemoteMessage[i10];
    }
}

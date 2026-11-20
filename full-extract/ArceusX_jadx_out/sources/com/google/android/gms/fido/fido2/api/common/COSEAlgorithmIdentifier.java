package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import n9.k;
import n9.m;

/* loaded from: classes.dex */
public class COSEAlgorithmIdentifier implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final com.google.android.gms.fido.fido2.api.common.a f5994a;

    public static class a extends Exception {
        public a(int i10) {
            super("Algorithm with COSE value " + i10 + " not supported");
        }
    }

    public COSEAlgorithmIdentifier(@NonNull com.google.android.gms.fido.fido2.api.common.a aVar) {
        this.f5994a = (com.google.android.gms.fido.fido2.api.common.a) m.l(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static COSEAlgorithmIdentifier a(int i10) {
        ca.b bVar;
        if (i10 == ca.b.LEGACY_RS1.a()) {
            bVar = ca.b.RS1;
        } else {
            ca.b[] values = ca.b.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    for (ca.b bVar2 : ca.a.values()) {
                        if (bVar2.a() == i10) {
                            bVar = bVar2;
                        }
                    }
                    throw new a(i10);
                }
                ca.b bVar3 = values[i11];
                if (bVar3.a() == i10) {
                    bVar = bVar3;
                    break;
                }
                i11++;
            }
        }
        return new COSEAlgorithmIdentifier(bVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.f5994a.a() == ((COSEAlgorithmIdentifier) obj).f5994a.a();
    }

    public int f() {
        return this.f5994a.a();
    }

    public int hashCode() {
        return k.c(this.f5994a);
    }

    @NonNull
    public final String toString() {
        return "COSEAlgorithmIdentifier{algorithm=" + String.valueOf(this.f5994a) + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeInt(this.f5994a.a());
    }
}

package com.google.android.gms.auth.blockstore;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n9.k;

/* loaded from: classes.dex */
public class RetrieveBytesResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RetrieveBytesResponse> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public final Bundle f5716f;

    /* renamed from: g, reason: collision with root package name */
    public final List f5717g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f5718h;

    public static class BlockstoreData extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<BlockstoreData> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        public final byte[] f5719f;

        /* renamed from: g, reason: collision with root package name */
        public final String f5720g;

        public BlockstoreData(byte[] bArr, String str) {
            this.f5719f = bArr;
            this.f5720g = str;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof BlockstoreData)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return Arrays.equals(this.f5719f, ((BlockstoreData) obj).f5719f);
        }

        public int hashCode() {
            return k.c(Integer.valueOf(Arrays.hashCode(this.f5719f)));
        }

        @NonNull
        public byte[] v3() {
            return this.f5719f;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            int a10 = o9.b.a(parcel);
            o9.b.g(parcel, 1, v3(), false);
            o9.b.v(parcel, 2, this.f5720g, false);
            o9.b.b(parcel, a10);
        }

        @NonNull
        public final String zza() {
            return this.f5720g;
        }
    }

    public RetrieveBytesResponse(Bundle bundle, List list) {
        this.f5716f = bundle;
        this.f5717g = list;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BlockstoreData blockstoreData = (BlockstoreData) it.next();
            hashMap.put(blockstoreData.zza(), blockstoreData);
        }
        this.f5718h = hashMap;
    }

    @NonNull
    public Map<String, BlockstoreData> v3() {
        return Collections.unmodifiableMap(this.f5718h);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        Bundle bundle = this.f5716f;
        int a10 = o9.b.a(parcel);
        o9.b.f(parcel, 1, bundle, false);
        o9.b.z(parcel, 2, this.f5717g, false);
        o9.b.b(parcel, a10);
    }
}

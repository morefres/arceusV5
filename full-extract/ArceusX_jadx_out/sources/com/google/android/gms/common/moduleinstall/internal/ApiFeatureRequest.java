package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import k9.h;
import n9.k;
import n9.m;
import o9.b;
import r9.d;
import s9.e;

/* loaded from: classes.dex */
public class ApiFeatureRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new e();

    /* renamed from: j, reason: collision with root package name */
    public static final Comparator f5879j = new Comparator() { // from class: s9.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Feature feature = (Feature) obj;
            Feature feature2 = (Feature) obj2;
            Parcelable.Creator<ApiFeatureRequest> creator = ApiFeatureRequest.CREATOR;
            return !feature.getName().equals(feature2.getName()) ? feature.getName().compareTo(feature2.getName()) : (feature.w3() > feature2.w3() ? 1 : (feature.w3() == feature2.w3() ? 0 : -1));
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public final List f5880f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5881g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5882h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5883i;

    public ApiFeatureRequest(@NonNull List list, boolean z10, String str, String str2) {
        m.l(list);
        this.f5880f = list;
        this.f5881g = z10;
        this.f5882h = str;
        this.f5883i = str2;
    }

    @NonNull
    public static ApiFeatureRequest a(@NonNull d dVar) {
        return w3(dVar.a(), true);
    }

    public static ApiFeatureRequest w3(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(f5879j);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((h) it.next()).getOptionalFeatures());
        }
        return new ApiFeatureRequest(new ArrayList(treeSet), z10, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        return this.f5881g == apiFeatureRequest.f5881g && k.b(this.f5880f, apiFeatureRequest.f5880f) && k.b(this.f5882h, apiFeatureRequest.f5882h) && k.b(this.f5883i, apiFeatureRequest.f5883i);
    }

    public final int hashCode() {
        return k.c(Boolean.valueOf(this.f5881g), this.f5880f, this.f5882h, this.f5883i);
    }

    @NonNull
    public List<Feature> v3() {
        return this.f5880f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.z(parcel, 1, v3(), false);
        b.c(parcel, 2, this.f5881g);
        b.v(parcel, 3, this.f5882h, false);
        b.v(parcel, 4, this.f5883i, false);
        b.b(parcel, a10);
    }
}

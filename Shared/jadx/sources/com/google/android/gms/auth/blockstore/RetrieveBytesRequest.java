package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import e9.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n9.m;

/* loaded from: classes.dex */
public class RetrieveBytesRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RetrieveBytesRequest> CREATOR = new d();

    /* renamed from: f, reason: collision with root package name */
    public final List f5713f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5714g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public List f5715a = new ArrayList();
        public boolean b = false;

        @NonNull
        public RetrieveBytesRequest a() {
            return new RetrieveBytesRequest(this.f5715a, this.b);
        }

        @NonNull
        public a b(@NonNull List<String> list) {
            m.m(list, "Keys cannot be set to null");
            this.f5715a = list;
            return this;
        }
    }

    public RetrieveBytesRequest(List list, boolean z10) {
        if (z10) {
            boolean z11 = true;
            if (list != null && !list.isEmpty()) {
                z11 = false;
            }
            m.q(z11, "retrieveAll was set to true but other constraint(s) was also provided: keys");
        }
        this.f5714g = z10;
        this.f5713f = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                m.g(str, "Element in keys cannot be null or empty");
                this.f5713f.add(str);
            }
        }
    }

    @NonNull
    public List<String> v3() {
        return Collections.unmodifiableList(this.f5713f);
    }

    public boolean w3() {
        return this.f5714g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.x(parcel, 1, v3(), false);
        o9.b.c(parcel, 2, w3());
        o9.b.b(parcel, a10);
    }
}

package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* loaded from: classes.dex */
public final class f9 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f6488a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6489c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6490d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6491e;

    public f9(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, he.f fVar) {
        this.f6488a = uri;
        this.b = "";
        this.f6489c = "";
        this.f6490d = z10;
        this.f6491e = z12;
    }

    public final f9 a() {
        String str = this.b;
        if (str.isEmpty()) {
            return new f9(null, this.f6488a, str, this.f6489c, true, false, this.f6491e, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final f9 b() {
        return new f9(null, this.f6488a, this.b, this.f6489c, this.f6490d, false, true, false, null);
    }

    public final l9 c(String str, long j10) {
        Long valueOf = Long.valueOf(j10);
        Object obj = l9.f6651g;
        return new b9(this, str, valueOf, true);
    }

    public final l9 d(String str, boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        Object obj = l9.f6651g;
        return new c9(this, str, valueOf, true);
    }

    public final l9 e(String str, double d10) {
        Double valueOf = Double.valueOf(-3.0d);
        Object obj = l9.f6651g;
        return new d9(this, "measurement.test.double_flag", valueOf, true);
    }

    public final l9 f(String str, String str2) {
        Object obj = l9.f6651g;
        return new e9(this, str, str2, true);
    }

    public f9(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}

package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class u implements Iterable, q {

    /* renamed from: a, reason: collision with root package name */
    public final String f6867a;

    public u(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f6867a = str;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q a() {
        return new u(this.f6867a);
    }

    public final /* synthetic */ String b() {
        return this.f6867a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x02d6, code lost:
    
        if (r1[r4].isEmpty() == false) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.q e(java.lang.String r26, com.google.android.gms.internal.measurement.u4 r27, java.util.List r28) {
        /*
            Method dump skipped, instructions count: 1608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.u.e(java.lang.String, com.google.android.gms.internal.measurement.u4, java.util.List):com.google.android.gms.internal.measurement.q");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.f6867a.equals(((u) obj).f6867a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6867a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new t(this);
    }

    public final String toString() {
        String str = this.f6867a;
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append("\"");
        sb2.append(str);
        sb2.append("\"");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String zzc() {
        return this.f6867a;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double zzd() {
        String str = this.f6867a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean zze() {
        return Boolean.valueOf(!this.f6867a.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator zzf() {
        return new s(this);
    }
}

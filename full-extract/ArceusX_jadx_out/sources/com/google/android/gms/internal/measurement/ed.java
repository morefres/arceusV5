package com.google.android.gms.internal.measurement;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ed implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f6478a;
    public Object b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hd f6479c;

    public ed(hd hdVar, Comparable comparable, Object obj) {
        Objects.requireNonNull(hdVar);
        this.f6479c = hdVar;
        this.f6478a = comparable;
        this.b = obj;
    }

    public static final boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final Comparable a() {
        return this.f6478a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f6478a.compareTo(((ed) obj).f6478a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return b(this.f6478a, entry.getKey()) && b(this.b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f6478a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f6478a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.b;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f6479c.i();
        Object obj2 = this.b;
        this.b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6478a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append("=");
        sb2.append(valueOf2);
        return sb2.toString();
    }
}

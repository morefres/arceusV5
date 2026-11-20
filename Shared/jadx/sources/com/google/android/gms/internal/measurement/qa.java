package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class qa {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6798a;
    public final int b;

    public qa(Object obj, int i10) {
        this.f6798a = obj;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qa)) {
            return false;
        }
        qa qaVar = (qa) obj;
        return this.f6798a == qaVar.f6798a && this.b == qaVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f6798a) * 65535) + this.b;
    }
}

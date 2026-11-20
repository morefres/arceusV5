package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f6829a;
    public final /* synthetic */ u b;

    public s(u uVar) {
        Objects.requireNonNull(uVar);
        this.b = uVar;
        this.f6829a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6829a < this.b.b().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String b = this.b.b();
        int i10 = this.f6829a;
        if (i10 >= b.length()) {
            throw new NoSuchElementException();
        }
        this.f6829a = i10 + 1;
        return new u(String.valueOf(i10));
    }
}

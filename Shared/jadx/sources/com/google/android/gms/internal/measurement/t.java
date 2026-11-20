package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f6846a;
    public final /* synthetic */ u b;

    public t(u uVar) {
        Objects.requireNonNull(uVar);
        this.b = uVar;
        this.f6846a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6846a < this.b.b().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        u uVar = this.b;
        String b = uVar.b();
        int i10 = this.f6846a;
        if (i10 >= b.length()) {
            throw new NoSuchElementException();
        }
        this.f6846a = i10 + 1;
        return new u(String.valueOf(uVar.b().charAt(i10)));
    }
}

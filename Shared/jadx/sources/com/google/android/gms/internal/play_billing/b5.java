package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class b5 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f7057a;

    public b5(Iterator it) {
        this.f7057a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7057a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f7057a.next();
        return entry.getValue() instanceof d5 ? new a5(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f7057a.remove();
    }
}

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class vb implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f6902a;

    public vb(Iterator it) {
        this.f6902a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6902a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f6902a.next();
        return entry.getValue() instanceof wb ? new ub(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f6902a.remove();
    }
}

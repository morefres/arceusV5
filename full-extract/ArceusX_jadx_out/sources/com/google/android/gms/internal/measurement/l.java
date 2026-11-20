package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class l implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f6642a;

    public l(Iterator it) {
        this.f6642a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6642a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new u((String) this.f6642a.next());
    }
}

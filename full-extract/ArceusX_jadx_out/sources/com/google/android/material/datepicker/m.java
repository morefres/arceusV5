package com.google.android.material.datepicker;

import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public abstract class m<S> extends androidx.fragment.app.c {

    /* renamed from: f0, reason: collision with root package name */
    public final LinkedHashSet<l<S>> f7965f0 = new LinkedHashSet<>();

    public boolean b2(l<S> lVar) {
        return this.f7965f0.add(lVar);
    }

    public void c2() {
        this.f7965f0.clear();
    }
}

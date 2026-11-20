package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public b f6443a;
    public b b;

    /* renamed from: c, reason: collision with root package name */
    public final List f6444c;

    public c() {
        this.f6443a = new b("", 0L, null);
        this.b = new b("", 0L, null);
        this.f6444c = new ArrayList();
    }

    public final b a() {
        return this.f6443a;
    }

    public final void b(b bVar) {
        this.f6443a = bVar;
        this.b = bVar.clone();
        this.f6444c.clear();
    }

    public final b c() {
        return this.b;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        c cVar = new c(this.f6443a.clone());
        Iterator it = this.f6444c.iterator();
        while (it.hasNext()) {
            cVar.f6444c.add(((b) it.next()).clone());
        }
        return cVar;
    }

    public final void d(b bVar) {
        this.b = bVar;
    }

    public final void e(String str, long j10, Map map) {
        HashMap hashMap = new HashMap();
        for (String str2 : map.keySet()) {
            hashMap.put(str2, b.h(str2, this.f6443a.e(str2), map.get(str2)));
        }
        this.f6444c.add(new b(str, j10, hashMap));
    }

    public final List f() {
        return this.f6444c;
    }

    public c(b bVar) {
        this.f6443a = bVar;
        this.b = bVar.clone();
        this.f6444c = new ArrayList();
    }
}

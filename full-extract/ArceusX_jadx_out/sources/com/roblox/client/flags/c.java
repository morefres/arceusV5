package com.roblox.client.flags;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import rh.g;

/* loaded from: classes2.dex */
public class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public HashMap<String, a> f9100a = new HashMap<>();

    @Override // rh.g
    public a O0(String str) {
        return this.f9100a.get(str);
    }

    @Override // rh.g
    public Set<Map.Entry<String, a>> U3() {
        return this.f9100a.entrySet();
    }

    public void Z5(String str, a aVar) {
        this.f9100a.put(str, aVar);
    }
}

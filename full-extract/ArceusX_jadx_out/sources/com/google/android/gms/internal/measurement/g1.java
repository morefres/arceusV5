package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class g1 implements SharedPreferences.Editor {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6500a;
    public final Set b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f6501c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h1 f6502d;

    public /* synthetic */ g1(h1 h1Var, byte[] bArr) {
        Objects.requireNonNull(h1Var);
        this.f6502d = h1Var;
        this.f6500a = false;
        this.b = new HashSet();
        this.f6501c = new HashMap();
    }

    public final void a(String str, Object obj) {
        if (obj != null) {
            this.f6501c.put(str, obj);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f6500a = true;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        if (this.f6500a) {
            this.f6502d.a().clear();
        }
        h1 h1Var = this.f6502d;
        Set set = this.b;
        h1Var.a().keySet().removeAll(set);
        Map map = this.f6501c;
        for (Map.Entry entry : map.entrySet()) {
            h1Var.a().put((String) entry.getKey(), entry.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : h1Var.b()) {
            ie.y0 it = ie.t0.d(set, map.keySet()).iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(h1Var, (String) it.next());
            }
        }
        return (!this.f6500a && set.isEmpty() && map.isEmpty()) ? false : true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z10) {
        a(str, Boolean.valueOf(z10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f10) {
        a(str, Float.valueOf(f10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i10) {
        a(str, Integer.valueOf(i10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j10) {
        a(str, Long.valueOf(j10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        a(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.b.add(str);
        return this;
    }
}

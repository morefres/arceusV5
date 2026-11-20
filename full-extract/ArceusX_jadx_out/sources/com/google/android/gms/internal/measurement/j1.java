package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f6594a = new i1();

    public static SharedPreferences a(Context context, String str, int i10, e1 e1Var) {
        y0.a();
        h1 h1Var = str.equals("") ? new h1() : null;
        if (h1Var != null) {
            return h1Var;
        }
        ThreadLocal threadLocal = f6594a;
        he.n.d(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            threadLocal.set(Boolean.TRUE);
            return sharedPreferences;
        } catch (Throwable th2) {
            f6594a.set(Boolean.TRUE);
            throw th2;
        }
    }
}

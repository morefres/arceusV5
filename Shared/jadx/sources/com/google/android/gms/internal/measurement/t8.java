package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* loaded from: classes.dex */
public interface t8 {
    static Object a(s8 s8Var) {
        try {
            return s8Var.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return s8Var.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    Object b(String str);
}

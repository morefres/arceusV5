package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* loaded from: classes.dex */
public final class w8 implements t8 {

    /* renamed from: d, reason: collision with root package name */
    public static w8 f6911d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f6912a;
    public final ContentObserver b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6913c;

    public w8() {
        this.f6913c = false;
        this.f6912a = null;
        this.b = null;
    }

    public static w8 c(Context context) {
        w8 w8Var;
        synchronized (w8.class) {
            try {
                if (f6911d == null) {
                    f6911d = l2.g.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new w8(context) : new w8();
                }
                w8 w8Var2 = f6911d;
                if (w8Var2 != null && w8Var2.b != null && !w8Var2.f6913c) {
                    try {
                        context.getContentResolver().registerContentObserver(e8.f6474a, true, f6911d.b);
                        ((w8) he.n.l(f6911d)).f6913c = true;
                    } catch (SecurityException e10) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e10);
                    }
                }
                w8Var = (w8) he.n.l(f6911d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return w8Var;
    }

    public static synchronized void e() {
        Context context;
        synchronized (w8.class) {
            try {
                w8 w8Var = f6911d;
                if (w8Var != null && (context = w8Var.f6912a) != null && w8Var.b != null && w8Var.f6913c) {
                    context.getContentResolver().unregisterContentObserver(f6911d.b);
                }
                f6911d = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.t8
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String b(final String str) {
        Context context = this.f6912a;
        if (context != null && !k8.b(context)) {
            try {
                return (String) t8.a(new s8() { // from class: com.google.android.gms.internal.measurement.v8
                    @Override // com.google.android.gms.internal.measurement.s8
                    public final /* synthetic */ Object zza() {
                        return w8.this.f(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e10);
            }
        }
        return null;
    }

    public final /* synthetic */ String f(String str) {
        return d8.a(((Context) he.n.l(this.f6912a)).getContentResolver(), str, null);
    }

    public w8(Context context) {
        this.f6913c = false;
        this.f6912a = context;
        this.b = new u8(this, null);
    }
}

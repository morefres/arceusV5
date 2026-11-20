package be;

import android.content.Context;
import android.util.Log;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class l implements ae.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3980a;
    public final zd.f b;

    /* renamed from: c, reason: collision with root package name */
    public final n f3981c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f3982d;

    /* renamed from: e, reason: collision with root package name */
    public final zd.t f3983e;

    public l(Context context, Executor executor, n nVar, zd.f fVar, zd.t tVar) {
        this.f3980a = context;
        this.b = fVar;
        this.f3981c = nVar;
        this.f3982d = executor;
        this.f3983e = tVar;
    }

    public static /* bridge */ /* synthetic */ void c(l lVar, List list, ae.i0 i0Var) {
        Integer e10 = lVar.e(list);
        if (e10 == null) {
            return;
        }
        if (e10.intValue() == 0) {
            i0Var.zzc();
        } else {
            i0Var.a(e10.intValue());
        }
    }

    public static /* bridge */ /* synthetic */ void d(l lVar, ae.i0 i0Var) {
        try {
            if (zd.a.f(n0.a(lVar.f3980a))) {
                Log.i("SplitCompat", "Splits installed.");
                i0Var.zza();
            } else {
                Log.e("SplitCompat", "Emulating splits failed.");
                i0Var.a(-12);
            }
        } catch (Exception e10) {
            Log.e("SplitCompat", "Error emulating splits.", e10);
            i0Var.a(-12);
        }
    }

    @Override // ae.k0
    public final void a(List list, ae.i0 i0Var) {
        if (!zd.a.g()) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.f3982d.execute(new k(this, list, i0Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x006c, code lost:
    
        if (r7.exists() == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014f A[Catch: Exception -> 0x014a, TRY_LEAVE, TryCatch #4 {Exception -> 0x014a, blocks: (B:3:0x0004, B:9:0x014f, B:107:0x014c, B:112:0x0146, B:109:0x0141, B:6:0x0016, B:13:0x0021, B:14:0x002a, B:16:0x0031, B:55:0x00b5, B:64:0x00c7, B:69:0x00c4, B:71:0x00c8, B:73:0x00cd, B:76:0x00d9, B:78:0x00e1, B:81:0x00e9, B:82:0x00f7, B:84:0x00fb, B:86:0x010e, B:87:0x0137, B:90:0x0114, B:93:0x011d, B:97:0x0124, B:100:0x012b, B:102:0x0131), top: B:2:0x0004, inners: #1, #12 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer e(java.util.List r13) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: be.l.e(java.util.List):java.lang.Integer");
    }
}

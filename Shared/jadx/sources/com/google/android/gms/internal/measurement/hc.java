package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class hc {

    /* renamed from: a, reason: collision with root package name */
    public final gc f6522a;

    public hc(wd wdVar, Object obj, wd wdVar2, Object obj2) {
        this.f6522a = new gc(wdVar, "", wdVar2, "");
    }

    public static hc a(wd wdVar, Object obj, wd wdVar2, Object obj2) {
        return new hc(wdVar, "", wdVar2, "");
    }

    public static void b(ma maVar, gc gcVar, Object obj, Object obj2) {
        wa.f(maVar, gcVar.f6507a, 1, obj);
        wa.f(maVar, gcVar.f6508c, 2, obj2);
    }

    public static int c(gc gcVar, Object obj, Object obj2) {
        return wa.h(gcVar.f6507a, 1, obj) + wa.h(gcVar.f6508c, 2, obj2);
    }

    public final int d(int i10, Object obj, Object obj2) {
        gc gcVar = this.f6522a;
        int G = ma.G(i10 << 3);
        int c10 = c(gcVar, obj, obj2);
        return G + ma.G(c10) + c10;
    }

    public final gc e() {
        return this.f6522a;
    }
}

package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class ma extends y9 {
    public static final Logger b = Logger.getLogger(ma.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f6672c = sd.f();

    /* renamed from: a, reason: collision with root package name */
    public na f6673a;

    public ma() {
        throw null;
    }

    public static int G(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int a(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int b(String str) {
        int length;
        try {
            length = vd.b(str);
        } catch (ud unused) {
            length = str.getBytes(qb.f6799a).length;
        }
        return G(length) + length;
    }

    public static int c(oc ocVar) {
        int a10 = ocVar.a();
        return G(a10) + a10;
    }

    public static int d(oc ocVar, zc zcVar) {
        int g10 = ((r9) ocVar).g(zcVar);
        return G(g10) + g10;
    }

    @Deprecated
    public static int g(int i10, oc ocVar, zc zcVar) {
        int G = G(i10 << 3);
        return G + G + ((r9) ocVar).g(zcVar);
    }

    public abstract void A(int i10);

    public abstract void B(long j10);

    public abstract void C(long j10);

    public abstract void D(byte[] bArr, int i10, int i11);

    public abstract void E(String str);

    public abstract int F();

    public final void e() {
        if (F() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void f(String str, ud udVar) {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) udVar);
        byte[] bytes = str.getBytes(qb.f6799a);
        try {
            int length = bytes.length;
            z(length);
            D(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new la(e10);
        }
    }

    public abstract void i(int i10, int i11);

    public abstract void j(int i10, int i11);

    public abstract void k(int i10, int i11);

    public abstract void l(int i10, int i11);

    public abstract void m(int i10, long j10);

    public abstract void n(int i10, long j10);

    public abstract void o(int i10, boolean z10);

    public abstract void p(int i10, String str);

    public abstract void q(int i10, ha haVar);

    public abstract void r(ha haVar);

    public abstract void s(byte[] bArr, int i10, int i11);

    public abstract void t(int i10, oc ocVar, zc zcVar);

    public abstract void u(int i10, oc ocVar);

    public abstract void v(int i10, ha haVar);

    public abstract void w(oc ocVar);

    public abstract void x(byte b10);

    public abstract void y(int i10);

    public abstract void z(int i10);

    public /* synthetic */ ma(byte[] bArr) {
    }
}

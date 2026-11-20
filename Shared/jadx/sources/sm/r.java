package sm;

import wu.r0;
import wu.s0;

/* loaded from: classes2.dex */
public final class r implements r0 {

    /* renamed from: h, reason: collision with root package name */
    public static final wu.h f31489h = wu.h.e("[]{}\"'/#");

    /* renamed from: i, reason: collision with root package name */
    public static final wu.h f31490i = wu.h.e("'\\");

    /* renamed from: j, reason: collision with root package name */
    public static final wu.h f31491j = wu.h.e("\"\\");

    /* renamed from: k, reason: collision with root package name */
    public static final wu.h f31492k = wu.h.e("\r\n");

    /* renamed from: l, reason: collision with root package name */
    public static final wu.h f31493l = wu.h.e("*");

    /* renamed from: m, reason: collision with root package name */
    public static final wu.h f31494m = wu.h.f34820e;

    /* renamed from: a, reason: collision with root package name */
    public final wu.g f31495a;
    public final wu.e b;

    /* renamed from: c, reason: collision with root package name */
    public final wu.e f31496c;

    /* renamed from: d, reason: collision with root package name */
    public wu.h f31497d;

    /* renamed from: e, reason: collision with root package name */
    public int f31498e;

    /* renamed from: f, reason: collision with root package name */
    public long f31499f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f31500g = false;

    public r(wu.g gVar, wu.e eVar, wu.h hVar, int i10) {
        this.f31495a = gVar;
        this.b = gVar.k();
        this.f31496c = eVar;
        this.f31497d = hVar;
        this.f31498e = i10;
    }

    public final void a(long j10) {
        while (true) {
            long j11 = this.f31499f;
            if (j11 >= j10) {
                return;
            }
            wu.h hVar = this.f31497d;
            wu.h hVar2 = f31494m;
            if (hVar == hVar2) {
                return;
            }
            if (j11 == this.b.getSize()) {
                if (this.f31499f > 0) {
                    return;
                } else {
                    this.f31495a.v1(1L);
                }
            }
            long q10 = this.b.q(this.f31497d, this.f31499f);
            if (q10 == -1) {
                this.f31499f = this.b.getSize();
            } else {
                byte j12 = this.b.j(q10);
                wu.h hVar3 = this.f31497d;
                wu.h hVar4 = f31489h;
                if (hVar3 == hVar4) {
                    if (j12 == 34) {
                        this.f31497d = f31491j;
                        this.f31499f = q10 + 1;
                    } else if (j12 == 35) {
                        this.f31497d = f31492k;
                        this.f31499f = q10 + 1;
                    } else if (j12 == 39) {
                        this.f31497d = f31490i;
                        this.f31499f = q10 + 1;
                    } else if (j12 != 47) {
                        if (j12 != 91) {
                            if (j12 != 93) {
                                if (j12 != 123) {
                                    if (j12 != 125) {
                                    }
                                }
                            }
                            int i10 = this.f31498e - 1;
                            this.f31498e = i10;
                            if (i10 == 0) {
                                this.f31497d = hVar2;
                            }
                            this.f31499f = q10 + 1;
                        }
                        this.f31498e++;
                        this.f31499f = q10 + 1;
                    } else {
                        long j13 = 2 + q10;
                        this.f31495a.v1(j13);
                        long j14 = q10 + 1;
                        byte j15 = this.b.j(j14);
                        if (j15 == 47) {
                            this.f31497d = f31492k;
                            this.f31499f = j13;
                        } else if (j15 == 42) {
                            this.f31497d = f31493l;
                            this.f31499f = j13;
                        } else {
                            this.f31499f = j14;
                        }
                    }
                } else if (hVar3 == f31490i || hVar3 == f31491j) {
                    if (j12 == 92) {
                        long j16 = q10 + 2;
                        this.f31495a.v1(j16);
                        this.f31499f = j16;
                    } else {
                        if (this.f31498e > 0) {
                            hVar2 = hVar4;
                        }
                        this.f31497d = hVar2;
                        this.f31499f = q10 + 1;
                    }
                } else if (hVar3 == f31493l) {
                    long j17 = 2 + q10;
                    this.f31495a.v1(j17);
                    long j18 = q10 + 1;
                    if (this.b.j(j18) == 47) {
                        this.f31499f = j17;
                        this.f31497d = hVar4;
                    } else {
                        this.f31499f = j18;
                    }
                } else {
                    if (hVar3 != f31492k) {
                        throw new AssertionError();
                    }
                    this.f31499f = q10 + 1;
                    this.f31497d = hVar4;
                }
            }
        }
    }

    public void b() {
        this.f31500g = true;
        while (this.f31497d != f31494m) {
            a(8192L);
            this.f31495a.skip(this.f31499f);
        }
    }

    @Override // wu.r0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f31500g = true;
    }

    @Override // wu.r0
    public long read(wu.e eVar, long j10) {
        if (this.f31500g) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        if (!this.f31496c.X1()) {
            long read = this.f31496c.read(eVar, j10);
            long j11 = j10 - read;
            if (!this.b.X1()) {
                long read2 = read(eVar, j11);
                if (read2 != -1) {
                    return read2 + read;
                }
            }
            return read;
        }
        a(j10);
        long j12 = this.f31499f;
        if (j12 == 0) {
            if (this.f31497d == f31494m) {
                return -1L;
            }
            throw new AssertionError();
        }
        long min = Math.min(j10, j12);
        eVar.write(this.b, min);
        this.f31499f -= min;
        return min;
    }

    @Override // wu.r0
    /* renamed from: timeout */
    public s0 getTimeout() {
        return this.f31495a.getTimeout();
    }
}

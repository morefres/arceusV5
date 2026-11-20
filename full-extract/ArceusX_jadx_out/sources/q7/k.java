package q7;

import r7.c;

/* loaded from: classes3.dex */
public class k {

    /* renamed from: f, reason: collision with root package name */
    public static final c.a f29574f = c.a.a("ef");

    /* renamed from: g, reason: collision with root package name */
    public static final c.a f29575g = c.a.a("nm", "v");

    /* renamed from: a, reason: collision with root package name */
    public m7.a f29576a;
    public m7.b b;

    /* renamed from: c, reason: collision with root package name */
    public m7.b f29577c;

    /* renamed from: d, reason: collision with root package name */
    public m7.b f29578d;

    /* renamed from: e, reason: collision with root package name */
    public m7.b f29579e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0052, code lost:
    
        if (r0.equals("Opacity") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(r7.c r6, f7.i r7) {
        /*
            r5 = this;
            r6.c()
            java.lang.String r0 = ""
        L5:
            boolean r1 = r6.f()
            if (r1 == 0) goto L90
            r7.c$a r1 = q7.k.f29575g
            int r1 = r6.r(r1)
            if (r1 == 0) goto L8a
            r2 = 1
            if (r1 == r2) goto L1d
            r6.s()
            r6.u()
            goto L5
        L1d:
            r0.getClass()
            int r1 = r0.hashCode()
            r3 = 0
            r4 = -1
            switch(r1) {
                case 353103893: goto L55;
                case 397447147: goto L4c;
                case 1041377119: goto L41;
                case 1379387491: goto L36;
                case 1383710113: goto L2b;
                default: goto L29;
            }
        L29:
            r2 = r4
            goto L5f
        L2b:
            java.lang.String r1 = "Softness"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L34
            goto L29
        L34:
            r2 = 4
            goto L5f
        L36:
            java.lang.String r1 = "Shadow Color"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L3f
            goto L29
        L3f:
            r2 = 3
            goto L5f
        L41:
            java.lang.String r1 = "Direction"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L4a
            goto L29
        L4a:
            r2 = 2
            goto L5f
        L4c:
            java.lang.String r1 = "Opacity"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L5f
            goto L29
        L55:
            java.lang.String r1 = "Distance"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L5e
            goto L29
        L5e:
            r2 = r3
        L5f:
            switch(r2) {
                case 0: goto L82;
                case 1: goto L7b;
                case 2: goto L74;
                case 3: goto L6d;
                case 4: goto L66;
                default: goto L62;
            }
        L62:
            r6.u()
            goto L5
        L66:
            m7.b r1 = q7.d.e(r6, r7)
            r5.f29579e = r1
            goto L5
        L6d:
            m7.a r1 = q7.d.c(r6, r7)
            r5.f29576a = r1
            goto L5
        L74:
            m7.b r1 = q7.d.f(r6, r7, r3)
            r5.f29577c = r1
            goto L5
        L7b:
            m7.b r1 = q7.d.f(r6, r7, r3)
            r5.b = r1
            goto L5
        L82:
            m7.b r1 = q7.d.e(r6, r7)
            r5.f29578d = r1
            goto L5
        L8a:
            java.lang.String r0 = r6.m()
            goto L5
        L90:
            r6.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.k.a(r7.c, f7.i):void");
    }

    public j b(r7.c cVar, f7.i iVar) {
        m7.b bVar;
        m7.b bVar2;
        m7.b bVar3;
        m7.b bVar4;
        while (cVar.f()) {
            if (cVar.r(f29574f) != 0) {
                cVar.s();
                cVar.u();
            } else {
                cVar.b();
                while (cVar.f()) {
                    a(cVar, iVar);
                }
                cVar.d();
            }
        }
        m7.a aVar = this.f29576a;
        if (aVar == null || (bVar = this.b) == null || (bVar2 = this.f29577c) == null || (bVar3 = this.f29578d) == null || (bVar4 = this.f29579e) == null) {
            return null;
        }
        return new j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}

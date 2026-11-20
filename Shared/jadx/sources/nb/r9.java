package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class r9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.x1 f26633a;
    public final /* synthetic */ qa b;

    public r9(qa qaVar, com.google.android.gms.internal.measurement.x1 x1Var) {
        this.f26633a = x1Var;
        Objects.requireNonNull(qaVar);
        this.b = qaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            nb.qa r0 = r8.b
            nb.g7 r1 = r0.f26328a
            nb.ld r1 = r1.z()
            nb.g7 r1 = r1.f26328a
            nb.k6 r2 = r1.x()
            nb.q8 r2 = r2.w()
            nb.p8 r3 = nb.p8.ANALYTICS_STORAGE
            boolean r2 = r2.o(r3)
            r3 = 0
            if (r2 != 0) goto L2a
            nb.w5 r1 = r1.a()
            nb.u5 r1 = r1.t()
            java.lang.String r2 = "Analytics storage consent denied; will not get session id"
            r1.a(r2)
        L28:
            r1 = r3
            goto L5b
        L2a:
            nb.k6 r2 = r1.x()
            u9.e r4 = r1.e()
            long r4 = r4.a()
            boolean r2 = r2.A(r4)
            if (r2 != 0) goto L28
            nb.k6 r2 = r1.x()
            nb.h6 r2 = r2.f26386r
            long r4 = r2.a()
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L4d
            goto L28
        L4d:
            nb.k6 r1 = r1.x()
            nb.h6 r1 = r1.f26386r
            long r1 = r1.a()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L5b:
            if (r1 == 0) goto L6d
            nb.g7 r0 = r0.f26328a
            com.google.android.gms.internal.measurement.x1 r2 = r8.f26633a
            nb.ve r0 = r0.C()
            long r3 = r1.longValue()
            r0.b0(r2, r3)
            return
        L6d:
            com.google.android.gms.internal.measurement.x1 r0 = r8.f26633a     // Catch: android.os.RemoteException -> L73
            r0.l(r3)     // Catch: android.os.RemoteException -> L73
            return
        L73:
            r0 = move-exception
            nb.qa r1 = r8.b
            nb.g7 r1 = r1.f26328a
            nb.w5 r1 = r1.a()
            nb.u5 r1 = r1.o()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.r9.run():void");
    }
}

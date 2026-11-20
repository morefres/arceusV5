package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class l9 {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f6651g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static volatile g9 f6652h;

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicInteger f6653i;

    /* renamed from: a, reason: collision with root package name */
    public final f9 f6654a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6655c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f6656d = -1;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f6657e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f6658f;

    static {
        new AtomicReference();
        he.n.m(new Object() { // from class: com.google.android.gms.internal.measurement.j9
        }, "BuildInfo must be non-null");
        f6653i = new AtomicInteger();
    }

    public /* synthetic */ l9(f9 f9Var, String str, Object obj, boolean z10, byte[] bArr) {
        if (f9Var.f6488a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f6654a = f9Var;
        this.b = str;
        this.f6655c = obj;
        this.f6658f = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004c, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(final android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.g9 r0 = com.google.android.gms.internal.measurement.l9.f6652h
            if (r0 != 0) goto L4d
            if (r3 != 0) goto L7
            goto L4d
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.measurement.l9.f6651g
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.g9 r1 = com.google.android.gms.internal.measurement.l9.f6652h     // Catch: java.lang.Throwable -> L47
            if (r1 != 0) goto L49
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.g9 r1 = com.google.android.gms.internal.measurement.l9.f6652h     // Catch: java.lang.Throwable -> L21
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L18
            r3 = r2
        L18:
            if (r1 == 0) goto L23
            android.content.Context r2 = r1.a()     // Catch: java.lang.Throwable -> L21
            if (r2 == r3) goto L43
            goto L23
        L21:
            r3 = move-exception
            goto L45
        L23:
            if (r1 == 0) goto L2e
            com.google.android.gms.internal.measurement.p8.f()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.n9.d()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.w8.e()     // Catch: java.lang.Throwable -> L21
        L2e:
            com.google.android.gms.internal.measurement.k9 r1 = new com.google.android.gms.internal.measurement.k9     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            he.s r1 = he.t.a(r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.l8 r2 = new com.google.android.gms.internal.measurement.l8     // Catch: java.lang.Throwable -> L21
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.l9.f6652h = r2     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.internal.measurement.l9.f6653i     // Catch: java.lang.Throwable -> L21
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L21
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            goto L49
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r3     // Catch: java.lang.Throwable -> L47
        L47:
            r3 = move-exception
            goto L4b
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            return
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r3
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.l9.b(android.content.Context):void");
    }

    public static void c() {
        f6653i.incrementAndGet();
    }

    public abstract Object a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:16:0x0050, B:18:0x005b, B:20:0x0065, B:22:0x0088, B:24:0x0090, B:27:0x00b7, B:30:0x00bf, B:31:0x00c2, B:32:0x00c6, B:33:0x0099, B:35:0x009d, B:37:0x00ad, B:39:0x00b3, B:43:0x0076, B:46:0x00ca), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:16:0x0050, B:18:0x005b, B:20:0x0065, B:22:0x0088, B:24:0x0090, B:27:0x00b7, B:30:0x00bf, B:31:0x00c2, B:32:0x00c6, B:33:0x0099, B:35:0x009d, B:37:0x00ad, B:39:0x00b3, B:43:0x0076, B:46:0x00ca), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:16:0x0050, B:18:0x005b, B:20:0x0065, B:22:0x0088, B:24:0x0090, B:27:0x00b7, B:30:0x00bf, B:31:0x00c2, B:32:0x00c6, B:33:0x0099, B:35:0x009d, B:37:0x00ad, B:39:0x00b3, B:43:0x0076, B:46:0x00ca), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.l9.f6653i
            int r0 = r0.get()
            int r1 = r9.f6656d
            if (r1 >= r0) goto Lce
            monitor-enter(r9)
            int r1 = r9.f6656d     // Catch: java.lang.Throwable -> L47
            if (r1 >= r0) goto Lca
            com.google.android.gms.internal.measurement.g9 r1 = com.google.android.gms.internal.measurement.l9.f6652h     // Catch: java.lang.Throwable -> L47
            he.k r2 = he.k.a()     // Catch: java.lang.Throwable -> L47
            r3 = 0
            if (r1 == 0) goto L4a
            he.s r4 = r1.b()     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L4a
            he.s r2 = r1.b()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r2 = he.n.l(r2)     // Catch: java.lang.Throwable -> L47
            he.s r2 = (he.s) r2     // Catch: java.lang.Throwable -> L47
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L47
            he.k r2 = (he.k) r2     // Catch: java.lang.Throwable -> L47
            boolean r4 = r2.c()     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r2.b()     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.r8 r4 = (com.google.android.gms.internal.measurement.r8) r4     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.f9 r5 = r9.f6654a     // Catch: java.lang.Throwable -> L47
            android.net.Uri r6 = r5.f6488a     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = r5.f6489c     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = r9.b     // Catch: java.lang.Throwable -> L47
            java.lang.String r4 = r4.a(r6, r3, r5, r7)     // Catch: java.lang.Throwable -> L47
            goto L4b
        L47:
            r0 = move-exception
            goto Lcc
        L4a:
            r4 = r3
        L4b:
            if (r1 == 0) goto L4f
            r5 = 1
            goto L50
        L4f:
            r5 = 0
        L50:
            java.lang.String r6 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            he.n.s(r5, r6)     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.f9 r5 = r9.f6654a     // Catch: java.lang.Throwable -> L47
            android.net.Uri r6 = r5.f6488a     // Catch: java.lang.Throwable -> L47
            if (r6 == 0) goto L76
            android.content.Context r7 = r1.a()     // Catch: java.lang.Throwable -> L47
            boolean r7 = com.google.android.gms.internal.measurement.z8.a(r7, r6)     // Catch: java.lang.Throwable -> L47
            if (r7 == 0) goto L74
            android.content.Context r7 = r1.a()     // Catch: java.lang.Throwable -> L47
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.i9 r8 = new java.lang.Runnable() { // from class: com.google.android.gms.internal.measurement.i9
                static {
                    /*
                        com.google.android.gms.internal.measurement.i9 r0 = new com.google.android.gms.internal.measurement.i9
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.google.android.gms.internal.measurement.i9) com.google.android.gms.internal.measurement.i9.a com.google.android.gms.internal.measurement.i9
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.i9.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.i9.<init>():void");
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    /*
                        r0 = this;
                        com.google.android.gms.internal.measurement.l9.c()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.i9.run():void");
                }
            }     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.p8 r6 = com.google.android.gms.internal.measurement.p8.c(r7, r6, r8)     // Catch: java.lang.Throwable -> L47
            goto L86
        L74:
            r6 = r3
            goto L86
        L76:
            android.content.Context r6 = r1.a()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r7 = he.n.l(r3)     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.h9 r8 = new java.lang.Runnable() { // from class: com.google.android.gms.internal.measurement.h9
                static {
                    /*
                        com.google.android.gms.internal.measurement.h9 r0 = new com.google.android.gms.internal.measurement.h9
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.google.android.gms.internal.measurement.h9) com.google.android.gms.internal.measurement.h9.a com.google.android.gms.internal.measurement.h9
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.h9.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.h9.<init>():void");
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    /*
                        r0 = this;
                        com.google.android.gms.internal.measurement.l9.c()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.h9.run():void");
                }
            }     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.n9 r6 = com.google.android.gms.internal.measurement.n9.c(r6, r7, r8)     // Catch: java.lang.Throwable -> L47
        L86:
            if (r6 == 0) goto L95
            java.lang.String r7 = r9.b     // Catch: java.lang.Throwable -> L47
            java.lang.Object r6 = r6.b(r7)     // Catch: java.lang.Throwable -> L47
            if (r6 == 0) goto L95
            java.lang.Object r6 = r9.a(r6)     // Catch: java.lang.Throwable -> L47
            goto L96
        L95:
            r6 = r3
        L96:
            if (r6 == 0) goto L99
            goto Lb7
        L99:
            boolean r5 = r5.f6490d     // Catch: java.lang.Throwable -> L47
            if (r5 != 0) goto Lb1
            android.content.Context r1 = r1.a()     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.w8 r1 = com.google.android.gms.internal.measurement.w8.c(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = r9.b     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = r1.b(r5)     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto Lb1
            java.lang.Object r3 = r9.a(r1)     // Catch: java.lang.Throwable -> L47
        Lb1:
            if (r3 != 0) goto Lb6
            java.lang.Object r6 = r9.f6655c     // Catch: java.lang.Throwable -> L47
            goto Lb7
        Lb6:
            r6 = r3
        Lb7:
            boolean r1 = r2.c()     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto Lc6
            if (r4 != 0) goto Lc2
            java.lang.Object r6 = r9.f6655c     // Catch: java.lang.Throwable -> L47
            goto Lc6
        Lc2:
            java.lang.Object r6 = r9.a(r4)     // Catch: java.lang.Throwable -> L47
        Lc6:
            r9.f6657e = r6     // Catch: java.lang.Throwable -> L47
            r9.f6656d = r0     // Catch: java.lang.Throwable -> L47
        Lca:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L47
            goto Lce
        Lcc:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L47
            throw r0
        Lce:
            java.lang.Object r0 = r9.f6657e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.l9.d():java.lang.Object");
    }
}

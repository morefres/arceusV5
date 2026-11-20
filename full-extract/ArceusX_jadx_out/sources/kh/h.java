package kh;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aH\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a6\u0010\r\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@¢\u0006\u0004\b\r\u0010\t\u001a6\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@¢\u0006\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"T", "", "tag", "Lkotlin/Function1;", "Lmt/b;", "", "", "getFunc", ve.a.f33391e, "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lmt/b;)Ljava/lang/Object;", "", "insertFunc", "", j6.b.f21518e, "func", "c", "database_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class h {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.db.dao.DaoExtensionsKt", f = "DaoExtensions.kt", l = {9}, m = "safeGetList", v = 1)
    public static final class a<T> extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f22643t;

        /* renamed from: u, reason: collision with root package name */
        public Object f22644u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f22645v;

        /* renamed from: w, reason: collision with root package name */
        public int f22646w;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22645v = obj;
            this.f22646w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return h.a(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.db.dao.DaoExtensionsKt", f = "DaoExtensions.kt", l = {MotionEventCompat.AXIS_BRAKE}, m = "safeInsert", v = 1)
    public static final class b extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f22647t;

        /* renamed from: u, reason: collision with root package name */
        public Object f22648u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f22649v;

        /* renamed from: w, reason: collision with root package name */
        public int f22650w;

        public b(mt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22649v = obj;
            this.f22650w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return h.b(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.db.dao.DaoExtensionsKt", f = "DaoExtensions.kt", l = {40}, m = "safeSqlInvoke", v = 1)
    public static final class c extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f22651t;

        /* renamed from: u, reason: collision with root package name */
        public Object f22652u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f22653v;

        /* renamed from: w, reason: collision with root package name */
        public int f22654w;

        public c(mt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22653v = obj;
            this.f22654w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return h.c(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super mt.b<? super java.util.List<? extends T>>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull mt.b<? super java.util.List<? extends T>> r6) {
        /*
            boolean r0 = r6 instanceof kh.h.a
            if (r0 == 0) goto L13
            r0 = r6
            kh.h$a r0 = (kh.h.a) r0
            int r1 = r0.f22646w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22646w = r1
            goto L18
        L13:
            kh.h$a r0 = new kh.h$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f22645v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f22646w
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f22644u
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            java.lang.Object r4 = r0.f22643t
            java.lang.String r4 = (java.lang.String) r4
            gt.o.b(r6)     // Catch: android.database.sqlite.SQLiteDiskIOException -> L31
            return r6
        L31:
            r5 = move-exception
            goto L50
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            gt.o.b(r6)
            r0.f22643t = r4     // Catch: android.database.sqlite.SQLiteDiskIOException -> L31
            java.lang.Object r6 = ot.l.a(r5)     // Catch: android.database.sqlite.SQLiteDiskIOException -> L31
            r0.f22644u = r6     // Catch: android.database.sqlite.SQLiteDiskIOException -> L31
            r0.f22646w = r3     // Catch: android.database.sqlite.SQLiteDiskIOException -> L31
            java.lang.Object r4 = r5.invoke(r0)     // Catch: android.database.sqlite.SQLiteDiskIOException -> L31
            if (r4 != r1) goto L4f
            return r1
        L4f:
            return r4
        L50:
            java.lang.String r6 = "Ran into IOException. Failed to get."
            ek.q.f(r4, r6, r5)
            java.util.List r4 = kotlin.collections.p.k()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.h.a(java.lang.String, kotlin.jvm.functions.Function1, mt.b):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Boolean, java.lang.Object] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super mt.b<? super kotlin.Unit>, ? extends java.lang.Object> r6, @org.jetbrains.annotations.NotNull mt.b<? super java.lang.Boolean> r7) {
        /*
            boolean r0 = r7 instanceof kh.h.b
            if (r0 == 0) goto L13
            r0 = r7
            kh.h$b r0 = (kh.h.b) r0
            int r1 = r0.f22650w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22650w = r1
            goto L18
        L13:
            kh.h$b r0 = new kh.h$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f22649v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f22650w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 != r4) goto L36
            java.lang.Object r5 = r0.f22648u
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            java.lang.Object r5 = r0.f22647t
            java.lang.String r5 = (java.lang.String) r5
            gt.o.b(r7)     // Catch: android.database.sqlite.SQLiteDiskIOException -> L32 android.database.sqlite.SQLiteFullException -> L34
            goto L52
        L32:
            r6 = move-exception
            goto L57
        L34:
            r6 = move-exception
            goto L61
        L36:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3e:
            gt.o.b(r7)
            r0.f22647t = r5     // Catch: android.database.sqlite.SQLiteDiskIOException -> L32 android.database.sqlite.SQLiteFullException -> L34
            java.lang.Object r7 = ot.l.a(r6)     // Catch: android.database.sqlite.SQLiteDiskIOException -> L32 android.database.sqlite.SQLiteFullException -> L34
            r0.f22648u = r7     // Catch: android.database.sqlite.SQLiteDiskIOException -> L32 android.database.sqlite.SQLiteFullException -> L34
            r0.f22650w = r4     // Catch: android.database.sqlite.SQLiteDiskIOException -> L32 android.database.sqlite.SQLiteFullException -> L34
            java.lang.Object r5 = r6.invoke(r0)     // Catch: android.database.sqlite.SQLiteDiskIOException -> L32 android.database.sqlite.SQLiteFullException -> L34
            if (r5 != r1) goto L52
            return r1
        L52:
            java.lang.Boolean r5 = ot.b.a(r4)
            return r5
        L57:
            java.lang.String r7 = "Ran into IOException. Failed to insert"
            ek.q.f(r5, r7, r6)
            java.lang.Boolean r5 = ot.b.a(r3)
            return r5
        L61:
            java.lang.String r7 = "Database is full. Failed to insert."
            ek.q.f(r5, r7, r6)
            java.lang.Boolean r5 = ot.b.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.h.b(java.lang.String, kotlin.jvm.functions.Function1, mt.b):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        ek.q.f(r4, "Failed to invoke SQL in database.", r5);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super mt.b<? super kotlin.Unit>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull mt.b<? super kotlin.Unit> r6) {
        /*
            boolean r0 = r6 instanceof kh.h.c
            if (r0 == 0) goto L13
            r0 = r6
            kh.h$c r0 = (kh.h.c) r0
            int r1 = r0.f22654w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22654w = r1
            goto L18
        L13:
            kh.h$c r0 = new kh.h$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f22653v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f22654w
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f22652u
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            java.lang.Object r4 = r0.f22651t
            java.lang.String r4 = (java.lang.String) r4
            gt.o.b(r6)     // Catch: android.database.sqlite.SQLiteFullException -> L31
            goto L54
        L31:
            r5 = move-exception
            goto L4f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            gt.o.b(r6)
            r0.f22651t = r4     // Catch: android.database.sqlite.SQLiteFullException -> L31
            java.lang.Object r6 = ot.l.a(r5)     // Catch: android.database.sqlite.SQLiteFullException -> L31
            r0.f22652u = r6     // Catch: android.database.sqlite.SQLiteFullException -> L31
            r0.f22654w = r3     // Catch: android.database.sqlite.SQLiteFullException -> L31
            java.lang.Object r4 = r5.invoke(r0)     // Catch: android.database.sqlite.SQLiteFullException -> L31
            if (r4 != r1) goto L54
            return r1
        L4f:
            java.lang.String r6 = "Failed to invoke SQL in database."
            ek.q.f(r4, r6, r5)
        L54:
            kotlin.Unit r4 = kotlin.Unit.f22894a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.h.c(java.lang.String, kotlin.jvm.functions.Function1, mt.b):java.lang.Object");
    }
}

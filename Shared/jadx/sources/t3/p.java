package t3;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJF\u0010\u0017\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00102.\u0010\u0016\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0011H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J:\u0010\u001b\u001a\u00020\n2(\u0010\u0016\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0019H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u000fJ\u0013\u0010\u001e\u001a\u00020\n*\u00020\u0003H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010&R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,¨\u0006."}, d2 = {"Lt3/p;", "T", "Lt3/f0;", "Ljava/io/File;", "file", "Lt3/a0;", "serializer", "Lt3/t;", "coordinator", "Lkotlin/Function0;", "", "onClose", "<init>", "(Ljava/io/File;Lt3/a0;Lt3/t;Lkotlin/jvm/functions/Function0;)V", "f", "()V", "R", "Lkotlin/Function3;", "Lt3/y;", "", "Lmt/b;", "", "block", j6.b.f21518e, "(Lyt/n;Lmt/b;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lt3/k0;", "c", "(Lkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;", "close", "g", "(Ljava/io/File;)V", ve.a.f33391e, "Ljava/io/File;", "Lt3/a0;", "Lt3/t;", rl.d.f30696a, "()Lt3/t;", "Lkotlin/jvm/functions/Function0;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "closed", "Ltu/a;", "Ltu/a;", "transactionMutex", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p<T> implements f0<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final File file;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final a0<T> serializer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final t coordinator;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> onClose;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean closed;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final tu.a transactionMutex;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @ot.f(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {101}, m = "readScope")
    public static final class a<R> extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f31942t;

        /* renamed from: u, reason: collision with root package name */
        public Object f31943u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f31944v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f31945w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ p<T> f31946x;

        /* renamed from: y, reason: collision with root package name */
        public int f31947y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p<T> pVar, mt.b<? super a> bVar) {
            super(bVar);
            this.f31946x = pVar;
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31945w = obj;
            this.f31947y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f31946x.b(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @ot.f(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {214, 118}, m = "writeScope")
    public static final class b extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f31948t;

        /* renamed from: u, reason: collision with root package name */
        public Object f31949u;

        /* renamed from: v, reason: collision with root package name */
        public Object f31950v;

        /* renamed from: w, reason: collision with root package name */
        public Object f31951w;

        /* renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f31952x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ p<T> f31953y;

        /* renamed from: z, reason: collision with root package name */
        public int f31954z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p<T> pVar, mt.b<? super b> bVar) {
            super(bVar);
            this.f31953y = pVar;
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31952x = obj;
            this.f31954z |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f31953y.c(null, this);
        }
    }

    public p(@NotNull File file, @NotNull a0<T> serializer, @NotNull t coordinator, @NotNull Function0<Unit> onClose) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.file = file;
        this.serializer = serializer;
        this.coordinator = coordinator;
        this.onClose = onClose;
        this.closed = new AtomicBoolean(false);
        this.transactionMutex = tu.g.b(false, 1, null);
    }

    private final void f() {
        if (this.closed.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(6:34|35|36|38|39|(1:41)(1:42))|13|14|15|(2:(1:18)|19)(1:21)))|7|(0)(0)|13|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007c, blocks: (B:21:0x007b, B:28:0x008c, B:31:0x0089, B:27:0x0084), top: B:7:0x0022, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14, types: [t3.p] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, t3.p$a] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [t3.p] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    @Override // t3.f0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object b(@org.jetbrains.annotations.NotNull yt.n<? super t3.y<T>, ? super java.lang.Boolean, ? super mt.b<? super R>, ? extends java.lang.Object> r8, @org.jetbrains.annotations.NotNull mt.b<? super R> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof t3.p.a
            if (r0 == 0) goto L13
            r0 = r9
            t3.p$a r0 = (t3.p.a) r0
            int r1 = r0.f31947y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31947y = r1
            goto L18
        L13:
            t3.p$a r0 = new t3.p$a
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f31945w
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f31947y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            boolean r8 = r0.f31944v
            java.lang.Object r1 = r0.f31943u
            t3.c r1 = (t3.c) r1
            java.lang.Object r0 = r0.f31942t
            t3.p r0 = (t3.p) r0
            gt.o.b(r9)     // Catch: java.lang.Throwable -> L34
            goto L6b
        L34:
            r9 = move-exception
            goto L84
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            gt.o.b(r9)
            r7.f()
            tu.a r9 = r7.transactionMutex
            boolean r9 = tu.a.C0589a.b(r9, r4, r3, r4)
            t3.n r2 = new t3.n     // Catch: java.lang.Throwable -> L8d
            java.io.File r5 = r7.file     // Catch: java.lang.Throwable -> L8d
            t3.a0<T> r6 = r7.serializer     // Catch: java.lang.Throwable -> L8d
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L8d
            java.lang.Boolean r5 = ot.b.a(r9)     // Catch: java.lang.Throwable -> L7e
            r0.f31942t = r7     // Catch: java.lang.Throwable -> L7e
            r0.f31943u = r2     // Catch: java.lang.Throwable -> L7e
            r0.f31944v = r9     // Catch: java.lang.Throwable -> L7e
            r0.f31947y = r3     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r8 = r8.invoke(r2, r5, r0)     // Catch: java.lang.Throwable -> L7e
            if (r8 != r1) goto L66
            return r1
        L66:
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L6b:
            r1.close()     // Catch: java.lang.Throwable -> L70
            r1 = r4
            goto L71
        L70:
            r1 = move-exception
        L71:
            if (r1 != 0) goto L7b
            if (r8 == 0) goto L7a
            tu.a r8 = r0.transactionMutex
            tu.a.C0589a.c(r8, r4, r3, r4)
        L7a:
            return r9
        L7b:
            throw r1     // Catch: java.lang.Throwable -> L7c
        L7c:
            r9 = move-exception
            goto L92
        L7e:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L84:
            r1.close()     // Catch: java.lang.Throwable -> L88
            goto L8c
        L88:
            r1 = move-exception
            gt.a.a(r9, r1)     // Catch: java.lang.Throwable -> L7c
        L8c:
            throw r9     // Catch: java.lang.Throwable -> L7c
        L8d:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
        L92:
            if (r8 == 0) goto L99
            tu.a r8 = r0.transactionMutex
            tu.a.C0589a.c(r8, r4, r3, r4)
        L99:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.p.b(yt.n, mt.b):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(7:(2:3|(11:5|6|7|(1:(1:(8:11|12|13|14|15|16|17|(5:19|(2:24|25)|27|28|29)(1:30))(2:41|42))(1:43))(3:61|(1:63)|50)|44|45|46|47|48|(6:51|14|15|16|17|(0)(0))|50))|45|46|47|48|(0)|50)|69|6|7|(0)(0)|44|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f2, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f3, code lost:
    
        r11 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bb A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TryCatch #0 {all -> 0x00f0, blocks: (B:19:0x00bb, B:21:0x00c1, B:24:0x00ca, B:25:0x00ef, B:27:0x00f5, B:30:0x00fd, B:57:0x010c, B:59:0x0112, B:60:0x0115, B:37:0x010a, B:40:0x0107, B:44:0x007a, B:46:0x0096), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fd A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:19:0x00bb, B:21:0x00c1, B:24:0x00ca, B:25:0x00ef, B:27:0x00f5, B:30:0x00fd, B:57:0x010c, B:59:0x0112, B:60:0x0115, B:37:0x010a, B:40:0x0107, B:44:0x007a, B:46:0x0096), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, tu.a] */
    @Override // t3.f0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super t3.k0<T>, ? super mt.b<? super kotlin.Unit>, ? extends java.lang.Object> r10, @org.jetbrains.annotations.NotNull mt.b<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.p.c(kotlin.jvm.functions.Function2, mt.b):java.lang.Object");
    }

    @Override // t3.c
    public void close() {
        this.closed.set(true);
        this.onClose.invoke();
    }

    @Override // t3.f0
    @NotNull
    /* renamed from: d, reason: from getter */
    public t getCoordinator() {
        return this.coordinator;
    }

    public final void g(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }
}

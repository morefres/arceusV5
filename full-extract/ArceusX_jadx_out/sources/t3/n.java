package t3;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u000e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lt3/n;", "T", "Lt3/y;", "Ljava/io/File;", "file", "Lt3/a0;", "serializer", "<init>", "(Ljava/io/File;Lt3/a0;)V", ve.a.f33391e, "(Lmt/b;)Ljava/lang/Object;", "", "close", "()V", "f", "Ljava/io/File;", "g", "()Ljava/io/File;", j6.b.f21518e, "Lt3/a0;", "h", "()Lt3/a0;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "closed", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class n<T> implements y<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final File file;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final a0<T> serializer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean closed;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @ot.f(c = "androidx.datastore.core.FileReadScope", f = "FileStorage.kt", l = {169, 178}, m = "readData$suspendImpl")
    public static final class a<T> extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f31925t;

        /* renamed from: u, reason: collision with root package name */
        public Object f31926u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31927v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ n<T> f31928w;

        /* renamed from: x, reason: collision with root package name */
        public int f31929x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n<T> nVar, mt.b<? super a> bVar) {
            super(bVar);
            this.f31928w = nVar;
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31927v = obj;
            this.f31929x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return n.i(this.f31928w, this);
        }
    }

    public n(@NotNull File file, @NotNull a0<T> serializer) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.file = file;
        this.serializer = serializer;
        this.closed = new AtomicBoolean(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:25|26))(3:27|28|29))(7:40|41|42|43|44|(1:46)|47)|30|31))|66|6|7|(0)(0)|30|31|(3:(1:36)|(1:21)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x006f, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [t3.n] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <T> java.lang.Object i(t3.n<T> r7, mt.b<? super T> r8) {
        /*
            boolean r0 = r8 instanceof t3.n.a
            if (r0 == 0) goto L13
            r0 = r8
            t3.n$a r0 = (t3.n.a) r0
            int r1 = r0.f31929x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31929x = r1
            goto L18
        L13:
            t3.n$a r0 = new t3.n$a
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f31927v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f31929x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.f31925t
            java.io.Closeable r7 = (java.io.Closeable) r7
            gt.o.b(r8)     // Catch: java.lang.Throwable -> L32
            goto L9d
        L32:
            r8 = move-exception
            goto La5
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            java.lang.Object r7 = r0.f31926u
            java.io.Closeable r7 = (java.io.Closeable) r7
            java.lang.Object r2 = r0.f31925t
            t3.n r2 = (t3.n) r2
            gt.o.b(r8)     // Catch: java.lang.Throwable -> L49
            goto L6b
        L49:
            r8 = move-exception
            goto L76
        L4b:
            gt.o.b(r8)
            r7.f()
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L7c
            java.io.File r2 = r7.file     // Catch: java.io.FileNotFoundException -> L7c
            r8.<init>(r2)     // Catch: java.io.FileNotFoundException -> L7c
            t3.a0<T> r2 = r7.serializer     // Catch: java.lang.Throwable -> L71
            r0.f31925t = r7     // Catch: java.lang.Throwable -> L71
            r0.f31926u = r8     // Catch: java.lang.Throwable -> L71
            r0.f31929x = r4     // Catch: java.lang.Throwable -> L71
            java.lang.Object r2 = r2.readFrom(r8, r0)     // Catch: java.lang.Throwable -> L71
            if (r2 != r1) goto L67
            goto L99
        L67:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L6b:
            tt.c.a(r7, r5)     // Catch: java.io.FileNotFoundException -> L6f
            return r8
        L6f:
            r7 = r2
            goto L7c
        L71:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L76:
            throw r8     // Catch: java.lang.Throwable -> L77
        L77:
            r4 = move-exception
            tt.c.a(r7, r8)     // Catch: java.io.FileNotFoundException -> L6f
            throw r4     // Catch: java.io.FileNotFoundException -> L6f
        L7c:
            java.io.File r8 = r7.file
            boolean r8 = r8.exists()
            if (r8 == 0) goto Lab
            java.io.FileInputStream r8 = new java.io.FileInputStream
            java.io.File r2 = r7.file
            r8.<init>(r2)
            t3.a0<T> r7 = r7.serializer     // Catch: java.lang.Throwable -> La1
            r0.f31925t = r8     // Catch: java.lang.Throwable -> La1
            r0.f31926u = r5     // Catch: java.lang.Throwable -> La1
            r0.f31929x = r3     // Catch: java.lang.Throwable -> La1
            java.lang.Object r7 = r7.readFrom(r8, r0)     // Catch: java.lang.Throwable -> La1
            if (r7 != r1) goto L9a
        L99:
            return r1
        L9a:
            r6 = r8
            r8 = r7
            r7 = r6
        L9d:
            tt.c.a(r7, r5)
            return r8
        La1:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        La5:
            throw r8     // Catch: java.lang.Throwable -> La6
        La6:
            r0 = move-exception
            tt.c.a(r7, r8)
            throw r0
        Lab:
            t3.a0<T> r7 = r7.serializer
            java.lang.Object r7 = r7.getDefaultValue()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.n.i(t3.n, mt.b):java.lang.Object");
    }

    @Override // t3.y
    @Nullable
    public Object a(@NotNull mt.b<? super T> bVar) {
        return i(this, bVar);
    }

    @Override // t3.c
    public void close() {
        this.closed.set(true);
    }

    public final void f() {
        if (this.closed.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    @NotNull
    /* renamed from: g, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    @NotNull
    public final a0<T> h() {
        return this.serializer;
    }
}

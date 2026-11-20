package x4;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0014\u001a\u00060\u0010j\u0002`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u00060\u0010j\u0002`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0013R\u0016\u0010#\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001e¨\u0006$"}, d2 = {"Lx4/k;", "", "", "size", "<init>", "(I)V", "", "tableIds", "", "i", "([I)Z", "j", "", "k", "()V", "h", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", ve.a.f33391e, "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "", j6.b.f21518e, "[J", "tableObserversCount", "", "c", "[Z", "tableObservedState", rl.d.f30696a, "Z", "needsSync", "e", "onSyncLock", "f", "inProgressSync", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final long[] tableObserversCount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final boolean[] tableObservedState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public volatile boolean needsSync;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public volatile boolean inProgressSync;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ReentrantLock lock = new ReentrantLock();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ReentrantLock onSyncLock = new ReentrantLock();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lx4/k$a;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35085a = new a("NO_OP", 0);
        public static final a b = new a("ADD", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f35086c = new a("REMOVE", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a[] f35087d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ pt.a f35088e;

        static {
            a[] a10 = a();
            f35087d = a10;
            f35088e = pt.b.a(a10);
        }

        public a(String str, int i10) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{f35085a, b, f35086c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f35087d.clone();
        }
    }

    public k(int i10) {
        this.tableObserversCount = new long[i10];
        this.tableObservedState = new boolean[i10];
    }

    public final void h() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.needsSync = true;
            Unit unit = Unit.f22894a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r12.inProgressSync != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(@org.jetbrains.annotations.NotNull int[] r13) {
        /*
            r12 = this;
            java.lang.String r0 = "tableIds"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.util.concurrent.locks.ReentrantLock r0 = r12.lock
            r0.lock()
            int r1 = r13.length     // Catch: java.lang.Throwable -> L26
            r2 = 0
            r3 = r2
            r4 = r3
        Le:
            r5 = 1
            if (r3 >= r1) goto L2b
            r6 = r13[r3]     // Catch: java.lang.Throwable -> L26
            long[] r7 = r12.tableObserversCount     // Catch: java.lang.Throwable -> L26
            r8 = r7[r6]     // Catch: java.lang.Throwable -> L26
            r10 = 1
            long r10 = r10 + r8
            r7[r6] = r10     // Catch: java.lang.Throwable -> L26
            r6 = 0
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 != 0) goto L28
            r12.needsSync = r5     // Catch: java.lang.Throwable -> L26
            r4 = r5
            goto L28
        L26:
            r13 = move-exception
            goto L3a
        L28:
            int r3 = r3 + 1
            goto Le
        L2b:
            if (r4 != 0) goto L35
            boolean r13 = r12.needsSync     // Catch: java.lang.Throwable -> L26
            if (r13 != 0) goto L35
            boolean r13 = r12.inProgressSync     // Catch: java.lang.Throwable -> L26
            if (r13 == 0) goto L36
        L35:
            r2 = r5
        L36:
            r0.unlock()
            return r2
        L3a:
            r0.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.k.i(int[]):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r14.inProgressSync != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(@org.jetbrains.annotations.NotNull int[] r15) {
        /*
            r14 = this;
            java.lang.String r0 = "tableIds"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.util.concurrent.locks.ReentrantLock r0 = r14.lock
            r0.lock()
            int r1 = r15.length     // Catch: java.lang.Throwable -> L25
            r2 = 0
            r3 = r2
            r4 = r3
        Le:
            r5 = 1
            if (r3 >= r1) goto L2a
            r6 = r15[r3]     // Catch: java.lang.Throwable -> L25
            long[] r7 = r14.tableObserversCount     // Catch: java.lang.Throwable -> L25
            r8 = r7[r6]     // Catch: java.lang.Throwable -> L25
            r10 = 1
            long r12 = r8 - r10
            r7[r6] = r12     // Catch: java.lang.Throwable -> L25
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L27
            r14.needsSync = r5     // Catch: java.lang.Throwable -> L25
            r4 = r5
            goto L27
        L25:
            r15 = move-exception
            goto L39
        L27:
            int r3 = r3 + 1
            goto Le
        L2a:
            if (r4 != 0) goto L34
            boolean r15 = r14.needsSync     // Catch: java.lang.Throwable -> L25
            if (r15 != 0) goto L34
            boolean r15 = r14.inProgressSync     // Catch: java.lang.Throwable -> L25
            if (r15 == 0) goto L35
        L34:
            r2 = r5
        L35:
            r0.unlock()
            return r2
        L39:
            r0.unlock()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.k.j(int[]):boolean");
    }

    public final void k() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            kotlin.collections.l.u(this.tableObservedState, false, 0, 0, 6, null);
            this.needsSync = true;
            Unit unit = Unit.f22894a;
        } finally {
            reentrantLock.unlock();
        }
    }
}

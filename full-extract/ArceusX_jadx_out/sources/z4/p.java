package z4;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x4.f0;
import x4.g0;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0019\u001b\u001cB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJJ\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\f2(\u0010\u0012\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J2\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00000\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJH\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\r\u001a\u00020\f2(\u0010\u0012\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0096@¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010,\u001a\u0004\b-\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010,R\u0014\u00108\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00107¨\u00069"}, d2 = {"Lz4/p;", "Lx4/g0;", "Lz4/q;", "Lz4/b;", "connectionElementKey", "Lz4/j;", "delegate", "", "isReadOnly", "<init>", "(Lz4/b;Lz4/j;Z)V", "R", "Lx4/g0$a;", Payload.TYPE, "Lkotlin/Function2;", "Lx4/f0;", "Lmt/b;", "", "block", "o", "(Lx4/g0$a;Lkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;", "", "sql", "Lkotlin/Function1;", "Lf5/d;", "c", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lmt/b;)Ljava/lang/Object;", j6.b.f21518e, ve.a.f33391e, "(Lmt/b;)Ljava/lang/Object;", "", "n", "()V", "i", "(Lx4/g0$a;Lmt/b;)Ljava/lang/Object;", "success", "j", "(ZLmt/b;)Ljava/lang/Object;", "Lz4/b;", "k", "()Lz4/b;", "Lz4/j;", "l", "()Lz4/j;", "Z", "m", "()Z", "Lkotlin/collections/i;", "Lz4/p$c;", rl.d.f30696a, "Lkotlin/collections/i;", "transactionStack", "e", "isRecycled", "Lf5/b;", "()Lf5/b;", "rawConnection", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p implements g0, q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final z4.b connectionElementKey;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final j delegate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean isReadOnly;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kotlin.collections.i<c> transactionStack;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public volatile boolean isRecycled;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u0019J\u000f\u0010 \u001a\u00020\u001aH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010#R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lz4/p$a;", "Lf5/d;", "delegate", "<init>", "(Lz4/p;Lf5/d;)V", "", "index", "", "value", "", "A", "(I[B)V", "", "z", "(IJ)V", "", "i0", "(ILjava/lang/String;)V", "C", "(I)V", "getBlob", "(I)[B", "getLong", "(I)J", "F2", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "i3", "()Z", "reset", "()V", "E", "close", ve.a.f33391e, "Lf5/d;", j6.b.f21518e, "J", "threadId", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a implements f5.d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final f5.d delegate;

        /* renamed from: b, reason: from kotlin metadata */
        public final long threadId;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f37860c;

        public a(@NotNull p pVar, f5.d delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f37860c = pVar;
            this.delegate = delegate;
            this.threadId = y4.d.b();
        }

        @Override // f5.d
        public void A(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (this.f37860c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new gt.d();
            }
            if (this.threadId == y4.d.b()) {
                this.delegate.A(index, value);
            } else {
                f5.a.b(21, "Attempted to use statement on a different thread");
                throw new gt.d();
            }
        }

        @Override // f5.d
        public void C(int index) {
            if (this.f37860c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new gt.d();
            }
            if (this.threadId == y4.d.b()) {
                this.delegate.C(index);
            } else {
                f5.a.b(21, "Attempted to use statement on a different thread");
                throw new gt.d();
            }
        }

        @Override // f5.d
        public void E() {
            if (this.f37860c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new gt.d();
            }
            if (this.threadId == y4.d.b()) {
                this.delegate.E();
            } else {
                f5.a.b(21, "Attempted to use statement on a different thread");
                throw new gt.d();
            }
        }

        @Override // f5.d
        @NotNull
        public String F2(int index) {
            if (this.f37860c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new gt.d();
            }
            if (this.threadId == y4.d.b()) {
                return this.delegate.F2(index);
            }
            f5.a.b(21, "Attempted to use statement on a different thread");
            throw new gt.d();
        }

        @Override // f5.d, java.lang.AutoCloseable
        public void close() {
            if (this.f37860c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new gt.d();
            }
            if (this.threadId == y4.d.b()) {
                this.delegate.close();
            } else {
                f5.a.b(21, "Attempted to use statement on a different thread");
                throw new gt.d();
            }
        }

        @Override // f5.d
        @NotNull
        public byte[] getBlob(int index) {
            if (this.f37860c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new gt.d();
            }
            if (this.threadId == y4.d.b()) {
                return this.delegate.getBlob(index);
            }
            f5.a.b(21, "Attempted to use statement on a different thread");
            throw new gt.d();
        }

        @Override // f5.d
        public int getColumnCount() {
            if (this.f37860c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new gt.d();
            }
            if (this.threadId == y4.d.b()) {
                return this.delegate.getColumnCount();
            }
            f5.a.b(21, "Attempted to use statement on a different thread");
            throw new gt.d();
        }

        @Override // f5.d
        @NotNull
        public String getColumnName(int index) {
            if (this.f37860c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new gt.d();
            }
            if (this.threadId == y4.d.b()) {
                return this.delegate.getColumnName(index);
            }
            f5.a.b(21, "Attempted to use statement on a different thread");
            throw new gt.d();
        }

        @Override // f5.d
        public long getLong(int index) {
            if (this.f37860c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new gt.d();
            }
            if (this.threadId == y4.d.b()) {
                return this.delegate.getLong(index);
            }
            f5.a.b(21, "Attempted to use statement on a different thread");
            throw new gt.d();
        }

        @Override // f5.d
        public void i0(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (this.f37860c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new gt.d();
            }
            if (this.threadId == y4.d.b()) {
                this.delegate.i0(index, value);
            } else {
                f5.a.b(21, "Attempted to use statement on a different thread");
                throw new gt.d();
            }
        }

        @Override // f5.d
        public boolean i3() {
            if (this.f37860c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new gt.d();
            }
            if (this.threadId == y4.d.b()) {
                return this.delegate.i3();
            }
            f5.a.b(21, "Attempted to use statement on a different thread");
            throw new gt.d();
        }

        @Override // f5.d
        public boolean isNull(int index) {
            if (this.f37860c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new gt.d();
            }
            if (this.threadId == y4.d.b()) {
                return this.delegate.isNull(index);
            }
            f5.a.b(21, "Attempted to use statement on a different thread");
            throw new gt.d();
        }

        @Override // f5.d
        public void reset() {
            if (this.f37860c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new gt.d();
            }
            if (this.threadId == y4.d.b()) {
                this.delegate.reset();
            } else {
                f5.a.b(21, "Attempted to use statement on a different thread");
                throw new gt.d();
            }
        }

        @Override // f5.d
        public void z(int index, long value) {
            if (this.f37860c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new gt.d();
            }
            if (this.threadId == y4.d.b()) {
                this.delegate.z(index, value);
            } else {
                f5.a.b(21, "Attempted to use statement on a different thread");
                throw new gt.d();
            }
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\f\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lz4/p$b;", "T", "Lx4/f0;", "Lz4/q;", "<init>", "(Lz4/p;)V", "R", "", "sql", "Lkotlin/Function1;", "Lf5/d;", "block", "c", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lmt/b;)Ljava/lang/Object;", "Lf5/b;", rl.d.f30696a, "()Lf5/b;", "rawConnection", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b<T> implements f0<T>, q {
        public b() {
        }

        @Override // x4.m
        @Nullable
        public <R> Object c(@NotNull String str, @NotNull Function1<? super f5.d, ? extends R> function1, @NotNull mt.b<? super R> bVar) {
            return p.this.c(str, function1, bVar);
        }

        @Override // z4.q
        @NotNull
        /* renamed from: d */
        public f5.b getDelegate() {
            return p.this.getDelegate();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lz4/p$c;", "", "", "id", "", "shouldRollback", "<init>", "(IZ)V", ve.a.f33391e, "I", "()I", j6.b.f21518e, "Z", "()Z", "setShouldRollback", "(Z)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int id;

        /* renamed from: b, reason: from kotlin metadata */
        public boolean shouldRollback;

        public c(int i10, boolean z10) {
            this.id = i10;
            this.shouldRollback = z10;
        }

        /* renamed from: a, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getShouldRollback() {
            return this.shouldRollback;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37863a;

        static {
            int[] iArr = new int[g0.a.values().length];
            try {
                iArr[g0.a.f35073a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g0.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g0.a.f35074c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37863a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {629}, m = "beginTransaction")
    public static final class e extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f37864t;

        /* renamed from: u, reason: collision with root package name */
        public Object f37865u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f37866v;

        /* renamed from: x, reason: collision with root package name */
        public int f37868x;

        public e(mt.b<? super e> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37866v = obj;
            this.f37868x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return p.this.i(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {629}, m = "endTransaction")
    public static final class f extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public boolean f37869t;

        /* renamed from: u, reason: collision with root package name */
        public Object f37870u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f37871v;

        /* renamed from: x, reason: collision with root package name */
        public int f37873x;

        public f(mt.b<? super f> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37871v = obj;
            this.f37873x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return p.this.j(false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {464, 468, 482, 482, 482}, m = "transaction")
    public static final class g<R> extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f37874t;

        /* renamed from: u, reason: collision with root package name */
        public Object f37875u;

        /* renamed from: v, reason: collision with root package name */
        public int f37876v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f37877w;

        /* renamed from: y, reason: collision with root package name */
        public int f37879y;

        public g(mt.b<? super g> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37877w = obj;
            this.f37879y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return p.this.o(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {640}, m = "usePrepared")
    public static final class h<R> extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f37880t;

        /* renamed from: u, reason: collision with root package name */
        public Object f37881u;

        /* renamed from: v, reason: collision with root package name */
        public Object f37882v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f37883w;

        /* renamed from: y, reason: collision with root package name */
        public int f37885y;

        public h(mt.b<? super h> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37883w = obj;
            this.f37885y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return p.this.c(null, null, this);
        }
    }

    public p(@NotNull z4.b connectionElementKey, @NotNull j delegate, boolean z10) {
        Intrinsics.checkNotNullParameter(connectionElementKey, "connectionElementKey");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.connectionElementKey = connectionElementKey;
        this.delegate = delegate;
        this.isReadOnly = z10;
        this.transactionStack = new kotlin.collections.i<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(1:(2:26|27)(1:(2:14|15)(4:17|18|19|20)))(5:28|29|(1:31)|32|(1:35)(1:34)))(1:37))(3:41|(1:43)|44)|38|(4:40|(0)|32|(0))|35))|67|6|7|(0)(0)|38|(0)|35|(2:(1:63)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0071, code lost:
    
        if (i(r11, r0) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0057, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0098, code lost:
    
        if ((r11 instanceof z4.c.a) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009a, code lost:
    
        r11 = r11.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a0, code lost:
    
        r0.f37874t = r11;
        r0.f37879y = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a8, code lost:
    
        if (j(false, r0) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ab, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ae, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00af, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b0, code lost:
    
        r9 = r11;
        r11 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b2, code lost:
    
        r0.f37874t = r9;
        r0.f37875u = r11;
        r0.f37879y = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00bc, code lost:
    
        if (j(false, r0) != r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00bf, code lost:
    
        r13 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c0, code lost:
    
        r12 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ac, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object o(x4.g0.a r11, kotlin.jvm.functions.Function2<? super x4.f0<R>, ? super mt.b<? super R>, ? extends java.lang.Object> r12, mt.b<? super R> r13) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.p.o(x4.g0$a, kotlin.jvm.functions.Function2, mt.b):java.lang.Object");
    }

    @Override // x4.g0
    @Nullable
    public Object a(@NotNull mt.b<? super Boolean> bVar) {
        if (this.isRecycled) {
            f5.a.b(21, "Connection is recycled");
            throw new gt.d();
        }
        z4.a aVar = (z4.a) bVar.getContext().get(getConnectionElementKey());
        if (aVar != null && aVar.getConnectionWrapper() == this) {
            return ot.b.a(!this.transactionStack.isEmpty() || this.delegate.D());
        }
        f5.a.b(21, "Attempted to use connection on a different coroutine");
        throw new gt.d();
    }

    @Override // x4.g0
    @Nullable
    public <R> Object b(@NotNull g0.a aVar, @NotNull Function2<? super f0<R>, ? super mt.b<? super R>, ? extends Object> function2, @NotNull mt.b<? super R> bVar) {
        if (this.isRecycled) {
            f5.a.b(21, "Connection is recycled");
            throw new gt.d();
        }
        z4.a aVar2 = (z4.a) bVar.getContext().get(getConnectionElementKey());
        if (aVar2 != null && aVar2.getConnectionWrapper() == this) {
            return o(aVar, function2, bVar);
        }
        f5.a.b(21, "Attempted to use connection on a different coroutine");
        throw new gt.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v12, types: [tu.a] */
    @Override // x4.m
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object c(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super f5.d, ? extends R> r8, @org.jetbrains.annotations.NotNull mt.b<? super R> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof z4.p.h
            if (r0 == 0) goto L13
            r0 = r9
            z4.p$h r0 = (z4.p.h) r0
            int r1 = r0.f37885y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37885y = r1
            goto L18
        L13:
            z4.p$h r0 = new z4.p$h
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f37883w
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f37885y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.f37882v
            tu.a r7 = (tu.a) r7
            java.lang.Object r8 = r0.f37881u
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            java.lang.Object r0 = r0.f37880t
            java.lang.String r0 = (java.lang.String) r0
            gt.o.b(r9)
            r9 = r7
            r7 = r0
            goto L72
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            gt.o.b(r9)
            boolean r9 = g(r6)
            r2 = 21
            if (r9 != 0) goto La0
            kotlin.coroutines.CoroutineContext r9 = r0.getContext()
            z4.b r5 = r6.getConnectionElementKey()
            kotlin.coroutines.CoroutineContext$Element r9 = r9.get(r5)
            z4.a r9 = (z4.a) r9
            if (r9 == 0) goto L95
            z4.p r9 = r9.getConnectionWrapper()
            if (r9 != r6) goto L95
            z4.j r9 = r6.delegate
            r0.f37880t = r7
            r0.f37881u = r8
            r0.f37882v = r9
            r0.f37885y = r3
            java.lang.Object r0 = r9.c(r4, r0)
            if (r0 != r1) goto L72
            return r1
        L72:
            z4.p$a r0 = new z4.p$a     // Catch: java.lang.Throwable -> L88
            z4.j r1 = r6.delegate     // Catch: java.lang.Throwable -> L88
            f5.d r7 = r1.r3(r7)     // Catch: java.lang.Throwable -> L88
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L88
            java.lang.Object r7 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L8a
            wt.a.a(r0, r4)     // Catch: java.lang.Throwable -> L88
            r9.f(r4)
            return r7
        L88:
            r7 = move-exception
            goto L91
        L8a:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L8c
        L8c:
            r8 = move-exception
            wt.a.a(r0, r7)     // Catch: java.lang.Throwable -> L88
            throw r8     // Catch: java.lang.Throwable -> L88
        L91:
            r9.f(r4)
            throw r7
        L95:
            java.lang.String r7 = "Attempted to use connection on a different coroutine"
            f5.a.b(r2, r7)
            gt.d r7 = new gt.d
            r7.<init>()
            throw r7
        La0:
            java.lang.String r7 = "Connection is recycled"
            f5.a.b(r2, r7)
            gt.d r7 = new gt.d
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.p.c(java.lang.String, kotlin.jvm.functions.Function1, mt.b):java.lang.Object");
    }

    @Override // z4.q
    @NotNull
    /* renamed from: d */
    public f5.b getDelegate() {
        return this.delegate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:11:0x004e, B:13:0x005c, B:19:0x006c, B:20:0x00a7, B:24:0x0076, B:25:0x007b, B:26:0x007c, B:27:0x0084, B:28:0x008c), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:11:0x004e, B:13:0x005c, B:19:0x006c, B:20:0x00a7, B:24:0x0076, B:25:0x007b, B:26:0x007c, B:27:0x0084, B:28:0x008c), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r6v14, types: [tu.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(x4.g0.a r6, mt.b<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof z4.p.e
            if (r0 == 0) goto L13
            r0 = r7
            z4.p$e r0 = (z4.p.e) r0
            int r1 = r0.f37868x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37868x = r1
            goto L18
        L13:
            z4.p$e r0 = new z4.p$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f37866v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f37868x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f37865u
            tu.a r6 = (tu.a) r6
            java.lang.Object r0 = r0.f37864t
            x4.g0$a r0 = (x4.g0.a) r0
            gt.o.b(r7)
            r7 = r6
            r6 = r0
            goto L4e
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            gt.o.b(r7)
            z4.j r7 = r5.delegate
            r0.f37864t = r6
            r0.f37865u = r7
            r0.f37868x = r3
            java.lang.Object r0 = r7.c(r4, r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            kotlin.collections.i<z4.p$c> r0 = r5.transactionStack     // Catch: java.lang.Throwable -> L74
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L74
            kotlin.collections.i<z4.p$c> r1 = r5.transactionStack     // Catch: java.lang.Throwable -> L74
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L74
            if (r1 == 0) goto L8c
            int[] r1 = z4.p.d.f37863a     // Catch: java.lang.Throwable -> L74
            int r6 = r6.ordinal()     // Catch: java.lang.Throwable -> L74
            r6 = r1[r6]     // Catch: java.lang.Throwable -> L74
            if (r6 == r3) goto L84
            r1 = 2
            if (r6 == r1) goto L7c
            r1 = 3
            if (r6 != r1) goto L76
            z4.j r6 = r5.delegate     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = "BEGIN EXCLUSIVE TRANSACTION"
            f5.a.a(r6, r1)     // Catch: java.lang.Throwable -> L74
            goto La7
        L74:
            r6 = move-exception
            goto Lb8
        L76:
            gt.l r6 = new gt.l     // Catch: java.lang.Throwable -> L74
            r6.<init>()     // Catch: java.lang.Throwable -> L74
            throw r6     // Catch: java.lang.Throwable -> L74
        L7c:
            z4.j r6 = r5.delegate     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = "BEGIN IMMEDIATE TRANSACTION"
            f5.a.a(r6, r1)     // Catch: java.lang.Throwable -> L74
            goto La7
        L84:
            z4.j r6 = r5.delegate     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = "BEGIN DEFERRED TRANSACTION"
            f5.a.a(r6, r1)     // Catch: java.lang.Throwable -> L74
            goto La7
        L8c:
            z4.j r6 = r5.delegate     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r1.<init>()     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = "SAVEPOINT '"
            r1.append(r2)     // Catch: java.lang.Throwable -> L74
            r1.append(r0)     // Catch: java.lang.Throwable -> L74
            r2 = 39
            r1.append(r2)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L74
            f5.a.a(r6, r1)     // Catch: java.lang.Throwable -> L74
        La7:
            kotlin.collections.i<z4.p$c> r6 = r5.transactionStack     // Catch: java.lang.Throwable -> L74
            z4.p$c r1 = new z4.p$c     // Catch: java.lang.Throwable -> L74
            r2 = 0
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L74
            r6.addLast(r1)     // Catch: java.lang.Throwable -> L74
            kotlin.Unit r6 = kotlin.Unit.f22894a     // Catch: java.lang.Throwable -> L74
            r7.f(r4)
            return r6
        Lb8:
            r7.f(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.p.i(x4.g0$a, mt.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:11:0x004b, B:13:0x0053, B:15:0x005f, B:17:0x0065, B:19:0x006d, B:20:0x00c2, B:24:0x0077, B:25:0x0095, B:27:0x009d, B:28:0x00a5, B:29:0x00c8, B:30:0x00cf), top: B:10:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8 A[Catch: all -> 0x0075, TRY_ENTER, TryCatch #0 {all -> 0x0075, blocks: (B:11:0x004b, B:13:0x0053, B:15:0x005f, B:17:0x0065, B:19:0x006d, B:20:0x00c2, B:24:0x0077, B:25:0x0095, B:27:0x009d, B:28:0x00a5, B:29:0x00c8, B:30:0x00cf), top: B:10:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(boolean r6, mt.b<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof z4.p.f
            if (r0 == 0) goto L13
            r0 = r7
            z4.p$f r0 = (z4.p.f) r0
            int r1 = r0.f37873x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37873x = r1
            goto L18
        L13:
            z4.p$f r0 = new z4.p$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f37871v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f37873x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            boolean r6 = r0.f37869t
            java.lang.Object r0 = r0.f37870u
            tu.a r0 = (tu.a) r0
            gt.o.b(r7)
            goto L4b
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            gt.o.b(r7)
            z4.j r7 = r5.delegate
            r0.f37870u = r7
            r0.f37869t = r6
            r0.f37873x = r3
            java.lang.Object r0 = r7.c(r4, r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            r0 = r7
        L4b:
            kotlin.collections.i<z4.p$c> r7 = r5.transactionStack     // Catch: java.lang.Throwable -> L75
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L75
            if (r7 != 0) goto Lc8
            kotlin.collections.i<z4.p$c> r7 = r5.transactionStack     // Catch: java.lang.Throwable -> L75
            java.lang.Object r7 = kotlin.collections.u.H(r7)     // Catch: java.lang.Throwable -> L75
            z4.p$c r7 = (z4.p.c) r7     // Catch: java.lang.Throwable -> L75
            r1 = 39
            if (r6 == 0) goto L95
            boolean r6 = r7.getShouldRollback()     // Catch: java.lang.Throwable -> L75
            if (r6 != 0) goto L95
            kotlin.collections.i<z4.p$c> r6 = r5.transactionStack     // Catch: java.lang.Throwable -> L75
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L75
            if (r6 == 0) goto L77
            z4.j r6 = r5.delegate     // Catch: java.lang.Throwable -> L75
            java.lang.String r7 = "END TRANSACTION"
            f5.a.a(r6, r7)     // Catch: java.lang.Throwable -> L75
            goto Lc2
        L75:
            r6 = move-exception
            goto Ld0
        L77:
            z4.j r6 = r5.delegate     // Catch: java.lang.Throwable -> L75
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r2.<init>()     // Catch: java.lang.Throwable -> L75
            java.lang.String r3 = "RELEASE SAVEPOINT '"
            r2.append(r3)     // Catch: java.lang.Throwable -> L75
            int r7 = r7.getId()     // Catch: java.lang.Throwable -> L75
            r2.append(r7)     // Catch: java.lang.Throwable -> L75
            r2.append(r1)     // Catch: java.lang.Throwable -> L75
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L75
            f5.a.a(r6, r7)     // Catch: java.lang.Throwable -> L75
            goto Lc2
        L95:
            kotlin.collections.i<z4.p$c> r6 = r5.transactionStack     // Catch: java.lang.Throwable -> L75
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L75
            if (r6 == 0) goto La5
            z4.j r6 = r5.delegate     // Catch: java.lang.Throwable -> L75
            java.lang.String r7 = "ROLLBACK TRANSACTION"
            f5.a.a(r6, r7)     // Catch: java.lang.Throwable -> L75
            goto Lc2
        La5:
            z4.j r6 = r5.delegate     // Catch: java.lang.Throwable -> L75
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r2.<init>()     // Catch: java.lang.Throwable -> L75
            java.lang.String r3 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            r2.append(r3)     // Catch: java.lang.Throwable -> L75
            int r7 = r7.getId()     // Catch: java.lang.Throwable -> L75
            r2.append(r7)     // Catch: java.lang.Throwable -> L75
            r2.append(r1)     // Catch: java.lang.Throwable -> L75
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L75
            f5.a.a(r6, r7)     // Catch: java.lang.Throwable -> L75
        Lc2:
            kotlin.Unit r6 = kotlin.Unit.f22894a     // Catch: java.lang.Throwable -> L75
            r0.f(r4)
            return r6
        Lc8:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L75
            java.lang.String r7 = "Not in a transaction"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L75
            throw r6     // Catch: java.lang.Throwable -> L75
        Ld0:
            r0.f(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.p.j(boolean, mt.b):java.lang.Object");
    }

    @NotNull
    /* renamed from: k, reason: from getter */
    public final z4.b getConnectionElementKey() {
        return this.connectionElementKey;
    }

    @NotNull
    /* renamed from: l, reason: from getter */
    public final j getDelegate() {
        return this.delegate;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    public final void n() {
        if (this.isRecycled) {
            return;
        }
        this.isRecycled = true;
        if (this.delegate.D()) {
            f5.a.a(this.delegate, "ROLLBACK TRANSACTION");
        }
    }
}

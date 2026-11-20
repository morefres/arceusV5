package n6;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import n6.a;
import n6.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wu.h0;
import wu.l;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0003\u001a\u000f\u0012B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 ¨\u0006\""}, d2 = {"Ln6/f;", "Ln6/a;", "", "maxSize", "Lwu/h0;", "directory", "Lwu/l;", "fileSystem", "Lkotlin/coroutines/CoroutineContext;", "cleanupCoroutineContext", "<init>", "(JLwu/h0;Lwu/l;Lkotlin/coroutines/CoroutineContext;)V", "", "key", "Ln6/a$c;", j6.b.f21518e, "(Ljava/lang/String;)Ln6/a$c;", "Ln6/a$b;", ve.a.f33391e, "(Ljava/lang/String;)Ln6/a$b;", "e", "(Ljava/lang/String;)Ljava/lang/String;", "J", rl.d.f30696a, "()J", "Lwu/h0;", "c", "()Lwu/h0;", "Lwu/l;", "getFileSystem", "()Lwu/l;", "Ln6/d;", "Ln6/d;", "cache", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long maxSize;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final h0 directory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l fileSystem;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final d cache;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"Ln6/f$b;", "Ln6/a$b;", "Ln6/d$b;", "Ln6/d;", "editor", "<init>", "(Ln6/d$b;)V", "Ln6/f$c;", j6.b.f21518e, "()Ln6/f$c;", "", "abort", "()V", ve.a.f33391e, "Ln6/d$b;", "Lwu/h0;", "getMetadata", "()Lwu/h0;", "metadata", "getData", "data", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements a.b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final d.b editor;

        public b(@NotNull d.b bVar) {
            this.editor = bVar;
        }

        @Override // n6.a.b
        public void abort() {
            this.editor.a();
        }

        @Override // n6.a.b
        @Nullable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a() {
            d.C0455d c10 = this.editor.c();
            if (c10 != null) {
                return new c(c10);
            }
            return null;
        }

        @Override // n6.a.b
        @NotNull
        public h0 getData() {
            return this.editor.f(1);
        }

        @Override // n6.a.b
        @NotNull
        public h0 getMetadata() {
            return this.editor.f(0);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Ln6/f$c;", "Ln6/a$c;", "Ln6/d$d;", "Ln6/d;", "snapshot", "<init>", "(Ln6/d$d;)V", "", "close", "()V", "Ln6/f$b;", ve.a.f33391e, "()Ln6/f$b;", "Ln6/d$d;", "Lwu/h0;", "getMetadata", "()Lwu/h0;", "metadata", "getData", "data", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements a.c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final d.C0455d snapshot;

        public c(@NotNull d.C0455d c0455d) {
            this.snapshot = c0455d;
        }

        @Override // n6.a.c
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b r2() {
            d.b a10 = this.snapshot.a();
            if (a10 != null) {
                return new b(a10);
            }
            return null;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            this.snapshot.close();
        }

        @Override // n6.a.c
        @NotNull
        public h0 getData() {
            return this.snapshot.b(1);
        }

        @Override // n6.a.c
        @NotNull
        public h0 getMetadata() {
            return this.snapshot.b(0);
        }
    }

    public f(long j10, @NotNull h0 h0Var, @NotNull l lVar, @NotNull CoroutineContext coroutineContext) {
        this.maxSize = j10;
        this.directory = h0Var;
        this.fileSystem = lVar;
        this.cache = new d(getFileSystem(), getDirectory(), coroutineContext, getMaxSize(), 3, 2);
    }

    @Override // n6.a
    @Nullable
    public a.b a(@NotNull String key) {
        d.b x10 = this.cache.x(e(key));
        if (x10 != null) {
            return new b(x10);
        }
        return null;
    }

    @Override // n6.a
    @Nullable
    public a.c b(@NotNull String key) {
        d.C0455d y10 = this.cache.y(e(key));
        if (y10 != null) {
            return new c(y10);
        }
        return null;
    }

    @NotNull
    /* renamed from: c, reason: from getter */
    public h0 getDirectory() {
        return this.directory;
    }

    /* renamed from: d, reason: from getter */
    public long getMaxSize() {
        return this.maxSize;
    }

    public final String e(String str) {
        return wu.h.INSTANCE.d(str).H().r();
    }

    @Override // n6.a
    @NotNull
    public l getFileSystem() {
        return this.fileSystem;
    }
}

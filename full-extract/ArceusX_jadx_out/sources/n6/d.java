package n6;

import e7.l;
import gt.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ju.k;
import ju.l0;
import ju.p0;
import ju.q0;
import ju.z2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;
import wu.b0;
import wu.h0;
import wu.n;
import zl.t;

@Metadata(d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\b\u0004*\u0001`\b\u0000\u0018\u0000 b2\u00060\u0001j\u0002`\u0002:\u0004;8:6B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u0012J#\u0010 \u001a\u00020\u00102\n\u0010\u001d\u001a\u00060\u001cR\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\u00020\u001e2\n\u0010%\u001a\u00060$R\u00020\u0000H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0010H\u0002¢\u0006\u0004\b(\u0010\u0012J\u000f\u0010)\u001a\u00020\u0010H\u0002¢\u0006\u0004\b)\u0010\u0012J\u000f\u0010*\u001a\u00020\u001eH\u0002¢\u0006\u0004\b*\u0010#J\u000f\u0010+\u001a\u00020\u0010H\u0002¢\u0006\u0004\b+\u0010\u0012J\u000f\u0010,\u001a\u00020\u0010H\u0002¢\u0006\u0004\b,\u0010\u0012J\u0017\u0010.\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u0016H\u0002¢\u0006\u0004\b.\u0010\u0019J\r\u0010/\u001a\u00020\u0010¢\u0006\u0004\b/\u0010\u0012J\u001e\u00101\u001a\b\u0018\u000100R\u00020\u00002\u0006\u0010-\u001a\u00020\u0016H\u0086\u0002¢\u0006\u0004\b1\u00102J\u001b\u00103\u001a\b\u0018\u00010\u001cR\u00020\u00002\u0006\u0010-\u001a\u00020\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0010H\u0016¢\u0006\u0004\b5\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0014R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0014R\u0014\u0010=\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00107R\u0014\u0010?\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00107R\u0014\u0010A\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00107R$\u0010E\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u00060$R\u00020\u00000B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010N\u001a\u00060Jj\u0002`K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010P\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u00109R\u0016\u0010R\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010\u0014R\u0018\u0010U\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010.R\u0016\u0010Y\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010.R\u0016\u0010[\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010.R\u0016\u0010]\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010.R\u0016\u0010_\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010.R\u0014\u0010\u0004\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010a¨\u0006c"}, d2 = {"Ln6/d;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lwu/l;", "fileSystem", "Lwu/h0;", "directory", "Lkotlin/coroutines/CoroutineContext;", "cleanupCoroutineContext", "", "maxSize", "", "appVersion", "valueCount", "<init>", "(Lwu/l;Lwu/h0;Lkotlin/coroutines/CoroutineContext;JII)V", "", "P", "()V", "Lwu/f;", "I", "()Lwu/f;", "", "line", "U", "(Ljava/lang/String;)V", "M", "a0", "Ln6/d$b;", "editor", "", "success", "u", "(Ln6/d$b;Z)V", "F", "()Z", "Ln6/d$c;", "entry", "W", "(Ln6/d$c;)Z", "s", "Y", "X", "w", "H", "key", "Z", "B", "Ln6/d$d;", "y", "(Ljava/lang/String;)Ln6/d$d;", "x", "(Ljava/lang/String;)Ln6/d$b;", "close", ve.a.f33391e, "Lwu/h0;", j6.b.f21518e, "J", "c", rl.d.f30696a, "e", "journalFile", "f", "journalFileTmp", "g", "journalFileBackup", "", "h", "Ljava/util/Map;", "lruEntries", "Lju/p0;", "i", "Lju/p0;", "cleanupScope", "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "j", "Ljava/lang/Object;", "lock", "k", "size", "l", "operationsSinceRewrite", "m", "Lwu/f;", "journalWriter", "n", "hasJournalErrors", "o", "initialized", "p", "closed", "q", "mostRecentTrimFailed", "r", "mostRecentRebuildFailed", "n6/d$e", "Ln6/d$e;", t.f38095d, "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d implements AutoCloseable {

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    public static final Regex f25774u = new Regex("[a-z0-9_-]{1,120}");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h0 directory;

    /* renamed from: b, reason: from kotlin metadata */
    public final long maxSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int appVersion;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int valueCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h0 journalFile;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h0 journalFileTmp;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h0 journalFileBackup;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, c> lruEntries;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 cleanupScope;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object lock;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public long size;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int operationsSinceRewrite;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public wu.f journalWriter;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean hasJournalErrors;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean initialized;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public boolean closed;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public boolean mostRecentTrimFailed;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public boolean mostRecentRebuildFailed;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e fileSystem;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0018\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0018\u00010\u0010R\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Ln6/d$b;", "", "Ln6/d$c;", "Ln6/d;", "entry", "<init>", "(Ln6/d;Ln6/d$c;)V", "", "index", "Lwu/h0;", "f", "(I)Lwu/h0;", "", "e", "()V", j6.b.f21518e, "Ln6/d$d;", "c", "()Ln6/d$d;", ve.a.f33391e, "", "success", rl.d.f30696a, "(Z)V", "Ln6/d$c;", "g", "()Ln6/d$c;", "Z", "closed", "", "[Z", "h", "()[Z", "written", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final c entry;

        /* renamed from: b, reason: from kotlin metadata */
        public boolean closed;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final boolean[] written;

        public b(@NotNull c cVar) {
            this.entry = cVar;
            this.written = new boolean[d.this.valueCount];
        }

        public final void a() {
            d(false);
        }

        public final void b() {
            d(true);
        }

        @Nullable
        public final C0455d c() {
            C0455d y10;
            Object obj = d.this.lock;
            d dVar = d.this;
            synchronized (obj) {
                b();
                y10 = dVar.y(this.entry.getKey());
            }
            return y10;
        }

        public final void d(boolean success) {
            Object obj = d.this.lock;
            d dVar = d.this;
            synchronized (obj) {
                try {
                    if (this.closed) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (Intrinsics.c(this.entry.getCurrentEditor(), this)) {
                        dVar.u(this, success);
                    }
                    this.closed = true;
                    Unit unit = Unit.f22894a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void e() {
            if (Intrinsics.c(this.entry.getCurrentEditor(), this)) {
                this.entry.m(true);
            }
        }

        @NotNull
        public final h0 f(int index) {
            h0 h0Var;
            Object obj = d.this.lock;
            d dVar = d.this;
            synchronized (obj) {
                if (this.closed) {
                    throw new IllegalStateException("editor is closed");
                }
                this.written[index] = true;
                h0 h0Var2 = this.entry.c().get(index);
                l.b(dVar.fileSystem, h0Var2, false, 2, null);
                h0Var = h0Var2;
            }
            return h0Var;
        }

        @NotNull
        /* renamed from: g, reason: from getter */
        public final c getEntry() {
            return this.entry;
        }

        @NotNull
        /* renamed from: h, reason: from getter */
        public final boolean[] getWritten() {
            return this.written;
        }
    }

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0018\u00010\u000fR\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR'\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0013\u0010\"R'\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b \u0010\"R\"\u0010+\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R(\u00105\u001a\b\u0018\u000100R\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u00101\u001a\u0004\b\u0018\u00102\"\u0004\b3\u00104R\"\u0010;\u001a\u0002068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u00107\u001a\u0004\b,\u00108\"\u0004\b9\u0010:¨\u0006<"}, d2 = {"Ln6/d$c;", "", "", "key", "<init>", "(Ln6/d;Ljava/lang/String;)V", "", "strings", "", "j", "(Ljava/util/List;)V", "Lwu/f;", "writer", "o", "(Lwu/f;)V", "Ln6/d$d;", "Ln6/d;", "n", "()Ln6/d$d;", ve.a.f33391e, "Ljava/lang/String;", rl.d.f30696a, "()Ljava/lang/String;", "", j6.b.f21518e, "[J", "e", "()[J", "lengths", "Ljava/util/ArrayList;", "Lwu/h0;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "cleanFiles", "dirtyFiles", "", "Z", "g", "()Z", "l", "(Z)V", "readable", "f", "h", "m", "zombie", "Ln6/d$b;", "Ln6/d$b;", "()Ln6/d$b;", "i", "(Ln6/d$b;)V", "currentEditor", "", "I", "()I", "k", "(I)V", "lockingSnapshotCount", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String key;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final long[] lengths;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ArrayList<h0> cleanFiles;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ArrayList<h0> dirtyFiles;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        public boolean readable;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        public boolean zombie;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public b currentEditor;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        public int lockingSnapshotCount;

        public c(@NotNull String str) {
            this.key = str;
            this.lengths = new long[d.this.valueCount];
            this.cleanFiles = new ArrayList<>(d.this.valueCount);
            this.dirtyFiles = new ArrayList<>(d.this.valueCount);
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            int i10 = d.this.valueCount;
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(i11);
                this.cleanFiles.add(d.this.directory.n(sb2.toString()));
                sb2.append(".tmp");
                this.dirtyFiles.add(d.this.directory.n(sb2.toString()));
                sb2.setLength(length);
            }
        }

        @NotNull
        public final ArrayList<h0> a() {
            return this.cleanFiles;
        }

        @Nullable
        /* renamed from: b, reason: from getter */
        public final b getCurrentEditor() {
            return this.currentEditor;
        }

        @NotNull
        public final ArrayList<h0> c() {
            return this.dirtyFiles;
        }

        @NotNull
        /* renamed from: d, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @NotNull
        /* renamed from: e, reason: from getter */
        public final long[] getLengths() {
            return this.lengths;
        }

        /* renamed from: f, reason: from getter */
        public final int getLockingSnapshotCount() {
            return this.lockingSnapshotCount;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getReadable() {
            return this.readable;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getZombie() {
            return this.zombie;
        }

        public final void i(@Nullable b bVar) {
            this.currentEditor = bVar;
        }

        public final void j(@NotNull List<String> strings) {
            if (strings.size() != d.this.valueCount) {
                throw new IOException("unexpected journal line: " + strings);
            }
            try {
                int size = strings.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.lengths[i10] = Long.parseLong(strings.get(i10));
                }
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + strings);
            }
        }

        public final void k(int i10) {
            this.lockingSnapshotCount = i10;
        }

        public final void l(boolean z10) {
            this.readable = z10;
        }

        public final void m(boolean z10) {
            this.zombie = z10;
        }

        @Nullable
        public final C0455d n() {
            if (!this.readable || this.currentEditor != null || this.zombie) {
                return null;
            }
            ArrayList<h0> arrayList = this.cleanFiles;
            d dVar = d.this;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!dVar.fileSystem.exists(arrayList.get(i10))) {
                    try {
                        dVar.W(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
            }
            this.lockingSnapshotCount++;
            return d.this.new C0455d(this);
        }

        public final void o(@NotNull wu.f writer) {
            for (long j10 : this.lengths) {
                writer.writeByte(32).y1(j10);
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0018\u00010\u0010R\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0005\u001a\u00060\u0003R\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln6/d$d;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Ln6/d$c;", "Ln6/d;", "entry", "<init>", "(Ln6/d;Ln6/d$c;)V", "", "index", "Lwu/h0;", j6.b.f21518e, "(I)Lwu/h0;", "", "close", "()V", "Ln6/d$b;", ve.a.f33391e, "()Ln6/d$b;", "Ln6/d$c;", "getEntry", "()Ln6/d$c;", "", "Z", "closed", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: n6.d$d, reason: collision with other inner class name */
    public final class C0455d implements AutoCloseable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final c entry;

        /* renamed from: b, reason: from kotlin metadata */
        public boolean closed;

        public C0455d(@NotNull c cVar) {
            this.entry = cVar;
        }

        @Nullable
        public final b a() {
            b x10;
            Object obj = d.this.lock;
            d dVar = d.this;
            synchronized (obj) {
                close();
                x10 = dVar.x(this.entry.getKey());
            }
            return x10;
        }

        @NotNull
        public final h0 b(int index) {
            if (this.closed) {
                throw new IllegalStateException("snapshot is closed");
            }
            return this.entry.a().get(index);
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Object obj = d.this.lock;
            d dVar = d.this;
            synchronized (obj) {
                try {
                    this.entry.k(r2.getLockingSnapshotCount() - 1);
                    if (this.entry.getLockingSnapshotCount() == 0 && this.entry.getZombie()) {
                        dVar.W(this.entry);
                    }
                    Unit unit = Unit.f22894a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"n6/d$e", "Lwu/n;", "Lwu/h0;", "file", "", "mustCreate", "Lwu/p0;", "sink", "(Lwu/h0;Z)Lwu/p0;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e extends n {
        public e(wu.l lVar) {
            super(lVar);
        }

        @Override // wu.n, wu.l
        public wu.p0 sink(h0 file, boolean mustCreate) {
            h0 j10 = file.j();
            if (j10 != null) {
                createDirectories(j10);
            }
            return super.sink(file, mustCreate);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "coil3.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", l = {}, m = "invokeSuspend")
    public static final class f extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f25806t;

        public f(mt.b<? super f> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return d.this.new f(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f25806t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            Object obj2 = d.this.lock;
            d dVar = d.this;
            synchronized (obj2) {
                if (!dVar.initialized || dVar.closed) {
                    return Unit.f22894a;
                }
                try {
                    dVar.Y();
                } catch (IOException unused) {
                    dVar.mostRecentTrimFailed = true;
                }
                try {
                    if (dVar.F()) {
                        dVar.a0();
                    }
                } catch (IOException unused2) {
                    dVar.mostRecentRebuildFailed = true;
                    dVar.journalWriter = b0.b(b0.a());
                }
                return Unit.f22894a;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public d(@NotNull wu.l lVar, @NotNull h0 h0Var, @NotNull CoroutineContext coroutineContext, long j10, int i10, int i11) {
        this.directory = h0Var;
        this.maxSize = j10;
        this.appVersion = i10;
        this.valueCount = i11;
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.journalFile = h0Var.n("journal");
        this.journalFileTmp = h0Var.n("journal.tmp");
        this.journalFileBackup = h0Var.n("journal.bkp");
        this.lruEntries = e7.d.b(0, 0.0f, 3, null);
        CoroutineContext plus = coroutineContext.plus(z2.b(null, 1, null));
        l0 j11 = e7.h0.j(coroutineContext);
        this.cleanupScope = q0.a(plus.plus(l0.U(j11 == null ? e7.f.a() : j11, 1, null, 2, null)));
        this.lock = new Object();
        this.fileSystem = new e(lVar);
    }

    public static final Unit L(d dVar, IOException iOException) {
        dVar.hasJournalErrors = true;
        return Unit.f22894a;
    }

    public final void B() {
        synchronized (this.lock) {
            try {
                if (this.initialized) {
                    return;
                }
                this.fileSystem.delete(this.journalFileTmp);
                if (this.fileSystem.exists(this.journalFileBackup)) {
                    if (this.fileSystem.exists(this.journalFile)) {
                        this.fileSystem.delete(this.journalFileBackup);
                    } else {
                        this.fileSystem.atomicMove(this.journalFileBackup, this.journalFile);
                    }
                }
                if (this.fileSystem.exists(this.journalFile)) {
                    try {
                        P();
                        M();
                        this.initialized = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            w();
                            this.closed = false;
                        } catch (Throwable th2) {
                            this.closed = false;
                            throw th2;
                        }
                    }
                }
                a0();
                this.initialized = true;
                Unit unit = Unit.f22894a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean F() {
        return this.operationsSinceRewrite >= 2000;
    }

    public final void H() {
        k.d(this.cleanupScope, null, null, new f(null), 3, null);
    }

    public final wu.f I() {
        return b0.b(new n6.e(this.fileSystem.appendingSink(this.journalFile), new Function1() { // from class: n6.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit L;
                L = d.L(d.this, (IOException) obj);
                return L;
            }
        }));
    }

    public final void M() {
        Iterator<c> it = this.lruEntries.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            c next = it.next();
            int i10 = 0;
            if (next.getCurrentEditor() == null) {
                int i11 = this.valueCount;
                while (i10 < i11) {
                    j10 += next.getLengths()[i10];
                    i10++;
                }
            } else {
                next.i(null);
                int i12 = this.valueCount;
                while (i10 < i12) {
                    this.fileSystem.delete(next.a().get(i10));
                    this.fileSystem.delete(next.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.size = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P() {
        /*
            r10 = this;
            java.lang.String r0 = ", "
            n6.d$e r1 = r10.fileSystem
            wu.h0 r2 = r10.journalFile
            wu.r0 r1 = r1.source(r2)
            wu.g r1 = wu.b0.c(r1)
            java.lang.String r2 = r1.Z0()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = r1.Z0()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = r1.Z0()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = r1.Z0()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r6 = r1.Z0()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = kotlin.jvm.internal.Intrinsics.c(r7, r2)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L82
            java.lang.String r7 = "1"
            boolean r7 = kotlin.jvm.internal.Intrinsics.c(r7, r3)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L82
            int r7 = r10.appVersion     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L5b
            boolean r7 = kotlin.jvm.internal.Intrinsics.c(r7, r4)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L82
            int r7 = r10.valueCount     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L5b
            boolean r7 = kotlin.jvm.internal.Intrinsics.c(r7, r5)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L82
            int r7 = r6.length()     // Catch: java.lang.Throwable -> L5b
            if (r7 > 0) goto L82
            r0 = 0
        L51:
            java.lang.String r2 = r1.Z0()     // Catch: java.lang.Throwable -> L5b java.io.EOFException -> L5d
            r10.U(r2)     // Catch: java.lang.Throwable -> L5b java.io.EOFException -> L5d
            int r0 = r0 + 1
            goto L51
        L5b:
            r0 = move-exception
            goto Lb6
        L5d:
            java.util.Map<java.lang.String, n6.d$c> r2 = r10.lruEntries     // Catch: java.lang.Throwable -> L5b
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L5b
            int r0 = r0 - r2
            r10.operationsSinceRewrite = r0     // Catch: java.lang.Throwable -> L5b
            boolean r0 = r1.X1()     // Catch: java.lang.Throwable -> L5b
            if (r0 != 0) goto L70
            r10.a0()     // Catch: java.lang.Throwable -> L5b
            goto L76
        L70:
            wu.f r0 = r10.I()     // Catch: java.lang.Throwable -> L5b
            r10.journalWriter = r0     // Catch: java.lang.Throwable -> L5b
        L76:
            kotlin.Unit r0 = kotlin.Unit.f22894a     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L80
            r1.close()     // Catch: java.lang.Throwable -> L7e
            goto L80
        L7e:
            r0 = move-exception
            goto Lc0
        L80:
            r0 = 0
            goto Lc0
        L82:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> L5b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r8.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r9 = "unexpected journal header: ["
            r8.append(r9)     // Catch: java.lang.Throwable -> L5b
            r8.append(r2)     // Catch: java.lang.Throwable -> L5b
            r8.append(r0)     // Catch: java.lang.Throwable -> L5b
            r8.append(r3)     // Catch: java.lang.Throwable -> L5b
            r8.append(r0)     // Catch: java.lang.Throwable -> L5b
            r8.append(r4)     // Catch: java.lang.Throwable -> L5b
            r8.append(r0)     // Catch: java.lang.Throwable -> L5b
            r8.append(r5)     // Catch: java.lang.Throwable -> L5b
            r8.append(r0)     // Catch: java.lang.Throwable -> L5b
            r8.append(r6)     // Catch: java.lang.Throwable -> L5b
            r0 = 93
            r8.append(r0)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L5b
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L5b
            throw r7     // Catch: java.lang.Throwable -> L5b
        Lb6:
            if (r1 == 0) goto Lc0
            r1.close()     // Catch: java.lang.Throwable -> Lbc
            goto Lc0
        Lbc:
            r1 = move-exception
            gt.a.a(r0, r1)
        Lc0:
            if (r0 != 0) goto Lc3
            return
        Lc3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.d.P():void");
    }

    public final void U(String line) {
        String substring;
        int m02 = StringsKt.m0(line, ' ', 0, false, 6, null);
        if (m02 == -1) {
            throw new IOException("unexpected journal line: " + line);
        }
        int i10 = m02 + 1;
        int m03 = StringsKt.m0(line, ' ', i10, false, 4, null);
        if (m03 == -1) {
            substring = line.substring(i10);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            if (m02 == 6 && x.T(line, "REMOVE", false, 2, null)) {
                this.lruEntries.remove(substring);
                return;
            }
        } else {
            substring = line.substring(i10, m03);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        }
        Map<String, c> map = this.lruEntries;
        c cVar = map.get(substring);
        if (cVar == null) {
            cVar = new c(substring);
            map.put(substring, cVar);
        }
        c cVar2 = cVar;
        if (m03 != -1 && m02 == 5 && x.T(line, "CLEAN", false, 2, null)) {
            String substring2 = line.substring(m03 + 1);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            List<String> P0 = StringsKt.P0(substring2, new char[]{' '}, false, 0, 6, null);
            cVar2.l(true);
            cVar2.i(null);
            cVar2.j(P0);
            return;
        }
        if (m03 == -1 && m02 == 5 && x.T(line, "DIRTY", false, 2, null)) {
            cVar2.i(new b(cVar2));
            return;
        }
        if (m03 == -1 && m02 == 4 && x.T(line, "READ", false, 2, null)) {
            return;
        }
        throw new IOException("unexpected journal line: " + line);
    }

    public final boolean W(c entry) {
        wu.f fVar;
        if (entry.getLockingSnapshotCount() > 0 && (fVar = this.journalWriter) != null) {
            fVar.A0("DIRTY");
            fVar.writeByte(32);
            fVar.A0(entry.getKey());
            fVar.writeByte(10);
            fVar.flush();
        }
        if (entry.getLockingSnapshotCount() > 0 || entry.getCurrentEditor() != null) {
            entry.m(true);
            return true;
        }
        int i10 = this.valueCount;
        for (int i11 = 0; i11 < i10; i11++) {
            this.fileSystem.delete(entry.a().get(i11));
            this.size -= entry.getLengths()[i11];
            entry.getLengths()[i11] = 0;
        }
        this.operationsSinceRewrite++;
        wu.f fVar2 = this.journalWriter;
        if (fVar2 != null) {
            fVar2.A0("REMOVE");
            fVar2.writeByte(32);
            fVar2.A0(entry.getKey());
            fVar2.writeByte(10);
            fVar2.flush();
        }
        this.lruEntries.remove(entry.getKey());
        if (F()) {
            H();
        }
        return true;
    }

    public final boolean X() {
        for (c cVar : this.lruEntries.values()) {
            if (!cVar.getZombie()) {
                W(cVar);
                return true;
            }
        }
        return false;
    }

    public final void Y() {
        while (this.size > this.maxSize) {
            if (!X()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    public final void Z(String key) {
        if (f25774u.f(key)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + key + '\"').toString());
    }

    public final void a0() {
        Throwable th2;
        synchronized (this.lock) {
            try {
                wu.f fVar = this.journalWriter;
                if (fVar != null) {
                    fVar.close();
                }
                wu.f b10 = b0.b(this.fileSystem.sink(this.journalFileTmp, false));
                try {
                    b10.A0("libcore.io.DiskLruCache").writeByte(10);
                    b10.A0("1").writeByte(10);
                    b10.y1(this.appVersion).writeByte(10);
                    b10.y1(this.valueCount).writeByte(10);
                    b10.writeByte(10);
                    for (c cVar : this.lruEntries.values()) {
                        if (cVar.getCurrentEditor() != null) {
                            b10.A0("DIRTY");
                            b10.writeByte(32);
                            b10.A0(cVar.getKey());
                            b10.writeByte(10);
                        } else {
                            b10.A0("CLEAN");
                            b10.writeByte(32);
                            b10.A0(cVar.getKey());
                            cVar.o(b10);
                            b10.writeByte(10);
                        }
                    }
                    Unit unit = Unit.f22894a;
                    if (b10 != null) {
                        try {
                            b10.close();
                        } catch (Throwable th3) {
                            th2 = th3;
                        }
                    }
                    th2 = null;
                } catch (Throwable th4) {
                    if (b10 != null) {
                        try {
                            b10.close();
                        } catch (Throwable th5) {
                            gt.a.a(th4, th5);
                        }
                    }
                    th2 = th4;
                }
                if (th2 != null) {
                    throw th2;
                }
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.atomicMove(this.journalFile, this.journalFileBackup);
                    this.fileSystem.atomicMove(this.journalFileTmp, this.journalFile);
                    this.fileSystem.delete(this.journalFileBackup);
                } else {
                    this.fileSystem.atomicMove(this.journalFileTmp, this.journalFile);
                }
                this.journalWriter = I();
                this.operationsSinceRewrite = 0;
                this.hasJournalErrors = false;
                this.mostRecentRebuildFailed = false;
                Unit unit2 = Unit.f22894a;
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            try {
                if (this.initialized && !this.closed) {
                    for (c cVar : (c[]) this.lruEntries.values().toArray(new c[0])) {
                        b currentEditor = cVar.getCurrentEditor();
                        if (currentEditor != null) {
                            currentEditor.e();
                        }
                    }
                    Y();
                    q0.f(this.cleanupScope, null, 1, null);
                    wu.f fVar = this.journalWriter;
                    Intrinsics.checkNotNull(fVar);
                    fVar.close();
                    this.journalWriter = null;
                    this.closed = true;
                    Unit unit = Unit.f22894a;
                    return;
                }
                this.closed = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void s() {
        if (this.closed) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final void u(b editor, boolean success) {
        synchronized (this.lock) {
            c entry = editor.getEntry();
            if (!Intrinsics.c(entry.getCurrentEditor(), editor)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!success || entry.getZombie()) {
                int i10 = this.valueCount;
                for (int i11 = 0; i11 < i10; i11++) {
                    this.fileSystem.delete(entry.c().get(i11));
                }
            } else {
                int i12 = this.valueCount;
                for (int i13 = 0; i13 < i12; i13++) {
                    if (editor.getWritten()[i13] && !this.fileSystem.exists(entry.c().get(i13))) {
                        editor.a();
                        return;
                    }
                }
                int i14 = this.valueCount;
                for (int i15 = 0; i15 < i14; i15++) {
                    h0 h0Var = entry.c().get(i15);
                    h0 h0Var2 = entry.a().get(i15);
                    if (this.fileSystem.exists(h0Var)) {
                        this.fileSystem.atomicMove(h0Var, h0Var2);
                    } else {
                        l.b(this.fileSystem, entry.a().get(i15), false, 2, null);
                    }
                    long j10 = entry.getLengths()[i15];
                    Long size = this.fileSystem.metadata(h0Var2).getSize();
                    long longValue = size != null ? size.longValue() : 0L;
                    entry.getLengths()[i15] = longValue;
                    this.size = (this.size - j10) + longValue;
                }
            }
            entry.i(null);
            if (entry.getZombie()) {
                W(entry);
                return;
            }
            this.operationsSinceRewrite++;
            wu.f fVar = this.journalWriter;
            Intrinsics.checkNotNull(fVar);
            if (!success && !entry.getReadable()) {
                this.lruEntries.remove(entry.getKey());
                fVar.A0("REMOVE");
                fVar.writeByte(32);
                fVar.A0(entry.getKey());
                fVar.writeByte(10);
                fVar.flush();
                if (this.size <= this.maxSize || F()) {
                    H();
                }
                Unit unit = Unit.f22894a;
            }
            entry.l(true);
            fVar.A0("CLEAN");
            fVar.writeByte(32);
            fVar.A0(entry.getKey());
            entry.o(fVar);
            fVar.writeByte(10);
            fVar.flush();
            if (this.size <= this.maxSize) {
            }
            H();
            Unit unit2 = Unit.f22894a;
        }
    }

    public final void w() {
        close();
        l.c(this.fileSystem, this.directory);
    }

    @Nullable
    public final b x(@NotNull String key) {
        synchronized (this.lock) {
            s();
            Z(key);
            B();
            c cVar = this.lruEntries.get(key);
            if ((cVar != null ? cVar.getCurrentEditor() : null) != null) {
                return null;
            }
            if (cVar != null && cVar.getLockingSnapshotCount() != 0) {
                return null;
            }
            if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
                wu.f fVar = this.journalWriter;
                Intrinsics.checkNotNull(fVar);
                fVar.A0("DIRTY");
                fVar.writeByte(32);
                fVar.A0(key);
                fVar.writeByte(10);
                fVar.flush();
                if (this.hasJournalErrors) {
                    return null;
                }
                if (cVar == null) {
                    cVar = new c(key);
                    this.lruEntries.put(key, cVar);
                }
                b bVar = new b(cVar);
                cVar.i(bVar);
                return bVar;
            }
            H();
            return null;
        }
    }

    @Nullable
    public final C0455d y(@NotNull String key) {
        C0455d n10;
        synchronized (this.lock) {
            s();
            Z(key);
            B();
            c cVar = this.lruEntries.get(key);
            if (cVar != null && (n10 = cVar.n()) != null) {
                this.operationsSinceRewrite++;
                wu.f fVar = this.journalWriter;
                Intrinsics.checkNotNull(fVar);
                fVar.A0("READ");
                fVar.writeByte(32);
                fVar.A0(key);
                fVar.writeByte(10);
                fVar.flush();
                if (F()) {
                    H();
                }
                return n10;
            }
            return null;
        }
    }
}

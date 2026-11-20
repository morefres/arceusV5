package kk;

import android.content.Context;
import android.content.res.AssetManager;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.roblox.client.RobloxApplication;
import ek.q;
import gt.n;
import gt.o;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import ju.g1;
import ju.k;
import ju.l0;
import ju.p0;
import ju.q0;
import ju.r0;
import ju.t1;
import ju.v1;
import ju.w0;
import ju.z2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 C2\u00020\u0001:\u00015B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u001c\u0010\u0019J\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b\u001f\u0010 J'\u0010%\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u001dH\u0002¢\u0006\u0004\b%\u0010&J'\u0010'\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u001dH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)H\u0002¢\u0006\u0004\b,\u0010-J+\u00103\u001a\u000200*\u00020)2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u000200H\u0002¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000b0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lkk/c;", "", "Landroid/content/Context;", "context", "Lju/l0;", "mainDispatcher", "ioDispatcher", "unpackDispatcher", "<init>", "(Landroid/content/Context;Lju/l0;Lju/l0;Lju/l0;)V", "Ljava/util/concurrent/CompletableFuture;", "", "q", "()Ljava/util/concurrent/CompletableFuture;", "Ljava/util/function/Consumer;", "onPathReady", "", "s", "(Ljava/util/function/Consumer;)V", "r", "()Ljava/lang/String;", "", "j", "()Z", "w", "(Lmt/b;)Ljava/lang/Object;", "x", "()V", "v", "Ljava/nio/file/Path;", "baseDir", "o", "(Ljava/nio/file/Path;Lmt/b;)Ljava/lang/Object;", "Landroid/content/res/AssetManager;", "assetManager", "assetName", "destination", "m", "(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/nio/file/Path;)Z", "l", "(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/nio/file/Path;)V", "Ljava/io/InputStream;", "first", "second", "k", "(Ljava/io/InputStream;Ljava/io/InputStream;)Z", "", "buffer", "", "offset", "length", "u", "(Ljava/io/InputStream;[BII)I", ve.a.f33391e, "Landroid/content/Context;", j6.b.f21518e, "Lju/l0;", "c", rl.d.f30696a, "Lju/p0;", "e", "Lju/p0;", "scope", "Lju/w0;", "f", "Lju/w0;", "pathDeferred", "g", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public static final gt.h<t1> f22727h = gt.i.b(new Function0() { // from class: kk.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            t1 n10;
            n10 = c.n();
            return n10;
        }
    });

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public static final gt.h<c> f22728i = gt.i.b(new Function0() { // from class: kk.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            c t8;
            t8 = c.t();
            return t8;
        }
    });

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final l0 mainDispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 ioDispatcher;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 unpackDispatcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 scope;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final w0<String> pathDeferred;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000f\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkk/c$a;", "", "<init>", "()V", "Lkk/c;", "c", "()Lkk/c;", "Lju/l0;", "dedicatedUnpackDispatcher$delegate", "Lgt/h;", j6.b.f21518e, "()Lju/l0;", "dedicatedUnpackDispatcher", "instance$delegate", rl.d.f30696a, "instance", "", "CACERT_RELATIVE_PATH", "Ljava/lang/String;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: kk.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l0 b() {
            return (l0) c.f22727h.getValue();
        }

        @NotNull
        public final c c() {
            return d();
        }

        public final c d() {
            return (c) c.f22728i.getValue();
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.engine.AndroidAssetsHelper$ensureNeededDirsExist$2", f = "AndroidAssetsHelper.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f22734t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f22735u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Path f22736v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Path path, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f22736v = path;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            b bVar2 = new b(this.f22736v, bVar);
            bVar2.f22735u = obj;
            return bVar2;
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object b;
            nt.c.e();
            if (this.f22734t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            List<String> n10 = p.n("content", "ExtraContent", "android");
            Path path = this.f22736v;
            for (String str : n10) {
                try {
                    n.Companion companion = n.INSTANCE;
                    Path resolve = path.resolve(str);
                    if (!Files.exists(resolve, new LinkOption[0])) {
                        Files.createDirectories(resolve, new FileAttribute[0]);
                        q.b("rbx.xapkmanager", "Created missing directory: " + resolve);
                    }
                    b = n.b(Unit.f22894a);
                } catch (Throwable th2) {
                    n.Companion companion2 = n.INSTANCE;
                    b = n.b(o.a(th2));
                }
                Throwable e10 = n.e(b);
                if (e10 != null) {
                    try {
                        n.b(ot.b.c(q.f("rbx.xapkmanager", "Failed to create directory: " + str, e10)));
                    } catch (Throwable th3) {
                        n.Companion companion3 = n.INSTANCE;
                        n.b(o.a(th3));
                    }
                }
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.engine.AndroidAssetsHelper$getPathBlocking$1", f = "AndroidAssetsHelper.kt", l = {74}, m = "invokeSuspend", v = 1)
    /* renamed from: kk.c$c, reason: collision with other inner class name */
    public static final class C0400c extends m implements Function2<p0, mt.b<? super String>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f22737t;

        public C0400c(mt.b<? super C0400c> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return c.this.new C0400c(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f22737t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            w0 w0Var = c.this.pathDeferred;
            this.f22737t = 1;
            Object w5 = w0Var.w(this);
            return w5 == e10 ? e10 : w5;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super String> bVar) {
            return ((C0400c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.engine.AndroidAssetsHelper$getPathWithCallback$1", f = "AndroidAssetsHelper.kt", l = {65, 66}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f22739t;

        /* renamed from: u, reason: collision with root package name */
        public int f22740u;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Consumer<String> f22742w;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.roblox.engine.AndroidAssetsHelper$getPathWithCallback$1$1", f = "AndroidAssetsHelper.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f22743t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ Consumer<String> f22744u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f22745v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Consumer<String> consumer, String str, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f22744u = consumer;
                this.f22745v = str;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new a(this.f22744u, this.f22745v, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                nt.c.e();
                if (this.f22743t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                this.f22744u.accept(this.f22745v);
                return Unit.f22894a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Consumer<String> consumer, mt.b<? super d> bVar) {
            super(2, bVar);
            this.f22742w = consumer;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return c.this.new d(this.f22742w, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
        
            if (ju.i.g(r1, r3, r6) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
        
            if (r7 == r0) goto L15;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r6.f22740u
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r6.f22739t
                java.lang.String r0 = (java.lang.String) r0
                gt.o.b(r7)
                goto L53
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                gt.o.b(r7)
                goto L34
            L22:
                gt.o.b(r7)
                kk.c r7 = kk.c.this
                ju.w0 r7 = kk.c.h(r7)
                r6.f22740u = r3
                java.lang.Object r7 = r7.w(r6)
                if (r7 != r0) goto L34
                goto L52
            L34:
                java.lang.String r7 = (java.lang.String) r7
                kk.c r1 = kk.c.this
                ju.l0 r1 = kk.c.g(r1)
                kk.c$d$a r3 = new kk.c$d$a
                java.util.function.Consumer<java.lang.String> r4 = r6.f22742w
                r5 = 0
                r3.<init>(r4, r7, r5)
                java.lang.Object r7 = ot.l.a(r7)
                r6.f22739t = r7
                r6.f22740u = r2
                java.lang.Object r7 = ju.i.g(r1, r3, r6)
                if (r7 != r0) goto L53
            L52:
                return r0
            L53:
                kotlin.Unit r7 = kotlin.Unit.f22894a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kk.c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.engine.AndroidAssetsHelper$pathDeferred$1", f = "AndroidAssetsHelper.kt", l = {MotionEventCompat.AXIS_GENERIC_16}, m = "invokeSuspend", v = 1)
    public static final class e extends m implements Function2<p0, mt.b<? super String>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f22746t;

        public e(mt.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return c.this.new e(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f22746t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            c cVar = c.this;
            this.f22746t = 1;
            Object v5 = cVar.v(this);
            return v5 == e10 ? e10 : v5;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super String> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.engine.AndroidAssetsHelper", f = "AndroidAssetsHelper.kt", l = {84, 86}, m = "unpackAssetsInternal", v = 1)
    public static final class f extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f22748t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f22749u;

        /* renamed from: w, reason: collision with root package name */
        public int f22751w;

        public f(mt.b<? super f> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22749u = obj;
            this.f22751w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return c.this.v(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)Ljava/nio/file/Path;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.engine.AndroidAssetsHelper$unpackAssetsInternal$cachedAssetsPath$1", f = "AndroidAssetsHelper.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class g extends m implements Function2<p0, mt.b<? super Path>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f22752t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Path f22753u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Path path, mt.b<? super g> bVar) {
            super(2, bVar);
            this.f22753u = path;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new g(this.f22753u, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f22752t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return this.f22753u.resolve("content").toRealPath(new LinkOption[0]);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Path> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.engine.AndroidAssetsHelper", f = "AndroidAssetsHelper.kt", l = {118}, m = "updateCaCert", v = 1)
    public static final class h extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f22754t;

        /* renamed from: u, reason: collision with root package name */
        public int f22755u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f22756v;

        /* renamed from: x, reason: collision with root package name */
        public int f22758x;

        public h(mt.b<? super h> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22756v = obj;
            this.f22758x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return c.this.w(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)I"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.engine.AndroidAssetsHelper$updateCaCert$2$1", f = "AndroidAssetsHelper.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class i extends m implements Function2<p0, mt.b<? super Integer>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f22759t;

        public i(mt.b<? super i> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return c.this.new i(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f22759t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            c cVar = c.this;
            AssetManager assets = cVar.context.getAssets();
            Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
            Path resolve = c.this.context.getFilesDir().toPath().resolve("exe/ssl/cacert.pem");
            Intrinsics.checkNotNullExpressionValue(resolve, "resolve(...)");
            return ot.b.c(cVar.m(assets, "ssl/cacert.pem", resolve) ? q.b("rbx.xapkmanager", "cacert.pem was updated from assets.") : q.b("rbx.xapkmanager", "cacert.pem is already up to date; no copy needed."));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Integer> bVar) {
            return ((i) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.engine.AndroidAssetsHelper$updateCaCertBlocking$1", f = "AndroidAssetsHelper.kt", l = {137}, m = "invokeSuspend", v = 1)
    public static final class j extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f22761t;

        public j(mt.b<? super j> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return c.this.new j(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f22761t;
            if (i10 == 0) {
                o.b(obj);
                c cVar = c.this;
                this.f22761t = 1;
                if (cVar.w(this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((j) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public c(@NotNull Context context, @NotNull l0 mainDispatcher, @NotNull l0 ioDispatcher, @NotNull l0 unpackDispatcher) {
        w0<String> b10;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(unpackDispatcher, "unpackDispatcher");
        this.context = context;
        this.mainDispatcher = mainDispatcher;
        this.ioDispatcher = ioDispatcher;
        this.unpackDispatcher = unpackDispatcher;
        p0 a10 = q0.a(z2.b(null, 1, null).plus(unpackDispatcher));
        this.scope = a10;
        b10 = k.b(a10, null, r0.b, new e(null), 1, null);
        this.pathDeferred = b10;
    }

    public static final t1 n() {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(1, new f0().f("rbx-asset-unpack-%d").e(true).b());
        Intrinsics.checkNotNullExpressionValue(newFixedThreadPool, "newFixedThreadPool(...)");
        return v1.c(newFixedThreadPool);
    }

    @NotNull
    public static final c p() {
        return INSTANCE.c();
    }

    public static final c t() {
        Context f10 = RobloxApplication.f();
        if (f10 != null) {
            return new c(f10, null, null, rh.h.a().y2() ? INSTANCE.b() : g1.b(), 6, null);
        }
        throw new IllegalArgumentException("Application context is not available");
    }

    public final boolean j() {
        return this.pathDeferred.d() && !this.pathDeferred.isCancelled();
    }

    public final boolean k(InputStream first, InputStream second) {
        byte[] bArr = new byte[8192];
        byte[] bArr2 = new byte[8192];
        while (true) {
            try {
                try {
                    int u8 = u(first, bArr, 0, 8192);
                    if (u8 != u(second, bArr2, 0, 8192)) {
                        tt.c.a(second, null);
                        tt.c.a(first, null);
                        return false;
                    }
                    if (u8 == 0) {
                        tt.c.a(second, null);
                        tt.c.a(first, null);
                        return true;
                    }
                    for (int i10 = 0; i10 < u8; i10++) {
                        if (bArr[i10] != bArr2[i10]) {
                            tt.c.a(second, null);
                            tt.c.a(first, null);
                            return false;
                        }
                    }
                } finally {
                }
            } finally {
            }
        }
    }

    public final void l(AssetManager assetManager, String assetName, Path destination) {
        Path parent = destination.getParent();
        if (parent != null && !Files.exists(parent, new LinkOption[0])) {
            Files.createDirectories(parent, new FileAttribute[0]);
        }
        InputStream open = assetManager.open(assetName);
        try {
            Files.copy(open, destination, StandardCopyOption.REPLACE_EXISTING);
            tt.c.a(open, null);
        } finally {
        }
    }

    public final boolean m(AssetManager assetManager, String assetName, Path destination) {
        if (!Files.exists(destination, new LinkOption[0])) {
            l(assetManager, assetName, destination);
            return true;
        }
        InputStream open = assetManager.open(assetName);
        try {
            if (open.available() == Files.size(destination)) {
                Intrinsics.checkNotNull(open);
                InputStream newInputStream = Files.newInputStream(destination, new OpenOption[0]);
                Intrinsics.checkNotNullExpressionValue(newInputStream, "newInputStream(...)");
                if (k(open, newInputStream)) {
                    tt.c.a(open, null);
                    return false;
                }
            }
            Unit unit = Unit.f22894a;
            tt.c.a(open, null);
            l(assetManager, assetName, destination);
            return true;
        } finally {
        }
    }

    public final Object o(Path path, mt.b<? super Unit> bVar) {
        Object g10 = ju.i.g(this.unpackDispatcher, new b(path, null), bVar);
        return g10 == nt.c.e() ? g10 : Unit.f22894a;
    }

    @NotNull
    public final CompletableFuture<String> q() {
        this.pathDeferred.start();
        return ou.c.c(this.pathDeferred);
    }

    @NotNull
    public final String r() {
        return (String) ju.i.e(this.ioDispatcher, new C0400c(null));
    }

    public final void s(@NotNull Consumer<String> onPathReady) {
        Intrinsics.checkNotNullParameter(onPathReady, "onPathReady");
        k.d(this.scope, null, null, new d(onPathReady, null), 3, null);
    }

    public final int u(InputStream inputStream, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int read = inputStream.read(bArr, i10 + i12, bArr.length - i12);
            if (read == -1) {
                break;
            }
            i12 += read;
        }
        return i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (o(r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(mt.b<? super java.lang.String> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kk.c.f
            if (r0 == 0) goto L13
            r0 = r7
            kk.c$f r0 = (kk.c.f) r0
            int r1 = r0.f22751w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22751w = r1
            goto L18
        L13:
            kk.c$f r0 = new kk.c$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f22749u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f22751w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f22748t
            java.nio.file.Path r0 = (java.nio.file.Path) r0
            gt.o.b(r7)
            goto L75
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            java.lang.Object r2 = r0.f22748t
            java.nio.file.Path r2 = (java.nio.file.Path) r2
            gt.o.b(r7)
            goto L5e
        L40:
            gt.o.b(r7)
            android.content.Context r7 = r6.context
            java.lang.String r2 = "assets"
            r5 = 0
            java.io.File r7 = r7.getDir(r2, r5)
            java.nio.file.Path r2 = r7.toPath()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r0.f22748t = r2
            r0.f22751w = r4
            java.lang.Object r7 = r6.o(r2, r0)
            if (r7 != r1) goto L5e
            goto L74
        L5e:
            ju.l0 r7 = r6.unpackDispatcher
            kk.c$g r4 = new kk.c$g
            r5 = 0
            r4.<init>(r2, r5)
            java.lang.Object r2 = ot.l.a(r2)
            r0.f22748t = r2
            r0.f22751w = r3
            java.lang.Object r7 = ju.i.g(r7, r4, r0)
            if (r7 != r1) goto L75
        L74:
            return r1
        L75:
            java.nio.file.Path r7 = (java.nio.file.Path) r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unpackAssets: cached-asset-path = "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "rbx.xapkmanager"
            ek.q.b(r1, r0)
            java.io.File r7 = r7.toFile()
            java.lang.String r7 = r7.getPath()
            java.lang.String r0 = "getPath(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.c.v(mt.b):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|(1:15)|16|17))|28|6|7|(0)(0)|12|13|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002d, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        r0 = gt.n.INSTANCE;
        r6 = gt.n.b(gt.o.a(r6));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(@org.jetbrains.annotations.NotNull mt.b<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kk.c.h
            if (r0 == 0) goto L13
            r0 = r6
            kk.c$h r0 = (kk.c.h) r0
            int r1 = r0.f22758x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22758x = r1
            goto L18
        L13:
            kk.c$h r0 = new kk.c$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f22756v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f22758x
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f22754t
            kk.c r0 = (kk.c) r0
            gt.o.b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L56
        L2d:
            r6 = move-exception
            goto L65
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            gt.o.b(r6)
            gt.n$a r6 = gt.n.INSTANCE     // Catch: java.lang.Throwable -> L2d
            ju.l0 r6 = r5.ioDispatcher     // Catch: java.lang.Throwable -> L2d
            kk.c$i r2 = new kk.c$i     // Catch: java.lang.Throwable -> L2d
            r4 = 0
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r4 = ot.l.a(r5)     // Catch: java.lang.Throwable -> L2d
            r0.f22754t = r4     // Catch: java.lang.Throwable -> L2d
            r4 = 0
            r0.f22755u = r4     // Catch: java.lang.Throwable -> L2d
            r0.f22758x = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r6 = ju.i.g(r6, r2, r0)     // Catch: java.lang.Throwable -> L2d
            if (r6 != r1) goto L56
            return r1
        L56:
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.Throwable -> L2d
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r6 = ot.b.c(r6)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r6 = gt.n.b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L6f
        L65:
            gt.n$a r0 = gt.n.INSTANCE
            java.lang.Object r6 = gt.o.a(r6)
            java.lang.Object r6 = gt.n.b(r6)
        L6f:
            java.lang.Throwable r6 = gt.n.e(r6)
            if (r6 == 0) goto L84
            java.lang.String r0 = "rbx.xapkmanager"
            java.lang.String r1 = "Failed to update cacert.pem"
            int r6 = ek.q.f(r0, r1, r6)
            java.lang.Integer r6 = ot.b.c(r6)
            gt.n.b(r6)
        L84:
            kotlin.Unit r6 = kotlin.Unit.f22894a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.c.w(mt.b):java.lang.Object");
    }

    public final void x() {
        ju.i.e(this.ioDispatcher, new j(null));
    }

    public /* synthetic */ c(Context context, l0 l0Var, l0 l0Var2, l0 l0Var3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? g1.c() : l0Var, (i10 & 4) != 0 ? g1.b() : l0Var2, (i10 & 8) != 0 ? g1.b() : l0Var3);
    }
}

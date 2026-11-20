package y5;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import f6.WorkGenerationalId;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import ju.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http.HttpStatusCodesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x5.o0;
import y5.q1;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002/)B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\u0019J\u000f\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010\u001cJ\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010\u0012J\u001d\u0010&\u001a\u00020\u001d2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0$H\u0002¢\u0006\u0004\b&\u0010'R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0004\u0018\u0001088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010V\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010UR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Y\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00103R\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010[R\u0011\u0010_\u001a\u00020]8F¢\u0006\u0006\u001a\u0004\bW\u0010^¨\u0006`"}, d2 = {"Ly5/q1;", "", "Ly5/q1$a;", "builder", "<init>", "(Ly5/q1$a;)V", "Lne/x;", "", "r", "()Lne/x;", "", "stopReason", "", "p", "(I)V", "Landroidx/work/c$a;", "result", "A", "(Landroidx/work/c$a;)Z", "Ly5/q1$b;", "x", "(Lmt/b;)Ljava/lang/Object;", zl.t.f38095d, "s", "w", "(I)Z", "o", "C", "()Z", "", "workSpecId", "q", "(Ljava/lang/String;)V", "u", "v", "B", "", "tags", "l", "(Ljava/util/List;)Ljava/lang/String;", "Lf6/j0;", ve.a.f33391e, "Lf6/j0;", "n", "()Lf6/j0;", "workSpec", "Landroid/content/Context;", j6.b.f21518e, "Landroid/content/Context;", "appContext", "c", "Ljava/lang/String;", "Landroidx/work/WorkerParameters$a;", rl.d.f30696a, "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "Landroidx/work/c;", "e", "Landroidx/work/c;", "builderWorker", "Lh6/b;", "f", "Lh6/b;", "workTaskExecutor", "Landroidx/work/a;", "g", "Landroidx/work/a;", "configuration", "Lx5/b;", "h", "Lx5/b;", "clock", "Le6/a;", "i", "Le6/a;", "foregroundProcessor", "Landroidx/work/impl/WorkDatabase;", "j", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Lf6/k0;", "k", "Lf6/k0;", "workSpecDao", "Lf6/b;", "Lf6/b;", "dependencyDao", "m", "Ljava/util/List;", "workDescription", "Lju/a0;", "Lju/a0;", "workerJob", "Lf6/w;", "()Lf6/w;", "workGenerationalId", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f6.j0 workSpec;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context appContext;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String workSpecId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WorkerParameters.a runtimeExtras;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final androidx.work.c builderWorker;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h6.b workTaskExecutor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final androidx.work.a configuration;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x5.b clock;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e6.a foregroundProcessor;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WorkDatabase workDatabase;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f6.k0 workSpecDao;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f6.b dependencyDao;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> tags;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String workDescription;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ju.a0 workerJob;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b\u001d\u0010/R$\u00107\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u00108\u001a\u0004\b'\u00109\"\u0004\b:\u0010;¨\u0006<"}, d2 = {"Ly5/q1$a;", "", "Landroid/content/Context;", "context", "Landroidx/work/a;", "configuration", "Lh6/b;", "workTaskExecutor", "Le6/a;", "foregroundProcessor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Lf6/j0;", "workSpec", "", "", "tags", "<init>", "(Landroid/content/Context;Landroidx/work/a;Lh6/b;Le6/a;Landroidx/work/impl/WorkDatabase;Lf6/j0;Ljava/util/List;)V", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "k", "(Landroidx/work/WorkerParameters$a;)Ly5/q1$a;", "Ly5/q1;", ve.a.f33391e, "()Ly5/q1;", "Landroidx/work/a;", "c", "()Landroidx/work/a;", j6.b.f21518e, "Lh6/b;", "i", "()Lh6/b;", "Le6/a;", rl.d.f30696a, "()Le6/a;", "Landroidx/work/impl/WorkDatabase;", "g", "()Landroidx/work/impl/WorkDatabase;", "e", "Lf6/j0;", "h", "()Lf6/j0;", "f", "Ljava/util/List;", "()Ljava/util/List;", "Landroid/content/Context;", "()Landroid/content/Context;", "appContext", "Landroidx/work/c;", "Landroidx/work/c;", "j", "()Landroidx/work/c;", "setWorker", "(Landroidx/work/c;)V", "worker", "Landroidx/work/WorkerParameters$a;", "()Landroidx/work/WorkerParameters$a;", "setRuntimeExtras", "(Landroidx/work/WorkerParameters$a;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final androidx.work.a configuration;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final h6.b workTaskExecutor;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final e6.a foregroundProcessor;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final WorkDatabase workDatabase;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final f6.j0 workSpec;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<String> tags;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Context appContext;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public androidx.work.c worker;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public WorkerParameters.a runtimeExtras;

        @SuppressLint({"LambdaLast"})
        public a(@NotNull Context context, @NotNull androidx.work.a configuration, @NotNull h6.b workTaskExecutor, @NotNull e6.a foregroundProcessor, @NotNull WorkDatabase workDatabase, @NotNull f6.j0 workSpec, @NotNull List<String> tags) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
            Intrinsics.checkNotNullParameter(foregroundProcessor, "foregroundProcessor");
            Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
            Intrinsics.checkNotNullParameter(workSpec, "workSpec");
            Intrinsics.checkNotNullParameter(tags, "tags");
            this.configuration = configuration;
            this.workTaskExecutor = workTaskExecutor;
            this.foregroundProcessor = foregroundProcessor;
            this.workDatabase = workDatabase;
            this.workSpec = workSpec;
            this.tags = tags;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            this.appContext = applicationContext;
            this.runtimeExtras = new WorkerParameters.a();
        }

        @NotNull
        public final q1 a() {
            return new q1(this);
        }

        @NotNull
        /* renamed from: b, reason: from getter */
        public final Context getAppContext() {
            return this.appContext;
        }

        @NotNull
        /* renamed from: c, reason: from getter */
        public final androidx.work.a getConfiguration() {
            return this.configuration;
        }

        @NotNull
        /* renamed from: d, reason: from getter */
        public final e6.a getForegroundProcessor() {
            return this.foregroundProcessor;
        }

        @NotNull
        /* renamed from: e, reason: from getter */
        public final WorkerParameters.a getRuntimeExtras() {
            return this.runtimeExtras;
        }

        @NotNull
        public final List<String> f() {
            return this.tags;
        }

        @NotNull
        /* renamed from: g, reason: from getter */
        public final WorkDatabase getWorkDatabase() {
            return this.workDatabase;
        }

        @NotNull
        /* renamed from: h, reason: from getter */
        public final f6.j0 getWorkSpec() {
            return this.workSpec;
        }

        @NotNull
        /* renamed from: i, reason: from getter */
        public final h6.b getWorkTaskExecutor() {
            return this.workTaskExecutor;
        }

        @Nullable
        /* renamed from: j, reason: from getter */
        public final androidx.work.c getWorker() {
            return this.worker;
        }

        @NotNull
        public final a k(@Nullable WorkerParameters.a runtimeExtras) {
            if (runtimeExtras != null) {
                this.runtimeExtras = runtimeExtras;
            }
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Ly5/q1$b;", "", "<init>", "()V", "c", ve.a.f33391e, j6.b.f21518e, "Ly5/q1$b$a;", "Ly5/q1$b$b;", "Ly5/q1$b$c;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ly5/q1$b$a;", "Ly5/q1$b;", "Landroidx/work/c$a;", "result", "<init>", "(Landroidx/work/c$a;)V", ve.a.f33391e, "Landroidx/work/c$a;", "()Landroidx/work/c$a;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final c.a result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull c.a result) {
                super(null);
                Intrinsics.checkNotNullParameter(result, "result");
                this.result = result;
            }

            @NotNull
            /* renamed from: a, reason: from getter */
            public final c.a getResult() {
                return this.result;
            }

            public /* synthetic */ a(c.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? new c.a.C0062a() : aVar);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ly5/q1$b$b;", "Ly5/q1$b;", "Landroidx/work/c$a;", "result", "<init>", "(Landroidx/work/c$a;)V", ve.a.f33391e, "Landroidx/work/c$a;", "()Landroidx/work/c$a;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: y5.q1$b$b, reason: collision with other inner class name */
        public static final class C0673b extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final c.a result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0673b(@NotNull c.a result) {
                super(null);
                Intrinsics.checkNotNullParameter(result, "result");
                this.result = result;
            }

            @NotNull
            /* renamed from: a, reason: from getter */
            public final c.a getResult() {
                return this.result;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ly5/q1$b$c;", "Ly5/q1$b;", "", "reason", "<init>", "(I)V", ve.a.f33391e, "I", "()I", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final int reason;

            public c(int i10) {
                super(null);
                this.reason = i10;
            }

            /* renamed from: a, reason: from getter */
            public final int getReason() {
                return this.reason;
            }

            public /* synthetic */ c(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? InputDeviceCompat.SOURCE_ANY : i10);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "androidx.work.impl.WorkerWrapper$launch$1", f = "WorkerWrapper.kt", l = {98}, m = "invokeSuspend")
    public static final class c extends ot.m implements Function2<ju.p0, mt.b<? super Boolean>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f36453t;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Ly5/q1$b;", "<anonymous>", "(Lju/p0;)Ly5/q1$b;"}, k = 3, mv = {2, 1, 0})
        @ot.f(c = "androidx.work.impl.WorkerWrapper$launch$1$resolution$1", f = "WorkerWrapper.kt", l = {98}, m = "invokeSuspend")
        public static final class a extends ot.m implements Function2<ju.p0, mt.b<? super b>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f36455t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ q1 f36456u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q1 q1Var, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f36456u = q1Var;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new a(this.f36456u, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f36455t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    return obj;
                }
                gt.o.b(obj);
                q1 q1Var = this.f36456u;
                this.f36455t = 1;
                Object x10 = q1Var.x(this);
                return x10 == e10 ? e10 : x10;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ju.p0 p0Var, mt.b<? super b> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        public c(mt.b<? super c> bVar) {
            super(2, bVar);
        }

        public static final Boolean q(b bVar, q1 q1Var) {
            boolean w5;
            if (bVar instanceof b.C0673b) {
                w5 = q1Var.t(((b.C0673b) bVar).getResult());
            } else if (bVar instanceof b.a) {
                w5 = q1Var.s(((b.a) bVar).getResult());
            } else {
                if (!(bVar instanceof b.c)) {
                    throw new gt.l();
                }
                w5 = q1Var.w(((b.c) bVar).getReason());
            }
            return Boolean.valueOf(w5);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return q1.this.new c(bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            String str;
            final b aVar;
            Object e10 = nt.c.e();
            int i10 = this.f36453t;
            int i11 = 1;
            c.a aVar2 = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            try {
                if (i10 == 0) {
                    gt.o.b(obj);
                    ju.a0 a0Var = q1.this.workerJob;
                    a aVar3 = new a(q1.this, null);
                    this.f36453t = 1;
                    obj = ju.i.g(a0Var, aVar3, this);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                }
                aVar = (b) obj;
            } catch (h1 e11) {
                aVar = new b.c(e11.getReason());
            } catch (CancellationException unused) {
                aVar = new b.a(aVar2, i11, objArr3 == true ? 1 : 0);
            } catch (Throwable th2) {
                str = s1.f36479a;
                x5.w.e().d(str, "Unexpected error in WorkerWrapper", th2);
                aVar = new b.a(objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0);
            }
            WorkDatabase workDatabase = q1.this.workDatabase;
            final q1 q1Var = q1.this;
            Object P = workDatabase.P(new Callable() { // from class: y5.r1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Boolean q10;
                    q10 = q1.c.q(q1.b.this, q1Var);
                    return q10;
                }
            });
            Intrinsics.checkNotNullExpressionValue(P, "runInTransaction(...)");
            return P;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Boolean> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "androidx.work.impl.WorkerWrapper", f = "WorkerWrapper.kt", l = {296}, m = "runWorker")
    public static final class d extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f36457t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f36458u;

        /* renamed from: w, reason: collision with root package name */
        public int f36460w;

        public d(mt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36458u = obj;
            this.f36460w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return q1.this.x(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Landroidx/work/c$a;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)Landroidx/work/c$a;"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "androidx.work.impl.WorkerWrapper$runWorker$result$1", f = "WorkerWrapper.kt", l = {297, HttpStatusCodesKt.HTTP_PERM_REDIRECT}, m = "invokeSuspend")
    public static final class e extends ot.m implements Function2<ju.p0, mt.b<? super c.a>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f36461t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ androidx.work.c f36463v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ x5.l f36464w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(androidx.work.c cVar, x5.l lVar, mt.b<? super e> bVar) {
            super(2, bVar);
            this.f36463v = cVar;
            this.f36464w = lVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return q1.this.new e(this.f36463v, this.f36464w, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        
            if (g6.c0.b(r4, r5, r6, r7, r8, r9) == r0) goto L16;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r10.f36461t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                gt.o.b(r11)
                return r11
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                gt.o.b(r11)
                r9 = r10
                goto L42
            L1f:
                gt.o.b(r11)
                y5.q1 r11 = y5.q1.this
                android.content.Context r4 = y5.q1.d(r11)
                y5.q1 r11 = y5.q1.this
                f6.j0 r5 = r11.getWorkSpec()
                androidx.work.c r6 = r10.f36463v
                x5.l r7 = r10.f36464w
                y5.q1 r11 = y5.q1.this
                h6.b r8 = y5.q1.f(r11)
                r10.f36461t = r3
                r9 = r10
                java.lang.Object r11 = g6.c0.b(r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L42
                goto L7b
            L42:
                java.lang.String r11 = y5.s1.a()
                y5.q1 r1 = y5.q1.this
                x5.w r3 = x5.w.e()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Starting work for "
                r4.append(r5)
                f6.j0 r1 = r1.getWorkSpec()
                java.lang.String r1 = r1.workerClassName
                r4.append(r1)
                java.lang.String r1 = r4.toString()
                r3.a(r11, r1)
                androidx.work.c r11 = r9.f36463v
                ne.x r11 = r11.startWork()
                java.lang.String r1 = "startWork(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)
                androidx.work.c r1 = r9.f36463v
                r9.f36461t = r2
                java.lang.Object r11 = y5.s1.d(r11, r1, r10)
                if (r11 != r0) goto L7c
            L7b:
                return r0
            L7c:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: y5.q1.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super c.a> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public q1(@NotNull a builder) {
        ju.a0 b10;
        Intrinsics.checkNotNullParameter(builder, "builder");
        f6.j0 workSpec = builder.getWorkSpec();
        this.workSpec = workSpec;
        this.appContext = builder.getAppContext();
        this.workSpecId = workSpec.id;
        this.runtimeExtras = builder.getRuntimeExtras();
        this.builderWorker = builder.getWorker();
        this.workTaskExecutor = builder.getWorkTaskExecutor();
        androidx.work.a configuration = builder.getConfiguration();
        this.configuration = configuration;
        this.clock = configuration.getClock();
        this.foregroundProcessor = builder.getForegroundProcessor();
        WorkDatabase workDatabase = builder.getWorkDatabase();
        this.workDatabase = workDatabase;
        this.workSpecDao = workDatabase.c0();
        this.dependencyDao = workDatabase.X();
        List<String> f10 = builder.f();
        this.tags = f10;
        this.workDescription = l(f10);
        b10 = h2.b(null, 1, null);
        this.workerJob = b10;
    }

    public static final Boolean D(q1 q1Var) {
        boolean z10;
        if (q1Var.workSpecDao.j(q1Var.workSpecId) == o0.c.f35307a) {
            q1Var.workSpecDao.c(o0.c.b, q1Var.workSpecId);
            q1Var.workSpecDao.z(q1Var.workSpecId);
            q1Var.workSpecDao.e(q1Var.workSpecId, InputDeviceCompat.SOURCE_ANY);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public static final Boolean y(q1 q1Var) {
        String str;
        String str2;
        f6.j0 j0Var = q1Var.workSpec;
        if (j0Var.state != o0.c.f35307a) {
            str2 = s1.f36479a;
            x5.w.e().a(str2, q1Var.workSpec.workerClassName + " is not in ENQUEUED state. Nothing more to do");
            return Boolean.TRUE;
        }
        if ((!j0Var.o() && !q1Var.workSpec.n()) || q1Var.clock.a() >= q1Var.workSpec.c()) {
            return Boolean.FALSE;
        }
        x5.w e10 = x5.w.e();
        str = s1.f36479a;
        e10.a(str, "Delaying execution for " + q1Var.workSpec.workerClassName + " because it is being executed before schedule.");
        return Boolean.TRUE;
    }

    public static final Unit z(androidx.work.c cVar, boolean z10, String str, q1 q1Var, Throwable th2) {
        if (th2 instanceof h1) {
            cVar.stop(((h1) th2).getReason());
        }
        if (z10 && str != null) {
            q1Var.configuration.getTracer().b(str, q1Var.workSpec.hashCode());
        }
        return Unit.f22894a;
    }

    public final boolean A(@NotNull c.a result) {
        Intrinsics.checkNotNullParameter(result, "result");
        q(this.workSpecId);
        androidx.work.b e10 = ((c.a.C0062a) result).e();
        Intrinsics.checkNotNullExpressionValue(e10, "getOutputData(...)");
        this.workSpecDao.B(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.u(this.workSpecId, e10);
        return false;
    }

    public final boolean B(c.a result) {
        String str;
        this.workSpecDao.c(o0.c.f35308c, this.workSpecId);
        Intrinsics.d(result, "null cannot be cast to non-null type androidx.work.ListenableWorker.Result.Success");
        androidx.work.b e10 = ((c.a.C0063c) result).e();
        Intrinsics.checkNotNullExpressionValue(e10, "getOutputData(...)");
        this.workSpecDao.u(this.workSpecId, e10);
        long a10 = this.clock.a();
        for (String str2 : this.dependencyDao.a(this.workSpecId)) {
            if (this.workSpecDao.j(str2) == o0.c.f35310e && this.dependencyDao.b(str2)) {
                str = s1.f36479a;
                x5.w.e().f(str, "Setting status to enqueued for " + str2);
                this.workSpecDao.c(o0.c.f35307a, str2);
                this.workSpecDao.v(str2, a10);
            }
        }
        return false;
    }

    public final boolean C() {
        Object P = this.workDatabase.P(new Callable() { // from class: y5.p1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Boolean D;
                D = q1.D(q1.this);
                return D;
            }
        });
        Intrinsics.checkNotNullExpressionValue(P, "runInTransaction(...)");
        return ((Boolean) P).booleanValue();
    }

    public final String l(List<String> tags) {
        return "Work [ id=" + this.workSpecId + ", tags={ " + CollectionsKt.m0(tags, ",", null, null, 0, null, null, 62, null) + " } ]";
    }

    @NotNull
    public final WorkGenerationalId m() {
        return f6.o1.a(this.workSpec);
    }

    @NotNull
    /* renamed from: n, reason: from getter */
    public final f6.j0 getWorkSpec() {
        return this.workSpec;
    }

    public final boolean o(c.a result) {
        String str;
        String str2;
        String str3;
        if (result instanceof c.a.C0063c) {
            str3 = s1.f36479a;
            x5.w.e().f(str3, "Worker result SUCCESS for " + this.workDescription);
            return this.workSpec.o() ? v() : B(result);
        }
        if (result instanceof c.a.b) {
            str2 = s1.f36479a;
            x5.w.e().f(str2, "Worker result RETRY for " + this.workDescription);
            return u(InputDeviceCompat.SOURCE_ANY);
        }
        str = s1.f36479a;
        x5.w.e().f(str, "Worker result FAILURE for " + this.workDescription);
        if (this.workSpec.o()) {
            return v();
        }
        if (result == null) {
            result = new c.a.C0062a();
        }
        return A(result);
    }

    public final void p(int stopReason) {
        this.workerJob.c(new h1(stopReason));
    }

    public final void q(String workSpecId) {
        List p8 = kotlin.collections.p.p(workSpecId);
        while (!p8.isEmpty()) {
            String str = (String) kotlin.collections.u.H(p8);
            if (this.workSpecDao.j(str) != o0.c.f35311f) {
                this.workSpecDao.c(o0.c.f35309d, str);
            }
            p8.addAll(this.dependencyDao.a(str));
        }
    }

    @NotNull
    public final ne.x<Boolean> r() {
        ju.a0 b10;
        ju.l0 b11 = this.workTaskExecutor.b();
        b10 = h2.b(null, 1, null);
        return x5.u.k(b11.plus(b10), null, new c(null), 2, null);
    }

    public final boolean s(c.a result) {
        String str;
        str = s1.f36479a;
        x5.w.e().f(str, "Worker result FAILURE for " + this.workDescription);
        if (this.workSpec.o()) {
            v();
            return false;
        }
        A(result);
        return false;
    }

    public final boolean t(c.a result) {
        o0.c j10 = this.workSpecDao.j(this.workSpecId);
        this.workDatabase.b0().a(this.workSpecId);
        if (j10 == null) {
            return false;
        }
        if (j10 == o0.c.b) {
            return o(result);
        }
        if (j10.b()) {
            return false;
        }
        return u(-512);
    }

    public final boolean u(int stopReason) {
        this.workSpecDao.c(o0.c.f35307a, this.workSpecId);
        this.workSpecDao.v(this.workSpecId, this.clock.a());
        this.workSpecDao.B(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.q(this.workSpecId, -1L);
        this.workSpecDao.e(this.workSpecId, stopReason);
        return true;
    }

    public final boolean v() {
        this.workSpecDao.v(this.workSpecId, this.clock.a());
        this.workSpecDao.c(o0.c.f35307a, this.workSpecId);
        this.workSpecDao.y(this.workSpecId);
        this.workSpecDao.B(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.b(this.workSpecId);
        this.workSpecDao.q(this.workSpecId, -1L);
        return false;
    }

    public final boolean w(int stopReason) {
        String str;
        String str2;
        String str3;
        if (Intrinsics.c(this.workSpec.getBackOffOnSystemInterruptions(), Boolean.TRUE)) {
            str3 = s1.f36479a;
            x5.w.e().a(str3, "Worker " + this.workSpec.workerClassName + " was interrupted. Backing off.");
            u(stopReason);
            return true;
        }
        o0.c j10 = this.workSpecDao.j(this.workSpecId);
        if (j10 == null || j10.b()) {
            str = s1.f36479a;
            x5.w.e().a(str, "Status for " + this.workSpecId + " is " + j10 + " ; not doing any work");
            return false;
        }
        str2 = s1.f36479a;
        x5.w.e().a(str2, "Status for " + this.workSpecId + " is " + j10 + "; not doing any work and rescheduling for later execution");
        this.workSpecDao.c(o0.c.f35307a, this.workSpecId);
        this.workSpecDao.e(this.workSpecId, stopReason);
        this.workSpecDao.q(this.workSpecId, -1L);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(mt.b<? super y5.q1.b> r23) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.q1.x(mt.b):java.lang.Object");
    }
}

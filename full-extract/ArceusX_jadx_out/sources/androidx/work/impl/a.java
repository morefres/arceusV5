package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import d6.n;
import h6.c;
import j6.b;
import java.util.List;
import ju.l0;
import ju.p0;
import ju.q0;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import rl.d;
import x5.i0;
import y5.d1;
import y5.f1;
import y5.s;
import y5.u;
import y5.x;
import yt.q;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0085\u0001\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2<\b\u0002\u0010\u0010\u001a6\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fj\u0002`\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aE\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0018\u0010\u0019*j\u0010\u001a\"2\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f22\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f¨\u0006\u001b"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/work/a;", "configuration", "Lh6/b;", "workTaskExecutor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Ld6/n;", "trackers", "Ly5/s;", "processor", "Lkotlin/Function6;", "", "Ly5/u;", "Landroidx/work/impl/SchedulersCreator;", "schedulersCreator", "Ly5/f1;", d.f30696a, "(Landroid/content/Context;Landroidx/work/a;Lh6/b;Landroidx/work/impl/WorkDatabase;Ld6/n;Ly5/s;Lyt/q;)Ly5/f1;", b.f21518e, "(Landroid/content/Context;Landroidx/work/a;Lh6/b;Landroidx/work/impl/WorkDatabase;Ld6/n;Ly5/s;)Ljava/util/List;", "taskExecutor", "Lju/p0;", "f", "(Lh6/b;)Lju/p0;", "SchedulersCreator", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: androidx.work.impl.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0064a extends k implements q<Context, androidx.work.a, h6.b, WorkDatabase, n, s, List<? extends u>> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0064a f3325a = new C0064a();

        public C0064a() {
            super(6, a.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
        }

        @Override // yt.q
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final List<u> h(Context p02, androidx.work.a p12, h6.b p22, WorkDatabase p32, n p42, s p52) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            Intrinsics.checkNotNullParameter(p22, "p2");
            Intrinsics.checkNotNullParameter(p32, "p3");
            Intrinsics.checkNotNullParameter(p42, "p4");
            Intrinsics.checkNotNullParameter(p52, "p5");
            return a.b(p02, p12, p22, p32, p42, p52);
        }
    }

    public static final List<u> b(Context context, androidx.work.a aVar, h6.b bVar, WorkDatabase workDatabase, n nVar, s sVar) {
        u c10 = x.c(context, workDatabase, aVar);
        Intrinsics.checkNotNullExpressionValue(c10, "createBestAvailableBackgroundScheduler(...)");
        return p.n(c10, new z5.b(context, aVar, nVar, sVar, new d1(sVar, bVar), bVar));
    }

    @NotNull
    public static final f1 c(@NotNull Context context, @NotNull androidx.work.a configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return e(context, configuration, null, null, null, null, null, 124, null);
    }

    @NotNull
    public static final f1 d(@NotNull Context context, @NotNull androidx.work.a configuration, @NotNull h6.b workTaskExecutor, @NotNull WorkDatabase workDatabase, @NotNull n trackers, @NotNull s processor, @NotNull q<? super Context, ? super androidx.work.a, ? super h6.b, ? super WorkDatabase, ? super n, ? super s, ? extends List<? extends u>> schedulersCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(schedulersCreator, "schedulersCreator");
        return new f1(context.getApplicationContext(), configuration, workTaskExecutor, workDatabase, schedulersCreator.h(context, configuration, workTaskExecutor, workDatabase, trackers, processor), processor, trackers);
    }

    public static /* synthetic */ f1 e(Context context, androidx.work.a aVar, h6.b bVar, WorkDatabase workDatabase, n nVar, s sVar, q qVar, int i10, Object obj) {
        n nVar2;
        if ((i10 & 4) != 0) {
            bVar = new c(aVar.getTaskExecutor());
        }
        h6.b bVar2 = bVar;
        if ((i10 & 8) != 0) {
            WorkDatabase.Companion companion = WorkDatabase.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            h6.a c10 = bVar2.c();
            Intrinsics.checkNotNullExpressionValue(c10, "getSerialTaskExecutor(...)");
            workDatabase = companion.b(applicationContext, c10, aVar.getClock(), context.getResources().getBoolean(i0.f35285a));
        }
        if ((i10 & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
            nVar2 = new n(applicationContext2, bVar2, null, null, null, null, 60, null);
        } else {
            nVar2 = nVar;
        }
        return d(context, aVar, bVar2, workDatabase, nVar2, (i10 & 32) != 0 ? new s(context.getApplicationContext(), aVar, bVar2, workDatabase) : sVar, (i10 & 64) != 0 ? C0064a.f3325a : qVar);
    }

    @NotNull
    public static final p0 f(@NotNull h6.b taskExecutor) {
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        l0 b = taskExecutor.b();
        Intrinsics.checkNotNullExpressionValue(b, "getTaskCoroutineDispatcher(...)");
        return q0.a(b);
    }
}

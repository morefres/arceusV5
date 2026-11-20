package g6;

import android.content.Context;
import android.os.Build;
import androidx.core.view.MotionEventCompat;
import com.appsflyer.share.attribution.RequestError;
import f6.j0;
import java.util.concurrent.Executor;
import ju.p0;
import ju.v1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroid/content/Context;", "context", "Lf6/j0;", "spec", "Landroidx/work/c;", "worker", "Lx5/l;", "foregroundUpdater", "Lh6/b;", "taskExecutor", "", j6.b.f21518e, "(Landroid/content/Context;Lf6/j0;Landroidx/work/c;Lx5/l;Lh6/b;Lmt/b;)Ljava/lang/Object;", "", ve.a.f33391e, "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f18353a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "androidx.work.impl.utils.WorkForegroundKt$workForeground$2", f = "WorkForeground.kt", l = {MotionEventCompat.AXIS_GENERIC_11, RequestError.RESPONSE_CODE_FAILURE}, m = "invokeSuspend")
    public static final class a extends ot.m implements Function2<p0, mt.b<? super Void>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f18354t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ androidx.work.c f18355u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ j0 f18356v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ x5.l f18357w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Context f18358x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.work.c cVar, j0 j0Var, x5.l lVar, Context context, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f18355u = cVar;
            this.f18356v = j0Var;
            this.f18357w = lVar;
            this.f18358x = context;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new a(this.f18355u, this.f18356v, this.f18357w, this.f18358x, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
        
            if (r8 == r0) goto L18;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r7.f18354t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                gt.o.b(r8)
                return r8
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                gt.o.b(r8)
                goto L37
            L1e:
                gt.o.b(r8)
                androidx.work.c r8 = r7.f18355u
                ne.x r8 = r8.getForegroundInfoAsync()
                java.lang.String r1 = "getForegroundInfoAsync(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r1)
                androidx.work.c r1 = r7.f18355u
                r7.f18354t = r3
                java.lang.Object r8 = y5.s1.d(r8, r1, r7)
                if (r8 != r0) goto L37
                goto L76
            L37:
                x5.k r8 = (x5.k) r8
                if (r8 == 0) goto L78
                java.lang.String r1 = g6.c0.a()
                f6.j0 r3 = r7.f18356v
                x5.w r4 = x5.w.e()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Updating notification for "
                r5.append(r6)
                java.lang.String r3 = r3.workerClassName
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                r4.a(r1, r3)
                x5.l r1 = r7.f18357w
                android.content.Context r3 = r7.f18358x
                androidx.work.c r4 = r7.f18355u
                java.util.UUID r4 = r4.getId()
                ne.x r8 = r1.a(r3, r4, r8)
                java.lang.String r1 = "setForegroundAsync(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r1)
                r7.f18354t = r2
                java.lang.Object r8 = y1.e.b(r8, r7)
                if (r8 != r0) goto L77
            L76:
                return r0
            L77:
                return r8
            L78:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "Worker was marked important ("
                r8.append(r0)
                f6.j0 r0 = r7.f18356v
                java.lang.String r0 = r0.workerClassName
                r8.append(r0)
                java.lang.String r0 = ") but did not provide ForegroundInfo"
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>(r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: g6.c0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Void> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    static {
        String i10 = x5.w.i("WorkForegroundRunnable");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(...)");
        f18353a = i10;
    }

    @Nullable
    public static final Object b(@NotNull Context context, @NotNull j0 j0Var, @NotNull androidx.work.c cVar, @NotNull x5.l lVar, @NotNull h6.b bVar, @NotNull mt.b<? super Unit> bVar2) {
        if (!j0Var.expedited || Build.VERSION.SDK_INT >= 31) {
            return Unit.f22894a;
        }
        Executor a10 = bVar.a();
        Intrinsics.checkNotNullExpressionValue(a10, "getMainThreadExecutor(...)");
        Object g10 = ju.i.g(v1.b(a10), new a(cVar, j0Var, lVar, context, null), bVar2);
        return g10 == nt.c.e() ? g10 : Unit.f22894a;
    }
}

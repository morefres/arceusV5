package com.roblox.client.ads;

import android.content.Context;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import ek.q;
import ek.w;
import gt.o;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.d;
import ot.f;
import ot.m;
import qh.h;
import ve.a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/roblox/client/ads/GmaSdkBackgroundInstallWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Lmt/b;)Ljava/lang/Object;", a.f33391e, "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GmaSdkBackgroundInstallWorker extends CoroutineWorker {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.roblox.client.ads.GmaSdkBackgroundInstallWorker", f = "GmaSdkBackgroundInstallWorker.kt", l = {MotionEventCompat.AXIS_RELATIVE_X}, m = "doWork", v = 1)
    public static final class b extends d {

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f8969t;

        /* renamed from: v, reason: collision with root package name */
        public int f8971v;

        public b(mt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f8969t = obj;
            this.f8971v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return GmaSdkBackgroundInstallWorker.this.doWork(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Landroidx/work/c$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lju/p0;)Landroidx/work/c$a;"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.ads.GmaSdkBackgroundInstallWorker$doWork$2", f = "GmaSdkBackgroundInstallWorker.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, mt.b<? super c.a>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f8972t;

        public c(mt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return GmaSdkBackgroundInstallWorker.this.new c(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f8972t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            if (h.k("gmasdk")) {
                return c.a.d();
            }
            if (Intrinsics.c(w.a(GmaSdkBackgroundInstallWorker.this.getApplicationContext()), "foreground")) {
                q.h("GmaSdkBgInstallWorker", "App returned to foreground before delay elapsed; skipping background install");
                return c.a.d();
            }
            q.h("GmaSdkBgInstallWorker", "Installing GMA SDK in background");
            h.m("gmasdk");
            return c.a.d();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super c.a> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GmaSdkBackgroundInstallWorker(@NotNull Context context, @NotNull WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.work.CoroutineWorker
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull mt.b<? super androidx.work.c.a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.roblox.client.ads.GmaSdkBackgroundInstallWorker.b
            if (r0 == 0) goto L13
            r0 = r6
            com.roblox.client.ads.GmaSdkBackgroundInstallWorker$b r0 = (com.roblox.client.ads.GmaSdkBackgroundInstallWorker.b) r0
            int r1 = r0.f8971v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8971v = r1
            goto L18
        L13:
            com.roblox.client.ads.GmaSdkBackgroundInstallWorker$b r0 = new com.roblox.client.ads.GmaSdkBackgroundInstallWorker$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f8969t
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f8971v
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            gt.o.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            gt.o.b(r6)
            ju.l0 r6 = ju.g1.b()
            com.roblox.client.ads.GmaSdkBackgroundInstallWorker$c r2 = new com.roblox.client.ads.GmaSdkBackgroundInstallWorker$c
            r4 = 0
            r2.<init>(r4)
            r0.f8971v = r3
            java.lang.Object r6 = ju.i.g(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.ads.GmaSdkBackgroundInstallWorker.doWork(mt.b):java.lang.Object");
    }
}

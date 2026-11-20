package com.roblox.universalapp.appratingprompt;

import android.util.Log;
import android.view.f;
import android.view.s;
import android.view.t;
import android.widget.Toast;
import androidx.annotation.Keep;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.roblox.universalapp.appratingprompt.AppRatingPromptHandler;
import com.roblox.universalapp.logging.LoggingProtocol;
import ek.a0;
import gt.o;
import java.lang.ref.WeakReference;
import java.util.List;
import ju.g1;
import ju.k;
import ju.p0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;
import rh.h;
import rl.d;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J-\u0010\u001c\u001a\u00020\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;", "Landroidx/lifecycle/f;", "<init>", "()V", "", "showAppRatingPrompt", "Lj/b;", "activity", "", "failureMessage", "k", "(Lj/b;Ljava/lang/String;)V", "", "isAppRatingPromptAvailable", "()Z", "Landroidx/lifecycle/s;", "owner", "onCreate", "(Landroidx/lifecycle/s;)V", "onDestroy", d.f30696a, "(Lj/b;Lmt/b;)Ljava/lang/Object;", "j", "", "errorCode", "Ljava/lang/Exception;", "Lkotlin/Exception;", "except", "h", "(Ljava/lang/Integer;Ljava/lang/Exception;)V", "Ljava/lang/ref/WeakReference;", j6.b.f21518e, "Ljava/lang/ref/WeakReference;", "activityRef", "Lkotlin/time/a;", "c", "J", "delay", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AppRatingPromptHandler implements f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AppRatingPromptHandler f9830a = new AppRatingPromptHandler();

    /* renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static volatile WeakReference<j.b> activityRef;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final long delay;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.universalapp.appratingprompt.AppRatingPromptHandler", f = "AppRatingPromptHandler.kt", l = {93}, m = "displayRatingPrompt", v = 1)
    public static final class a extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f9832t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f9833u;

        /* renamed from: w, reason: collision with root package name */
        public int f9835w;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9833u = obj;
            this.f9835w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return AppRatingPromptHandler.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.universalapp.appratingprompt.AppRatingPromptHandler$showAppRatingPrompt$1$1", f = "AppRatingPromptHandler.kt", l = {56}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f9836t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ j.b f9837u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j.b bVar, mt.b<? super b> bVar2) {
            super(2, bVar2);
            this.f9837u = bVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new b(this.f9837u, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f9836t;
            if (i10 == 0) {
                o.b(obj);
                Log.i("AppRatingPrompt", "Lifecycle-aware coroutine started, listening for rating prompt requests");
                AppRatingPromptHandler appRatingPromptHandler = AppRatingPromptHandler.f9830a;
                j.b bVar = this.f9837u;
                this.f9836t = 1;
                if (appRatingPromptHandler.d(bVar, this) == e10) {
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
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.universalapp.appratingprompt.AppRatingPromptHandler$triggerRatingExperience$1", f = "AppRatingPromptHandler.kt", l = {65}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f9838t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ j.b f9839u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(j.b bVar, mt.b<? super c> bVar2) {
            super(2, bVar2);
            this.f9839u = bVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new c(this.f9839u, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f9838t;
            if (i10 == 0) {
                o.b(obj);
                AppRatingPromptHandler appRatingPromptHandler = AppRatingPromptHandler.f9830a;
                j.b bVar = this.f9839u;
                this.f9838t = 1;
                if (appRatingPromptHandler.d(bVar, this) == e10) {
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
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    static {
        a.Companion companion = kotlin.time.a.INSTANCE;
        delay = kotlin.time.b.p(1, iu.b.f21121e);
    }

    public static final void e(wd.b bVar, j.b bVar2, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            Task<Void> b10 = bVar.b(bVar2, (ReviewInfo) task.getResult());
            Intrinsics.checkNotNullExpressionValue(b10, "launchReviewFlow(...)");
            b10.b(bVar2, new OnCompleteListener() { // from class: ul.b
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    AppRatingPromptHandler.g(task2);
                }
            });
        } else {
            Exception exception = task.getException();
            wd.a aVar = exception instanceof wd.a ? (wd.a) exception : null;
            i(f9830a, aVar != null ? Integer.valueOf(aVar.c()) : null, null, 2, null);
        }
    }

    public static final void g(Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f9830a.j();
    }

    public static /* synthetic */ void i(AppRatingPromptHandler appRatingPromptHandler, Integer num, Exception exc, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            exc = null;
        }
        appRatingPromptHandler.h(num, exc);
    }

    @Keep
    public static final boolean isAppRatingPromptAvailable() {
        return true;
    }

    public static final void k(@NotNull j.b activity, @NotNull String failureMessage) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(failureMessage, "failureMessage");
        if (h.a().Z3()) {
            k.d(t.a(activity), g1.c(), null, new c(activity, null), 2, null);
        } else {
            if (a0.c(activity)) {
                return;
            }
            Toast.makeText(activity, failureMessage, 0).show();
        }
    }

    @Keep
    public static final void showAppRatingPrompt() {
        j.b bVar;
        Log.i("AppRatingPrompt", "requestRatingPrompt called");
        WeakReference<j.b> weakReference = activityRef;
        if (weakReference == null || (bVar = weakReference.get()) == null) {
            return;
        }
        k.d(t.a(bVar), g1.c(), null, new b(bVar, null), 2, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        i(r6, null, r7, 1, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(final j.b r7, mt.b<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.roblox.universalapp.appratingprompt.AppRatingPromptHandler.a
            if (r0 == 0) goto L13
            r0 = r8
            com.roblox.universalapp.appratingprompt.AppRatingPromptHandler$a r0 = (com.roblox.universalapp.appratingprompt.AppRatingPromptHandler.a) r0
            int r1 = r0.f9835w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9835w = r1
            goto L18
        L13:
            com.roblox.universalapp.appratingprompt.AppRatingPromptHandler$a r0 = new com.roblox.universalapp.appratingprompt.AppRatingPromptHandler$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f9833u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f9835w
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r7 = r0.f9832t
            j.b r7 = (j.b) r7
            gt.o.b(r8)     // Catch: java.lang.Exception -> L2d
            goto L4e
        L2d:
            r7 = move-exception
            goto L6d
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            gt.o.b(r8)
            java.lang.String r8 = "AppRatingPrompt"
            java.lang.String r2 = "displayRatingPrompt"
            android.util.Log.i(r8, r2)
            long r4 = com.roblox.universalapp.appratingprompt.AppRatingPromptHandler.delay     // Catch: java.lang.Exception -> L2d
            r0.f9832t = r7     // Catch: java.lang.Exception -> L2d
            r0.f9835w = r3     // Catch: java.lang.Exception -> L2d
            java.lang.Object r8 = ju.z0.c(r4, r0)     // Catch: java.lang.Exception -> L2d
            if (r8 != r1) goto L4e
            return r1
        L4e:
            wd.b r8 = wd.c.a(r7)     // Catch: java.lang.Exception -> L2d
            java.lang.String r0 = "create(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)     // Catch: java.lang.Exception -> L2d
            com.google.android.gms.tasks.Task r0 = r8.a()     // Catch: java.lang.Exception -> L2d
            java.lang.String r1 = "requestReviewFlow(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Exception -> L2d
            ul.a r1 = new ul.a     // Catch: java.lang.Exception -> L2d
            r1.<init>()     // Catch: java.lang.Exception -> L2d
            com.google.android.gms.tasks.Task r7 = r0.b(r7, r1)     // Catch: java.lang.Exception -> L2d
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)     // Catch: java.lang.Exception -> L2d
            goto L71
        L6d:
            r8 = 0
            i(r6, r8, r7, r3, r8)
        L71:
            kotlin.Unit r7 = kotlin.Unit.f22894a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.universalapp.appratingprompt.AppRatingPromptHandler.d(j.b, mt.b):java.lang.Object");
    }

    public final void h(Integer errorCode, Exception except) {
        List c10 = kotlin.collections.o.c();
        if (except != null) {
            c10.add(new Pair("errorInfo", except.toString()));
            Log.e("AppRatingPrompt", "Error in displayRatingPrompt", except);
        } else if (errorCode != null) {
            c10.add(new Pair("errorInfo", String.valueOf(errorCode.intValue())));
            Log.e("AppRatingPrompt", "Error in displayRatingPrompt, errorCode: " + errorCode);
        } else {
            Log.e("AppRatingPrompt", "Error in displayRatingPrompt: unknown error");
        }
        LoggingProtocol.j(jm.b.a("AppRatingPromptError", kotlin.collections.o.a(c10), h.a().m5()));
    }

    public final void j() {
        Log.i("AppRatingPrompt", "onPromptFlowComplete");
    }

    @Override // android.view.f
    public void onCreate(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Log.i("AppRatingPrompt", "onCreate");
        activityRef = new WeakReference<>(owner instanceof j.b ? (j.b) owner : null);
    }

    @Override // android.view.f
    public void onDestroy(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        WeakReference<j.b> weakReference = activityRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        activityRef = null;
    }

    @Override // android.view.f
    public /* bridge */ void onPause(@NotNull s sVar) {
        super.onPause(sVar);
    }

    @Override // android.view.f
    public /* bridge */ void onResume(@NotNull s sVar) {
        super.onResume(sVar);
    }

    @Override // android.view.f
    public /* bridge */ void onStart(@NotNull s sVar) {
        super.onStart(sVar);
    }

    @Override // android.view.f
    public /* bridge */ void onStop(@NotNull s sVar) {
        super.onStop(sVar);
    }
}

package ni;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.roblox.client.RobloxApplication;
import gt.n;
import ju.g1;
import ju.p0;
import ju.q0;
import ju.z2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00152\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\nH\u0002¢\u0006\u0004\b$\u0010%J\u001b\u0010'\u001a\u00020\u0006*\u00020\u00192\u0006\u0010&\u001a\u00020\u001bH\u0002¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\u0006*\u00020\u00192\u0006\u0010&\u001a\u00020\u001bH\u0002¢\u0006\u0004\b)\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R(\u00103\u001a\u00020\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010.\u0012\u0004\b2\u0010\u0003\u001a\u0004\b/\u00100\"\u0004\b1\u0010\r¨\u00064"}, d2 = {"Lni/c;", "Landroidx/lifecycle/f;", "<init>", "()V", "Landroidx/lifecycle/s;", "owner", "", "onStop", "(Landroidx/lifecycle/s;)V", "onStart", "", "active", "j", "(Z)V", "Landroid/content/Context;", "context", "i", "(Landroid/content/Context;)Z", "classicThemeEnabled", "l", "(Landroid/content/Context;Z)V", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "k", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "Landroid/content/pm/PackageManager;", "pm", "Landroid/content/ComponentName;", "alias", "c", "(Landroid/content/pm/PackageManager;Landroid/content/ComponentName;)Z", "h", "(Landroid/content/Context;)V", "", "setting", "manifestDefaultEnabled", "e", "(IZ)Z", "component", "g", "(Landroid/content/pm/PackageManager;Landroid/content/ComponentName;)V", rl.d.f30696a, "Lju/p0;", j6.b.f21518e, "Lju/p0;", "scope", "Z", "getAppInForeground$NativeShell_googleProdRelease", "()Z", "setAppInForeground$NativeShell_googleProdRelease", "getAppInForeground$NativeShell_googleProdRelease$annotations", "appInForeground", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c implements android.view.f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f27099a = new c();

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final p0 scope = q0.a(z2.b(null, 1, null).plus(g1.b()));

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static volatile boolean appInForeground;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.launchericon.ClassicLauncherIconManager$onClassicThemeActiveChanged$1", f = "ClassicLauncherIconManager.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f27101t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f27102u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f27103v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, boolean z10, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f27102u = context;
            this.f27103v = z10;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new a(this.f27102u, this.f27103v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f27101t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            c cVar = c.f27099a;
            Context context = this.f27102u;
            Intrinsics.checkNotNull(context);
            SharedPreferences k10 = cVar.k(context);
            Intrinsics.checkNotNullExpressionValue(k10, "access$prefs(...)");
            boolean z10 = this.f27103v;
            SharedPreferences.Editor edit = k10.edit();
            edit.putBoolean("classic_active", z10);
            edit.apply();
            Log.i("ClassicLauncherIcon", "Classic Theme active = " + this.f27103v + " (applies on next background)");
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.launchericon.ClassicLauncherIconManager$onStart$1", f = "ClassicLauncherIconManager.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f27104t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f27105u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f27105u = context;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new b(this.f27105u, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f27104t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            c cVar = c.f27099a;
            Context context = this.f27105u;
            Intrinsics.checkNotNull(context);
            cVar.h(context);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.launchericon.ClassicLauncherIconManager$onStop$1", f = "ClassicLauncherIconManager.kt", l = {}, m = "invokeSuspend", v = 1)
    /* renamed from: ni.c$c, reason: collision with other inner class name */
    public static final class C0462c extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f27106t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f27107u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0462c(Context context, mt.b<? super C0462c> bVar) {
            super(2, bVar);
            this.f27107u = context;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new C0462c(this.f27107u, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f27106t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            c cVar = c.f27099a;
            Context context = this.f27107u;
            Intrinsics.checkNotNull(context);
            Context context2 = this.f27107u;
            Intrinsics.checkNotNull(context2);
            cVar.l(context, cVar.i(context2));
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((C0462c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public final boolean c(PackageManager pm2, ComponentName alias) {
        Object b10;
        try {
            n.Companion companion = gt.n.INSTANCE;
            b10 = gt.n.b(pm2.getActivityInfo(alias, 512));
        } catch (Throwable th2) {
            n.Companion companion2 = gt.n.INSTANCE;
            b10 = gt.n.b(gt.o.a(th2));
        }
        return gt.n.h(b10);
    }

    public final void d(PackageManager packageManager, ComponentName componentName) {
        packageManager.setComponentEnabledSetting(componentName, 2, 1);
    }

    public final boolean e(int setting, boolean manifestDefaultEnabled) {
        if (setting == 1) {
            return true;
        }
        if (setting != 2) {
            return manifestDefaultEnabled;
        }
        return false;
    }

    public final void g(PackageManager packageManager, ComponentName componentName) {
        packageManager.setComponentEnabledSetting(componentName, 1, 1);
    }

    public final void h(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context, "com.roblox.client.startup.LauncherAliasMain");
        ComponentName componentName2 = new ComponentName(context, "com.roblox.client.startup.LauncherAliasClassic");
        try {
            n.Companion companion = gt.n.INSTANCE;
            boolean e10 = e(packageManager.getComponentEnabledSetting(componentName), true);
            boolean e11 = e(packageManager.getComponentEnabledSetting(componentName2), false);
            if (!e10 && !e11) {
                Log.w("ClassicLauncherIcon", "No launcher alias enabled; re-enabling default");
                Intrinsics.checkNotNull(packageManager);
                g(packageManager, componentName);
            }
            gt.n.b(Unit.f22894a);
        } catch (Throwable th2) {
            n.Companion companion2 = gt.n.INSTANCE;
            gt.n.b(gt.o.a(th2));
        }
    }

    public final boolean i(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return !ek.t.k() && rh.h.a().V0() && k(context).getBoolean("classic_active", false);
    }

    public final void j(boolean active) {
        ju.k.d(scope, null, null, new a(RobloxApplication.f(), active, null), 3, null);
    }

    public final SharedPreferences k(Context context) {
        return context.getSharedPreferences("classic_launcher_icon", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(@org.jetbrains.annotations.NotNull android.content.Context r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.c.l(android.content.Context, boolean):void");
    }

    @Override // android.view.f
    public /* bridge */ void onCreate(@NotNull android.view.s sVar) {
        super.onCreate(sVar);
    }

    @Override // android.view.f
    public /* bridge */ void onDestroy(@NotNull android.view.s sVar) {
        super.onDestroy(sVar);
    }

    @Override // android.view.f
    public /* bridge */ void onPause(@NotNull android.view.s sVar) {
        super.onPause(sVar);
    }

    @Override // android.view.f
    public /* bridge */ void onResume(@NotNull android.view.s sVar) {
        super.onResume(sVar);
    }

    @Override // android.view.f
    public void onStart(@NotNull android.view.s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        appInForeground = true;
        ju.k.d(scope, null, null, new b(RobloxApplication.f(), null), 3, null);
    }

    @Override // android.view.f
    public void onStop(@NotNull android.view.s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        appInForeground = false;
        ju.k.d(scope, null, null, new C0462c(RobloxApplication.f(), null), 3, null);
    }
}

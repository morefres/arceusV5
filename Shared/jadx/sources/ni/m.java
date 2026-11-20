package ni;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.core.view.InputDeviceCompat;
import com.roblox.client.RobloxApplication;
import gt.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import ju.g1;
import ju.p0;
import ju.q0;
import ju.z2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wj.f;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u00013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001aH\u0002¢\u0006\u0004\b$\u0010%J'\u0010'\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020#H\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010*R(\u00102\u001a\u00020#8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001e\u0010,\u0012\u0004\b1\u0010\u0003\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00064"}, d2 = {"Lni/m;", "Landroidx/lifecycle/f;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "h", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "", "name", "", "g", "(Ljava/lang/String;)V", "j", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroidx/lifecycle/s;", "owner", "onStart", "(Landroidx/lifecycle/s;)V", rl.d.f30696a, "(Landroid/content/Context;)V", "onStop", "i", "", "Lni/m$a;", "e", "(Landroid/content/Context;)Ljava/util/List;", "aliases", "c", "(Ljava/lang/String;Ljava/util/List;)Lni/m$a;", "Landroid/content/pm/PackageManager;", "pm", "alias", "", j6.b.f21518e, "(Landroid/content/pm/PackageManager;Lni/m$a;)Z", "enabled", "k", "(Landroid/content/pm/PackageManager;Lni/m$a;Z)V", "Lju/p0;", "Lju/p0;", "scope", "Z", "getAppInForeground$NativeShell_googleProdRelease", "()Z", "setAppInForeground$NativeShell_googleProdRelease", "(Z)V", "getAppInForeground$NativeShell_googleProdRelease$annotations", "appInForeground", ve.a.f33391e, "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class m implements android.view.f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f27116a = new m();

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final p0 scope = q0.a(z2.b(null, 1, null).plus(g1.b()));

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static volatile boolean appInForeground;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lni/m$a;", "", "Landroid/content/ComponentName;", "component", "", "manifestEnabled", "<init>", "(Landroid/content/ComponentName;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Landroid/content/ComponentName;", "()Landroid/content/ComponentName;", j6.b.f21518e, "Z", "()Z", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: ni.m$a, reason: from toString */
    public static final /* data */ class Alias {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final ComponentName component;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean manifestEnabled;

        public Alias(@NotNull ComponentName component, boolean z10) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.component = component;
            this.manifestEnabled = z10;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final ComponentName getComponent() {
            return this.component;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getManifestEnabled() {
            return this.manifestEnabled;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Alias)) {
                return false;
            }
            Alias alias = (Alias) other;
            return Intrinsics.c(this.component, alias.component) && this.manifestEnabled == alias.manifestEnabled;
        }

        public int hashCode() {
            return (this.component.hashCode() * 31) + Boolean.hashCode(this.manifestEnabled);
        }

        @NotNull
        public String toString() {
            return "Alias(component=" + this.component + ", manifestEnabled=" + this.manifestEnabled + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.launchericon.LauncherIconManager$onAppIconChanged$1", f = "LauncherIconManager.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f27119t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f27120u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f27121v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, String str, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f27120u = context;
            this.f27121v = str;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new b(this.f27120u, this.f27121v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f27119t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            m mVar = m.f27116a;
            Context context = this.f27120u;
            Intrinsics.checkNotNull(context);
            mVar.j(context, this.f27121v);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.launchericon.LauncherIconManager$onStart$1", f = "LauncherIconManager.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f27122t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f27123u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, mt.b<? super c> bVar) {
            super(2, bVar);
            this.f27123u = context;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new c(this.f27123u, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f27122t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            m mVar = m.f27116a;
            Context context = this.f27123u;
            Intrinsics.checkNotNull(context);
            mVar.d(context);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.launchericon.LauncherIconManager$onStop$1", f = "LauncherIconManager.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f27124t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f27125u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, mt.b<? super d> bVar) {
            super(2, bVar);
            this.f27125u = context;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new d(this.f27125u, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f27124t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            m mVar = m.f27116a;
            Context context = this.f27125u;
            Intrinsics.checkNotNull(context);
            Context context2 = this.f27125u;
            Intrinsics.checkNotNull(context2);
            String string = mVar.h(context2).getString("icon_name", "");
            mVar.i(context, string != null ? string : "");
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences h(Context context) {
        return context.getSharedPreferences("launcher_icon", 0);
    }

    public final boolean b(PackageManager pm2, Alias alias) {
        int componentEnabledSetting = pm2.getComponentEnabledSetting(alias.getComponent());
        return componentEnabledSetting != 0 ? componentEnabledSetting == 1 : alias.getManifestEnabled();
    }

    public final Alias c(String name, List<Alias> aliases) {
        String str;
        Object obj = null;
        if (Intrinsics.c(name, "Main")) {
            return null;
        }
        if (Intrinsics.c(name, "Classic") && ek.t.k()) {
            return null;
        }
        if (name.length() == 0) {
            str = "com.roblox.client.startup.LauncherAliasMain";
        } else {
            str = "com.roblox.client.startup.LauncherAlias" + name;
        }
        Iterator<T> it = aliases.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.c(((Alias) next).getComponent().getClassName(), str)) {
                obj = next;
                break;
            }
        }
        return (Alias) obj;
    }

    public final void d(@NotNull Context context) {
        Object b10;
        PackageManager packageManager;
        List<Alias> e10;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            n.Companion companion = gt.n.INSTANCE;
            packageManager = context.getPackageManager();
            e10 = e(context);
        } catch (Throwable th2) {
            n.Companion companion2 = gt.n.INSTANCE;
            b10 = gt.n.b(gt.o.a(th2));
        }
        if (e10.isEmpty()) {
            Log.i("LauncherIconManager", "No launcher aliases declared; skipping recovery");
            return;
        }
        List<Alias> list = e10;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Alias alias : list) {
                Intrinsics.checkNotNull(packageManager);
                if (b(packageManager, alias)) {
                    Log.i("LauncherIconManager", "A launcher alias is already enabled; recovery not needed");
                    return;
                }
            }
        }
        for (Object obj : e10) {
            if (Intrinsics.c(((Alias) obj).getComponent().getClassName(), "com.roblox.client.startup.LauncherAliasMain")) {
                Log.w("LauncherIconManager", "No launcher alias enabled; re-enabling default");
                Intrinsics.checkNotNull(packageManager);
                k(packageManager, (Alias) obj, true);
                b10 = gt.n.b(Unit.f22894a);
                if (gt.n.h(b10)) {
                    v.f27126a.A();
                }
                Throwable e11 = gt.n.e(b10);
                if (e11 != null) {
                    v.f27126a.z(e11);
                    return;
                }
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final List<Alias> e(Context context) {
        ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), InputDeviceCompat.SOURCE_DPAD).activities;
        int i10 = 0;
        if (activityInfoArr == null) {
            activityInfoArr = new ActivityInfo[0];
        }
        ArrayList arrayList = new ArrayList();
        for (ActivityInfo activityInfo : activityInfoArr) {
            String name = activityInfo.name;
            Intrinsics.checkNotNullExpressionValue(name, "name");
            if (x.T(name, "com.roblox.client.startup.LauncherAlias", false, 2, null)) {
                arrayList.add(activityInfo);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.q.u(arrayList, 10));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ActivityInfo activityInfo2 = (ActivityInfo) obj;
            arrayList2.add(new Alias(new ComponentName(context, activityInfo2.name), activityInfo2.enabled));
        }
        return arrayList2;
    }

    public final void g(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ju.k.d(scope, null, null, new b(RobloxApplication.f(), name, null), 3, null);
    }

    public final void i(@NotNull Context context, @NotNull String name) {
        Object b10;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            n.Companion companion = gt.n.INSTANCE;
        } catch (Throwable th2) {
            n.Companion companion2 = gt.n.INSTANCE;
            b10 = gt.n.b(gt.o.a(th2));
        }
        if (appInForeground) {
            return;
        }
        List<Alias> e10 = e(context);
        if (e10.isEmpty()) {
            return;
        }
        Alias c10 = c(name, e10);
        if (c10 == null) {
            Log.w("LauncherIconManager", "Attempted to set unsupported app icon '" + name + "'");
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        for (Object obj : e10) {
            Intrinsics.checkNotNull(packageManager);
            if (b(packageManager, (Alias) obj)) {
                arrayList.add(obj);
            }
        }
        Log.i("LauncherIconManager", "Found " + arrayList.size() + " enabled launcher aliases before applying icon '" + name + "'");
        if (Intrinsics.c(CollectionsKt.B0(arrayList), c10)) {
            Log.i("LauncherIconManager", "Target launcher alias for app icon '" + name + "' is already enabled");
            return;
        }
        if (rh.h.a().G1()) {
            f.a a10 = wj.f.f34347a.a(context);
            l.f27108a.v(a10);
            if (a10 instanceof f.a.Failed) {
                Log.w("LauncherIconManager", "Could not move shortcuts off the launcher alias; deferring the swap");
                return;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            if (!Intrinsics.c((Alias) obj2, c10)) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList.contains(c10)) {
            Intrinsics.checkNotNull(packageManager);
            k(packageManager, c10, true);
        }
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj3 = arrayList2.get(i11);
            i11++;
            Intrinsics.checkNotNull(packageManager);
            k(packageManager, (Alias) obj3, false);
        }
        b10 = gt.n.b(Unit.f22894a);
        if (gt.n.h(b10)) {
            Log.i("LauncherIconManager", "Applied app icon '" + name + "'");
            v.f27126a.B(name);
        }
        Throwable e11 = gt.n.e(b10);
        if (e11 != null) {
            v.f27126a.y(name, e11);
        }
    }

    public final void j(@NotNull Context context, @NotNull String name) {
        Object b10;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            n.Companion companion = gt.n.INSTANCE;
        } catch (Throwable th2) {
            n.Companion companion2 = gt.n.INSTANCE;
            b10 = gt.n.b(gt.o.a(th2));
        }
        if (c(name, e(context)) == null) {
            Log.w("LauncherIconManager", "Requested unsupported app icon '" + name + "'");
            return;
        }
        SharedPreferences h10 = h(context);
        Intrinsics.checkNotNullExpressionValue(h10, "prefs(...)");
        SharedPreferences.Editor edit = h10.edit();
        edit.putString("icon_name", name);
        edit.apply();
        b10 = gt.n.b(Integer.valueOf(Log.i("LauncherIconManager", "Requested app icon '" + name + "' (applies on background)")));
        Throwable e10 = gt.n.e(b10);
        if (e10 != null) {
            v.f27126a.y(name, e10);
        }
    }

    public final void k(PackageManager pm2, Alias alias, boolean enabled) {
        pm2.setComponentEnabledSetting(alias.getComponent(), enabled ? 1 : 2, 1);
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
        ju.k.d(scope, null, null, new c(RobloxApplication.f(), null), 3, null);
    }

    @Override // android.view.f
    public void onStop(@NotNull android.view.s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        appInForeground = false;
        ju.k.d(scope, null, null, new d(RobloxApplication.f(), null), 3, null);
    }
}

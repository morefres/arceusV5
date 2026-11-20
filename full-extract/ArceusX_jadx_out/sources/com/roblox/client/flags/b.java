package com.roblox.client.flags;

import android.content.SharedPreferences;
import com.roblox.client.flags.a;
import ek.q;
import gt.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import ju.g1;
import ju.i;
import ju.k;
import ju.l0;
import ju.p0;
import ju.q0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ot.f;
import ot.m;
import rh.h;
import rl.d;
import tu.g;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010%\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b\u001e\u0010$R\u0011\u0010)\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/roblox/client/flags/b;", "", "<init>", "()V", "Landroid/content/SharedPreferences;", "preferences", "", "f", "(Landroid/content/SharedPreferences;)V", "", "name", "h", "(Ljava/lang/String;)V", "i", "(Lmt/b;)Ljava/lang/Object;", "", d.f30696a, "()[Ljava/lang/String;", "Lju/l0;", j6.b.f21518e, "Lju/l0;", "ioDispatcher", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "nativeFlagsInitialized", "", "Ljava/util/Set;", "flagsToRegister", "Ltu/a;", "e", "Ltu/a;", "flagsMutex", "", "value", "I", "()I", "nativeFlagProviderId", "", "g", "()Z", "isNativeFlagProviderInitialized", "flags_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f9086a = new b();

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final l0 ioDispatcher = g1.b();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final AtomicBoolean nativeFlagsInitialized = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Set<String> flagsToRegister = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final tu.a flagsMutex = g.b(false, 1, null);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static volatile int nativeFlagProviderId;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.flags.FlagSettings$initializeNativeFlagsWithCache$1", f = "FlagSettings.kt", l = {59}, m = "invokeSuspend", v = 1)
    public static final class a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f9091t;

        public a(mt.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new a(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f9091t;
            if (i10 == 0) {
                o.b(obj);
                b bVar = b.f9086a;
                this.f9091t = 1;
                if (bVar.i(this) == e10) {
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
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.flags.FlagSettings$registerNativeFlag$1", f = "FlagSettings.kt", l = {116}, m = "invokeSuspend", v = 1)
    /* renamed from: com.roblox.client.flags.b$b, reason: collision with other inner class name */
    public static final class C0143b extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f9092t;

        /* renamed from: u, reason: collision with root package name */
        public Object f9093u;

        /* renamed from: v, reason: collision with root package name */
        public int f9094v;

        /* renamed from: w, reason: collision with root package name */
        public int f9095w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f9096x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0143b(String str, mt.b<? super C0143b> bVar) {
            super(2, bVar);
            this.f9096x = str;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new C0143b(this.f9096x, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            tu.a aVar;
            String str;
            Object e10 = nt.c.e();
            int i10 = this.f9095w;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    b bVar = b.f9086a;
                    if (bVar.g()) {
                        FlagJniInterface.nativeRegisterFFlag(this.f9096x, bVar.e());
                        return Unit.f22894a;
                    }
                    q.b("FlagSettings", "registerNativeFlag: " + this.f9096x + " called before initialization.");
                    aVar = b.flagsMutex;
                    String str2 = this.f9096x;
                    this.f9092t = aVar;
                    this.f9093u = str2;
                    this.f9094v = 0;
                    this.f9095w = 1;
                    if (aVar.c(null, this) == e10) {
                        return e10;
                    }
                    str = str2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.f9093u;
                    aVar = (tu.a) this.f9092t;
                    o.b(obj);
                }
                b.flagsToRegister.add(str);
                Unit unit = Unit.f22894a;
                return Unit.f22894a;
            } finally {
                aVar.f(null);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((C0143b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.flags.FlagSettings$registerPendingNativeFlags$2", f = "FlagSettings.kt", l = {116}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f9097t;

        /* renamed from: u, reason: collision with root package name */
        public int f9098u;

        /* renamed from: v, reason: collision with root package name */
        public int f9099v;

        public c(mt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new c(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            tu.a aVar;
            Object e10 = nt.c.e();
            int i10 = this.f9099v;
            if (i10 == 0) {
                o.b(obj);
                tu.a aVar2 = b.flagsMutex;
                this.f9097t = aVar2;
                this.f9098u = 0;
                this.f9099v = 1;
                if (aVar2.c(null, this) == e10) {
                    return e10;
                }
                aVar = aVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (tu.a) this.f9097t;
                o.b(obj);
            }
            try {
                Iterator it = b.flagsToRegister.iterator();
                while (it.hasNext()) {
                    FlagJniInterface.nativeRegisterFFlag((String) it.next(), b.f9086a.e());
                }
                b.flagsToRegister.clear();
                Unit unit = Unit.f22894a;
                aVar.f(null);
                return Unit.f22894a;
            } catch (Throwable th2) {
                aVar.f(null);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public final String[] d() {
        Set<Map.Entry<String, com.roblox.client.flags.a>> U3 = h.a().U3();
        Intrinsics.checkNotNullExpressionValue(U3, "getEntrySet(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = U3.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Intrinsics.checkNotNull(entry);
            String str = (String) entry.getKey();
            com.roblox.client.flags.a aVar = (com.roblox.client.flags.a) entry.getValue();
            if (!(aVar instanceof a.d) || !((a.d) aVar).a()) {
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final int e() {
        return nativeFlagProviderId;
    }

    public final void f(@NotNull SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        q.b("FlagSettings", "initializeNativeFlagsWithCache:");
        if (nativeFlagsInitialized.getAndSet(true)) {
            q.h("FlagSettings", "initializeNativeFlagsWithCache called already, ignoring");
            return;
        }
        NativeFlagsInitResult nativeInitializeNativeFlags = FlagJniInterface.nativeInitializeNativeFlags(d());
        nativeFlagProviderId = nativeInitializeNativeFlags.getNativeFlagProviderId();
        rh.f.k(rh.f.f30648a, nativeInitializeNativeFlags.getBooleanCachedMap(), preferences, false, 4, null);
        q.b("FlagSettings", "initializeNativeFlagsWithCache: returning providerId = " + nativeFlagProviderId);
        k.d(q0.a(ioDispatcher), null, null, new a(null), 3, null);
    }

    public final boolean g() {
        return nativeFlagsInitialized.get();
    }

    public final void h(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        k.d(q0.a(ioDispatcher), null, null, new C0143b(name, null), 3, null);
    }

    public final Object i(mt.b<? super Unit> bVar) {
        Object g10 = i.g(ioDispatcher, new c(null), bVar);
        return g10 == nt.c.e() ? g10 : Unit.f22894a;
    }
}

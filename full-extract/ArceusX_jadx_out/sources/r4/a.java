package r4;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import gt.o;
import j6.b;
import ju.g1;
import ju.k;
import ju.p0;
import ju.q0;
import ju.w0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;
import s4.h;
import s4.i;
import s4.j;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000bB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lr4/a;", "", "<init>", "()V", "Landroid/net/Uri;", "trigger", "Lne/x;", "", "c", "(Landroid/net/Uri;)Lne/x;", "", b.f21518e, "()Lne/x;", ve.a.f33391e, "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0016\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\bH\u0017¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"¨\u0006#"}, d2 = {"Lr4/a$a;", "Lr4/a;", "Ls4/b;", "mMeasurementManager", "<init>", "(Ls4/b;)V", "Ls4/a;", "deletionRequest", "Lne/x;", "", "e", "(Ls4/a;)Lne/x;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "f", "(Landroid/net/Uri;Landroid/view/InputEvent;)Lne/x;", "Ls4/h;", "request", "g", "(Ls4/h;)Lne/x;", "trigger", "c", "(Landroid/net/Uri;)Lne/x;", "Ls4/i;", "h", "(Ls4/i;)Lne/x;", "Ls4/j;", "i", "(Ls4/j;)Lne/x;", "", j6.b.f21518e, "()Lne/x;", "Ls4/b;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: r4.a$a, reason: collision with other inner class name */
    public static final class C0533a extends a {

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final s4.b mMeasurementManager;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {1, 8, 0})
        @ot.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1", f = "MeasurementManagerFutures.kt", l = {132}, m = "invokeSuspend")
        /* renamed from: r4.a$a$a, reason: collision with other inner class name */
        public static final class C0534a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f30107t;

            public C0534a(s4.a aVar, mt.b<? super C0534a> bVar) {
                super(2, bVar);
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return C0533a.this.new C0534a(null, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f30107t;
                if (i10 == 0) {
                    o.b(obj);
                    s4.b bVar = C0533a.this.mMeasurementManager;
                    this.f30107t = 1;
                    if (bVar.a(null, this) == e10) {
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
                return ((C0534a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)I"}, k = 3, mv = {1, 8, 0})
        @ot.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f = "MeasurementManagerFutures.kt", l = {190}, m = "invokeSuspend")
        /* renamed from: r4.a$a$b */
        public static final class b extends m implements Function2<p0, mt.b<? super Integer>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f30109t;

            public b(mt.b<? super b> bVar) {
                super(2, bVar);
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return C0533a.this.new b(bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f30109t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return obj;
                }
                o.b(obj);
                s4.b bVar = C0533a.this.mMeasurementManager;
                this.f30109t = 1;
                Object b = bVar.b(this);
                return b == e10 ? e10 : b;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super Integer> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {1, 8, 0})
        @ot.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {143}, m = "invokeSuspend")
        /* renamed from: r4.a$a$c */
        public static final class c extends m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f30111t;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Uri f30113v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ InputEvent f30114w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Uri uri, InputEvent inputEvent, mt.b<? super c> bVar) {
                super(2, bVar);
                this.f30113v = uri;
                this.f30114w = inputEvent;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return C0533a.this.new c(this.f30113v, this.f30114w, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f30111t;
                if (i10 == 0) {
                    o.b(obj);
                    s4.b bVar = C0533a.this.mMeasurementManager;
                    Uri uri = this.f30113v;
                    InputEvent inputEvent = this.f30114w;
                    this.f30111t = 1;
                    if (bVar.c(uri, inputEvent, this) == e10) {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {1, 8, 0})
        @ot.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$2", f = "MeasurementManagerFutures.kt", l = {154}, m = "invokeSuspend")
        /* renamed from: r4.a$a$d */
        public static final class d extends m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f30115t;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ h f30117v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(h hVar, mt.b<? super d> bVar) {
                super(2, bVar);
                this.f30117v = hVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return C0533a.this.new d(this.f30117v, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f30115t;
                if (i10 == 0) {
                    o.b(obj);
                    s4.b bVar = C0533a.this.mMeasurementManager;
                    h hVar = this.f30117v;
                    this.f30115t = 1;
                    if (bVar.d(hVar, this) == e10) {
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
                return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {1, 8, 0})
        @ot.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {162}, m = "invokeSuspend")
        /* renamed from: r4.a$a$e */
        public static final class e extends m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f30118t;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Uri f30120v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Uri uri, mt.b<? super e> bVar) {
                super(2, bVar);
                this.f30120v = uri;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return C0533a.this.new e(this.f30120v, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f30118t;
                if (i10 == 0) {
                    o.b(obj);
                    s4.b bVar = C0533a.this.mMeasurementManager;
                    Uri uri = this.f30120v;
                    this.f30118t = 1;
                    if (bVar.e(uri, this) == e10) {
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
                return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {1, 8, 0})
        @ot.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {172}, m = "invokeSuspend")
        /* renamed from: r4.a$a$f */
        public static final class f extends m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f30121t;

            public f(i iVar, mt.b<? super f> bVar) {
                super(2, bVar);
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return C0533a.this.new f(null, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f30121t;
                if (i10 == 0) {
                    o.b(obj);
                    s4.b bVar = C0533a.this.mMeasurementManager;
                    this.f30121t = 1;
                    if (bVar.f(null, this) == e10) {
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
                return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {1, 8, 0})
        @ot.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {182}, m = "invokeSuspend")
        /* renamed from: r4.a$a$g */
        public static final class g extends m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f30123t;

            public g(j jVar, mt.b<? super g> bVar) {
                super(2, bVar);
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return C0533a.this.new g(null, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f30123t;
                if (i10 == 0) {
                    o.b(obj);
                    s4.b bVar = C0533a.this.mMeasurementManager;
                    this.f30123t = 1;
                    if (bVar.g(null, this) == e10) {
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
                return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        public C0533a(@NotNull s4.b mMeasurementManager) {
            Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
            this.mMeasurementManager = mMeasurementManager;
        }

        @Override // r4.a
        @NotNull
        public x<Integer> b() {
            w0 b10;
            b10 = k.b(q0.a(g1.a()), null, null, new b(null), 3, null);
            return q4.b.c(b10, null, 1, null);
        }

        @Override // r4.a
        @NotNull
        public x<Unit> c(@NotNull Uri trigger) {
            w0 b10;
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            b10 = k.b(q0.a(g1.a()), null, null, new e(trigger, null), 3, null);
            return q4.b.c(b10, null, 1, null);
        }

        @NotNull
        public x<Unit> e(@NotNull s4.a deletionRequest) {
            w0 b10;
            Intrinsics.checkNotNullParameter(deletionRequest, "deletionRequest");
            b10 = k.b(q0.a(g1.a()), null, null, new C0534a(deletionRequest, null), 3, null);
            return q4.b.c(b10, null, 1, null);
        }

        @NotNull
        public x<Unit> f(@NotNull Uri attributionSource, @Nullable InputEvent inputEvent) {
            w0 b10;
            Intrinsics.checkNotNullParameter(attributionSource, "attributionSource");
            b10 = k.b(q0.a(g1.a()), null, null, new c(attributionSource, inputEvent, null), 3, null);
            return q4.b.c(b10, null, 1, null);
        }

        @NotNull
        public x<Unit> g(@NotNull h request) {
            w0 b10;
            Intrinsics.checkNotNullParameter(request, "request");
            b10 = k.b(q0.a(g1.a()), null, null, new d(request, null), 3, null);
            return q4.b.c(b10, null, 1, null);
        }

        @NotNull
        public x<Unit> h(@NotNull i request) {
            w0 b10;
            Intrinsics.checkNotNullParameter(request, "request");
            b10 = k.b(q0.a(g1.a()), null, null, new f(request, null), 3, null);
            return q4.b.c(b10, null, 1, null);
        }

        @NotNull
        public x<Unit> i(@NotNull j request) {
            w0 b10;
            Intrinsics.checkNotNullParameter(request, "request");
            b10 = k.b(q0.a(g1.a()), null, null, new g(request, null), 3, null);
            return q4.b.c(b10, null, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lr4/a$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lr4/a;", ve.a.f33391e, "(Landroid/content/Context;)Lr4/a;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: r4.a$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final a a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            s4.b a10 = s4.b.INSTANCE.a(context);
            if (a10 != null) {
                return new C0533a(a10);
            }
            return null;
        }

        public Companion() {
        }
    }

    @Nullable
    public static final a a(@NotNull Context context) {
        return INSTANCE.a(context);
    }

    @NotNull
    public abstract x<Integer> b();

    @NotNull
    public abstract x<Unit> c(@NotNull Uri trigger);
}

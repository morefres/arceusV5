package s4;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.view.InputEvent;
import e3.n;
import gt.o;
import java.util.Iterator;
import java.util.List;
import ju.k;
import ju.p;
import ju.p0;
import ju.q0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0097@¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0097@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0097@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0097@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0018H\u0097@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u001bH\u0097@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0097@¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Ls4/g;", "Ls4/b;", "Landroid/adservices/measurement/MeasurementManager;", "mMeasurementManager", "<init>", "(Landroid/adservices/measurement/MeasurementManager;)V", "Ls4/a;", "deletionRequest", "", ve.a.f33391e, "(Ls4/a;Lmt/b;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;Lmt/b;)Ljava/lang/Object;", "trigger", "e", "(Landroid/net/Uri;Lmt/b;)Ljava/lang/Object;", "Ls4/i;", "request", "f", "(Ls4/i;Lmt/b;)Ljava/lang/Object;", "Ls4/h;", rl.d.f30696a, "(Ls4/h;Lmt/b;)Ljava/lang/Object;", "Ls4/j;", "g", "(Ls4/j;Lmt/b;)Ljava/lang/Object;", "", j6.b.f21518e, "(Lmt/b;)Ljava/lang/Object;", "Landroid/adservices/measurement/MeasurementManager;", "i", "()Landroid/adservices/measurement/MeasurementManager;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
/* loaded from: classes.dex */
public class g extends b {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final MeasurementManager mMeasurementManager;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {1, 8, 0})
    @ot.f(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4", f = "MeasurementManagerImplCommon.kt", l = {}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f30871t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f30872u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ h f30873v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ g f30874w;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {1, 8, 0})
        @ot.f(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4$1$1", f = "MeasurementManagerImplCommon.kt", l = {131}, m = "invokeSuspend")
        /* renamed from: s4.g$a$a, reason: collision with other inner class name */
        public static final class C0548a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public Object f30875t;

            /* renamed from: u, reason: collision with root package name */
            public Object f30876u;

            /* renamed from: v, reason: collision with root package name */
            public Object f30877v;

            /* renamed from: w, reason: collision with root package name */
            public int f30878w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ g f30879x;

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ Uri f30880y;

            /* renamed from: z, reason: collision with root package name */
            public final /* synthetic */ h f30881z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0548a(g gVar, Uri uri, h hVar, mt.b<? super C0548a> bVar) {
                super(2, bVar);
                this.f30879x = gVar;
                this.f30880y = uri;
                this.f30881z = hVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new C0548a(this.f30879x, this.f30880y, this.f30881z, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f30878w;
                if (i10 == 0) {
                    o.b(obj);
                    g gVar = this.f30879x;
                    Uri uri = this.f30880y;
                    h hVar = this.f30881z;
                    this.f30875t = gVar;
                    this.f30876u = uri;
                    this.f30877v = hVar;
                    this.f30878w = 1;
                    p pVar = new p(nt.b.c(this), 1);
                    pVar.F();
                    gVar.getMMeasurementManager().registerSource(uri, hVar.getInputEvent(), new n(), u2.n.a(pVar));
                    Object z10 = pVar.z();
                    if (z10 == nt.c.e()) {
                        ot.h.c(this);
                    }
                    if (z10 == e10) {
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
                return ((C0548a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, g gVar, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f30873v = hVar;
            this.f30874w = gVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            a aVar = new a(this.f30873v, this.f30874w, bVar);
            aVar.f30872u = obj;
            return aVar;
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f30871t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            p0 p0Var = (p0) this.f30872u;
            List<Uri> b = this.f30873v.b();
            g gVar = this.f30874w;
            h hVar = this.f30873v;
            Iterator<T> it = b.iterator();
            while (it.hasNext()) {
                k.d(p0Var, null, null, new C0548a(gVar, (Uri) it.next(), hVar, null), 3, null);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public g(@NotNull MeasurementManager mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.mMeasurementManager = mMeasurementManager;
    }

    public static /* synthetic */ Object h(g gVar, s4.a aVar, mt.b<? super Unit> bVar) {
        new p(nt.b.c(bVar), 1).F();
        gVar.getMMeasurementManager();
        throw null;
    }

    public static /* synthetic */ Object j(g gVar, mt.b<? super Integer> bVar) {
        p pVar = new p(nt.b.c(bVar), 1);
        pVar.F();
        gVar.getMMeasurementManager().getMeasurementApiStatus(new n(), u2.n.a(pVar));
        Object z10 = pVar.z();
        if (z10 == nt.c.e()) {
            ot.h.c(bVar);
        }
        return z10;
    }

    public static /* synthetic */ Object k(g gVar, Uri uri, InputEvent inputEvent, mt.b<? super Unit> bVar) {
        p pVar = new p(nt.b.c(bVar), 1);
        pVar.F();
        gVar.getMMeasurementManager().registerSource(uri, inputEvent, new n(), u2.n.a(pVar));
        Object z10 = pVar.z();
        if (z10 == nt.c.e()) {
            ot.h.c(bVar);
        }
        return z10 == nt.c.e() ? z10 : Unit.f22894a;
    }

    public static /* synthetic */ Object l(g gVar, h hVar, mt.b<? super Unit> bVar) {
        Object g10 = q0.g(new a(hVar, gVar, null), bVar);
        return g10 == nt.c.e() ? g10 : Unit.f22894a;
    }

    public static /* synthetic */ Object m(g gVar, Uri uri, mt.b<? super Unit> bVar) {
        p pVar = new p(nt.b.c(bVar), 1);
        pVar.F();
        gVar.getMMeasurementManager().registerTrigger(uri, new n(), u2.n.a(pVar));
        Object z10 = pVar.z();
        if (z10 == nt.c.e()) {
            ot.h.c(bVar);
        }
        return z10 == nt.c.e() ? z10 : Unit.f22894a;
    }

    public static /* synthetic */ Object n(g gVar, i iVar, mt.b<? super Unit> bVar) {
        new p(nt.b.c(bVar), 1).F();
        gVar.getMMeasurementManager();
        throw null;
    }

    public static /* synthetic */ Object o(g gVar, j jVar, mt.b<? super Unit> bVar) {
        new p(nt.b.c(bVar), 1).F();
        gVar.getMMeasurementManager();
        throw null;
    }

    @Override // s4.b
    @Nullable
    public Object a(@NotNull s4.a aVar, @NotNull mt.b<? super Unit> bVar) {
        return h(this, aVar, bVar);
    }

    @Override // s4.b
    @Nullable
    public Object b(@NotNull mt.b<? super Integer> bVar) {
        return j(this, bVar);
    }

    @Override // s4.b
    @Nullable
    public Object c(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull mt.b<? super Unit> bVar) {
        return k(this, uri, inputEvent, bVar);
    }

    @Override // s4.b
    @Nullable
    public Object d(@NotNull h hVar, @NotNull mt.b<? super Unit> bVar) {
        return l(this, hVar, bVar);
    }

    @Override // s4.b
    @Nullable
    public Object e(@NotNull Uri uri, @NotNull mt.b<? super Unit> bVar) {
        return m(this, uri, bVar);
    }

    @Override // s4.b
    @Nullable
    public Object f(@NotNull i iVar, @NotNull mt.b<? super Unit> bVar) {
        return n(this, iVar, bVar);
    }

    @Override // s4.b
    @Nullable
    public Object g(@NotNull j jVar, @NotNull mt.b<? super Unit> bVar) {
        return o(this, jVar, bVar);
    }

    @NotNull
    /* renamed from: i, reason: from getter */
    public final MeasurementManager getMMeasurementManager() {
        return this.mMeasurementManager;
    }
}

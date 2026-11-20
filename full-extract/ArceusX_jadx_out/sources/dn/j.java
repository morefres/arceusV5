package dn;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import g0.h1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ldn/j;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", j6.b.f21518e, "(Landroid/content/Context;Lmt/b;)Ljava/lang/Object;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f15081a = new j();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.camera.CameraHelper", f = "CameraHelper.kt", l = {13, 16, 20}, m = "unbind")
    public static final class a extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f15082t;

        /* renamed from: u, reason: collision with root package name */
        public Object f15083u;

        /* renamed from: v, reason: collision with root package name */
        public Object f15084v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f15085w;

        /* renamed from: y, reason: collision with root package name */
        public int f15087y;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15085w = obj;
            this.f15087y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return j.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.camera.CameraHelper$unbind$2", f = "CameraHelper.kt", l = {}, m = "invokeSuspend")
    public static final class b extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f15088t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ d1.k f15089u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d1.k kVar, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f15089u = kVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new b(this.f15089u, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f15088t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            try {
                this.f15089u.h();
            } catch (h1 unused) {
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Lne/x;", "Ld1/k;", "<anonymous>", "(Lju/p0;)Lne/x;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.camera.CameraHelper$unbind$future$1", f = "CameraHelper.kt", l = {}, m = "invokeSuspend")
    public static final class c extends ot.m implements Function2<ju.p0, mt.b<? super ne.x<d1.k>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f15090t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f15091u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, mt.b<? super c> bVar) {
            super(2, bVar);
            this.f15091u = context;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new c(this.f15091u, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f15090t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            return d1.k.INSTANCE.c(this.f15091u);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super ne.x<d1.k>> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final d1.k c(ne.x xVar) {
        return (d1.k) xVar.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bb, code lost:
    
        if (ju.i.g(r5, r6, r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r11 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull android.content.Context r10, @org.jetbrains.annotations.NotNull mt.b<? super kotlin.Unit> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof dn.j.a
            if (r0 == 0) goto L13
            r0 = r11
            dn.j$a r0 = (dn.j.a) r0
            int r1 = r0.f15087y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15087y = r1
            goto L18
        L13:
            dn.j$a r0 = new dn.j$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f15085w
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f15087y
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L59
            if (r2 == r6) goto L51
            if (r2 == r5) goto L45
            if (r2 != r4) goto L3d
            java.lang.Object r10 = r0.f15084v
            d1.k r10 = (d1.k) r10
            java.lang.Object r10 = r0.f15083u
            ne.x r10 = (ne.x) r10
            java.lang.Object r10 = r0.f15082t
            android.content.Context r10 = (android.content.Context) r10
            gt.o.b(r11)
            goto Lbe
        L3d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L45:
            java.lang.Object r10 = r0.f15083u
            ne.x r10 = (ne.x) r10
            java.lang.Object r2 = r0.f15082t
            android.content.Context r2 = (android.content.Context) r2
            gt.o.b(r11)
            goto L98
        L51:
            java.lang.Object r10 = r0.f15082t
            android.content.Context r10 = (android.content.Context) r10
            gt.o.b(r11)
            goto L74
        L59:
            gt.o.b(r11)
            ju.n2 r11 = ju.g1.c()
            dn.j$c r2 = new dn.j$c
            r2.<init>(r10, r3)
            java.lang.Object r7 = ot.l.a(r10)
            r0.f15082t = r7
            r0.f15087y = r6
            java.lang.Object r11 = ju.i.g(r11, r2, r0)
            if (r11 != r1) goto L74
            goto Lbd
        L74:
            ne.x r11 = (ne.x) r11
            ju.l0 r2 = ju.g1.b()
            dn.i r6 = new dn.i
            r6.<init>()
            java.lang.Object r7 = ot.l.a(r10)
            r0.f15082t = r7
            java.lang.Object r7 = ot.l.a(r11)
            r0.f15083u = r7
            r0.f15087y = r5
            java.lang.Object r2 = ju.a2.b(r2, r6, r0)
            if (r2 != r1) goto L94
            goto Lbd
        L94:
            r8 = r2
            r2 = r10
            r10 = r11
            r11 = r8
        L98:
            d1.k r11 = (d1.k) r11
            ju.n2 r5 = ju.g1.c()
            dn.j$b r6 = new dn.j$b
            r6.<init>(r11, r3)
            java.lang.Object r2 = ot.l.a(r2)
            r0.f15082t = r2
            java.lang.Object r10 = ot.l.a(r10)
            r0.f15083u = r10
            java.lang.Object r10 = ot.l.a(r11)
            r0.f15084v = r10
            r0.f15087y = r4
            java.lang.Object r10 = ju.i.g(r5, r6, r0)
            if (r10 != r1) goto Lbe
        Lbd:
            return r1
        Lbe:
            kotlin.Unit r10 = kotlin.Unit.f22894a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: dn.j.b(android.content.Context, mt.b):java.lang.Object");
    }
}

package fr;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import ar.w1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import gt.n;
import gt.o;
import hr.h0;
import java.util.List;
import ju.a0;
import ju.n;
import ju.p0;
import ju.z2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.y;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zl.t;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001f\u0010#\u001a\r\u0012\t\u0012\u00070\u001f¢\u0006\u0002\b 0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010*\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b+\u0010,*\u0004\b-\u0010.¨\u00060"}, d2 = {"Lfr/j;", "", "Landroid/view/ViewGroup;", "contentView", "<init>", "(Landroid/view/ViewGroup;)V", "Lar/w1;", "component", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "", "onItemsSelectedListener", t.f38095d, "(Lar/w1;Lkotlin/jvm/functions/Function1;)V", "", "l", "()Z", "Lkotlin/Function0;", "callback", "p", "(Lkotlin/jvm/functions/Function0;)V", "visible", "hasTitle", "q", "(ZZ)V", "r", "()V", ve.a.f33391e, "Landroid/view/ViewGroup;", "Lgt/h;", "Ler/a;", "Lkotlin/jvm/internal/EnhancedNullability;", j6.b.f21518e, "Lgt/h;", "lazyBinding", "c", "Z", "setup", "", rl.d.f30696a, "Lkotlin/jvm/functions/Function1;", "bottomSheetStateChangeListener", "n", "()Ler/a;", "getBinding$delegate", "(Lfr/j;)Ljava/lang/Object;", "binding", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ViewGroup contentView;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final gt.h<er.a> lazyBinding;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean setup;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Integer, Unit> bottomSheetStateChangeListener;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1", f = "InputSelectBottomSheetController.kt", l = {}, m = "invokeSuspend")
    public static final class a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f17704t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f17705u;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f17707w;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$1", f = "InputSelectBottomSheetController.kt", l = {296, 198}, m = "invokeSuspend")
        /* renamed from: fr.j$a$a, reason: collision with other inner class name */
        public static final class C0318a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public Object f17708t;

            /* renamed from: u, reason: collision with root package name */
            public int f17709u;

            /* renamed from: v, reason: collision with root package name */
            public int f17710v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ a0 f17711w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ j f17712x;

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ Function0<Unit> f17713y;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            /* renamed from: fr.j$a$a$a, reason: collision with other inner class name */
            public static final class C0319a implements Function1<WindowInsetsCompat, Unit> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ y f17714a;
                public final /* synthetic */ n<Unit> b;

                /* JADX WARN: Multi-variable type inference failed */
                public C0319a(y yVar, n<? super Unit> nVar) {
                    this.f17714a = yVar;
                    this.b = nVar;
                }

                public final void a(WindowInsetsCompat insets) {
                    Intrinsics.checkNotNullParameter(insets, "insets");
                    if (this.f17714a.f22979a) {
                        return;
                    }
                    Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.ime());
                    Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
                    if (insets2.bottom > 0) {
                        this.f17714a.f22979a = true;
                        n<Unit> nVar = this.b;
                        n.Companion companion = gt.n.INSTANCE;
                        nVar.resumeWith(gt.n.b(Unit.f22894a));
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WindowInsetsCompat windowInsetsCompat) {
                    a(windowInsetsCompat);
                    return Unit.f22894a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
            @ot.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$1$2", f = "InputSelectBottomSheetController.kt", l = {}, m = "invokeSuspend")
            /* renamed from: fr.j$a$a$b */
            public static final class b extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

                /* renamed from: t, reason: collision with root package name */
                public int f17715t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ Function0<Unit> f17716u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Function0<Unit> function0, mt.b<? super b> bVar) {
                    super(2, bVar);
                    this.f17716u = function0;
                }

                @Override // ot.a
                public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                    return new b(this.f17716u, bVar);
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    nt.c.e();
                    if (this.f17715t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    this.f17716u.invoke();
                    return Unit.f22894a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                    return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0318a(a0 a0Var, j jVar, Function0<Unit> function0, mt.b<? super C0318a> bVar) {
                super(2, bVar);
                this.f17711w = a0Var;
                this.f17712x = jVar;
                this.f17713y = function0;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new C0318a(this.f17711w, this.f17712x, this.f17713y, bVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
            
                if (ju.i.g(r8, r1, r7) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
            
                if (r8 == r0) goto L17;
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
                    int r1 = r7.f17710v
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L23
                    if (r1 == r4) goto L1b
                    if (r1 != r2) goto L13
                    gt.o.b(r8)
                    goto L7b
                L13:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1b:
                    java.lang.Object r1 = r7.f17708t
                    fr.j r1 = (fr.j) r1
                    gt.o.b(r8)
                    goto L65
                L23:
                    gt.o.b(r8)
                    fr.j r8 = r7.f17712x
                    r7.f17708t = r8
                    r1 = 0
                    r7.f17709u = r1
                    r7.f17710v = r4
                    ju.p r1 = new ju.p
                    mt.b r5 = nt.b.c(r7)
                    r1.<init>(r5, r4)
                    r1.F()
                    kotlin.jvm.internal.y r5 = new kotlin.jvm.internal.y
                    r5.<init>()
                    er.a r8 = fr.j.j(r8)
                    android.widget.FrameLayout r8 = r8.getRoot()
                    java.lang.String r6 = "getRoot(...)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)
                    fr.j$a$a$a r6 = new fr.j$a$a$a
                    r6.<init>(r5, r1)
                    uq.g.g(r8, r6)
                    java.lang.Object r8 = r1.z()
                    java.lang.Object r1 = nt.c.e()
                    if (r8 != r1) goto L62
                    ot.h.c(r7)
                L62:
                    if (r8 != r0) goto L65
                    goto L7a
                L65:
                    ju.n2 r8 = ju.g1.c()
                    fr.j$a$a$b r1 = new fr.j$a$a$b
                    kotlin.jvm.functions.Function0<kotlin.Unit> r5 = r7.f17713y
                    r1.<init>(r5, r3)
                    r7.f17708t = r3
                    r7.f17710v = r2
                    java.lang.Object r8 = ju.i.g(r8, r1, r7)
                    if (r8 != r0) goto L7b
                L7a:
                    return r0
                L7b:
                    ju.a0 r8 = r7.f17711w
                    ju.d2.a.a(r8, r3, r4, r3)
                    kotlin.Unit r8 = kotlin.Unit.f22894a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.j.a.C0318a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                return ((C0318a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$2", f = "InputSelectBottomSheetController.kt", l = {213, 216}, m = "invokeSuspend")
        public static final class b extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f17717t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ j f17718u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ a0 f17719v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Function0<Unit> f17720w;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
            @ot.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$2$1", f = "InputSelectBottomSheetController.kt", l = {}, m = "invokeSuspend")
            /* renamed from: fr.j$a$b$a, reason: collision with other inner class name */
            public static final class C0320a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

                /* renamed from: t, reason: collision with root package name */
                public int f17721t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ Function0<Unit> f17722u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0320a(Function0<Unit> function0, mt.b<? super C0320a> bVar) {
                    super(2, bVar);
                    this.f17722u = function0;
                }

                @Override // ot.a
                public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                    return new C0320a(this.f17722u, bVar);
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    nt.c.e();
                    if (this.f17721t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    this.f17722u.invoke();
                    return Unit.f22894a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                    return ((C0320a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(j jVar, a0 a0Var, Function0<Unit> function0, mt.b<? super b> bVar) {
                super(2, bVar);
                this.f17718u = jVar;
                this.f17719v = a0Var;
                this.f17720w = function0;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new b(this.f17718u, this.f17719v, this.f17720w, bVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
            
                if (ju.i.g(r8, r1, r7) == r0) goto L21;
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
                    int r1 = r7.f17717t
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L1b
                    if (r1 == r4) goto L1b
                    if (r1 != r2) goto L13
                    gt.o.b(r8)
                    goto L4c
                L13:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1b:
                    gt.o.b(r8)
                L1e:
                    fr.j r8 = r7.f17718u
                    er.a r8 = fr.j.j(r8)
                    android.widget.FrameLayout r8 = r8.getRoot()
                    androidx.core.view.WindowInsetsCompat r8 = androidx.core.view.o0.F(r8)
                    if (r8 == 0) goto L54
                    int r1 = androidx.core.view.WindowInsetsCompat.Type.ime()
                    boolean r8 = r8.isVisible(r1)
                    if (r8 != r4) goto L54
                    ju.n2 r8 = ju.g1.c()
                    fr.j$a$b$a r1 = new fr.j$a$b$a
                    kotlin.jvm.functions.Function0<kotlin.Unit> r5 = r7.f17720w
                    r1.<init>(r5, r3)
                    r7.f17717t = r2
                    java.lang.Object r8 = ju.i.g(r8, r1, r7)
                    if (r8 != r0) goto L4c
                    goto L5e
                L4c:
                    ju.a0 r8 = r7.f17719v
                    ju.d2.a.a(r8, r3, r4, r3)
                    kotlin.Unit r8 = kotlin.Unit.f22894a
                    return r8
                L54:
                    r7.f17717t = r4
                    r5 = 100
                    java.lang.Object r8 = ju.z0.b(r5, r7)
                    if (r8 != r0) goto L1e
                L5e:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.j.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$3", f = "InputSelectBottomSheetController.kt", l = {223, 224}, m = "invokeSuspend")
        public static final class c extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f17723t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ a0 f17724u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Function0<Unit> f17725v;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
            @ot.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$3$1", f = "InputSelectBottomSheetController.kt", l = {}, m = "invokeSuspend")
            /* renamed from: fr.j$a$c$a, reason: collision with other inner class name */
            public static final class C0321a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

                /* renamed from: t, reason: collision with root package name */
                public int f17726t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ Function0<Unit> f17727u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0321a(Function0<Unit> function0, mt.b<? super C0321a> bVar) {
                    super(2, bVar);
                    this.f17727u = function0;
                }

                @Override // ot.a
                public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                    return new C0321a(this.f17727u, bVar);
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    nt.c.e();
                    if (this.f17726t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    this.f17727u.invoke();
                    return Unit.f22894a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                    return ((C0321a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(a0 a0Var, Function0<Unit> function0, mt.b<? super c> bVar) {
                super(2, bVar);
                this.f17724u = a0Var;
                this.f17725v = function0;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new c(this.f17724u, this.f17725v, bVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
            
                if (ju.i.g(r8, r1, r7) == r0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
            
                if (ju.z0.b(1000, r7) == r0) goto L15;
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
                    int r1 = r7.f17723t
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L1f
                    if (r1 == r4) goto L1b
                    if (r1 != r2) goto L13
                    gt.o.b(r8)
                    goto L41
                L13:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1b:
                    gt.o.b(r8)
                    goto L2d
                L1f:
                    gt.o.b(r8)
                    r7.f17723t = r4
                    r5 = 1000(0x3e8, double:4.94E-321)
                    java.lang.Object r8 = ju.z0.b(r5, r7)
                    if (r8 != r0) goto L2d
                    goto L40
                L2d:
                    ju.n2 r8 = ju.g1.c()
                    fr.j$a$c$a r1 = new fr.j$a$c$a
                    kotlin.jvm.functions.Function0<kotlin.Unit> r5 = r7.f17725v
                    r1.<init>(r5, r3)
                    r7.f17723t = r2
                    java.lang.Object r8 = ju.i.g(r8, r1, r7)
                    if (r8 != r0) goto L41
                L40:
                    return r0
                L41:
                    ju.a0 r8 = r7.f17724u
                    ju.d2.a.a(r8, r3, r4, r3)
                    kotlin.Unit r8 = kotlin.Unit.f22894a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.j.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<Unit> function0, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f17707w = function0;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            a aVar = j.this.new a(this.f17707w, bVar);
            aVar.f17705u = obj;
            return aVar;
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            p0 p0Var = (p0) this.f17705u;
            nt.c.e();
            if (this.f17704t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            a0 b10 = z2.b(null, 1, null);
            ju.k.d(p0Var, b10, null, new C0318a(b10, j.this, this.f17707w, null), 2, null);
            ju.k.d(p0Var, b10, null, new b(j.this, b10, this.f17707w, null), 2, null);
            ju.k.d(p0Var, b10, null, new c(b10, this.f17707w, null), 2, null);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"fr/j$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;", "Landroid/view/View;", "bottomSheet", "", "newState", "", "c", "(Landroid/view/View;I)V", "", "slideOffset", j6.b.f21518e, "(Landroid/view/View;F)V", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends BottomSheetBehavior.g {
        public b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View bottomSheet, float slideOffset) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View bottomSheet, int newState) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            Function1 function1 = j.this.bottomSheetStateChangeListener;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(newState));
            }
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"fr/j$c", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f17729a;

        public c(m mVar) {
            this.f17729a = mVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s8) {
            this.f17729a.J(String.valueOf(s8));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s8, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s8, int start, int before, int count) {
        }
    }

    public j(@NotNull ViewGroup contentView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.contentView = contentView;
        this.lazyBinding = gt.i.b(new Function0() { // from class: fr.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                er.a o8;
                o8 = j.o(j.this);
                return o8;
            }
        });
    }

    public static final void m(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.X0(5);
    }

    public static final er.a o(j jVar) {
        return er.a.c(LayoutInflater.from(jVar.contentView.getContext()), jVar.contentView, true);
    }

    public static final Unit s() {
        return Unit.f22894a;
    }

    public static final Unit u(w1 w1Var, c0 c0Var, j jVar, Option selectedItem) {
        Intrinsics.checkNotNullParameter(selectedItem, "selectedItem");
        if (!w1Var.getCanSelectMultipleValues()) {
            Function1 function1 = (Function1) c0Var.f22963a;
            if (function1 != null) {
                function1.invoke(kotlin.collections.o.d(selectedItem));
            }
            c0Var.f22963a = null;
            jVar.l();
        }
        return Unit.f22894a;
    }

    public static final void v(boolean z10, j jVar, final BottomSheetBehavior bottomSheetBehavior) {
        if (z10) {
            jVar.p(new Function0() { // from class: fr.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit w5;
                    w5 = j.w(BottomSheetBehavior.this);
                    return w5;
                }
            });
        } else {
            bottomSheetBehavior.X0(3);
        }
    }

    public static final Unit w(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.X0(3);
        return Unit.f22894a;
    }

    public static final Unit x(c0 c0Var, m mVar, j jVar, int i10) {
        if (i10 == 5) {
            Function1 function1 = (Function1) c0Var.f22963a;
            if (function1 != null) {
                function1.invoke(CollectionsKt.M0(mVar.F()));
            }
            c0Var.f22963a = null;
            Context context = jVar.contentView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            hq.g.d(context);
        }
        return Unit.f22894a;
    }

    public static final void y(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.X0(5);
    }

    public static final void z(j jVar, View view) {
        jVar.l();
    }

    public final boolean l() {
        if (!this.lazyBinding.isInitialized()) {
            return false;
        }
        final BottomSheetBehavior q02 = BottomSheetBehavior.q0(n().b);
        Intrinsics.checkNotNullExpressionValue(q02, "from(...)");
        Context context = this.contentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        hq.g.d(context);
        this.contentView.postDelayed(new Runnable() { // from class: fr.b
            @Override // java.lang.Runnable
            public final void run() {
                j.m(BottomSheetBehavior.this);
            }
        }, 100L);
        return q02.v0() != 5;
    }

    public final er.a n() {
        return this.lazyBinding.getValue();
    }

    public final void p(Function0<Unit> callback) {
        Context context = this.contentView.getContext();
        Intrinsics.checkNotNull(context);
        j.b a10 = hq.g.a(context);
        if (a10 == null) {
            return;
        }
        ju.k.d(android.view.t.a(a10), null, null, new a(callback, null), 3, null);
    }

    public final void q(boolean visible, boolean hasTitle) {
        if (visible) {
            n().f16185j.setVisibility(8);
            n().f16183h.setVisibility(0);
            n().f16182g.requestFocus();
            Context context = n().f16182g.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            hq.g.j(context);
            return;
        }
        Context context2 = n().f16182g.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        hq.g.d(context2);
        n().f16183h.setVisibility(8);
        n().f16185j.setVisibility(0);
        n().f16182g.setText("");
    }

    public final void r() {
        if (this.setup) {
            return;
        }
        this.setup = true;
        BottomSheetBehavior q02 = BottomSheetBehavior.q0(n().b);
        Intrinsics.checkNotNullExpressionValue(q02, "from(...)");
        q02.Z0(true);
        Function0 function0 = new Function0() { // from class: fr.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit s8;
                s8 = j.s();
                return s8;
            }
        };
        FrameLayout bottomSheet = n().b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        uq.b.b(q02, function0, bottomSheet, n().f16178c, n().f16184i);
        q02.c0(new b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(@NotNull final w1 component, @NotNull Function1<? super List<Option>, Unit> onItemsSelectedListener) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(onItemsSelectedListener, "onItemsSelectedListener");
        r();
        final c0 c0Var = new c0();
        c0Var.f22963a = onItemsSelectedListener;
        String label = component.getLabel();
        final boolean z10 = label == null || StringsKt.p0(label);
        final BottomSheetBehavior q02 = BottomSheetBehavior.q0(n().b);
        Intrinsics.checkNotNullExpressionValue(q02, "from(...)");
        Context context = n().f16181f.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final m mVar = new m(context, component.g(), component.getF19529a(), component.getCanSelectMultipleValues(), component.getLeadingImageTemplate(), component.m(), new Function1() { // from class: fr.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit u8;
                u8 = j.u(w1.this, c0Var, this, (Option) obj);
                return u8;
            }
        });
        this.bottomSheetStateChangeListener = new Function1() { // from class: fr.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit x10;
                x10 = j.x(c0.this, mVar, this, ((Integer) obj).intValue());
                return x10;
            }
        };
        q(z10, !z10);
        n().f16185j.setText(component.getLabel());
        n().f16181f.setAdapter(mVar);
        n().f16184i.setOnClickListener(new View.OnClickListener() { // from class: fr.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.y(BottomSheetBehavior.this, view);
            }
        });
        InputSelectBoxComponentStyle f19529a = component.getF19529a();
        if (f19529a != null) {
            TextView textviewInputSelectSheetTitle = n().f16185j;
            Intrinsics.checkNotNullExpressionValue(textviewInputSelectSheetTitle, "textviewInputSelectSheetTitle");
            h0.l(textviewInputSelectSheetTitle, f19529a.getTextBasedStyle(), null, 2, null);
            Integer baseBackgroundColorValue = f19529a.getBaseBackgroundColorValue();
            if (baseBackgroundColorValue != null) {
                int intValue = baseBackgroundColorValue.intValue();
                n().f16178c.setBackgroundColor(intValue);
                n().f16181f.setBackgroundColor(intValue);
            }
            Integer baseBorderColorValue = f19529a.getBaseBorderColorValue();
            if (baseBorderColorValue != null) {
                n().f16179d.setBackgroundColor(baseBorderColorValue.intValue());
            }
            Integer headerCancelButtonColor = f19529a.getHeaderCancelButtonColor();
            if (headerCancelButtonColor != null) {
                int intValue2 = headerCancelButtonColor.intValue();
                n().f16180e.setImageTintList(ColorStateList.valueOf(intValue2));
                n().f16183h.setEndIconTintList(ColorStateList.valueOf(intValue2));
            }
            Integer baseTextColor = f19529a.getBaseTextColor();
            if (baseTextColor != null) {
                int intValue3 = baseTextColor.intValue();
                ColorStateList valueOf = ColorStateList.valueOf(androidx.core.graphics.c.l(intValue3, 128));
                Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
                n().f16182g.setHintTextColor(valueOf);
                n().f16182g.setTextColor(intValue3);
            }
        }
        n().f16181f.setLayoutManager(new LinearLayoutManager(n().getRoot().getContext()));
        n().f16181f.setHasFixedSize(true);
        n().f16182g.addTextChangedListener(new c(mVar));
        n().f16180e.setOnClickListener(new View.OnClickListener() { // from class: fr.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.z(j.this, view);
            }
        });
        n().f16182g.setText("");
        n().b.setTranslationY(0.0f);
        this.contentView.postDelayed(new Runnable() { // from class: fr.g
            @Override // java.lang.Runnable
            public final void run() {
                j.v(z10, this, q02);
            }
        }, 100L);
    }
}

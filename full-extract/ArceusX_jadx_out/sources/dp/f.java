package dp;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.s;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import e.m0;
import e.p0;
import f7.o0;
import fp.u0;
import hq.z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xo.g0;
import xo.y;
import yt.n;

@Metadata(d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r*\u0001\u001c\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0017\u001a\u00020\u0011*\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\t2\b\b\u0001\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u00104\u001a\u0004\u0018\u00010\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"Ldp/f;", "Lmq/a;", "Lzo/g;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lfp/u0;", "model", "s2", "(Lfp/u0;)V", "Landroid/content/Context;", "", "attrColor", "Landroid/util/TypedValue;", "typedValue", "", "resolveRefs", "m2", "(Landroid/content/Context;ILandroid/util/TypedValue;Z)I", "animationResId", "w2", "(I)V", "dp/f$c", "j0", "Ldp/f$c;", "onBackPressedCallback", "Lkotlin/Function0;", "k0", "Lkotlin/jvm/functions/Function0;", "onBackPressHandler", "l0", "Ljava/lang/Integer;", "currentAnimationRes", "m0", "Lfp/u0;", "currentModel", "Ltq/a;", "n0", "Ltq/a;", "p2", "()Ltq/a;", "setSystemUiController", "(Ltq/a;)V", "systemUiController", "o2", "()Ljava/lang/Integer;", "customAnimation", "o0", j6.b.f21518e, "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends mq.a<zo.g> {

    /* renamed from: o0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c onBackPressedCallback;

    /* renamed from: k0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> onBackPressHandler;

    /* renamed from: l0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Integer currentAnimationRes;

    /* renamed from: m0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public u0 currentModel;

    /* renamed from: n0, reason: collision with root package name and from kotlin metadata */
    public tq.a systemUiController;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends k implements n<LayoutInflater, ViewGroup, Boolean, zo.g> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15204a = new a();

        public a() {
            super(3, zo.g.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/internal/databinding/Pi2InquiryInitializingBinding;", 0);
        }

        public final zo.g d(LayoutInflater p02, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return zo.g.c(p02, viewGroup, z10);
        }

        @Override // yt.n
        public /* bridge */ /* synthetic */ zo.g invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldp/f$b;", "", "<init>", "()V", "Ldp/f;", ve.a.f33391e, "()Ldp/f;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: dp.f$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final f a() {
            return new f();
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"dp/f$c", "Le/m0;", "", "handleOnBackPressed", "()V", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends m0 {
        public c() {
            super(false);
        }

        @Override // e.m0
        public void handleOnBackPressed() {
            Function0 function0 = f.this.onBackPressHandler;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public f() {
        super(a.f15204a);
        this.onBackPressedCallback = new c();
    }

    public static /* synthetic */ int n2(f fVar, Context context, int i10, TypedValue typedValue, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        return fVar.m2(context, i10, typedValue, z10);
    }

    public static final Integer q2(f fVar, View view, t7.b bVar) {
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return Integer.valueOf(n2(fVar, context, ic.b.f20406m, null, false, 6, null));
    }

    public static final Integer r2(f fVar, View view, t7.b bVar) {
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return Integer.valueOf(n2(fVar, context, i.a.f19822z, null, false, 6, null));
    }

    public static final Integer t2(int i10, t7.b bVar) {
        return Integer.valueOf(i10);
    }

    public static final Integer u2(int i10, t7.b bVar) {
        return Integer.valueOf(i10);
    }

    public static final Unit v2(y.a aVar) {
        aVar.a().invoke();
        return Unit.f22894a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.c
    public void e1(@NotNull final View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        Integer o22 = o2();
        LottieAnimationView animationviewInquiryInitializingspinner = ((zo.g) b2()).b;
        Intrinsics.checkNotNullExpressionValue(animationviewInquiryInitializingspinner, "animationviewInquiryInitializingspinner");
        if (o22 != null) {
            w2(o22.intValue());
            animationviewInquiryInitializingspinner.x();
        } else {
            animationviewInquiryInitializingspinner.l(new l7.e("**"), o0.b, new t7.e() { // from class: dp.a
                @Override // t7.e
                public final Object a(t7.b bVar) {
                    Integer q22;
                    q22 = f.q2(f.this, view, bVar);
                    return q22;
                }
            });
            animationviewInquiryInitializingspinner.l(new l7.e("**"), o0.f16982a, new t7.e() { // from class: dp.b
                @Override // t7.e
                public final Object a(t7.b bVar) {
                    Integer r22;
                    r22 = f.r2(f.this, view, bVar);
                    return r22;
                }
            });
        }
        p0 P = H1().P();
        s k02 = k0();
        Intrinsics.checkNotNullExpressionValue(k02, "getViewLifecycleOwner(...)");
        P.d(k02, this.onBackPressedCallback);
        u0 u0Var = this.currentModel;
        if (u0Var != null) {
            s2(u0Var);
        }
    }

    public final int m2(Context context, int i10, TypedValue typedValue, boolean z10) {
        context.getTheme().resolveAttribute(i10, typedValue, z10);
        return typedValue.data;
    }

    public final Integer o2() {
        Context w5 = w();
        if (w5 != null) {
            return z.f(w5, tp.a.f32350n, null, false, 6, null);
        }
        return null;
    }

    @NotNull
    public final tq.a p2() {
        tq.a aVar = this.systemUiController;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("systemUiController");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s2(@NotNull u0 model) {
        f fVar;
        int n22;
        Integer backgroundColorValue;
        Intrinsics.checkNotNullParameter(model, "model");
        this.currentModel = model;
        if (d2()) {
            ConstraintLayout root = ((zo.g) b2()).getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            final y.a inquiryLoadingScreen = model.getInquiryLoadingScreen();
            Integer o22 = o2();
            if (inquiryLoadingScreen.getUseBasicSpinner() && o22 == null) {
                w2(g0.f35842a);
                ((zo.g) b2()).b.setScaleX(0.5f);
                ((zo.g) b2()).b.setScaleY(0.5f);
            }
            if (inquiryLoadingScreen.getUseBasicSpinner()) {
                Context context = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Integer f10 = z.f(context, tp.a.f32349m, null, false, 6, null);
                if (f10 != null) {
                    root.setBackgroundResource(f10.intValue());
                }
            }
            StepStyle styles = inquiryLoadingScreen.getStyles();
            if (styles == null || (backgroundColorValue = styles.getBackgroundColorValue()) == null) {
                Context context2 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                fVar = this;
                n22 = n2(fVar, context2, R.attr.colorBackground, null, false, 6, null);
            } else {
                n22 = backgroundColorValue.intValue();
                fVar = this;
            }
            tq.a p22 = p2();
            Context context3 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            p22.a(context3, n22);
            StepStyle styles2 = inquiryLoadingScreen.getStyles();
            if (styles2 != null) {
                Integer backgroundColorValue2 = styles2.getBackgroundColorValue();
                if (backgroundColorValue2 != null) {
                    root.setBackgroundColor(backgroundColorValue2.intValue());
                }
                Context context4 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                Drawable a10 = jr.d.a(styles2, context4);
                if (a10 != null) {
                    root.setBackground(a10);
                }
                if (o22 == null) {
                    Integer fillColorValue = styles2.getFillColorValue();
                    if (fillColorValue != null) {
                        final int intValue = fillColorValue.intValue();
                        ((zo.g) b2()).b.l(new l7.e("**"), o0.f16982a, new t7.e() { // from class: dp.c
                            @Override // t7.e
                            public final Object a(t7.b bVar) {
                                Integer u22;
                                u22 = f.u2(intValue, bVar);
                                return u22;
                            }
                        });
                    }
                    Integer strokeColorValue = styles2.getStrokeColorValue();
                    if (strokeColorValue != null) {
                        final int intValue2 = strokeColorValue.intValue();
                        ((zo.g) b2()).b.l(new l7.e("**"), o0.b, new t7.e() { // from class: dp.d
                            @Override // t7.e
                            public final Object a(t7.b bVar) {
                                Integer t22;
                                t22 = f.t2(intValue2, bVar);
                                return t22;
                            }
                        });
                    }
                }
            }
            fVar.onBackPressedCallback.setEnabled(true);
            fVar.onBackPressHandler = new Function0() { // from class: dp.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit v22;
                    v22 = f.v2(y.a.this);
                    return v22;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w2(int animationResId) {
        Integer num = this.currentAnimationRes;
        if (num != null && num.intValue() == animationResId) {
            return;
        }
        this.currentAnimationRes = Integer.valueOf(animationResId);
        LottieAnimationView lottieAnimationView = ((zo.g) b2()).b;
        lottieAnimationView.m();
        lottieAnimationView.setMinFrame(0);
        lottieAnimationView.setAnimation(animationResId);
        lottieAnimationView.v();
    }
}

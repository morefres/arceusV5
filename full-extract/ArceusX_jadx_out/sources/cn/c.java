package cn;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.app.a;
import cn.AlertScreen;
import com.appsflyer.sdk_base.referrer.Payload;
import com.squareup.workflow1.ui.modal.ModalContainer;
import gt.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ym.ViewEnvironment;
import ym.a0;
import ym.e0;
import yt.o;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eB;\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0007*\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcn/c;", "Lcom/squareup/workflow1/ui/modal/ModalContainer;", "Lcn/e;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "dialogThemeResId", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;III)V", "initialModalRendering", "Lym/y;", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/modal/ModalContainer$a;", "g", "(Lcn/e;Lym/y;)Lcom/squareup/workflow1/ui/modal/ModalContainer$a;", "dialogRef", "", rl.d.f30696a, "(Lcom/squareup/workflow1/ui/modal/ModalContainer$a;)V", "Lcn/e$a;", "h", "(Lcn/e$a;)I", "e", "I", "f", ve.a.f33391e, j6.b.f21518e, "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends ModalContainer<AlertScreen> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int dialogThemeResId;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J8\u0010\r\u001a\u00020\f2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcn/c$b;", "Lym/a0;", "Lcn/d;", "<init>", "()V", "initialRendering", "Lym/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", j6.b.f21518e, "(Lcn/d;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lgu/c;", "getType", "()Lgu/c;", Payload.TYPE, "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: cn.c$b, reason: from kotlin metadata */
    public static final class Companion implements a0<AlertContainerScreen<?>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f5042a;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // ym.a0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull AlertContainerScreen<?> initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f5042a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // ym.a0
        @NotNull
        public gu.c<? super AlertContainerScreen<?>> getType() {
            return this.f5042a.getType();
        }

        public Companion() {
            this.f5042a = new a(0, 1, null);
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: cn.c$c, reason: collision with other inner class name */
    public /* synthetic */ class C0111c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5043a;

        static {
            int[] iArr = new int[AlertScreen.a.values().length];
            iArr[AlertScreen.a.POSITIVE.ordinal()] = 1;
            iArr[AlertScreen.a.NEGATIVE.ordinal()] = 2;
            iArr[AlertScreen.a.NEUTRAL.ordinal()] = 3;
            f5043a = iArr;
        }
    }

    public /* synthetic */ c(Context context, AttributeSet attributeSet, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i10, (i13 & 8) != 0 ? 0 : i11, (i13 & 16) != 0 ? 0 : i12);
    }

    public static final void i(AlertScreen rendering, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(rendering, "$rendering");
        rendering.d().invoke(AlertScreen.b.C0112b.f5053a);
    }

    public static final void j(AlertScreen rendering, AlertScreen.a button, DialogInterface dialogInterface, int i10) {
        Intrinsics.checkNotNullParameter(rendering, "$rendering");
        Intrinsics.checkNotNullParameter(button, "$button");
        rendering.d().invoke(new AlertScreen.b.ButtonClicked(button));
    }

    @Override // com.squareup.workflow1.ui.modal.ModalContainer
    public void d(@NotNull ModalContainer.a<AlertScreen> dialogRef) {
        Unit unit;
        Button p8;
        Intrinsics.checkNotNullParameter(dialogRef, "dialogRef");
        androidx.appcompat.app.a aVar = (androidx.appcompat.app.a) dialogRef.getDialog();
        final AlertScreen f10 = dialogRef.f();
        int i10 = 0;
        if (f10.getCancelable()) {
            aVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: cn.a
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    c.i(AlertScreen.this, dialogInterface);
                }
            });
            aVar.setCancelable(true);
        } else {
            aVar.setCancelable(false);
        }
        AlertScreen.a[] values = AlertScreen.a.values();
        int length = values.length;
        while (i10 < length) {
            final AlertScreen.a aVar2 = values[i10];
            i10++;
            String str = f10.a().get(aVar2);
            if (str == null) {
                unit = null;
            } else {
                aVar.t(h(aVar2), str, new DialogInterface.OnClickListener() { // from class: cn.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        c.j(AlertScreen.this, aVar2, dialogInterface, i11);
                    }
                });
                unit = Unit.f22894a;
            }
            if (unit == null && (p8 = aVar.p(h(aVar2))) != null) {
                p8.setVisibility(4);
            }
        }
        aVar.u(f10.getMessage());
        aVar.setTitle(f10.getTitle());
    }

    @Override // com.squareup.workflow1.ui.modal.ModalContainer
    @NotNull
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public ModalContainer.a<AlertScreen> b(@NotNull AlertScreen initialModalRendering, @NotNull ViewEnvironment initialViewEnvironment) {
        Intrinsics.checkNotNullParameter(initialModalRendering, "initialModalRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        androidx.appcompat.app.a a10 = new a.C0009a(getContext(), this.dialogThemeResId).a();
        Intrinsics.checkNotNullExpressionValue(a10, "Builder(context, dialogThemeResId)\n      .create()");
        ModalContainer.a<AlertScreen> aVar = new ModalContainer.a<>(initialModalRendering, initialViewEnvironment, a10, null, 8, null);
        d(aVar);
        return aVar;
    }

    public final int h(AlertScreen.a aVar) {
        int i10 = C0111c.f5043a[aVar.ordinal()];
        if (i10 == 1) {
            return -1;
        }
        if (i10 == 2) {
            return -2;
        }
        if (i10 == 3) {
            return -3;
        }
        throw new l();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11, int i12) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dialogThemeResId = i12;
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J8\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u00020\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcn/c$a;", "Lym/a0;", "Lcn/d;", "", "dialogThemeResId", "<init>", "(I)V", "initialRendering", "Lym/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", j6.b.f21518e, "(Lcn/d;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", ve.a.f33391e, "I", "Lgu/c;", "getType", "()Lgu/c;", Payload.TYPE, "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a implements a0<AlertContainerScreen<?>> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int dialogThemeResId;
        public final /* synthetic */ ym.f<AlertContainerScreen<?>> b;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcn/d;", "initialRendering", "Lym/y;", "initialEnv", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "<anonymous parameter 3>", "Landroid/view/View;", ve.a.f33391e, "(Lcn/d;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: cn.c$a$a, reason: collision with other inner class name */
        public static final class C0109a extends m implements o<AlertContainerScreen<?>, ViewEnvironment, Context, ViewGroup, View> {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ int f5041i;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: cn.c$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0110a extends k implements Function2<f<?, ? extends AlertScreen>, ViewEnvironment, Unit> {
                public C0110a(Object obj) {
                    super(2, obj, c.class, "update", "update(Lcom/squareup/workflow1/ui/modal/HasModals;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
                }

                public final void d(@NotNull f<?, AlertScreen> p02, @NotNull ViewEnvironment p12) {
                    Intrinsics.checkNotNullParameter(p02, "p0");
                    Intrinsics.checkNotNullParameter(p12, "p1");
                    ((c) this.receiver).c(p02, p12);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(f<?, ? extends AlertScreen> fVar, ViewEnvironment viewEnvironment) {
                    d(fVar, viewEnvironment);
                    return Unit.f22894a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0109a(int i10) {
                super(4);
                this.f5041i = i10;
            }

            @Override // yt.o
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final View e(@NotNull AlertContainerScreen<?> initialRendering, @NotNull ViewEnvironment initialEnv, @NotNull Context context, @Nullable ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
                Intrinsics.checkNotNullParameter(initialEnv, "initialEnv");
                Intrinsics.checkNotNullParameter(context, "context");
                c cVar = new c(context, null, 0, 0, this.f5041i, 14, null);
                cVar.setId(bn.a.b);
                cVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                e0.a(cVar, initialRendering, initialEnv, new C0110a(cVar));
                return cVar;
            }
        }

        public a(int i10) {
            this.dialogThemeResId = i10;
            this.b = new ym.f<>(d0.b(AlertContainerScreen.class), new C0109a(i10));
        }

        @Override // ym.a0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull AlertContainerScreen<?> initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.b.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // ym.a0
        @NotNull
        public gu.c<? super AlertContainerScreen<?>> getType() {
            return this.b.getType();
        }

        public /* synthetic */ a(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 0 : i10);
        }
    }
}

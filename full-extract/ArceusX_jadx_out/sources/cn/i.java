package cn;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.squareup.workflow1.ui.modal.ModalContainer;
import e.p0;
import e.r0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ym.ViewEnvironment;
import ym.c0;
import ym.d0;
import ym.e0;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0014¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcn/i;", "Lcom/squareup/workflow1/ui/modal/ModalContainer;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/View;", "view", "Landroid/app/Dialog;", "g", "(Landroid/view/View;)Landroid/app/Dialog;", "initialModalRendering", "Lym/y;", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/modal/ModalContainer$a;", j6.b.f21518e, "(Ljava/lang/Object;Lym/y;)Lcom/squareup/workflow1/ui/modal/ModalContainer$a;", "dialogRef", "", rl.d.f30696a, "(Lcom/squareup/workflow1/ui/modal/ModalContainer$a;)V", "e", ve.a.f33391e, "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class i extends ModalContainer<Object> {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", j6.b.f21518e, "()V"}, k = 3, mv = {1, 6, 0})
    public static final class b extends m implements Function0<Unit> {

        /* renamed from: i, reason: collision with root package name */
        public static final b f5056i = new b();

        public b() {
            super(0);
        }

        public final void b() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            b();
            return Unit.f22894a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", j6.b.f21518e, "()V"}, k = 3, mv = {1, 6, 0})
    public static final class c extends m implements Function0<Unit> {

        /* renamed from: i, reason: collision with root package name */
        public static final c f5057i = new c();

        public c() {
            super(0);
        }

        public final void b() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            b();
            return Unit.f22894a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final boolean f(View view, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        p0 P;
        Intrinsics.checkNotNullParameter(view, "$view");
        if (i10 != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        r0 b10 = ym.e.b(context);
        if (b10 != null && (P = b10.P()) != null && P.getHasEnabledCallbacks()) {
            P.i();
        }
        return true;
    }

    @Override // com.squareup.workflow1.ui.modal.ModalContainer
    @NotNull
    public final ModalContainer.a<Object> b(@NotNull Object initialModalRendering, @NotNull ViewEnvironment initialViewEnvironment) {
        Intrinsics.checkNotNullParameter(initialModalRendering, "initialModalRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        ym.d dVar = new ym.d(initialModalRendering, false, b.f5056i, 2, null);
        c0 c0Var = (c0) initialViewEnvironment.a(c0.INSTANCE);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "this.context");
        final View d10 = d0.d(c0Var, dVar, initialViewEnvironment, context, this, null, 16, null);
        e0.h(d10);
        Dialog g10 = g(d10);
        g10.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: cn.h
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                boolean f10;
                f10 = i.f(d10, dialogInterface, i10, keyEvent);
                return f10;
            }
        });
        return new ModalContainer.a<>(initialModalRendering, initialViewEnvironment, g10, d10);
    }

    @Override // com.squareup.workflow1.ui.modal.ModalContainer
    public void d(@NotNull ModalContainer.a<Object> dialogRef) {
        Intrinsics.checkNotNullParameter(dialogRef, "dialogRef");
        ym.d dVar = new ym.d(dialogRef.f(), false, c.f5057i, 2, null);
        Object extra = dialogRef.getExtra();
        if (extra == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        e0.g((View) extra, dVar, dialogRef.getViewEnvironment());
    }

    @NotNull
    public Dialog g(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Dialog dialog = new Dialog(getContext());
        dialog.setCancelable(false);
        dialog.setContentView(view);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setLayout(-2, -2);
        Window window2 = dialog.getWindow();
        Intrinsics.checkNotNull(window2);
        window2.setBackgroundDrawable(null);
        return dialog;
    }
}

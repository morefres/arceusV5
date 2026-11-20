package fp;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.core.view.GravityCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lfp/n0;", "", "Lup/c;", "sandboxFlags", "<init>", "(Lup/c;)V", "Lfp/s0;", "rendering", "Lzo/c;", "binding", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "h", "(Lfp/s0;Lzo/c;Landroidx/fragment/app/FragmentManager;)V", "i", "(Lzo/c;)V", "Landroid/content/Context;", "context", "m", "(Landroid/content/Context;)V", "", "containerViewId", "Lfp/z0;", "g", "(Lfp/s0;Landroidx/fragment/app/FragmentManager;I)Lfp/z0;", ve.a.f33391e, "Lup/c;", "Landroid/app/Dialog;", j6.b.f21518e, "Landroid/app/Dialog;", "optionsDialog", "c", "Lfp/z0;", "currentStepRendering", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final up.c sandboxFlags;

    /* renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Dialog optionsDialog;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public z0 currentStepRendering;

    public n0(@NotNull up.c sandboxFlags) {
        Intrinsics.checkNotNullParameter(sandboxFlags, "sandboxFlags");
        this.sandboxFlags = sandboxFlags;
    }

    public static final void j(n0 n0Var, zo.c cVar, View view) {
        n0Var.sandboxFlags.g();
        Toast.makeText(cVar.b.getRootView().getContext(), "Setting the debug flag to: " + up.c.INSTANCE.a(n0Var.sandboxFlags.getDebugForcedStatus()), 0).show();
    }

    public static final boolean k(n0 n0Var, Context context, View view) {
        Intrinsics.checkNotNull(context);
        n0Var.m(context);
        return true;
    }

    public static final Unit l(zo.c cVar, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullExpressionValue(insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars()), "getInsetsIgnoringVisibility(...)");
        FloatingActionButton floatingActionButton = cVar.b;
        Intrinsics.checkNotNullExpressionValue(floatingActionButton, "floatingActionButton");
        ViewGroup.LayoutParams layoutParams = floatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = (int) (r6.bottom + hq.j.c(16.0d));
        floatingActionButton.setLayoutParams(marginLayoutParams);
        return Unit.f22894a;
    }

    public static final void n(Dialog dialog, View view) {
        dialog.dismiss();
    }

    public static final void o(n0 n0Var, CompoundButton compoundButton, boolean z10) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        n0Var.sandboxFlags.f(z10);
    }

    public static final void p(n0 n0Var, DialogInterface dialogInterface) {
        n0Var.optionsDialog = null;
    }

    public final z0 g(s0 rendering, FragmentManager fragmentManager, int containerViewId) {
        if (rendering instanceof e1) {
            e1 e1Var = (e1) rendering;
            String key = e1Var.getKey();
            boolean didGoBack = e1Var.getDidGoBack();
            androidx.fragment.app.c m02 = fragmentManager.m0(containerViewId);
            androidx.fragment.app.c a10 = ((m02 instanceof hp.b) && Intrinsics.c(m02.h0(), key)) ? m02 : hp.b.INSTANCE.a();
            if (didGoBack) {
                if (m02 != null) {
                    o5.p pVar = new o5.p(GravityCompat.END);
                    pVar.x0(null);
                    pVar.y0(30L);
                    pVar.v0(new DecelerateInterpolator());
                    m02.Q1(pVar);
                }
                o5.p pVar2 = new o5.p(GravityCompat.START);
                pVar2.x0(null);
                pVar2.v0(new DecelerateInterpolator());
                a10.P1(pVar2);
            } else {
                if (m02 != null) {
                    o5.p pVar3 = new o5.p(GravityCompat.START);
                    pVar3.x0(null);
                    pVar3.y0(30L);
                    pVar3.v0(new DecelerateInterpolator());
                    m02.Q1(pVar3);
                }
                o5.p pVar4 = new o5.p(GravityCompat.END);
                pVar4.x0(null);
                pVar4.v0(new DecelerateInterpolator());
                a10.P1(pVar4);
            }
            androidx.fragment.app.h r8 = fragmentManager.r();
            r8.o(containerViewId, a10, key);
            r8.j();
            hp.b bVar = (hp.b) a10;
            bVar.k2(e1Var);
            if (e1Var instanceof d) {
                return new e(((d) rendering).getKey(), bVar);
            }
            if (e1Var instanceof h) {
                return new i(((h) rendering).getKey(), bVar);
            }
            if (e1Var instanceof q0) {
                return new r0(((q0) rendering).getKey(), bVar);
            }
            if (e1Var instanceof x0) {
                return new y0(((x0) rendering).getKey(), bVar);
            }
            if (e1Var instanceof c1) {
                return new d1(((c1) rendering).getKey(), bVar);
            }
            throw new gt.l();
        }
        if (rendering instanceof u0) {
            dp.f a11 = dp.f.INSTANCE.a();
            androidx.fragment.app.h r10 = fragmentManager.r();
            r10.n(containerViewId, a11);
            r10.h();
            return new t0(((u0) rendering).getKey(), a11);
        }
        if (rendering instanceof a1) {
            a1 a1Var = (a1) rendering;
            String key2 = a1Var.getKey();
            boolean didGoBack2 = a1Var.getDidGoBack();
            androidx.fragment.app.c m03 = fragmentManager.m0(containerViewId);
            androidx.fragment.app.c a12 = ((m03 instanceof UiStepFragment) && Intrinsics.c(m03.h0(), key2)) ? m03 : UiStepFragment.INSTANCE.a(a1Var.getProps());
            if (didGoBack2) {
                if (m03 != null) {
                    o5.p pVar5 = new o5.p(GravityCompat.END);
                    pVar5.x0(null);
                    pVar5.y0(30L);
                    pVar5.v0(new DecelerateInterpolator());
                    m03.Q1(pVar5);
                }
                o5.p pVar6 = new o5.p(GravityCompat.START);
                pVar6.x0(null);
                pVar6.v0(new DecelerateInterpolator());
                a12.P1(pVar6);
            } else {
                if (m03 != null) {
                    o5.p pVar7 = new o5.p(GravityCompat.START);
                    pVar7.x0(null);
                    pVar7.y0(30L);
                    pVar7.v0(new DecelerateInterpolator());
                    m03.Q1(pVar7);
                }
                o5.p pVar8 = new o5.p(GravityCompat.END);
                pVar8.x0(null);
                pVar8.v0(new DecelerateInterpolator());
                a12.P1(pVar8);
            }
            androidx.fragment.app.h r11 = fragmentManager.r();
            r11.o(containerViewId, a12, key2);
            r11.j();
            return new b1(a1Var.getKey(), (UiStepFragment) a12);
        }
        if (rendering instanceof o0) {
            o0 o0Var = (o0) rendering;
            String key3 = o0Var.getKey();
            boolean didGoBack3 = o0Var.getDidGoBack();
            androidx.fragment.app.c m04 = fragmentManager.m0(containerViewId);
            androidx.fragment.app.c a13 = ((m04 instanceof IntegrationStepFragment) && Intrinsics.c(m04.h0(), key3)) ? m04 : IntegrationStepFragment.INSTANCE.a(o0Var.getProps());
            if (didGoBack3) {
                if (m04 != null) {
                    o5.p pVar9 = new o5.p(GravityCompat.END);
                    pVar9.x0(null);
                    pVar9.y0(30L);
                    pVar9.v0(new DecelerateInterpolator());
                    m04.Q1(pVar9);
                }
                o5.p pVar10 = new o5.p(GravityCompat.START);
                pVar10.x0(null);
                pVar10.v0(new DecelerateInterpolator());
                a13.P1(pVar10);
            } else {
                if (m04 != null) {
                    o5.p pVar11 = new o5.p(GravityCompat.START);
                    pVar11.x0(null);
                    pVar11.y0(30L);
                    pVar11.v0(new DecelerateInterpolator());
                    m04.Q1(pVar11);
                }
                o5.p pVar12 = new o5.p(GravityCompat.END);
                pVar12.x0(null);
                pVar12.v0(new DecelerateInterpolator());
                a13.P1(pVar12);
            }
            androidx.fragment.app.h r12 = fragmentManager.r();
            r12.o(containerViewId, a13, key3);
            r12.j();
            return new p0(o0Var.getKey(), (IntegrationStepFragment) a13);
        }
        if (rendering instanceof f) {
            f fVar = (f) rendering;
            String key4 = fVar.getKey();
            boolean didGoBack4 = fVar.getDidGoBack();
            androidx.fragment.app.c m05 = fragmentManager.m0(containerViewId);
            androidx.fragment.app.c a14 = ((m05 instanceof GovernmentIdStepFragment) && Intrinsics.c(m05.h0(), key4)) ? m05 : GovernmentIdStepFragment.INSTANCE.a(fVar.getProps());
            if (didGoBack4) {
                if (m05 != null) {
                    o5.p pVar13 = new o5.p(GravityCompat.END);
                    pVar13.x0(null);
                    pVar13.y0(30L);
                    pVar13.v0(new DecelerateInterpolator());
                    m05.Q1(pVar13);
                }
                o5.p pVar14 = new o5.p(GravityCompat.START);
                pVar14.x0(null);
                pVar14.v0(new DecelerateInterpolator());
                a14.P1(pVar14);
            } else {
                if (m05 != null) {
                    o5.p pVar15 = new o5.p(GravityCompat.START);
                    pVar15.x0(null);
                    pVar15.y0(30L);
                    pVar15.v0(new DecelerateInterpolator());
                    m05.Q1(pVar15);
                }
                o5.p pVar16 = new o5.p(GravityCompat.END);
                pVar16.x0(null);
                pVar16.v0(new DecelerateInterpolator());
                a14.P1(pVar16);
            }
            androidx.fragment.app.h r13 = fragmentManager.r();
            r13.o(containerViewId, a14, key4);
            r13.j();
            return new g(fVar.getKey(), (GovernmentIdStepFragment) a14);
        }
        if (rendering instanceof v0) {
            v0 v0Var = (v0) rendering;
            String key5 = v0Var.getKey();
            boolean didGoBack5 = v0Var.getDidGoBack();
            androidx.fragment.app.c m06 = fragmentManager.m0(containerViewId);
            androidx.fragment.app.c a15 = ((m06 instanceof SelfieStepFragment) && Intrinsics.c(m06.h0(), key5)) ? m06 : SelfieStepFragment.INSTANCE.a(v0Var.getProps());
            if (didGoBack5) {
                if (m06 != null) {
                    o5.p pVar17 = new o5.p(GravityCompat.END);
                    pVar17.x0(null);
                    pVar17.y0(30L);
                    pVar17.v0(new DecelerateInterpolator());
                    m06.Q1(pVar17);
                }
                o5.p pVar18 = new o5.p(GravityCompat.START);
                pVar18.x0(null);
                pVar18.v0(new DecelerateInterpolator());
                a15.P1(pVar18);
            } else {
                if (m06 != null) {
                    o5.p pVar19 = new o5.p(GravityCompat.START);
                    pVar19.x0(null);
                    pVar19.y0(30L);
                    pVar19.v0(new DecelerateInterpolator());
                    m06.Q1(pVar19);
                }
                o5.p pVar20 = new o5.p(GravityCompat.END);
                pVar20.x0(null);
                pVar20.v0(new DecelerateInterpolator());
                a15.P1(pVar20);
            }
            androidx.fragment.app.h r14 = fragmentManager.r();
            r14.o(containerViewId, a15, key5);
            r14.j();
            return new w0(v0Var.getKey(), (SelfieStepFragment) a15);
        }
        if (!(rendering instanceof b)) {
            if ((rendering instanceof a) || rendering == null) {
                return null;
            }
            throw new gt.l();
        }
        b bVar2 = (b) rendering;
        String key6 = bVar2.getKey();
        boolean didGoBack6 = bVar2.getDidGoBack();
        androidx.fragment.app.c m07 = fragmentManager.m0(containerViewId);
        androidx.fragment.app.c a16 = ((m07 instanceof DocumentStepFragment) && Intrinsics.c(m07.h0(), key6)) ? m07 : DocumentStepFragment.INSTANCE.a(bVar2.getProps());
        if (didGoBack6) {
            if (m07 != null) {
                o5.p pVar21 = new o5.p(GravityCompat.END);
                pVar21.x0(null);
                pVar21.y0(30L);
                pVar21.v0(new DecelerateInterpolator());
                m07.Q1(pVar21);
            }
            o5.p pVar22 = new o5.p(GravityCompat.START);
            pVar22.x0(null);
            pVar22.v0(new DecelerateInterpolator());
            a16.P1(pVar22);
        } else {
            if (m07 != null) {
                o5.p pVar23 = new o5.p(GravityCompat.START);
                pVar23.x0(null);
                pVar23.y0(30L);
                pVar23.v0(new DecelerateInterpolator());
                m07.Q1(pVar23);
            }
            o5.p pVar24 = new o5.p(GravityCompat.END);
            pVar24.x0(null);
            pVar24.v0(new DecelerateInterpolator());
            a16.P1(pVar24);
        }
        androidx.fragment.app.h r15 = fragmentManager.r();
        r15.o(containerViewId, a16, key6);
        r15.j();
        return new c(bVar2.getKey(), (DocumentStepFragment) a16);
    }

    public final void h(@Nullable s0 rendering, @NotNull zo.c binding, @NotNull FragmentManager fragmentManager) {
        z0 g10;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        if (rendering == null) {
            return;
        }
        if (this.sandboxFlags.getIsSandboxModeEnabled()) {
            i(binding);
        } else {
            binding.b.setVisibility(8);
        }
        z0 z0Var = this.currentStepRendering;
        if (Intrinsics.c(z0Var != null ? z0Var.getName() : null, rendering.getKey())) {
            g10 = this.currentStepRendering;
        } else {
            g10 = g(rendering, fragmentManager, binding.f38145c.getId());
            this.currentStepRendering = g10;
        }
        if (rendering instanceof c1) {
            Intrinsics.d(g10, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.UiStepWorkflowRendering");
            ((d1) g10).getFragment().m2((e1) rendering);
            return;
        }
        if (rendering instanceof a1) {
            Intrinsics.d(g10, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.UiStepRendering");
            a1 a1Var = (a1) rendering;
            ((b1) g10).getFragment().q2(a1Var.getProps(), a1Var.getHandler());
            return;
        }
        if (rendering instanceof u0) {
            Intrinsics.d(g10, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.LoadingRendering");
            ((t0) g10).getFragment().s2((u0) rendering);
            return;
        }
        if (rendering instanceof a) {
            return;
        }
        if (rendering instanceof d) {
            Intrinsics.d(g10, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.DocumentWorkflowRendering");
            ((e) g10).getFragment().m2((e1) rendering);
            return;
        }
        if (rendering instanceof b) {
            Intrinsics.d(g10, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.DocumentStepRendering");
            b bVar = (b) rendering;
            ((c) g10).getFragment().w2(bVar.getProps(), bVar.getHandler());
            return;
        }
        if (rendering instanceof h) {
            Intrinsics.d(g10, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.GovernmentIdWorkflowRendering");
            ((i) g10).getFragment().m2((e1) rendering);
            return;
        }
        if (rendering instanceof f) {
            Intrinsics.d(g10, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.GovernmentIdStepRendering");
            f fVar = (f) rendering;
            ((g) g10).getFragment().R2(fVar.getProps(), fVar.getHandler());
            return;
        }
        if (rendering instanceof o0) {
            Intrinsics.d(g10, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.IntegrationStepRendering");
            o0 o0Var = (o0) rendering;
            ((p0) g10).getFragment().r2(o0Var.getProps(), o0Var.getHandler());
        } else if (rendering instanceof q0) {
            Intrinsics.d(g10, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.IntegrationWorkflowRendering");
            ((r0) g10).getFragment().m2((e1) rendering);
        } else if (rendering instanceof x0) {
            Intrinsics.d(g10, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.SelfieWorkflowRendering");
            ((y0) g10).getFragment().m2((e1) rendering);
        } else {
            if (!(rendering instanceof v0)) {
                throw new gt.l();
            }
            Intrinsics.d(g10, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.SelfieStepRendering");
            v0 v0Var = (v0) rendering;
            ((w0) g10).getFragment().J2(v0Var.getProps(), v0Var.getHandler());
        }
    }

    public final void i(final zo.c binding) {
        final Context context = binding.getRoot().getContext();
        binding.b.setVisibility(0);
        binding.b.setOnClickListener(new View.OnClickListener() { // from class: fp.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n0.j(n0.this, binding, view);
            }
        });
        binding.b.setOnLongClickListener(new View.OnLongClickListener() { // from class: fp.i0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean k10;
                k10 = n0.k(n0.this, context, view);
                return k10;
            }
        });
        FloatingActionButton floatingActionButton = binding.b;
        Intrinsics.checkNotNullExpressionValue(floatingActionButton, "floatingActionButton");
        uq.g.g(floatingActionButton, new Function1() { // from class: fp.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit l10;
                l10 = n0.l(zo.c.this, (WindowInsetsCompat) obj);
                return l10;
            }
        });
    }

    public final void m(Context context) {
        if (this.optionsDialog != null) {
            return;
        }
        final Dialog dialog = new Dialog(context, ic.j.f20551d);
        vp.a c10 = vp.a.c(LayoutInflater.from(dialog.getContext()));
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
        dialog.setContentView(c10.getRoot());
        c10.f33509c.setTitle("Sandbox options");
        c10.f33509c.setNavigationIcon(hq.s.f19610u);
        c10.f33509c.setNavigationOnClickListener(new View.OnClickListener() { // from class: fp.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n0.n(dialog, view);
            }
        });
        c10.b.setChecked(this.sandboxFlags.b());
        c10.b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: fp.l0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                n0.o(n0.this, compoundButton, z10);
            }
        });
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(null);
        }
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: fp.m0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                n0.p(n0.this, dialogInterface);
            }
        });
        this.optionsDialog = dialog;
        dialog.show();
    }
}

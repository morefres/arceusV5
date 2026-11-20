package ym;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ym.g0;

@Metadata(d1 = {"\u00002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\u001aQ\u0010\n\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00028\u0000`\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\f\u001a\u00020\u0007*\u00020\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0013\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a=\u0010\u0015\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\" \u0010\u001a\u001a\u0004\u0018\u00010\u0004*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\r\u001a\u0004\b\u0017\u0010\u0018\"F\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u001b*\u00020\u00022\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u001b8@@@X\u0081\u000e¢\u0006\u0012\u0012\u0004\b!\u0010\r\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 *6\b\u0007\u0010#\u001a\u0004\b\u0000\u0010\u0001\"\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006$"}, d2 = {"", "RenderingT", "Landroid/view/View;", "initialRendering", "Lym/y;", "initialViewEnvironment", "Lkotlin/Function2;", "", "Lcom/squareup/workflow1/ui/ViewShowRendering;", "showRendering", ve.a.f33391e, "(Landroid/view/View;Ljava/lang/Object;Lym/y;Lkotlin/jvm/functions/Function2;)V", "h", "(Landroid/view/View;)V", "rendering", "", j6.b.f21518e, "(Landroid/view/View;Ljava/lang/Object;)Z", "viewEnvironment", "g", "(Landroid/view/View;Ljava/lang/Object;Lym/y;)V", rl.d.f30696a, "(Landroid/view/View;)Lkotlin/jvm/functions/Function2;", "c", "(Landroid/view/View;)Lym/y;", "getEnvironment$annotations", "environment", "Lkotlin/Function1;", "value", "e", "(Landroid/view/View;)Lkotlin/jvm/functions/Function1;", "f", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "getStarter$annotations", "starter", "ViewShowRendering", "wf1-core-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e0 {
    public static final <RenderingT> void a(@NotNull View view, @NotNull RenderingT initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Function2<? super RenderingT, ? super ViewEnvironment, Unit> showRendering) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(showRendering, "showRendering");
        h0.e(view, h0.d(view) instanceof g0.New ? new g0.New(initialRendering, initialViewEnvironment, showRendering, e(view)) : new g0.New(initialRendering, initialViewEnvironment, showRendering, null, 8, null));
    }

    public static final boolean b(@NotNull View view, @NotNull Object rendering) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        g0<?> d10 = h0.d(view);
        Object c10 = d10 == null ? null : d10.c();
        Object obj = c10 != null ? c10 : null;
        return obj != null && h.a(obj, rendering);
    }

    @Nullable
    public static final ViewEnvironment c(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        g0<?> d10 = h0.d(view);
        if (d10 == null) {
            return null;
        }
        return d10.getEnvironment();
    }

    @Nullable
    public static final <RenderingT> Function2<RenderingT, ViewEnvironment, Unit> d(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        g0<?> d10 = h0.d(view);
        if (d10 == null) {
            return null;
        }
        return (Function2<RenderingT, ViewEnvironment, Unit>) d10.b();
    }

    @NotNull
    public static final Function1<View, Unit> e(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return h0.b(view).g();
    }

    public static final void f(@NotNull View view, @NotNull Function1<? super View, Unit> value) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        h0.e(view, g0.New.e(h0.b(view), null, null, null, value, 7, null));
    }

    public static final <RenderingT> void g(@NotNull View view, @NotNull RenderingT rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        g0.Started<?> c10 = h0.c(view);
        if (h.a(c10.c(), rendering)) {
            h0.e(view, new g0.Started(rendering, viewEnvironment, c10.b()));
            c10.b().invoke(rendering, viewEnvironment);
            return;
        }
        throw new IllegalStateException(("Expected " + view + " to be able to show rendering " + rendering + ", but that did not match previous rendering " + c10.c() + ". Consider using WorkflowViewStub to display arbitrary types.").toString());
    }

    public static final void h(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        g0.New<?> b = h0.b(view);
        h0.e(view, new g0.Started(b.c(), b.getEnvironment(), b.b()));
        b.g().invoke(view);
    }
}

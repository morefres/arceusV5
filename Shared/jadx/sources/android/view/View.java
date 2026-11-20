package android.view;

import j6.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ve.a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Landroidx/lifecycle/s;", "lifecycleOwner", "", b.f21518e, "(Landroid/view/View;Landroidx/lifecycle/s;)V", a.f33391e, "(Landroid/view/View;)Landroidx/lifecycle/s;", "lifecycle-runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.lifecycle.d1, reason: from Kotlin metadata */
/* loaded from: classes.dex */
public final class View {
    @Nullable
    public static final s a(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(j4.a.f21511a);
            s sVar = tag instanceof s ? (s) tag : null;
            if (sVar != null) {
                return sVar;
            }
            Object a10 = c3.b.a(view);
            view = a10 instanceof android.view.View ? (android.view.View) a10 : null;
        }
        return null;
    }

    public static final void b(@NotNull android.view.View view, @Nullable s sVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(j4.a.f21511a, sVar);
    }
}

package x6;

import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroid/view/View;", "Lx6/w;", ve.a.f33391e, "(Landroid/view/View;)Lx6/w;", "requestManager", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x {
    @NotNull
    public static final w a(@NotNull View view) {
        w wVar;
        Object tag = view.getTag(l6.a.f23242a);
        w wVar2 = tag instanceof w ? (w) tag : null;
        if (wVar2 != null) {
            return wVar2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(l6.a.f23242a);
                wVar = tag2 instanceof w ? (w) tag2 : null;
                if (wVar == null) {
                    wVar = new w(view);
                    view.addOnAttachStateChangeListener(wVar);
                    view.setTag(l6.a.f23242a, wVar);
                }
            } finally {
            }
        }
        return wVar;
    }
}

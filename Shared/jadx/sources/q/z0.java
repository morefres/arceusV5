package q;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class z0 extends s0 {
    public final WeakReference<Context> b;

    public z0(@NonNull Context context, @NonNull Resources resources) {
        super(resources);
        this.b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) {
        Drawable a10 = a(i10);
        Context context = this.b.get();
        if (a10 != null && context != null) {
            r0.g().w(context, i10, a10);
        }
        return a10;
    }
}

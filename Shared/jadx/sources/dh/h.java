package dh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.Toolbar;
import rg.e2;

/* loaded from: classes2.dex */
public class h {
    public static void a(Toolbar toolbar, Context context, int i10, int i11) {
        View findViewById = toolbar.findViewById(i10);
        if (findViewById != null) {
            ActionMenuView.c cVar = (ActionMenuView.c) findViewById.getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).width = (int) e2.e(context, i11);
            findViewById.setLayoutParams(cVar);
        }
    }

    public static void b(Toolbar toolbar, int i10) {
        for (int i11 = 0; i11 < toolbar.getChildCount(); i11++) {
            View childAt = toolbar.getChildAt(i11);
            if (childAt != null && childAt.getClass() == AppCompatImageButton.class) {
                ((AppCompatImageButton) childAt).setImageResource(i10);
            }
        }
    }
}

package q;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class s extends PopupWindow {
    public static final boolean b = false;

    /* renamed from: a, reason: collision with root package name */
    public boolean f29424a;

    public s(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    public final void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        a1 v5 = a1.v(context, attributeSet, i.j.f19933a2, i10, i11);
        if (v5.s(i.j.f19942c2)) {
            b(v5.a(i.j.f19942c2, false));
        }
        setBackgroundDrawable(v5.g(i.j.f19937b2));
        v5.x();
    }

    public final void b(boolean z10) {
        if (b) {
            this.f29424a = z10;
        } else {
            d3.h.a(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (b && this.f29424a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (b && this.f29424a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (b && this.f29424a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}

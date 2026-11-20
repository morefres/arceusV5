package o5;

import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class p0 extends z {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f27685a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    public static int d(d0 d0Var, int i10) {
        int[] iArr;
        if (d0Var == null || (iArr = (int[]) d0Var.f27618a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i10];
    }

    @Override // o5.z
    public void a(@NonNull d0 d0Var) {
        View view = d0Var.b;
        Integer num = (Integer) d0Var.f27618a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        d0Var.f27618a.put("android:visibilityPropagation:visibility", num);
        int[] iArr = {r4, 0};
        view.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = round + (view.getWidth() / 2);
        int round2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = round2;
        iArr[1] = round2 + (view.getHeight() / 2);
        d0Var.f27618a.put("android:visibilityPropagation:center", iArr);
    }

    @Override // o5.z
    public String[] b() {
        return f27685a;
    }

    public int e(d0 d0Var) {
        Integer num;
        if (d0Var == null || (num = (Integer) d0Var.f27618a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int f(d0 d0Var) {
        return d(d0Var, 0);
    }

    public int g(d0 d0Var) {
        return d(d0Var, 1);
    }
}

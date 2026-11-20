package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import i.j;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public Context f27453a;

    public a(Context context) {
        this.f27453a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f27453a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f27453a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f27453a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 > 960 && i11 > 720) {
            return 5;
        }
        if (i10 > 720 && i11 > 960) {
            return 5;
        }
        if (i10 >= 500) {
            return 4;
        }
        if (i10 > 640 && i11 > 480) {
            return 4;
        }
        if (i10 <= 480 || i11 <= 640) {
            return i10 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f27453a.getResources().getDimensionPixelSize(i.d.b);
    }

    public int f() {
        TypedArray obtainStyledAttributes = this.f27453a.obtainStyledAttributes(null, j.f19930a, i.a.f19799c, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(j.f19974j, 0);
        Resources resources = this.f27453a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(i.d.f19831a));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f27453a.getResources().getBoolean(i.b.f19823a);
    }

    public boolean h() {
        return true;
    }
}

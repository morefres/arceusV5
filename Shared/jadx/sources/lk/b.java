package lk;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o0;
import ek.q;
import kk.d;
import rh.h;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f23478h;

    /* renamed from: a, reason: collision with root package name */
    public Rect f23479a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f23480c;

    /* renamed from: d, reason: collision with root package name */
    public int f23481d;

    /* renamed from: e, reason: collision with root package name */
    public int f23482e;

    /* renamed from: f, reason: collision with root package name */
    public int f23483f;

    /* renamed from: g, reason: collision with root package name */
    public int f23484g;

    public b(Rect rect, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f23479a = rect;
        this.b = i10;
        this.f23480c = i11;
        this.f23481d = i12;
        this.f23482e = i13;
        this.f23483f = i14;
        this.f23484g = i15;
    }

    public static b a(View view, WindowManager windowManager, View view2, Rect rect) {
        int i10;
        int i11;
        int i12;
        int i13;
        WindowInsetsCompat F;
        b("getInfo() ------ start ------");
        Rect rect2 = new Rect();
        view.getWindowVisibleDisplayFrame(rect2);
        b("getInfo() sr:" + rect2.toString());
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        b("getInfo() ss:" + point.toString());
        int height = view.getHeight();
        int width = view.getWidth();
        if (d.a()) {
            i10 = 0;
            i11 = 0;
        } else {
            Point point2 = new Point();
            windowManager.getDefaultDisplay().getRealSize(point2);
            i10 = point2.y;
            i11 = point2.x;
        }
        b("getInfo() sh1:" + height + " sh2:" + i10);
        if (height > i10) {
            i11 = width;
            i12 = height;
        } else {
            i12 = i10;
        }
        b("getInfo() sh:" + i12);
        int i14 = rect != null ? rect.bottom : i12 - rect2.bottom;
        b("getInfo() bm:" + i14);
        int i15 = i12 - point.y;
        if (h.a().N() && view.getContext().getApplicationInfo().targetSdkVersion >= 36 && rect != null && !d.a() && (F = o0.F(view)) != null) {
            i15 = F.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.navigationBars()).bottom;
        }
        b("getInfo() sbh:" + i15);
        if (rect != null) {
            i13 = rect.top;
        } else {
            int[] iArr = new int[2];
            if (view2 != null) {
                view2.getLocationInWindow(iArr);
            }
            i13 = iArr[1];
        }
        int i16 = i13;
        b("getInfo() top:" + i16);
        int i17 = rect2.bottom;
        if (d.b() && i16 < rect2.top) {
            b("getInfo() adjusting top margin");
            int i18 = rect2.top;
            i17 -= i18;
            i15 -= i18;
        }
        int i19 = i17;
        b("getInfo() kby:" + i19);
        int i20 = rect != null ? rect.right : i11 - point.x;
        b("getInfo() rsbw:" + i20);
        int min = d.a() ? 0 : Math.min(i14, i15);
        b("getInfo() rsbh:" + min);
        int max = Math.max(0, i14 - i15);
        b("getInfo() kbh:" + max);
        return new b(rect2, i12, min, i20, max, i19, i16);
    }

    public static void b(String str) {
        if (f23478h) {
            q.i("rbx.screen", str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return bVar.f23479a.equals(this.f23479a) && bVar.b == this.b && bVar.f23480c == this.f23480c && bVar.f23481d == this.f23481d && bVar.f23482e == this.f23482e && bVar.f23483f == this.f23483f && bVar.f23484g == this.f23484g;
    }
}

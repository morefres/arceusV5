package z;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;

/* loaded from: classes.dex */
public class q3 {

    /* renamed from: e, reason: collision with root package name */
    public static final Size f37378e = new Size(1920, 1080);

    /* renamed from: f, reason: collision with root package name */
    public static final Size f37379f = new Size(320, 240);

    /* renamed from: g, reason: collision with root package name */
    public static final Size f37380g = new Size(640, 480);

    /* renamed from: h, reason: collision with root package name */
    public static final Object f37381h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static volatile q3 f37382i;

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f37383a;
    public volatile Size b = null;

    /* renamed from: c, reason: collision with root package name */
    public final d0.k f37384c = new d0.k();

    /* renamed from: d, reason: collision with root package name */
    public final d0.d f37385d = new d0.d();

    public q3(Context context) {
        this.f37383a = (DisplayManager) context.getSystemService("display");
    }

    public static q3 c(Context context) {
        if (f37382i == null) {
            synchronized (f37381h) {
                try {
                    if (f37382i == null) {
                        f37382i = new q3(context);
                    }
                } finally {
                }
            }
        }
        return f37382i;
    }

    public final Size a() {
        Size b = b();
        int width = b.getWidth() * b.getHeight();
        Size size = f37378e;
        if (width > size.getWidth() * size.getHeight()) {
            b = size;
        }
        return this.f37384c.a(b);
    }

    public final Size b() {
        Point point = new Point();
        d(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (w0.d.d(size, f37379f) && (size = this.f37385d.a()) == null) {
            size = f37380g;
        }
        return size.getHeight() > size.getWidth() ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public Display d(boolean z10) {
        Display[] displays = this.f37383a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display e10 = e(displays, z10);
        if (e10 == null && z10) {
            e10 = e(displays, false);
        }
        if (e10 != null) {
            return e10;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    public final Display e(Display[] displayArr, boolean z10) {
        Display display = null;
        int i10 = -1;
        for (Display display2 : displayArr) {
            if (!z10 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i11 = point.x;
                int i12 = point.y;
                if (i11 * i12 > i10) {
                    display = display2;
                    i10 = i11 * i12;
                }
            }
        }
        return display;
    }

    public Size f() {
        if (this.b != null) {
            return this.b;
        }
        this.b = a();
        return this.b;
    }

    public void g() {
        this.b = a();
    }
}

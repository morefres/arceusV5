package w0;

import android.util.Size;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Size f33612a = new Size(0, 0);
    public static final Size b = new Size(320, 240);

    /* renamed from: c, reason: collision with root package name */
    public static final Size f33613c = new Size(640, 480);

    /* renamed from: d, reason: collision with root package name */
    public static final Size f33614d = new Size(720, 480);

    /* renamed from: e, reason: collision with root package name */
    public static final Size f33615e = new Size(1280, 720);

    /* renamed from: f, reason: collision with root package name */
    public static final Size f33616f = new Size(1920, 1080);

    /* renamed from: g, reason: collision with root package name */
    public static final Size f33617g = new Size(1920, 1440);

    /* renamed from: h, reason: collision with root package name */
    public static final Size f33618h = new Size(2560, 1440);

    /* renamed from: i, reason: collision with root package name */
    public static final Size f33619i = new Size(3840, 2160);

    public static <T> T a(Size size, TreeMap<Size, T> treeMap) {
        Map.Entry<Size, T> ceilingEntry = treeMap.ceilingEntry(size);
        if (ceilingEntry != null) {
            return ceilingEntry.getValue();
        }
        Map.Entry<Size, T> floorEntry = treeMap.floorEntry(size);
        if (floorEntry != null) {
            return floorEntry.getValue();
        }
        return null;
    }

    public static int b(int i10, int i11) {
        return i10 * i11;
    }

    public static int c(Size size) {
        return b(size.getWidth(), size.getHeight());
    }

    public static boolean d(Size size, Size size2) {
        return c(size) < c(size2);
    }
}

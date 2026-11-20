package f1;

import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f16612a;
    public static final x b;

    /* renamed from: c, reason: collision with root package name */
    public static final x f16613c;

    /* renamed from: d, reason: collision with root package name */
    public static final x f16614d;

    /* renamed from: e, reason: collision with root package name */
    public static final x f16615e;

    /* renamed from: f, reason: collision with root package name */
    public static final x f16616f;

    /* renamed from: g, reason: collision with root package name */
    public static final x f16617g;

    /* renamed from: h, reason: collision with root package name */
    public static final Set<x> f16618h;

    /* renamed from: i, reason: collision with root package name */
    public static final List<x> f16619i;

    public static abstract class b extends x {
        public b() {
            super();
        }

        public static b h(int i10, int i11, String str, List<Size> list) {
            return new j(i10, i11, str, list);
        }

        public abstract int c();

        public abstract String d();

        public int e(int i10) {
            if (i10 == 1) {
                return g();
            }
            if (i10 == 2) {
                return c();
            }
            throw new AssertionError("Unknown quality source: " + i10);
        }

        public abstract List<Size> f();

        public abstract int g();
    }

    static {
        b h10 = b.h(4, 2002, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        f16612a = h10;
        b h11 = b.h(5, 2003, "HD", Collections.singletonList(new Size(1280, 720)));
        b = h11;
        b h12 = b.h(6, 2004, "FHD", Collections.singletonList(new Size(1920, 1080)));
        f16613c = h12;
        b h13 = b.h(8, 2005, "UHD", Collections.singletonList(new Size(3840, 2160)));
        f16614d = h13;
        List list = Collections.EMPTY_LIST;
        b h14 = b.h(0, 2000, "LOWEST", list);
        f16615e = h14;
        b h15 = b.h(1, 2001, "HIGHEST", list);
        f16616f = h15;
        f16617g = b.h(-1, -1, "NONE", list);
        f16618h = new HashSet(Arrays.asList(h14, h15, h10, h11, h12, h13));
        f16619i = Arrays.asList(h13, h12, h11, h10);
    }

    public static boolean a(x xVar) {
        return f16618h.contains(xVar);
    }

    public static List<x> b() {
        return new ArrayList(f16619i);
    }

    public x() {
    }
}

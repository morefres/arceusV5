package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: i, reason: collision with root package name */
    public static r0 f29416i;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap<Context, w1.k<ColorStateList>> f29418a;
    public w1.j<String, b> b;

    /* renamed from: c, reason: collision with root package name */
    public w1.k<String> f29419c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap<Context, w1.g<WeakReference<Drawable.ConstantState>>> f29420d = new WeakHashMap<>(0);

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f29421e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29422f;

    /* renamed from: g, reason: collision with root package name */
    public c f29423g;

    /* renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f29415h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    public static final a f29417j = new a(6);

    public static class a extends w1.i<Integer, PorterDuffColorFilter> {
        public a(int i10) {
            super(i10);
        }

        public static int l(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter m(int i10, PorterDuff.Mode mode) {
            return d(Integer.valueOf(l(i10, mode)));
        }

        public PorterDuffColorFilter n(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return e(Integer.valueOf(l(i10, mode)), porterDuffColorFilter);
        }
    }

    public interface b {
        Drawable a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface c {
        Drawable a(@NonNull r0 r0Var, @NonNull Context context, int i10);

        ColorStateList b(@NonNull Context context, int i10);

        boolean c(@NonNull Context context, int i10, @NonNull Drawable drawable);

        PorterDuff.Mode d(int i10);

        boolean e(@NonNull Context context, int i10, @NonNull Drawable drawable);
    }

    public static long d(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    public static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized r0 g() {
        r0 r0Var;
        synchronized (r0.class) {
            try {
                if (f29416i == null) {
                    r0 r0Var2 = new r0();
                    f29416i = r0Var2;
                    o(r0Var2);
                }
                r0Var = f29416i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return r0Var;
    }

    public static synchronized PorterDuffColorFilter k(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter m10;
        synchronized (r0.class) {
            a aVar = f29417j;
            m10 = aVar.m(i10, mode);
            if (m10 == null) {
                m10 = new PorterDuffColorFilter(i10, mode);
                aVar.n(i10, mode, m10);
            }
        }
        return m10;
    }

    public static void o(@NonNull r0 r0Var) {
    }

    public static boolean p(@NonNull Drawable drawable) {
        return (drawable instanceof p5.f) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    public static void v(Drawable drawable, y0 y0Var, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = y0Var.f29478d;
        if (z10 || y0Var.f29477c) {
            drawable.setColorFilter(f(z10 ? y0Var.f29476a : null, y0Var.f29477c ? y0Var.b : f29415h, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public final synchronized boolean a(@NonNull Context context, long j10, @NonNull Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            w1.g<WeakReference<Drawable.ConstantState>> gVar = this.f29420d.get(context);
            if (gVar == null) {
                gVar = new w1.g<>();
                this.f29420d.put(context, gVar);
            }
            gVar.i(j10, new WeakReference<>(constantState));
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void b(@NonNull Context context, int i10, @NonNull ColorStateList colorStateList) {
        if (this.f29418a == null) {
            this.f29418a = new WeakHashMap<>();
        }
        w1.k<ColorStateList> kVar = this.f29418a.get(context);
        if (kVar == null) {
            kVar = new w1.k<>();
            this.f29418a.put(context, kVar);
        }
        kVar.a(i10, colorStateList);
    }

    public final void c(@NonNull Context context) {
        if (this.f29422f) {
            return;
        }
        this.f29422f = true;
        Drawable i10 = i(context, m.a.f23922a);
        if (i10 == null || !p(i10)) {
            this.f29422f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    public final Drawable e(@NonNull Context context, int i10) {
        if (this.f29421e == null) {
            this.f29421e = new TypedValue();
        }
        TypedValue typedValue = this.f29421e;
        context.getResources().getValue(i10, typedValue, true);
        long d10 = d(typedValue);
        Drawable h10 = h(context, d10);
        if (h10 != null) {
            return h10;
        }
        c cVar = this.f29423g;
        Drawable a10 = cVar == null ? null : cVar.a(this, context, i10);
        if (a10 != null) {
            a10.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, d10, a10);
        }
        return a10;
    }

    public final synchronized Drawable h(@NonNull Context context, long j10) {
        w1.g<WeakReference<Drawable.ConstantState>> gVar = this.f29420d.get(context);
        if (gVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> e10 = gVar.e(j10);
        if (e10 != null) {
            Drawable.ConstantState constantState = e10.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            gVar.j(j10);
        }
        return null;
    }

    public synchronized Drawable i(@NonNull Context context, int i10) {
        return j(context, i10, false);
    }

    public synchronized Drawable j(@NonNull Context context, int i10, boolean z10) {
        Drawable q10;
        try {
            c(context);
            q10 = q(context, i10);
            if (q10 == null) {
                q10 = e(context, i10);
            }
            if (q10 == null) {
                q10 = l2.b.f(context, i10);
            }
            if (q10 != null) {
                q10 = u(context, i10, z10, q10);
            }
            if (q10 != null) {
                k0.b(q10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return q10;
    }

    public synchronized ColorStateList l(@NonNull Context context, int i10) {
        ColorStateList m10;
        m10 = m(context, i10);
        if (m10 == null) {
            c cVar = this.f29423g;
            m10 = cVar == null ? null : cVar.b(context, i10);
            if (m10 != null) {
                b(context, i10, m10);
            }
        }
        return m10;
    }

    public final ColorStateList m(@NonNull Context context, int i10) {
        w1.k<ColorStateList> kVar;
        WeakHashMap<Context, w1.k<ColorStateList>> weakHashMap = this.f29418a;
        if (weakHashMap == null || (kVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return kVar.e(i10);
    }

    public PorterDuff.Mode n(int i10) {
        c cVar = this.f29423g;
        if (cVar == null) {
            return null;
        }
        return cVar.d(i10);
    }

    public final Drawable q(@NonNull Context context, int i10) {
        int next;
        w1.j<String, b> jVar = this.b;
        if (jVar == null || jVar.isEmpty()) {
            return null;
        }
        w1.k<String> kVar = this.f29419c;
        if (kVar != null) {
            String e10 = kVar.e(i10);
            if ("appcompat_skip_skip".equals(e10) || (e10 != null && this.b.get(e10) == null)) {
                return null;
            }
        } else {
            this.f29419c = new w1.k<>();
        }
        if (this.f29421e == null) {
            this.f29421e = new TypedValue();
        }
        TypedValue typedValue = this.f29421e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long d10 = d(typedValue);
        Drawable h10 = h(context, d10);
        if (h10 != null) {
            return h10;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f29419c.a(i10, name);
                b bVar = this.b.get(name);
                if (bVar != null) {
                    h10 = bVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (h10 != null) {
                    h10.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, d10, h10);
                }
            } catch (Exception e11) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e11);
            }
        }
        if (h10 == null) {
            this.f29419c.a(i10, "appcompat_skip_skip");
        }
        return h10;
    }

    public synchronized void r(@NonNull Context context) {
        w1.g<WeakReference<Drawable.ConstantState>> gVar = this.f29420d.get(context);
        if (gVar != null) {
            gVar.a();
        }
    }

    public synchronized Drawable s(@NonNull Context context, @NonNull f1 f1Var, int i10) {
        try {
            Drawable q10 = q(context, i10);
            if (q10 == null) {
                q10 = f1Var.a(i10);
            }
            if (q10 == null) {
                return null;
            }
            return u(context, i10, false, q10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void t(c cVar) {
        this.f29423g = cVar;
    }

    public final Drawable u(@NonNull Context context, int i10, boolean z10, @NonNull Drawable drawable) {
        ColorStateList l10 = l(context, i10);
        if (l10 != null) {
            Drawable r8 = q2.a.r(drawable.mutate());
            q2.a.o(r8, l10);
            PorterDuff.Mode n10 = n(i10);
            if (n10 != null) {
                q2.a.p(r8, n10);
            }
            return r8;
        }
        c cVar = this.f29423g;
        if ((cVar == null || !cVar.e(context, i10, drawable)) && !w(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    public boolean w(@NonNull Context context, int i10, @NonNull Drawable drawable) {
        c cVar = this.f29423g;
        return cVar != null && cVar.c(context, i10, drawable);
    }
}

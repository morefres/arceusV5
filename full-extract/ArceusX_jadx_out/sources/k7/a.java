package k7;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import l7.c;
import l7.i;
import s7.e;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public final AssetManager f22442d;

    /* renamed from: a, reason: collision with root package name */
    public final i<String> f22440a = new i<>();
    public final Map<i<String>, Typeface> b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, Typeface> f22441c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public String f22443e = ".ttf";

    public a(Drawable.Callback callback, f7.b bVar) {
        if (callback instanceof View) {
            this.f22442d = ((View) callback).getContext().getAssets();
        } else {
            e.c("LottieDrawable must be inside of a view for images to work.");
            this.f22442d = null;
        }
    }

    public final Typeface a(c cVar) {
        String a10 = cVar.a();
        Typeface typeface = this.f22441c.get(a10);
        if (typeface != null) {
            return typeface;
        }
        cVar.c();
        cVar.b();
        if (cVar.d() != null) {
            return cVar.d();
        }
        Typeface createFromAsset = Typeface.createFromAsset(this.f22442d, "fonts/" + a10 + this.f22443e);
        this.f22441c.put(a10, createFromAsset);
        return createFromAsset;
    }

    public Typeface b(c cVar) {
        this.f22440a.b(cVar.a(), cVar.c());
        Typeface typeface = this.b.get(this.f22440a);
        if (typeface != null) {
            return typeface;
        }
        Typeface e10 = e(a(cVar), cVar.c());
        this.b.put(this.f22440a, e10);
        return e10;
    }

    public void c(String str) {
        this.f22443e = str;
    }

    public void d(f7.b bVar) {
    }

    public final Typeface e(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i10 = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i10 ? typeface : Typeface.create(typeface, i10);
    }
}

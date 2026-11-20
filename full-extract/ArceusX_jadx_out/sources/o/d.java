package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f27455f;

    /* renamed from: a, reason: collision with root package name */
    public int f27456a;
    public Resources.Theme b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f27457c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f27458d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f27459e;

    public d() {
        super(null);
    }

    public static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f27455f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f27455f = configuration2;
        }
        return configuration.equals(f27455f);
    }

    public void a(Configuration configuration) {
        if (this.f27459e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f27458d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f27458d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final Resources b() {
        if (this.f27459e == null) {
            Configuration configuration = this.f27458d;
            if (configuration == null || e(configuration)) {
                this.f27459e = super.getResources();
            } else {
                this.f27459e = createConfigurationContext(this.f27458d).getResources();
            }
        }
        return this.f27459e;
    }

    public int c() {
        return this.f27456a;
    }

    public final void d() {
        boolean z10 = this.b == null;
        if (z10) {
            this.b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        f(this.b, this.f27456a, z10);
    }

    public void f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f27457c == null) {
            this.f27457c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f27457c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.f27456a == 0) {
            this.f27456a = i.i.f19929c;
        }
        d();
        return this.b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f27456a != i10) {
            this.f27456a = i10;
            d();
        }
    }

    public d(Context context, int i10) {
        super(context);
        this.f27456a = i10;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.b = theme;
    }
}

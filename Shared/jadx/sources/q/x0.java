package q;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class x0 extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f29467c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static ArrayList<WeakReference<x0>> f29468d;

    /* renamed from: a, reason: collision with root package name */
    public final Resources f29469a;
    public final Resources.Theme b;

    public x0(@NonNull Context context) {
        super(context);
        if (!f1.c()) {
            this.f29469a = new z0(this, context.getResources());
            this.b = null;
            return;
        }
        f1 f1Var = new f1(this, context.getResources());
        this.f29469a = f1Var;
        Resources.Theme newTheme = f1Var.newTheme();
        this.b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    public static boolean a(@NonNull Context context) {
        return ((context instanceof x0) || (context.getResources() instanceof z0) || (context.getResources() instanceof f1) || !f1.c()) ? false : true;
    }

    public static Context b(@NonNull Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f29467c) {
            try {
                ArrayList<WeakReference<x0>> arrayList = f29468d;
                if (arrayList == null) {
                    f29468d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<x0> weakReference = f29468d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f29468d.remove(size);
                        }
                    }
                    for (int size2 = f29468d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<x0> weakReference2 = f29468d.get(size2);
                        x0 x0Var = weakReference2 != null ? weakReference2.get() : null;
                        if (x0Var != null && x0Var.getBaseContext() == context) {
                            return x0Var;
                        }
                    }
                }
                x0 x0Var2 = new x0(context);
                f29468d.add(new WeakReference<>(x0Var2));
                return x0Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f29469a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f29469a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}

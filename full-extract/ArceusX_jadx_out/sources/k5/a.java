package k5;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.startup.InitializationProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f22351d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f22352e = new Object();

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Context f22354c;

    @NonNull
    public final Set<Class<? extends b<?>>> b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Map<Class<?>, Object> f22353a = new HashMap();

    public a(@NonNull Context context) {
        this.f22354c = context.getApplicationContext();
    }

    @NonNull
    public static a e(@NonNull Context context) {
        if (f22351d == null) {
            synchronized (f22352e) {
                try {
                    if (f22351d == null) {
                        f22351d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f22351d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(Bundle bundle) {
        String string = this.f22354c.getString(c.f22355a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (b.class.isAssignableFrom(cls)) {
                            this.b.add(cls);
                        }
                    }
                }
                Iterator<Class<? extends b<?>>> it = this.b.iterator();
                while (it.hasNext()) {
                    d(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new d(e10);
            }
        }
    }

    public void b(@NonNull Class<? extends InitializationProvider> cls) {
        try {
            try {
                n5.a.c("Startup");
                a(this.f22354c.getPackageManager().getProviderInfo(new ComponentName(this.f22354c, cls), 128).metaData);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new d(e10);
            }
        } finally {
            n5.a.f();
        }
    }

    @NonNull
    public <T> T c(@NonNull Class<? extends b<?>> cls) {
        T t8;
        synchronized (f22352e) {
            try {
                t8 = (T) this.f22353a.get(cls);
                if (t8 == null) {
                    t8 = (T) d(cls, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t8;
    }

    @NonNull
    public final <T> T d(@NonNull Class<? extends b<?>> cls, @NonNull Set<Class<?>> set) {
        T t8;
        if (n5.a.h()) {
            try {
                n5.a.c(cls.getSimpleName());
            } catch (Throwable th2) {
                n5.a.f();
                throw th2;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f22353a.containsKey(cls)) {
            t8 = (T) this.f22353a.get(cls);
        } else {
            set.add(cls);
            try {
                b<?> newInstance = cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends b<?>>> dependencies = newInstance.dependencies();
                if (!dependencies.isEmpty()) {
                    for (Class<? extends b<?>> cls2 : dependencies) {
                        if (!this.f22353a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                t8 = (T) newInstance.create(this.f22354c);
                set.remove(cls);
                this.f22353a.put(cls, t8);
            } catch (Throwable th3) {
                throw new d(th3);
            }
        }
        n5.a.f();
        return t8;
    }

    @NonNull
    public <T> T f(@NonNull Class<? extends b<T>> cls) {
        return (T) c(cls);
    }

    public boolean g(@NonNull Class<? extends b<?>> cls) {
        return this.b.contains(cls);
    }
}

package mf;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class f<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f24430a;
    public final c<T> b;

    public static class b implements c<Context> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<? extends Service> f24431a;

        public final Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f24431a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f24431a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // mf.f.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<String> a(Context context) {
            Bundle b = b(context);
            if (b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        public b(Class<? extends Service> cls) {
            this.f24431a = cls;
        }
    }

    public interface c<T> {
        List<String> a(T t8);
    }

    public f(T t8, c<T> cVar) {
        this.f24430a = t8;
        this.b = cVar;
    }

    public static f<Context> c(Context context, Class<? extends Service> cls) {
        return new f<>(context, new b(cls));
    }

    public static ComponentRegistrar d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new w(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e10) {
            throw new w(String.format("Could not instantiate %s.", str), e10);
        } catch (InstantiationException e11) {
            throw new w(String.format("Could not instantiate %s.", str), e11);
        } catch (NoSuchMethodException e12) {
            throw new w(String.format("Could not instantiate %s", str), e12);
        } catch (InvocationTargetException e13) {
            throw new w(String.format("Could not instantiate %s", str), e13);
        }
    }

    public List<yf.b<ComponentRegistrar>> b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.b.a(this.f24430a)) {
            arrayList.add(new yf.b() { // from class: mf.e
                @Override // yf.b
                public final Object get() {
                    ComponentRegistrar d10;
                    d10 = f.d(str);
                    return d10;
                }
            });
        }
        return arrayList;
    }
}

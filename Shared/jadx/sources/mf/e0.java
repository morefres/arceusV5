package mf;

import androidx.annotation.NonNull;
import java.lang.annotation.Annotation;

/* loaded from: classes2.dex */
public final class e0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<? extends Annotation> f24429a;
    public final Class<T> b;

    public @interface a {
    }

    public e0(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f24429a = cls;
        this.b = cls2;
    }

    @NonNull
    public static <T> e0<T> a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new e0<>(cls, cls2);
    }

    @NonNull
    public static <T> e0<T> b(Class<T> cls) {
        return new e0<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (this.b.equals(e0Var.b)) {
            return this.f24429a.equals(e0Var.f24429a);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.f24429a.hashCode();
    }

    public String toString() {
        if (this.f24429a == a.class) {
            return this.b.getName();
        }
        return "@" + this.f24429a.getName() + " " + this.b.getName();
    }
}

package iv;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Class<?> f21165a;
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f21166c;

    /* renamed from: d, reason: collision with root package name */
    public final List<?> f21167d;

    public o(Class<?> cls, Object obj, Method method, List<?> list) {
        this.f21165a = cls;
        this.b = obj;
        this.f21166c = method;
        this.f21167d = Collections.unmodifiableList(list);
    }

    public Method a() {
        return this.f21166c;
    }

    public Class<?> b() {
        return this.f21165a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f21165a.getName(), this.f21166c.getName(), this.f21167d);
    }
}

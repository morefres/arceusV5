package ev;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final Method f16327a;
    public final ThreadMode b;

    /* renamed from: c, reason: collision with root package name */
    public final Class<?> f16328c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16329d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16330e;

    /* renamed from: f, reason: collision with root package name */
    public String f16331f;

    public l(Method method, Class<?> cls, ThreadMode threadMode, int i10, boolean z10) {
        this.f16327a = method;
        this.b = threadMode;
        this.f16328c = cls;
        this.f16329d = i10;
        this.f16330e = z10;
    }

    public final synchronized void a() {
        if (this.f16331f == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.f16327a.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(this.f16327a.getName());
            sb2.append('(');
            sb2.append(this.f16328c.getName());
            this.f16331f = sb2.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        a();
        l lVar = (l) obj;
        lVar.a();
        return this.f16331f.equals(lVar.f16331f);
    }

    public int hashCode() {
        return this.f16327a.hashCode();
    }
}

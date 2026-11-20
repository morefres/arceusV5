package nb;

import java.util.List;

/* loaded from: classes.dex */
public final class y4 {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f26824g = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f26825a;
    public final k0 b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f26826c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f26827d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f26828e = null;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f26829f = null;

    public /* synthetic */ y4(String str, Object obj, Object obj2, k0 k0Var, byte[] bArr) {
        this.f26825a = str;
        this.f26826c = obj;
        this.b = k0Var;
    }

    public final String a() {
        return this.f26825a;
    }

    public final Object b(Object obj) {
        List<y4> list;
        synchronized (this.f26827d) {
        }
        if (obj != null) {
            return obj;
        }
        if (s4.f26643a == null) {
            return this.f26826c;
        }
        synchronized (f26824g) {
            try {
                if (f.a()) {
                    return this.f26829f == null ? this.f26826c : this.f26829f;
                }
                try {
                    list = z4.f26852a;
                    for (y4 y4Var : list) {
                        if (f.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object obj2 = null;
                        try {
                            k0 k0Var = y4Var.b;
                            if (k0Var != null) {
                                obj2 = k0Var.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f26824g) {
                            y4Var.f26829f = obj2;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                k0 k0Var2 = this.b;
                if (k0Var2 != null) {
                    try {
                        return k0Var2.zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f26826c;
            } finally {
            }
        }
    }
}

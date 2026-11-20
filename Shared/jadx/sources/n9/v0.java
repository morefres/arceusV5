package n9;

import android.util.Log;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f26003a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f26004c;

    public v0(c cVar, Object obj) {
        Objects.requireNonNull(cVar);
        this.f26004c = cVar;
        this.f26003a = obj;
        this.b = false;
    }

    public abstract void a(Object obj);

    public final void b() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f26003a;
                if (this.b) {
                    String obj2 = toString();
                    StringBuilder sb2 = new StringBuilder(obj2.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(obj2);
                    sb2.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb2.toString());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.b = true;
        }
        c();
    }

    public final void c() {
        d();
        c cVar = this.f26004c;
        synchronized (cVar.zzj()) {
            cVar.zzj().remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f26003a = null;
        }
    }
}

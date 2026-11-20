package p1;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p1.b0;

/* loaded from: classes.dex */
public final class b0 {
    public final OrientationEventListener b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f28260a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Map<b, c> f28261c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public boolean f28262d = false;

    public class a extends OrientationEventListener {

        /* renamed from: a, reason: collision with root package name */
        public int f28263a;

        public a(Context context) {
            super(context);
            this.f28263a = -1;
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            int b;
            ArrayList arrayList;
            if (i10 == -1 || this.f28263a == (b = b0.b(i10))) {
                return;
            }
            this.f28263a = b;
            synchronized (b0.this.f28260a) {
                arrayList = new ArrayList(b0.this.f28261c.values());
            }
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((c) obj).c(b);
            }
        }
    }

    public interface b {
        void a(int i10);
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final b f28264a;
        public final Executor b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f28265c = new AtomicBoolean(true);

        public c(b bVar, Executor executor) {
            this.f28264a = bVar;
            this.b = executor;
        }

        public static /* synthetic */ void a(c cVar, int i10) {
            if (cVar.f28265c.get()) {
                cVar.f28264a.a(i10);
            }
        }

        public void b() {
            this.f28265c.set(false);
        }

        public void c(final int i10) {
            this.b.execute(new Runnable() { // from class: p1.c0
                @Override // java.lang.Runnable
                public final void run() {
                    b0.c.a(b0.c.this, i10);
                }
            });
        }
    }

    public b0(Context context) {
        this.b = new a(context);
    }

    public static int b(int i10) {
        if (i10 >= 315 || i10 < 45) {
            return 0;
        }
        if (i10 >= 225) {
            return 1;
        }
        return i10 >= 135 ? 2 : 3;
    }

    public boolean a(Executor executor, b bVar) {
        synchronized (this.f28260a) {
            try {
                if (!this.b.canDetectOrientation() && !this.f28262d) {
                    return false;
                }
                this.f28261c.put(bVar, new c(bVar, executor));
                this.b.enable();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(b bVar) {
        synchronized (this.f28260a) {
            try {
                c cVar = this.f28261c.get(bVar);
                if (cVar != null) {
                    cVar.b();
                    this.f28261c.remove(bVar);
                }
                if (this.f28261c.isEmpty()) {
                    this.b.disable();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

package ti;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import ek.q;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f32253a;
    public final Handler b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<InterfaceC0582e> f32254c;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0582e f32255a;

        public a(InterfaceC0582e interfaceC0582e) {
            this.f32255a = interfaceC0582e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f32254c.contains(this.f32255a)) {
                return;
            }
            e.this.f32254c.add(this.f32255a);
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0582e f32256a;

        public b(InterfaceC0582e interfaceC0582e) {
            this.f32256a = interfaceC0582e;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (e.this.f32254c.remove(this.f32256a)) {
            }
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f32257a;
        public final /* synthetic */ Bundle b;

        public c(int i10, Bundle bundle) {
            this.f32257a = i10;
            this.b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = e.this.f32254c;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                InterfaceC0582e interfaceC0582e = (InterfaceC0582e) obj;
                q.h("NotificationManager", "observer= " + interfaceC0582e.getClass() + ". notificationId= " + this.f32257a + ".");
                interfaceC0582e.R(this.f32257a, this.b);
            }
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public static final e f32259a = new e();
    }

    /* renamed from: ti.e$e, reason: collision with other inner class name */
    public interface InterfaceC0582e {
        void R(int i10, Bundle bundle);
    }

    public static e c() {
        return d.f32259a;
    }

    public void b(InterfaceC0582e interfaceC0582e) {
        if (!this.f32253a) {
            throw new IllegalStateException("NotificationManager was not initialized");
        }
        this.b.post(new a(interfaceC0582e));
    }

    public void d(Context context) {
        q.h("NotificationManager", "init:");
        this.f32253a = true;
    }

    public final void e(int i10, Bundle bundle) {
        this.b.post(new c(i10, bundle));
    }

    public void f(int i10, Bundle bundle) {
        if (!this.f32253a) {
            throw new IllegalStateException("NotificationManager was not initialized");
        }
        e(i10, bundle);
    }

    public void g(InterfaceC0582e interfaceC0582e) {
        if (!this.f32253a) {
            throw new IllegalStateException("NotificationManager was not initialized");
        }
        this.b.post(new b(interfaceC0582e));
    }

    public e() {
        this.b = new Handler(Looper.getMainLooper());
        this.f32254c = new ArrayList<>();
    }
}

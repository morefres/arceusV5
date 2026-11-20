package p0;

import android.os.Build;
import android.util.CloseGuard;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f28196a;

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final CloseGuard f28197a = new CloseGuard();

        @Override // p0.d.b
        public void a(String str) {
            this.f28197a.open(str);
        }

        @Override // p0.d.b
        public void b() {
            this.f28197a.warnIfOpen();
        }

        @Override // p0.d.b
        public void close() {
            this.f28197a.close();
        }
    }

    public interface b {
        void a(String str);

        void b();

        void close();
    }

    public static final class c implements b {
        @Override // p0.d.b
        public void a(String str) {
            x2.g.h(str, "CloseMethodName must not be null.");
        }

        @Override // p0.d.b
        public void b() {
        }

        @Override // p0.d.b
        public void close() {
        }
    }

    public d(b bVar) {
        this.f28196a = bVar;
    }

    public static d b() {
        return Build.VERSION.SDK_INT >= 30 ? new d(new a()) : new d(new c());
    }

    public void a() {
        this.f28196a.close();
    }

    public void c(String str) {
        this.f28196a.a(str);
    }

    public void d() {
        this.f28196a.b();
    }
}

package ke;

import he.n;
import he.u;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class f implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final c f22610d;

    /* renamed from: a, reason: collision with root package name */
    public final c f22611a;
    public final Deque<Closeable> b = new ArrayDeque(4);

    /* renamed from: c, reason: collision with root package name */
    public Throwable f22612c;

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f22613a = new a();

        @Override // ke.f.c
        public void a(Closeable closeable, Throwable th2, Throwable th3) {
            Logger logger = e.f22609a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(closeable);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 42);
            sb2.append("Suppressing exception thrown when closing ");
            sb2.append(valueOf);
            logger.log(level, sb2.toString(), th3);
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final Method f22614a;

        public b(Method method) {
            this.f22614a = method;
        }

        public static b b() {
            try {
                return new b(Throwable.class.getMethod("addSuppressed", Throwable.class));
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // ke.f.c
        public void a(Closeable closeable, Throwable th2, Throwable th3) {
            if (th2 == th3) {
                return;
            }
            try {
                this.f22614a.invoke(th2, th3);
            } catch (Throwable unused) {
                a.f22613a.a(closeable, th2, th3);
            }
        }
    }

    public interface c {
        void a(Closeable closeable, Throwable th2, Throwable th3);
    }

    static {
        c b10 = b.b();
        if (b10 == null) {
            b10 = a.f22613a;
        }
        f22610d = b10;
    }

    public f(c cVar) {
        this.f22611a = (c) n.l(cVar);
    }

    public static f a() {
        return new f(f22610d);
    }

    public <C extends Closeable> C b(C c10) {
        if (c10 != null) {
            this.b.addFirst(c10);
        }
        return c10;
    }

    public RuntimeException c(Throwable th2) {
        n.l(th2);
        this.f22612c = th2;
        u.h(th2, IOException.class);
        throw new RuntimeException(th2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Throwable th2 = this.f22612c;
        while (!this.b.isEmpty()) {
            Closeable removeFirst = this.b.removeFirst();
            try {
                removeFirst.close();
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    this.f22611a.a(removeFirst, th2, th3);
                }
            }
        }
        if (this.f22612c != null || th2 == null) {
            return;
        }
        u.h(th2, IOException.class);
        throw new AssertionError(th2);
    }
}

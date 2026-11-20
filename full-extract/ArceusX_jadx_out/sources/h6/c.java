package h6;

import android.os.Handler;
import android.os.Looper;
import g6.y;
import java.util.concurrent.Executor;
import ju.l0;
import ju.v1;

/* loaded from: classes.dex */
public class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final y f19011a;
    public final l0 b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f19012c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public final Executor f19013d = new a();

    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            c.this.f19012c.post(runnable);
        }
    }

    public c(Executor executor) {
        y yVar = new y(executor);
        this.f19011a = yVar;
        this.b = v1.b(yVar);
    }

    @Override // h6.b
    public Executor a() {
        return this.f19013d;
    }

    @Override // h6.b
    public l0 b() {
        return this.b;
    }

    @Override // h6.b
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public y c() {
        return this.f19011a;
    }
}

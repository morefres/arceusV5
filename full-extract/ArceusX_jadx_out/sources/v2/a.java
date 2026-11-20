package v2;

import android.graphics.Typeface;
import java.util.concurrent.Executor;
import v2.f;
import v2.g;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final g.c f33171a;
    public final Executor b;

    /* renamed from: v2.a$a, reason: collision with other inner class name */
    public class RunnableC0609a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g.c f33172a;
        public final /* synthetic */ Typeface b;

        public RunnableC0609a(g.c cVar, Typeface typeface) {
            this.f33172a = cVar;
            this.b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f33172a.b(this.b);
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g.c f33174a;
        public final /* synthetic */ int b;

        public b(g.c cVar, int i10) {
            this.f33174a = cVar;
            this.b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f33174a.a(this.b);
        }
    }

    public a(g.c cVar, Executor executor) {
        this.f33171a = cVar;
        this.b = executor;
    }

    public final void a(int i10) {
        this.b.execute(new b(this.f33171a, i10));
    }

    public void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f33198a);
        } else {
            a(eVar.b);
        }
    }

    public final void c(Typeface typeface) {
        this.b.execute(new RunnableC0609a(this.f33171a, typeface));
    }
}

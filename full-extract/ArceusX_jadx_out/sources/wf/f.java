package wf;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import mf.e0;
import mf.r;
import mf.x;
import org.json.JSONArray;
import org.json.JSONObject;
import wf.j;

/* loaded from: classes2.dex */
public class f implements i, j {

    /* renamed from: a, reason: collision with root package name */
    public final yf.b<p> f34310a;
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final yf.b<hg.i> f34311c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<g> f34312d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f34313e;

    public f(final Context context, final String str, Set<g> set, yf.b<hg.i> bVar, Executor executor) {
        this(new x(new yf.b() { // from class: wf.e
            @Override // yf.b
            public final Object get() {
                return f.d(context, str);
            }
        }), set, executor, bVar, context);
    }

    public static /* synthetic */ String c(f fVar) {
        String byteArrayOutputStream;
        synchronized (fVar) {
            try {
                p pVar = fVar.f34310a.get();
                List<q> g10 = pVar.g();
                pVar.f();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < g10.size(); i10++) {
                    q qVar = g10.get(i10);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", qVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) qVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return byteArrayOutputStream;
    }

    public static /* synthetic */ p d(Context context, String str) {
        return new p(context, str);
    }

    public static /* synthetic */ f e(e0 e0Var, mf.d dVar) {
        return new f((Context) dVar.a(Context.class), ((ff.e) dVar.a(ff.e.class)).n(), (Set<g>) dVar.d(g.class), (yf.b<hg.i>) dVar.g(hg.i.class), (Executor) dVar.f(e0Var));
    }

    public static /* synthetic */ Void f(f fVar) {
        synchronized (fVar) {
            fVar.f34310a.get().o(System.currentTimeMillis(), fVar.f34311c.get().a());
        }
        return null;
    }

    @NonNull
    public static mf.c<f> g() {
        final e0 a10 = e0.a(kf.a.class, Executor.class);
        return mf.c.d(f.class, i.class, j.class).b(r.j(Context.class)).b(r.j(ff.e.class)).b(r.m(g.class)).b(r.l(hg.i.class)).b(r.k(a10)).f(new mf.g() { // from class: wf.d
            @Override // mf.g
            public final Object create(mf.d dVar) {
                return f.e(e0.this, dVar);
            }
        }).d();
    }

    @Override // wf.i
    public Task<String> a() {
        return !u2.p.a(this.b) ? sb.m.f("") : sb.m.c(this.f34313e, new Callable() { // from class: wf.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.c(f.this);
            }
        });
    }

    @Override // wf.j
    @NonNull
    public synchronized j.a b(@NonNull String str) {
        long currentTimeMillis = System.currentTimeMillis();
        p pVar = this.f34310a.get();
        if (!pVar.m(currentTimeMillis)) {
            return j.a.NONE;
        }
        pVar.k();
        return j.a.GLOBAL;
    }

    public Task<Void> h() {
        if (this.f34312d.size() > 0 && u2.p.a(this.b)) {
            return sb.m.c(this.f34313e, new Callable() { // from class: wf.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return f.f(f.this);
                }
            });
        }
        return sb.m.f(null);
    }

    public f(yf.b<p> bVar, Set<g> set, Executor executor, yf.b<hg.i> bVar2, Context context) {
        this.f34310a = bVar;
        this.f34312d = set;
        this.f34313e = executor;
        this.f34311c = bVar2;
        this.b = context;
    }
}

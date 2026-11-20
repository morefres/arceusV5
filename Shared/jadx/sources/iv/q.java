package iv;

import java.io.IOException;
import java.util.Objects;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import wu.r0;

/* loaded from: classes2.dex */
public final class q<T> implements d<T> {

    /* renamed from: a, reason: collision with root package name */
    public final w f21178a;
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f21179c;

    /* renamed from: d, reason: collision with root package name */
    public final Call.Factory f21180d;

    /* renamed from: e, reason: collision with root package name */
    public final h<ResponseBody, T> f21181e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f21182f;

    /* renamed from: g, reason: collision with root package name */
    public Call f21183g;

    /* renamed from: h, reason: collision with root package name */
    public Throwable f21184h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21185i;

    public class a implements Callback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f21186a;

        public a(f fVar) {
            this.f21186a = fVar;
        }

        public final void a(Throwable th2) {
            try {
                this.f21186a.a(q.this, th2);
            } catch (Throwable th3) {
                c0.t(th3);
                th3.printStackTrace();
            }
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            a(iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            try {
                try {
                    this.f21186a.b(q.this, q.this.e(response));
                } catch (Throwable th2) {
                    c0.t(th2);
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                c0.t(th3);
                a(th3);
            }
        }
    }

    public static final class b extends ResponseBody {

        /* renamed from: a, reason: collision with root package name */
        public final ResponseBody f21187a;
        public final wu.g b;

        /* renamed from: c, reason: collision with root package name */
        public IOException f21188c;

        public class a extends wu.p {
            public a(r0 r0Var) {
                super(r0Var);
            }

            @Override // wu.p, wu.r0
            public long read(wu.e eVar, long j10) {
                try {
                    return super.read(eVar, j10);
                } catch (IOException e10) {
                    b.this.f21188c = e10;
                    throw e10;
                }
            }
        }

        public b(ResponseBody responseBody) {
            this.f21187a = responseBody;
            this.b = wu.b0.c(new a(responseBody.getSource()));
        }

        public void a() {
            IOException iOException = this.f21188c;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f21187a.close();
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentLength */
        public long getContentLength() {
            return this.f21187a.getContentLength();
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentType */
        public MediaType getMediaType() {
            return this.f21187a.getMediaType();
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: source */
        public wu.g getSource() {
            return this.b;
        }
    }

    public static final class c extends ResponseBody {

        /* renamed from: a, reason: collision with root package name */
        public final MediaType f21190a;
        public final long b;

        public c(MediaType mediaType, long j10) {
            this.f21190a = mediaType;
            this.b = j10;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentLength */
        public long getContentLength() {
            return this.b;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentType */
        public MediaType getMediaType() {
            return this.f21190a;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: source */
        public wu.g getSource() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public q(w wVar, Object obj, Object[] objArr, Call.Factory factory, h<ResponseBody, T> hVar) {
        this.f21178a = wVar;
        this.b = obj;
        this.f21179c = objArr;
        this.f21180d = factory;
        this.f21181e = hVar;
    }

    @Override // iv.d
    public void F(f<T> fVar) {
        Call call;
        Throwable th2;
        Objects.requireNonNull(fVar, "callback == null");
        synchronized (this) {
            try {
                if (this.f21185i) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f21185i = true;
                call = this.f21183g;
                th2 = this.f21184h;
                if (call == null && th2 == null) {
                    try {
                        Call b10 = b();
                        this.f21183g = b10;
                        call = b10;
                    } catch (Throwable th3) {
                        th2 = th3;
                        c0.t(th2);
                        this.f21184h = th2;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (th2 != null) {
            fVar.a(this, th2);
            return;
        }
        if (this.f21182f) {
            call.cancel();
        }
        call.enqueue(new a(fVar));
    }

    @Override // iv.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public q<T> m74clone() {
        return new q<>(this.f21178a, this.b, this.f21179c, this.f21180d, this.f21181e);
    }

    public final Call b() {
        Call newCall = this.f21180d.newCall(this.f21178a.a(this.b, this.f21179c));
        if (newCall != null) {
            return newCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    public final Call c() {
        Call call = this.f21183g;
        if (call != null) {
            return call;
        }
        Throwable th2 = this.f21184h;
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw ((Error) th2);
        }
        try {
            Call b10 = b();
            this.f21183g = b10;
            return b10;
        } catch (IOException | Error | RuntimeException e10) {
            c0.t(e10);
            this.f21184h = e10;
            throw e10;
        }
    }

    @Override // iv.d
    public void cancel() {
        Call call;
        this.f21182f = true;
        synchronized (this) {
            call = this.f21183g;
        }
        if (call != null) {
            call.cancel();
        }
    }

    public x<T> e(Response response) {
        ResponseBody body = response.body();
        Response build = response.newBuilder().body(new c(body.getMediaType(), body.getContentLength())).build();
        int code = build.code();
        if (code < 200 || code >= 300) {
            try {
                return x.d(c0.a(body), build);
            } finally {
                body.close();
            }
        }
        if (code == 204 || code == 205) {
            body.close();
            return x.j(null, build);
        }
        b bVar = new b(body);
        try {
            return x.j(this.f21181e.a(bVar), build);
        } catch (RuntimeException e10) {
            bVar.a();
            throw e10;
        }
    }

    @Override // iv.d
    public x<T> execute() {
        Call c10;
        synchronized (this) {
            if (this.f21185i) {
                throw new IllegalStateException("Already executed.");
            }
            this.f21185i = true;
            c10 = c();
        }
        if (this.f21182f) {
            c10.cancel();
        }
        return e(c10.execute());
    }

    @Override // iv.d
    public boolean isCanceled() {
        boolean z10 = true;
        if (this.f21182f) {
            return true;
        }
        synchronized (this) {
            try {
                Call call = this.f21183g;
                if (call == null || !call.getCanceled()) {
                    z10 = false;
                }
            } finally {
            }
        }
        return z10;
    }

    @Override // iv.d
    public synchronized Request request() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return c().request();
    }
}

package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.core.graphics.r;
import androidx.emoji2.text.c;
import androidx.emoji2.text.e;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import u2.o;
import v2.g;

/* loaded from: classes.dex */
public class e extends c.AbstractC0033c {

    /* renamed from: k, reason: collision with root package name */
    public static final a f2263k = new a();

    public static class a {
        public Typeface a(@NonNull Context context, @NonNull g.b bVar) {
            return g.a(context, null, new g.b[]{bVar});
        }

        @NonNull
        public g.a b(@NonNull Context context, @NonNull v2.e eVar) {
            return g.b(context, null, eVar);
        }

        public void c(@NonNull Context context, @NonNull ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    public static class b implements c.h {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public final Context f2264a;

        @NonNull
        public final v2.e b;

        /* renamed from: c, reason: collision with root package name */
        @NonNull
        public final a f2265c;

        /* renamed from: d, reason: collision with root package name */
        @NonNull
        public final Object f2266d = new Object();

        /* renamed from: e, reason: collision with root package name */
        public Handler f2267e;

        /* renamed from: f, reason: collision with root package name */
        public Executor f2268f;

        /* renamed from: g, reason: collision with root package name */
        public ThreadPoolExecutor f2269g;

        /* renamed from: h, reason: collision with root package name */
        public c.i f2270h;

        /* renamed from: i, reason: collision with root package name */
        public ContentObserver f2271i;

        /* renamed from: j, reason: collision with root package name */
        public Runnable f2272j;

        public b(@NonNull Context context, @NonNull v2.e eVar, @NonNull a aVar) {
            x2.g.h(context, "Context cannot be null");
            x2.g.h(eVar, "FontRequest cannot be null");
            this.f2264a = context.getApplicationContext();
            this.b = eVar;
            this.f2265c = aVar;
        }

        @Override // androidx.emoji2.text.c.h
        public void a(@NonNull c.i iVar) {
            x2.g.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f2266d) {
                this.f2270h = iVar;
            }
            d();
        }

        public final void b() {
            synchronized (this.f2266d) {
                try {
                    this.f2270h = null;
                    ContentObserver contentObserver = this.f2271i;
                    if (contentObserver != null) {
                        this.f2265c.c(this.f2264a, contentObserver);
                        this.f2271i = null;
                    }
                    Handler handler = this.f2267e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f2272j);
                    }
                    this.f2267e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f2269g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f2268f = null;
                    this.f2269g = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void c() {
            synchronized (this.f2266d) {
                try {
                    if (this.f2270h == null) {
                        return;
                    }
                    try {
                        g.b e10 = e();
                        int b = e10.b();
                        if (b == 2) {
                            synchronized (this.f2266d) {
                            }
                        }
                        if (b != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + b + ")");
                        }
                        try {
                            o.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface a10 = this.f2265c.a(this.f2264a, e10);
                            ByteBuffer e11 = r.e(this.f2264a, null, e10.e());
                            if (e11 == null || a10 == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            f b10 = f.b(a10, e11);
                            o.b();
                            synchronized (this.f2266d) {
                                try {
                                    c.i iVar = this.f2270h;
                                    if (iVar != null) {
                                        iVar.b(b10);
                                    }
                                } finally {
                                }
                            }
                            b();
                        } catch (Throwable th2) {
                            o.b();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        synchronized (this.f2266d) {
                            try {
                                c.i iVar2 = this.f2270h;
                                if (iVar2 != null) {
                                    iVar2.a(th3);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public void d() {
            synchronized (this.f2266d) {
                try {
                    if (this.f2270h == null) {
                        return;
                    }
                    if (this.f2268f == null) {
                        ThreadPoolExecutor b = z3.b.b("emojiCompat");
                        this.f2269g = b;
                        this.f2268f = b;
                    }
                    this.f2268f.execute(new Runnable() { // from class: z3.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.b.this.c();
                        }
                    });
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final g.b e() {
            try {
                g.a b = this.f2265c.b(this.f2264a, this.b);
                if (b.e() == 0) {
                    g.b[] c10 = b.c();
                    if (c10 == null || c10.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return c10[0];
                }
                throw new RuntimeException("fetchFonts failed (" + b.e() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        public void f(@NonNull Executor executor) {
            synchronized (this.f2266d) {
                this.f2268f = executor;
            }
        }
    }

    public e(@NonNull Context context, @NonNull v2.e eVar) {
        super(new b(context, eVar, f2263k));
    }

    @NonNull
    public e c(@NonNull Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}

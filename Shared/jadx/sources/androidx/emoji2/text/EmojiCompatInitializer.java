package androidx.emoji2.text;

import android.content.Context;
import android.view.ProcessLifecycleInitializer;
import android.view.l;
import android.view.s;
import androidx.annotation.NonNull;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.c;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import u2.o;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements k5.b<Boolean> {

    public class a implements android.view.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f2214a;

        public a(l lVar) {
            this.f2214a = lVar;
        }

        @Override // android.view.f
        public void onResume(@NonNull s sVar) {
            EmojiCompatInitializer.this.c();
            this.f2214a.d(this);
        }
    }

    public static class b extends c.AbstractC0033c {
        public b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    public static class c implements c.h {

        /* renamed from: a, reason: collision with root package name */
        public final Context f2215a;

        public class a extends c.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c.i f2216a;
            public final /* synthetic */ ThreadPoolExecutor b;

            public a(c.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f2216a = iVar;
                this.b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.c.i
            public void a(Throwable th2) {
                try {
                    this.f2216a.a(th2);
                } finally {
                    this.b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.c.i
            public void b(@NonNull f fVar) {
                try {
                    this.f2216a.b(fVar);
                } finally {
                    this.b.shutdown();
                }
            }
        }

        public c(Context context) {
            this.f2215a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.c.h
        public void a(@NonNull final c.i iVar) {
            final ThreadPoolExecutor b = z3.b.b("EmojiCompatInitializer");
            b.execute(new Runnable() { // from class: z3.c
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.c.this.c(iVar, b);
                }
            });
        }

        public void c(@NonNull c.i iVar, @NonNull ThreadPoolExecutor threadPoolExecutor) {
            try {
                e a10 = androidx.emoji2.text.a.a(this.f2215a);
                if (a10 == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                a10.c(threadPoolExecutor);
                a10.a().a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th2) {
                iVar.a(th2);
                threadPoolExecutor.shutdown();
            }
        }
    }

    public static class d implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                o.a("EmojiCompat.EmojiCompatInitializer.run");
                if (androidx.emoji2.text.c.i()) {
                    androidx.emoji2.text.c.c().l();
                }
            } finally {
                o.b();
            }
        }
    }

    @Override // k5.b
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean create(@NonNull Context context) {
        androidx.emoji2.text.c.h(new b(context));
        b(context);
        return Boolean.TRUE;
    }

    public void b(@NonNull Context context) {
        l a10 = ((s) k5.a.e(context).f(ProcessLifecycleInitializer.class)).a();
        a10.a(new a(a10));
    }

    public void c() {
        z3.b.c().postDelayed(new d(), 500L);
    }

    @Override // k5.b
    @NonNull
    public List<Class<? extends k5.b<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}

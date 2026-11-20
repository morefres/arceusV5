package v2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import androidx.core.graphics.k;
import backtraceio.library.services.BacktraceMetrics;
import g0.o0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import v2.g;
import w1.i;
import w1.j;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final i<String, Typeface> f33187a = new i<>(16);
    public static final ExecutorService b = h.a("fonts-androidx", 10, BacktraceMetrics.defaultTimeBetweenRetriesMs);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f33188c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final j<String, ArrayList<x2.a<e>>> f33189d = new j<>();

    public class a implements Callable<e> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f33190a;
        public final /* synthetic */ Context b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ v2.e f33191c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f33192d;

        public a(String str, Context context, v2.e eVar, int i10) {
            this.f33190a = str;
            this.b = context;
            this.f33191c = eVar;
            this.f33192d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            List a10;
            String str = this.f33190a;
            Context context = this.b;
            a10 = o0.a(new Object[]{this.f33191c});
            return f.c(str, context, a10, this.f33192d);
        }
    }

    public class b implements x2.a<e> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v2.a f33193a;

        public b(v2.a aVar) {
            this.f33193a = aVar;
        }

        @Override // x2.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f33193a.b(eVar);
        }
    }

    public class c implements Callable<e> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f33194a;
        public final /* synthetic */ Context b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f33195c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f33196d;

        public c(String str, Context context, List list, int i10) {
            this.f33194a = str;
            this.b = context;
            this.f33195c = list;
            this.f33196d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return f.c(this.f33194a, this.b, this.f33195c, this.f33196d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    public class d implements x2.a<e> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f33197a;

        public d(String str) {
            this.f33197a = str;
        }

        @Override // x2.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (f.f33188c) {
                try {
                    j<String, ArrayList<x2.a<e>>> jVar = f.f33189d;
                    ArrayList<x2.a<e>> arrayList = jVar.get(this.f33197a);
                    if (arrayList == null) {
                        return;
                    }
                    jVar.remove(this.f33197a);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        arrayList.get(i10).accept(eVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static String a(List<v2.e> list, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(list.get(i11).d());
            sb2.append("-");
            sb2.append(i10);
            if (i11 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    @SuppressLint({"WrongConstant"})
    public static int b(g.a aVar) {
        int i10 = 1;
        if (aVar.e() != 0) {
            return aVar.e() != 1 ? -3 : -2;
        }
        g.b[] c10 = aVar.c();
        if (c10 != null && c10.length != 0) {
            i10 = 0;
            for (g.b bVar : c10) {
                int b10 = bVar.b();
                if (b10 != 0) {
                    if (b10 < 0) {
                        return -3;
                    }
                    return b10;
                }
            }
        }
        return i10;
    }

    public static e c(String str, Context context, List<v2.e> list, int i10) {
        n5.a.c("getFontSync");
        try {
            i<String, Typeface> iVar = f33187a;
            Typeface d10 = iVar.d(str);
            if (d10 != null) {
                return new e(d10);
            }
            g.a e10 = v2.d.e(context, list, null);
            int b10 = b(e10);
            if (b10 != 0) {
                return new e(b10);
            }
            Typeface b11 = (!e10.f() || Build.VERSION.SDK_INT < 29) ? k.b(context, null, e10.c(), i10) : k.c(context, null, e10.d(), i10);
            if (b11 == null) {
                return new e(-3);
            }
            iVar.e(str, b11);
            return new e(b11);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        } finally {
            n5.a.f();
        }
    }

    public static Typeface d(Context context, List<v2.e> list, int i10, Executor executor, v2.a aVar) {
        String a10 = a(list, i10);
        Typeface d10 = f33187a.d(a10);
        if (d10 != null) {
            aVar.b(new e(d10));
            return d10;
        }
        b bVar = new b(aVar);
        synchronized (f33188c) {
            try {
                j<String, ArrayList<x2.a<e>>> jVar = f33189d;
                ArrayList<x2.a<e>> arrayList = jVar.get(a10);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList<x2.a<e>> arrayList2 = new ArrayList<>();
                arrayList2.add(bVar);
                jVar.put(a10, arrayList2);
                c cVar = new c(a10, context, list, i10);
                if (executor == null) {
                    executor = b;
                }
                h.c(executor, cVar, new d(a10));
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Typeface e(Context context, v2.e eVar, v2.a aVar, int i10, int i11) {
        List a10;
        List a11;
        a10 = o0.a(new Object[]{eVar});
        String a12 = a(a10, i10);
        Typeface d10 = f33187a.d(a12);
        if (d10 != null) {
            aVar.b(new e(d10));
            return d10;
        }
        if (i11 == -1) {
            a11 = o0.a(new Object[]{eVar});
            e c10 = c(a12, context, a11, i10);
            aVar.b(c10);
            return c10.f33198a;
        }
        try {
            e eVar2 = (e) h.d(b, new a(a12, context, eVar, i10), i11);
            aVar.b(eVar2);
            return eVar2.f33198a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final Typeface f33198a;
        public final int b;

        public e(int i10) {
            this.f33198a = null;
            this.b = i10;
        }

        @SuppressLint({"WrongConstant"})
        public boolean a() {
            return this.b == 0;
        }

        @SuppressLint({"WrongConstant"})
        public e(Typeface typeface) {
            this.f33198a = typeface;
            this.b = 0;
        }
    }
}

package de;

import ae.j0;
import ae.n0;
import ae.r0;
import ae.v0;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import be.o0;
import be.p1;
import be.s0;
import be.u0;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class a implements ae.b {

    /* renamed from: p, reason: collision with root package name */
    public static final long f14558p = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f14559q = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f14560a;
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f14561c;

    /* renamed from: d, reason: collision with root package name */
    public final u0 f14562d;

    /* renamed from: e, reason: collision with root package name */
    public final o0 f14563e;

    /* renamed from: f, reason: collision with root package name */
    public final p1 f14564f;

    /* renamed from: g, reason: collision with root package name */
    public final p1 f14565g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f14566h;

    /* renamed from: i, reason: collision with root package name */
    public final j0 f14567i;

    /* renamed from: j, reason: collision with root package name */
    public final File f14568j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f14569k;

    /* renamed from: l, reason: collision with root package name */
    public final Set f14570l;

    /* renamed from: m, reason: collision with root package name */
    public final Set f14571m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f14572n;

    /* renamed from: o, reason: collision with root package name */
    public final k f14573o;

    public a(Context context, File file, v0 v0Var, u0 u0Var) {
        Executor a10 = zd.e.a();
        o0 o0Var = new o0(context);
        k kVar = new Object() { // from class: de.k
        };
        this.f14560a = new Handler(Looper.getMainLooper());
        this.f14569k = new AtomicReference();
        this.f14570l = Collections.synchronizedSet(new HashSet());
        this.f14571m = Collections.synchronizedSet(new HashSet());
        this.f14572n = new AtomicBoolean(false);
        this.b = context;
        this.f14568j = file;
        this.f14561c = v0Var;
        this.f14562d = u0Var;
        this.f14566h = a10;
        this.f14563e = o0Var;
        this.f14573o = kVar;
        this.f14565g = new p1();
        this.f14564f = new p1();
        this.f14567i = r0.INSTANCE;
    }

    public static String s(String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0129, code lost:
    
        if (r2.contains(r15) == false) goto L41;
     */
    @Override // ae.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.tasks.Task<java.lang.Integer> a(ae.d r23) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: de.a.a(ae.d):com.google.android.gms.tasks.Task");
    }

    @Override // ae.b
    public final void b(ae.f fVar) {
        this.f14565g.b(fVar);
    }

    @Override // ae.b
    public final void c(ae.f fVar) {
        this.f14565g.a(fVar);
    }

    @Override // ae.b
    public final Task<Void> d(List<String> list) {
        return sb.m.e(new ae.a(-5));
    }

    @Override // ae.b
    public final Set<String> e() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f14561c.c());
        hashSet.addAll(this.f14570l);
        return hashSet;
    }

    @Override // ae.b
    public final Task<Void> f(List<String> list) {
        return sb.m.e(new ae.a(-5));
    }

    public final File g() {
        return this.f14568j;
    }

    public final /* synthetic */ void j(final long j10, final List list, final List list2, final List list3) {
        long j11 = 0;
        for (int i10 = 0; i10 < 3; i10++) {
            j11 = Math.min(j10, j11 + (j10 / 3));
            w(2, 0, Long.valueOf(j11), Long.valueOf(j10), null, null, null);
            SystemClock.sleep(f14558p);
            ae.e q10 = q();
            if (q10.i() == 9 || q10.i() == 7 || q10.i() == 6) {
                return;
            }
        }
        this.f14566h.execute(new Runnable() { // from class: de.g
            @Override // java.lang.Runnable
            public final void run() {
                a.this.l(list, list2, list3, j10);
            }
        });
    }

    public final /* synthetic */ void k(ae.e eVar) {
        this.f14564f.c(eVar);
        this.f14565g.c(eVar);
    }

    public final /* synthetic */ void l(List list, List list2, List list3, long j10) {
        if (this.f14572n.get()) {
            w(6, -6, null, null, null, null, null);
        } else if (this.f14567i.zza() != null) {
            t(list, list2, list3, j10, false);
        } else {
            v(list2, list3, j10);
        }
    }

    public final /* synthetic */ void m(List list, final List list2) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String a10 = s0.a(file);
            Uri fromFile = Uri.fromFile(file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(fromFile, this.b.getContentResolver().getType(fromFile));
            intent.addFlags(1);
            intent.putExtra("module_name", s(a10));
            intent.putExtra("split_id", a10);
            arrayList.add(intent);
            arrayList2.add(s(s0.a(file)));
        }
        ae.e q10 = q();
        if (q10 == null) {
            return;
        }
        final long j10 = q10.j();
        this.f14566h.execute(new Runnable() { // from class: de.j
            @Override // java.lang.Runnable
            public final void run() {
                a.this.j(j10, arrayList, arrayList2, list2);
            }
        });
    }

    public final Task o(final int i10) {
        r(new r() { // from class: de.p
            @Override // de.r
            public final ae.e a(ae.e eVar) {
                int i11 = i10;
                int i12 = a.f14559q;
                if (eVar == null) {
                    return null;
                }
                return ae.e.b(eVar.h(), 6, i11, eVar.a(), eVar.j(), eVar.f(), eVar.e());
            }
        });
        return sb.m.e(new ae.a(i10));
    }

    public final n0 p() {
        try {
            n0 a10 = this.f14561c.a(this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 128).applicationInfo.metaData);
            if (a10 != null) {
                return a10;
            }
            throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalStateException("App is not found in PackageManager", e10);
        }
    }

    public final ae.e q() {
        return (ae.e) this.f14569k.get();
    }

    public final synchronized ae.e r(r rVar) {
        ae.e q10 = q();
        ae.e a10 = rVar.a(q10);
        AtomicReference atomicReference = this.f14569k;
        while (!p1.t.a(atomicReference, q10, a10)) {
            if (atomicReference.get() != q10) {
                return null;
            }
        }
        return a10;
    }

    public final void t(List list, List list2, List list3, long j10, boolean z10) {
        this.f14567i.zza().a(list, new q(this, list2, list3, j10, z10, list));
    }

    public final void u(final ae.e eVar) {
        this.f14560a.post(new Runnable() { // from class: de.h
            @Override // java.lang.Runnable
            public final void run() {
                a.this.k(eVar);
            }
        });
    }

    public final void v(List list, List list2, long j10) {
        this.f14570l.addAll(list);
        this.f14571m.addAll(list2);
        Long valueOf = Long.valueOf(j10);
        w(5, 0, valueOf, valueOf, null, null, null);
    }

    public final boolean w(final int i10, final int i11, final Long l10, final Long l11, final List list, final Integer num, final List list2) {
        ae.e r8 = r(new r() { // from class: de.i
            @Override // de.r
            public final ae.e a(ae.e eVar) {
                Integer num2 = num;
                int i12 = i10;
                int i13 = i11;
                Long l12 = l10;
                Long l13 = l11;
                List<String> list3 = list;
                List<String> list4 = list2;
                int i14 = a.f14559q;
                ae.e b = eVar == null ? ae.e.b(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList()) : eVar;
                int h10 = num2 == null ? b.h() : num2.intValue();
                long a10 = l12 == null ? b.a() : l12.longValue();
                long j10 = l13 == null ? b.j() : l13.longValue();
                if (list3 == null) {
                    list3 = b.f();
                }
                if (list4 == null) {
                    list4 = b.e();
                }
                return ae.e.b(h10, i12, i13, a10, j10, list3, list4);
            }
        });
        if (r8 == null) {
            return false;
        }
        u(r8);
        return true;
    }
}

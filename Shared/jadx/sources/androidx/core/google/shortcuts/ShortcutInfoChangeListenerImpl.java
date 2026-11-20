package androidx.core.google.shortcuts;

import android.content.Context;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m2.b;
import m2.c;
import pe.p;
import v8.a;
import v8.g;
import v8.h;

/* loaded from: classes.dex */
public class ShortcutInfoChangeListenerImpl extends b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1599a;
    public final v8.b b;

    /* renamed from: c, reason: collision with root package name */
    public final h f1600c;

    /* renamed from: d, reason: collision with root package name */
    public final p f1601d;

    public static class a {
        @NonNull
        public static o2.a a(@NonNull String str, PersistableBundle persistableBundle) {
            String[] stringArray;
            o2.a g10 = new o2.a().g(str);
            if (persistableBundle != null && (stringArray = persistableBundle.getStringArray(str)) != null) {
                ArrayList arrayList = new ArrayList();
                for (String str2 : stringArray) {
                    o2.b g11 = new o2.b().g(str2);
                    String[] stringArray2 = persistableBundle.getStringArray(str + "/" + str2);
                    if (stringArray2 != null && stringArray2.length != 0) {
                        g11.l(stringArray2);
                        arrayList.add(g11);
                    }
                }
                if (arrayList.size() > 0) {
                    g10.l((o2.b[]) arrayList.toArray(new o2.b[0]));
                }
            }
            return g10;
        }
    }

    public ShortcutInfoChangeListenerImpl(Context context, v8.b bVar, h hVar, p pVar) {
        this.f1599a = context;
        this.b = bVar;
        this.f1600c = hVar;
        this.f1601d = pVar;
    }

    @NonNull
    public static ShortcutInfoChangeListenerImpl getInstance(@NonNull Context context) {
        return new ShortcutInfoChangeListenerImpl(context, v8.b.a(context), h.b(context), p2.a.c(context));
    }

    @Override // m2.b
    public void a() {
        this.b.b();
    }

    @Override // m2.b
    public void b(@NonNull List<c> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<c> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(e(it.next()).a());
        }
        this.b.c((g[]) arrayList.toArray(new g[0]));
    }

    @Override // m2.b
    public void c(@NonNull List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f1600c.a(d(p2.a.b(this.f1599a, it.next())));
        }
    }

    @NonNull
    public final v8.a d(@NonNull String str) {
        return new a.C0612a("ViewAction").b("", str).a();
    }

    @NonNull
    public final o2.c e(@NonNull c cVar) {
        String b = p2.a.b(this.f1599a, cVar.f());
        o2.c o8 = new o2.c().e(cVar.f()).h(b).n(cVar.m().toString()).o(p2.a.a(this.f1599a, cVar.g(), this.f1601d));
        if (cVar.j() != null) {
            o8.m(cVar.j().toString());
        }
        if (cVar.c() != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : cVar.c()) {
                if (p2.a.d(str)) {
                    arrayList.add(a.a(str, cVar.d()));
                }
            }
            if (!arrayList.isEmpty()) {
                o8.l((o2.a[]) arrayList.toArray(new o2.a[0]));
            }
        }
        if (cVar.e() != null) {
            IconCompat e10 = cVar.e();
            if (e10.i() == 6 || e10.i() == 4) {
                o8.f(e10.j().toString());
            }
        }
        return o8;
    }
}

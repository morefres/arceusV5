package ss;

import android.content.Context;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import pn.f;
import ss.e;
import ss.g;
import ss.l;
import ss.o;
import ts.c;

/* loaded from: classes3.dex */
public class f implements e.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31645a;
    public final List<j> b = new ArrayList(3);

    /* renamed from: c, reason: collision with root package name */
    public TextView.BufferType f31646c = TextView.BufferType.SPANNABLE;

    /* renamed from: d, reason: collision with root package name */
    public boolean f31647d = true;

    public f(@NonNull Context context) {
        this.f31645a = context;
    }

    @NonNull
    public static List<j> b(@NonNull List<j> list) {
        return new q(list).b();
    }

    @Override // ss.e.a
    @NonNull
    public e.a a(@NonNull j jVar) {
        this.b.add(jVar);
        return this;
    }

    @Override // ss.e.a
    @NonNull
    public e build() {
        if (this.b.isEmpty()) {
            throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
        }
        List<j> b = b(this.b);
        f.a aVar = new f.a();
        c.a i10 = ts.c.i(this.f31645a);
        g.a aVar2 = new g.a();
        o.a aVar3 = new o.a();
        l.a aVar4 = new l.a();
        for (j jVar : b) {
            jVar.b(aVar);
            jVar.e(i10);
            jVar.i(aVar2);
            jVar.a(aVar3);
            jVar.f(aVar4);
        }
        g h10 = aVar2.h(i10.z(), aVar4.build());
        return new i(this.f31646c, null, aVar.k(), n.b(aVar3, h10), h10, Collections.unmodifiableList(b), this.f31647d);
    }
}

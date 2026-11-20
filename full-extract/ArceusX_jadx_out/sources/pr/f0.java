package pr;

import android.content.Context;
import com.withpersona.sdk2.inquiry.ui.h;
import com.withpersona.sdk2.inquiry.ui.network.b;
import or.a;
import xq.a;

/* loaded from: classes3.dex */
public final class f0 implements dt.d<e0> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f29023a;
    public final dt.i<b.a> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<a.C0492a> f29024c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<a.C0662a> f29025d;

    /* renamed from: e, reason: collision with root package name */
    public final dt.i<h.a> f29026e;

    public f0(dt.i<Context> iVar, dt.i<b.a> iVar2, dt.i<a.C0492a> iVar3, dt.i<a.C0662a> iVar4, dt.i<h.a> iVar5) {
        this.f29023a = iVar;
        this.b = iVar2;
        this.f29024c = iVar3;
        this.f29025d = iVar4;
        this.f29026e = iVar5;
    }

    public static f0 a(dt.i<Context> iVar, dt.i<b.a> iVar2, dt.i<a.C0492a> iVar3, dt.i<a.C0662a> iVar4, dt.i<h.a> iVar5) {
        return new f0(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static e0 c(Context context, b.a aVar, a.C0492a c0492a, a.C0662a c0662a, h.a aVar2) {
        return new e0(context, aVar, c0492a, c0662a, aVar2);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e0 get() {
        return c(this.f29023a.get(), this.b.get(), this.f29024c.get(), this.f29025d.get(), this.f29026e.get());
    }
}

package fq;

import android.content.Context;
import com.withpersona.sdk2.camera.e;
import fn.c;

/* loaded from: classes3.dex */
public final class k implements dt.d<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f17686a;
    public final dt.i<e.a> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<c.a> f17687c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<sq.a> f17688d;

    /* renamed from: e, reason: collision with root package name */
    public final dt.i<eo.e> f17689e;

    public k(dt.i<Context> iVar, dt.i<e.a> iVar2, dt.i<c.a> iVar3, dt.i<sq.a> iVar4, dt.i<eo.e> iVar5) {
        this.f17686a = iVar;
        this.b = iVar2;
        this.f17687c = iVar3;
        this.f17688d = iVar4;
        this.f17689e = iVar5;
    }

    public static k a(dt.i<Context> iVar, dt.i<e.a> iVar2, dt.i<c.a> iVar3, dt.i<sq.a> iVar4, dt.i<eo.e> iVar5) {
        return new k(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static j c(Context context, e.a aVar, c.a aVar2, sq.a aVar3, eo.e eVar) {
        return new j(context, aVar, aVar2, aVar3, eVar);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f17686a.get(), this.b.get(), this.f17687c.get(), this.f17688d.get(), this.f17689e.get());
    }
}

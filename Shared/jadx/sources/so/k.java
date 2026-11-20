package so;

import android.content.Context;
import com.withpersona.sdk2.camera.e;
import fn.c;

/* loaded from: classes3.dex */
public final class k implements dt.d<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f31585a;
    public final dt.i<e.a> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<c.a> f31586c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<sq.a> f31587d;

    public k(dt.i<Context> iVar, dt.i<e.a> iVar2, dt.i<c.a> iVar3, dt.i<sq.a> iVar4) {
        this.f31585a = iVar;
        this.b = iVar2;
        this.f31586c = iVar3;
        this.f31587d = iVar4;
    }

    public static k a(dt.i<Context> iVar, dt.i<e.a> iVar2, dt.i<c.a> iVar3, dt.i<sq.a> iVar4) {
        return new k(iVar, iVar2, iVar3, iVar4);
    }

    public static j c(Context context, e.a aVar, c.a aVar2, sq.a aVar3) {
        return new j(context, aVar, aVar2, aVar3);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f31585a.get(), this.b.get(), this.f31586c.get(), this.f31587d.get());
    }
}

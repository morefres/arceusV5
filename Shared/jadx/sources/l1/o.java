package l1;

import android.util.Range;
import android.util.Size;
import f1.c2;
import g0.k0;
import g0.r1;
import m1.p1;
import n0.a2;
import n0.a4;

/* loaded from: classes.dex */
public class o implements x2.h<p1> {

    /* renamed from: a, reason: collision with root package name */
    public final String f23209a;
    public final a4 b;

    /* renamed from: c, reason: collision with root package name */
    public final c2 f23210c;

    /* renamed from: d, reason: collision with root package name */
    public final Size f23211d;

    /* renamed from: e, reason: collision with root package name */
    public final a2.c f23212e;

    /* renamed from: f, reason: collision with root package name */
    public final k0 f23213f;

    /* renamed from: g, reason: collision with root package name */
    public final Range<Integer> f23214g;

    public o(String str, a4 a4Var, c2 c2Var, Size size, a2.c cVar, k0 k0Var, Range<Integer> range) {
        this.f23209a = str;
        this.b = a4Var;
        this.f23210c = c2Var;
        this.f23211d = size;
        this.f23212e = cVar;
        this.f23213f = k0Var;
        this.f23214g = range;
    }

    @Override // x2.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public p1 get() {
        CaptureEncodeRates c10 = m.c(this.f23210c, this.f23214g);
        r1.a("VidEncVdPrflRslvr", "Resolved VIDEO frame rates: Capture frame rate = " + c10.getCaptureRate() + "fps. Encode frame rate = " + c10.getEncodeRate() + "fps.");
        Range<Integer> c11 = this.f23210c.c();
        r1.a("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
        int f10 = m.f(this.f23212e.c(), this.f23213f.a(), this.f23212e.b(), c10.getEncodeRate(), this.f23212e.f(), this.f23211d.getWidth(), this.f23212e.l(), this.f23211d.getHeight(), this.f23212e.h(), c11);
        int j10 = this.f23212e.j();
        return p1.d().i(this.f23209a).h(this.b).k(this.f23211d).b(f10).c(c10.getCaptureRate()).f(c10.getEncodeRate()).j(j10).e(m.b(this.f23209a, j10)).a();
    }
}

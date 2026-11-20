package l1;

import android.util.Range;
import android.util.Size;
import f1.c2;
import g0.k0;
import g0.r1;
import m1.p1;
import n0.a4;

/* loaded from: classes.dex */
public class n implements x2.h<p1> {

    /* renamed from: g, reason: collision with root package name */
    public static final Size f23203g = new Size(1280, 720);

    /* renamed from: a, reason: collision with root package name */
    public final String f23204a;
    public final a4 b;

    /* renamed from: c, reason: collision with root package name */
    public final c2 f23205c;

    /* renamed from: d, reason: collision with root package name */
    public final Size f23206d;

    /* renamed from: e, reason: collision with root package name */
    public final k0 f23207e;

    /* renamed from: f, reason: collision with root package name */
    public final Range<Integer> f23208f;

    public n(String str, a4 a4Var, c2 c2Var, Size size, k0 k0Var, Range<Integer> range) {
        this.f23204a = str;
        this.b = a4Var;
        this.f23205c = c2Var;
        this.f23206d = size;
        this.f23207e = k0Var;
        this.f23208f = range;
    }

    @Override // x2.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public p1 get() {
        CaptureEncodeRates c10 = m.c(this.f23205c, this.f23208f);
        r1.a("VidEncCfgDefaultRslvr", "Resolved VIDEO frame rates: Capture frame rate = " + c10.getCaptureRate() + "fps. Encode frame rate = " + c10.getEncodeRate() + "fps.");
        Range<Integer> c11 = this.f23205c.c();
        r1.a("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        int a10 = this.f23207e.a();
        int encodeRate = c10.getEncodeRate();
        int width = this.f23206d.getWidth();
        Size size = f23203g;
        int f10 = m.f(14000000, a10, 8, encodeRate, 30, width, size.getWidth(), this.f23206d.getHeight(), size.getHeight(), c11);
        int a11 = n1.b.a(this.f23204a, this.f23207e);
        return p1.d().i(this.f23204a).h(this.b).k(this.f23206d).b(f10).c(c10.getCaptureRate()).f(c10.getEncodeRate()).j(a11).e(m.b(this.f23204a, a11)).a();
    }
}

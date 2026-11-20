package l1;

import android.util.Range;
import android.util.Rational;
import g0.r1;
import n0.a2;

/* loaded from: classes.dex */
public final class f implements x2.h<i1.a> {

    /* renamed from: a, reason: collision with root package name */
    public final f1.a f23190a;
    public final a2.a b;

    /* renamed from: c, reason: collision with root package name */
    public final Rational f23191c;

    public f(f1.a aVar, a2.a aVar2, Rational rational) {
        this.f23190a = aVar;
        this.b = aVar2;
        this.f23191c = rational;
    }

    @Override // x2.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public i1.a get() {
        int e10 = b.e(this.f23190a);
        int f10 = b.f(this.f23190a);
        int c10 = this.f23190a.c();
        int c11 = this.b.c();
        if (c10 == -1) {
            r1.a("AudioSrcAdPrflRslvr", "Resolved AUDIO channel count from AudioProfile: " + c11);
            c10 = c11;
        } else {
            r1.a("AudioSrcAdPrflRslvr", "Media spec AUDIO channel count overrides AudioProfile [AudioProfile channel count: " + c11 + ", Resolved Channel Count: " + c10 + "]");
        }
        Range<Integer> d10 = this.f23190a.d();
        int g10 = this.b.g();
        CaptureEncodeRates g11 = b.g(d10, g10, c10, f10, this.f23191c);
        r1.a("AudioSrcAdPrflRslvr", "Using resolved AUDIO sample rate or nearest supported from AudioProfile: Capture sample rate: " + g11.getCaptureRate() + "Hz. Encode sample rate: " + g11.getEncodeRate() + "Hz. [AudioProfile sample rate: " + g10 + "Hz]");
        return i1.a.a().d(e10).c(f10).f(c10).e(g11.getCaptureRate()).g(g11.getEncodeRate()).b();
    }
}

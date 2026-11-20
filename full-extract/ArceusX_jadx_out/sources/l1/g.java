package l1;

import android.util.Range;
import android.util.Rational;
import g0.r1;

/* loaded from: classes.dex */
public final class g implements x2.h<i1.a> {

    /* renamed from: a, reason: collision with root package name */
    public final f1.a f23192a;
    public final Rational b;

    public g(f1.a aVar, Rational rational) {
        this.f23192a = aVar;
        this.b = rational;
    }

    @Override // x2.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public i1.a get() {
        int e10 = b.e(this.f23192a);
        int f10 = b.f(this.f23192a);
        int c10 = this.f23192a.c();
        if (c10 == -1) {
            r1.a("DefAudioResolver", "Using fallback AUDIO channel count: 1");
            c10 = 1;
        } else {
            r1.a("DefAudioResolver", "Using supplied AUDIO channel count: " + c10);
        }
        Range<Integer> d10 = this.f23192a.d();
        CaptureEncodeRates g10 = b.g(d10, f1.a.b.equals(d10) ? 44100 : d10.getUpper().intValue(), c10, e10, this.b);
        r1.a("DefAudioResolver", "Using AUDIO sample rate resolved from AudioSpec: Capture sample rate: " + g10.getCaptureRate() + "Hz. Encode sample rate: " + g10.getEncodeRate() + "Hz.");
        return i1.a.a().d(e10).c(f10).f(c10).e(g10.getCaptureRate()).g(g10.getEncodeRate()).b();
    }
}

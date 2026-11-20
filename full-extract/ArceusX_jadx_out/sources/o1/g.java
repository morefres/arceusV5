package o1;

import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import java.util.HashSet;
import java.util.Set;
import m1.r1;

/* loaded from: classes.dex */
public class g implements r1 {

    /* renamed from: a, reason: collision with root package name */
    public final r1 f27527a;
    public final Range<Integer> b;

    /* renamed from: c, reason: collision with root package name */
    public final Range<Integer> f27528c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<Size> f27529d;

    public g(r1 r1Var) {
        HashSet hashSet = new HashSet();
        this.f27529d = hashSet;
        this.f27527a = r1Var;
        int f10 = r1Var.f();
        this.b = Range.create(Integer.valueOf(f10), Integer.valueOf(((int) Math.ceil(4096.0d / f10)) * f10));
        int c10 = r1Var.c();
        this.f27528c = Range.create(Integer.valueOf(c10), Integer.valueOf(((int) Math.ceil(2160.0d / c10)) * c10));
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.g());
    }

    public static r1 l(r1 r1Var, Size size) {
        if (!(r1Var instanceof g)) {
            if (k1.c.b(MediaCodecInfoReportIncorrectInfoQuirk.class) == null) {
                if (size != null && !r1Var.e(size.getWidth(), size.getHeight())) {
                    g0.r1.l("VideoEncoderInfoWrapper", String.format("Detected that the device does not support a size %s that should be valid in widths/heights = %s/%s", size, r1Var.i(), r1Var.j()));
                }
            }
            r1Var = new g(r1Var);
        }
        if (size != null && (r1Var instanceof g)) {
            ((g) r1Var).k(size);
        }
        return r1Var;
    }

    @Override // m1.r1
    public boolean a() {
        return this.f27527a.a();
    }

    @Override // m1.r1
    public Range<Integer> b(int i10) {
        x2.g.b(this.f27528c.contains((Range<Integer>) Integer.valueOf(i10)) && i10 % this.f27527a.c() == 0, "Not supported height: " + i10 + " which is not in " + this.f27528c + " or can not be divided by alignment " + this.f27527a.c());
        return this.b;
    }

    @Override // m1.r1
    public int c() {
        return this.f27527a.c();
    }

    @Override // m1.r1
    public boolean d(int i10, int i11) {
        if (this.f27527a.d(i10, i11)) {
            return true;
        }
        for (Size size : this.f27529d) {
            if (size.getWidth() == i10 && size.getHeight() == i11) {
                return true;
            }
        }
        return this.b.contains((Range<Integer>) Integer.valueOf(i10)) && this.f27528c.contains((Range<Integer>) Integer.valueOf(i11)) && i10 % this.f27527a.f() == 0 && i11 % this.f27527a.c() == 0;
    }

    @Override // m1.r1
    public int f() {
        return this.f27527a.f();
    }

    @Override // m1.r1
    public Range<Integer> g() {
        return this.f27527a.g();
    }

    @Override // m1.r1
    public Range<Integer> h(int i10) {
        x2.g.b(this.b.contains((Range<Integer>) Integer.valueOf(i10)) && i10 % this.f27527a.f() == 0, "Not supported width: " + i10 + " which is not in " + this.b + " or can not be divided by alignment " + this.f27527a.f());
        return this.f27528c;
    }

    @Override // m1.r1
    public Range<Integer> i() {
        return this.b;
    }

    @Override // m1.r1
    public Range<Integer> j() {
        return this.f27528c;
    }

    public final void k(Size size) {
        this.f27529d.add(size);
    }
}

package du;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\b\b'\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ldu/d;", "", "<init>", "()V", "", "bitCount", j6.b.f21518e, "(I)I", "f", "()I", "until", "g", "from", "h", "(II)I", "", "c", "()D", rl.d.f30696a, "(D)D", "e", "(DD)D", ve.a.f33391e, "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final d b = qt.b.f30015a.b();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ldu/d$a;", "Ldu/d;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "", "bitCount", j6.b.f21518e, "(I)I", "f", "()I", "until", "g", "from", "h", "(II)I", "", "c", "()D", rl.d.f30696a, "(D)D", "e", "(DD)D", "defaultRandom", "Ldu/d;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: du.d$a, reason: from kotlin metadata */
    public static final class Companion extends d implements Serializable {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // du.d
        public int b(int bitCount) {
            return d.b.b(bitCount);
        }

        @Override // du.d
        public double c() {
            return d.b.c();
        }

        @Override // du.d
        public double d(double until) {
            return d.b.d(until);
        }

        @Override // du.d
        public double e(double from, double until) {
            return d.b.e(from, until);
        }

        @Override // du.d
        public int f() {
            return d.b.f();
        }

        @Override // du.d
        public int g(int until) {
            return d.b.g(until);
        }

        @Override // du.d
        public int h(int from, int until) {
            return d.b.h(from, until);
        }

        public Companion() {
        }
    }

    public abstract int b(int bitCount);

    public double c() {
        return c.a(b(26), b(27));
    }

    public double d(double until) {
        return e(0.0d, until);
    }

    public double e(double from, double until) {
        double c10;
        e.b(from, until);
        double d10 = until - from;
        if (!Double.isInfinite(d10) || Math.abs(from) > Double.MAX_VALUE || Math.abs(until) > Double.MAX_VALUE) {
            c10 = from + (c() * d10);
        } else {
            double d11 = 2;
            double c11 = c() * ((until / d11) - (from / d11));
            c10 = from + c11 + c11;
        }
        return c10 >= until ? Math.nextAfter(until, Double.NEGATIVE_INFINITY) : c10;
    }

    public int f() {
        return b(32);
    }

    public int g(int until) {
        return h(0, until);
    }

    public int h(int from, int until) {
        int f10;
        int i10;
        int i11;
        e.c(from, until);
        int i12 = until - from;
        if (i12 > 0 || i12 == Integer.MIN_VALUE) {
            if (((-i12) & i12) == i12) {
                i11 = b(e.d(i12));
            } else {
                do {
                    f10 = f() >>> 1;
                    i10 = f10 % i12;
                } while ((f10 - i10) + (i12 - 1) < 0);
                i11 = i10;
            }
            return from + i11;
        }
        while (true) {
            int f11 = f();
            if (from <= f11 && f11 < until) {
                return f11;
            }
        }
    }
}

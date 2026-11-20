package eb;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* loaded from: classes.dex */
public final class i4 {

    /* renamed from: a, reason: collision with root package name */
    public final Deque f15800a = new ArrayDeque(16);

    public i4(boolean z10) {
    }

    public static i4 a() {
        return new i4(false);
    }

    public final void b() {
        if (!this.f15800a.isEmpty()) {
            throw new IOException(String.format("data item not completed, stackSize: %s scope: %s", Integer.valueOf(this.f15800a.size()), Long.valueOf(h())));
        }
    }

    public final void c() {
        long h10 = h();
        if (h10 >= 0) {
            throw new IOException(String.format("expected indefinite length scope but found %s", Long.valueOf(h10)));
        }
        if (h10 == -5) {
            throw new IOException("expected a value for dangling key in indefinite-length map");
        }
        this.f15800a.pop();
    }

    public final void d() {
        long h10 = h();
        if (h10 != -1) {
            if (h10 != -2) {
                return;
            } else {
                h10 = -2;
            }
        }
        throw new IOException(String.format("expected non-string scope but found %s", Long.valueOf(h10)));
    }

    public final void e(long j10) {
        long h10 = h();
        if (h10 != j10) {
            if (h10 != -1) {
                if (h10 != -2) {
                    return;
                } else {
                    h10 = -2;
                }
            }
            throw new IOException(String.format("expected non-string scope or scope %s but found %s", Long.valueOf(j10), Long.valueOf(h10)));
        }
    }

    public final void f() {
        long h10 = h();
        if (h10 == 1) {
            this.f15800a.pop();
            return;
        }
        if (h10 > 1) {
            i(h10 - 1);
        } else if (h10 == -4) {
            i(-5L);
        } else if (h10 == -5) {
            i(-4L);
        }
    }

    public final void g(long j10) {
        this.f15800a.push(Long.valueOf(j10));
    }

    public final long h() {
        if (this.f15800a.isEmpty()) {
            return 0L;
        }
        return ((Long) this.f15800a.peek()).longValue();
    }

    public final void i(long j10) {
        this.f15800a.pop();
        this.f15800a.push(Long.valueOf(j10));
    }
}

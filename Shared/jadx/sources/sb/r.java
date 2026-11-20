package sb;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class r<T> implements q<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f31016a = new Object();
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f31017c;

    /* renamed from: d, reason: collision with root package name */
    public int f31018d;

    /* renamed from: e, reason: collision with root package name */
    public int f31019e;

    /* renamed from: f, reason: collision with root package name */
    public int f31020f;

    /* renamed from: g, reason: collision with root package name */
    public Exception f31021g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f31022h;

    public r(int i10, n0 n0Var) {
        this.b = i10;
        this.f31017c = n0Var;
    }

    private final void b() {
        if (this.f31018d + this.f31019e + this.f31020f == this.b) {
            if (this.f31021g == null) {
                if (this.f31022h) {
                    this.f31017c.r();
                    return;
                } else {
                    this.f31017c.q(null);
                    return;
                }
            }
            this.f31017c.p(new ExecutionException(this.f31019e + " out of " + this.b + " underlying tasks failed", this.f31021g));
        }
    }

    @Override // sb.e
    public final void a() {
        synchronized (this.f31016a) {
            this.f31020f++;
            this.f31022h = true;
            b();
        }
    }

    @Override // sb.f
    public final void onFailure(@NonNull Exception exc) {
        synchronized (this.f31016a) {
            this.f31019e++;
            this.f31021g = exc;
            b();
        }
    }

    @Override // sb.g
    public final void onSuccess(T t8) {
        synchronized (this.f31016a) {
            this.f31018d++;
            b();
        }
    }
}

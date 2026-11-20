package da;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public int f14467a = 4368;
    public final ArrayList b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public String f14468c = null;

    /* renamed from: d, reason: collision with root package name */
    public ga.q f14469d = ga.q.f18426d;

    static {
        new AtomicInteger(0);
    }

    public /* synthetic */ n(byte[] bArr) {
    }

    public final n a(int i10) {
        this.f14467a = 2101523;
        return this;
    }

    public final n b(String str) {
        this.f14468c = str;
        return this;
    }

    public final n c(ga.q qVar) {
        this.f14469d = (ga.q) n9.m.l(qVar);
        return this;
    }

    public final o d() {
        return new o(false, true, 17, false, this.f14467a, null, this.b, false, false, false, null, 0, 9, this.f14468c, this.f14469d, false, null);
    }
}

package nb;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ie {

    /* renamed from: a, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.a7 f26315a;
    public List b;

    /* renamed from: c, reason: collision with root package name */
    public List f26316c;

    /* renamed from: d, reason: collision with root package name */
    public long f26317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ me f26318e;

    public /* synthetic */ ie(me meVar, byte[] bArr) {
        Objects.requireNonNull(meVar);
        this.f26318e = meVar;
    }

    public static final long b(com.google.android.gms.internal.measurement.o6 o6Var) {
        return ((o6Var.L() / 1000) / 60) / 60;
    }

    public final boolean a(long j10, com.google.android.gms.internal.measurement.o6 o6Var) {
        n9.m.l(o6Var);
        if (this.f26316c == null) {
            this.f26316c = new ArrayList();
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        if (!this.f26316c.isEmpty() && b((com.google.android.gms.internal.measurement.o6) this.f26316c.get(0)) != b(o6Var)) {
            return false;
        }
        long a10 = this.f26317d + o6Var.a();
        me meVar = this.f26318e;
        if (!meVar.B0().H(null, z4.f26865e1)) {
            meVar.B0();
            if (a10 >= k.o()) {
                return false;
            }
        } else if (!this.f26316c.isEmpty()) {
            meVar.B0();
            if (a10 >= k.o()) {
                return false;
            }
        }
        this.f26317d = a10;
        this.f26316c.add(o6Var);
        this.b.add(Long.valueOf(j10));
        int size = this.f26316c.size();
        meVar.B0();
        return size < Math.max(1, ((Integer) z4.f26881k.b(null)).intValue());
    }
}

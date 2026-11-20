package eb;

import com.google.android.apps.common.proguard.SideEffectFree;
import java.util.Set;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f15944a;
    public final Set b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15945c;

    public y(String str, Set set, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f15944a = "com.google.android.gms.fido";
        this.b = set;
        this.f15945c = z13;
    }

    @SideEffectFree
    public final q a(String str, long j10) {
        final Class<Long> cls = Long.class;
        return new q(this.f15944a, str, Long.valueOf(j10), new l(false, false, false, this.f15945c, false, this.b, new x() { // from class: eb.v
        }, new x(cls) { // from class: eb.w
        }), true);
    }

    @SideEffectFree
    public final q b(String str, String str2) {
        final Class<String> cls = String.class;
        return new q(this.f15944a, str, str2, new l(false, false, false, this.f15945c, false, this.b, new x() { // from class: eb.t
        }, new x(cls) { // from class: eb.u
        }), true);
    }

    @SideEffectFree
    public final q c(String str, boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        final Class<Boolean> cls = Boolean.class;
        return new q(this.f15944a, str, valueOf, new l(false, false, false, this.f15945c, false, this.b, new x() { // from class: eb.r
        }, new x(cls) { // from class: eb.s
        }), true);
    }

    public final y d() {
        return new y(this.f15944a, this.b, false, false, false, true, false);
    }

    public final y e(Set set) {
        return new y(this.f15944a, set, false, false, false, this.f15945c, false);
    }

    public y(String str) {
        this("com.google.android.gms.fido", h1.l(), false, false, false, false, false);
    }
}

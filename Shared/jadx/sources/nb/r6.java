package nb;

import com.google.android.gms.internal.measurement.gg;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r6 implements gg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x6 f26628a;

    public r6(x6 x6Var) {
        Objects.requireNonNull(x6Var);
        this.f26628a = x6Var;
    }

    @Override // com.google.android.gms.internal.measurement.gg
    public final void a(int i10, String str, List list, boolean z10, boolean z11) {
        int i11 = i10 - 1;
        u5 u8 = i11 != 0 ? i11 != 1 ? i11 != 3 ? i11 != 4 ? this.f26628a.f26328a.a().u() : z10 ? this.f26628a.f26328a.a().s() : !z11 ? this.f26628a.f26328a.a().t() : this.f26628a.f26328a.a().r() : this.f26628a.f26328a.a().w() : z10 ? this.f26628a.f26328a.a().p() : !z11 ? this.f26628a.f26328a.a().q() : this.f26628a.f26328a.a().o() : this.f26628a.f26328a.a().v();
        int size = list.size();
        if (size == 1) {
            u8.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            u8.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            u8.a(str);
        } else {
            u8.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}

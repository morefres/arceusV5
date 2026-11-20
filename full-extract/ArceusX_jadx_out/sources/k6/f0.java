package k6;

import android.content.Context;
import k6.Extras;
import k6.d0;
import k6.s;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lk6/d0$a;", ve.a.f33391e, "Lk6/d0$a;", "DefaultSingletonImageLoaderFactory", "Lk6/l$c;", "", j6.b.f21518e, "Lk6/l$c;", "DefaultSingletonImageLoaderKey", "coil_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d0.a f22363a = new d0.a() { // from class: k6.e0
        @Override // k6.d0.a
        public final s a(Context context) {
            s b10;
            b10 = f0.b(context);
            return b10;
        }
    };

    @NotNull
    public static final Extras.c<Unit> b = new Extras.c<>(Unit.f22894a);

    public static final s b(Context context) {
        s.a aVar = new s.a(context);
        aVar.getExtras().b(b, Unit.f22894a);
        return aVar.d();
    }
}

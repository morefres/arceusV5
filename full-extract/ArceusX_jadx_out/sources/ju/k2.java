package ju;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006\"\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006\"\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0012¨\u0006\u0015"}, d2 = {"", "g", "(Ljava/lang/Object;)Ljava/lang/Object;", "h", "Lpu/e0;", ve.a.f33391e, "Lpu/e0;", "COMPLETING_ALREADY", j6.b.f21518e, "COMPLETING_WAITING_CHILDREN", "c", "COMPLETING_RETRY", rl.d.f30696a, "TOO_LATE_TO_CANCEL", "e", "SEALED", "Lju/l1;", "f", "Lju/l1;", "EMPTY_NEW", "EMPTY_ACTIVE", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final pu.e0 f22109a = new pu.e0("COMPLETING_ALREADY");

    @NotNull
    public static final pu.e0 b = new pu.e0("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final pu.e0 f22110c = new pu.e0("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final pu.e0 f22111d = new pu.e0("TOO_LATE_TO_CANCEL");

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final pu.e0 f22112e = new pu.e0("SEALED");

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final l1 f22113f = new l1(false);

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public static final l1 f22114g = new l1(true);

    @Nullable
    public static final Object g(@Nullable Object obj) {
        return obj instanceof y1 ? new z1((y1) obj) : obj;
    }

    @Nullable
    public static final Object h(@Nullable Object obj) {
        y1 y1Var;
        z1 z1Var = obj instanceof z1 ? (z1) obj : null;
        return (z1Var == null || (y1Var = z1Var.state) == null) ? obj : y1Var;
    }
}

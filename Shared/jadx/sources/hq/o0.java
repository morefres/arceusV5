package hq;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lhq/o0;", "", "<init>", "()V", "Lhq/n0;", ve.a.f33391e, "()Lhq/n0;", "Ljava/util/concurrent/atomic/AtomicInteger;", j6.b.f21518e, "Ljava/util/concurrent/atomic/AtomicInteger;", "viewTypeGeneratorCount", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final o0 f19588a = new o0();

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static AtomicInteger viewTypeGeneratorCount = new AtomicInteger(0);

    @NotNull
    public final n0 a() {
        return new n0((viewTypeGeneratorCount.getAndIncrement() * 4096) + 268435456);
    }
}

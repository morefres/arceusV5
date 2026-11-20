package pu;

import gt.n;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006\"\u001c\u0010\f\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001c\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b*\f\b\u0000\u0010\u0010\"\u00020\u000f2\u00020\u000f*\f\b\u0000\u0010\u0011\"\u00020\u00052\u00020\u0005¨\u0006\u0012"}, d2 = {"", "E", "exception", ve.a.f33391e, "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/StackTraceElement;", "Ljava/lang/StackTraceElement;", "ARTIFICIAL_FRAME", "", "kotlin.jvm.PlatformType", j6.b.f21518e, "Ljava/lang/String;", "baseContinuationImplClassName", "c", "stackTraceRecoveryClassName", "Lot/e;", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final StackTraceElement f29170a = new a.a().a();
    public static final String b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f29171c;

    static {
        Object b10;
        Object b11;
        try {
            n.Companion companion = gt.n.INSTANCE;
            b10 = gt.n.b(ot.a.class.getCanonicalName());
        } catch (Throwable th2) {
            n.Companion companion2 = gt.n.INSTANCE;
            b10 = gt.n.b(gt.o.a(th2));
        }
        if (gt.n.e(b10) != null) {
            b10 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        b = (String) b10;
        try {
            b11 = gt.n.b(d0.class.getCanonicalName());
        } catch (Throwable th3) {
            n.Companion companion3 = gt.n.INSTANCE;
            b11 = gt.n.b(gt.o.a(th3));
        }
        if (gt.n.e(b11) != null) {
            b11 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f29171c = (String) b11;
    }

    @NotNull
    public static final <E extends Throwable> E a(@NotNull E e10) {
        return e10;
    }
}

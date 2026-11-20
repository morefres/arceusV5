package t3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mu.r0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\t8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\u0004R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000eR\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lt3/l;", "T", "", "<init>", "()V", "Lt3/d0;", "newState", "c", "(Lt3/d0;)Lt3/d0;", "Lmu/c0;", ve.a.f33391e, "Lmu/c0;", "getCachedValue$annotations", "cachedValue", "()Lt3/d0;", "currentState", "Lmu/h;", j6.b.f21518e, "()Lmu/h;", "flow", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mu.c0<d0<T>> cachedValue;

    public l() {
        h0 h0Var = h0.b;
        Intrinsics.d(h0Var, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.cachedValue = r0.a(h0Var);
    }

    @NotNull
    public final d0<T> a() {
        return this.cachedValue.getValue();
    }

    @NotNull
    public final mu.h<d0<T>> b() {
        return this.cachedValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r6.getVersion() > r2.getVersion()) goto L13;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final t3.d0<T> c(@org.jetbrains.annotations.NotNull t3.d0<T> r6) {
        /*
            r5 = this;
            java.lang.String r0 = "newState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            mu.c0<t3.d0<T>> r0 = r5.cachedValue
        L7:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            t3.d0 r2 = (t3.d0) r2
            boolean r3 = r2 instanceof t3.x
            if (r3 == 0) goto L14
            r3 = 1
            goto L1a
        L14:
            t3.h0 r3 = t3.h0.b
            boolean r3 = kotlin.jvm.internal.Intrinsics.c(r2, r3)
        L1a:
            if (r3 == 0) goto L1d
            goto L2b
        L1d:
            boolean r3 = r2 instanceof t3.f
            if (r3 == 0) goto L2d
            int r3 = r6.getVersion()
            int r4 = r2.getVersion()
            if (r3 <= r4) goto L31
        L2b:
            r2 = r6
            goto L31
        L2d:
            boolean r3 = r2 instanceof t3.r
            if (r3 == 0) goto L38
        L31:
            boolean r1 = r0.i(r1, r2)
            if (r1 == 0) goto L7
            return r2
        L38:
            gt.l r6 = new gt.l
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.l.c(t3.d0):t3.d0");
    }
}

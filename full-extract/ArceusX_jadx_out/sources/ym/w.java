package ym;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B%\b\u0002\u0012\u001a\u0010\u0005\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\b\"\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\tJ1\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\b\b\u0000\u0010\u000b*\u00020\n2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR(\u0010\u0005\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lym/w;", "Lym/c0;", "", "Lgu/c;", "Lym/a0;", "bindings", "<init>", "(Ljava/util/Map;)V", "", "([Lym/a0;)V", "", "RenderingT", "renderingType", ve.a.f33391e, "(Lgu/c;)Lym/a0;", j6.b.f21518e, "Ljava/util/Map;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class w implements c0 {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<gu.c<?>, a0<?>> bindings;

    /* JADX WARN: Multi-variable type inference failed */
    public w(Map<gu.c<?>, ? extends a0<?>> map) {
        this.bindings = map;
    }

    @Override // ym.c0
    @Nullable
    public <RenderingT> a0<RenderingT> a(@NotNull gu.c<? extends RenderingT> renderingType) {
        Intrinsics.checkNotNullParameter(renderingType, "renderingType");
        Object obj = this.bindings.get(renderingType);
        if (obj instanceof a0) {
            return (a0) obj;
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(@org.jetbrains.annotations.NotNull ym.a0<?>... r7) {
        /*
            r6 = this;
            java.lang.String r0 = "bindings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.length
            r0.<init>(r1)
            int r1 = r7.length
            r2 = 0
            r3 = r2
        Le:
            if (r3 >= r1) goto L20
            r4 = r7[r3]
            int r3 = r3 + 1
            gu.c r5 = r4.getType()
            kotlin.Pair r4 = gt.s.a(r5, r4)
            r0.add(r4)
            goto Le
        L20:
            java.util.Map r0 = kotlin.collections.k0.t(r0)
            java.util.Set r1 = r0.keySet()
            int r1 = r1.size()
            int r3 = r7.length
            if (r1 != r3) goto L33
            r6.<init>(r0)
            return
        L33:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r7.length
            r1.<init>(r3)
            int r3 = r7.length
        L3f:
            if (r2 >= r3) goto L4d
            r4 = r7[r2]
            int r2 = r2 + 1
            gu.c r4 = r4.getType()
            r1.add(r4)
            goto L3f
        L4d:
            r0.append(r1)
            java.lang.String r7 = " must not have duplicate entries."
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ym.w.<init>(ym.a0[]):void");
    }
}

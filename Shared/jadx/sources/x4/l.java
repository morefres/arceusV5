package x4;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mu.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0014"}, d2 = {"Lx4/l;", "", "", "size", "<init>", "(I)V", "", "tableIds", "", j6.b.f21518e, "(Ljava/util/Set;)V", "Lmu/i;", "", "collector", "", ve.a.f33391e, "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "Lmu/c0;", "Lmu/c0;", "versions", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mu.c0<int[]> versions;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "androidx.room.ObservedTableVersions", f = "InvalidationTracker.kt", l = {638}, m = "collect")
    public static final class a extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f35090t;

        /* renamed from: v, reason: collision with root package name */
        public int f35092v;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35090t = obj;
            this.f35092v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return l.this.a(null, this);
        }
    }

    public l(int i10) {
        this.versions = r0.a(new int[i10]);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull mu.i<? super int[]> r5, @org.jetbrains.annotations.NotNull mt.b<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof x4.l.a
            if (r0 == 0) goto L13
            r0 = r6
            x4.l$a r0 = (x4.l.a) r0
            int r1 = r0.f35092v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35092v = r1
            goto L18
        L13:
            x4.l$a r0 = new x4.l$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f35090t
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f35092v
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            gt.o.b(r6)
            goto L3f
        L31:
            gt.o.b(r6)
            mu.c0<int[]> r6 = r4.versions
            r0.f35092v = r3
            java.lang.Object r5 = r6.collect(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            gt.d r5 = new gt.d
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.l.a(mu.i, mt.b):java.lang.Object");
    }

    public final void b(@NotNull Set<Integer> tableIds) {
        int[] value;
        int[] iArr;
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        if (tableIds.isEmpty()) {
            return;
        }
        mu.c0<int[]> c0Var = this.versions;
        do {
            value = c0Var.getValue();
            int[] iArr2 = value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = tableIds.contains(Integer.valueOf(i10)) ? iArr2[i10] + 1 : iArr2[i10];
            }
        } while (!c0Var.i(value, iArr));
    }
}

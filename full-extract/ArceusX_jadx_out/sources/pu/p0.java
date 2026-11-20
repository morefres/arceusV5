package pu;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pu.q0;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u0017\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0010H\u0082\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0010H\u0082\u0010¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR$\u0010$\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00108F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u0018R\u0011\u0010'\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u000b\u0010)\u001a\u00020(8\u0002X\u0082\u0004¨\u0006*"}, d2 = {"Lpu/p0;", "Lpu/q0;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "f", "()Lpu/q0;", "j", "node", "", "h", "(Lpu/q0;)Z", j6.b.f21518e, "", "index", "i", "(I)Lpu/q0;", "", ve.a.f33391e, "(Lpu/q0;)V", "m", "(I)V", "l", "", "g", "()[Lpu/q0;", "n", "(II)V", "[Lpu/q0;", "value", "c", "()I", "k", "size", "e", "()Z", "isEmpty", "Lkotlinx/atomicfu/AtomicInt;", "_size", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public class p0<T extends q0 & Comparable<? super T>> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(p0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    @Nullable
    public T[] a;

    public final void a(@NotNull T node) {
        node.d(this);
        T[] g10 = g();
        int c10 = c();
        k(c10 + 1);
        g10[c10] = node;
        node.setIndex(c10);
        m(c10);
    }

    @Nullable
    public final T b() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int c() {
        return b.get(this);
    }

    public final boolean e() {
        return c() == 0;
    }

    @Nullable
    public final T f() {
        T b10;
        synchronized (this) {
            b10 = b();
        }
        return b10;
    }

    public final T[] g() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new q0[4];
            this.a = tArr2;
            return tArr2;
        }
        if (c() < tArr.length) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, c() * 2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        T[] tArr3 = (T[]) ((q0[]) copyOf);
        this.a = tArr3;
        return tArr3;
    }

    public final boolean h(@NotNull T node) {
        boolean z10;
        synchronized (this) {
            if (node.b() == null) {
                z10 = false;
            } else {
                i(node.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    @NotNull
    public final T i(int index) {
        T[] tArr = this.a;
        Intrinsics.checkNotNull(tArr);
        k(c() - 1);
        if (index < c()) {
            n(index, c());
            int i10 = (index - 1) / 2;
            if (index > 0) {
                T t8 = tArr[index];
                Intrinsics.checkNotNull(t8);
                T t10 = tArr[i10];
                Intrinsics.checkNotNull(t10);
                if (((Comparable) t8).compareTo(t10) < 0) {
                    n(index, i10);
                    m(i10);
                }
            }
            l(index);
        }
        T t11 = tArr[c()];
        Intrinsics.checkNotNull(t11);
        t11.d(null);
        t11.setIndex(-1);
        tArr[c()] = null;
        return t11;
    }

    @Nullable
    public final T j() {
        T i10;
        synchronized (this) {
            i10 = c() > 0 ? i(0) : null;
        }
        return i10;
    }

    public final void k(int i10) {
        b.set(this, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (((java.lang.Comparable) r3).compareTo(r4) < 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.c()
            if (r1 < r2) goto Lb
            goto L3e
        Lb:
            T extends pu.q0 & java.lang.Comparable<? super T>[] r2 = r5.a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r0 = r0 + 2
            int r3 = r5.c()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
        L3e:
            return
        L3f:
            r5.n(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: pu.p0.l(int):void");
    }

    public final void m(int i10) {
        while (i10 > 0) {
            T[] tArr = this.a;
            Intrinsics.checkNotNull(tArr);
            int i11 = (i10 - 1) / 2;
            T t8 = tArr[i11];
            Intrinsics.checkNotNull(t8);
            T t10 = tArr[i10];
            Intrinsics.checkNotNull(t10);
            if (((Comparable) t8).compareTo(t10) <= 0) {
                return;
            }
            n(i10, i11);
            i10 = i11;
        }
    }

    public final void n(int i10, int j10) {
        T[] tArr = this.a;
        Intrinsics.checkNotNull(tArr);
        T t8 = tArr[j10];
        Intrinsics.checkNotNull(t8);
        T t10 = tArr[i10];
        Intrinsics.checkNotNull(t10);
        tArr[i10] = t8;
        tArr[j10] = t10;
        t8.setIndex(i10);
        t10.setIndex(j10);
    }
}

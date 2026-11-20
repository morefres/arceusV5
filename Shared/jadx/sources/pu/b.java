package pu;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u000b\u001a\u00028\u0000\"\u000e\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\t*\u00028\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a0\u0010\u0013\u001a\u00020\u0011*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u0010H\u0082\b¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lpu/b0;", "S", "", "id", "Lkotlin/Function2;", "createNewSegment", "Lpu/c0;", "c", "(Lpu/b0;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lpu/c;", "N", j6.b.f21518e, "(Lpu/c;)Lpu/c;", "Lkotlinx/atomicfu/AtomicInt;", "", "delta", "Lkotlin/Function1;", "", "condition", "addConditionally", "(Lkotlinx/atomicfu/AtomicInt;ILkotlin/jvm/functions/Function1;)Z", "Lpu/e0;", ve.a.f33391e, "Lpu/e0;", "CLOSED", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e0 f29166a = new e0("CLOSED");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [pu.c] */
    @NotNull
    public static final <N extends c<N>> N b(@NotNull N n10) {
        while (true) {
            Object g10 = n10.g();
            if (g10 == f29166a) {
                return n10;
            }
            ?? r02 = (c) g10;
            if (r02 != 0) {
                n10 = r02;
            } else if (n10.m()) {
                return n10;
            }
        }
    }

    @NotNull
    public static final <S extends b0<S>> Object c(@NotNull S s8, long j10, @NotNull Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            if (s8.id >= j10 && !s8.k()) {
                return c0.a(s8);
            }
            Object g10 = s8.g();
            if (g10 == f29166a) {
                return c0.a(f29166a);
            }
            S s10 = (S) ((c) g10);
            if (s10 == null) {
                s10 = function2.invoke(Long.valueOf(s8.id + 1), s8);
                if (s8.o(s10)) {
                    if (s8.k()) {
                        s8.n();
                    }
                }
            }
            s8 = s10;
        }
    }
}

package pu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0016\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0014j\b\u0012\u0004\u0012\u00028\u0000`\u00150\u00138\u0002X\u0082\u0004¨\u0006\u0017"}, d2 = {"Lpu/q;", "", "E", "", "singleConsumer", "<init>", "(Z)V", "", j6.b.f21518e, "()V", "element", ve.a.f33391e, "(Ljava/lang/Object;)Z", "e", "()Ljava/lang/Object;", "", "c", "()I", "size", "Lkotlinx/atomicfu/AtomicRef;", "Lpu/r;", "Lkotlinx/coroutines/internal/Core;", "_cur", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public class q<E> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29201a = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public q(boolean z10) {
        this._cur$volatile = new r(8, z10);
    }

    public final boolean a(@NotNull E element) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29201a;
        while (true) {
            r rVar = (r) atomicReferenceFieldUpdater.get(this);
            int a10 = rVar.a(element);
            if (a10 == 0) {
                return true;
            }
            if (a10 == 1) {
                y1.b.a(f29201a, this, rVar, rVar.l());
            } else if (a10 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29201a;
        while (true) {
            r rVar = (r) atomicReferenceFieldUpdater.get(this);
            if (rVar.d()) {
                return;
            } else {
                y1.b.a(f29201a, this, rVar, rVar.l());
            }
        }
    }

    public final int c() {
        return ((r) f29201a.get(this)).g();
    }

    @Nullable
    public final E e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29201a;
        while (true) {
            r rVar = (r) atomicReferenceFieldUpdater.get(this);
            E e10 = (E) rVar.m();
            if (e10 != r.f29205h) {
                return e10;
            }
            y1.b.a(f29201a, this, rVar, rVar.l());
        }
    }
}

package pu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ju.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00042\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0004H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0004H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001f\u001a\u00060\u0000j\u0002`\u00042\n\u0010\u001e\u001a\u00060\u0000j\u0002`\u0004H\u0082\u0010¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\u000e2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0004H\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0004H\u0082\u0010¢\u0006\u0004\b#\u0010\u0017R\u0014\u0010%\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0015\u0010)\u001a\u00060\u0000j\u0002`\u00048F¢\u0006\u0006\u001a\u0004\b(\u0010\u0017R\u0015\u0010+\u001a\u00060\u0000j\u0002`\u00048F¢\u0006\u0006\u001a\u0004\b*\u0010\u0017R\u0011\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010,8\u0002X\u0082\u0004R\u0011\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00000,8\u0002X\u0082\u0004R\u0013\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0,8\u0002X\u0082\u0004¨\u00060"}, d2 = {"Lpu/p;", "", "<init>", "()V", "Lkotlinx/coroutines/internal/Node;", "node", "", "g", "(Lpu/p;)Z", "", "permissionsBitmask", "e", "(Lpu/p;I)Z", "forbiddenElementsBit", "", "h", "(I)V", "next", "f", "(Lpu/p;Lpu/p;)Z", "s", "()Z", zl.t.f38095d, "()Lpu/p;", "", "toString", "()Ljava/lang/String;", "Lpu/y;", "u", "()Lpu/y;", "current", "j", "(Lpu/p;)Lpu/p;", "k", "(Lpu/p;)V", "i", "r", "isRemoved", "l", "()Ljava/lang/Object;", "m", "nextNode", "n", "prevNode", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "_removedRef", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29198a = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_prev$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29199c = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean e(@NotNull p node, int permissionsBitmask) {
        p n10;
        do {
            n10 = n();
            if (n10 instanceof n) {
                return (((n) n10).forbiddenElementsBitmask & permissionsBitmask) == 0 && n10.e(node, permissionsBitmask);
            }
        } while (!n10.f(node, this));
        return true;
    }

    public final boolean f(@NotNull p node, @NotNull p next) {
        b.set(node, this);
        f29198a.set(node, next);
        if (!y1.b.a(f29198a, this, next, node)) {
            return false;
        }
        node.k(next);
        return true;
    }

    public final boolean g(@NotNull p node) {
        b.set(node, this);
        f29198a.set(node, this);
        while (l() == this) {
            if (y1.b.a(f29198a, this, this, node)) {
                node.k(this);
                return true;
            }
        }
        return false;
    }

    public final void h(int forbiddenElementsBit) {
        e(new n(forbiddenElementsBit), forbiddenElementsBit);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (y1.b.a(pu.p.f29198a, r3, r2, ((pu.y) r4).f29217a) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0025, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final pu.p i() {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p()
            java.lang.Object r0 = r0.get(r7)
            pu.p r0 = (pu.p) r0
            r1 = 0
            r2 = r0
        Lc:
            r3 = r1
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = o()
            java.lang.Object r4 = r4.get(r2)
            if (r4 != r7) goto L26
            if (r0 != r2) goto L1a
            goto L25
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p()
            boolean r0 = y1.b.a(r1, r7, r0, r2)
            if (r0 != 0) goto L25
            goto L0
        L25:
            return r2
        L26:
            boolean r5 = r7.r()
            if (r5 == 0) goto L2d
            return r1
        L2d:
            boolean r5 = r4 instanceof pu.y
            if (r5 == 0) goto L4f
            if (r3 == 0) goto L44
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = o()
            pu.y r4 = (pu.y) r4
            pu.p r4 = r4.ref
            boolean r2 = y1.b.a(r5, r3, r2, r4)
            if (r2 != 0) goto L42
            goto L0
        L42:
            r2 = r3
            goto Lc
        L44:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = p()
            java.lang.Object r2 = r4.get(r2)
            pu.p r2 = (pu.p) r2
            goto Ld
        L4f:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.Intrinsics.d(r4, r3)
            r3 = r4
            pu.p r3 = (pu.p) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: pu.p.i():pu.p");
    }

    public final p j(p current) {
        while (current.r()) {
            current = (p) b.get(current);
        }
        return current;
    }

    public final void k(p next) {
        p pVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        do {
            pVar = (p) atomicReferenceFieldUpdater.get(next);
            if (l() != next) {
                return;
            }
        } while (!y1.b.a(b, next, pVar, this));
        if (r()) {
            next.i();
        }
    }

    @NotNull
    public final Object l() {
        return f29198a.get(this);
    }

    @NotNull
    public final p m() {
        p pVar;
        Object l10 = l();
        y yVar = l10 instanceof y ? (y) l10 : null;
        if (yVar != null && (pVar = yVar.ref) != null) {
            return pVar;
        }
        Intrinsics.d(l10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (p) l10;
    }

    @NotNull
    public final p n() {
        p i10 = i();
        return i10 == null ? j((p) b.get(this)) : i10;
    }

    public boolean r() {
        return l() instanceof y;
    }

    public boolean s() {
        return t() == null;
    }

    @Nullable
    public final p t() {
        Object l10;
        p pVar;
        do {
            l10 = l();
            if (l10 instanceof y) {
                return ((y) l10).ref;
            }
            if (l10 == this) {
                return (p) l10;
            }
            Intrinsics.d(l10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            pVar = (p) l10;
        } while (!y1.b.a(f29198a, this, l10, pVar.u()));
        pVar.i();
        return null;
    }

    @NotNull
    public String toString() {
        return new kotlin.jvm.internal.s(this) { // from class: pu.p.a
            @Override // gu.i
            public Object get() {
                return t0.a(this.receiver);
            }
        } + '@' + t0.b(this);
    }

    public final y u() {
        y yVar = (y) f29199c.get(this);
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(this);
        f29199c.set(this, yVar2);
        return yVar2;
    }
}

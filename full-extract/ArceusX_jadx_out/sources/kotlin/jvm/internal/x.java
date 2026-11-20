package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public abstract class x extends d implements gu.l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22978a;

    public x() {
        this.f22978a = false;
    }

    @Override // kotlin.jvm.internal.d
    public gu.b compute() {
        return this.f22978a ? this : super.compute();
    }

    @Override // kotlin.jvm.internal.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public gu.l getReflected() {
        if (this.f22978a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (gu.l) super.getReflected();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return getOwner().equals(xVar.getOwner()) && getName().equals(xVar.getName()) && getSignature().equals(xVar.getSignature()) && Intrinsics.c(getBoundReceiver(), xVar.getBoundReceiver());
        }
        if (obj instanceof gu.l) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        gu.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public x(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f22978a = (i10 & 2) == 2;
    }
}

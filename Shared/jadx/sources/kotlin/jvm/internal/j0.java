package kotlin.jvm.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001dB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0015*\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R \u0010\t\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b-\u0010)\u001a\u0004\b,\u0010\u0014R\u0014\u0010\r\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001c\u00103\u001a\u00020\u0015*\u0006\u0012\u0002\b\u0003008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lkotlin/jvm/internal/j0;", "Lgu/m;", "Lgu/e;", "classifier", "", "Lkotlin/reflect/KTypeProjection;", "arguments", "platformTypeUpperBound", "", "flags", "<init>", "(Lgu/e;Ljava/util/List;Lgu/m;I)V", "", "isMarkedNullable", "(Lgu/e;Ljava/util/List;Z)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "convertPrimitiveToWrapper", "h", "(Z)Ljava/lang/String;", "e", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/String;", ve.a.f33391e, "Lgu/e;", "()Lgu/e;", j6.b.f21518e, "Ljava/util/List;", "j", "()Ljava/util/List;", "c", "Lgu/m;", "getPlatformTypeUpperBound$kotlin_stdlib", "()Lgu/m;", "getPlatformTypeUpperBound$kotlin_stdlib$annotations", "()V", rl.d.f30696a, "I", "getFlags$kotlin_stdlib", "getFlags$kotlin_stdlib$annotations", "l", "()Z", "Ljava/lang/Class;", "k", "(Ljava/lang/Class;)Ljava/lang/String;", "arrayClassName", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class j0 implements gu.m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gu.e classifier;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<KTypeProjection> arguments;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final gu.m platformTypeUpperBound;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int flags;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22976a;

        static {
            int[] iArr = new int[gu.n.values().length];
            try {
                iArr[gu.n.f18858a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gu.n.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gu.n.f18859c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f22976a = iArr;
        }
    }

    public j0(@NotNull gu.e classifier, @NotNull List<KTypeProjection> arguments, @Nullable gu.m mVar, int i10) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.classifier = classifier;
        this.arguments = arguments;
        this.platformTypeUpperBound = mVar;
        this.flags = i10;
    }

    public static final CharSequence i(j0 j0Var, KTypeProjection it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return j0Var.e(it);
    }

    @Override // gu.m
    @NotNull
    /* renamed from: a, reason: from getter */
    public gu.e getClassifier() {
        return this.classifier;
    }

    public final String e(KTypeProjection kTypeProjection) {
        String valueOf;
        if (kTypeProjection.getVariance() == null) {
            return "*";
        }
        gu.m type = kTypeProjection.getType();
        j0 j0Var = type instanceof j0 ? (j0) type : null;
        if (j0Var == null || (valueOf = j0Var.h(true)) == null) {
            valueOf = String.valueOf(kTypeProjection.getType());
        }
        int i10 = b.f22976a[kTypeProjection.getVariance().ordinal()];
        if (i10 == 1) {
            return valueOf;
        }
        if (i10 == 2) {
            return "in " + valueOf;
        }
        if (i10 != 3) {
            throw new gt.l();
        }
        return "out " + valueOf;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) other;
        return Intrinsics.c(getClassifier(), j0Var.getClassifier()) && Intrinsics.c(j(), j0Var.j()) && Intrinsics.c(this.platformTypeUpperBound, j0Var.platformTypeUpperBound) && this.flags == j0Var.flags;
    }

    public final String h(boolean convertPrimitiveToWrapper) {
        String name;
        gu.e classifier = getClassifier();
        gu.c cVar = classifier instanceof gu.c ? (gu.c) classifier : null;
        Class<?> a10 = cVar != null ? xt.a.a(cVar) : null;
        if (a10 == null) {
            name = getClassifier().toString();
        } else if ((this.flags & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (a10.isArray()) {
            name = k(a10);
        } else if (convertPrimitiveToWrapper && a10.isPrimitive()) {
            gu.e classifier2 = getClassifier();
            Intrinsics.d(classifier2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = xt.a.b((gu.c) classifier2).getName();
        } else {
            name = a10.getName();
        }
        String str = name + (j().isEmpty() ? "" : CollectionsKt.m0(j(), ", ", "<", ">", 0, null, new Function1() { // from class: kotlin.jvm.internal.i0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence i10;
                i10 = j0.i(j0.this, (KTypeProjection) obj);
                return i10;
            }
        }, 24, null)) + (l() ? "?" : "");
        gu.m mVar = this.platformTypeUpperBound;
        if (!(mVar instanceof j0)) {
            return str;
        }
        String h10 = ((j0) mVar).h(true);
        if (Intrinsics.c(h10, str)) {
            return str;
        }
        if (Intrinsics.c(h10, str + '?')) {
            return str + '!';
        }
        return '(' + str + ".." + h10 + ')';
    }

    public int hashCode() {
        return (((getClassifier().hashCode() * 31) + j().hashCode()) * 31) + Integer.hashCode(this.flags);
    }

    @NotNull
    public List<KTypeProjection> j() {
        return this.arguments;
    }

    public final String k(Class<?> cls) {
        return Intrinsics.c(cls, boolean[].class) ? "kotlin.BooleanArray" : Intrinsics.c(cls, char[].class) ? "kotlin.CharArray" : Intrinsics.c(cls, byte[].class) ? "kotlin.ByteArray" : Intrinsics.c(cls, short[].class) ? "kotlin.ShortArray" : Intrinsics.c(cls, int[].class) ? "kotlin.IntArray" : Intrinsics.c(cls, float[].class) ? "kotlin.FloatArray" : Intrinsics.c(cls, long[].class) ? "kotlin.LongArray" : Intrinsics.c(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    public boolean l() {
        return (this.flags & 1) != 0;
    }

    @NotNull
    public String toString() {
        return h(false) + " (Kotlin reflection is not available)";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j0(@NotNull gu.e classifier, @NotNull List<KTypeProjection> arguments, boolean z10) {
        this(classifier, arguments, null, z10 ? 1 : 0);
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
    }
}

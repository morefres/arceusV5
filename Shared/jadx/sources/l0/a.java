package l0;

import g0.g2;
import g0.r1;
import g0.w2;
import j0.ResolvedFeatureGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p;
import kotlin.collections.r0;
import kotlin.jvm.internal.Intrinsics;
import l0.b;
import n0.o0;
import org.jetbrains.annotations.NotNull;
import rl.d;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006\u0019"}, d2 = {"Ll0/a;", "Ll0/c;", "Ln0/o0;", "cameraInfoInternal", "<init>", "(Ln0/o0;)V", "Lg0/g2;", "sessionConfig", "Ll0/b;", ve.a.f33391e, "(Lg0/g2;)Ll0/b;", "Li0/b;", "", "Lg0/w2;", "useCases", "Ll0/b$d;", d.f30696a, "(Li0/b;Ljava/util/List;)Ll0/b$d;", "orderedPreferredFeatures", "", "index", "currentOptionalFeatures", j6.b.f21518e, "(Lg0/g2;Ljava/util/List;ILjava/util/List;)Ll0/b;", "Ln0/o0;", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final o0 cameraInfoInternal;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23175a;

        static {
            int[] iArr = new int[k0.b.values().length];
            try {
                iArr[k0.b.f22178d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k0.b.f22176a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k0.b.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k0.b.f22177c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f23175a = iArr;
        }
    }

    public a(@NotNull o0 cameraInfoInternal) {
        Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
        this.cameraInfoInternal = cameraInfoInternal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ l0.b c(a aVar, g2 g2Var, List list, int i10, List list2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        if ((i11 & 8) != 0) {
            list2 = p.k();
        }
        return aVar.b(g2Var, list, i10, list2);
    }

    @Override // l0.c
    @NotNull
    public l0.b a(@NotNull g2 sessionConfig) {
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        List<w2> k10 = sessionConfig.k();
        Set<i0.b> h10 = sessionConfig.h();
        List<i0.b> g10 = sessionConfig.g();
        if (h10.isEmpty() && g10.isEmpty()) {
            throw new IllegalArgumentException("Must have at least one required or preferred feature");
        }
        for (w2 w2Var : k10) {
            if (j0.c.INSTANCE.b(w2Var) == j0.c.f21441h) {
                return new b.UnsupportedUseCase(w2Var);
            }
        }
        Iterator<T> it = h10.iterator();
        while (it.hasNext()) {
            b.UseCaseMissing d10 = d((i0.b) it.next(), k10);
            if (d10 != null) {
                return d10;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : g10) {
            b.UseCaseMissing d11 = d((i0.b) obj, k10);
            if (d11 != null) {
                r1.a("DefaultFeatureGroupResolver", "resolveFeatureGroup: filtered out preferred feature due to " + d11);
            } else {
                d11 = null;
            }
            if (d11 == null) {
                arrayList.add(obj);
            }
        }
        r1.a("DefaultFeatureGroupResolver", "resolveFeatureGroup: filteredPreferredFeatures = " + arrayList);
        return c(this, sessionConfig, arrayList, 0, null, 12, null);
    }

    public final l0.b b(g2 sessionConfig, List<? extends i0.b> orderedPreferredFeatures, int index, List<? extends i0.b> currentOptionalFeatures) {
        if (index < orderedPreferredFeatures.size()) {
            int i10 = index + 1;
            l0.b b10 = b(sessionConfig, orderedPreferredFeatures, i10, CollectionsKt.x0(currentOptionalFeatures, orderedPreferredFeatures.get(index)));
            return b10 instanceof b.Supported ? b10 : b(sessionConfig, orderedPreferredFeatures, i10, currentOptionalFeatures);
        }
        Set i11 = r0.i(sessionConfig.h(), currentOptionalFeatures);
        r1.a("DefaultFeatureGroupResolver", "getFeatureListResolvedByPriority: features = " + i11 + ", useCases = " + sessionConfig.k());
        return this.cameraInfoInternal.A(new ResolvedFeatureGroup(i11), sessionConfig) ? new b.Supported(new ResolvedFeatureGroup(i11)) : b.C0409b.f23177a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if (r2 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        if (r7 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        return new l0.b.UseCaseMissing(r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
    
        if (r3 == false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l0.b.UseCaseMissing d(i0.b r6, java.util.List<? extends g0.w2> r7) {
        /*
            r5 = this;
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r0 = r7 instanceof java.util.Collection
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L13
            r3 = r7
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L13
        L11:
            r3 = r2
            goto L28
        L13:
            java.util.Iterator r3 = r7.iterator()
        L17:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L11
            java.lang.Object r4 = r3.next()
            g0.w2 r4 = (g0.w2) r4
            boolean r4 = r4 instanceof g0.f1
            if (r4 == 0) goto L17
            r3 = r1
        L28:
            if (r0 == 0) goto L34
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L34
            goto L4f
        L34:
            java.util.Iterator r7 = r7.iterator()
        L38:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r7.next()
            g0.w2 r0 = (g0.w2) r0
            boolean r4 = r0 instanceof g0.a2
            if (r4 != 0) goto L4e
            boolean r0 = s0.f.e0(r0)
            if (r0 == 0) goto L38
        L4e:
            r2 = r1
        L4f:
            k0.b r7 = r6.getFeatureTypeInternal()
            int[] r0 = l0.a.b.f23175a
            int r7 = r7.ordinal()
            r7 = r0[r7]
            r0 = 0
            if (r7 == r1) goto L8b
            r1 = 2
            if (r7 == r1) goto L6e
            r1 = 3
            if (r7 == r1) goto L6e
            r1 = 4
            if (r7 != r1) goto L68
            goto L6e
        L68:
            gt.l r6 = new gt.l
            r6.<init>()
            throw r6
        L6e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            j0.c r1 = j0.c.f21437d
            r7.append(r1)
            java.lang.String r1 = " or "
            r7.append(r1)
            j0.c r1 = j0.c.f21439f
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            if (r2 != 0) goto L89
            goto L93
        L89:
            r7 = r0
            goto L93
        L8b:
            j0.c r7 = j0.c.f21438e
            java.lang.String r7 = r7.toString()
            if (r3 != 0) goto L89
        L93:
            if (r7 == 0) goto L9a
            l0.b$d r0 = new l0.b$d
            r0.<init>(r7, r6)
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.a.d(i0.b, java.util.List):l0.b$d");
    }
}

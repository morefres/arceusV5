package n0;

import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Ln0/y1;", "", "<init>", "()V", "Lg0/k0;", "dynamicRangeToTest", "", "fullySpecifiedDynamicRanges", "", "c", "(Lg0/k0;Ljava/util/Set;)Z", "underSpecifiedDynamicRange", "fullySpecifiedDynamicRange", rl.d.f30696a, "(Lg0/k0;Lg0/k0;)Z", ve.a.f33391e, j6.b.f21518e, "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final y1 f25668a = new y1();

    public static final boolean c(@NotNull g0.k0 dynamicRangeToTest, @NotNull Set<g0.k0> fullySpecifiedDynamicRanges) {
        Object obj;
        Intrinsics.checkNotNullParameter(dynamicRangeToTest, "dynamicRangeToTest");
        Intrinsics.checkNotNullParameter(fullySpecifiedDynamicRanges, "fullySpecifiedDynamicRanges");
        if (dynamicRangeToTest.e()) {
            return fullySpecifiedDynamicRanges.contains(dynamicRangeToTest);
        }
        Iterator<T> it = fullySpecifiedDynamicRanges.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (f25668a.d(dynamicRangeToTest, (g0.k0) obj)) {
                break;
            }
        }
        return obj != null;
    }

    public final boolean a(g0.k0 dynamicRangeToTest, g0.k0 fullySpecifiedDynamicRange) {
        x2.g.j(fullySpecifiedDynamicRange.e(), "Fully specified range is not actually fully specified.");
        return dynamicRangeToTest.a() == 0 || dynamicRangeToTest.a() == fullySpecifiedDynamicRange.a();
    }

    public final boolean b(g0.k0 dynamicRangeToTest, g0.k0 fullySpecifiedDynamicRange) {
        x2.g.j(fullySpecifiedDynamicRange.e(), "Fully specified range is not actually fully specified.");
        int b = dynamicRangeToTest.b();
        if (b == 0) {
            return true;
        }
        int b10 = fullySpecifiedDynamicRange.b();
        return (b == 2 && b10 != 1) || b == b10;
    }

    public final boolean d(g0.k0 underSpecifiedDynamicRange, g0.k0 fullySpecifiedDynamicRange) {
        return a(underSpecifiedDynamicRange, fullySpecifiedDynamicRange) && b(underSpecifiedDynamicRange, fullySpecifiedDynamicRange);
    }
}

package rq;

import gt.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrq/b;", "", ve.a.f33391e, "(Lrq/b;)Ljava/lang/String;", "shared_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30742a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f30739a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f30742a = iArr;
        }
    }

    @NotNull
    public static final String a(@NotNull b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int i10 = a.f30742a[bVar.ordinal()];
        if (i10 == 1) {
            return "rough";
        }
        if (i10 == 2) {
            return "precise";
        }
        throw new l();
    }
}

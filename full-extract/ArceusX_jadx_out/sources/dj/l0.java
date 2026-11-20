package dj;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ldj/l0;", "", "<init>", "()V", "", "Lv7/k;", "purchases", "", j6.b.f21518e, "(Ljava/util/List;)Ljava/lang/String;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l0 f14882a = new l0();

    @NotNull
    public static final String b(@NotNull List<? extends v7.k> purchases) {
        Intrinsics.checkNotNullParameter(purchases, "purchases");
        return CollectionsKt.m0(purchases, "; ", null, null, 0, null, new Function1() { // from class: dj.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence c10;
                c10 = l0.c((v7.k) obj);
                return c10;
            }
        }, 30, null);
    }

    public static final CharSequence c(v7.k it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String j10 = b.j(it);
        return j10 != null ? j10 : "";
    }
}

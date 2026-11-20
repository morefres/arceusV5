package cp;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sb.g;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f14144a;

    public b(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f14144a = function;
    }

    @Override // sb.g
    public final /* synthetic */ void onSuccess(Object obj) {
        this.f14144a.invoke(obj);
    }
}

package ep;

import com.withpersona.sdk2.inquiry.network.core.JsonAdapterBinding;
import java.util.Set;

/* loaded from: classes3.dex */
public final class k implements dt.d<Set<JsonAdapterBinding<?>>> {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final k f16153a = new k();
    }

    public static k a() {
        return a.f16153a;
    }

    public static Set<JsonAdapterBinding<?>> c() {
        return (Set) dt.h.e(com.withpersona.sdk2.inquiry.internal.network.f.g());
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<JsonAdapterBinding<?>> get() {
        return c();
    }
}

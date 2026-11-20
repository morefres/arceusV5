package bp;

import com.withpersona.sdk2.inquiry.FallbackMode;

/* loaded from: classes3.dex */
public final class e implements dt.d<FallbackMode> {

    /* renamed from: a, reason: collision with root package name */
    public final c f4325a;

    public e(c cVar) {
        this.f4325a = cVar;
    }

    public static e a(c cVar) {
        return new e(cVar);
    }

    public static FallbackMode b(c cVar) {
        return (FallbackMode) dt.h.e(cVar.getFallbackMode());
    }

    @Override // ft.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public FallbackMode get() {
        return b(this.f4325a);
    }
}

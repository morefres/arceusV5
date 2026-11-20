package oq;

import dt.d;
import dt.h;

/* loaded from: classes3.dex */
public final class b implements d<c> {

    /* renamed from: a, reason: collision with root package name */
    public final a f28110a;

    public b(a aVar) {
        this.f28110a = aVar;
    }

    public static b a(a aVar) {
        return new b(aVar);
    }

    public static c c(a aVar) {
        return (c) h.e(aVar.getSdkFilesManager());
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f28110a);
    }
}

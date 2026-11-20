package b8;

import java.util.Set;

/* loaded from: classes.dex */
public final class p implements y7.i {

    /* renamed from: a, reason: collision with root package name */
    public final Set<y7.c> f3906a;
    public final o b;

    /* renamed from: c, reason: collision with root package name */
    public final s f3907c;

    public p(Set<y7.c> set, o oVar, s sVar) {
        this.f3906a = set;
        this.b = oVar;
        this.f3907c = sVar;
    }

    @Override // y7.i
    public <T> y7.h<T> a(String str, Class<T> cls, y7.c cVar, y7.g<T, byte[]> gVar) {
        if (this.f3906a.contains(cVar)) {
            return new r(this.b, str, cVar, gVar, this.f3907c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, this.f3906a));
    }
}

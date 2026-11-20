package l9;

import androidx.annotation.NonNull;
import k9.a;
import k9.a.b;
import l9.k;

/* loaded from: classes.dex */
public abstract class w<A extends a.b, L> {

    /* renamed from: a, reason: collision with root package name */
    public final k.a f23390a;

    public w(@NonNull k.a<L> aVar) {
        this.f23390a = aVar;
    }

    @NonNull
    public k.a<L> a() {
        return this.f23390a;
    }

    public abstract void b(@NonNull A a10, @NonNull sb.k<Boolean> kVar);
}

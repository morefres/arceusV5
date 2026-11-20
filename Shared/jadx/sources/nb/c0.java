package nb;

import com.google.android.gms.measurement.internal.zzbe;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f26085a;
    public final /* synthetic */ zzbe b;

    public c0(zzbe zzbeVar) {
        Objects.requireNonNull(zzbeVar);
        this.b = zzbeVar;
        this.f26085a = zzbeVar.z3().keySet().iterator();
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.f26085a.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26085a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}

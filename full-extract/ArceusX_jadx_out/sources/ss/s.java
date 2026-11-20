package ss;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class s implements r {

    /* renamed from: a, reason: collision with root package name */
    public final Map<p, Object> f31676a = new HashMap(3);

    @Override // ss.r
    public <T> T a(@NonNull p<T> pVar) {
        return (T) this.f31676a.get(pVar);
    }

    @Override // ss.r
    public <T> void b(@NonNull p<T> pVar, T t8) {
        if (t8 == null) {
            this.f31676a.remove(pVar);
        } else {
            this.f31676a.put(pVar, t8);
        }
    }
}

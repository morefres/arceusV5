package ss;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ss.k;

/* loaded from: classes3.dex */
public class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class<? extends on.s>, t> f31665a;

    public static class a implements k.a {

        /* renamed from: a, reason: collision with root package name */
        public final Map<Class<? extends on.s>, t> f31666a = new HashMap(3);

        @Override // ss.k.a
        @NonNull
        public <N extends on.s> k.a a(@NonNull Class<N> cls, t tVar) {
            if (tVar == null) {
                this.f31666a.remove(cls);
                return this;
            }
            this.f31666a.put(cls, tVar);
            return this;
        }

        @Override // ss.k.a
        @NonNull
        public k build() {
            return new l(Collections.unmodifiableMap(this.f31666a));
        }
    }

    public l(@NonNull Map<Class<? extends on.s>, t> map) {
        this.f31665a = map;
    }

    @Override // ss.k
    public <N extends on.s> t a(@NonNull Class<N> cls) {
        return this.f31665a.get(cls);
    }
}

package ss;

import androidx.annotation.NonNull;
import ss.m;

/* loaded from: classes3.dex */
public abstract class n {

    public class a extends n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m.b f31667a;
        public final /* synthetic */ g b;

        public a(m.b bVar, g gVar) {
            this.f31667a = bVar;
            this.b = gVar;
        }

        @Override // ss.n
        @NonNull
        public m a() {
            return this.f31667a.a(this.b, new s());
        }
    }

    @NonNull
    public static n b(@NonNull m.b bVar, @NonNull g gVar) {
        return new a(bVar, gVar);
    }

    @NonNull
    public abstract m a();
}

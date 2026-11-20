package fg;

import com.google.firebase.messaging.i0;
import uf.d;

/* loaded from: classes2.dex */
public final class b {
    public static final b b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public final fg.a f17233a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public fg.a f17234a = null;

        public b a() {
            return new b(this.f17234a);
        }

        public a b(fg.a aVar) {
            this.f17234a = aVar;
            return this;
        }
    }

    public b(fg.a aVar) {
        this.f17233a = aVar;
    }

    public static a b() {
        return new a();
    }

    @d(tag = 1)
    public fg.a a() {
        return this.f17233a;
    }

    public byte[] c() {
        return i0.a(this);
    }
}

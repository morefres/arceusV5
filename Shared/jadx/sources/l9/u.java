package l9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import k9.a;
import k9.a.b;

/* loaded from: classes.dex */
public abstract class u<A extends a.b, ResultT> {

    /* renamed from: a, reason: collision with root package name */
    public final Feature[] f23380a;
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23381c;

    public static class a<A extends a.b, ResultT> {

        /* renamed from: a, reason: collision with root package name */
        public q f23382a;

        /* renamed from: c, reason: collision with root package name */
        public Feature[] f23383c;
        public boolean b = true;

        /* renamed from: d, reason: collision with root package name */
        public int f23384d = 0;

        public /* synthetic */ a(h1 h1Var) {
        }

        @NonNull
        public u<A, ResultT> a() {
            n9.m.b(this.f23382a != null, "execute parameter required");
            return new g1(this, this.f23383c, this.b, this.f23384d);
        }

        @NonNull
        public a<A, ResultT> b(@NonNull q<A, sb.k<ResultT>> qVar) {
            this.f23382a = qVar;
            return this;
        }

        @NonNull
        public a<A, ResultT> c(boolean z10) {
            this.b = z10;
            return this;
        }

        @NonNull
        public a<A, ResultT> d(@NonNull Feature... featureArr) {
            this.f23383c = featureArr;
            return this;
        }

        @NonNull
        public a<A, ResultT> e(int i10) {
            this.f23384d = i10;
            return this;
        }
    }

    public u(Feature[] featureArr, boolean z10, int i10) {
        this.f23380a = featureArr;
        boolean z11 = false;
        if (featureArr != null && z10) {
            z11 = true;
        }
        this.b = z11;
        this.f23381c = i10;
    }

    @NonNull
    public static <A extends a.b, ResultT> a<A, ResultT> c() {
        return new a<>(null);
    }

    public abstract void d(@NonNull A a10, @NonNull sb.k<ResultT> kVar);

    public boolean e() {
        return this.b;
    }

    public final int f() {
        return this.f23381c;
    }

    public final Feature[] g() {
        return this.f23380a;
    }
}

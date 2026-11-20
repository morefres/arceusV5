package l9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import k9.a;
import k9.a.b;
import l9.k;

/* loaded from: classes.dex */
public class p<A extends a.b, L> {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final o<A, L> f23356a;

    @NonNull
    public final w b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Runnable f23357c;

    public static class a<A extends a.b, L> {

        /* renamed from: a, reason: collision with root package name */
        public q f23358a;
        public q b;

        /* renamed from: d, reason: collision with root package name */
        public k f23360d;

        /* renamed from: e, reason: collision with root package name */
        public Feature[] f23361e;

        /* renamed from: g, reason: collision with root package name */
        public int f23363g;

        /* renamed from: c, reason: collision with root package name */
        public Runnable f23359c = new Runnable() { // from class: l9.x0
            @Override // java.lang.Runnable
            public final void run() {
            }
        };

        /* renamed from: f, reason: collision with root package name */
        public boolean f23362f = true;

        public /* synthetic */ a(a1 a1Var) {
        }

        @NonNull
        public p<A, L> a() {
            n9.m.b(this.f23358a != null, "Must set register function");
            n9.m.b(this.b != null, "Must set unregister function");
            n9.m.b(this.f23360d != null, "Must set holder");
            return new p<>(new y0(this, this.f23360d, this.f23361e, this.f23362f, this.f23363g), new z0(this, (k.a) n9.m.m(this.f23360d.b(), "Key must not be null")), this.f23359c, null);
        }

        @NonNull
        public a<A, L> b(@NonNull q<A, sb.k<Void>> qVar) {
            this.f23358a = qVar;
            return this;
        }

        @NonNull
        public a<A, L> c(boolean z10) {
            this.f23362f = z10;
            return this;
        }

        @NonNull
        public a<A, L> d(@NonNull Feature... featureArr) {
            this.f23361e = featureArr;
            return this;
        }

        @NonNull
        public a<A, L> e(int i10) {
            this.f23363g = i10;
            return this;
        }

        @NonNull
        public a<A, L> f(@NonNull q<A, sb.k<Boolean>> qVar) {
            this.b = qVar;
            return this;
        }

        @NonNull
        public a<A, L> g(@NonNull k<L> kVar) {
            this.f23360d = kVar;
            return this;
        }
    }

    public /* synthetic */ p(o oVar, w wVar, Runnable runnable, b1 b1Var) {
        this.f23356a = oVar;
        this.b = wVar;
        this.f23357c = runnable;
    }

    @NonNull
    public static <A extends a.b, L> a<A, L> a() {
        return new a<>(null);
    }
}

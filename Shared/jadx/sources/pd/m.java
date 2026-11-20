package pd;

import java.util.Date;
import pd.e;

/* loaded from: classes2.dex */
public final class m extends e.a {

    /* renamed from: a, reason: collision with root package name */
    public Integer f28578a;
    public Integer b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f28579c;

    /* renamed from: d, reason: collision with root package name */
    public Date f28580d;

    /* renamed from: e, reason: collision with root package name */
    public String f28581e;

    @Override // pd.e.a
    public final e a() {
        return new o(this.f28578a, this.b, this.f28579c, this.f28580d, this.f28581e, null);
    }

    @Override // pd.e.a
    public final e.a b(Integer num) {
        this.b = num;
        return this;
    }

    @Override // pd.e.a
    public final e.a c(Integer num) {
        this.f28579c = num;
        return this;
    }

    @Override // pd.e.a
    public final e.a d(String str) {
        this.f28581e = str;
        return this;
    }

    @Override // pd.e.a
    public final e.a e(Date date) {
        this.f28580d = date;
        return this;
    }

    @Override // pd.e.a
    public final e.a f(Integer num) {
        this.f28578a = num;
        return this;
    }
}

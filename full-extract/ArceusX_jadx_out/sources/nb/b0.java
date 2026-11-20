package nb;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26049a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26050c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26051d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26052e;

    /* renamed from: f, reason: collision with root package name */
    public final long f26053f;

    /* renamed from: g, reason: collision with root package name */
    public final long f26054g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f26055h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f26056i;

    /* renamed from: j, reason: collision with root package name */
    public final Long f26057j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f26058k;

    public b0(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        n9.m.f(str);
        n9.m.f(str2);
        n9.m.a(j10 >= 0);
        n9.m.a(j11 >= 0);
        n9.m.a(j12 >= 0);
        n9.m.a(j14 >= 0);
        this.f26049a = str;
        this.b = str2;
        this.f26050c = j10;
        this.f26051d = j11;
        this.f26052e = j12;
        this.f26053f = j13;
        this.f26054g = j14;
        this.f26055h = l10;
        this.f26056i = l11;
        this.f26057j = l12;
        this.f26058k = bool;
    }

    public final b0 a(long j10) {
        return new b0(this.f26049a, this.b, this.f26050c, this.f26051d, this.f26052e, j10, this.f26054g, this.f26055h, this.f26056i, this.f26057j, this.f26058k);
    }

    public final b0 b(long j10, long j11) {
        return new b0(this.f26049a, this.b, this.f26050c, this.f26051d, this.f26052e, this.f26053f, j10, Long.valueOf(j11), this.f26056i, this.f26057j, this.f26058k);
    }

    public final b0 c(Long l10, Long l11, Boolean bool) {
        return new b0(this.f26049a, this.b, this.f26050c, this.f26051d, this.f26052e, this.f26053f, this.f26054g, this.f26055h, l10, l11, bool);
    }
}

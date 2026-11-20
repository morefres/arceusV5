package n7;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final a f25864a;
    public final m7.h b;

    /* renamed from: c, reason: collision with root package name */
    public final m7.d f25865c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25866d;

    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public i(a aVar, m7.h hVar, m7.d dVar, boolean z10) {
        this.f25864a = aVar;
        this.b = hVar;
        this.f25865c = dVar;
        this.f25866d = z10;
    }

    public a a() {
        return this.f25864a;
    }

    public m7.h b() {
        return this.b;
    }

    public m7.d c() {
        return this.f25865c;
    }

    public boolean d() {
        return this.f25866d;
    }
}

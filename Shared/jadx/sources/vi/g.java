package vi;

/* loaded from: classes2.dex */
public class g extends i {

    /* renamed from: h, reason: collision with root package name */
    public int f33447h;

    public g(com.roblox.client.c cVar, String str) {
        super(cVar);
        this.f33447h = g(str);
    }

    @Override // vi.i, vi.f.e
    public int d() {
        return this.f33447h;
    }

    public final int g(String str) {
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "groups":
            case "group":
                return 5;
            case "player":
            case "players":
                return 1;
            default:
                return super.d();
        }
    }
}

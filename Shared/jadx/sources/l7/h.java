package l7;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f23272a;
    public final float b;

    /* renamed from: c, reason: collision with root package name */
    public final float f23273c;

    public h(String str, float f10, float f11) {
        this.f23272a = str;
        this.f23273c = f11;
        this.b = f10;
    }

    public boolean a(String str) {
        if (this.f23272a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f23272a.endsWith("\r")) {
            String str2 = this.f23272a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}

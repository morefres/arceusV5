package ln;

/* loaded from: classes3.dex */
public class a {
    public int b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f23550a = new StringBuilder();

    public void a(CharSequence charSequence) {
        if (this.b != 0) {
            this.f23550a.append('\n');
        }
        this.f23550a.append(charSequence);
        this.b++;
    }

    public String b() {
        return this.f23550a.toString();
    }
}

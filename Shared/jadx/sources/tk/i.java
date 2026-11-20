package tk;

import android.graphics.Point;
import java.util.Locale;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public int f32291a;
    public Point b;

    /* renamed from: c, reason: collision with root package name */
    public Point f32292c;

    /* renamed from: d, reason: collision with root package name */
    public Point f32293d;

    /* renamed from: e, reason: collision with root package name */
    public String f32294e;

    /* renamed from: f, reason: collision with root package name */
    public String f32295f;

    /* renamed from: g, reason: collision with root package name */
    public String f32296g;

    /* renamed from: h, reason: collision with root package name */
    public String f32297h;

    /* renamed from: i, reason: collision with root package name */
    public String f32298i;

    /* renamed from: j, reason: collision with root package name */
    public String f32299j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f32300k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f32301l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f32302m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f32303n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f32304o;

    public i a(String str) {
        this.f32295f = str;
        return this;
    }

    public i b(String str) {
        this.f32299j = str;
        return this;
    }

    public String c() {
        String h10 = h();
        Locale locale = Locale.ROOT;
        String str = this.f32299j;
        String format = String.format(locale, "Mozilla/5.0 (%dMB; %dx%d; %dx%d; %dx%d; %s; %s) %s (KHTML, like Gecko)  ROBLOX Android App %s %s Hybrid()%s  %s", Integer.valueOf(this.f32291a), Integer.valueOf(this.b.x), Integer.valueOf(this.b.y), Integer.valueOf(this.f32292c.x), Integer.valueOf(this.f32292c.y), Integer.valueOf(this.f32293d.x), Integer.valueOf(this.f32293d.y), o(this.f32294e), this.f32295f, this.f32296g, this.f32297h, h10, this.f32304o ? " AndroidPioneer" : "", String.format(locale, "%s RobloxApp/%s (%s; %s)", str, this.f32297h, this.f32298i, str));
        if (!this.f32301l) {
            return format;
        }
        return format + " ChromeOS";
    }

    public i d(String str) {
        this.f32294e = str;
        return this;
    }

    public i e(String str) {
        this.f32298i = str;
        return this;
    }

    public i f(Point point) {
        this.f32293d = point;
        return this;
    }

    public i g(Point point) {
        this.f32292c = point;
        return this;
    }

    public String h() {
        return this.f32302m ? "VR" : this.f32300k ? "Phone" : this.f32303n ? "TV" : "Tablet";
    }

    public i i(boolean z10) {
        this.f32301l = z10;
        return this;
    }

    public i j(boolean z10) {
        this.f32300k = z10;
        return this;
    }

    public i k(boolean z10) {
        this.f32304o = z10;
        return this;
    }

    public i l(boolean z10) {
        this.f32303n = z10;
        return this;
    }

    public i m(boolean z10) {
        this.f32302m = z10;
        return this;
    }

    public i n(int i10) {
        this.f32291a = i10;
        return this;
    }

    public String o(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt <= 31 || charAt >= 127) {
                sb2.append('_');
            } else {
                sb2.append(charAt);
            }
        }
        return sb2.toString();
    }

    public i p(Point point) {
        this.b = point;
        return this;
    }

    public i q(String str) {
        this.f32297h = str;
        return this;
    }

    public i r(String str) {
        this.f32296g = str;
        return this;
    }
}

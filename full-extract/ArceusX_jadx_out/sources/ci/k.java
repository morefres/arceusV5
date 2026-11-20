package ci;

import okhttp3.OkHttpClient;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public OkHttpClient f4958a;
    public int b = 5;

    /* renamed from: c, reason: collision with root package name */
    public int f4959c = 5;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final k f4960a = new k();
    }

    public static k a() {
        return a.f4960a;
    }

    public OkHttpClient b() {
        if (this.f4958a == null) {
            this.f4958a = new uk.c(null, this.b, this.f4959c, tk.g.e()).a();
        }
        return this.f4958a;
    }
}

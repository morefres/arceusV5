package xj;

import android.content.Context;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public Pattern f35596a;
    public final im.a b;

    public b(String str) {
        this.b = new im.a(str);
    }

    public void a(Context context, String str, String str2) {
        this.b.e(context, str, str2);
    }

    public boolean b(String str) {
        if (this.f35596a == null) {
            this.f35596a = Pattern.compile("(?:(?:http|https):\\/\\/)?(?:[^.]+\\.)?(?:facebook\\.com|twitter\\.com|twitch\\.tv|youtube\\.com|discord\\.gg)(?:\\/.*)?");
        }
        return this.f35596a.matcher(str).matches();
    }
}

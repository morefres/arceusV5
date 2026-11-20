package mg;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f24500a = Charset.defaultCharset();
    public static final Charset b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f24501c;

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f24502d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f24503e;

    static {
        Charset charset;
        Charset charset2;
        Charset charset3 = null;
        try {
            charset = Charset.forName("SJIS");
        } catch (UnsupportedCharsetException unused) {
            charset = null;
        }
        b = charset;
        try {
            charset2 = Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
            charset2 = null;
        }
        f24501c = charset2;
        try {
            charset3 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        f24502d = charset3;
        Charset charset4 = b;
        f24503e = (charset4 != null && charset4.equals(f24500a)) || (charset3 != null && charset3.equals(f24500a));
    }
}

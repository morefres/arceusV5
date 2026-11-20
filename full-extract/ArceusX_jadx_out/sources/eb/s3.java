package eb;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class s3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f15909a = Charset.forName("US-ASCII");
    public static final Charset b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f15910c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f15911d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f15912e;

    /* renamed from: f, reason: collision with root package name */
    public static final r3 f15913f;

    static {
        byte[] bArr = new byte[0];
        f15911d = bArr;
        f15912e = ByteBuffer.wrap(bArr);
        int i10 = r3.f15889a;
        o3 o3Var = new o3(bArr, 0, 0, false, null);
        o3Var.a(0);
        f15913f = o3Var;
    }
}

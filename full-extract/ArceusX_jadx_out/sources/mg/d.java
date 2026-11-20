package mg;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final List<CharsetEncoder> f24498c = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final CharsetEncoder[] f24499a;
    public final int b;

    static {
        String[] strArr = {"IBM437", "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-10", "ISO-8859-11", "ISO-8859-13", "ISO-8859-14", "ISO-8859-15", "ISO-8859-16", "windows-1250", "windows-1251", "windows-1252", "windows-1256", "Shift_JIS"};
        for (int i10 = 0; i10 < 20; i10++) {
            String str = strArr[i10];
            if (c.b(str) != null) {
                try {
                    f24498c.add(Charset.forName(str).newEncoder());
                } catch (UnsupportedCharsetException unused) {
                }
            }
        }
    }

    public d(String str, Charset charset, int i10) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StandardCharsets.ISO_8859_1.newEncoder());
        int i11 = 0;
        boolean z11 = charset != null && charset.name().startsWith("UTF");
        for (int i12 = 0; i12 < str.length(); i12++) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                CharsetEncoder charsetEncoder = (CharsetEncoder) obj;
                char charAt = str.charAt(i12);
                if (charAt == i10 || charsetEncoder.canEncode(charAt)) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
            if (!z10) {
                Iterator<CharsetEncoder> it = f24498c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    CharsetEncoder next = it.next();
                    if (next.canEncode(str.charAt(i12))) {
                        arrayList.add(next);
                        z10 = true;
                        break;
                    }
                }
            }
            if (!z10) {
                z11 = true;
            }
        }
        if (arrayList.size() != 1 || z11) {
            this.f24499a = new CharsetEncoder[arrayList.size() + 2];
            int size2 = arrayList.size();
            int i14 = 0;
            int i15 = 0;
            while (i15 < size2) {
                Object obj2 = arrayList.get(i15);
                i15++;
                this.f24499a[i14] = (CharsetEncoder) obj2;
                i14++;
            }
            this.f24499a[i14] = StandardCharsets.UTF_8.newEncoder();
            this.f24499a[i14 + 1] = StandardCharsets.UTF_16BE.newEncoder();
        } else {
            this.f24499a = new CharsetEncoder[]{(CharsetEncoder) arrayList.get(0)};
        }
        if (charset != null) {
            while (true) {
                CharsetEncoder[] charsetEncoderArr = this.f24499a;
                if (i11 >= charsetEncoderArr.length) {
                    break;
                }
                if (charsetEncoderArr[i11] != null && charset.name().equals(this.f24499a[i11].charset().name())) {
                    break;
                } else {
                    i11++;
                }
            }
            this.b = i11;
        }
        i11 = -1;
        this.b = i11;
    }

    public boolean a(char c10, int i10) {
        return this.f24499a[i10].canEncode("" + c10);
    }

    public byte[] b(String str, int i10) {
        return str.getBytes(this.f24499a[i10].charset());
    }

    public Charset c(int i10) {
        return this.f24499a[i10].charset();
    }

    public int d(int i10) {
        return c.a(this.f24499a[i10].charset()).c();
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.f24499a.length;
    }
}

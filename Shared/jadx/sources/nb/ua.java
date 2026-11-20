package nb;

import java.net.URL;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ua implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final URL f26713a;
    public final byte[] b;

    /* renamed from: c, reason: collision with root package name */
    public final sa f26714c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26715d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f26716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ va f26717f;

    public ua(va vaVar, String str, URL url, byte[] bArr, Map map, sa saVar) {
        Objects.requireNonNull(vaVar);
        this.f26717f = vaVar;
        n9.m.f(str);
        n9.m.l(url);
        n9.m.l(saVar);
        this.f26713a = url;
        this.b = bArr;
        this.f26714c = saVar;
        this.f26715d = str;
        this.f26716e = map;
    }

    public final /* synthetic */ void a(int i10, Exception exc, byte[] bArr, Map map) {
        this.f26714c.a(this.f26715d, i10, exc, bArr, map);
    }

    public final void b(final int i10, final Exception exc, final byte[] bArr, final Map map) {
        this.f26717f.f26328a.b().t(new Runnable() { // from class: nb.ta
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                ua.this.a(i10, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.OutputStream] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.ua.run():void");
    }
}

package p0;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.Map;
import p0.i;

/* loaded from: classes.dex */
public final class j extends FilterOutputStream {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f28235g = "Exif\u0000\u0000".getBytes(h.f28207e);

    /* renamed from: a, reason: collision with root package name */
    public final i f28236a;
    public final byte[] b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f28237c;

    /* renamed from: d, reason: collision with root package name */
    public int f28238d;

    /* renamed from: e, reason: collision with root package name */
    public int f28239e;

    /* renamed from: f, reason: collision with root package name */
    public int f28240f;

    public static final class a {
        public static boolean a(short s8) {
            return (s8 < -64 || s8 > -49 || s8 == -60 || s8 == -56 || s8 == -52) ? false : true;
        }
    }

    public j(OutputStream outputStream, i iVar) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.b = new byte[1];
        this.f28237c = ByteBuffer.allocate(4);
        this.f28238d = 0;
        this.f28236a = iVar;
    }

    public final int a(int i10, byte[] bArr, int i11, int i12) {
        int min = Math.min(i12, i10 - this.f28237c.position());
        this.f28237c.put(bArr, i11, min);
        return min;
    }

    public final void b(b bVar) {
        k[][] kVarArr = i.f28220i;
        int[] iArr = new int[kVarArr.length];
        int[] iArr2 = new int[kVarArr.length];
        for (k kVar : i.f28218g) {
            for (int i10 = 0; i10 < i.f28220i.length; i10++) {
                this.f28236a.d(i10).remove(kVar.b);
            }
        }
        if (!this.f28236a.d(1).isEmpty()) {
            this.f28236a.d(0).put(i.f28218g[1].b, h.f(0L, this.f28236a.e()));
        }
        if (!this.f28236a.d(2).isEmpty()) {
            this.f28236a.d(0).put(i.f28218g[2].b, h.f(0L, this.f28236a.e()));
        }
        if (!this.f28236a.d(3).isEmpty()) {
            this.f28236a.d(1).put(i.f28218g[3].b, h.f(0L, this.f28236a.e()));
        }
        for (int i11 = 0; i11 < i.f28220i.length; i11++) {
            Iterator<Map.Entry<String, h>> it = this.f28236a.d(i11).entrySet().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                int j10 = it.next().getValue().j();
                if (j10 > 4) {
                    i12 += j10;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int i13 = 8;
        for (int i14 = 0; i14 < i.f28220i.length; i14++) {
            if (!this.f28236a.d(i14).isEmpty()) {
                iArr[i14] = i13;
                i13 += (this.f28236a.d(i14).size() * 12) + 6 + iArr2[i14];
            }
        }
        int i15 = i13 + 8;
        if (!this.f28236a.d(1).isEmpty()) {
            this.f28236a.d(0).put(i.f28218g[1].b, h.f(iArr[1], this.f28236a.e()));
        }
        if (!this.f28236a.d(2).isEmpty()) {
            this.f28236a.d(0).put(i.f28218g[2].b, h.f(iArr[2], this.f28236a.e()));
        }
        if (!this.f28236a.d(3).isEmpty()) {
            this.f28236a.d(1).put(i.f28218g[3].b, h.f(iArr[3], this.f28236a.e()));
        }
        bVar.f(i15);
        bVar.write(f28235g);
        bVar.d(this.f28236a.e() == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        bVar.a(this.f28236a.e());
        bVar.f(42);
        bVar.e(8L);
        for (int i16 = 0; i16 < i.f28220i.length; i16++) {
            if (!this.f28236a.d(i16).isEmpty()) {
                bVar.f(this.f28236a.d(i16).size());
                int size = iArr[i16] + 2 + (this.f28236a.d(i16).size() * 12) + 4;
                for (Map.Entry<String, h> entry : this.f28236a.d(i16).entrySet()) {
                    int i17 = ((k) x2.g.h(i.b.f28228f.get(i16).get(entry.getKey()), "Tag not supported: " + entry.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.")).f28241a;
                    h value = entry.getValue();
                    int j11 = value.j();
                    bVar.f(i17);
                    bVar.f(value.f28211a);
                    bVar.c(value.b);
                    if (j11 > 4) {
                        bVar.e(size);
                        size += j11;
                    } else {
                        bVar.write(value.f28213d);
                        if (j11 < 4) {
                            while (j11 < 4) {
                                bVar.b(0);
                                j11++;
                            }
                        }
                    }
                }
                bVar.e(0L);
                Iterator<Map.Entry<String, h>> it2 = this.f28236a.d(i16).entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f28213d;
                    if (bArr.length > 4) {
                        bVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        bVar.a(ByteOrder.BIG_ENDIAN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x010f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0108, code lost:
    
        if (r9 <= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x010a, code lost:
    
        ((java.io.FilterOutputStream) r6).out.write(r7, r8, r9);
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(byte[] r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.j.write(byte[], int, int):void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) {
        byte[] bArr = this.b;
        bArr[0] = (byte) (i10 & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}

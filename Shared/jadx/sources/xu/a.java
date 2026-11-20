package xu;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wu.e;
import wu.f0;
import wu.m0;
import wu.v0;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\b\u0003\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0014\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001aA\u0010\u001d\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010!\u001a\u00020\u001f*\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"\"\u001a\u0010'\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010)¨\u0006+"}, d2 = {"Lwu/m0;", "segment", "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "g", "(Lwu/m0;I[BII)Z", "Lwu/e;", "", "newline", "", "h", "(Lwu/e;J)Ljava/lang/String;", "Lwu/f0;", "options", "selectTruncated", "i", "(Lwu/e;Lwu/f0;Z)I", "v", "e", "(J)I", "Lwu/h;", "fromIndex", "toIndex", "byteCount", j6.b.f21518e, "(Lwu/e;Lwu/h;JJII)J", "Lwu/e$a;", "unsafeCursor", rl.d.f30696a, "(Lwu/e;Lwu/e$a;)Lwu/e$a;", ve.a.f33391e, "[B", "f", "()[B", "HEX_DIGIT_BYTES", "", "[J", "DigitCountToLargestValue", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final byte[] f36104a = v0.a("0123456789abcdef");

    @NotNull
    public static final long[] b = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    public static final long b(@NotNull wu.e eVar, @NotNull wu.h bytes, long j10, long j11, int i10, int i11) {
        m0 m0Var;
        int i12;
        long j12 = j10;
        long j13 = j11;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        long j14 = i11;
        wu.b.b(bytes.I(), i10, j14);
        if (i11 <= 0) {
            throw new IllegalArgumentException("byteCount == 0");
        }
        long j15 = 0;
        if (j12 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j12).toString());
        }
        if (j12 > j13) {
            throw new IllegalArgumentException(("fromIndex > toIndex: " + j12 + " > " + j13).toString());
        }
        if (j13 > eVar.getSize()) {
            j13 = eVar.getSize();
        }
        long j16 = -1;
        if (j12 == j13 || (m0Var = eVar.head) == null) {
            return -1L;
        }
        if (eVar.getSize() - j12 >= j12) {
            while (true) {
                long j17 = (m0Var.limit - m0Var.pos) + j15;
                if (j17 > j12) {
                    break;
                }
                m0Var = m0Var.next;
                Intrinsics.checkNotNull(m0Var);
                j15 = j17;
            }
            byte[] w5 = bytes.w();
            byte b10 = w5[i10];
            long min = Math.min(j13, (eVar.getSize() - j14) + 1);
            while (j15 < min) {
                byte[] bArr = m0Var.data;
                int min2 = (int) Math.min(m0Var.limit, (m0Var.pos + min) - j15);
                i12 = (int) ((m0Var.pos + j12) - j15);
                while (i12 < min2) {
                    if (bArr[i12] != b10 || !g(m0Var, i12 + 1, w5, i10 + 1, i11)) {
                        i12++;
                    }
                }
                j15 += m0Var.limit - m0Var.pos;
                m0Var = m0Var.next;
                Intrinsics.checkNotNull(m0Var);
                j12 = j15;
            }
            return -1L;
        }
        j15 = eVar.getSize();
        while (j15 > j12) {
            m0Var = m0Var.prev;
            Intrinsics.checkNotNull(m0Var);
            j15 -= m0Var.limit - m0Var.pos;
            j16 = j16;
        }
        long j18 = j16;
        byte[] w10 = bytes.w();
        byte b11 = w10[i10];
        long min3 = Math.min(j13, (eVar.getSize() - j14) + 1);
        while (j15 < min3) {
            byte[] bArr2 = m0Var.data;
            int min4 = (int) Math.min(m0Var.limit, (m0Var.pos + min3) - j15);
            i12 = (int) ((m0Var.pos + j12) - j15);
            while (i12 < min4) {
                if (bArr2[i12] != b11 || !g(m0Var, i12 + 1, w10, i10 + 1, i11)) {
                    i12++;
                }
            }
            j15 += m0Var.limit - m0Var.pos;
            m0Var = m0Var.next;
            Intrinsics.checkNotNull(m0Var);
            j12 = j15;
        }
        return j18;
        return (i12 - m0Var.pos) + j15;
    }

    public static /* synthetic */ long c(wu.e eVar, wu.h hVar, long j10, long j11, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            j11 = Long.MAX_VALUE;
        }
        return b(eVar, hVar, j10, j11, (i12 & 8) != 0 ? 0 : i10, (i12 & 16) != 0 ? hVar.I() : i11);
    }

    @NotNull
    public static final e.a d(@NotNull wu.e eVar, @NotNull e.a unsafeCursor) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        e.a g10 = wu.b.g(unsafeCursor);
        if (g10.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        g10.buffer = eVar;
        g10.readWrite = true;
        return g10;
    }

    public static final int e(long j10) {
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j10)) * 10) >>> 5;
        return numberOfLeadingZeros + (j10 > b[numberOfLeadingZeros] ? 1 : 0);
    }

    @NotNull
    public static final byte[] f() {
        return f36104a;
    }

    public static final boolean g(@NotNull m0 segment, int i10, @NotNull byte[] bytes, int i11, int i12) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i13 = segment.limit;
        byte[] bArr = segment.data;
        while (i11 < i12) {
            if (i10 == i13) {
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i10 = segment.pos;
                i13 = segment.limit;
            }
            if (bArr[i10] != bytes[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    @NotNull
    public static final String h(@NotNull wu.e eVar, long j10) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (eVar.j(j11) == 13) {
                String E1 = eVar.E1(j11);
                eVar.skip(2L);
                return E1;
            }
        }
        String E12 = eVar.E1(j10);
        eVar.skip(1L);
        return E12;
    }

    public static final int i(@NotNull wu.e eVar, @NotNull f0 options, boolean z10) {
        int i10;
        int i11;
        m0 m0Var;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        m0 m0Var2 = eVar.head;
        if (m0Var2 == null) {
            return z10 ? -2 : -1;
        }
        byte[] bArr = m0Var2.data;
        int i14 = m0Var2.pos;
        int i15 = m0Var2.limit;
        int[] trie = options.getTrie();
        m0 m0Var3 = m0Var2;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int i19 = trie[i17];
            int i20 = i17 + 2;
            int i21 = trie[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (m0Var3 == null) {
                break;
            }
            if (i19 >= 0) {
                i10 = i14 + 1;
                int i22 = bArr[i14] & 255;
                int i23 = i20 + i19;
                while (i20 != i23) {
                    if (i22 == trie[i20]) {
                        i11 = trie[i20 + i19];
                        if (i10 == i15) {
                            m0Var3 = m0Var3.next;
                            Intrinsics.checkNotNull(m0Var3);
                            i10 = m0Var3.pos;
                            bArr = m0Var3.data;
                            i15 = m0Var3.limit;
                            if (m0Var3 == m0Var2) {
                                m0Var3 = null;
                            }
                        }
                        if (i11 >= 0) {
                            return i11;
                        }
                        i17 = -i11;
                        i14 = i10;
                    } else {
                        i20++;
                    }
                }
                break loop0;
            }
            int i24 = i20 + (i19 * (-1));
            while (true) {
                int i25 = i14 + 1;
                int i26 = i20 + 1;
                if ((bArr[i14] & 255) != trie[i20]) {
                    break loop0;
                }
                boolean z11 = i26 == i24;
                if (i25 == i15) {
                    Intrinsics.checkNotNull(m0Var3);
                    m0 m0Var4 = m0Var3.next;
                    Intrinsics.checkNotNull(m0Var4);
                    i13 = m0Var4.pos;
                    byte[] bArr2 = m0Var4.data;
                    i12 = m0Var4.limit;
                    if (m0Var4 != m0Var2) {
                        m0Var = m0Var4;
                        bArr = bArr2;
                    } else {
                        if (!z11) {
                            break loop0;
                        }
                        bArr = bArr2;
                        m0Var = null;
                    }
                } else {
                    m0Var = m0Var3;
                    i12 = i15;
                    i13 = i25;
                }
                if (z11) {
                    i11 = trie[i26];
                    i10 = i13;
                    i15 = i12;
                    m0Var3 = m0Var;
                    break;
                }
                i14 = i13;
                i15 = i12;
                m0Var3 = m0Var;
                i20 = i26;
            }
        }
        if (z10) {
            return -2;
        }
        return i16;
    }

    public static /* synthetic */ int j(wu.e eVar, f0 f0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return i(eVar, f0Var, z10);
    }
}

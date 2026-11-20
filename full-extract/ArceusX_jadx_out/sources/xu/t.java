package xu;

import backtraceio.library.services.BacktraceMetrics;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.y;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.x;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wu.h0;
import wu.u0;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0005*\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0017\u001a\u00020\u0013*\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010\u001f\u001a\u00020\u001d*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010!\u001a\u00020\u001d*\u00020\u0010H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010$\u001a\u00020\u0005*\u00020\u00102\u0006\u0010#\u001a\u00020\u0005H\u0000¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010&\u001a\u0004\u0018\u00010\u0005*\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b&\u0010%\u001a\u0017\u0010(\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u001cH\u0000¢\u0006\u0004\b(\u0010)\u001a!\u0010,\u001a\u0004\u0018\u00010\u001c2\u0006\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0019H\u0000¢\u0006\u0004\b,\u0010-\"\u0018\u00101\u001a\u00020.*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lwu/h0;", "zipPath", "Lwu/l;", "fileSystem", "Lkotlin/Function1;", "Lxu/o;", "", "predicate", "Lwu/u0;", "i", "(Lwu/h0;Lwu/l;Lkotlin/jvm/functions/Function1;)Lwu/u0;", "", "entries", "", "e", "(Ljava/util/List;)Ljava/util/Map;", "Lwu/g;", "l", "(Lwu/g;)Lxu/o;", "Lxu/i;", "o", "(Lwu/g;)Lxu/i;", "regularRecord", zl.t.f38095d, "(Lwu/g;Lxu/i;)Lxu/i;", "", "extraSize", "Lkotlin/Function2;", "", "", "block", "p", "(Lwu/g;ILkotlin/jvm/functions/Function2;)V", "u", "(Lwu/g;)V", "centralDirectoryZipEntry", "q", "(Lwu/g;Lxu/o;)Lxu/o;", "r", "filetime", "g", "(J)J", InquiryField.DateField.TYPE, "time", "f", "(II)Ljava/lang/Long;", "", "h", "(I)Ljava/lang/String;", "hex", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class t {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return kt.a.a(((o) t8).getCanonicalPath(), ((o) t10).getCanonicalPath());
        }
    }

    public static final Map<h0, o> e(List<o> list) {
        h0 e10 = h0.Companion.e(h0.INSTANCE, "/", false, 1, null);
        Map<h0, o> n10 = k0.n(gt.s.a(e10, new o(e10, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
        for (o oVar : CollectionsKt.F0(list, new a())) {
            if (n10.put(oVar.getCanonicalPath(), oVar) == null) {
                while (true) {
                    h0 j10 = oVar.getCanonicalPath().j();
                    if (j10 != null) {
                        o oVar2 = n10.get(j10);
                        if (oVar2 != null) {
                            oVar2.c().add(oVar.getCanonicalPath());
                            break;
                        }
                        o oVar3 = new o(j10, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                        n10.put(j10, oVar3);
                        oVar3.c().add(oVar.getCanonicalPath());
                        oVar = oVar3;
                    }
                }
            }
        }
        return n10;
    }

    @Nullable
    public static final Long f(int i10, int i11) {
        if (i11 == -1) {
            return null;
        }
        return Long.valueOf(w.a(((i10 >> 9) & 127) + 1980, (i10 >> 5) & 15, i10 & 31, (i11 >> 11) & 31, (i11 >> 5) & 63, (i11 & 31) << 1));
    }

    public static final long g(long j10) {
        return (j10 / BacktraceMetrics.defaultTimeBetweenRetriesMs) - 11644473600000L;
    }

    public static final String h(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("0x");
        String num = Integer.toString(i10, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
        sb2.append(num);
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010b A[Catch: all -> 0x0103, TryCatch #1 {all -> 0x0103, blocks: (B:3:0x0019, B:5:0x0027, B:6:0x0030, B:19:0x004e, B:21:0x005a, B:60:0x010b, B:65:0x00ff, B:77:0x010c, B:97:0x016e, B:104:0x017f, B:118:0x0168, B:10:0x0182, B:14:0x018e, B:15:0x0195, B:122:0x0196, B:123:0x0199, B:124:0x019a, B:125:0x01b4, B:8:0x0038, B:18:0x0041, B:79:0x011d, B:82:0x0125, B:84:0x0135, B:86:0x0141, B:88:0x0148, B:91:0x014c, B:92:0x0153, B:94:0x0154, B:115:0x0161, B:62:0x00f8), top: B:2:0x0019, inners: #0, #2, #3, #12 }] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final wu.u0 i(@org.jetbrains.annotations.NotNull wu.h0 r18, @org.jetbrains.annotations.NotNull wu.l r19, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super xu.o, java.lang.Boolean> r20) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xu.t.i(wu.h0, wu.l, kotlin.jvm.functions.Function1):wu.u0");
    }

    public static /* synthetic */ u0 j(h0 h0Var, wu.l lVar, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = new Function1() { // from class: xu.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    boolean k10;
                    k10 = t.k((o) obj2);
                    return Boolean.valueOf(k10);
                }
            };
        }
        return i(h0Var, lVar, function1);
    }

    public static final boolean k(o it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final o l(@NotNull final wu.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        int M2 = gVar.M2();
        if (M2 != 33639248) {
            throw new IOException("bad zip: expected " + h(33639248) + " but was " + h(M2));
        }
        gVar.skip(4L);
        short i12 = gVar.i1();
        int i10 = i12 & 65535;
        if ((i12 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + h(i10));
        }
        int i13 = gVar.i1() & 65535;
        int i14 = gVar.i1() & 65535;
        int i15 = gVar.i1() & 65535;
        long M22 = gVar.M2() & 4294967295L;
        final b0 b0Var = new b0();
        b0Var.f22962a = gVar.M2() & 4294967295L;
        final b0 b0Var2 = new b0();
        b0Var2.f22962a = gVar.M2() & 4294967295L;
        int i16 = gVar.i1() & 65535;
        int i17 = gVar.i1() & 65535;
        int i18 = gVar.i1() & 65535;
        gVar.skip(8L);
        final b0 b0Var3 = new b0();
        b0Var3.f22962a = gVar.M2() & 4294967295L;
        String E1 = gVar.E1(i16);
        if (StringsKt.Z(E1, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j10 = b0Var2.f22962a == 4294967295L ? 8 : 0L;
        if (b0Var.f22962a == 4294967295L) {
            j10 += 8;
        }
        if (b0Var3.f22962a == 4294967295L) {
            j10 += 8;
        }
        final long j11 = j10;
        final c0 c0Var = new c0();
        final c0 c0Var2 = new c0();
        final c0 c0Var3 = new c0();
        final y yVar = new y();
        p(gVar, i17, new Function2() { // from class: xu.r
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit m10;
                m10 = t.m(y.this, j11, b0Var2, gVar, b0Var, b0Var3, c0Var, c0Var2, c0Var3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
                return m10;
            }
        });
        if (j11 <= 0 || yVar.f22979a) {
            return new o(h0.Companion.e(h0.INSTANCE, "/", false, 1, null).n(E1), x.D(E1, "/", false, 2, null), gVar.E1(i18), M22, b0Var.f22962a, b0Var2.f22962a, i13, b0Var3.f22962a, i15, i14, (Long) c0Var.f22963a, (Long) c0Var2.f22963a, (Long) c0Var3.f22963a, null, null, null, 57344, null);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    public static final Unit m(y yVar, long j10, b0 b0Var, final wu.g gVar, b0 b0Var2, b0 b0Var3, final c0 c0Var, final c0 c0Var2, final c0 c0Var3, int i10, long j11) {
        if (i10 != 1) {
            if (i10 == 10) {
                if (j11 < 4) {
                    throw new IOException("bad zip: NTFS extra too short");
                }
                gVar.skip(4L);
                p(gVar, (int) (j11 - 4), new Function2() { // from class: xu.s
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit n10;
                        n10 = t.n(c0.this, gVar, c0Var2, c0Var3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
                        return n10;
                    }
                });
            }
        } else {
            if (yVar.f22979a) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            yVar.f22979a = true;
            if (j11 < j10) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            long j12 = b0Var.f22962a;
            if (j12 == 4294967295L) {
                j12 = gVar.l1();
            }
            b0Var.f22962a = j12;
            b0Var2.f22962a = b0Var2.f22962a == 4294967295L ? gVar.l1() : 0L;
            b0Var3.f22962a = b0Var3.f22962a == 4294967295L ? gVar.l1() : 0L;
        }
        return Unit.f22894a;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Long] */
    public static final Unit n(c0 c0Var, wu.g gVar, c0 c0Var2, c0 c0Var3, int i10, long j10) {
        if (i10 == 1) {
            if (c0Var.f22963a != 0) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
            }
            if (j10 != 24) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
            }
            c0Var.f22963a = Long.valueOf(gVar.l1());
            c0Var2.f22963a = Long.valueOf(gVar.l1());
            c0Var3.f22963a = Long.valueOf(gVar.l1());
        }
        return Unit.f22894a;
    }

    public static final i o(wu.g gVar) {
        int i12 = gVar.i1() & 65535;
        int i13 = gVar.i1() & 65535;
        long i14 = gVar.i1() & 65535;
        if (i14 != (gVar.i1() & 65535) || i12 != 0 || i13 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        gVar.skip(4L);
        return new i(i14, 4294967295L & gVar.M2(), gVar.i1() & 65535);
    }

    public static final void p(wu.g gVar, int i10, Function2<? super Integer, ? super Long, Unit> function2) {
        long j10 = i10;
        while (j10 != 0) {
            if (j10 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int i12 = gVar.i1() & 65535;
            long i13 = gVar.i1() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j11 = j10 - 4;
            if (j11 < i13) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            gVar.v1(i13);
            long size = gVar.getBufferField().getSize();
            function2.invoke(Integer.valueOf(i12), Long.valueOf(i13));
            long size2 = (gVar.getBufferField().getSize() + i13) - size;
            if (size2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + i12);
            }
            if (size2 > 0) {
                gVar.getBufferField().skip(size2);
            }
            j10 = j11 - i13;
        }
    }

    @NotNull
    public static final o q(@NotNull wu.g gVar, @NotNull o centralDirectoryZipEntry) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(centralDirectoryZipEntry, "centralDirectoryZipEntry");
        o r8 = r(gVar, centralDirectoryZipEntry);
        Intrinsics.checkNotNull(r8);
        return r8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final o r(final wu.g gVar, o oVar) {
        int M2 = gVar.M2();
        if (M2 != 67324752) {
            throw new IOException("bad zip: expected " + h(67324752) + " but was " + h(M2));
        }
        gVar.skip(2L);
        short i12 = gVar.i1();
        int i10 = i12 & 65535;
        if ((i12 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + h(i10));
        }
        gVar.skip(18L);
        long i13 = gVar.i1() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int i14 = gVar.i1() & 65535;
        gVar.skip(i13);
        if (oVar == null) {
            gVar.skip(i14);
            return null;
        }
        final c0 c0Var = new c0();
        final c0 c0Var2 = new c0();
        final c0 c0Var3 = new c0();
        p(gVar, i14, new Function2() { // from class: xu.q
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit s8;
                s8 = t.s(wu.g.this, c0Var, c0Var2, c0Var3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
                return s8;
            }
        });
        return oVar.a((Integer) c0Var.f22963a, (Integer) c0Var2.f22963a, (Integer) c0Var3.f22963a);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v6, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v5, types: [T, java.lang.Integer] */
    public static final Unit s(wu.g gVar, c0 c0Var, c0 c0Var2, c0 c0Var3, int i10, long j10) {
        if (i10 == 21589) {
            if (j10 < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            byte readByte = gVar.readByte();
            boolean z10 = (readByte & 1) == 1;
            boolean z11 = (readByte & 2) == 2;
            boolean z12 = (readByte & 4) == 4;
            long j11 = z10 ? 5L : 1L;
            if (z11) {
                j11 += 4;
            }
            if (z12) {
                j11 += 4;
            }
            if (j10 < j11) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z10) {
                c0Var.f22963a = Integer.valueOf(gVar.M2());
            }
            if (z11) {
                c0Var2.f22963a = Integer.valueOf(gVar.M2());
            }
            if (z12) {
                c0Var3.f22963a = Integer.valueOf(gVar.M2());
            }
        }
        return Unit.f22894a;
    }

    public static final i t(wu.g gVar, i iVar) {
        gVar.skip(12L);
        int M2 = gVar.M2();
        int M22 = gVar.M2();
        long l12 = gVar.l1();
        if (l12 != gVar.l1() || M2 != 0 || M22 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        gVar.skip(8L);
        return new i(l12, gVar.l1(), iVar.getCommentByteCount());
    }

    public static final void u(@NotNull wu.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        r(gVar, null);
    }
}

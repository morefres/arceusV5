package xu;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wu.h;
import wu.h0;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0015\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0018\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b\"\u0014\u0010 \u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b\"\u0014\u0010\"\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001b\"\u0014\u0010$\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001b\"\u0018\u0010&\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0003\"\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u0011*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lwu/h0;", "", "o", "(Lwu/h0;)I", "", "n", "(Lwu/h0;)Z", "child", "normalize", "j", "(Lwu/h0;Lwu/h0;Z)Lwu/h0;", "", "k", "(Ljava/lang/String;Z)Lwu/h0;", "Lwu/e;", "q", "(Lwu/e;Z)Lwu/h0;", "Lwu/h;", "s", "(Ljava/lang/String;)Lwu/h;", "", "r", "(B)Lwu/h;", "slash", "p", "(Lwu/e;Lwu/h;)Z", ve.a.f33391e, "Lwu/h;", "SLASH", j6.b.f21518e, "BACKSLASH", "c", "ANY_SLASH", rl.d.f30696a, "DOT", "e", "DOT_DOT", "l", "indexOfLastSlash", "m", "(Lwu/h0;)Lwu/h;", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final wu.h f36123a;

    @NotNull
    public static final wu.h b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final wu.h f36124c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final wu.h f36125d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final wu.h f36126e;

    static {
        h.Companion companion = wu.h.INSTANCE;
        f36123a = companion.d("/");
        b = companion.d("\\");
        f36124c = companion.d("/\\");
        f36125d = companion.d(".");
        f36126e = companion.d("..");
    }

    @NotNull
    public static final h0 j(@NotNull h0 h0Var, @NotNull h0 child, boolean z10) {
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child.isAbsolute() || child.u() != null) {
            return child;
        }
        wu.h m10 = m(h0Var);
        if (m10 == null && (m10 = m(child)) == null) {
            m10 = s(h0.f34823c);
        }
        wu.e eVar = new wu.e();
        eVar.s2(h0Var.getBytes());
        if (eVar.getSize() > 0) {
            eVar.s2(m10);
        }
        eVar.s2(child.getBytes());
        return q(eVar, z10);
    }

    @NotNull
    public static final h0 k(@NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return q(new wu.e().A0(str), z10);
    }

    public static final int l(h0 h0Var) {
        int A = wu.h.A(h0Var.getBytes(), f36123a, 0, 2, null);
        return A != -1 ? A : wu.h.A(h0Var.getBytes(), b, 0, 2, null);
    }

    public static final wu.h m(h0 h0Var) {
        wu.h bytes = h0Var.getBytes();
        wu.h hVar = f36123a;
        if (wu.h.v(bytes, hVar, 0, 2, null) != -1) {
            return hVar;
        }
        wu.h bytes2 = h0Var.getBytes();
        wu.h hVar2 = b;
        if (wu.h.v(bytes2, hVar2, 0, 2, null) != -1) {
            return hVar2;
        }
        return null;
    }

    public static final boolean n(h0 h0Var) {
        return h0Var.getBytes().h(f36126e) && (h0Var.getBytes().I() == 2 || h0Var.getBytes().C(h0Var.getBytes().I() + (-3), f36123a, 0, 1) || h0Var.getBytes().C(h0Var.getBytes().I() + (-3), b, 0, 1));
    }

    public static final int o(h0 h0Var) {
        if (h0Var.getBytes().I() == 0) {
            return -1;
        }
        if (h0Var.getBytes().j(0) == 47) {
            return 1;
        }
        if (h0Var.getBytes().j(0) == 92) {
            if (h0Var.getBytes().I() <= 2 || h0Var.getBytes().j(1) != 92) {
                return 1;
            }
            int s8 = h0Var.getBytes().s(b, 2);
            return s8 == -1 ? h0Var.getBytes().I() : s8;
        }
        if (h0Var.getBytes().I() > 2 && h0Var.getBytes().j(1) == 58 && h0Var.getBytes().j(2) == 92) {
            char j10 = (char) h0Var.getBytes().j(0);
            if ('a' <= j10 && j10 < '{') {
                return 3;
            }
            if ('A' <= j10 && j10 < '[') {
                return 3;
            }
        }
        return -1;
    }

    public static final boolean p(wu.e eVar, wu.h hVar) {
        if (!Intrinsics.c(hVar, b) || eVar.getSize() < 2 || eVar.j(1L) != 58) {
            return false;
        }
        char j10 = (char) eVar.j(0L);
        if ('a' > j10 || j10 >= '{') {
            return 'A' <= j10 && j10 < '[';
        }
        return true;
    }

    @NotNull
    public static final h0 q(@NotNull wu.e eVar, boolean z10) {
        wu.h hVar;
        wu.h I1;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        wu.e eVar2 = new wu.e();
        wu.h hVar2 = null;
        int i10 = 0;
        while (true) {
            if (!eVar.b1(0L, f36123a)) {
                hVar = b;
                if (!eVar.b1(0L, hVar)) {
                    break;
                }
            }
            byte readByte = eVar.readByte();
            if (hVar2 == null) {
                hVar2 = r(readByte);
            }
            i10++;
        }
        boolean z11 = i10 >= 2 && Intrinsics.c(hVar2, hVar);
        if (z11) {
            Intrinsics.checkNotNull(hVar2);
            eVar2.s2(hVar2);
            eVar2.s2(hVar2);
        } else if (i10 > 0) {
            Intrinsics.checkNotNull(hVar2);
            eVar2.s2(hVar2);
        } else {
            long p12 = eVar.p1(f36124c);
            if (hVar2 == null) {
                hVar2 = p12 == -1 ? s(h0.f34823c) : r(eVar.j(p12));
            }
            if (p(eVar, hVar2)) {
                if (p12 == 2) {
                    eVar2.write(eVar, 3L);
                } else {
                    eVar2.write(eVar, 2L);
                }
            }
            Unit unit = Unit.f22894a;
        }
        boolean z12 = eVar2.getSize() > 0;
        ArrayList arrayList = new ArrayList();
        while (!eVar.X1()) {
            long p13 = eVar.p1(f36124c);
            if (p13 == -1) {
                I1 = eVar.G2();
            } else {
                I1 = eVar.I1(p13);
                eVar.readByte();
            }
            wu.h hVar3 = f36126e;
            if (Intrinsics.c(I1, hVar3)) {
                if (!z12 || !arrayList.isEmpty()) {
                    if (!z10 || (!z12 && (arrayList.isEmpty() || Intrinsics.c(CollectionsKt.o0(arrayList), hVar3)))) {
                        arrayList.add(I1);
                    } else if (!z11 || arrayList.size() != 1) {
                        kotlin.collections.u.I(arrayList);
                    }
                }
            } else if (!Intrinsics.c(I1, f36125d) && !Intrinsics.c(I1, wu.h.f34820e)) {
                arrayList.add(I1);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                eVar2.s2(hVar2);
            }
            eVar2.s2((wu.h) arrayList.get(i11));
        }
        if (eVar2.getSize() == 0) {
            eVar2.s2(f36125d);
        }
        return new h0(eVar2.G2());
    }

    public static final wu.h r(byte b10) {
        if (b10 == 47) {
            return f36123a;
        }
        if (b10 == 92) {
            return b;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b10));
    }

    public static final wu.h s(String str) {
        if (Intrinsics.c(str, "/")) {
            return f36123a;
        }
        if (Intrinsics.c(str, "\\")) {
            return b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}

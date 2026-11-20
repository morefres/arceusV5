package wu;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\n\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b#\u0010$R\u0013\u0010'\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010,\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u00101\u001a\u0004\u0018\u00010.8G¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00103\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b2\u0010$R\u0011\u00105\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b4\u0010!R\u0013\u00107\u001a\u0004\u0018\u00010\u00008G¢\u0006\u0006\u001a\u0004\b6\u0010&¨\u00068"}, d2 = {"Lwu/h0;", "", "Lwu/h;", "bytes", "<init>", "(Lwu/h;)V", "", "child", "n", "(Ljava/lang/String;)Lwu/h0;", "o", "(Lwu/h0;)Lwu/h0;", "", "normalize", "q", "(Lwu/h0;Z)Lwu/h0;", "other", "l", "Ljava/io/File;", "toFile", "()Ljava/io/File;", "Ljava/nio/file/Path;", "s", "()Ljava/nio/file/Path;", "", ve.a.f33391e, "(Lwu/h0;)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lwu/h;", j6.b.f21518e, "()Lwu/h;", "c", "()Lwu/h0;", "root", "", rl.d.f30696a, "()Ljava/util/List;", "segmentsBytes", "isAbsolute", "()Z", "", "u", "()Ljava/lang/Character;", "volumeLetter", "h", "nameBytes", "e", "name", "j", "parent", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class h0 implements Comparable<h0> {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f34823c;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h bytes;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u0007*\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u0007*\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lwu/h0$a;", "", "<init>", "()V", "", "", "normalize", "Lwu/h0;", j6.b.f21518e, "(Ljava/lang/String;Z)Lwu/h0;", "Ljava/io/File;", ve.a.f33391e, "(Ljava/io/File;Z)Lwu/h0;", "Ljava/nio/file/Path;", "c", "(Ljava/nio/file/Path;Z)Lwu/h0;", "DIRECTORY_SEPARATOR", "Ljava/lang/String;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: wu.h0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ h0 d(Companion companion, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.a(file, z10);
        }

        public static /* synthetic */ h0 e(Companion companion, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.b(str, z10);
        }

        public static /* synthetic */ h0 f(Companion companion, Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.c(path, z10);
        }

        @NotNull
        public final h0 a(@NotNull File file, boolean z10) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            String file2 = file.toString();
            Intrinsics.checkNotNullExpressionValue(file2, "toString(...)");
            return b(file2, z10);
        }

        @NotNull
        public final h0 b(@NotNull String str, boolean z10) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return xu.e.k(str, z10);
        }

        @NotNull
        public final h0 c(@NotNull Path path, boolean z10) {
            Intrinsics.checkNotNullParameter(path, "<this>");
            return b(path.toString(), z10);
        }

        public Companion() {
        }
    }

    static {
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        f34823c = separator;
    }

    public h0(@NotNull h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.bytes = bytes;
    }

    public static /* synthetic */ h0 r(h0 h0Var, h0 h0Var2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return h0Var.q(h0Var2, z10);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull h0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return getBytes().compareTo(other.getBytes());
    }

    @NotNull
    /* renamed from: b, reason: from getter */
    public final h getBytes() {
        return this.bytes;
    }

    @Nullable
    public final h0 c() {
        int o8;
        o8 = xu.e.o(this);
        if (o8 == -1) {
            return null;
        }
        return new h0(getBytes().L(0, o8));
    }

    @NotNull
    public final List<h> d() {
        int o8;
        ArrayList arrayList = new ArrayList();
        o8 = xu.e.o(this);
        if (o8 == -1) {
            o8 = 0;
        } else if (o8 < getBytes().I() && getBytes().j(o8) == 92) {
            o8++;
        }
        int I = getBytes().I();
        int i10 = o8;
        while (o8 < I) {
            if (getBytes().j(o8) == 47 || getBytes().j(o8) == 92) {
                arrayList.add(getBytes().L(i10, o8));
                i10 = o8 + 1;
            }
            o8++;
        }
        if (i10 < getBytes().I()) {
            arrayList.add(getBytes().L(i10, getBytes().I()));
        }
        return arrayList;
    }

    @NotNull
    public final String e() {
        return h().P();
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof h0) && Intrinsics.c(((h0) other).getBytes(), getBytes());
    }

    @NotNull
    public final h h() {
        int l10;
        l10 = xu.e.l(this);
        return l10 != -1 ? h.M(getBytes(), l10 + 1, 0, 2, null) : (u() == null || getBytes().I() != 2) ? getBytes() : h.f34820e;
    }

    public int hashCode() {
        return getBytes().hashCode();
    }

    public final boolean isAbsolute() {
        int o8;
        o8 = xu.e.o(this);
        return o8 != -1;
    }

    @Nullable
    public final h0 j() {
        h hVar;
        h hVar2;
        h hVar3;
        boolean n10;
        int l10;
        h hVar4;
        h hVar5;
        h bytes = getBytes();
        hVar = xu.e.f36125d;
        if (!Intrinsics.c(bytes, hVar)) {
            h bytes2 = getBytes();
            hVar2 = xu.e.f36123a;
            if (!Intrinsics.c(bytes2, hVar2)) {
                h bytes3 = getBytes();
                hVar3 = xu.e.b;
                if (!Intrinsics.c(bytes3, hVar3)) {
                    n10 = xu.e.n(this);
                    if (!n10) {
                        l10 = xu.e.l(this);
                        if (l10 == 2 && u() != null) {
                            if (getBytes().I() == 3) {
                                return null;
                            }
                            return new h0(h.M(getBytes(), 0, 3, 1, null));
                        }
                        if (l10 == 1) {
                            h bytes4 = getBytes();
                            hVar5 = xu.e.b;
                            if (bytes4.J(hVar5)) {
                                return null;
                            }
                        }
                        if (l10 == -1 && u() != null) {
                            if (getBytes().I() == 2) {
                                return null;
                            }
                            return new h0(h.M(getBytes(), 0, 2, 1, null));
                        }
                        if (l10 != -1) {
                            return l10 == 0 ? new h0(h.M(getBytes(), 0, 1, 1, null)) : new h0(h.M(getBytes(), 0, l10, 1, null));
                        }
                        hVar4 = xu.e.f36125d;
                        return new h0(hVar4);
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
        r9 = xu.e.m(r8);
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final wu.h0 l(@org.jetbrains.annotations.NotNull wu.h0 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            wu.h0 r0 = r8.c()
            wu.h0 r1 = r9.c()
            boolean r0 = kotlin.jvm.internal.Intrinsics.c(r0, r1)
            java.lang.String r1 = " and "
            if (r0 == 0) goto Le5
            java.util.List r0 = r8.d()
            java.util.List r2 = r9.d()
            int r3 = r0.size()
            int r4 = r2.size()
            int r3 = java.lang.Math.min(r3, r4)
            r4 = 0
            r5 = r4
        L2b:
            if (r5 >= r3) goto L3e
            java.lang.Object r6 = r0.get(r5)
            java.lang.Object r7 = r2.get(r5)
            boolean r6 = kotlin.jvm.internal.Intrinsics.c(r6, r7)
            if (r6 == 0) goto L3e
            int r5 = r5 + 1
            goto L2b
        L3e:
            if (r5 != r3) goto L5d
            wu.h r3 = r8.getBytes()
            int r3 = r3.I()
            wu.h r6 = r9.getBytes()
            int r6 = r6.I()
            if (r3 != r6) goto L5d
            wu.h0$a r9 = wu.h0.INSTANCE
            java.lang.String r0 = "."
            r1 = 0
            r2 = 1
            wu.h0 r9 = wu.h0.Companion.e(r9, r0, r4, r2, r1)
            return r9
        L5d:
            int r3 = r2.size()
            java.util.List r3 = r2.subList(r5, r3)
            wu.h r6 = xu.e.c()
            int r3 = r3.indexOf(r6)
            r6 = -1
            if (r3 != r6) goto Lc4
            wu.h r1 = r9.getBytes()
            wu.h r3 = xu.e.b()
            boolean r1 = kotlin.jvm.internal.Intrinsics.c(r1, r3)
            if (r1 == 0) goto L7f
            return r8
        L7f:
            wu.e r1 = new wu.e
            r1.<init>()
            wu.h r9 = xu.e.f(r9)
            if (r9 != 0) goto L96
            wu.h r9 = xu.e.f(r8)
            if (r9 != 0) goto L96
            java.lang.String r9 = wu.h0.f34823c
            wu.h r9 = xu.e.i(r9)
        L96:
            int r2 = r2.size()
            r3 = r5
        L9b:
            if (r3 >= r2) goto Laa
            wu.h r6 = xu.e.c()
            r1.s2(r6)
            r1.s2(r9)
            int r3 = r3 + 1
            goto L9b
        Laa:
            int r2 = r0.size()
        Lae:
            if (r5 >= r2) goto Lbf
            java.lang.Object r3 = r0.get(r5)
            wu.h r3 = (wu.h) r3
            r1.s2(r3)
            r1.s2(r9)
            int r5 = r5 + 1
            goto Lae
        Lbf:
            wu.h0 r9 = xu.e.q(r1, r4)
            return r9
        Lc4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Impossible relative path to resolve: "
            r0.append(r2)
            r0.append(r8)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        Le5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Paths of different roots cannot be relative to each other: "
            r0.append(r2)
            r0.append(r8)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wu.h0.l(wu.h0):wu.h0");
    }

    @NotNull
    public final h0 n(@NotNull String child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return xu.e.j(this, xu.e.q(new e().A0(child), false), false);
    }

    @NotNull
    public final h0 o(@NotNull h0 child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return xu.e.j(this, child, false);
    }

    @NotNull
    public final h0 q(@NotNull h0 child, boolean normalize) {
        Intrinsics.checkNotNullParameter(child, "child");
        return xu.e.j(this, child, normalize);
    }

    @NotNull
    public final Path s() {
        Path path = Paths.get(toString(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    @NotNull
    public final File toFile() {
        return new File(toString());
    }

    @NotNull
    public String toString() {
        return getBytes().P();
    }

    @Nullable
    public final Character u() {
        h hVar;
        h bytes = getBytes();
        hVar = xu.e.f36123a;
        if (h.v(bytes, hVar, 0, 2, null) != -1 || getBytes().I() < 2 || getBytes().j(1) != 58) {
            return null;
        }
        char j10 = (char) getBytes().j(0);
        if (('a' > j10 || j10 >= '{') && ('A' > j10 || j10 >= '[')) {
            return null;
        }
        return Character.valueOf(j10);
    }
}

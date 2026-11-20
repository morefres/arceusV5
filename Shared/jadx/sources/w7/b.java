package w7;

import android.util.Log;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import w7.g;
import w7.k;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public f f33738a;
    public u b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33739c;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33740a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[j.values().length];
            b = iArr;
            try {
                iArr[j.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[j.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[j.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[j.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[j.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[j.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[j.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[j.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[j.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[j.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[j.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[j.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[j.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[j.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[j.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[j.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[j.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[j.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                b[j.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                b[j.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                b[j.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                b[j.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                b[j.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                b[j.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr2 = new int[c.values().length];
            f33740a = iArr2;
            try {
                iArr2[c.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f33740a[c.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f33740a[c.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: w7.b$b, reason: collision with other inner class name */
    public static class C0632b {

        /* renamed from: a, reason: collision with root package name */
        public final String f33741a;
        public final c b;

        /* renamed from: c, reason: collision with root package name */
        public final String f33742c;

        public C0632b(String str, c cVar, String str2) {
            this.f33741a = str;
            this.b = cVar;
            this.f33742c = str2;
        }
    }

    public enum c {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    public static class d extends k.i {

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public int f33747a;
            public int b;

            public a(int i10, int i11) {
                this.f33747a = i10;
                this.b = i11;
            }
        }

        public d(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        public final int C(int i10) {
            if (i10 >= 48 && i10 <= 57) {
                return i10 - 48;
            }
            if (i10 >= 65 && i10 <= 70) {
                return i10 - 55;
            }
            if (i10 < 97 || i10 > 102) {
                return -1;
            }
            return i10 - 87;
        }

        public final a D() {
            w7.c cVar;
            a aVar;
            if (h()) {
                return null;
            }
            int i10 = this.b;
            if (!f('(')) {
                return null;
            }
            A();
            int i11 = 1;
            if (g("odd")) {
                aVar = new a(2, 1);
            } else {
                if (g("even")) {
                    aVar = new a(2, 0);
                } else {
                    int i12 = (!f('+') && f('-')) ? -1 : 1;
                    w7.c c10 = w7.c.c(this.f34161a, this.b, this.f34162c, false);
                    if (c10 != null) {
                        this.b = c10.a();
                    }
                    if (f('n') || f('N')) {
                        if (c10 == null) {
                            c10 = new w7.c(1L, this.b);
                        }
                        A();
                        boolean f10 = f('+');
                        if (!f10 && (f10 = f('-'))) {
                            i11 = -1;
                        }
                        if (f10) {
                            A();
                            cVar = w7.c.c(this.f34161a, this.b, this.f34162c, false);
                            if (cVar == null) {
                                this.b = i10;
                                return null;
                            }
                            this.b = cVar.a();
                            int i13 = i11;
                            i11 = i12;
                            i12 = i13;
                        } else {
                            int i14 = i11;
                            i11 = i12;
                            i12 = i14;
                            cVar = null;
                        }
                    } else {
                        cVar = c10;
                        c10 = null;
                    }
                    aVar = new a(c10 == null ? 0 : i11 * c10.d(), cVar != null ? i12 * cVar.d() : 0);
                }
            }
            A();
            if (f(')')) {
                return aVar;
            }
            this.b = i10;
            return null;
        }

        public final String E() {
            if (h()) {
                return null;
            }
            String q10 = q();
            return q10 != null ? q10 : H();
        }

        public String F() {
            int C;
            if (h()) {
                return null;
            }
            char charAt = this.f34161a.charAt(this.b);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            this.b++;
            int intValue = l().intValue();
            while (intValue != -1 && intValue != charAt) {
                if (intValue == 92) {
                    intValue = l().intValue();
                    if (intValue != -1) {
                        if (intValue == 10 || intValue == 13 || intValue == 12) {
                            intValue = l().intValue();
                        } else {
                            int C2 = C(intValue);
                            if (C2 != -1) {
                                for (int i10 = 1; i10 <= 5 && (C = C((intValue = l().intValue()))) != -1; i10++) {
                                    C2 = (C2 * 16) + C;
                                }
                                sb2.append((char) C2);
                            }
                        }
                    }
                }
                sb2.append((char) intValue);
                intValue = l().intValue();
            }
            return sb2.toString();
        }

        public final List<String> G() {
            if (h()) {
                return null;
            }
            int i10 = this.b;
            if (!f('(')) {
                return null;
            }
            A();
            ArrayList arrayList = null;
            do {
                String H = H();
                if (H == null) {
                    this.b = i10;
                    return null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(H);
                A();
            } while (z());
            if (f(')')) {
                return arrayList;
            }
            this.b = i10;
            return null;
        }

        public String H() {
            int P = P();
            int i10 = this.b;
            if (P == i10) {
                return null;
            }
            String substring = this.f34161a.substring(i10, P);
            this.b = P;
            return substring;
        }

        public String I() {
            char charAt;
            int C;
            StringBuilder sb2 = new StringBuilder();
            while (!h() && (charAt = this.f34161a.charAt(this.b)) != '\'' && charAt != '\"' && charAt != '(' && charAt != ')' && !k(charAt) && !Character.isISOControl((int) charAt)) {
                this.b++;
                if (charAt == '\\') {
                    if (!h()) {
                        String str = this.f34161a;
                        int i10 = this.b;
                        this.b = i10 + 1;
                        charAt = str.charAt(i10);
                        if (charAt != '\n' && charAt != '\r' && charAt != '\f') {
                            int C2 = C(charAt);
                            if (C2 != -1) {
                                for (int i11 = 1; i11 <= 5 && !h() && (C = C(this.f34161a.charAt(this.b))) != -1; i11++) {
                                    this.b++;
                                    C2 = (C2 * 16) + C;
                                }
                                sb2.append((char) C2);
                            }
                        }
                    }
                }
                sb2.append(charAt);
            }
            if (sb2.length() == 0) {
                return null;
            }
            return sb2.toString();
        }

        public String J() {
            if (h()) {
                return null;
            }
            int i10 = this.b;
            int charAt = this.f34161a.charAt(i10);
            int i11 = i10;
            while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33 && !j(charAt)) {
                if (!k(charAt)) {
                    i11 = this.b + 1;
                }
                charAt = a();
            }
            if (this.b > i10) {
                return this.f34161a.substring(i10, i11);
            }
            this.b = i10;
            return null;
        }

        public final List<s> K() {
            List<t> list;
            List<g> list2;
            if (h()) {
                return null;
            }
            int i10 = this.b;
            if (!f('(')) {
                return null;
            }
            A();
            List<s> L = L();
            if (L == null) {
                this.b = i10;
                return null;
            }
            if (!f(')')) {
                this.b = i10;
                return null;
            }
            Iterator<s> it = L.iterator();
            while (it.hasNext() && (list = it.next().f33798a) != null) {
                Iterator<t> it2 = list.iterator();
                while (it2.hasNext() && (list2 = it2.next().f33801d) != null) {
                    Iterator<g> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (it3.next() instanceof k) {
                            return null;
                        }
                    }
                }
            }
            return L;
        }

        public final List<s> L() {
            a aVar = null;
            if (h()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(1);
            s sVar = new s(aVar);
            while (!h() && M(sVar)) {
                if (z()) {
                    arrayList.add(sVar);
                    sVar = new s(aVar);
                }
            }
            if (!sVar.f()) {
                arrayList.add(sVar);
            }
            return arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x003c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean M(w7.b.s r11) {
            /*
                Method dump skipped, instructions count: 310
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: w7.b.d.M(w7.b$s):boolean");
        }

        public String N() {
            if (h()) {
                return null;
            }
            int i10 = this.b;
            if (!g("url(")) {
                return null;
            }
            A();
            String F = F();
            if (F == null) {
                F = I();
            }
            if (F == null) {
                this.b = i10;
                return null;
            }
            A();
            if (h() || g(")")) {
                return F;
            }
            this.b = i10;
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void O(s sVar, t tVar) {
            g gVar;
            h hVar;
            h hVar2;
            String H = H();
            if (H == null) {
                throw new w7.a("Invalid pseudo class");
            }
            j a10 = j.a(H);
            a aVar = null;
            switch (a.b[a10.ordinal()]) {
                case 1:
                    h hVar3 = new h(0, 1, true, false, null);
                    sVar.b();
                    hVar2 = hVar3;
                    gVar = hVar2;
                    tVar.b(gVar);
                    return;
                case 2:
                    h hVar4 = new h(0, 1, false, false, null);
                    sVar.b();
                    gVar = hVar4;
                    tVar.b(gVar);
                    return;
                case 3:
                    gVar = new m(false, null);
                    sVar.b();
                    tVar.b(gVar);
                    return;
                case 4:
                    hVar = new h(0, 1, true, true, tVar.b);
                    sVar.b();
                    gVar = hVar;
                    tVar.b(gVar);
                    return;
                case 5:
                    h hVar5 = new h(0, 1, false, true, tVar.b);
                    sVar.b();
                    gVar = hVar5;
                    tVar.b(gVar);
                    return;
                case 6:
                    gVar = new m(true, tVar.b);
                    sVar.b();
                    tVar.b(gVar);
                    return;
                case 7:
                    gVar = new n(aVar);
                    sVar.b();
                    tVar.b(gVar);
                    return;
                case 8:
                    gVar = new i(aVar);
                    sVar.b();
                    tVar.b(gVar);
                    return;
                case 9:
                case 10:
                case 11:
                case 12:
                    boolean z10 = a10 == j.nth_child || a10 == j.nth_of_type;
                    boolean z11 = a10 == j.nth_of_type || a10 == j.nth_last_of_type;
                    a D = D();
                    if (D == null) {
                        throw new w7.a("Invalid or missing parameter section for pseudo class: " + H);
                    }
                    hVar = new h(D.f33747a, D.b, z10, z11, tVar.b);
                    sVar.b();
                    gVar = hVar;
                    tVar.b(gVar);
                    return;
                case 13:
                    List<s> K = K();
                    if (K == null) {
                        throw new w7.a("Invalid or missing parameter section for pseudo class: " + H);
                    }
                    k kVar = new k(K);
                    sVar.b = kVar.b();
                    hVar2 = kVar;
                    gVar = hVar2;
                    tVar.b(gVar);
                    return;
                case 14:
                    gVar = new o(aVar);
                    sVar.b();
                    tVar.b(gVar);
                    return;
                case 15:
                    G();
                    gVar = new l(H);
                    sVar.b();
                    tVar.b(gVar);
                    return;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case MotionEventCompat.AXIS_WHEEL /* 21 */:
                case MotionEventCompat.AXIS_GAS /* 22 */:
                case MotionEventCompat.AXIS_BRAKE /* 23 */:
                case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                    gVar = new l(H);
                    sVar.b();
                    tVar.b(gVar);
                    return;
                default:
                    throw new w7.a("Unsupported pseudo class: " + H);
            }
        }

        public final int P() {
            int i10;
            if (h()) {
                return this.b;
            }
            int i11 = this.b;
            int charAt = this.f34161a.charAt(i11);
            if (charAt == 45) {
                charAt = a();
            }
            if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 95)) {
                i10 = i11;
            } else {
                int a10 = a();
                while (true) {
                    if ((a10 < 65 || a10 > 90) && ((a10 < 97 || a10 > 122) && !((a10 >= 48 && a10 <= 57) || a10 == 45 || a10 == 95))) {
                        break;
                    }
                    a10 = a();
                }
                i10 = this.b;
            }
            this.b = i11;
            return i10;
        }
    }

    public enum e {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    public enum f {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv
    }

    public interface g {
        boolean a(q qVar, g.l0 l0Var);
    }

    public static class h implements g {

        /* renamed from: a, reason: collision with root package name */
        public int f33762a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f33763c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f33764d;

        /* renamed from: e, reason: collision with root package name */
        public String f33765e;

        public h(int i10, int i11, boolean z10, boolean z11, String str) {
            this.f33762a = i10;
            this.b = i11;
            this.f33763c = z10;
            this.f33764d = z11;
            this.f33765e = str;
        }

        @Override // w7.b.g
        public boolean a(q qVar, g.l0 l0Var) {
            int i10;
            int i11;
            String n10 = (this.f33764d && this.f33765e == null) ? l0Var.n() : this.f33765e;
            g.j0 j0Var = l0Var.b;
            if (j0Var != null) {
                Iterator<g.n0> it = j0Var.getChildren().iterator();
                i10 = 0;
                i11 = 0;
                while (it.hasNext()) {
                    g.l0 l0Var2 = (g.l0) it.next();
                    if (l0Var2 == l0Var) {
                        i10 = i11;
                    }
                    if (n10 == null || l0Var2.n().equals(n10)) {
                        i11++;
                    }
                }
            } else {
                i10 = 0;
                i11 = 1;
            }
            int i12 = this.f33763c ? i10 + 1 : i11 - i10;
            int i13 = this.f33762a;
            if (i13 == 0) {
                return i12 == this.b;
            }
            int i14 = this.b;
            return (i12 - i14) % i13 == 0 && (Integer.signum(i12 - i14) == 0 || Integer.signum(i12 - this.b) == Integer.signum(this.f33762a));
        }

        public String toString() {
            String str = this.f33763c ? "" : "last-";
            return this.f33764d ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(this.f33762a), Integer.valueOf(this.b), this.f33765e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(this.f33762a), Integer.valueOf(this.b));
        }
    }

    public static class i implements g {
        public i() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // w7.b.g
        public boolean a(q qVar, g.l0 l0Var) {
            return !(l0Var instanceof g.j0) || ((g.j0) l0Var).getChildren().size() == 0;
        }

        public String toString() {
            return "empty";
        }

        public /* synthetic */ i(a aVar) {
            this();
        }
    }

    public enum j {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;


        /* renamed from: z, reason: collision with root package name */
        public static final Map<String, j> f33790z = new HashMap();

        static {
            for (j jVar : values()) {
                if (jVar != UNSUPPORTED) {
                    f33790z.put(jVar.name().replace('_', '-'), jVar);
                }
            }
        }

        public static j a(String str) {
            j jVar = f33790z.get(str);
            return jVar != null ? jVar : UNSUPPORTED;
        }
    }

    public static class k implements g {

        /* renamed from: a, reason: collision with root package name */
        public List<s> f33791a;

        public k(List<s> list) {
            this.f33791a = list;
        }

        @Override // w7.b.g
        public boolean a(q qVar, g.l0 l0Var) {
            Iterator<s> it = this.f33791a.iterator();
            while (it.hasNext()) {
                if (b.l(qVar, it.next(), l0Var)) {
                    return false;
                }
            }
            return true;
        }

        public int b() {
            Iterator<s> it = this.f33791a.iterator();
            int i10 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            while (it.hasNext()) {
                int i11 = it.next().b;
                if (i11 > i10) {
                    i10 = i11;
                }
            }
            return i10;
        }

        public String toString() {
            return "not(" + this.f33791a + ")";
        }
    }

    public static class l implements g {

        /* renamed from: a, reason: collision with root package name */
        public String f33792a;

        public l(String str) {
            this.f33792a = str;
        }

        @Override // w7.b.g
        public boolean a(q qVar, g.l0 l0Var) {
            return false;
        }

        public String toString() {
            return this.f33792a;
        }
    }

    public static class m implements g {

        /* renamed from: a, reason: collision with root package name */
        public boolean f33793a;
        public String b;

        public m(boolean z10, String str) {
            this.f33793a = z10;
            this.b = str;
        }

        @Override // w7.b.g
        public boolean a(q qVar, g.l0 l0Var) {
            int i10;
            String n10 = (this.f33793a && this.b == null) ? l0Var.n() : this.b;
            g.j0 j0Var = l0Var.b;
            if (j0Var != null) {
                Iterator<g.n0> it = j0Var.getChildren().iterator();
                i10 = 0;
                while (it.hasNext()) {
                    g.l0 l0Var2 = (g.l0) it.next();
                    if (n10 == null || l0Var2.n().equals(n10)) {
                        i10++;
                    }
                }
            } else {
                i10 = 1;
            }
            return i10 == 1;
        }

        public String toString() {
            return this.f33793a ? String.format("only-of-type <%s>", this.b) : String.format("only-child", new Object[0]);
        }
    }

    public static class n implements g {
        public n() {
        }

        @Override // w7.b.g
        public boolean a(q qVar, g.l0 l0Var) {
            return l0Var.b == null;
        }

        public String toString() {
            return "root";
        }

        public /* synthetic */ n(a aVar) {
            this();
        }
    }

    public static class o implements g {
        public o() {
        }

        @Override // w7.b.g
        public boolean a(q qVar, g.l0 l0Var) {
            return qVar != null && l0Var == qVar.f33796a;
        }

        public String toString() {
            return "target";
        }

        public /* synthetic */ o(a aVar) {
            this();
        }
    }

    public static class p {

        /* renamed from: a, reason: collision with root package name */
        public s f33794a;
        public g.e0 b;

        /* renamed from: c, reason: collision with root package name */
        public u f33795c;

        public p(s sVar, g.e0 e0Var, u uVar) {
            this.f33794a = sVar;
            this.b = e0Var;
            this.f33795c = uVar;
        }

        public String toString() {
            return String.valueOf(this.f33794a) + " {...} (src=" + this.f33795c + ")";
        }
    }

    public static class q {

        /* renamed from: a, reason: collision with root package name */
        public g.l0 f33796a;

        public String toString() {
            g.l0 l0Var = this.f33796a;
            return l0Var != null ? String.format("<%s id=\"%s\">", l0Var.n(), this.f33796a.f33962c) : "";
        }
    }

    public static class r {

        /* renamed from: a, reason: collision with root package name */
        public List<p> f33797a = null;

        public void a(p pVar) {
            if (this.f33797a == null) {
                this.f33797a = new ArrayList();
            }
            for (int i10 = 0; i10 < this.f33797a.size(); i10++) {
                if (this.f33797a.get(i10).f33794a.b > pVar.f33794a.b) {
                    this.f33797a.add(i10, pVar);
                    return;
                }
            }
            this.f33797a.add(pVar);
        }

        public void b(r rVar) {
            if (rVar.f33797a == null) {
                return;
            }
            if (this.f33797a == null) {
                this.f33797a = new ArrayList(rVar.f33797a.size());
            }
            Iterator<p> it = rVar.f33797a.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }

        public List<p> c() {
            return this.f33797a;
        }

        public boolean d() {
            List<p> list = this.f33797a;
            return list == null || list.isEmpty();
        }

        public void e(u uVar) {
            List<p> list = this.f33797a;
            if (list == null) {
                return;
            }
            Iterator<p> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().f33795c == uVar) {
                    it.remove();
                }
            }
        }

        public int f() {
            List<p> list = this.f33797a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public String toString() {
            if (this.f33797a == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator<p> it = this.f33797a.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString());
                sb2.append('\n');
            }
            return sb2.toString();
        }
    }

    public static class t {

        /* renamed from: a, reason: collision with root package name */
        public e f33799a;
        public String b;

        /* renamed from: c, reason: collision with root package name */
        public List<C0632b> f33800c = null;

        /* renamed from: d, reason: collision with root package name */
        public List<g> f33801d = null;

        public t(e eVar, String str) {
            this.f33799a = null;
            this.b = null;
            this.f33799a = eVar == null ? e.DESCENDANT : eVar;
            this.b = str;
        }

        public void a(String str, c cVar, String str2) {
            if (this.f33800c == null) {
                this.f33800c = new ArrayList();
            }
            this.f33800c.add(new C0632b(str, cVar, str2));
        }

        public void b(g gVar) {
            if (this.f33801d == null) {
                this.f33801d = new ArrayList();
            }
            this.f33801d.add(gVar);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            e eVar = this.f33799a;
            if (eVar == e.CHILD) {
                sb2.append("> ");
            } else if (eVar == e.FOLLOWS) {
                sb2.append("+ ");
            }
            String str = this.b;
            if (str == null) {
                str = "*";
            }
            sb2.append(str);
            List<C0632b> list = this.f33800c;
            if (list != null) {
                for (C0632b c0632b : list) {
                    sb2.append('[');
                    sb2.append(c0632b.f33741a);
                    int i10 = a.f33740a[c0632b.b.ordinal()];
                    if (i10 == 1) {
                        sb2.append('=');
                        sb2.append(c0632b.f33742c);
                    } else if (i10 == 2) {
                        sb2.append("~=");
                        sb2.append(c0632b.f33742c);
                    } else if (i10 == 3) {
                        sb2.append("|=");
                        sb2.append(c0632b.f33742c);
                    }
                    sb2.append(']');
                }
            }
            List<g> list2 = this.f33801d;
            if (list2 != null) {
                for (g gVar : list2) {
                    sb2.append(':');
                    sb2.append(gVar);
                }
            }
            return sb2.toString();
        }
    }

    public enum u {
        Document,
        RenderOptions
    }

    public b(u uVar) {
        this(f.screen, uVar);
    }

    public static int a(List<g.j0> list, int i10, g.l0 l0Var) {
        int i11 = 0;
        if (i10 < 0) {
            return 0;
        }
        g.j0 j0Var = list.get(i10);
        g.j0 j0Var2 = l0Var.b;
        if (j0Var != j0Var2) {
            return -1;
        }
        Iterator<g.n0> it = j0Var2.getChildren().iterator();
        while (it.hasNext()) {
            if (it.next() == l0Var) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static boolean b(String str, f fVar) {
        d dVar = new d(str);
        dVar.A();
        return c(h(dVar), fVar);
    }

    public static boolean c(List<f> list, f fVar) {
        for (f fVar2 : list) {
            if (fVar2 == f.all || fVar2 == fVar) {
                return true;
            }
        }
        return false;
    }

    public static List<String> f(String str) {
        d dVar = new d(str);
        ArrayList arrayList = null;
        while (!dVar.h()) {
            String r8 = dVar.r();
            if (r8 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(r8);
                dVar.A();
            }
        }
        return arrayList;
    }

    public static List<f> h(d dVar) {
        String w5;
        ArrayList arrayList = new ArrayList();
        while (!dVar.h() && (w5 = dVar.w()) != null) {
            try {
                arrayList.add(f.valueOf(w5));
            } catch (IllegalArgumentException unused) {
            }
            if (!dVar.z()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean k(q qVar, s sVar, int i10, List<g.j0> list, int i11, g.l0 l0Var) {
        t e10 = sVar.e(i10);
        if (!n(qVar, e10, list, i11, l0Var)) {
            return false;
        }
        e eVar = e10.f33799a;
        if (eVar == e.DESCENDANT) {
            if (i10 == 0) {
                return true;
            }
            while (i11 >= 0) {
                if (m(qVar, sVar, i10 - 1, list, i11)) {
                    return true;
                }
                i11--;
            }
            return false;
        }
        if (eVar == e.CHILD) {
            return m(qVar, sVar, i10 - 1, list, i11);
        }
        int a10 = a(list, i11, l0Var);
        if (a10 <= 0) {
            return false;
        }
        return k(qVar, sVar, i10 - 1, list, i11, (g.l0) l0Var.b.getChildren().get(a10 - 1));
    }

    public static boolean l(q qVar, s sVar, g.l0 l0Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj = l0Var.b; obj != null; obj = ((g.n0) obj).b) {
            arrayList.add(0, obj);
        }
        int size = arrayList.size() - 1;
        return sVar.g() == 1 ? n(qVar, sVar.e(0), arrayList, size, l0Var) : k(qVar, sVar, sVar.g() - 1, arrayList, size, l0Var);
    }

    public static boolean m(q qVar, s sVar, int i10, List<g.j0> list, int i11) {
        t e10 = sVar.e(i10);
        g.l0 l0Var = (g.l0) list.get(i11);
        if (!n(qVar, e10, list, i11, l0Var)) {
            return false;
        }
        e eVar = e10.f33799a;
        if (eVar == e.DESCENDANT) {
            if (i10 == 0) {
                return true;
            }
            while (i11 > 0) {
                i11--;
                if (m(qVar, sVar, i10 - 1, list, i11)) {
                    return true;
                }
            }
            return false;
        }
        if (eVar == e.CHILD) {
            return m(qVar, sVar, i10 - 1, list, i11 - 1);
        }
        int a10 = a(list, i11, l0Var);
        if (a10 <= 0) {
            return false;
        }
        return k(qVar, sVar, i10 - 1, list, i11, (g.l0) l0Var.b.getChildren().get(a10 - 1));
    }

    public static boolean n(q qVar, t tVar, List<g.j0> list, int i10, g.l0 l0Var) {
        List<String> list2;
        String str = tVar.b;
        if (str != null && !str.equals(l0Var.n().toLowerCase(Locale.US))) {
            return false;
        }
        List<C0632b> list3 = tVar.f33800c;
        if (list3 != null) {
            for (C0632b c0632b : list3) {
                String str2 = c0632b.f33741a;
                str2.getClass();
                if (str2.equals("id")) {
                    if (!c0632b.f33742c.equals(l0Var.f33962c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (list2 = l0Var.f33966g) == null || !list2.contains(c0632b.f33742c)) {
                    return false;
                }
            }
        }
        List<g> list4 = tVar.f33801d;
        if (list4 == null) {
            return true;
        }
        Iterator<g> it = list4.iterator();
        while (it.hasNext()) {
            if (!it.next().a(qVar, l0Var)) {
                return false;
            }
        }
        return true;
    }

    public static void p(String str, Object... objArr) {
        Log.w("CSSParser", String.format(str, objArr));
    }

    public r d(String str) {
        d dVar = new d(str);
        dVar.A();
        return j(dVar);
    }

    public final void e(r rVar, d dVar) {
        String H = dVar.H();
        dVar.A();
        if (H == null) {
            throw new w7.a("Invalid '@' rule");
        }
        if (!this.f33739c && H.equals("media")) {
            List<f> h10 = h(dVar);
            if (!dVar.f('{')) {
                throw new w7.a("Invalid @media rule: missing rule set");
            }
            dVar.A();
            if (c(h10, this.f33738a)) {
                this.f33739c = true;
                rVar.b(j(dVar));
                this.f33739c = false;
            } else {
                j(dVar);
            }
            if (!dVar.h() && !dVar.f('}')) {
                throw new w7.a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f33739c || !H.equals("import")) {
            p("Ignoring @%s rule", H);
            o(dVar);
        } else {
            String N = dVar.N();
            if (N == null) {
                N = dVar.F();
            }
            if (N == null) {
                throw new w7.a("Invalid @import rule: expected string or url()");
            }
            dVar.A();
            h(dVar);
            if (!dVar.h() && !dVar.f(';')) {
                throw new w7.a("Invalid @media rule: expected '}' at end of rule set");
            }
            w7.g.k();
        }
        dVar.A();
    }

    public final g.e0 g(d dVar) {
        g.e0 e0Var = new g.e0();
        do {
            String H = dVar.H();
            dVar.A();
            if (!dVar.f(':')) {
                throw new w7.a("Expected ':'");
            }
            dVar.A();
            String J = dVar.J();
            if (J == null) {
                throw new w7.a("Expected property value");
            }
            dVar.A();
            if (dVar.f('!')) {
                dVar.A();
                if (!dVar.g("important")) {
                    throw new w7.a("Malformed rule set: found unexpected '!'");
                }
                dVar.A();
            }
            dVar.f(';');
            w7.k.S0(e0Var, H, J);
            dVar.A();
            if (dVar.h()) {
                break;
            }
        } while (!dVar.f('}'));
        return e0Var;
    }

    public final boolean i(r rVar, d dVar) {
        List L = dVar.L();
        if (L == null || L.isEmpty()) {
            return false;
        }
        if (!dVar.f('{')) {
            throw new w7.a("Malformed rule block: expected '{'");
        }
        dVar.A();
        g.e0 g10 = g(dVar);
        dVar.A();
        Iterator it = L.iterator();
        while (it.hasNext()) {
            rVar.a(new p((s) it.next(), g10, this.b));
        }
        return true;
    }

    public final r j(d dVar) {
        r rVar = new r();
        while (!dVar.h()) {
            try {
                if (!dVar.g("<!--") && !dVar.g("-->")) {
                    if (!dVar.f('@')) {
                        if (!i(rVar, dVar)) {
                            break;
                        }
                    } else {
                        e(rVar, dVar);
                    }
                }
            } catch (w7.a e10) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e10.getMessage());
                return rVar;
            }
        }
        return rVar;
    }

    public final void o(d dVar) {
        int i10 = 0;
        while (!dVar.h()) {
            int intValue = dVar.l().intValue();
            if (intValue == 59 && i10 == 0) {
                return;
            }
            if (intValue == 123) {
                i10++;
            } else if (intValue == 125 && i10 > 0 && i10 - 1 == 0) {
                return;
            }
        }
    }

    public b(f fVar, u uVar) {
        this.f33739c = false;
        this.f33738a = fVar;
        this.b = uVar;
    }

    public static class s {

        /* renamed from: a, reason: collision with root package name */
        public List<t> f33798a;
        public int b;

        public s() {
            this.f33798a = null;
            this.b = 0;
        }

        public void a(t tVar) {
            if (this.f33798a == null) {
                this.f33798a = new ArrayList();
            }
            this.f33798a.add(tVar);
        }

        public void b() {
            this.b += 1000;
        }

        public void c() {
            this.b++;
        }

        public void d() {
            this.b += 1000000;
        }

        public t e(int i10) {
            return this.f33798a.get(i10);
        }

        public boolean f() {
            List<t> list = this.f33798a;
            return list == null || list.isEmpty();
        }

        public int g() {
            List<t> list = this.f33798a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            Iterator<t> it = this.f33798a.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append(' ');
            }
            sb2.append('[');
            sb2.append(this.b);
            sb2.append(']');
            return sb2.toString();
        }

        public /* synthetic */ s(a aVar) {
            this();
        }
    }
}

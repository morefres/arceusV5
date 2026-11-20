package ln;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class w {

    /* renamed from: e, reason: collision with root package name */
    public StringBuilder f23639e;

    /* renamed from: f, reason: collision with root package name */
    public String f23640f;

    /* renamed from: g, reason: collision with root package name */
    public char f23641g;

    /* renamed from: h, reason: collision with root package name */
    public StringBuilder f23642h;

    /* renamed from: a, reason: collision with root package name */
    public b f23636a = b.START_DEFINITION;
    public final List<pn.i> b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final List<on.p> f23637c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final List<on.y> f23638d = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f23643i = false;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23644a;

        static {
            int[] iArr = new int[b.values().length];
            f23644a = iArr;
            try {
                iArr[b.START_DEFINITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23644a[b.LABEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23644a[b.DESTINATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23644a[b.START_TITLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23644a[b.TITLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        START_DEFINITION,
        LABEL,
        DESTINATION,
        START_TITLE,
        TITLE,
        PARAGRAPH
    }

    public static <T> void i(int i10, List<T> list) {
        if (i10 >= list.size()) {
            list.clear();
            return;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            list.remove(list.size() - 1);
        }
    }

    public void a(on.y yVar) {
        this.f23638d.add(yVar);
    }

    public final boolean b(qn.i iVar) {
        iVar.r();
        qn.h o8 = iVar.o();
        if (!nn.e.b(iVar)) {
            return false;
        }
        String c10 = iVar.d(o8, iVar.o()).c();
        if (c10.startsWith("<")) {
            c10 = c10.substring(1, c10.length() - 1);
        }
        this.f23640f = c10;
        int r8 = iVar.r();
        if (!iVar.e()) {
            this.f23643i = true;
            this.b.clear();
        } else if (r8 == 0) {
            return false;
        }
        this.f23636a = b.START_TITLE;
        return true;
    }

    public final void c() {
        if (this.f23643i) {
            String e10 = nn.c.e(this.f23640f);
            StringBuilder sb2 = this.f23642h;
            on.p pVar = new on.p(this.f23639e.toString(), e10, sb2 != null ? nn.c.e(sb2.toString()) : null);
            pVar.l(this.f23638d);
            this.f23638d.clear();
            this.f23637c.add(pVar);
            this.f23639e = null;
            this.f23643i = false;
            this.f23640f = null;
            this.f23642h = null;
        }
    }

    public List<on.p> d() {
        c();
        return this.f23637c;
    }

    public pn.j e() {
        return pn.j.g(this.b);
    }

    public List<on.y> f() {
        return this.f23638d;
    }

    public final boolean g(qn.i iVar) {
        qn.h o8 = iVar.o();
        if (!nn.e.d(iVar)) {
            return false;
        }
        this.f23639e.append(iVar.d(o8, iVar.o()).c());
        if (!iVar.e()) {
            this.f23639e.append('\n');
            return true;
        }
        if (!iVar.i(']') || !iVar.i(':') || this.f23639e.length() > 999 || nn.c.c(this.f23639e.toString()).isEmpty()) {
            return false;
        }
        this.f23636a = b.DESTINATION;
        iVar.r();
        return true;
    }

    public void h(pn.i iVar) {
        boolean k10;
        this.b.add(iVar);
        if (this.f23636a == b.PARAGRAPH) {
            return;
        }
        qn.i k11 = qn.i.k(pn.j.h(iVar));
        while (k11.e()) {
            int i10 = a.f23644a[this.f23636a.ordinal()];
            if (i10 == 1) {
                k10 = k(k11);
            } else if (i10 == 2) {
                k10 = g(k11);
            } else if (i10 == 3) {
                k10 = b(k11);
            } else if (i10 == 4) {
                k10 = l(k11);
            } else {
                if (i10 != 5) {
                    throw new IllegalStateException("Unknown parsing state: " + this.f23636a);
                }
                k10 = m(k11);
            }
            if (!k10) {
                this.f23636a = b.PARAGRAPH;
                c();
                return;
            }
        }
    }

    public List<on.y> j(int i10) {
        List<on.y> list = this.f23638d;
        List<on.y> unmodifiableList = Collections.unmodifiableList(new ArrayList(list.subList(Math.max(list.size() - i10, 0), this.f23638d.size())));
        i(i10, this.b);
        i(i10, this.f23638d);
        return unmodifiableList;
    }

    public final boolean k(qn.i iVar) {
        c();
        iVar.r();
        if (!iVar.i('[')) {
            return false;
        }
        this.f23636a = b.LABEL;
        this.f23639e = new StringBuilder();
        if (iVar.e()) {
            return true;
        }
        this.f23639e.append('\n');
        return true;
    }

    public final boolean l(qn.i iVar) {
        iVar.r();
        if (!iVar.e()) {
            this.f23636a = b.START_DEFINITION;
            return true;
        }
        this.f23641g = (char) 0;
        char l10 = iVar.l();
        if (l10 == '\"' || l10 == '\'') {
            this.f23641g = l10;
        } else if (l10 == '(') {
            this.f23641g = ')';
        }
        if (this.f23641g != 0) {
            this.f23636a = b.TITLE;
            this.f23642h = new StringBuilder();
            iVar.h();
            if (!iVar.e()) {
                this.f23642h.append('\n');
            }
        } else {
            this.f23636a = b.START_DEFINITION;
        }
        return true;
    }

    public final boolean m(qn.i iVar) {
        qn.h o8 = iVar.o();
        if (!nn.e.f(iVar, this.f23641g)) {
            this.f23642h = null;
            return false;
        }
        this.f23642h.append(iVar.d(o8, iVar.o()).c());
        if (!iVar.e()) {
            this.f23642h.append('\n');
            return true;
        }
        iVar.h();
        iVar.r();
        if (iVar.e()) {
            this.f23642h = null;
            return false;
        }
        this.f23643i = true;
        this.b.clear();
        this.f23636a = b.START_DEFINITION;
        return true;
    }
}

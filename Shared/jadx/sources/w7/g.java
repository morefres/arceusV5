package w7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import w7.b;

/* loaded from: classes.dex */
public class g {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f33834g = true;

    /* renamed from: a, reason: collision with root package name */
    public f0 f33835a = null;
    public String b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f33836c = "";

    /* renamed from: d, reason: collision with root package name */
    public float f33837d = 96.0f;

    /* renamed from: e, reason: collision with root package name */
    public b.r f33838e = new b.r();

    /* renamed from: f, reason: collision with root package name */
    public Map<String, l0> f33839f = new HashMap();

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33840a;

        static {
            int[] iArr = new int[d1.values().length];
            f33840a = iArr;
            try {
                iArr[d1.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33840a[d1.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33840a[d1.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33840a[d1.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33840a[d1.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33840a[d1.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33840a[d1.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f33840a[d1.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f33840a[d1.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static class a0 extends z {
        @Override // w7.g.z, w7.g.n0
        public String n() {
            return "polygon";
        }
    }

    public static abstract class a1 extends y0 {

        /* renamed from: o, reason: collision with root package name */
        public List<p> f33841o;

        /* renamed from: p, reason: collision with root package name */
        public List<p> f33842p;

        /* renamed from: q, reason: collision with root package name */
        public List<p> f33843q;

        /* renamed from: r, reason: collision with root package name */
        public List<p> f33844r;
    }

    public static class b0 extends l {

        /* renamed from: o, reason: collision with root package name */
        public p f33848o;

        /* renamed from: p, reason: collision with root package name */
        public p f33849p;

        /* renamed from: q, reason: collision with root package name */
        public p f33850q;

        /* renamed from: r, reason: collision with root package name */
        public p f33851r;

        /* renamed from: s, reason: collision with root package name */
        public p f33852s;

        /* renamed from: t, reason: collision with root package name */
        public p f33853t;

        @Override // w7.g.n0
        public String n() {
            return "rect";
        }
    }

    public interface b1 {
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public p f33854a;
        public p b;

        /* renamed from: c, reason: collision with root package name */
        public p f33855c;

        /* renamed from: d, reason: collision with root package name */
        public p f33856d;

        public c(p pVar, p pVar2, p pVar3, p pVar4) {
            this.f33854a = pVar;
            this.b = pVar2;
            this.f33855c = pVar3;
            this.f33856d = pVar4;
        }
    }

    public static class c0 extends l0 implements j0 {
        @Override // w7.g.j0
        public void a(n0 n0Var) {
        }

        @Override // w7.g.j0
        public List<n0> getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // w7.g.n0
        public String n() {
            return "solidColor";
        }
    }

    public static class c1 extends n0 implements x0 {

        /* renamed from: c, reason: collision with root package name */
        public String f33857c;

        /* renamed from: d, reason: collision with root package name */
        public b1 f33858d;

        public c1(String str) {
            this.f33857c = str;
        }

        @Override // w7.g.x0
        public b1 e() {
            return this.f33858d;
        }

        public String toString() {
            return "TextChild: '" + this.f33857c + "'";
        }
    }

    public static class d extends l {

        /* renamed from: o, reason: collision with root package name */
        public p f33859o;

        /* renamed from: p, reason: collision with root package name */
        public p f33860p;

        /* renamed from: q, reason: collision with root package name */
        public p f33861q;

        @Override // w7.g.n0
        public String n() {
            return "circle";
        }
    }

    public static class d0 extends l0 implements j0 {

        /* renamed from: h, reason: collision with root package name */
        public Float f33862h;

        @Override // w7.g.j0
        public void a(n0 n0Var) {
        }

        @Override // w7.g.j0
        public List<n0> getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // w7.g.n0
        public String n() {
            return "stop";
        }
    }

    public enum d1 {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    public static class e extends m implements t {

        /* renamed from: p, reason: collision with root package name */
        public Boolean f33872p;

        @Override // w7.g.m, w7.g.n0
        public String n() {
            return "clipPath";
        }
    }

    public static class e0 implements Cloneable {
        public Boolean A;
        public Boolean B;
        public o0 C;
        public Float D;
        public String E;
        public a F;
        public String G;
        public o0 H;
        public Float I;
        public o0 J;
        public Float K;
        public i L;
        public e M;

        /* renamed from: a, reason: collision with root package name */
        public long f33873a = 0;
        public o0 b;

        /* renamed from: c, reason: collision with root package name */
        public a f33874c;

        /* renamed from: d, reason: collision with root package name */
        public Float f33875d;

        /* renamed from: e, reason: collision with root package name */
        public o0 f33876e;

        /* renamed from: f, reason: collision with root package name */
        public Float f33877f;

        /* renamed from: g, reason: collision with root package name */
        public p f33878g;

        /* renamed from: h, reason: collision with root package name */
        public c f33879h;

        /* renamed from: i, reason: collision with root package name */
        public d f33880i;

        /* renamed from: j, reason: collision with root package name */
        public Float f33881j;

        /* renamed from: k, reason: collision with root package name */
        public p[] f33882k;

        /* renamed from: l, reason: collision with root package name */
        public p f33883l;

        /* renamed from: m, reason: collision with root package name */
        public Float f33884m;

        /* renamed from: n, reason: collision with root package name */
        public f f33885n;

        /* renamed from: o, reason: collision with root package name */
        public List<String> f33886o;

        /* renamed from: p, reason: collision with root package name */
        public p f33887p;

        /* renamed from: q, reason: collision with root package name */
        public Integer f33888q;

        /* renamed from: r, reason: collision with root package name */
        public b f33889r;

        /* renamed from: s, reason: collision with root package name */
        public EnumC0633g f33890s;

        /* renamed from: t, reason: collision with root package name */
        public h f33891t;

        /* renamed from: u, reason: collision with root package name */
        public f f33892u;

        /* renamed from: v, reason: collision with root package name */
        public Boolean f33893v;

        /* renamed from: w, reason: collision with root package name */
        public c f33894w;

        /* renamed from: x, reason: collision with root package name */
        public String f33895x;

        /* renamed from: y, reason: collision with root package name */
        public String f33896y;

        /* renamed from: z, reason: collision with root package name */
        public String f33897z;

        public enum a {
            NonZero,
            EvenOdd
        }

        public enum b {
            Normal,
            Italic,
            Oblique
        }

        public enum c {
            Butt,
            Round,
            Square
        }

        public enum d {
            Miter,
            Round,
            Bevel
        }

        public enum e {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        public enum f {
            Start,
            Middle,
            End
        }

        /* renamed from: w7.g$e0$g, reason: collision with other inner class name */
        public enum EnumC0633g {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        public enum h {
            LTR,
            RTL
        }

        public enum i {
            None,
            NonScalingStroke
        }

        public static e0 a() {
            e0 e0Var = new e0();
            e0Var.f33873a = -1L;
            f fVar = f.b;
            e0Var.b = fVar;
            a aVar = a.NonZero;
            e0Var.f33874c = aVar;
            Float valueOf = Float.valueOf(1.0f);
            e0Var.f33875d = valueOf;
            e0Var.f33876e = null;
            e0Var.f33877f = valueOf;
            e0Var.f33878g = new p(1.0f);
            e0Var.f33879h = c.Butt;
            e0Var.f33880i = d.Miter;
            e0Var.f33881j = Float.valueOf(4.0f);
            e0Var.f33882k = null;
            e0Var.f33883l = new p(0.0f);
            e0Var.f33884m = valueOf;
            e0Var.f33885n = fVar;
            e0Var.f33886o = null;
            e0Var.f33887p = new p(12.0f, d1.pt);
            e0Var.f33888q = 400;
            e0Var.f33889r = b.Normal;
            e0Var.f33890s = EnumC0633g.None;
            e0Var.f33891t = h.LTR;
            e0Var.f33892u = f.Start;
            Boolean bool = Boolean.TRUE;
            e0Var.f33893v = bool;
            e0Var.f33894w = null;
            e0Var.f33895x = null;
            e0Var.f33896y = null;
            e0Var.f33897z = null;
            e0Var.A = bool;
            e0Var.B = bool;
            e0Var.C = fVar;
            e0Var.D = valueOf;
            e0Var.E = null;
            e0Var.F = aVar;
            e0Var.G = null;
            e0Var.H = null;
            e0Var.I = valueOf;
            e0Var.J = null;
            e0Var.K = valueOf;
            e0Var.L = i.None;
            e0Var.M = e.auto;
            return e0Var;
        }

        public void b(boolean z10) {
            Float valueOf = Float.valueOf(1.0f);
            Boolean bool = Boolean.TRUE;
            this.A = bool;
            if (!z10) {
                bool = Boolean.FALSE;
            }
            this.f33893v = bool;
            this.f33894w = null;
            this.E = null;
            this.f33884m = valueOf;
            this.C = f.b;
            this.D = valueOf;
            this.G = null;
            this.H = null;
            this.I = valueOf;
            this.J = null;
            this.K = valueOf;
            this.L = i.None;
        }

        public Object clone() {
            e0 e0Var = (e0) super.clone();
            p[] pVarArr = this.f33882k;
            if (pVarArr != null) {
                e0Var.f33882k = (p[]) pVarArr.clone();
            }
            return e0Var;
        }
    }

    public static class e1 extends m {

        /* renamed from: p, reason: collision with root package name */
        public String f33924p;

        /* renamed from: q, reason: collision with root package name */
        public p f33925q;

        /* renamed from: r, reason: collision with root package name */
        public p f33926r;

        /* renamed from: s, reason: collision with root package name */
        public p f33927s;

        /* renamed from: t, reason: collision with root package name */
        public p f33928t;

        @Override // w7.g.m, w7.g.n0
        public String n() {
            return "use";
        }
    }

    public static class f extends o0 {
        public static final f b = new f(ViewCompat.MEASURED_STATE_MASK);

        /* renamed from: c, reason: collision with root package name */
        public static final f f33929c = new f(0);

        /* renamed from: a, reason: collision with root package name */
        public int f33930a;

        public f(int i10) {
            this.f33930a = i10;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.f33930a));
        }
    }

    public static class f0 extends r0 {

        /* renamed from: q, reason: collision with root package name */
        public p f33931q;

        /* renamed from: r, reason: collision with root package name */
        public p f33932r;

        /* renamed from: s, reason: collision with root package name */
        public p f33933s;

        /* renamed from: t, reason: collision with root package name */
        public p f33934t;

        /* renamed from: u, reason: collision with root package name */
        public String f33935u;

        @Override // w7.g.n0
        public String n() {
            return "svg";
        }
    }

    public static class f1 extends r0 implements t {
        @Override // w7.g.n0
        public String n() {
            return "view";
        }
    }

    /* renamed from: w7.g$g, reason: collision with other inner class name */
    public static class C0634g extends o0 {

        /* renamed from: a, reason: collision with root package name */
        public static C0634g f33936a = new C0634g();

        public static C0634g a() {
            return f33936a;
        }
    }

    public interface g0 {
        Set<String> b();

        String c();

        void d(Set<String> set);

        void f(Set<String> set);

        Set<String> g();

        void h(Set<String> set);

        void i(Set<String> set);

        void j(String str);

        Set<String> l();

        Set<String> m();
    }

    public static class h extends m implements t {
        @Override // w7.g.m, w7.g.n0
        public String n() {
            return "defs";
        }
    }

    public static abstract class h0 extends k0 implements j0, g0 {

        /* renamed from: i, reason: collision with root package name */
        public List<n0> f33937i = new ArrayList();

        /* renamed from: j, reason: collision with root package name */
        public Set<String> f33938j = null;

        /* renamed from: k, reason: collision with root package name */
        public String f33939k = null;

        /* renamed from: l, reason: collision with root package name */
        public Set<String> f33940l = null;

        /* renamed from: m, reason: collision with root package name */
        public Set<String> f33941m = null;

        /* renamed from: n, reason: collision with root package name */
        public Set<String> f33942n = null;

        @Override // w7.g.j0
        public void a(n0 n0Var) {
            this.f33937i.add(n0Var);
        }

        @Override // w7.g.g0
        public Set<String> b() {
            return null;
        }

        @Override // w7.g.g0
        public String c() {
            return this.f33939k;
        }

        @Override // w7.g.g0
        public void d(Set<String> set) {
            this.f33942n = set;
        }

        @Override // w7.g.g0
        public void f(Set<String> set) {
            this.f33938j = set;
        }

        @Override // w7.g.g0
        public Set<String> g() {
            return this.f33938j;
        }

        @Override // w7.g.j0
        public List<n0> getChildren() {
            return this.f33937i;
        }

        @Override // w7.g.g0
        public void h(Set<String> set) {
            this.f33940l = set;
        }

        @Override // w7.g.g0
        public void i(Set<String> set) {
            this.f33941m = set;
        }

        @Override // w7.g.g0
        public void j(String str) {
            this.f33939k = str;
        }

        @Override // w7.g.g0
        public Set<String> l() {
            return this.f33941m;
        }

        @Override // w7.g.g0
        public Set<String> m() {
            return this.f33942n;
        }
    }

    public static class i extends l {

        /* renamed from: o, reason: collision with root package name */
        public p f33943o;

        /* renamed from: p, reason: collision with root package name */
        public p f33944p;

        /* renamed from: q, reason: collision with root package name */
        public p f33945q;

        /* renamed from: r, reason: collision with root package name */
        public p f33946r;

        @Override // w7.g.n0
        public String n() {
            return "ellipse";
        }
    }

    public static abstract class i0 extends k0 implements g0 {

        /* renamed from: i, reason: collision with root package name */
        public Set<String> f33947i = null;

        /* renamed from: j, reason: collision with root package name */
        public String f33948j = null;

        /* renamed from: k, reason: collision with root package name */
        public Set<String> f33949k = null;

        /* renamed from: l, reason: collision with root package name */
        public Set<String> f33950l = null;

        /* renamed from: m, reason: collision with root package name */
        public Set<String> f33951m = null;

        @Override // w7.g.g0
        public Set<String> b() {
            return this.f33949k;
        }

        @Override // w7.g.g0
        public String c() {
            return this.f33948j;
        }

        @Override // w7.g.g0
        public void d(Set<String> set) {
            this.f33951m = set;
        }

        @Override // w7.g.g0
        public void f(Set<String> set) {
            this.f33947i = set;
        }

        @Override // w7.g.g0
        public Set<String> g() {
            return this.f33947i;
        }

        @Override // w7.g.g0
        public void h(Set<String> set) {
            this.f33949k = set;
        }

        @Override // w7.g.g0
        public void i(Set<String> set) {
            this.f33950l = set;
        }

        @Override // w7.g.g0
        public void j(String str) {
            this.f33948j = str;
        }

        @Override // w7.g.g0
        public Set<String> l() {
            return this.f33950l;
        }

        @Override // w7.g.g0
        public Set<String> m() {
            return this.f33951m;
        }
    }

    public static abstract class j extends l0 implements j0 {

        /* renamed from: h, reason: collision with root package name */
        public List<n0> f33952h = new ArrayList();

        /* renamed from: i, reason: collision with root package name */
        public Boolean f33953i;

        /* renamed from: j, reason: collision with root package name */
        public Matrix f33954j;

        /* renamed from: k, reason: collision with root package name */
        public k f33955k;

        /* renamed from: l, reason: collision with root package name */
        public String f33956l;

        @Override // w7.g.j0
        public void a(n0 n0Var) {
            if (n0Var instanceof d0) {
                this.f33952h.add(n0Var);
                return;
            }
            throw new w7.j("Gradient elements cannot contain " + n0Var + " elements.");
        }

        @Override // w7.g.j0
        public List<n0> getChildren() {
            return this.f33952h;
        }
    }

    public interface j0 {
        void a(n0 n0Var);

        List<n0> getChildren();
    }

    public enum k {
        pad,
        reflect,
        repeat
    }

    public static abstract class k0 extends l0 {

        /* renamed from: h, reason: collision with root package name */
        public b f33960h = null;
    }

    public static abstract class l extends i0 implements n {

        /* renamed from: n, reason: collision with root package name */
        public Matrix f33961n;

        @Override // w7.g.n
        public void k(Matrix matrix) {
            this.f33961n = matrix;
        }
    }

    public static abstract class l0 extends n0 {

        /* renamed from: c, reason: collision with root package name */
        public String f33962c = null;

        /* renamed from: d, reason: collision with root package name */
        public Boolean f33963d = null;

        /* renamed from: e, reason: collision with root package name */
        public e0 f33964e = null;

        /* renamed from: f, reason: collision with root package name */
        public e0 f33965f = null;

        /* renamed from: g, reason: collision with root package name */
        public List<String> f33966g = null;

        public String toString() {
            return n();
        }
    }

    public static class m extends h0 implements n {

        /* renamed from: o, reason: collision with root package name */
        public Matrix f33967o;

        @Override // w7.g.n
        public void k(Matrix matrix) {
            this.f33967o = matrix;
        }

        @Override // w7.g.n0
        public String n() {
            return "group";
        }
    }

    public static class m0 extends j {

        /* renamed from: m, reason: collision with root package name */
        public p f33968m;

        /* renamed from: n, reason: collision with root package name */
        public p f33969n;

        /* renamed from: o, reason: collision with root package name */
        public p f33970o;

        /* renamed from: p, reason: collision with root package name */
        public p f33971p;

        @Override // w7.g.n0
        public String n() {
            return "linearGradient";
        }
    }

    public interface n {
        void k(Matrix matrix);
    }

    public static class n0 {

        /* renamed from: a, reason: collision with root package name */
        public g f33972a;
        public j0 b;

        public String n() {
            return "";
        }
    }

    public static class o extends p0 implements n {

        /* renamed from: p, reason: collision with root package name */
        public String f33973p;

        /* renamed from: q, reason: collision with root package name */
        public p f33974q;

        /* renamed from: r, reason: collision with root package name */
        public p f33975r;

        /* renamed from: s, reason: collision with root package name */
        public p f33976s;

        /* renamed from: t, reason: collision with root package name */
        public p f33977t;

        /* renamed from: u, reason: collision with root package name */
        public Matrix f33978u;

        @Override // w7.g.n
        public void k(Matrix matrix) {
            this.f33978u = matrix;
        }

        @Override // w7.g.n0
        public String n() {
            return "image";
        }
    }

    public static abstract class o0 implements Cloneable {
    }

    public static abstract class p0 extends h0 {

        /* renamed from: o, reason: collision with root package name */
        public w7.e f33980o = null;
    }

    public static class q extends l {

        /* renamed from: o, reason: collision with root package name */
        public p f33981o;

        /* renamed from: p, reason: collision with root package name */
        public p f33982p;

        /* renamed from: q, reason: collision with root package name */
        public p f33983q;

        /* renamed from: r, reason: collision with root package name */
        public p f33984r;

        @Override // w7.g.n0
        public String n() {
            return "line";
        }
    }

    public static class q0 extends j {

        /* renamed from: m, reason: collision with root package name */
        public p f33985m;

        /* renamed from: n, reason: collision with root package name */
        public p f33986n;

        /* renamed from: o, reason: collision with root package name */
        public p f33987o;

        /* renamed from: p, reason: collision with root package name */
        public p f33988p;

        /* renamed from: q, reason: collision with root package name */
        public p f33989q;

        @Override // w7.g.n0
        public String n() {
            return "radialGradient";
        }
    }

    public static class r extends r0 implements t {

        /* renamed from: q, reason: collision with root package name */
        public boolean f33990q;

        /* renamed from: r, reason: collision with root package name */
        public p f33991r;

        /* renamed from: s, reason: collision with root package name */
        public p f33992s;

        /* renamed from: t, reason: collision with root package name */
        public p f33993t;

        /* renamed from: u, reason: collision with root package name */
        public p f33994u;

        /* renamed from: v, reason: collision with root package name */
        public Float f33995v;

        @Override // w7.g.n0
        public String n() {
            return "marker";
        }
    }

    public static abstract class r0 extends p0 {

        /* renamed from: p, reason: collision with root package name */
        public b f33996p;
    }

    public static class s extends h0 implements t {

        /* renamed from: o, reason: collision with root package name */
        public Boolean f33997o;

        /* renamed from: p, reason: collision with root package name */
        public Boolean f33998p;

        /* renamed from: q, reason: collision with root package name */
        public p f33999q;

        /* renamed from: r, reason: collision with root package name */
        public p f34000r;

        /* renamed from: s, reason: collision with root package name */
        public p f34001s;

        /* renamed from: t, reason: collision with root package name */
        public p f34002t;

        @Override // w7.g.n0
        public String n() {
            return "mask";
        }
    }

    public static class s0 extends m {
        @Override // w7.g.m, w7.g.n0
        public String n() {
            return "switch";
        }
    }

    public interface t {
    }

    public static class t0 extends r0 implements t {
        @Override // w7.g.n0
        public String n() {
            return "symbol";
        }
    }

    public static class u extends o0 {

        /* renamed from: a, reason: collision with root package name */
        public String f34003a;
        public o0 b;

        public u(String str, o0 o0Var) {
            this.f34003a = str;
            this.b = o0Var;
        }

        public String toString() {
            return this.f34003a + " " + this.b;
        }
    }

    public static class u0 extends y0 implements x0 {

        /* renamed from: o, reason: collision with root package name */
        public String f34004o;

        /* renamed from: p, reason: collision with root package name */
        public b1 f34005p;

        @Override // w7.g.x0
        public b1 e() {
            return this.f34005p;
        }

        @Override // w7.g.n0
        public String n() {
            return "tref";
        }

        public void o(b1 b1Var) {
            this.f34005p = b1Var;
        }
    }

    public static class v extends l {

        /* renamed from: o, reason: collision with root package name */
        public w f34006o;

        /* renamed from: p, reason: collision with root package name */
        public Float f34007p;

        @Override // w7.g.n0
        public String n() {
            return "path";
        }
    }

    public static class v0 extends a1 implements x0 {

        /* renamed from: s, reason: collision with root package name */
        public b1 f34008s;

        @Override // w7.g.x0
        public b1 e() {
            return this.f34008s;
        }

        @Override // w7.g.n0
        public String n() {
            return "tspan";
        }

        public void o(b1 b1Var) {
            this.f34008s = b1Var;
        }
    }

    public static class w implements x {
        public int b = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f34011d = 0;

        /* renamed from: a, reason: collision with root package name */
        public byte[] f34009a = new byte[8];

        /* renamed from: c, reason: collision with root package name */
        public float[] f34010c = new float[16];

        @Override // w7.g.x
        public void a(float f10, float f11, float f12, float f13) {
            f((byte) 3);
            g(4);
            float[] fArr = this.f34010c;
            int i10 = this.f34011d;
            int i11 = i10 + 1;
            this.f34011d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f34011d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f34011d = i13;
            fArr[i12] = f12;
            this.f34011d = i10 + 4;
            fArr[i13] = f13;
        }

        @Override // w7.g.x
        public void b(float f10, float f11) {
            f((byte) 0);
            g(2);
            float[] fArr = this.f34010c;
            int i10 = this.f34011d;
            int i11 = i10 + 1;
            this.f34011d = i11;
            fArr[i10] = f10;
            this.f34011d = i10 + 2;
            fArr[i11] = f11;
        }

        @Override // w7.g.x
        public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            f((byte) 2);
            g(6);
            float[] fArr = this.f34010c;
            int i10 = this.f34011d;
            int i11 = i10 + 1;
            this.f34011d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f34011d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f34011d = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.f34011d = i14;
            fArr[i13] = f13;
            int i15 = i10 + 5;
            this.f34011d = i15;
            fArr[i14] = f14;
            this.f34011d = i10 + 6;
            fArr[i15] = f15;
        }

        @Override // w7.g.x
        public void close() {
            f((byte) 8);
        }

        @Override // w7.g.x
        public void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            f((byte) ((z10 ? 2 : 0) | 4 | (z11 ? 1 : 0)));
            g(5);
            float[] fArr = this.f34010c;
            int i10 = this.f34011d;
            int i11 = i10 + 1;
            this.f34011d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f34011d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f34011d = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.f34011d = i14;
            fArr[i13] = f13;
            this.f34011d = i10 + 5;
            fArr[i14] = f14;
        }

        @Override // w7.g.x
        public void e(float f10, float f11) {
            f((byte) 1);
            g(2);
            float[] fArr = this.f34010c;
            int i10 = this.f34011d;
            int i11 = i10 + 1;
            this.f34011d = i11;
            fArr[i10] = f10;
            this.f34011d = i10 + 2;
            fArr[i11] = f11;
        }

        public final void f(byte b) {
            int i10 = this.b;
            byte[] bArr = this.f34009a;
            if (i10 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f34009a = bArr2;
            }
            byte[] bArr3 = this.f34009a;
            int i11 = this.b;
            this.b = i11 + 1;
            bArr3[i11] = b;
        }

        public final void g(int i10) {
            float[] fArr = this.f34010c;
            if (fArr.length < this.f34011d + i10) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f34010c = fArr2;
            }
        }

        public void h(x xVar) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.b; i11++) {
                byte b = this.f34009a[i11];
                if (b == 0) {
                    float[] fArr = this.f34010c;
                    int i12 = i10 + 1;
                    float f10 = fArr[i10];
                    i10 += 2;
                    xVar.b(f10, fArr[i12]);
                } else if (b == 1) {
                    float[] fArr2 = this.f34010c;
                    int i13 = i10 + 1;
                    float f11 = fArr2[i10];
                    i10 += 2;
                    xVar.e(f11, fArr2[i13]);
                } else if (b == 2) {
                    float[] fArr3 = this.f34010c;
                    xVar.c(fArr3[i10], fArr3[i10 + 1], fArr3[i10 + 2], fArr3[i10 + 3], fArr3[i10 + 4], fArr3[i10 + 5]);
                    i10 += 6;
                } else if (b == 3) {
                    float[] fArr4 = this.f34010c;
                    float f12 = fArr4[i10];
                    float f13 = fArr4[i10 + 1];
                    int i14 = i10 + 3;
                    float f14 = fArr4[i10 + 2];
                    i10 += 4;
                    xVar.a(f12, f13, f14, fArr4[i14]);
                } else if (b != 8) {
                    boolean z10 = (b & 2) != 0;
                    boolean z11 = (b & 1) != 0;
                    float[] fArr5 = this.f34010c;
                    xVar.d(fArr5[i10], fArr5[i10 + 1], fArr5[i10 + 2], z10, z11, fArr5[i10 + 3], fArr5[i10 + 4]);
                    i10 += 5;
                } else {
                    xVar.close();
                }
            }
        }

        public boolean i() {
            return this.b == 0;
        }
    }

    public static class w0 extends a1 implements b1, n {

        /* renamed from: s, reason: collision with root package name */
        public Matrix f34012s;

        @Override // w7.g.n
        public void k(Matrix matrix) {
            this.f34012s = matrix;
        }

        @Override // w7.g.n0
        public String n() {
            return Text.type;
        }
    }

    public interface x {
        void a(float f10, float f11, float f12, float f13);

        void b(float f10, float f11);

        void c(float f10, float f11, float f12, float f13, float f14, float f15);

        void close();

        void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14);

        void e(float f10, float f11);
    }

    public interface x0 {
        b1 e();
    }

    public static class y extends r0 implements t {

        /* renamed from: q, reason: collision with root package name */
        public Boolean f34013q;

        /* renamed from: r, reason: collision with root package name */
        public Boolean f34014r;

        /* renamed from: s, reason: collision with root package name */
        public Matrix f34015s;

        /* renamed from: t, reason: collision with root package name */
        public p f34016t;

        /* renamed from: u, reason: collision with root package name */
        public p f34017u;

        /* renamed from: v, reason: collision with root package name */
        public p f34018v;

        /* renamed from: w, reason: collision with root package name */
        public p f34019w;

        /* renamed from: x, reason: collision with root package name */
        public String f34020x;

        @Override // w7.g.n0
        public String n() {
            return "pattern";
        }
    }

    public static abstract class y0 extends h0 {
        @Override // w7.g.h0, w7.g.j0
        public void a(n0 n0Var) {
            if (n0Var instanceof x0) {
                this.f33937i.add(n0Var);
                return;
            }
            throw new w7.j("Text content elements cannot contain " + n0Var + " elements.");
        }
    }

    public static class z extends l {

        /* renamed from: o, reason: collision with root package name */
        public float[] f34021o;

        @Override // w7.g.n0
        public String n() {
            return "polyline";
        }
    }

    public static class z0 extends y0 implements x0 {

        /* renamed from: o, reason: collision with root package name */
        public String f34022o;

        /* renamed from: p, reason: collision with root package name */
        public p f34023p;

        /* renamed from: q, reason: collision with root package name */
        public b1 f34024q;

        @Override // w7.g.x0
        public b1 e() {
            return this.f34024q;
        }

        @Override // w7.g.n0
        public String n() {
            return "textPath";
        }

        public void o(b1 b1Var) {
            this.f34024q = b1Var;
        }
    }

    public static w7.i k() {
        return null;
    }

    public static g l(InputStream inputStream) {
        return new w7.k().z(inputStream, f33834g);
    }

    public void a(b.r rVar) {
        this.f33838e.b(rVar);
    }

    public void b() {
        this.f33838e.e(b.u.RenderOptions);
    }

    public final String c(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    public List<b.p> d() {
        return this.f33838e.c();
    }

    public final b e(float f10) {
        d1 d1Var;
        d1 d1Var2;
        d1 d1Var3;
        d1 d1Var4;
        float f11;
        d1 d1Var5;
        f0 f0Var = this.f33835a;
        p pVar = f0Var.f33933s;
        p pVar2 = f0Var.f33934t;
        if (pVar == null || pVar.j() || (d1Var = pVar.b) == (d1Var2 = d1.percent) || d1Var == (d1Var3 = d1.em) || d1Var == (d1Var4 = d1.ex)) {
            return new b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float b10 = pVar.b(f10);
        if (pVar2 == null) {
            b bVar = this.f33835a.f33996p;
            f11 = bVar != null ? (bVar.f33847d * b10) / bVar.f33846c : b10;
        } else {
            if (pVar2.j() || (d1Var5 = pVar2.b) == d1Var2 || d1Var5 == d1Var3 || d1Var5 == d1Var4) {
                return new b(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            f11 = pVar2.b(f10);
        }
        return new b(0.0f, 0.0f, b10, f11);
    }

    public float f() {
        if (this.f33835a != null) {
            return e(this.f33837d).f33847d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public RectF g() {
        f0 f0Var = this.f33835a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        b bVar = f0Var.f33996p;
        if (bVar == null) {
            return null;
        }
        return bVar.d();
    }

    public float h() {
        if (this.f33835a != null) {
            return e(this.f33837d).f33846c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public l0 i(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f33835a.f33962c)) {
            return this.f33835a;
        }
        if (this.f33839f.containsKey(str)) {
            return this.f33839f.get(str);
        }
        l0 j10 = j(this.f33835a, str);
        this.f33839f.put(str, j10);
        return j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l0 j(j0 j0Var, String str) {
        l0 j10;
        l0 l0Var = (l0) j0Var;
        if (str.equals(l0Var.f33962c)) {
            return l0Var;
        }
        for (Object obj : j0Var.getChildren()) {
            if (obj instanceof l0) {
                l0 l0Var2 = (l0) obj;
                if (str.equals(l0Var2.f33962c)) {
                    return l0Var2;
                }
                if ((obj instanceof j0) && (j10 = j((j0) obj, str)) != null) {
                    return j10;
                }
            }
        }
        return null;
    }

    public f0 m() {
        return this.f33835a;
    }

    public boolean n() {
        return !this.f33838e.d();
    }

    public void o(Canvas canvas, w7.f fVar) {
        if (fVar == null) {
            fVar = new w7.f();
        }
        if (!fVar.g()) {
            fVar.h(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new w7.h(canvas, this.f33837d).G0(this, fVar);
    }

    public n0 p(String str) {
        if (str == null) {
            return null;
        }
        String c10 = c(str);
        if (c10.length() <= 1 || !c10.startsWith("#")) {
            return null;
        }
        return i(c10.substring(1));
    }

    public void q(String str) {
        this.f33836c = str;
    }

    public void r(String str) {
        f0 f0Var = this.f33835a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f0Var.f33934t = w7.k.o0(str);
    }

    public void s(float f10, float f11, float f12, float f13) {
        f0 f0Var = this.f33835a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f0Var.f33996p = new b(f10, f11, f12, f13);
    }

    public void t(String str) {
        f0 f0Var = this.f33835a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f0Var.f33933s = w7.k.o0(str);
    }

    public void u(f0 f0Var) {
        this.f33835a = f0Var;
    }

    public void v(String str) {
        this.b = str;
    }

    public static class p implements Cloneable {

        /* renamed from: a, reason: collision with root package name */
        public float f33979a;
        public d1 b;

        public p(float f10, d1 d1Var) {
            this.f33979a = f10;
            this.b = d1Var;
        }

        public float a() {
            return this.f33979a;
        }

        public float b(float f10) {
            int i10 = a.f33840a[this.b.ordinal()];
            if (i10 == 1) {
                return this.f33979a;
            }
            switch (i10) {
                case 4:
                    return this.f33979a * f10;
                case 5:
                    return (this.f33979a * f10) / 2.54f;
                case 6:
                    return (this.f33979a * f10) / 25.4f;
                case 7:
                    return (this.f33979a * f10) / 72.0f;
                case 8:
                    return (this.f33979a * f10) / 6.0f;
                default:
                    return this.f33979a;
            }
        }

        public float c(w7.h hVar) {
            if (this.b != d1.percent) {
                return f(hVar);
            }
            b S = hVar.S();
            if (S == null) {
                return this.f33979a;
            }
            float f10 = S.f33846c;
            if (f10 == S.f33847d) {
                return (this.f33979a * f10) / 100.0f;
            }
            return (this.f33979a * ((float) (Math.sqrt((f10 * f10) + (r6 * r6)) / 1.414213562373095d))) / 100.0f;
        }

        public float e(w7.h hVar, float f10) {
            return this.b == d1.percent ? (this.f33979a * f10) / 100.0f : f(hVar);
        }

        public float f(w7.h hVar) {
            switch (a.f33840a[this.b.ordinal()]) {
                case 9:
                    b S = hVar.S();
                    if (S != null) {
                        break;
                    } else {
                        break;
                    }
            }
            return this.f33979a;
        }

        public float h(w7.h hVar) {
            if (this.b != d1.percent) {
                return f(hVar);
            }
            b S = hVar.S();
            return S == null ? this.f33979a : (this.f33979a * S.f33847d) / 100.0f;
        }

        public boolean i() {
            return this.f33979a < 0.0f;
        }

        public boolean j() {
            return this.f33979a == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.f33979a) + this.b;
        }

        public p(float f10) {
            this.f33979a = f10;
            this.b = d1.px;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public float f33845a;
        public float b;

        /* renamed from: c, reason: collision with root package name */
        public float f33846c;

        /* renamed from: d, reason: collision with root package name */
        public float f33847d;

        public b(float f10, float f11, float f12, float f13) {
            this.f33845a = f10;
            this.b = f11;
            this.f33846c = f12;
            this.f33847d = f13;
        }

        public static b a(float f10, float f11, float f12, float f13) {
            return new b(f10, f11, f12 - f10, f13 - f11);
        }

        public float b() {
            return this.f33845a + this.f33846c;
        }

        public float c() {
            return this.b + this.f33847d;
        }

        public RectF d() {
            return new RectF(this.f33845a, this.b, b(), c());
        }

        public void e(b bVar) {
            float f10 = bVar.f33845a;
            if (f10 < this.f33845a) {
                this.f33845a = f10;
            }
            float f11 = bVar.b;
            if (f11 < this.b) {
                this.b = f11;
            }
            if (bVar.b() > b()) {
                this.f33846c = bVar.b() - this.f33845a;
            }
            if (bVar.c() > c()) {
                this.f33847d = bVar.c() - this.b;
            }
        }

        public String toString() {
            return "[" + this.f33845a + " " + this.b + " " + this.f33846c + " " + this.f33847d + "]";
        }

        public b(b bVar) {
            this.f33845a = bVar.f33845a;
            this.b = bVar.b;
            this.f33846c = bVar.f33846c;
            this.f33847d = bVar.f33847d;
        }
    }
}

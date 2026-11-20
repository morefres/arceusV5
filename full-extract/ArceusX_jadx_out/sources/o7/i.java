package o7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import f7.h0;
import f7.o0;
import i7.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l7.b;
import m7.k;
import m7.l;
import m7.m;
import n7.q;
import n7.u;

/* loaded from: classes3.dex */
public class i extends o7.b {
    public final StringBuilder E;
    public final RectF F;
    public final Matrix G;
    public final Paint H;
    public final Paint I;
    public final Map<l7.d, List<h7.d>> J;
    public final w1.g<String> K;
    public final List<d> L;
    public final o M;
    public final h0 N;
    public final f7.i O;
    public u P;
    public i7.a<Integer, Integer> Q;
    public i7.a<Integer, Integer> R;
    public i7.a<Integer, Integer> S;
    public i7.a<Integer, Integer> T;
    public i7.a<Float, Float> U;
    public i7.a<Float, Float> V;
    public i7.a<Float, Float> W;
    public i7.a<Float, Float> X;
    public i7.a<Integer, Integer> Y;
    public i7.a<Float, Float> Z;

    /* renamed from: a0, reason: collision with root package name */
    public i7.a<Typeface, Typeface> f27817a0;

    /* renamed from: b0, reason: collision with root package name */
    public i7.a<Integer, Integer> f27818b0;

    /* renamed from: c0, reason: collision with root package name */
    public i7.a<Integer, Integer> f27819c0;

    /* renamed from: d0, reason: collision with root package name */
    public i7.a<Integer, Integer> f27820d0;

    public class a extends Paint {
        public a(int i10) {
            super(i10);
            setStyle(Paint.Style.FILL);
        }
    }

    public class b extends Paint {
        public b(int i10) {
            super(i10);
            setStyle(Paint.Style.STROKE);
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27823a;

        static {
            int[] iArr = new int[b.a.values().length];
            f27823a = iArr;
            try {
                iArr[b.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27823a[b.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27823a[b.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i(h0 h0Var, e eVar) {
        super(h0Var, eVar);
        l lVar;
        l lVar2;
        m7.d dVar;
        l lVar3;
        m7.d dVar2;
        l lVar4;
        m7.d dVar3;
        m mVar;
        m7.d dVar4;
        m mVar2;
        m7.b bVar;
        m mVar3;
        m7.b bVar2;
        m mVar4;
        m7.a aVar;
        m mVar5;
        m7.a aVar2;
        this.E = new StringBuilder(2);
        this.F = new RectF();
        this.G = new Matrix();
        this.H = new a(1);
        this.I = new b(1);
        this.J = new HashMap();
        this.K = new w1.g<>();
        this.L = new ArrayList();
        this.P = u.INDEX;
        this.N = h0Var;
        this.O = eVar.c();
        o a10 = eVar.t().a();
        this.M = a10;
        a10.a(this);
        j(a10);
        k u8 = eVar.u();
        if (u8 != null && (mVar5 = u8.f24381a) != null && (aVar2 = mVar5.f24385a) != null) {
            i7.a<Integer, Integer> a11 = aVar2.a();
            this.Q = a11;
            a11.a(this);
            j(this.Q);
        }
        if (u8 != null && (mVar4 = u8.f24381a) != null && (aVar = mVar4.b) != null) {
            i7.a<Integer, Integer> a12 = aVar.a();
            this.S = a12;
            a12.a(this);
            j(this.S);
        }
        if (u8 != null && (mVar3 = u8.f24381a) != null && (bVar2 = mVar3.f24386c) != null) {
            i7.d a13 = bVar2.a();
            this.U = a13;
            a13.a(this);
            j(this.U);
        }
        if (u8 != null && (mVar2 = u8.f24381a) != null && (bVar = mVar2.f24387d) != null) {
            i7.d a14 = bVar.a();
            this.W = a14;
            a14.a(this);
            j(this.W);
        }
        if (u8 != null && (mVar = u8.f24381a) != null && (dVar4 = mVar.f24388e) != null) {
            i7.a<Integer, Integer> a15 = dVar4.a();
            this.Y = a15;
            a15.a(this);
            j(this.Y);
        }
        if (u8 != null && (lVar4 = u8.b) != null && (dVar3 = lVar4.f24382a) != null) {
            i7.a<Integer, Integer> a16 = dVar3.a();
            this.f27818b0 = a16;
            a16.a(this);
            j(this.f27818b0);
        }
        if (u8 != null && (lVar3 = u8.b) != null && (dVar2 = lVar3.b) != null) {
            i7.a<Integer, Integer> a17 = dVar2.a();
            this.f27819c0 = a17;
            a17.a(this);
            j(this.f27819c0);
        }
        if (u8 != null && (lVar2 = u8.b) != null && (dVar = lVar2.f24383c) != null) {
            i7.a<Integer, Integer> a18 = dVar.a();
            this.f27820d0 = a18;
            a18.a(this);
            j(this.f27820d0);
        }
        if (u8 == null || (lVar = u8.b) == null) {
            return;
        }
        this.P = lVar.f24384d;
    }

    public final String P(String str, int i10) {
        int codePointAt = str.codePointAt(i10);
        int charCount = Character.charCount(codePointAt) + i10;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!e0(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j10 = codePointAt;
        if (this.K.c(j10)) {
            return this.K.e(j10);
        }
        this.E.setLength(0);
        while (i10 < charCount) {
            int codePointAt3 = str.codePointAt(i10);
            this.E.appendCodePoint(codePointAt3);
            i10 += Character.charCount(codePointAt3);
        }
        String sb2 = this.E.toString();
        this.K.i(j10, sb2);
        return sb2;
    }

    public final void Q(l7.b bVar, int i10, int i11) {
        i7.a<Integer, Integer> aVar = this.R;
        if (aVar != null) {
            this.H.setColor(aVar.h().intValue());
        } else if (this.Q == null || !d0(i11)) {
            this.H.setColor(bVar.f23251h);
        } else {
            this.H.setColor(this.Q.h().intValue());
        }
        i7.a<Integer, Integer> aVar2 = this.T;
        if (aVar2 != null) {
            this.I.setColor(aVar2.h().intValue());
        } else if (this.S == null || !d0(i11)) {
            this.I.setColor(bVar.f23252i);
        } else {
            this.I.setColor(this.S.h().intValue());
        }
        int i12 = 100;
        int intValue = this.f27775x.h() == null ? 100 : this.f27775x.h().h().intValue();
        if (this.Y != null && d0(i11)) {
            i12 = this.Y.h().intValue();
        }
        int round = Math.round(((((intValue * 255.0f) / 100.0f) * (i12 / 100.0f)) * i10) / 255.0f);
        this.H.setAlpha(round);
        this.I.setAlpha(round);
        i7.a<Float, Float> aVar3 = this.V;
        if (aVar3 != null) {
            this.I.setStrokeWidth(aVar3.h().floatValue());
        } else if (this.U == null || !d0(i11)) {
            this.I.setStrokeWidth(bVar.f23253j * s7.m.e());
        } else {
            this.I.setStrokeWidth(this.U.h().floatValue());
        }
    }

    public final void R(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public final void S(l7.d dVar, float f10, l7.b bVar, Canvas canvas, int i10, int i11) {
        Q(bVar, i11, i10);
        List<h7.d> a02 = a0(dVar);
        for (int i12 = 0; i12 < a02.size(); i12++) {
            Path path = a02.get(i12).getPath();
            path.computeBounds(this.F, false);
            this.G.reset();
            this.G.preTranslate(0.0f, (-bVar.f23250g) * s7.m.e());
            this.G.preScale(f10, f10);
            path.transform(this.G);
            if (bVar.f23254k) {
                V(path, this.H, canvas);
                V(path, this.I, canvas);
            } else {
                V(path, this.I, canvas);
                V(path, this.H, canvas);
            }
        }
    }

    public final void T(String str, l7.b bVar, Canvas canvas, int i10, int i11) {
        Q(bVar, i11, i10);
        if (bVar.f23254k) {
            R(str, this.H, canvas);
            R(str, this.I, canvas);
        } else {
            R(str, this.I, canvas);
            R(str, this.H, canvas);
        }
    }

    public final void U(String str, l7.b bVar, Canvas canvas, float f10, int i10, int i11) {
        int i12 = 0;
        while (i12 < str.length()) {
            String P = P(str, i12);
            l7.b bVar2 = bVar;
            Canvas canvas2 = canvas;
            T(P, bVar2, canvas2, i10 + i12, i11);
            canvas2.translate(this.H.measureText(P) + f10, 0.0f);
            i12 += P.length();
            bVar = bVar2;
            canvas = canvas2;
        }
    }

    public final void V(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    public final void W(String str, l7.b bVar, l7.c cVar, Canvas canvas, float f10, float f11, float f12, int i10) {
        l7.b bVar2;
        Canvas canvas2;
        float f13;
        int i11;
        int i12 = 0;
        while (i12 < str.length()) {
            l7.d e10 = this.O.c().e(l7.d.c(str.charAt(i12), cVar.a(), cVar.c()));
            if (e10 == null) {
                bVar2 = bVar;
                canvas2 = canvas;
                f13 = f11;
                i11 = i10;
            } else {
                bVar2 = bVar;
                canvas2 = canvas;
                f13 = f11;
                i11 = i10;
                S(e10, f13, bVar2, canvas2, i12, i11);
                canvas2.translate((((float) e10.b()) * f13 * s7.m.e()) + f12, 0.0f);
            }
            i12++;
            f11 = f13;
            bVar = bVar2;
            canvas = canvas2;
            i10 = i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X(l7.b r18, l7.c r19, android.graphics.Canvas r20, int r21) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.i.X(l7.b, l7.c, android.graphics.Canvas, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y(l7.b r17, android.graphics.Matrix r18, l7.c r19, android.graphics.Canvas r20, int r21) {
        /*
            r16 = this;
            r0 = r16
            r7 = r17
            i7.a<java.lang.Float, java.lang.Float> r1 = r0.Z
            if (r1 == 0) goto L13
            java.lang.Object r1 = r1.h()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L15
        L13:
            float r1 = r7.f23246c
        L15:
            r2 = 1120403456(0x42c80000, float:100.0)
            float r4 = r1 / r2
            float r8 = s7.m.g(r18)
            java.lang.String r1 = r7.f23245a
            java.util.List r9 = r0.b0(r1)
            int r10 = r9.size()
            int r1 = r7.f23248e
            float r1 = (float) r1
            r2 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 / r2
            i7.a<java.lang.Float, java.lang.Float> r2 = r0.X
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r2.h()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
        L3b:
            float r1 = r1 + r2
        L3c:
            r5 = r1
            goto L4d
        L3e:
            i7.a<java.lang.Float, java.lang.Float> r2 = r0.W
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r2.h()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            goto L3b
        L4d:
            r11 = 0
            r1 = -1
            r12 = r1
            r13 = r11
        L51:
            if (r13 >= r10) goto Lb0
            java.lang.Object r1 = r9.get(r13)
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r2 = r7.f23256m
            if (r2 != 0) goto L5f
            r2 = 0
            goto L61
        L5f:
            float r2 = r2.x
        L61:
            r6 = 1
            r3 = r19
            java.util.List r14 = r0.g0(r1, r2, r3, r4, r5, r6)
            r15 = r11
        L69:
            int r1 = r14.size()
            if (r15 >= r1) goto La6
            java.lang.Object r1 = r14.get(r15)
            o7.i$d r1 = (o7.i.d) r1
            int r12 = r12 + 1
            r20.save()
            float r2 = o7.i.d.a(r1)
            r3 = r20
            boolean r2 = r0.f0(r3, r7, r12, r2)
            if (r2 == 0) goto L98
            java.lang.String r1 = o7.i.d.b(r1)
            r6 = r4
            r2 = r7
            r4 = r3
            r7 = r5
            r5 = r8
            r3 = r19
            r8 = r21
            r0.W(r1, r2, r3, r4, r5, r6, r7, r8)
            r4 = r6
            goto L9a
        L98:
            r7 = r5
            r5 = r8
        L9a:
            r20.restore()
            int r15 = r15 + 1
            r0 = r16
            r8 = r5
            r5 = r7
            r7 = r17
            goto L69
        La6:
            r7 = r5
            r5 = r8
            int r13 = r13 + 1
            r0 = r16
            r5 = r7
            r7 = r17
            goto L51
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.i.Y(l7.b, android.graphics.Matrix, l7.c, android.graphics.Canvas, int):void");
    }

    public final d Z(int i10) {
        for (int size = this.L.size(); size < i10; size++) {
            this.L.add(new d(null));
        }
        return this.L.get(i10 - 1);
    }

    public final List<h7.d> a0(l7.d dVar) {
        if (this.J.containsKey(dVar)) {
            return this.J.get(dVar);
        }
        List<q> a10 = dVar.a();
        int size = a10.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new h7.d(this.N, this, a10.get(i10), this.O));
        }
        this.J.put(dVar, arrayList);
        return arrayList;
    }

    public final List<String> b0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    @Override // o7.b, l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        super.c(t8, cVar);
        if (t8 == o0.f16982a) {
            i7.a<Integer, Integer> aVar = this.R;
            if (aVar != null) {
                H(aVar);
            }
            if (cVar == null) {
                this.R = null;
                return;
            }
            i7.q qVar = new i7.q(cVar);
            this.R = qVar;
            qVar.a(this);
            j(this.R);
            return;
        }
        if (t8 == o0.b) {
            i7.a<Integer, Integer> aVar2 = this.T;
            if (aVar2 != null) {
                H(aVar2);
            }
            if (cVar == null) {
                this.T = null;
                return;
            }
            i7.q qVar2 = new i7.q(cVar);
            this.T = qVar2;
            qVar2.a(this);
            j(this.T);
            return;
        }
        if (t8 == o0.f16999s) {
            i7.a<Float, Float> aVar3 = this.V;
            if (aVar3 != null) {
                H(aVar3);
            }
            if (cVar == null) {
                this.V = null;
                return;
            }
            i7.q qVar3 = new i7.q(cVar);
            this.V = qVar3;
            qVar3.a(this);
            j(this.V);
            return;
        }
        if (t8 == o0.f17000t) {
            i7.a<Float, Float> aVar4 = this.X;
            if (aVar4 != null) {
                H(aVar4);
            }
            if (cVar == null) {
                this.X = null;
                return;
            }
            i7.q qVar4 = new i7.q(cVar);
            this.X = qVar4;
            qVar4.a(this);
            j(this.X);
            return;
        }
        if (t8 == o0.F) {
            i7.a<Float, Float> aVar5 = this.Z;
            if (aVar5 != null) {
                H(aVar5);
            }
            if (cVar == null) {
                this.Z = null;
                return;
            }
            i7.q qVar5 = new i7.q(cVar);
            this.Z = qVar5;
            qVar5.a(this);
            j(this.Z);
            return;
        }
        if (t8 != o0.M) {
            if (t8 == o0.O) {
                this.M.s(cVar);
                return;
            }
            return;
        }
        i7.a<Typeface, Typeface> aVar6 = this.f27817a0;
        if (aVar6 != null) {
            H(aVar6);
        }
        if (cVar == null) {
            this.f27817a0 = null;
            return;
        }
        i7.q qVar6 = new i7.q(cVar);
        this.f27817a0 = qVar6;
        qVar6.a(this);
        j(this.f27817a0);
    }

    public final Typeface c0(l7.c cVar) {
        Typeface h10;
        i7.a<Typeface, Typeface> aVar = this.f27817a0;
        if (aVar != null && (h10 = aVar.h()) != null) {
            return h10;
        }
        Typeface b02 = this.N.b0(cVar);
        return b02 != null ? b02 : cVar.d();
    }

    public final boolean d0(int i10) {
        int length = this.M.h().f23245a.length();
        i7.a<Integer, Integer> aVar = this.f27818b0;
        if (aVar == null || this.f27819c0 == null) {
            return true;
        }
        int min = Math.min(aVar.h().intValue(), this.f27819c0.h().intValue());
        int max = Math.max(this.f27818b0.h().intValue(), this.f27819c0.h().intValue());
        i7.a<Integer, Integer> aVar2 = this.f27820d0;
        if (aVar2 != null) {
            int intValue = aVar2.h().intValue();
            min += intValue;
            max += intValue;
        }
        if (this.P == u.INDEX) {
            return i10 >= min && i10 < max;
        }
        float f10 = (i10 / length) * 100.0f;
        return f10 >= ((float) min) && f10 < ((float) max);
    }

    @Override // o7.b, h7.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, this.O.b().width(), this.O.b().height());
    }

    public final boolean e0(int i10) {
        return Character.getType(i10) == 16 || Character.getType(i10) == 27 || Character.getType(i10) == 6 || Character.getType(i10) == 28 || Character.getType(i10) == 8 || Character.getType(i10) == 19;
    }

    public final boolean f0(Canvas canvas, l7.b bVar, int i10, float f10) {
        PointF pointF = bVar.f23255l;
        PointF pointF2 = bVar.f23256m;
        float e10 = s7.m.e();
        float f11 = (i10 * bVar.f23249f * e10) + (pointF == null ? 0.0f : (bVar.f23249f * e10) + pointF.y);
        if (this.N.H() && pointF2 != null && pointF != null && f11 >= pointF.y + pointF2.y + bVar.f23246c) {
            return false;
        }
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int i11 = c.f27823a[bVar.f23247d.ordinal()];
        if (i11 == 1) {
            canvas.translate(f12, f11);
        } else if (i11 == 2) {
            canvas.translate((f12 + f13) - f10, f11);
        } else if (i11 == 3) {
            canvas.translate((f12 + (f13 / 2.0f)) - (f10 / 2.0f), f11);
        }
        return true;
    }

    public final List<d> g0(String str, float f10, l7.c cVar, float f11, float f12, boolean z10) {
        float measureText;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char charAt = str.charAt(i13);
            if (z10) {
                l7.d e10 = this.O.c().e(l7.d.c(charAt, cVar.a(), cVar.c()));
                if (e10 != null) {
                    measureText = ((float) e10.b()) * f11 * s7.m.e();
                }
            } else {
                measureText = this.H.measureText(str.substring(i13, i13 + 1));
            }
            float f16 = measureText + f12;
            if (charAt == ' ') {
                z11 = true;
                f15 = f16;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f14 = f16;
            } else {
                f14 += f16;
            }
            f13 += f16;
            if (f10 > 0.0f && f13 >= f10 && charAt != ' ') {
                i10++;
                d Z = Z(i10);
                if (i12 == i11) {
                    Z.c(str.substring(i11, i13).trim(), (f13 - f16) - ((r9.length() - r7.length()) * f15));
                    i11 = i13;
                    i12 = i11;
                    f13 = f16;
                    f14 = f13;
                } else {
                    Z.c(str.substring(i11, i12 - 1).trim(), ((f13 - f14) - ((r7.length() - r13.length()) * f15)) - f15);
                    f13 = f14;
                    i11 = i12;
                }
            }
        }
        if (f13 > 0.0f) {
            i10++;
            Z(i10).c(str.substring(i11), f13);
        }
        return this.L.subList(0, i10);
    }

    @Override // o7.b
    public void u(Canvas canvas, Matrix matrix, int i10, s7.b bVar) {
        Canvas canvas2;
        l7.b h10 = this.M.h();
        l7.c cVar = this.O.g().get(h10.b);
        if (cVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        Q(h10, i10, 0);
        if (this.N.X0()) {
            canvas2 = canvas;
            Y(h10, matrix, cVar, canvas2, i10);
        } else {
            canvas2 = canvas;
            X(h10, cVar, canvas2, i10);
        }
        canvas2.restore();
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public String f27824a;
        public float b;

        public d() {
            this.f27824a = "";
            this.b = 0.0f;
        }

        public void c(String str, float f10) {
            this.f27824a = str;
            this.b = f10;
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }
}

package n2;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class f {
    public static a a(a aVar, int i10, int i11, boolean z10, int i12) {
        return aVar != null ? aVar : z10 ? new a(i10, i12, i11) : new a(i10, i11);
    }

    public static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray i10 = k.i(resources, theme, attributeSet, j2.g.F);
        float f10 = k.f(i10, xmlPullParser, "startX", j2.g.O, 0.0f);
        float f11 = k.f(i10, xmlPullParser, "startY", j2.g.P, 0.0f);
        float f12 = k.f(i10, xmlPullParser, "endX", j2.g.Q, 0.0f);
        float f13 = k.f(i10, xmlPullParser, "endY", j2.g.R, 0.0f);
        float f14 = k.f(i10, xmlPullParser, "centerX", j2.g.J, 0.0f);
        float f15 = k.f(i10, xmlPullParser, "centerY", j2.g.K, 0.0f);
        int g10 = k.g(i10, xmlPullParser, Payload.TYPE, j2.g.I, 0);
        int b = k.b(i10, xmlPullParser, "startColor", j2.g.G, 0);
        boolean h10 = k.h(xmlPullParser, "centerColor");
        int b10 = k.b(i10, xmlPullParser, "centerColor", j2.g.N, 0);
        int b11 = k.b(i10, xmlPullParser, "endColor", j2.g.H, 0);
        int g11 = k.g(i10, xmlPullParser, "tileMode", j2.g.M, 0);
        float f16 = k.f(i10, xmlPullParser, "gradientRadius", j2.g.L, 0.0f);
        i10.recycle();
        a a10 = a(c(resources, xmlPullParser, attributeSet, theme), b, b11, h10, b10);
        if (g10 != 1) {
            return g10 != 2 ? new LinearGradient(f10, f11, f12, f13, a10.f25709a, a10.b, d(g11)) : new SweepGradient(f14, f15, a10.f25709a, a10.b);
        }
        if (f16 > 0.0f) {
            return new RadialGradient(f14, f15, f16, a10.f25709a, a10.b, d(g11));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static n2.f.a c(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L85
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L85
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = j2.g.S
            android.content.res.TypedArray r3 = n2.k.i(r8, r11, r10, r3)
            int r5 = j2.g.T
            boolean r5 = r3.hasValue(r5)
            int r6 = j2.g.U
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            int r5 = j2.g.T
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = j2.g.U
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L85:
            int r8 = r4.size()
            if (r8 <= 0) goto L91
            n2.f$a r8 = new n2.f$a
            r8.<init>(r4, r2)
            return r8
        L91:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.f.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):n2.f$a");
    }

    public static Shader.TileMode d(int i10) {
        return i10 != 1 ? i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f25709a;
        public final float[] b;

        public a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f25709a = new int[size];
            this.b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f25709a[i10] = list.get(i10).intValue();
                this.b[i10] = list2.get(i10).floatValue();
            }
        }

        public a(int i10, int i11) {
            this.f25709a = new int[]{i10, i11};
            this.b = new float[]{0.0f, 1.0f};
        }

        public a(int i10, int i11, int i12) {
            this.f25709a = new int[]{i10, i11, i12};
            this.b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}

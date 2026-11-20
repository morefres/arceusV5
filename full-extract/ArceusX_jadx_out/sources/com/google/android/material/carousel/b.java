package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f7766a;
    public final List<c> b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7767c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7768d;

    /* renamed from: com.google.android.material.carousel.b$b, reason: collision with other inner class name */
    public static final class C0124b {

        /* renamed from: a, reason: collision with root package name */
        public final float f7769a;
        public final float b;

        /* renamed from: d, reason: collision with root package name */
        public c f7771d;

        /* renamed from: e, reason: collision with root package name */
        public c f7772e;

        /* renamed from: c, reason: collision with root package name */
        public final List<c> f7770c = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        public int f7773f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f7774g = -1;

        /* renamed from: h, reason: collision with root package name */
        public float f7775h = 0.0f;

        /* renamed from: i, reason: collision with root package name */
        public int f7776i = -1;

        public C0124b(float f10, float f11) {
            this.f7769a = f10;
            this.b = f11;
        }

        public static float j(float f10, float f11, int i10, int i11) {
            return (f10 - (i10 * f11)) + (i11 * f11);
        }

        @NonNull
        public C0124b a(float f10, float f11, float f12) {
            return d(f10, f11, f12, false, true);
        }

        @NonNull
        public C0124b b(float f10, float f11, float f12) {
            return c(f10, f11, f12, false);
        }

        @NonNull
        public C0124b c(float f10, float f11, float f12, boolean z10) {
            return d(f10, f11, f12, z10, false);
        }

        @NonNull
        public C0124b d(float f10, float f11, float f12, boolean z10, boolean z11) {
            float f13;
            float f14 = f12 / 2.0f;
            float f15 = f10 - f14;
            float f16 = f14 + f10;
            float f17 = this.b;
            if (f16 > f17) {
                f13 = Math.abs(f16 - Math.max(f16 - f12, f17));
            } else {
                f13 = 0.0f;
                if (f15 < 0.0f) {
                    f13 = Math.abs(f15 - Math.min(f15 + f12, 0.0f));
                }
            }
            return e(f10, f11, f12, z10, z11, f13);
        }

        @NonNull
        public C0124b e(float f10, float f11, float f12, boolean z10, boolean z11, float f13) {
            return f(f10, f11, f12, z10, z11, f13, 0.0f, 0.0f);
        }

        @NonNull
        public C0124b f(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, float f15) {
            if (f12 <= 0.0f) {
                return this;
            }
            if (z11) {
                if (z10) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i10 = this.f7776i;
                if (i10 != -1 && i10 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f7776i = this.f7770c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f10, f11, f12, z11, f13, f14, f15);
            if (z10) {
                if (this.f7771d == null) {
                    this.f7771d = cVar;
                    this.f7773f = this.f7770c.size();
                }
                if (this.f7774g != -1 && this.f7770c.size() - this.f7774g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 != this.f7771d.f7779d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f7772e = cVar;
                this.f7774g = this.f7770c.size();
            } else {
                if (this.f7771d == null && cVar.f7779d < this.f7775h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f7772e != null && cVar.f7779d > this.f7775h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f7775h = cVar.f7779d;
            this.f7770c.add(cVar);
            return this;
        }

        @NonNull
        public C0124b g(float f10, float f11, float f12, int i10) {
            return h(f10, f11, f12, i10, false);
        }

        @NonNull
        public C0124b h(float f10, float f11, float f12, int i10, boolean z10) {
            if (i10 > 0 && f12 > 0.0f) {
                for (int i11 = 0; i11 < i10; i11++) {
                    c((i11 * f12) + f10, f11, f12, z10);
                }
            }
            return this;
        }

        @NonNull
        public b i() {
            if (this.f7771d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f7770c.size(); i10++) {
                c cVar = this.f7770c.get(i10);
                arrayList.add(new c(j(this.f7771d.b, this.f7769a, this.f7773f, i10), cVar.b, cVar.f7778c, cVar.f7779d, cVar.f7780e, cVar.f7781f, cVar.f7782g, cVar.f7783h));
            }
            return new b(this.f7769a, arrayList, this.f7773f, this.f7774g);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final float f7777a;
        public final float b;

        /* renamed from: c, reason: collision with root package name */
        public final float f7778c;

        /* renamed from: d, reason: collision with root package name */
        public final float f7779d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f7780e;

        /* renamed from: f, reason: collision with root package name */
        public final float f7781f;

        /* renamed from: g, reason: collision with root package name */
        public final float f7782g;

        /* renamed from: h, reason: collision with root package name */
        public final float f7783h;

        public c(float f10, float f11, float f12, float f13) {
            this(f10, f11, f12, f13, false, 0.0f, 0.0f, 0.0f);
        }

        public static c a(c cVar, c cVar2, float f10) {
            return new c(jc.a.a(cVar.f7777a, cVar2.f7777a, f10), jc.a.a(cVar.b, cVar2.b, f10), jc.a.a(cVar.f7778c, cVar2.f7778c, f10), jc.a.a(cVar.f7779d, cVar2.f7779d, f10));
        }

        public c(float f10, float f11, float f12, float f13, boolean z10, float f14, float f15, float f16) {
            this.f7777a = f10;
            this.b = f11;
            this.f7778c = f12;
            this.f7779d = f13;
            this.f7780e = z10;
            this.f7781f = f14;
            this.f7782g = f15;
            this.f7783h = f16;
        }
    }

    public static b m(b bVar, b bVar2, float f10) {
        if (bVar.f() != bVar2.f()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<c> g10 = bVar.g();
        List<c> g11 = bVar2.g();
        if (g10.size() != g11.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < bVar.g().size(); i10++) {
            arrayList.add(c.a(g10.get(i10), g11.get(i10), f10));
        }
        return new b(bVar.f(), arrayList, jc.a.c(bVar.b(), bVar2.b(), f10), jc.a.c(bVar.i(), bVar2.i(), f10));
    }

    public static b n(b bVar, float f10) {
        C0124b c0124b = new C0124b(bVar.f(), f10);
        float f11 = (f10 - bVar.j().b) - (bVar.j().f7779d / 2.0f);
        int size = bVar.g().size() - 1;
        while (size >= 0) {
            c cVar = bVar.g().get(size);
            c0124b.d((cVar.f7779d / 2.0f) + f11, cVar.f7778c, cVar.f7779d, size >= bVar.b() && size <= bVar.i(), cVar.f7780e);
            f11 += cVar.f7779d;
            size--;
        }
        return c0124b.i();
    }

    public c a() {
        return this.b.get(this.f7767c);
    }

    public int b() {
        return this.f7767c;
    }

    public c c() {
        return this.b.get(0);
    }

    public c d() {
        for (int i10 = 0; i10 < this.b.size(); i10++) {
            c cVar = this.b.get(i10);
            if (!cVar.f7780e) {
                return cVar;
            }
        }
        return null;
    }

    public List<c> e() {
        return this.b.subList(this.f7767c, this.f7768d + 1);
    }

    public float f() {
        return this.f7766a;
    }

    public List<c> g() {
        return this.b;
    }

    public c h() {
        return this.b.get(this.f7768d);
    }

    public int i() {
        return this.f7768d;
    }

    public c j() {
        return this.b.get(r0.size() - 1);
    }

    public c k() {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            c cVar = this.b.get(size);
            if (!cVar.f7780e) {
                return cVar;
            }
        }
        return null;
    }

    public int l() {
        Iterator<c> it = this.b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().f7780e) {
                i10++;
            }
        }
        return this.b.size() - i10;
    }

    public b(float f10, List<c> list, int i10, int i11) {
        this.f7766a = f10;
        this.b = Collections.unmodifiableList(list);
        this.f7767c = i10;
        this.f7768d = i11;
    }
}

package n7;

import android.graphics.Paint;
import f7.h0;
import java.util.List;

/* loaded from: classes3.dex */
public class s implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f25912a;
    public final m7.b b;

    /* renamed from: c, reason: collision with root package name */
    public final List<m7.b> f25913c;

    /* renamed from: d, reason: collision with root package name */
    public final m7.a f25914d;

    /* renamed from: e, reason: collision with root package name */
    public final m7.d f25915e;

    /* renamed from: f, reason: collision with root package name */
    public final m7.b f25916f;

    /* renamed from: g, reason: collision with root package name */
    public final a f25917g;

    /* renamed from: h, reason: collision with root package name */
    public final b f25918h;

    /* renamed from: i, reason: collision with root package name */
    public final float f25919i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f25920j;

    public enum a {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap b() {
            int ordinal = ordinal();
            return ordinal != 0 ? ordinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    public enum b {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join b() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return Paint.Join.MITER;
            }
            if (ordinal == 1) {
                return Paint.Join.ROUND;
            }
            if (ordinal != 2) {
                return null;
            }
            return Paint.Join.BEVEL;
        }
    }

    public s(String str, m7.b bVar, List<m7.b> list, m7.a aVar, m7.d dVar, m7.b bVar2, a aVar2, b bVar3, float f10, boolean z10) {
        this.f25912a = str;
        this.b = bVar;
        this.f25913c = list;
        this.f25914d = aVar;
        this.f25915e = dVar;
        this.f25916f = bVar2;
        this.f25917g = aVar2;
        this.f25918h = bVar3;
        this.f25919i = f10;
        this.f25920j = z10;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.t(h0Var, bVar, this);
    }

    public a b() {
        return this.f25917g;
    }

    public m7.a c() {
        return this.f25914d;
    }

    public m7.b d() {
        return this.b;
    }

    public b e() {
        return this.f25918h;
    }

    public List<m7.b> f() {
        return this.f25913c;
    }

    public float g() {
        return this.f25919i;
    }

    public String h() {
        return this.f25912a;
    }

    public m7.d i() {
        return this.f25915e;
    }

    public m7.b j() {
        return this.f25916f;
    }

    public boolean k() {
        return this.f25920j;
    }
}

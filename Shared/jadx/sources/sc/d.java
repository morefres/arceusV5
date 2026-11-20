package sc;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public interface d {

    public static class b implements TypeEvaluator<e> {
        public static final TypeEvaluator<e> b = new b();

        /* renamed from: a, reason: collision with root package name */
        public final e f31036a = new e();

        @Override // android.animation.TypeEvaluator
        @NonNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f10, @NonNull e eVar, @NonNull e eVar2) {
            this.f31036a.a(bd.a.c(eVar.f31039a, eVar2.f31039a, f10), bd.a.c(eVar.b, eVar2.b, f10), bd.a.c(eVar.f31040c, eVar2.f31040c, f10));
            return this.f31036a;
        }
    }

    public static class c extends Property<d, e> {

        /* renamed from: a, reason: collision with root package name */
        public static final Property<d, e> f31037a = new c("circularReveal");

        public c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(@NonNull d dVar) {
            return dVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: sc.d$d, reason: collision with other inner class name */
    public static class C0550d extends Property<d, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Property<d, Integer> f31038a = new C0550d("circularRevealScrimColor");

        public C0550d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        @NonNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(@NonNull d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull d dVar, @NonNull Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public float f31039a;
        public float b;

        /* renamed from: c, reason: collision with root package name */
        public float f31040c;

        public void a(float f10, float f11, float f12) {
            this.f31039a = f10;
            this.b = f11;
            this.f31040c = f12;
        }

        public e() {
        }

        public e(float f10, float f11, float f12) {
            this.f31039a = f10;
            this.b = f11;
            this.f31040c = f12;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(e eVar);
}

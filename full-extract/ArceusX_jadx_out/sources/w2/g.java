package w2;

import java.util.Locale;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final w2.f f33679a = new e(null, false);
    public static final w2.f b = new e(null, true);

    /* renamed from: c, reason: collision with root package name */
    public static final w2.f f33680c;

    /* renamed from: d, reason: collision with root package name */
    public static final w2.f f33681d;

    /* renamed from: e, reason: collision with root package name */
    public static final w2.f f33682e;

    /* renamed from: f, reason: collision with root package name */
    public static final w2.f f33683f;

    public static class a implements c {
        public static final a b = new a(true);

        /* renamed from: a, reason: collision with root package name */
        public final boolean f33684a;

        public a(boolean z10) {
            this.f33684a = z10;
        }

        @Override // w2.g.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int a10 = g.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (a10 != 0) {
                    if (a10 != 1) {
                        continue;
                        i10++;
                        z10 = z10;
                    } else if (!this.f33684a) {
                        return 1;
                    }
                } else if (this.f33684a) {
                    return 0;
                }
                z10 = true;
                i10++;
                z10 = z10;
            }
            if (z10) {
                return this.f33684a ? 1 : 0;
            }
            return 2;
        }
    }

    public static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f33685a = new b();

        @Override // w2.g.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int i13 = 2;
            while (i10 < i12 && i13 == 2) {
                i13 = g.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return i13;
        }
    }

    public interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    public static abstract class d implements w2.f {

        /* renamed from: a, reason: collision with root package name */
        public final c f33686a;

        public d(c cVar) {
            this.f33686a = cVar;
        }

        public abstract boolean a();

        public final boolean b(CharSequence charSequence, int i10, int i11) {
            int a10 = this.f33686a.a(charSequence, i10, i11);
            if (a10 == 0) {
                return true;
            }
            if (a10 != 1) {
                return a();
            }
            return false;
        }

        @Override // w2.f
        public boolean isRtl(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            return this.f33686a == null ? a() : b(charSequence, i10, i11);
        }
    }

    public static class e extends d {
        public final boolean b;

        public e(c cVar, boolean z10) {
            super(cVar);
            this.b = z10;
        }

        @Override // w2.g.d
        public boolean a() {
            return this.b;
        }
    }

    public static class f extends d {
        public static final f b = new f();

        public f() {
            super(null);
        }

        @Override // w2.g.d
        public boolean a() {
            return h.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f33685a;
        f33680c = new e(bVar, false);
        f33681d = new e(bVar, true);
        f33682e = new e(a.b, false);
        f33683f = f.b;
    }

    public static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}

package tn;

import java.util.BitSet;

/* loaded from: classes3.dex */
public class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final BitSet f32335a;

    /* renamed from: tn.a$a, reason: collision with other inner class name */
    public static class C0584a {

        /* renamed from: a, reason: collision with root package name */
        public final BitSet f32336a;

        public a b() {
            return new a(this);
        }

        public C0584a c(char c10) {
            if (c10 > 127) {
                throw new IllegalArgumentException("Can only match ASCII characters");
            }
            this.f32336a.set(c10);
            return this;
        }

        public C0584a d(char c10, char c11) {
            while (c10 <= c11) {
                c(c10);
                c10 = (char) (c10 + 1);
            }
            return this;
        }

        public C0584a(BitSet bitSet) {
            this.f32336a = bitSet;
        }
    }

    public static C0584a b() {
        return new C0584a(new BitSet());
    }

    @Override // tn.c
    public boolean a(char c10) {
        return this.f32335a.get(c10);
    }

    public C0584a c() {
        return new C0584a((BitSet) this.f32335a.clone());
    }

    public a(C0584a c0584a) {
        this.f32335a = c0584a.f32336a;
    }
}

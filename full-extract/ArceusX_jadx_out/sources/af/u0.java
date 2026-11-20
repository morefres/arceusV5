package af;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.s0;
import com.google.crypto.tink.shaded.protobuf.y;

/* loaded from: classes2.dex */
public final class u0 extends com.google.crypto.tink.shaded.protobuf.y<u0, b> implements com.google.crypto.tink.shaded.protobuf.t0 {
    private static final u0 DEFAULT_INSTANCE;
    public static final int E_FIELD_NUMBER = 4;
    public static final int N_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1<u0> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.crypto.tink.shaded.protobuf.h e_;
    private com.google.crypto.tink.shaded.protobuf.h n_;
    private s0 params_;
    private int version_;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f552a;

        static {
            int[] iArr = new int[y.f.values().length];
            f552a = iArr;
            try {
                iArr[y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f552a[y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f552a[y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f552a[y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f552a[y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f552a[y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f552a[y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends y.a<u0, b> implements com.google.crypto.tink.shaded.protobuf.t0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.s0.a
        public /* bridge */ /* synthetic */ s0.a B(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
            return super.B(iVar, pVar);
        }

        public b C(com.google.crypto.tink.shaded.protobuf.h hVar) {
            r();
            ((u0) this.b).l0(hVar);
            return this;
        }

        public b D(com.google.crypto.tink.shaded.protobuf.h hVar) {
            r();
            ((u0) this.b).m0(hVar);
            return this;
        }

        public b E(s0 s0Var) {
            r();
            ((u0) this.b).n0(s0Var);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.a.AbstractC0132a, com.google.crypto.tink.shaded.protobuf.s0.a
        public /* bridge */ /* synthetic */ s0.a H(com.google.crypto.tink.shaded.protobuf.s0 s0Var) {
            return super.H(s0Var);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.s0.a
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0 build() {
            return super.build();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a
        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.s0.a
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0 d() {
            return super.d();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.t0
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0 f() {
            return super.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.a.AbstractC0132a
        public /* bridge */ /* synthetic */ a.AbstractC0132a j(com.google.crypto.tink.shaded.protobuf.a aVar) {
            return super.j((com.google.crypto.tink.shaded.protobuf.y) aVar);
        }

        public b() {
            super(u0.DEFAULT_INSTANCE);
        }
    }

    static {
        u0 u0Var = new u0();
        DEFAULT_INSTANCE = u0Var;
        com.google.crypto.tink.shaded.protobuf.y.W(u0.class, u0Var);
    }

    public u0() {
        com.google.crypto.tink.shaded.protobuf.h hVar = com.google.crypto.tink.shaded.protobuf.h.b;
        this.n_ = hVar;
        this.e_ = hVar;
    }

    public static u0 d0() {
        return DEFAULT_INSTANCE;
    }

    public static b i0() {
        return DEFAULT_INSTANCE.v();
    }

    public static u0 j0(com.google.crypto.tink.shaded.protobuf.h hVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (u0) com.google.crypto.tink.shaded.protobuf.y.Q(DEFAULT_INSTANCE, hVar, pVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.a1<u0> k0() {
        return DEFAULT_INSTANCE.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(s0 s0Var) {
        s0Var.getClass();
        this.params_ = s0Var;
        this.bitField0_ |= 1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
    public /* bridge */ /* synthetic */ s0.a a() {
        return super.a();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
    public /* bridge */ /* synthetic */ s0.a e() {
        return super.e();
    }

    public com.google.crypto.tink.shaded.protobuf.h e0() {
        return this.e_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.t0
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0 f() {
        return super.f();
    }

    public com.google.crypto.tink.shaded.protobuf.h f0() {
        return this.n_;
    }

    public s0 g0() {
        s0 s0Var = this.params_;
        return s0Var == null ? s0.b0() : s0Var;
    }

    public int h0() {
        return this.version_;
    }

    public final void l0(com.google.crypto.tink.shaded.protobuf.h hVar) {
        hVar.getClass();
        this.e_ = hVar;
    }

    public final void m0(com.google.crypto.tink.shaded.protobuf.h hVar) {
        hVar.getClass();
        this.n_ = hVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y
    public final Object z(y.f fVar, Object obj, Object obj2) {
        com.google.crypto.tink.shaded.protobuf.a1 a1Var;
        a aVar = null;
        switch (a.f552a[fVar.ordinal()]) {
            case 1:
                return new u0();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.y.O(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"bitField0_", "version_", "params_", "n_", "e_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1<u0> a1Var2 = PARSER;
                if (a1Var2 != null) {
                    return a1Var2;
                }
                synchronized (u0.class) {
                    try {
                        a1Var = PARSER;
                        if (a1Var == null) {
                            a1Var = new y.b(DEFAULT_INSTANCE);
                            PARSER = a1Var;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return a1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

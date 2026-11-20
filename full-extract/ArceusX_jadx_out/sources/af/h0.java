package af;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.s0;
import com.google.crypto.tink.shaded.protobuf.y;

/* loaded from: classes2.dex */
public final class h0 extends com.google.crypto.tink.shaded.protobuf.y<h0, b> implements com.google.crypto.tink.shaded.protobuf.t0 {
    private static final h0 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1<h0> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private com.google.crypto.tink.shaded.protobuf.h value_ = com.google.crypto.tink.shaded.protobuf.h.b;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f519a;

        static {
            int[] iArr = new int[y.f.values().length];
            f519a = iArr;
            try {
                iArr[y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f519a[y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f519a[y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f519a[y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f519a[y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f519a[y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f519a[y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends y.a<h0, b> implements com.google.crypto.tink.shaded.protobuf.t0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.s0.a
        public /* bridge */ /* synthetic */ s0.a B(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
            return super.B(iVar, pVar);
        }

        public b C(p0 p0Var) {
            r();
            ((h0) this.b).k0(p0Var);
            return this;
        }

        public b D(String str) {
            r();
            ((h0) this.b).l0(str);
            return this;
        }

        public b E(com.google.crypto.tink.shaded.protobuf.h hVar) {
            r();
            ((h0) this.b).m0(hVar);
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
            super(h0.DEFAULT_INSTANCE);
        }
    }

    static {
        h0 h0Var = new h0();
        DEFAULT_INSTANCE = h0Var;
        com.google.crypto.tink.shaded.protobuf.y.W(h0.class, h0Var);
    }

    public static h0 d0() {
        return DEFAULT_INSTANCE;
    }

    public static b h0() {
        return DEFAULT_INSTANCE.v();
    }

    public static b i0(h0 h0Var) {
        return DEFAULT_INSTANCE.w(h0Var);
    }

    public static h0 j0(byte[] bArr, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (h0) com.google.crypto.tink.shaded.protobuf.y.S(DEFAULT_INSTANCE, bArr, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(com.google.crypto.tink.shaded.protobuf.h hVar) {
        hVar.getClass();
        this.value_ = hVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
    public /* bridge */ /* synthetic */ s0.a a() {
        return super.a();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
    public /* bridge */ /* synthetic */ s0.a e() {
        return super.e();
    }

    public p0 e0() {
        p0 a10 = p0.a(this.outputPrefixType_);
        return a10 == null ? p0.UNRECOGNIZED : a10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.t0
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0 f() {
        return super.f();
    }

    public String f0() {
        return this.typeUrl_;
    }

    public com.google.crypto.tink.shaded.protobuf.h g0() {
        return this.value_;
    }

    public final void k0(p0 p0Var) {
        this.outputPrefixType_ = p0Var.getNumber();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y
    public final Object z(y.f fVar, Object obj, Object obj2) {
        com.google.crypto.tink.shaded.protobuf.a1 a1Var;
        a aVar = null;
        switch (a.f519a[fVar.ordinal()]) {
            case 1:
                return new h0();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.y.O(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1<h0> a1Var2 = PARSER;
                if (a1Var2 != null) {
                    return a1Var2;
                }
                synchronized (h0.class) {
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

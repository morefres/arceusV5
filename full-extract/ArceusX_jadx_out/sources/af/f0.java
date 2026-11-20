package af;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.s0;
import com.google.crypto.tink.shaded.protobuf.y;

/* loaded from: classes2.dex */
public final class f0 extends com.google.crypto.tink.shaded.protobuf.y<f0, b> implements com.google.crypto.tink.shaded.protobuf.t0 {
    private static final f0 DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1<f0> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private com.google.crypto.tink.shaded.protobuf.h value_ = com.google.crypto.tink.shaded.protobuf.h.b;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f501a;

        static {
            int[] iArr = new int[y.f.values().length];
            f501a = iArr;
            try {
                iArr[y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f501a[y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f501a[y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f501a[y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f501a[y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f501a[y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f501a[y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends y.a<f0, b> implements com.google.crypto.tink.shaded.protobuf.t0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.s0.a
        public /* bridge */ /* synthetic */ s0.a B(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
            return super.B(iVar, pVar);
        }

        public b C(c cVar) {
            r();
            ((f0) this.b).i0(cVar);
            return this;
        }

        public b D(String str) {
            r();
            ((f0) this.b).j0(str);
            return this;
        }

        public b E(com.google.crypto.tink.shaded.protobuf.h hVar) {
            r();
            ((f0) this.b).k0(hVar);
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
            super(f0.DEFAULT_INSTANCE);
        }
    }

    public enum c implements a0.c {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);


        /* renamed from: h, reason: collision with root package name */
        public static final a0.d<c> f507h = new a();

        /* renamed from: a, reason: collision with root package name */
        public final int f509a;

        public class a implements a0.d<c> {
            @Override // com.google.crypto.tink.shaded.protobuf.a0.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(int i10) {
                return c.a(i10);
            }
        }

        c(int i10) {
            this.f509a = i10;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i10 == 1) {
                return SYMMETRIC;
            }
            if (i10 == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i10 == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i10 != 4) {
                return null;
            }
            return REMOTE;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.a0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f509a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        f0 f0Var = new f0();
        DEFAULT_INSTANCE = f0Var;
        com.google.crypto.tink.shaded.protobuf.y.W(f0.class, f0Var);
    }

    public static f0 d0() {
        return DEFAULT_INSTANCE;
    }

    public static b h0() {
        return DEFAULT_INSTANCE.v();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
    public /* bridge */ /* synthetic */ s0.a a() {
        return super.a();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
    public /* bridge */ /* synthetic */ s0.a e() {
        return super.e();
    }

    public c e0() {
        c a10 = c.a(this.keyMaterialType_);
        return a10 == null ? c.UNRECOGNIZED : a10;
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

    public final void i0(c cVar) {
        this.keyMaterialType_ = cVar.getNumber();
    }

    public final void j0(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    public final void k0(com.google.crypto.tink.shaded.protobuf.h hVar) {
        hVar.getClass();
        this.value_ = hVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y
    public final Object z(y.f fVar, Object obj, Object obj2) {
        com.google.crypto.tink.shaded.protobuf.a1 a1Var;
        a aVar = null;
        switch (a.f501a[fVar.ordinal()]) {
            case 1:
                return new f0();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.y.O(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1<f0> a1Var2 = PARSER;
                if (a1Var2 != null) {
                    return a1Var2;
                }
                synchronized (f0.class) {
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

package af;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.s0;
import com.google.crypto.tink.shaded.protobuf.y;

/* loaded from: classes2.dex */
public final class q extends com.google.crypto.tink.shaded.protobuf.y<q, b> implements com.google.crypto.tink.shaded.protobuf.t0 {
    private static final q DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1<q> PARSER;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f543a;

        static {
            int[] iArr = new int[y.f.values().length];
            f543a = iArr;
            try {
                iArr[y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f543a[y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f543a[y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f543a[y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f543a[y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f543a[y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f543a[y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends y.a<q, b> implements com.google.crypto.tink.shaded.protobuf.t0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.s0.a
        public /* bridge */ /* synthetic */ s0.a B(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
            return super.B(iVar, pVar);
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
            super(q.DEFAULT_INSTANCE);
        }
    }

    static {
        q qVar = new q();
        DEFAULT_INSTANCE = qVar;
        com.google.crypto.tink.shaded.protobuf.y.W(q.class, qVar);
    }

    public static q a0() {
        return DEFAULT_INSTANCE;
    }

    public static q b0(com.google.crypto.tink.shaded.protobuf.h hVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (q) com.google.crypto.tink.shaded.protobuf.y.Q(DEFAULT_INSTANCE, hVar, pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
    public /* bridge */ /* synthetic */ s0.a a() {
        return super.a();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
    public /* bridge */ /* synthetic */ s0.a e() {
        return super.e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.t0
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0 f() {
        return super.f();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y
    public final Object z(y.f fVar, Object obj, Object obj2) {
        com.google.crypto.tink.shaded.protobuf.a1 a1Var;
        a aVar = null;
        switch (a.f543a[fVar.ordinal()]) {
            case 1:
                return new q();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.y.O(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1<q> a1Var2 = PARSER;
                if (a1Var2 != null) {
                    return a1Var2;
                }
                synchronized (q.class) {
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

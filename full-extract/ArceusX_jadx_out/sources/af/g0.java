package af;

import com.google.crypto.tink.shaded.protobuf.a0;

/* loaded from: classes2.dex */
public enum g0 implements a0.c {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    public static final a0.d<g0> f515g = new a0.d<g0>() { // from class: af.g0.a
        @Override // com.google.crypto.tink.shaded.protobuf.a0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g0 a(int i10) {
            return g0.a(i10);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f517a;

    g0(int i10) {
        this.f517a = i10;
    }

    public static g0 a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i10 == 1) {
            return ENABLED;
        }
        if (i10 == 2) {
            return DISABLED;
        }
        if (i10 != 3) {
            return null;
        }
        return DESTROYED;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f517a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

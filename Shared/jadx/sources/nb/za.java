package nb;

/* loaded from: classes.dex */
public enum za {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);


    /* renamed from: a, reason: collision with root package name */
    public final int f26933a;

    za(int i10) {
        this.f26933a = i10;
    }

    public static za a(int i10) {
        for (za zaVar : values()) {
            if (zaVar.f26933a == i10) {
                return zaVar;
            }
        }
        return UNKNOWN;
    }

    public final int zza() {
        return this.f26933a;
    }
}

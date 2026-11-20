package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public enum l {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);


    /* renamed from: q, reason: collision with root package name */
    public static final q0 f7190q;

    /* renamed from: a, reason: collision with root package name */
    public final int f7192a;

    static {
        p0 p0Var = new p0();
        for (l lVar : values()) {
            p0Var.a(Integer.valueOf(lVar.f7192a), lVar);
        }
        f7190q = p0Var.b();
    }

    l(int i10) {
        this.f7192a = i10;
    }

    public static l a(int i10) {
        q0 q0Var = f7190q;
        Integer valueOf = Integer.valueOf(i10);
        return !q0Var.containsKey(valueOf) ? RESPONSE_CODE_UNSPECIFIED : (l) q0Var.get(valueOf);
    }
}

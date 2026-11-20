package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class y7 implements w4 {

    /* renamed from: a, reason: collision with root package name */
    public static final w4 f7398a = new y7();

    @Override // com.google.android.gms.internal.play_billing.w4
    public final boolean a(int i10) {
        return (i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? null : z7.PLAY_BILLING_ACTIVITY_CREATED_ACTION : z7.IN_APP_BILLING_RESULT_UPDATE_ACTION : z7.ALTERNATIVE_BILLING_ACTION : z7.LOCAL_PURCHASES_UPDATED_ACTION : z7.PURCHASES_UPDATED_ACTION : z7.BROADCAST_ACTION_UNSPECIFIED) != null;
    }
}

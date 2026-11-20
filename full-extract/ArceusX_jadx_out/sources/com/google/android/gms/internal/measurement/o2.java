package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o2 extends j3 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f6740e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f6741f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v3 f6742g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(v3 v3Var, Context context, Bundle bundle) {
        super(v3Var, true);
        this.f6740e = context;
        this.f6741f = bundle;
        Objects.requireNonNull(v3Var);
        this.f6742g = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        try {
            Context context = this.f6740e;
            n9.m.l(context);
            String a10 = nb.y6.a(context);
            n9.m.l(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(a10)) {
                a10 = nb.y6.a(context);
            }
            Boolean c10 = nb.y6.c("google_analytics_force_disable_updates", resources, a10);
            v3 v3Var = this.f6742g;
            v3Var.n(v3Var.t(context, c10 == null || !c10.booleanValue()));
            if (v3Var.m() == null) {
                Log.w(v3Var.k(), "Failed to connect to measurement client.");
                return;
            }
            int a11 = DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
            ((u1) n9.m.l(v3Var.m())).initialize(y9.b.u2(context), new zzdd(133005L, Math.max(a11, r0), Boolean.TRUE.equals(c10) || DynamiteModule.c(context, ModuleDescriptor.MODULE_ID) < a11, this.f6741f, nb.y6.a(context)), this.f6600a);
        } catch (Exception e10) {
            this.f6742g.j(e10, true, false);
        }
    }
}

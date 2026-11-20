package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.m0;
import v7.l;
import v7.m;
import v7.o;
import v7.u;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: com.android.billingclient.api.a$a, reason: collision with other inner class name */
    public static final class C0113a {

        /* renamed from: a, reason: collision with root package name */
        public volatile v7.i f5099a;
        public final Context b;

        /* renamed from: c, reason: collision with root package name */
        public volatile m f5100c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f5101d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f5102e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f5103f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f5104g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f5105h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f5106i;

        /* renamed from: j, reason: collision with root package name */
        public volatile boolean f5107j;

        public /* synthetic */ C0113a(Context context, u uVar) {
            this.b = context;
        }

        @NonNull
        public a a() {
            Context context = this.b;
            if (context == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f5100c == null) {
                if (this.f5106i) {
                    throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing or Side by side Billing.");
                }
                if (this.f5101d || this.f5102e || this.f5103f || this.f5104g || this.f5105h) {
                    return d() ? new g(null, context, null, null, this) : new b(null, context, null, null, this);
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            if (this.f5099a == null || !this.f5099a.a()) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            if (this.f5100c == null) {
                v7.i iVar = this.f5099a;
                return d() ? new g(null, iVar, context, null, null, null, this) : new b(null, iVar, context, null, null, null, this);
            }
            v7.i iVar2 = this.f5099a;
            m mVar = this.f5100c;
            return d() ? new g(null, iVar2, context, mVar, null, null, null, this) : new b(null, iVar2, context, mVar, null, null, null, this);
        }

        @NonNull
        public C0113a b(@NonNull v7.i iVar) {
            this.f5099a = iVar;
            return this;
        }

        @NonNull
        public C0113a c(@NonNull m mVar) {
            this.f5100c = mVar;
            return this;
        }

        public final boolean d() {
            try {
                Context context = this.b;
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception e10) {
                m0.n("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e10);
                return false;
            }
        }
    }

    @NonNull
    public static C0113a f(@NonNull Context context) {
        return new C0113a(context, null);
    }

    public abstract void a(@NonNull v7.b bVar, @NonNull v7.c cVar);

    public abstract void b(@NonNull v7.e eVar, @NonNull v7.f fVar);

    @NonNull
    public abstract d c(@NonNull String str);

    public abstract boolean d();

    @NonNull
    public abstract d e(@NonNull Activity activity, @NonNull c cVar);

    public abstract void g(@NonNull f fVar, @NonNull v7.j jVar);

    public abstract void h(@NonNull o oVar, @NonNull l lVar);

    public abstract void i(@NonNull v7.d dVar);
}

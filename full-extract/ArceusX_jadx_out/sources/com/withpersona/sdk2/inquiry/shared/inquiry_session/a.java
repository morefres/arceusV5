package com.withpersona.sdk2.inquiry.shared.inquiry_session;

import android.content.Context;
import android.location.LocationManager;
import androidx.core.view.inputmethod.EditorInfoCompat;
import j6.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.d;
import ot.f;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/content/Context;", "context", "Lrq/a;", ve.a.f33391e, "(Landroid/content/Context;Lmt/b;)Ljava/lang/Object;", "", b.f21518e, "(Landroid/content/Context;)Z", "shared_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsUtilsKt", f = "GpsUtils.kt", l = {25}, m = "getLocationAndPrecision")
    /* renamed from: com.withpersona.sdk2.inquiry.shared.inquiry_session.a$a, reason: collision with other inner class name */
    public static final class C0252a extends d {

        /* renamed from: t, reason: collision with root package name */
        public Object f13261t;

        /* renamed from: u, reason: collision with root package name */
        public Object f13262u;

        /* renamed from: v, reason: collision with root package name */
        public int f13263v;

        /* renamed from: w, reason: collision with root package name */
        public int f13264w;

        /* renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f13265x;

        /* renamed from: y, reason: collision with root package name */
        public int f13266y;

        public C0252a(mt.b<? super C0252a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f13265x = obj;
            this.f13266y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return a.a(null, this);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:25|26))(8:27|28|(1:30)(1:42)|31|(1:33)|(4:37|(1:14)(1:(1:23)(1:24))|(2:17|18)|21)|38|(1:40)(1:41))|12|(0)(0)|(2:17|18)|21))|44|6|7|(0)(0)|12|(0)(0)|(0)|21) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0090 A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:11:0x0032, B:12:0x008a, B:14:0x0090, B:17:0x009d, B:23:0x0095, B:28:0x004a, B:31:0x0056, B:38:0x0066), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull android.content.Context r8, @org.jetbrains.annotations.NotNull mt.b<? super rq.GpsData> r9) {
        /*
            boolean r0 = r9 instanceof com.withpersona.sdk2.inquiry.shared.inquiry_session.a.C0252a
            if (r0 == 0) goto L13
            r0 = r9
            com.withpersona.sdk2.inquiry.shared.inquiry_session.a$a r0 = (com.withpersona.sdk2.inquiry.shared.inquiry_session.a.C0252a) r0
            int r1 = r0.f13266y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13266y = r1
            goto L18
        L13:
            com.withpersona.sdk2.inquiry.shared.inquiry_session.a$a r0 = new com.withpersona.sdk2.inquiry.shared.inquiry_session.a$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f13265x
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f13266y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 != r4) goto L36
            int r8 = r0.f13264w
            int r1 = r0.f13263v
            java.lang.Object r2 = r0.f13262u
            lb.b r2 = (lb.b) r2
            java.lang.Object r0 = r0.f13261t
            android.content.Context r0 = (android.content.Context) r0
            gt.o.b(r9)     // Catch: java.lang.Exception -> La3
            goto L8a
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            gt.o.b(r9)
            lb.b r9 = lb.f.a(r8)
            java.lang.String r2 = "getFusedLocationProviderClient(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            int r2 = l2.b.a(r8, r2)     // Catch: java.lang.Exception -> La3
            r5 = 0
            if (r2 != 0) goto L55
            r2 = r4
            goto L56
        L55:
            r2 = r5
        L56:
            java.lang.String r6 = "android.permission.ACCESS_COARSE_LOCATION"
            int r6 = l2.b.a(r8, r6)     // Catch: java.lang.Exception -> La3
            if (r6 != 0) goto L5f
            r5 = r4
        L5f:
            if (r2 != 0) goto L66
            if (r5 == 0) goto L64
            goto L66
        L64:
            r9 = r3
            goto L8e
        L66:
            com.google.android.gms.tasks.Task r6 = r9.getLastLocation()     // Catch: java.lang.Exception -> La3
            java.lang.String r7 = "getLastLocation(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)     // Catch: java.lang.Exception -> La3
            java.lang.Object r8 = ot.l.a(r8)     // Catch: java.lang.Exception -> La3
            r0.f13261t = r8     // Catch: java.lang.Exception -> La3
            java.lang.Object r8 = ot.l.a(r9)     // Catch: java.lang.Exception -> La3
            r0.f13262u = r8     // Catch: java.lang.Exception -> La3
            r0.f13263v = r2     // Catch: java.lang.Exception -> La3
            r0.f13264w = r5     // Catch: java.lang.Exception -> La3
            r0.f13266y = r4     // Catch: java.lang.Exception -> La3
            java.lang.Object r9 = uu.b.a(r6, r0)     // Catch: java.lang.Exception -> La3
            if (r9 != r1) goto L88
            return r1
        L88:
            r1 = r2
            r8 = r5
        L8a:
            android.location.Location r9 = (android.location.Location) r9     // Catch: java.lang.Exception -> La3
            r5 = r8
            r2 = r1
        L8e:
            if (r2 == 0) goto L93
            rq.b r8 = rq.b.b     // Catch: java.lang.Exception -> La3
            goto L99
        L93:
            if (r5 == 0) goto L98
            rq.b r8 = rq.b.f30739a     // Catch: java.lang.Exception -> La3
            goto L99
        L98:
            r8 = r3
        L99:
            if (r9 == 0) goto La3
            if (r8 == 0) goto La3
            rq.a r0 = new rq.a     // Catch: java.lang.Exception -> La3
            r0.<init>(r9, r8)     // Catch: java.lang.Exception -> La3
            return r0
        La3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.shared.inquiry_session.a.a(android.content.Context, mt.b):java.lang.Object");
    }

    public static final boolean b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("location");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        return ((LocationManager) systemService).isProviderEnabled("gps");
    }
}

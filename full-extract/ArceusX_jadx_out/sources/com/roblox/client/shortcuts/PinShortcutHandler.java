package com.roblox.client.shortcuts;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.f;
import android.view.s;
import android.widget.Toast;
import androidx.annotation.Keep;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.roblox.client.RobloxApplication;
import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.protocols.pinshortcutplatforminterface.generated.IPinShortcutHandlerCore;
import com.roblox.protocols.pinshortcutplatforminterface.generated.IPlatformPinShortcut;
import ek.q;
import gt.o;
import hu.p;
import java.util.Locale;
import java.util.Set;
import ju.g1;
import ju.k;
import ju.p0;
import ju.q0;
import ju.z2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m2.e;
import nt.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.d;
import ot.m;
import rh.h;

@Keep
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ'\u0010 \u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!J/\u0010#\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010,\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010)R\u0014\u0010-\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010)R\u0014\u0010.\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010)R\u0014\u0010/\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010)R\u0014\u00100\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010)R\u0014\u00101\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010)R\u0014\u00102\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010)R\u0014\u00103\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010)R\u0014\u00104\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010)R\"\u00106\u001a\u0002058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R(\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00070<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00070C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lcom/roblox/client/shortcuts/PinShortcutHandler;", "Landroidx/lifecycle/f;", "Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut;", "<init>", "()V", "", "placeId", "", "thumbnailUrl", "experienceName", "shortcutId", "Landroid/net/Uri;", "deepLink", "", "requestPinShortcut", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V", "Landroid/content/Context;", PinShortcutHandler.PARAM_CONTEXT, "Landroidx/core/graphics/drawable/IconCompat;", "loadIcon", "(Landroid/content/Context;Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "fallbackIcon", "(Landroid/content/Context;)Landroidx/core/graphics/drawable/IconCompat;", "Landroidx/lifecycle/s;", "owner", "onCreate", "(Landroidx/lifecycle/s;)V", "onDestroy", "", "isAvailable", "()Z", "isPinExperienceV2Available", "pinExperience", "(JLjava/lang/String;Ljava/lang/String;)V", "universeId", "pinExperienceV2", "(JJLjava/lang/String;Ljava/lang/String;)V", "onPinConfirmed$NativeShell_googleProdRelease", "(J)V", "onPinConfirmed", "TAG", "Ljava/lang/String;", "EXTRA_PLACE_ID", "DEEP_LINK_BASE", "PARAM_PLACE_ID", "PARAM_JOIN_ORIGIN", "JOIN_ORIGIN_PINNED_SHORTCUT", "EXPERIENCE_DETAILS_DEEP_LINK_BASE", "PARAM_GAME_ID", "PARAM_HOME_ROOT", "PARAM_CONTEXT", "CONTEXT_PINNED_SHORTCUT", "PARAM_FULL_VIEW", "Lju/p0;", "coroutineScope", "Lju/p0;", "getCoroutineScope$NativeShell_googleProdRelease", "()Lju/p0;", "setCoroutineScope$NativeShell_googleProdRelease", "(Lju/p0;)V", "Lkotlin/Function0;", "manufacturerProvider", "Lkotlin/jvm/functions/Function0;", "getManufacturerProvider$NativeShell_googleProdRelease", "()Lkotlin/jvm/functions/Function0;", "setManufacturerProvider$NativeShell_googleProdRelease", "(Lkotlin/jvm/functions/Function0;)V", "", "getSilentManufacturers", "()Ljava/util/Set;", "silentManufacturers", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PinShortcutHandler extends IPlatformPinShortcut implements f {

    @NotNull
    private static final String CONTEXT_PINNED_SHORTCUT = "AndroidPinnedShortcut";

    @NotNull
    private static final String DEEP_LINK_BASE = "roblox://experiences/start";

    @NotNull
    private static final String EXPERIENCE_DETAILS_DEEP_LINK_BASE = "roblox://navigation/game_details";

    @NotNull
    public static final String EXTRA_PLACE_ID = "placeId";

    @NotNull
    private static final String JOIN_ORIGIN_PINNED_SHORTCUT = "PinnedShortcut";

    @NotNull
    private static final String PARAM_CONTEXT = "context";

    @NotNull
    private static final String PARAM_FULL_VIEW = "fullView";

    @NotNull
    private static final String PARAM_GAME_ID = "gameId";

    @NotNull
    private static final String PARAM_HOME_ROOT = "homeRoot";

    @NotNull
    private static final String PARAM_JOIN_ORIGIN = "joinAttemptOrigin";

    @NotNull
    private static final String PARAM_PLACE_ID = "placeId";

    @NotNull
    private static final String TAG = "PinShortcutHandler";

    @NotNull
    public static final PinShortcutHandler INSTANCE = new PinShortcutHandler();

    @NotNull
    private static p0 coroutineScope = q0.a(g1.b().plus(z2.b(null, 1, null)));

    @NotNull
    private static Function0<String> manufacturerProvider = new Function0() { // from class: wj.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String str;
            str = Build.MANUFACTURER;
            return str;
        }
    };

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.shortcuts.PinShortcutHandler", f = "PinShortcutHandler.kt", l = {176}, m = "loadIcon", v = 1)
    public static final class a extends d {
        public int A;

        /* renamed from: t, reason: collision with root package name */
        public Object f9427t;

        /* renamed from: u, reason: collision with root package name */
        public Object f9428u;

        /* renamed from: v, reason: collision with root package name */
        public Object f9429v;

        /* renamed from: w, reason: collision with root package name */
        public Object f9430w;

        /* renamed from: x, reason: collision with root package name */
        public int f9431x;

        /* renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f9432y;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9432y = obj;
            this.A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return PinShortcutHandler.this.loadIcon(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.shortcuts.PinShortcutHandler$requestPinShortcut$1", f = "PinShortcutHandler.kt", l = {122, 157}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, mt.b<? super Unit>, Object> {
        public /* synthetic */ Object A;
        public final /* synthetic */ String B;
        public final /* synthetic */ Uri C;
        public final /* synthetic */ long D;
        public final /* synthetic */ String E;
        public final /* synthetic */ String F;

        /* renamed from: t, reason: collision with root package name */
        public Object f9434t;

        /* renamed from: u, reason: collision with root package name */
        public Object f9435u;

        /* renamed from: v, reason: collision with root package name */
        public Object f9436v;

        /* renamed from: w, reason: collision with root package name */
        public Object f9437w;

        /* renamed from: x, reason: collision with root package name */
        public Object f9438x;

        /* renamed from: y, reason: collision with root package name */
        public boolean f9439y;

        /* renamed from: z, reason: collision with root package name */
        public int f9440z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.roblox.client.shortcuts.PinShortcutHandler$requestPinShortcut$1$1", f = "PinShortcutHandler.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f9441t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ Context f9442u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f9443v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, String str, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f9442u = context;
                this.f9443v = str;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new a(this.f9442u, this.f9443v, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                c.e();
                if (this.f9441t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                Context context = this.f9442u;
                Toast.makeText(context, context.getString(rg.q0.I0, this.f9443v), 0).show();
                return Unit.f22894a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Uri uri, long j10, String str2, String str3, mt.b<? super b> bVar) {
            super(2, bVar);
            this.B = str;
            this.C = uri;
            this.D = j10;
            this.E = str2;
            this.F = str3;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            b bVar2 = new b(this.B, this.C, this.D, this.E, this.F, bVar);
            bVar2.A = obj;
            return bVar2;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(1:(1:(3:5|6|7)(2:9|10))(1:11))(1:32)|12|(1:14)|15|16|17|18|(4:20|(2:22|(1:24))|6|7)(2:27|28)) */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x014e, code lost:
        
            if (ju.i.g(r8, r9, r12) == r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0150, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00ce, code lost:
        
            r7 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00cf, code lost:
        
            r8 = gt.n.INSTANCE;
            r7 = gt.n.b(gt.o.a(r7));
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
        
            if (r13 == r1) goto L29;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 373
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.shortcuts.PinShortcutHandler.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    private PinShortcutHandler() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_silentManufacturers_$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String lowerCase = StringsKt.p1(it).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_silentManufacturers_$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.length() > 0;
    }

    private final IconCompat fallbackIcon(Context context) {
        IconCompat d10 = IconCompat.d(context, rg.p0.f30442a);
        Intrinsics.checkNotNullExpressionValue(d10, "createWithResource(...)");
        return d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<String> getSilentManufacturers() {
        String A5 = h.a().A5();
        Intrinsics.checkNotNullExpressionValue(A5, "PinShortcutSilentManufacturers(...)");
        return p.A(p.p(p.x(StringsKt.R0(A5, new char[]{','}, false, 0, 6, null), new Function1() { // from class: wj.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String _get_silentManufacturers_$lambda$0;
                _get_silentManufacturers_$lambda$0 = PinShortcutHandler._get_silentManufacturers_$lambda$0((String) obj);
                return _get_silentManufacturers_$lambda$0;
            }
        }), new Function1() { // from class: wj.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean _get_silentManufacturers_$lambda$1;
                _get_silentManufacturers_$lambda$1 = PinShortcutHandler._get_silentManufacturers_$lambda$1((String) obj);
                return Boolean.valueOf(_get_silentManufacturers_$lambda$1);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:29|30))(2:31|(2:33|34)(2:35|(1:37)))|12|(1:14)(1:28)|15|16|(1:18)|19|(2:25|26)(1:23)))|40|6|7|(0)(0)|12|(0)(0)|15|16|(0)|19|(1:21)|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x003b, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        r9 = gt.n.INSTANCE;
        r8 = gt.n.b(gt.o.a(r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0091 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:11:0x0037, B:12:0x0089, B:14:0x0091, B:15:0x0098, B:35:0x0053), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadIcon(android.content.Context r7, java.lang.String r8, mt.b<? super androidx.core.graphics.drawable.IconCompat> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.roblox.client.shortcuts.PinShortcutHandler.a
            if (r0 == 0) goto L13
            r0 = r9
            com.roblox.client.shortcuts.PinShortcutHandler$a r0 = (com.roblox.client.shortcuts.PinShortcutHandler.a) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            com.roblox.client.shortcuts.PinShortcutHandler$a r0 = new com.roblox.client.shortcuts.PinShortcutHandler$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f9432y
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.A
            r3 = 1
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r7 = r0.f9430w
            x6.g r7 = (x6.ImageRequest) r7
            java.lang.Object r7 = r0.f9429v
            com.roblox.client.shortcuts.PinShortcutHandler r7 = (com.roblox.client.shortcuts.PinShortcutHandler) r7
            java.lang.Object r7 = r0.f9428u
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f9427t
            android.content.Context r7 = (android.content.Context) r7
            gt.o.b(r9)     // Catch: java.lang.Throwable -> L3b
            goto L89
        L3b:
            r8 = move-exception
            goto L9d
        L3d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L45:
            gt.o.b(r9)
            int r9 = r8.length()
            if (r9 != 0) goto L53
            androidx.core.graphics.drawable.IconCompat r7 = r6.fallbackIcon(r7)
            return r7
        L53:
            gt.n$a r9 = gt.n.INSTANCE     // Catch: java.lang.Throwable -> L3b
            x6.g$a r9 = new x6.g$a     // Catch: java.lang.Throwable -> L3b
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L3b
            x6.g$a r9 = r9.c(r8)     // Catch: java.lang.Throwable -> L3b
            x6.g$a r9 = x6.j.a(r9, r5)     // Catch: java.lang.Throwable -> L3b
            x6.g r9 = r9.b()     // Catch: java.lang.Throwable -> L3b
            k6.s r2 = k6.d0.a(r7)     // Catch: java.lang.Throwable -> L3b
            r0.f9427t = r7     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r8 = ot.l.a(r8)     // Catch: java.lang.Throwable -> L3b
            r0.f9428u = r8     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r8 = ot.l.a(r6)     // Catch: java.lang.Throwable -> L3b
            r0.f9429v = r8     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r8 = ot.l.a(r9)     // Catch: java.lang.Throwable -> L3b
            r0.f9430w = r8     // Catch: java.lang.Throwable -> L3b
            r0.f9431x = r5     // Catch: java.lang.Throwable -> L3b
            r0.A = r3     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r9 = r2.d(r9, r0)     // Catch: java.lang.Throwable -> L3b
            if (r9 != r1) goto L89
            return r1
        L89:
            x6.k r9 = (x6.k) r9     // Catch: java.lang.Throwable -> L3b
            k6.n r8 = r9.getImage()     // Catch: java.lang.Throwable -> L3b
            if (r8 == 0) goto L97
            r9 = 3
            android.graphics.Bitmap r8 = k6.v.g(r8, r5, r5, r9, r4)     // Catch: java.lang.Throwable -> L3b
            goto L98
        L97:
            r8 = r4
        L98:
            java.lang.Object r8 = gt.n.b(r8)     // Catch: java.lang.Throwable -> L3b
            goto La7
        L9d:
            gt.n$a r9 = gt.n.INSTANCE
            java.lang.Object r8 = gt.o.a(r8)
            java.lang.Object r8 = gt.n.b(r8)
        La7:
            boolean r9 = gt.n.g(r8)
            if (r9 == 0) goto Lae
            goto Laf
        Lae:
            r4 = r8
        Laf:
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            if (r4 == 0) goto Lba
            androidx.core.graphics.drawable.IconCompat r8 = androidx.core.graphics.drawable.IconCompat.b(r4)
            if (r8 == 0) goto Lba
            goto Lbe
        Lba:
            androidx.core.graphics.drawable.IconCompat r8 = r6.fallbackIcon(r7)
        Lbe:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.shortcuts.PinShortcutHandler.loadIcon(android.content.Context, java.lang.String, mt.b):java.lang.Object");
    }

    private final void requestPinShortcut(long placeId, String thumbnailUrl, String experienceName, String shortcutId, Uri deepLink) {
        k.d(coroutineScope, null, null, new b(thumbnailUrl, deepLink, placeId, shortcutId, experienceName, null), 3, null);
    }

    @NotNull
    public final p0 getCoroutineScope$NativeShell_googleProdRelease() {
        return coroutineScope;
    }

    @NotNull
    public final Function0<String> getManufacturerProvider$NativeShell_googleProdRelease() {
        return manufacturerProvider;
    }

    @Override // com.roblox.protocols.pinshortcutplatforminterface.generated.IPlatformPinShortcut
    public boolean isAvailable() {
        return e.g(RobloxApplication.f());
    }

    @Override // com.roblox.protocols.pinshortcutplatforminterface.generated.IPlatformPinShortcut
    public boolean isPinExperienceV2Available() {
        return h.a().W0() && isAvailable();
    }

    @Override // android.view.f
    public void onCreate(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (h.a().x4() && !q0.i(coroutineScope)) {
            coroutineScope = q0.a(g1.b().plus(z2.b(null, 1, null)));
        }
        IPinShortcutHandlerCore.setPlatformImpl(this);
    }

    @Override // android.view.f
    public void onDestroy(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        q0.f(coroutineScope, null, 1, null);
    }

    @Override // android.view.f
    public /* bridge */ void onPause(@NotNull s sVar) {
        super.onPause(sVar);
    }

    public final void onPinConfirmed$NativeShell_googleProdRelease(long placeId) {
        q.h(TAG, "Shortcut pinned for placeId=" + placeId);
        wj.b.f34343a.e(placeId);
    }

    @Override // android.view.f
    public /* bridge */ void onResume(@NotNull s sVar) {
        super.onResume(sVar);
    }

    @Override // android.view.f
    public /* bridge */ void onStart(@NotNull s sVar) {
        super.onStart(sVar);
    }

    @Override // android.view.f
    public /* bridge */ void onStop(@NotNull s sVar) {
        super.onStop(sVar);
    }

    @Override // com.roblox.protocols.pinshortcutplatforminterface.generated.IPlatformPinShortcut
    public void pinExperience(long placeId, @NotNull String thumbnailUrl, @NotNull String experienceName) {
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        Intrinsics.checkNotNullParameter(experienceName, "experienceName");
        Uri build = Uri.parse(DEEP_LINK_BASE).buildUpon().appendQueryParameter("placeId", String.valueOf(placeId)).appendQueryParameter(PARAM_JOIN_ORIGIN, JOIN_ORIGIN_PINNED_SHORTCUT).build();
        String h10 = wj.b.f34343a.h(placeId);
        Intrinsics.checkNotNull(build);
        requestPinShortcut(placeId, thumbnailUrl, experienceName, h10, build);
    }

    @Override // com.roblox.protocols.pinshortcutplatforminterface.generated.IPlatformPinShortcut
    public void pinExperienceV2(long placeId, long universeId, @NotNull String thumbnailUrl, @NotNull String experienceName) {
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        Intrinsics.checkNotNullParameter(experienceName, "experienceName");
        Uri build = Uri.parse(EXPERIENCE_DETAILS_DEEP_LINK_BASE).buildUpon().appendQueryParameter(PARAM_GAME_ID, String.valueOf(universeId)).appendQueryParameter(PARAM_HOME_ROOT, "true").appendQueryParameter(PARAM_CONTEXT, CONTEXT_PINNED_SHORTCUT).appendQueryParameter(PARAM_FULL_VIEW, "true").build();
        String g10 = wj.b.f34343a.g(placeId);
        Intrinsics.checkNotNull(build);
        requestPinShortcut(placeId, thumbnailUrl, experienceName, g10, build);
    }

    public final void setCoroutineScope$NativeShell_googleProdRelease(@NotNull p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<set-?>");
        coroutineScope = p0Var;
    }

    public final void setManufacturerProvider$NativeShell_googleProdRelease(@NotNull Function0<String> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        manufacturerProvider = function0;
    }
}

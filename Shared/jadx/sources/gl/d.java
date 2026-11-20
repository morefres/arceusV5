package gl;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.share.attribution.RequestError;
import com.roblox.protocols.designfoundationsplatforminterface.generated.ColorTokenVariants;
import com.roblox.protocols.designfoundationsplatforminterface.generated.DesignTokens;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.j0;
import kotlin.collections.k0;
import kotlin.jvm.internal.Intrinsics;
import mu.c0;
import mu.h;
import mu.i;
import mu.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0003J/\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lgl/d;", "Lgl/c;", "<init>", "()V", "", "key", "Lgl/a;", j6.b.f21518e, "(Ljava/lang/String;)Lgl/a;", "Lcom/roblox/protocols/designfoundationsplatforminterface/generated/DesignTokens;", "colorTokens", "", "e", "(Lcom/roblox/protocols/designfoundationsplatforminterface/generated/DesignTokens;)V", rl.d.f30696a, "", "Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;", "f", "(Ljava/util/Map;)Ljava/util/Map;", "Lmu/c0;", ve.a.f33391e, "Lmu/c0;", "_tokenMap", "Lmu/h;", "Lmu/h;", "()Lmu/h;", "tokenUpdates", "", "c", "()Z", "hasTokens", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<Map<String, AndroidColorToken>> _tokenMap;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final h<Unit> tokenUpdates;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements h<Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f18479a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: gl.d$a$a, reason: collision with other inner class name */
        public static final class C0332a<T> implements i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f18480a;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            @f(c = "com.roblox.protocols.designfoundations.DesignFoundationsPlatformHandler$special$$inlined$map$1$2", f = "DesignFoundationsPlatformHandler.kt", l = {RequestError.RESPONSE_CODE_FAILURE}, m = "emit", v = 1)
            /* renamed from: gl.d$a$a$a, reason: collision with other inner class name */
            public static final class C0333a extends ot.d {
                public int A;

                /* renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f18481t;

                /* renamed from: u, reason: collision with root package name */
                public int f18482u;

                /* renamed from: v, reason: collision with root package name */
                public Object f18483v;

                /* renamed from: x, reason: collision with root package name */
                public Object f18485x;

                /* renamed from: y, reason: collision with root package name */
                public Object f18486y;

                /* renamed from: z, reason: collision with root package name */
                public Object f18487z;

                public C0333a(mt.b bVar) {
                    super(bVar);
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    this.f18481t = obj;
                    this.f18482u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return C0332a.this.emit(null, this);
                }
            }

            public C0332a(i iVar) {
                this.f18480a = iVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // mu.i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, mt.b r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof gl.d.a.C0332a.C0333a
                    if (r0 == 0) goto L13
                    r0 = r7
                    gl.d$a$a$a r0 = (gl.d.a.C0332a.C0333a) r0
                    int r1 = r0.f18482u
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f18482u = r1
                    goto L18
                L13:
                    gl.d$a$a$a r0 = new gl.d$a$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f18481t
                    java.lang.Object r1 = nt.c.e()
                    int r2 = r0.f18482u
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r6 = r0.f18487z
                    mu.i r6 = (mu.i) r6
                    java.lang.Object r6 = r0.f18485x
                    gl.d$a$a$a r6 = (gl.d.a.C0332a.C0333a) r6
                    gt.o.b(r7)
                    goto L67
                L31:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L39:
                    gt.o.b(r7)
                    mu.i r7 = r5.f18480a
                    r2 = r6
                    java.util.Map r2 = (java.util.Map) r2
                    kotlin.Unit r2 = kotlin.Unit.f22894a
                    java.lang.Object r4 = ot.l.a(r6)
                    r0.f18483v = r4
                    java.lang.Object r4 = ot.l.a(r0)
                    r0.f18485x = r4
                    java.lang.Object r6 = ot.l.a(r6)
                    r0.f18486y = r6
                    java.lang.Object r6 = ot.l.a(r7)
                    r0.f18487z = r6
                    r6 = 0
                    r0.A = r6
                    r0.f18482u = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L67
                    return r1
                L67:
                    kotlin.Unit r6 = kotlin.Unit.f22894a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: gl.d.a.C0332a.emit(java.lang.Object, mt.b):java.lang.Object");
            }
        }

        public a(h hVar) {
            this.f18479a = hVar;
        }

        @Override // mu.h
        public Object collect(i<? super Unit> iVar, mt.b bVar) {
            Object collect = this.f18479a.collect(new C0332a(iVar), bVar);
            return collect == nt.c.e() ? collect : Unit.f22894a;
        }
    }

    public d() {
        c0<Map<String, AndroidColorToken>> a10 = r0.a(k0.j());
        this._tokenMap = a10;
        this.tokenUpdates = new a(a10);
    }

    @Override // gl.c
    @NotNull
    public h<Unit> a() {
        return this.tokenUpdates;
    }

    @Override // gl.c
    @Nullable
    public AndroidColorToken b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this._tokenMap.getValue().get(key);
    }

    @Override // gl.c
    public boolean c() {
        return !this._tokenMap.getValue().isEmpty();
    }

    public final void d() {
        this._tokenMap.setValue(k0.j());
    }

    public final void e(@NotNull DesignTokens colorTokens) {
        Intrinsics.checkNotNullParameter(colorTokens, "colorTokens");
        c0<Map<String, AndroidColorToken>> c0Var = this._tokenMap;
        HashMap<String, ColorTokenVariants> colorTokens2 = colorTokens.getColorTokens();
        Intrinsics.checkNotNullExpressionValue(colorTokens2, "getColorTokens(...)");
        c0Var.setValue(f(colorTokens2));
    }

    public final Map<String, AndroidColorToken> f(Map<String, ColorTokenVariants> colorTokens) {
        AndroidColorToken b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(j0.f(colorTokens.size()));
        Iterator<T> it = colorTokens.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            b = e.b((ColorTokenVariants) entry.getValue());
            linkedHashMap.put(key, b);
        }
        return linkedHashMap;
    }
}

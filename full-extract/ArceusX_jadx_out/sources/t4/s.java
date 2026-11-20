package t4;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.TopicsManager;
import android.annotation.SuppressLint;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0097@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000bH\u0083@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lt4/s;", "Lt4/j;", "Landroid/adservices/topics/TopicsManager;", "mTopicsManager", "<init>", "(Landroid/adservices/topics/TopicsManager;)V", "Lt4/b;", "request", "Lt4/e;", ve.a.f33391e, "(Lt4/b;Lmt/b;)Ljava/lang/Object;", "Landroid/adservices/topics/GetTopicsRequest;", "c", "(Lt4/b;)Landroid/adservices/topics/GetTopicsRequest;", "Landroid/adservices/topics/GetTopicsResponse;", Payload.RESPONSE, rl.d.f30696a, "(Landroid/adservices/topics/GetTopicsResponse;)Lt4/e;", "getTopicsRequest", "f", "(Landroid/adservices/topics/GetTopicsRequest;Lmt/b;)Ljava/lang/Object;", j6.b.f21518e, "Landroid/adservices/topics/TopicsManager;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public class s extends j {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final TopicsManager mTopicsManager;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @ot.f(c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", f = "TopicsManagerImplCommon.kt", l = {40}, m = "getTopics$suspendImpl")
    public static final class a extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f31981t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f31982u;

        /* renamed from: w, reason: collision with root package name */
        public int f31984w;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31982u = obj;
            this.f31984w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return s.e(s.this, null, this);
        }
    }

    public s(@NotNull TopicsManager mTopicsManager) {
        Intrinsics.checkNotNullParameter(mTopicsManager, "mTopicsManager");
        this.mTopicsManager = mTopicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object e(t4.s r4, t4.b r5, mt.b<? super t4.e> r6) {
        /*
            boolean r0 = r6 instanceof t4.s.a
            if (r0 == 0) goto L13
            r0 = r6
            t4.s$a r0 = (t4.s.a) r0
            int r1 = r0.f31984w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31984w = r1
            goto L18
        L13:
            t4.s$a r0 = new t4.s$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f31982u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f31984w
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f31981t
            t4.s r4 = (t4.s) r4
            gt.o.b(r6)
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            gt.o.b(r6)
            android.adservices.topics.GetTopicsRequest r5 = r4.c(r5)
            r0.f31981t = r4
            r0.f31984w = r3
            java.lang.Object r6 = r4.f(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            android.adservices.topics.GetTopicsResponse r5 = t4.r.a(r6)
            t4.e r4 = r4.d(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.s.e(t4.s, t4.b, mt.b):java.lang.Object");
    }

    @Override // t4.j
    @Nullable
    public Object a(@NotNull b bVar, @NotNull mt.b<? super e> bVar2) {
        return e(this, bVar, bVar2);
    }

    @NotNull
    public GetTopicsRequest c(@NotNull b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return d.f31973a.b(request);
    }

    @NotNull
    public e d(@NotNull GetTopicsResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return h.f31975a.a(response);
    }

    public final Object f(GetTopicsRequest getTopicsRequest, mt.b<? super GetTopicsResponse> bVar) {
        ju.p pVar = new ju.p(nt.b.c(bVar), 1);
        pVar.F();
        this.mTopicsManager.getTopics(getTopicsRequest, new e3.n(), u2.n.a(pVar));
        Object z10 = pVar.z();
        if (z10 == nt.c.e()) {
            ot.h.c(bVar);
        }
        return z10;
    }
}

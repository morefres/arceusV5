package hq;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a<\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "maxAttempts", "Lkotlin/Function2;", "Lmt/b;", "", "", "block", "", ve.a.f33391e, "(ILkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;", "shared_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b0 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.shared.RetryKt", f = "Retry.kt", l = {13}, m = "retry")
    public static final class a extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public int f19552t;

        /* renamed from: u, reason: collision with root package name */
        public int f19553u;

        /* renamed from: v, reason: collision with root package name */
        public Object f19554v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f19555w;

        /* renamed from: x, reason: collision with root package name */
        public int f19556x;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19555w = obj;
            this.f19556x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return b0.a(0, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0056 -> B:10:0x0059). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(int r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super mt.b<? super java.lang.Boolean>, ? extends java.lang.Object> r6, @org.jetbrains.annotations.NotNull mt.b<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof hq.b0.a
            if (r0 == 0) goto L13
            r0 = r7
            hq.b0$a r0 = (hq.b0.a) r0
            int r1 = r0.f19556x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19556x = r1
            goto L18
        L13:
            hq.b0$a r0 = new hq.b0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19555w
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f19556x
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r5 = r0.f19553u
            int r6 = r0.f19552t
            java.lang.Object r2 = r0.f19554v
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            gt.o.b(r7)
            goto L59
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            gt.o.b(r7)
            r7 = 0
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L41:
            if (r5 >= r6) goto L65
            java.lang.Integer r2 = ot.b.c(r5)
            r0.f19554v = r7
            r0.f19552t = r6
            r0.f19553u = r5
            r0.f19556x = r3
            java.lang.Object r2 = r7.invoke(r2, r0)
            if (r2 != r1) goto L56
            return r1
        L56:
            r4 = r2
            r2 = r7
            r7 = r4
        L59:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L62
            goto L65
        L62:
            int r5 = r5 + r3
            r7 = r2
            goto L41
        L65:
            kotlin.Unit r5 = kotlin.Unit.f22894a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: hq.b0.a(int, kotlin.jvm.functions.Function2, mt.b):java.lang.Object");
    }
}

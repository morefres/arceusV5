package xi;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.roblox.platform.http.returntypes.ossearch.SearchIndexItem;
import ek.q;
import gt.o;
import java.util.List;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m2.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;
import ot.m;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\n\u001a,\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;", "Landroid/graphics/Bitmap;", "thumbnail", "Landroid/content/Context;", "context", "Lm2/c;", rl.d.f30696a, "(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Landroid/graphics/Bitmap;Landroid/content/Context;)Lm2/c;", "Landroidx/core/graphics/drawable/IconCompat;", j6.b.f21518e, "(Landroid/content/Context;)Landroidx/core/graphics/drawable/IconCompat;", "Lcom/roblox/client/ossearch/c;", "cache", "Lju/l0;", "ioDispatcher", "Lxi/e;", "c", "(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Lcom/roblox/client/ossearch/c;Lju/l0;Landroid/content/Context;Lmt/b;)Ljava/lang/Object;", "", ve.a.f33391e, "(Landroid/content/Context;)I", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.roblox.client.ossearch.OSSearchUtilKt", f = "OSSearchUtil.kt", l = {59, 61, 62}, m = "getThumbnail", v = 1)
    /* renamed from: xi.a$a, reason: collision with other inner class name */
    public static final class C0654a extends ot.d {
        public int A;
        public /* synthetic */ Object B;
        public int C;

        /* renamed from: t, reason: collision with root package name */
        public Object f35579t;

        /* renamed from: u, reason: collision with root package name */
        public Object f35580u;

        /* renamed from: v, reason: collision with root package name */
        public Object f35581v;

        /* renamed from: w, reason: collision with root package name */
        public Object f35582w;

        /* renamed from: x, reason: collision with root package name */
        public Object f35583x;

        /* renamed from: y, reason: collision with root package name */
        public Object f35584y;

        /* renamed from: z, reason: collision with root package name */
        public Object f35585z;

        public C0654a(mt.b<? super C0654a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.B = obj;
            this.C |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return a.c(null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lju/p0;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.ossearch.OSSearchUtilKt$getThumbnail$cached$1", f = "OSSearchUtil.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, mt.b<? super Bitmap>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f35586t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.roblox.client.ossearch.c f35587u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SearchIndexItem f35588v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.roblox.client.ossearch.c cVar, SearchIndexItem searchIndexItem, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f35587u = cVar;
            this.f35588v = searchIndexItem;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new b(this.f35587u, this.f35588v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f35586t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return this.f35587u.i(this.f35588v.getThumbnailCacheKey());
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Bitmap> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.ossearch.OSSearchUtilKt$getThumbnail$fetched$1$1", f = "OSSearchUtil.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f35589t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.roblox.client.ossearch.c f35590u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SearchIndexItem f35591v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Bitmap f35592w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.roblox.client.ossearch.c cVar, SearchIndexItem searchIndexItem, Bitmap bitmap, mt.b<? super c> bVar) {
            super(2, bVar);
            this.f35590u = cVar;
            this.f35591v = searchIndexItem;
            this.f35592w = bitmap;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new c(this.f35590u, this.f35591v, this.f35592w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f35589t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f35590u.k(this.f35591v.getThumbnailCacheKey(), this.f35592w);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public static final int a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int b10 = m2.e.b(context);
        List<m2.c> f10 = m2.e.f(context, 1);
        Intrinsics.checkNotNullExpressionValue(f10, "getShortcuts(...)");
        return b10 - f10.size();
    }

    public static final IconCompat b(Context context) {
        IconCompat d10 = IconCompat.d(context, rg.p0.f30442a);
        Intrinsics.checkNotNullExpressionValue(d10, "createWithResource(...)");
        return d10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009c, code lost:
    
        if (r14 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@org.jetbrains.annotations.NotNull com.roblox.platform.http.returntypes.ossearch.SearchIndexItem r10, @org.jetbrains.annotations.NotNull com.roblox.client.ossearch.c r11, @org.jetbrains.annotations.NotNull ju.l0 r12, @org.jetbrains.annotations.NotNull android.content.Context r13, @org.jetbrains.annotations.NotNull mt.b<? super xi.ThumbnailResult> r14) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xi.a.c(com.roblox.platform.http.returntypes.ossearch.SearchIndexItem, com.roblox.client.ossearch.c, ju.l0, android.content.Context, mt.b):java.lang.Object");
    }

    @NotNull
    public static final m2.c d(@NotNull SearchIndexItem searchIndexItem, @Nullable Bitmap bitmap, @NotNull Context context) {
        IconCompat b10;
        Intrinsics.checkNotNullParameter(searchIndexItem, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Uri build = Uri.parse(searchIndexItem.getDeeplinkUrl()).buildUpon().appendQueryParameter("joinAttemptOrigin", "AndroidSearch").build();
        c.b g10 = new c.b(context, searchIndexItem.getId()).g(searchIndexItem.getRankingHint());
        if (bitmap == null || (b10 = IconCompat.b(bitmap)) == null) {
            q.h("OSSearch", "Failed to fetch thumbnail for experience " + searchIndexItem.getId() + ". Falling back to launcher icon.");
            b10 = b(context);
        }
        if (b10 != null) {
            Intrinsics.checkNotNull(g10);
            g10.c(b10);
        }
        m2.c a10 = g10.h(searchIndexItem.getTitle()).d(new Intent("android.intent.action.VIEW", build)).f(true).a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        return a10;
    }
}

package gk;

import android.content.Context;
import java.io.File;
import k6.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n6.a;
import n6.b;
import org.jetbrains.annotations.NotNull;
import s6.d;
import tt.k;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lgk/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lk6/s;", ve.a.f33391e, "(Landroid/content/Context;)Lk6/s;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f18474a = new a();

    @NotNull
    public final s a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        s.a k10 = new s.a(context).k(new d.a().c(context, 0.15d).b());
        a.C0454a c10 = new a.C0454a().c(10485760L);
        File cacheDir = context.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        return k10.i(b.a(c10, k.s(cacheDir, "img_cache")).a()).d();
    }
}

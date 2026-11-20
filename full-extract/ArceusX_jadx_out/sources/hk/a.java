package hk;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import ek.q;
import gt.n;
import gt.o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y6.Size;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015¨\u0006\u0017"}, d2 = {"Lhk/a;", "Lc7/c;", "Landroid/content/Context;", "context", "", "colorAttr", "<init>", "(Landroid/content/Context;I)V", "Landroid/graphics/Bitmap;", "input", "Ly6/g;", "size", j6.b.f21518e, "(Landroid/graphics/Bitmap;Ly6/g;Lmt/b;)Ljava/lang/Object;", "c", "()I", ve.a.f33391e, "Landroid/content/Context;", "I", "", "Ljava/lang/String;", "()Ljava/lang/String;", "cacheKey", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends c7.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* renamed from: b, reason: from kotlin metadata */
    public final int colorAttr;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String cacheKey;

    public a(@NotNull Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.colorAttr = i10;
        this.cacheKey = "FillTransparentBackgroundTransformation";
    }

    @Override // c7.c
    @NotNull
    /* renamed from: a, reason: from getter */
    public String getCacheKey() {
        return this.cacheKey;
    }

    @Override // c7.c
    @Nullable
    public Object b(@NotNull Bitmap bitmap, @NotNull Size size, @NotNull mt.b<? super Bitmap> bVar) {
        int c10 = c();
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(c10);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return createBitmap;
    }

    public final int c() {
        Object b;
        int c10;
        try {
            n.Companion companion = n.INSTANCE;
            int i10 = this.context.getResources().getConfiguration().uiMode & 48;
            if (i10 == 16) {
                c10 = Build.VERSION.SDK_INT >= 34 ? l2.b.c(this.context, R.color.system_background_light) : l2.b.c(this.context, R.color.background_light);
            } else if (i10 != 32) {
                q.d("Unable to get system theme. Falling back to system light background");
                c10 = l2.b.c(this.context, R.color.background_light);
            } else {
                c10 = Build.VERSION.SDK_INT >= 34 ? l2.b.c(this.context, R.color.system_background_dark) : l2.b.c(this.context, R.color.background_dark);
            }
            b = n.b(Integer.valueOf(c10));
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            b = n.b(o.a(th2));
        }
        Throwable e10 = n.e(b);
        if (e10 != null) {
            if (e10 instanceof Resources.NotFoundException) {
                q.f("FillTransparentBackgroundTransformation", "Error fetching system theme color", e10);
            } else {
                q.f("FillTransparentBackgroundTransformation", "Unknown error occurred while fetching system theme color", e10);
            }
            q.e("FillTransparentBackgroundTransformation", "Falling back to white background");
            b = -1;
        }
        return ((Number) b).intValue();
    }

    public /* synthetic */ a(Context context, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? R.attr.windowBackground : i10);
    }
}

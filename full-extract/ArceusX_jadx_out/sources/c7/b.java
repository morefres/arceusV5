package c7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.view.inputmethod.EditorInfoCompat;
import e7.r;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y6.Size;
import y6.a;
import y6.f;
import y6.h;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nJ \u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, d2 = {"Lc7/b;", "Lc7/c;", "", "topLeft", "topRight", "bottomLeft", "bottomRight", "<init>", "(FFFF)V", "radius", "(F)V", "Landroid/graphics/Bitmap;", "input", "Ly6/g;", "size", j6.b.f21518e, "(Landroid/graphics/Bitmap;Ly6/g;Lmt/b;)Ljava/lang/Object;", "Le7/r;", "c", "(Landroid/graphics/Bitmap;Ly6/g;)J", ve.a.f33391e, "F", rl.d.f30696a, "", "e", "Ljava/lang/String;", "()Ljava/lang/String;", "cacheKey", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float topLeft;

    /* renamed from: b, reason: from kotlin metadata */
    public final float topRight;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float bottomLeft;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final float bottomRight;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String cacheKey;

    public b(float f10, float f11, float f12, float f13) {
        this.topLeft = f10;
        this.topRight = f11;
        this.bottomLeft = f12;
        this.bottomRight = f13;
        if (f10 < 0.0f || f11 < 0.0f || f12 < 0.0f || f13 < 0.0f) {
            throw new IllegalArgumentException("All radii must be >= 0.");
        }
        this.cacheKey = d0.b(b.class).f() + '-' + f10 + ',' + f11 + ',' + f12 + ',' + f13;
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
        long c10 = c(bitmap, size);
        int c11 = r.c(c10);
        int d10 = r.d(c10);
        Bitmap createBitmap = Bitmap.createBitmap(c11, d10, e7.b.c(bitmap));
        Canvas canvas = new Canvas(createBitmap);
        Paint a10 = d.a(bitmap, c11, d10);
        float f10 = this.topLeft;
        float f11 = this.topRight;
        if (f10 == f11) {
            float f12 = this.bottomLeft;
            if (f11 == f12 && f12 == this.bottomRight) {
                canvas.drawRoundRect(0.0f, 0.0f, c11, d10, f10, f10, a10);
                return createBitmap;
            }
        }
        float f13 = this.bottomRight;
        float f14 = this.bottomLeft;
        float[] fArr = {f10, f10, f11, f11, f13, f13, f14, f14};
        RectF rectF = new RectF(0.0f, 0.0f, c11, d10);
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, a10);
        return createBitmap;
    }

    public final long c(Bitmap input, Size size) {
        if (h.b(size)) {
            return r.a(input.getWidth(), input.getHeight());
        }
        y6.a width = size.getWidth();
        y6.a height = size.getHeight();
        if ((width instanceof a.C0674a) && (height instanceof a.C0674a)) {
            return r.a(((a.C0674a) width).getPx(), ((a.C0674a) height).getPx());
        }
        int width2 = input.getWidth();
        int height2 = input.getHeight();
        y6.a d10 = size.d();
        boolean z10 = d10 instanceof a.C0674a;
        int i10 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        int px = z10 ? ((a.C0674a) d10).getPx() : Integer.MIN_VALUE;
        y6.a c10 = size.c();
        if (c10 instanceof a.C0674a) {
            i10 = ((a.C0674a) c10).getPx();
        }
        double d11 = m6.h.d(width2, height2, px, i10, f.f36507a);
        return r.a(bu.b.c(input.getWidth() * d11), bu.b.c(d11 * input.getHeight()));
    }

    public b(float f10) {
        this(f10, f10, f10, f10);
    }
}

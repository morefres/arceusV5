package gd;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.core.graphics.c;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f18450i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f18451j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f18452k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f18453l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Paint f18454a;

    @NonNull
    public final Paint b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Paint f18455c;

    /* renamed from: d, reason: collision with root package name */
    public int f18456d;

    /* renamed from: e, reason: collision with root package name */
    public int f18457e;

    /* renamed from: f, reason: collision with root package name */
    public int f18458f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f18459g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f18460h;

    public a() {
        this(ViewCompat.MEASURED_STATE_MASK);
    }

    public void a(@NonNull Canvas canvas, Matrix matrix, @NonNull RectF rectF, int i10, float f10, float f11) {
        float f12;
        boolean z10 = f11 < 0.0f;
        Path path = this.f18459g;
        if (z10) {
            int[] iArr = f18452k;
            iArr[0] = 0;
            iArr[1] = this.f18458f;
            iArr[2] = this.f18457e;
            iArr[3] = this.f18456d;
            f12 = f10;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f12 = f10;
            path.arcTo(rectF, f12, f11);
            path.close();
            float f13 = -i10;
            rectF.inset(f13, f13);
            int[] iArr2 = f18452k;
            iArr2[0] = 0;
            iArr2[1] = this.f18456d;
            iArr2[2] = this.f18457e;
            iArr2[3] = this.f18458f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f14 = 1.0f - (i10 / width);
        float[] fArr = f18453l;
        fArr[1] = f14;
        fArr[2] = ((1.0f - f14) / 2.0f) + f14;
        this.b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f18452k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f18460h);
        }
        canvas.drawArc(rectF, f12, f11, true, this.b);
        canvas.restore();
    }

    public void b(@NonNull Canvas canvas, Matrix matrix, @NonNull RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f18450i;
        iArr[0] = this.f18458f;
        iArr[1] = this.f18457e;
        iArr[2] = this.f18456d;
        Paint paint = this.f18455c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f18451j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f18455c);
        canvas.restore();
    }

    @NonNull
    public Paint c() {
        return this.f18454a;
    }

    public void d(int i10) {
        this.f18456d = c.l(i10, 68);
        this.f18457e = c.l(i10, 20);
        this.f18458f = c.l(i10, 0);
        this.f18454a.setColor(this.f18456d);
    }

    public a(int i10) {
        this.f18459g = new Path();
        Paint paint = new Paint();
        this.f18460h = paint;
        this.f18454a = new Paint();
        d(i10);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f18455c = new Paint(paint2);
    }
}

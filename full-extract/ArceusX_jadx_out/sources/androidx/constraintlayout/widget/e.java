package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import c2.e;

/* loaded from: classes.dex */
public class e extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f1544a;
    public View b;

    /* renamed from: c, reason: collision with root package name */
    public int f1545c;

    public void a(ConstraintLayout constraintLayout) {
        if (this.b == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.b.getLayoutParams();
        bVar2.f1401v0.k1(0);
        e.b A = bVar.f1401v0.A();
        e.b bVar3 = e.b.FIXED;
        if (A != bVar3) {
            bVar.f1401v0.l1(bVar2.f1401v0.W());
        }
        if (bVar.f1401v0.T() != bVar3) {
            bVar.f1401v0.M0(bVar2.f1401v0.x());
        }
        bVar2.f1401v0.k1(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f1544a == -1 && !isInEditMode()) {
            setVisibility(this.f1545c);
        }
        View findViewById = constraintLayout.findViewById(this.f1544a);
        this.b = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.b) findViewById.getLayoutParams()).f1377j0 = true;
            this.b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.b;
    }

    public int getEmptyVisibility() {
        return this.f1545c;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i10) {
        View findViewById;
        if (this.f1544a == i10) {
            return;
        }
        View view = this.b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.b.getLayoutParams()).f1377j0 = false;
            this.b = null;
        }
        this.f1544a = i10;
        if (i10 == -1 || (findViewById = ((View) getParent()).findViewById(i10)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i10) {
        this.f1545c = i10;
    }
}

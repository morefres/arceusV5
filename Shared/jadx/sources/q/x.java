package q;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class x extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final y f29466a;

    public x(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.L);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f29466a.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f29466a.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f29466a.g(canvas);
    }

    public x(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        v0.a(this, getContext());
        y yVar = new y(this);
        this.f29466a = yVar;
        yVar.c(attributeSet, i10);
    }
}

package vc;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Dialog f33387a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33388c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33389d;

    public a(@NonNull Dialog dialog, @NonNull Rect rect) {
        this.f33387a = dialog;
        this.b = rect.left;
        this.f33388c = rect.top;
        this.f33389d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = this.b + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        if (new RectF(left, this.f33388c + findViewById.getTop(), width, findViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f33389d;
            obtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f33387a.onTouchEvent(obtain);
    }
}

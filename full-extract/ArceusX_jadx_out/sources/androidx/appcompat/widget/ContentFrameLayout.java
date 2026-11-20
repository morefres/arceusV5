package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f966a;
    public TypedValue b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f967c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f968d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f969e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f970f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f971g;

    /* renamed from: h, reason: collision with root package name */
    public a f972h;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f971g.set(i10, i11, i12, i13);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f969e == null) {
            this.f969e = new TypedValue();
        }
        return this.f969e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f970f == null) {
            this.f970f = new TypedValue();
        }
        return this.f970f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f967c == null) {
            this.f967c = new TypedValue();
        }
        return this.f967c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f968d == null) {
            this.f968d = new TypedValue();
        }
        return this.f968d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f966a == null) {
            this.f966a = new TypedValue();
        }
        return this.f966a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.b == null) {
            this.b = new TypedValue();
        }
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f972h;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f972h;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f972h = aVar;
    }

    public ContentFrameLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f971g = new Rect();
    }
}

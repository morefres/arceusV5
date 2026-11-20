package y2;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f36262a;
    public final p b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36263c;

    public a(int i10, p pVar, int i11) {
        this.f36262a = i10;
        this.b = pVar;
        this.f36263c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f36262a);
        this.b.b0(this.f36263c, bundle);
    }
}

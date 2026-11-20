package com.withpersona.sdk2.markwon.core.spans;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import androidx.annotation.NonNull;
import ts.c;

/* loaded from: classes3.dex */
public class LinkSpan extends URLSpan {

    /* renamed from: a, reason: collision with root package name */
    public final c f14088a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final ss.c f14089c;

    public LinkSpan(@NonNull c cVar, @NonNull String str, @NonNull ss.c cVar2) {
        super(str);
        this.f14088a = cVar;
        this.b = str;
        this.f14089c = cVar2;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        this.f14089c.a(view, this.b);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NonNull TextPaint textPaint) {
        this.f14088a.f(textPaint);
    }
}

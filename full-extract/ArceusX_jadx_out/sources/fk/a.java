package fk;

import android.content.Context;
import android.text.style.ClickableSpan;

/* loaded from: classes2.dex */
public abstract class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public String f17262a;
    public Context b;

    /* renamed from: c, reason: collision with root package name */
    public String f17263c;

    /* renamed from: d, reason: collision with root package name */
    public int f17264d;

    /* renamed from: e, reason: collision with root package name */
    public int f17265e;

    public a(String str, Context context, String str2, int i10, int i11) {
        this.b = context;
        this.f17262a = str;
        this.f17263c = str2;
        this.f17264d = i10;
        this.f17265e = i11;
    }

    public String a() {
        return this.f17263c;
    }

    public int b() {
        return this.f17265e;
    }

    public int c() {
        return this.f17264d;
    }
}

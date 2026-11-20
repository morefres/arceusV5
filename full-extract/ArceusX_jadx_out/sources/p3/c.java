package p3;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: i, reason: collision with root package name */
    public int f28348i;

    /* renamed from: j, reason: collision with root package name */
    public int f28349j;

    /* renamed from: k, reason: collision with root package name */
    public LayoutInflater f28350k;

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f28349j = i10;
        this.f28348i = i10;
        this.f28350k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p3.a
    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f28350k.inflate(this.f28349j, viewGroup, false);
    }

    @Override // p3.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f28350k.inflate(this.f28348i, viewGroup, false);
    }
}

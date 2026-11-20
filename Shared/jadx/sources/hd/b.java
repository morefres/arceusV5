package hd;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f19229a;
    public final float b;

    public b(float f10, @NonNull c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f19229a;
            f10 += ((b) cVar).b;
        }
        this.f19229a = cVar;
        this.b = f10;
    }

    @Override // hd.c
    public float a(@NonNull RectF rectF) {
        return Math.max(0.0f, this.f19229a.a(rectF) + this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f19229a.equals(bVar.f19229a) && this.b == bVar.b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19229a, Float.valueOf(this.b)});
    }
}

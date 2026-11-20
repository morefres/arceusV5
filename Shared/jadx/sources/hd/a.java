package hd;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f19228a;

    public a(float f10) {
        this.f19228a = f10;
    }

    @Override // hd.c
    public float a(@NonNull RectF rectF) {
        return this.f19228a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f19228a == ((a) obj).f19228a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f19228a)});
    }
}

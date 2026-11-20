package c8;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4784a;
    public final l8.a b;

    /* renamed from: c, reason: collision with root package name */
    public final l8.a f4785c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4786d;

    public c(Context context, l8.a aVar, l8.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f4784a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f4785c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f4786d = str;
    }

    @Override // c8.h
    public Context b() {
        return this.f4784a;
    }

    @Override // c8.h
    @NonNull
    public String c() {
        return this.f4786d;
    }

    @Override // c8.h
    public l8.a d() {
        return this.f4785c;
    }

    @Override // c8.h
    public l8.a e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f4784a.equals(hVar.b()) && this.b.equals(hVar.e()) && this.f4785c.equals(hVar.d()) && this.f4786d.equals(hVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f4784a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f4785c.hashCode()) * 1000003) ^ this.f4786d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f4784a + ", wallClock=" + this.b + ", monotonicClock=" + this.f4785c + ", backendName=" + this.f4786d + "}";
    }
}

package u2;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f32596a;

    public l(Object obj) {
        this.f32596a = (LocaleList) obj;
    }

    @Override // u2.k
    public String a() {
        return this.f32596a.toLanguageTags();
    }

    @Override // u2.k
    public Object b() {
        return this.f32596a;
    }

    public boolean equals(Object obj) {
        return this.f32596a.equals(((k) obj).b());
    }

    @Override // u2.k
    public Locale get(int i10) {
        return this.f32596a.get(i10);
    }

    public int hashCode() {
        return this.f32596a.hashCode();
    }

    @Override // u2.k
    public boolean isEmpty() {
        return this.f32596a.isEmpty();
    }

    @Override // u2.k
    public int size() {
        return this.f32596a.size();
    }

    public String toString() {
        return this.f32596a.toString();
    }
}

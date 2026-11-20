package f1;

import android.net.Uri;

/* loaded from: classes.dex */
public final class h extends v {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f16422a;

    public h(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null outputUri");
        }
        this.f16422a = uri;
    }

    @Override // f1.v
    public Uri a() {
        return this.f16422a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            return this.f16422a.equals(((v) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f16422a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "OutputResults{outputUri=" + this.f16422a + "}";
    }
}

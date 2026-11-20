package x5;

import android.app.Notification;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f35291a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f35292c;

    public k(int i10, Notification notification, int i11) {
        this.f35291a = i10;
        this.f35292c = notification;
        this.b = i11;
    }

    public int a() {
        return this.b;
    }

    public Notification b() {
        return this.f35292c;
    }

    public int c() {
        return this.f35291a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f35291a == kVar.f35291a && this.b == kVar.b) {
            return this.f35292c.equals(kVar.f35292c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f35291a * 31) + this.b) * 31) + this.f35292c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f35291a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.f35292c + '}';
    }
}

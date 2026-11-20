package fb;

import android.os.Bundle;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class d {
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public int f17080c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f17081d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f17082e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f17083f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f17084g = 0;

    /* renamed from: a, reason: collision with root package name */
    public IBinder f17079a = null;

    public d(int i10, IBinder iBinder) {
        this.b = i10;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("popupLocationInfo.gravity", this.b);
        bundle.putInt("popupLocationInfo.displayId", this.f17080c);
        bundle.putInt("popupLocationInfo.left", this.f17081d);
        bundle.putInt("popupLocationInfo.top", this.f17082e);
        bundle.putInt("popupLocationInfo.right", this.f17083f);
        bundle.putInt("popupLocationInfo.bottom", this.f17084g);
        return bundle;
    }
}

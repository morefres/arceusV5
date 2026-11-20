package nb;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;

/* loaded from: classes.dex */
public final class x5 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f26791a;

    @NonNull
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26792c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final Bundle f26793d;

    public x5(@NonNull String str, @NonNull String str2, Bundle bundle, long j10) {
        this.f26791a = str;
        this.b = str2;
        this.f26793d = bundle;
        this.f26792c = j10;
    }

    public static x5 a(zzbg zzbgVar) {
        return new x5(zzbgVar.f7471f, zzbgVar.f7473h, zzbgVar.f7472g.y3(), zzbgVar.f7474i);
    }

    public final zzbg b() {
        return new zzbg(this.f26791a, new zzbe(new Bundle(this.f26793d)), this.b, this.f26792c);
    }

    public final String toString() {
        String str = this.b;
        String obj = this.f26793d.toString();
        int length = String.valueOf(str).length();
        String str2 = this.f26791a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + obj.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(obj);
        return sb2.toString();
    }
}

package n9;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import k9.a;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final SparseIntArray f25952a = new SparseIntArray();
    public j9.d b;

    public d0(@NonNull j9.d dVar) {
        m.l(dVar);
        this.b = dVar;
    }

    public final int a(Context context, int i10) {
        return this.f25952a.get(i10, -1);
    }

    @ResultIgnorabilityUnspecified
    public final int b(@NonNull Context context, @NonNull a.f fVar) {
        m.l(context);
        m.l(fVar);
        int i10 = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int a10 = a(context, minApkVersion);
        if (a10 != -1) {
            return a10;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.f25952a.size()) {
                i10 = -1;
                break;
            }
            int keyAt = this.f25952a.keyAt(i11);
            if (keyAt > minApkVersion && this.f25952a.get(keyAt) == 0) {
                break;
            }
            i11++;
        }
        if (i10 == -1) {
            i10 = this.b.h(context, minApkVersion);
        }
        this.f25952a.put(minApkVersion, i10);
        return i10;
    }

    public final void c() {
        this.f25952a.clear();
    }
}

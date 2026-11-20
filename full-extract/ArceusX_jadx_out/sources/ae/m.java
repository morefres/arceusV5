package ae;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.io.File;

/* loaded from: classes2.dex */
public final class m implements be.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final be.y0 f447a;

    public m(be.y0 y0Var) {
        this.f447a = y0Var;
    }

    @Override // be.y0
    public final /* bridge */ /* synthetic */ Object zza() {
        String string;
        Context a10 = ((k) this.f447a).a();
        try {
            Bundle bundle = a10.getPackageManager().getApplicationInfo(a10.getPackageName(), 128).metaData;
            if (bundle != null && (string = bundle.getString("local_testing_dir")) != null) {
                return new File(a10.getExternalFilesDir(null), string);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}

package y9;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import db.n;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: y9.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0675a extends n implements a {
        public AbstractBinderC0675a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @NonNull
        public static a s2(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new c(iBinder);
        }
    }
}

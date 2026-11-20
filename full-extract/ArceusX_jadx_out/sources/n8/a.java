package n8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import x7.b;
import x7.c;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: n8.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0456a extends b implements a {

        /* renamed from: n8.a$a$a, reason: collision with other inner class name */
        public static class C0457a extends x7.a implements a {
            public C0457a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // n8.a
            public final Bundle b(Bundle bundle) {
                Parcel r22 = r2();
                c.b(r22, bundle);
                Parcel s22 = s2(r22);
                Bundle bundle2 = (Bundle) c.a(s22, Bundle.CREATOR);
                s22.recycle();
                return bundle2;
            }
        }

        public static a r2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new C0457a(iBinder);
        }
    }

    Bundle b(Bundle bundle);
}

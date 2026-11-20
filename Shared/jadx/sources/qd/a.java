package qd;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.NonNull;
import ib.c;

/* loaded from: classes2.dex */
public interface a extends IInterface {

    /* renamed from: qd.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0517a extends ib.b implements a {

        /* renamed from: qd.a$a$a, reason: collision with other inner class name */
        public static class C0518a extends ib.a implements a {
            public C0518a(IBinder iBinder) {
                super(iBinder, "com.google.android.play.agesignals.protocol.IAgeSignalsService");
            }

            @Override // qd.a
            public void y1(@NonNull String str, @NonNull Bundle bundle, @NonNull b bVar) {
                Parcel r22 = r2();
                r22.writeString(str);
                c.c(r22, bundle);
                if (bVar == null) {
                    r22.writeStrongBinder(null);
                } else {
                    r22.writeStrongBinder(bVar.asBinder());
                }
                s2(1, r22);
            }
        }

        @NonNull
        public static a s2(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.agesignals.protocol.IAgeSignalsService");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new C0518a(iBinder);
        }
    }

    void y1(@NonNull String str, @NonNull Bundle bundle, @NonNull b bVar);
}

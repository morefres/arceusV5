package g9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest;

/* loaded from: classes.dex */
public interface c extends IInterface {

    public static abstract class a extends ab.d implements c {

        /* renamed from: g9.c$a$a, reason: collision with other inner class name */
        public static class C0328a extends ab.a implements c {
            public C0328a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
            }

            @Override // g9.c
            public void H0(@NonNull GetRestoreCredentialRequest getRestoreCredentialRequest, @NonNull b bVar) {
                Parcel r22 = r2();
                ab.e.b(r22, getRestoreCredentialRequest);
                ab.e.c(r22, bVar);
                s2(2, r22);
            }

            @Override // g9.c
            public void y(@NonNull CreateRestoreCredentialRequest createRestoreCredentialRequest, @NonNull g9.a aVar) {
                Parcel r22 = r2();
                ab.e.b(r22, createRestoreCredentialRequest);
                ab.e.c(r22, aVar);
                s2(3, r22);
            }
        }

        @NonNull
        public static c u2(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
            return queryLocalInterface instanceof c ? (c) queryLocalInterface : new C0328a(iBinder);
        }
    }

    void H0(@NonNull GetRestoreCredentialRequest getRestoreCredentialRequest, @NonNull b bVar);

    void y(@NonNull CreateRestoreCredentialRequest createRestoreCredentialRequest, @NonNull g9.a aVar);
}

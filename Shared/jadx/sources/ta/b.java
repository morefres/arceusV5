package ta;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.SignalCredentialStateRequest;

/* loaded from: classes.dex */
public interface b extends IInterface {

    public static abstract class a extends gb.b implements b {

        /* renamed from: ta.b$a$a, reason: collision with other inner class name */
        public static class C0576a extends gb.a implements b {
            public C0576a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
            }

            @Override // ta.b
            public void Z1(@NonNull ta.a aVar, @NonNull GetCredentialRequest getCredentialRequest, @NonNull ApiMetadata apiMetadata) {
                Parcel r22 = r2();
                gb.c.c(r22, aVar);
                gb.c.b(r22, getCredentialRequest);
                gb.c.b(r22, apiMetadata);
                s2(1, r22);
            }

            @Override // ta.b
            public void m2(@NonNull ta.a aVar, @NonNull SignalCredentialStateRequest signalCredentialStateRequest, @NonNull ApiMetadata apiMetadata) {
                Parcel r22 = r2();
                gb.c.c(r22, aVar);
                gb.c.b(r22, signalCredentialStateRequest);
                gb.c.b(r22, apiMetadata);
                s2(10, r22);
            }

            @Override // ta.b
            public void x(@NonNull ta.a aVar, @NonNull CreateCredentialRequest createCredentialRequest, @NonNull ApiMetadata apiMetadata) {
                Parcel r22 = r2();
                gb.c.c(r22, aVar);
                gb.c.b(r22, createCredentialRequest);
                gb.c.b(r22, apiMetadata);
                s2(6, r22);
            }
        }

        @NonNull
        public static b u2(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
            return queryLocalInterface instanceof b ? (b) queryLocalInterface : new C0576a(iBinder);
        }
    }

    void Z1(@NonNull ta.a aVar, @NonNull GetCredentialRequest getCredentialRequest, @NonNull ApiMetadata apiMetadata);

    void m2(@NonNull ta.a aVar, @NonNull SignalCredentialStateRequest signalCredentialStateRequest, @NonNull ApiMetadata apiMetadata);

    void x(@NonNull ta.a aVar, @NonNull CreateCredentialRequest createCredentialRequest, @NonNull ApiMetadata apiMetadata);
}

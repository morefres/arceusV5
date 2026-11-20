package ab;

import android.os.IInterface;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public interface n extends IInterface {
    void a1(Status status, RetrieveBytesResponse retrieveBytesResponse);

    void s0(Status status, byte[] bArr);
}

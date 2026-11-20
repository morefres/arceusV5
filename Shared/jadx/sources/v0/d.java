package v0;

import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import java.nio.ByteBuffer;
import n0.k3;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final IncorrectJpegMetadataQuirk f33156a;

    public d(k3 k3Var) {
        this.f33156a = (IncorrectJpegMetadataQuirk) k3Var.b(IncorrectJpegMetadataQuirk.class);
    }

    public byte[] a(androidx.camera.core.d dVar) {
        IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = this.f33156a;
        if (incorrectJpegMetadataQuirk != null) {
            return incorrectJpegMetadataQuirk.j(dVar);
        }
        ByteBuffer k10 = dVar.F1()[0].k();
        byte[] bArr = new byte[k10.capacity()];
        k10.rewind();
        k10.get(bArr);
        return bArr;
    }
}

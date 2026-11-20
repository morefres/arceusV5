package v0;

import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import g0.w2;
import java.util.Collection;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final ImageCaptureFailedForSpecificCombinationQuirk f33157a = (ImageCaptureFailedForSpecificCombinationQuirk) u0.b.b(ImageCaptureFailedForSpecificCombinationQuirk.class);
    public final PreviewGreenTintQuirk b = (PreviewGreenTintQuirk) u0.b.b(PreviewGreenTintQuirk.class);

    public boolean a(String str, Collection<w2> collection) {
        ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk = this.f33157a;
        if (imageCaptureFailedForSpecificCombinationQuirk != null) {
            return imageCaptureFailedForSpecificCombinationQuirk.k(str, collection);
        }
        if (this.b != null) {
            return PreviewGreenTintQuirk.i(str, collection);
        }
        return false;
    }
}

package d0;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import java.util.ArrayList;
import java.util.Comparator;

/* loaded from: classes.dex */
public class w {
    public static final Size b = new Size(320, 240);

    /* renamed from: c, reason: collision with root package name */
    public static final Comparator<Size> f14218c = new p0.e();

    /* renamed from: a, reason: collision with root package name */
    public final RepeatingStreamConstraintForVideoRecordingQuirk f14219a = (RepeatingStreamConstraintForVideoRecordingQuirk) c0.e.b(RepeatingStreamConstraintForVideoRecordingQuirk.class);

    public Size[] a(Size[] sizeArr) {
        if (this.f14219a == null || !RepeatingStreamConstraintForVideoRecordingQuirk.g()) {
            return sizeArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            if (f14218c.compare(size, b) >= 0) {
                arrayList.add(size);
            }
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}

package androidx.core.graphics;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.view.MotionEventCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes4.dex */
public final class PathUtils {
    @NonNull
    @RequiresApi(MotionEventCompat.AXIS_SCROLL)
    public static Collection<PathSegment> flatten(@NonNull Path path) {
        return flatten(path, 0.5f);
    }

    @NonNull
    @RequiresApi(MotionEventCompat.AXIS_SCROLL)
    public static Collection<PathSegment> flatten(@NonNull Path path, @FloatRange(from = 0.0d) float error) {
        float[] pathData = path.approximate(error);
        int pointCount = pathData.length / 3;
        List<PathSegment> segments = new ArrayList<>(pointCount);
        for (int i10 = 1; i10 < pointCount; i10++) {
            int index = i10 * 3;
            int prevIndex = (i10 - 1) * 3;
            float d10 = pathData[index];
            float x10 = pathData[index + 1];
            float y10 = pathData[index + 2];
            float pd2 = pathData[prevIndex];
            float px = pathData[prevIndex + 1];
            float py = pathData[prevIndex + 2];
            if (d10 != pd2 && (x10 != px || y10 != py)) {
                segments.add(new PathSegment(new PointF(px, py), pd2, new PointF(x10, y10), d10));
            }
        }
        return segments;
    }

    private PathUtils() {
    }
}

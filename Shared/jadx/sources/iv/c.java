package iv;

import android.annotation.TargetApi;
import androidx.core.view.MotionEventCompat;
import iv.e;
import iv.h;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class c {

    @TargetApi(MotionEventCompat.AXIS_DISTANCE)
    public static final class a extends c {
        @Override // iv.c
        public List<? extends e.a> a(Executor executor) {
            return Arrays.asList(new g(), new i(executor));
        }

        @Override // iv.c
        public List<? extends h.a> b() {
            return Collections.singletonList(new r());
        }
    }

    public List<? extends e.a> a(Executor executor) {
        return Collections.singletonList(new i(executor));
    }

    public List<? extends h.a> b() {
        return Collections.EMPTY_LIST;
    }
}

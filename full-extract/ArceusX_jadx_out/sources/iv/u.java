package iv;

import android.annotation.TargetApi;
import androidx.core.view.MotionEventCompat;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes2.dex */
public class u {

    @TargetApi(MotionEventCompat.AXIS_DISTANCE)
    @IgnoreJRERequirement
    public static final class a extends u {
        @Override // iv.u
        public Object b(Method method, Class<?> cls, Object obj, Object[] objArr) {
            return l.a(method, cls, obj, objArr);
        }

        @Override // iv.u
        public boolean c(Method method) {
            return method.isDefault();
        }
    }

    @IgnoreJRERequirement
    public static class b extends u {
        @Override // iv.u
        public String a(Method method, int i10) {
            Parameter parameter = method.getParameters()[i10];
            if (!parameter.isNamePresent()) {
                return super.a(method, i10);
            }
            return "parameter '" + parameter.getName() + '\'';
        }

        @Override // iv.u
        public Object b(Method method, Class<?> cls, Object obj, Object[] objArr) {
            return l.a(method, cls, obj, objArr);
        }

        @Override // iv.u
        public boolean c(Method method) {
            return method.isDefault();
        }
    }

    public String a(Method method, int i10) {
        return "parameter #" + (i10 + 1);
    }

    public Object b(Method method, Class<?> cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean c(Method method) {
        return false;
    }
}

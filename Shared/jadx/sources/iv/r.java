package iv;

import android.annotation.TargetApi;
import androidx.core.view.MotionEventCompat;
import iv.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.ResponseBody;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@TargetApi(MotionEventCompat.AXIS_DISTANCE)
@IgnoreJRERequirement
/* loaded from: classes2.dex */
public final class r extends h.a {

    @IgnoreJRERequirement
    public static final class a<T> implements h<ResponseBody, Optional<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final h<ResponseBody, T> f21191a;

        public a(h<ResponseBody, T> hVar) {
            this.f21191a = hVar;
        }

        @Override // iv.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Optional<T> a(ResponseBody responseBody) {
            return Optional.ofNullable(this.f21191a.a(responseBody));
        }
    }

    @Override // iv.h.a
    public h<ResponseBody, ?> d(Type type, Annotation[] annotationArr, y yVar) {
        if (h.a.b(type) != Optional.class) {
            return null;
        }
        return new a(yVar.i(h.a.a(0, (ParameterizedType) type), annotationArr));
    }
}

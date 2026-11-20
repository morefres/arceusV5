package iv;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static Constructor<MethodHandles.Lookup> f21155a;

    @IgnoreJRERequirement
    public static Object a(Method method, Class<?> cls, Object obj, Object[] objArr) {
        Constructor<MethodHandles.Lookup> constructor = f21155a;
        if (constructor == null) {
            constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            constructor.setAccessible(true);
            f21155a = constructor;
        }
        return constructor.newInstance(cls, -1).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}

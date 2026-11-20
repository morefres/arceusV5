package sm;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class c<T> {

    public class a extends c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Constructor f31434a;
        public final /* synthetic */ Class b;

        public a(Constructor constructor, Class cls) {
            this.f31434a = constructor;
            this.b = cls;
        }

        @Override // sm.c
        public T b() {
            return (T) this.f31434a.newInstance(null);
        }

        public String toString() {
            return this.b.getName();
        }
    }

    public class b extends c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f31435a;
        public final /* synthetic */ Object b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Class f31436c;

        public b(Method method, Object obj, Class cls) {
            this.f31435a = method;
            this.b = obj;
            this.f31436c = cls;
        }

        @Override // sm.c
        public T b() {
            return (T) this.f31435a.invoke(this.b, this.f31436c);
        }

        public String toString() {
            return this.f31436c.getName();
        }
    }

    /* renamed from: sm.c$c, reason: collision with other inner class name */
    public class C0561c extends c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f31437a;
        public final /* synthetic */ Class b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f31438c;

        public C0561c(Method method, Class cls, int i10) {
            this.f31437a = method;
            this.b = cls;
            this.f31438c = i10;
        }

        @Override // sm.c
        public T b() {
            return (T) this.f31437a.invoke(null, this.b, Integer.valueOf(this.f31438c));
        }

        public String toString() {
            return this.b.getName();
        }
    }

    public class d extends c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f31439a;
        public final /* synthetic */ Class b;

        public d(Method method, Class cls) {
            this.f31439a = method;
            this.b = cls;
        }

        @Override // sm.c
        public T b() {
            return (T) this.f31439a.invoke(null, this.b, Object.class);
        }

        public String toString() {
            return this.b.getName();
        }
    }

    public static <T> c<T> a(Class<?> cls) {
        try {
            try {
                try {
                    try {
                        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        return new a(declaredConstructor, cls);
                    } catch (Exception unused) {
                        throw new IllegalArgumentException("cannot construct instances of " + cls.getName());
                    }
                } catch (NoSuchMethodException unused2) {
                    Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls2.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new b(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null), cls);
                }
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new C0561c(declaredMethod2, cls, intValue);
            } catch (IllegalAccessException unused4) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused5) {
            throw new AssertionError();
        } catch (NoSuchMethodException unused6) {
            Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod3.setAccessible(true);
            return new d(declaredMethod3, cls);
        } catch (InvocationTargetException e10) {
            throw um.c.t(e10);
        }
    }

    public abstract T b();
}

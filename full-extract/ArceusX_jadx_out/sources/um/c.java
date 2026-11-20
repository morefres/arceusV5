package um;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.url._UrlKt;
import sm.a0;
import sm.g;
import sm.h;
import sm.i;
import sm.j;
import sm.l;
import sm.m;
import sm.w;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Set<Annotation> f33030a = Collections.EMPTY_SET;
    public static final Type[] b = new Type[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Class<?> f33031c;

    /* renamed from: d, reason: collision with root package name */
    public static final Class<? extends Annotation> f33032d;

    /* renamed from: e, reason: collision with root package name */
    public static final Map<Class<?>, Class<?>> f33033e;

    public static final class a implements GenericArrayType {

        /* renamed from: a, reason: collision with root package name */
        public final Type f33034a;

        public a(Type type) {
            this.f33034a = c.a(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && a0.d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f33034a;
        }

        public int hashCode() {
            return this.f33034a.hashCode();
        }

        public String toString() {
            return c.v(this.f33034a) + _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    public static final class b implements ParameterizedType {

        /* renamed from: a, reason: collision with root package name */
        public final Type f33035a;
        public final Type b;

        /* renamed from: c, reason: collision with root package name */
        public final Type[] f33036c;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || a0.g(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            this.f33035a = type == null ? null : c.a(type);
            this.b = c.a(type2);
            this.f33036c = (Type[]) typeArr.clone();
            int i10 = 0;
            while (true) {
                Type[] typeArr2 = this.f33036c;
                if (i10 >= typeArr2.length) {
                    return;
                }
                typeArr2[i10].getClass();
                c.b(this.f33036c[i10]);
                Type[] typeArr3 = this.f33036c;
                typeArr3[i10] = c.a(typeArr3[i10]);
                i10++;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && a0.d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f33036c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f33035a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.b;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f33036c) ^ this.b.hashCode()) ^ c.g(this.f33035a);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((this.f33036c.length + 1) * 30);
            sb2.append(c.v(this.b));
            if (this.f33036c.length == 0) {
                return sb2.toString();
            }
            sb2.append("<");
            sb2.append(c.v(this.f33036c[0]));
            for (int i10 = 1; i10 < this.f33036c.length; i10++) {
                sb2.append(", ");
                sb2.append(c.v(this.f33036c[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* renamed from: um.c$c, reason: collision with other inner class name */
    public static final class C0600c implements WildcardType {

        /* renamed from: a, reason: collision with root package name */
        public final Type f33037a;
        public final Type b;

        public C0600c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                c.b(typeArr[0]);
                this.b = null;
                this.f33037a = c.a(typeArr[0]);
                return;
            }
            typeArr2[0].getClass();
            c.b(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.b = c.a(typeArr2[0]);
            this.f33037a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && a0.d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.b;
            return type != null ? new Type[]{type} : c.b;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f33037a};
        }

        public int hashCode() {
            Type type = this.b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f33037a.hashCode() + 31);
        }

        public String toString() {
            if (this.b != null) {
                return "? super " + c.v(this.b);
            }
            if (this.f33037a == Object.class) {
                return "?";
            }
            return "? extends " + c.v(this.f33037a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Class cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f33032d = cls;
        f33031c = DefaultConstructorMarker.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        f33033e = Collections.unmodifiableMap(linkedHashMap);
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(a(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof a ? type : new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType) || (type instanceof C0600c)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new C0600c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    public static Class<?> c(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    public static h<?> d(w wVar, Type type, Class<?> cls) {
        Class<?> cls2;
        Constructor<?> declaredConstructor;
        Object[] objArr;
        i iVar = (i) cls.getAnnotation(i.class);
        Class<?> cls3 = null;
        if (iVar == null || !iVar.generateAdapter()) {
            return null;
        }
        try {
            try {
                cls2 = Class.forName(a0.e(cls.getName()), true, cls.getClassLoader());
            } catch (NoSuchMethodException e10) {
                e = e10;
            }
            try {
                if (type instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                    try {
                        declaredConstructor = cls2.getDeclaredConstructor(w.class, Type[].class);
                        objArr = new Object[]{wVar, actualTypeArguments};
                    } catch (NoSuchMethodException unused) {
                        declaredConstructor = cls2.getDeclaredConstructor(Type[].class);
                        objArr = new Object[]{actualTypeArguments};
                    }
                } else {
                    try {
                        objArr = new Object[]{wVar};
                        declaredConstructor = cls2.getDeclaredConstructor(w.class);
                    } catch (NoSuchMethodException unused2) {
                        declaredConstructor = cls2.getDeclaredConstructor(null);
                        objArr = new Object[0];
                    }
                }
                declaredConstructor.setAccessible(true);
                return ((h) declaredConstructor.newInstance(objArr)).nullSafe();
            } catch (NoSuchMethodException e11) {
                e = e11;
                cls3 = cls2;
                if ((type instanceof ParameterizedType) || cls3.getTypeParameters().length == 0) {
                    throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type, e);
                }
                throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type + "'. Suspiciously, the type was not parameterized but the target class '" + cls3.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type, e12);
        } catch (IllegalAccessException e13) {
            throw new RuntimeException("Failed to access the generated JsonAdapter for " + type, e13);
        } catch (InstantiationException e14) {
            throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type, e14);
        } catch (InvocationTargetException e15) {
            throw t(e15);
        }
    }

    public static Type e(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return e(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static boolean f(Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().getSimpleName().equals("Nullable")) {
                return true;
            }
        }
        return false;
    }

    public static int g(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    public static int h(Object[] objArr, Object obj) {
        for (int i10 = 0; i10 < objArr.length; i10++) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
        }
        throw new NoSuchElementException();
    }

    public static boolean i(Class<?> cls) {
        Class<? extends Annotation> cls2 = f33032d;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    public static boolean j(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static Set<? extends Annotation> k(AnnotatedElement annotatedElement) {
        return l(annotatedElement.getAnnotations());
    }

    public static Set<? extends Annotation> l(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(l.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : f33030a;
    }

    public static String m(String str, AnnotatedElement annotatedElement) {
        return n(str, (g) annotatedElement.getAnnotation(g.class));
    }

    public static String n(String str, g gVar) {
        if (gVar != null) {
            String name = gVar.name();
            if (!"\u0000".equals(name)) {
                return name;
            }
        }
        return str;
    }

    public static j o(String str, String str2, m mVar) {
        String path = mVar.getPath();
        return new j(str2.equals(str) ? String.format("Required value '%s' missing at %s", str, path) : String.format("Required value '%s' (JSON name '%s') missing at %s", str, str2, path));
    }

    public static Type p(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        throw new IllegalArgumentException();
    }

    public static Type q(Type type, Class<?> cls, Type type2) {
        return r(type, cls, type2, new LinkedHashSet());
    }

    public static Type r(Type type, Class<?> cls, Type type2, Collection<TypeVariable<?>> collection) {
        while (type2 instanceof TypeVariable) {
            TypeVariable<?> typeVariable = (TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            type2 = s(type, cls, typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type r8 = r(type, cls, componentType, collection);
                return componentType == r8 ? cls2 : a0.b(r8);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type r10 = r(type, cls, genericComponentType, collection);
            return genericComponentType == r10 ? genericArrayType : a0.b(r10);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type r11 = r(type, cls, ownerType, collection);
            boolean z10 = r11 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i10 = 0; i10 < length; i10++) {
                Type r12 = r(type, cls, actualTypeArguments[i10], collection);
                if (r12 != actualTypeArguments[i10]) {
                    if (!z10) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z10 = true;
                    }
                    actualTypeArguments[i10] = r12;
                }
            }
            return z10 ? new b(r11, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z11 = type2 instanceof WildcardType;
        Type type3 = type2;
        if (z11) {
            WildcardType wildcardType = (WildcardType) type2;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type r13 = r(type, cls, lowerBounds[0], collection);
                type3 = wildcardType;
                if (r13 != lowerBounds[0]) {
                    return a0.l(r13);
                }
            } else {
                type3 = wildcardType;
                if (upperBounds.length == 1) {
                    Type r14 = r(type, cls, upperBounds[0], collection);
                    type3 = wildcardType;
                    if (r14 != upperBounds[0]) {
                        return a0.k(r14);
                    }
                }
            }
        }
        return type3;
    }

    public static Type s(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> c10 = c(typeVariable);
        if (c10 != null) {
            Type e10 = e(type, cls, c10);
            if (e10 instanceof ParameterizedType) {
                return ((ParameterizedType) e10).getActualTypeArguments()[h(c10.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    public static RuntimeException t(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (targetException instanceof Error) {
            throw ((Error) targetException);
        }
        throw new RuntimeException(targetException);
    }

    public static String u(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static String v(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static boolean w(Type type, Type type2) {
        return a0.d(type, type2);
    }

    public static j x(String str, String str2, m mVar) {
        String path = mVar.getPath();
        return new j(str2.equals(str) ? String.format("Non-null value '%s' was null at %s", str, path) : String.format("Non-null value '%s' (JSON name '%s') was null at %s", str, str2, path));
    }
}

package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class d implements gu.b, Serializable {
    public static final Object NO_RECEIVER = a.f22964a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient gu.b reflected;
    private final String signature;

    public static class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public static final a f22964a = new a();
    }

    public d() {
        this(NO_RECEIVER);
    }

    @Override // gu.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // gu.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public gu.b compute() {
        gu.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        gu.b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract gu.b computeReflected();

    @Override // gu.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // gu.b
    public String getName() {
        return this.name;
    }

    public gu.f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? d0.c(cls) : d0.b(cls);
    }

    @Override // gu.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public gu.b getReflected() {
        gu.b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new xt.b();
    }

    @Override // gu.b
    public gu.m getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // gu.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // gu.b
    public gu.o getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // gu.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // gu.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // gu.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // gu.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public d(Object obj) {
        this(obj, null, null, null, false);
    }

    public d(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }
}

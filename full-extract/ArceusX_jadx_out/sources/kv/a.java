package kv;

import iv.h;
import iv.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import sm.l;
import sm.w;

/* loaded from: classes3.dex */
public final class a extends h.a {

    /* renamed from: a, reason: collision with root package name */
    public final w f23165a;
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23166c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23167d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f23168e;

    public a(w wVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f23165a = wVar;
        this.b = z10;
        this.f23166c = z11;
        this.f23167d = z12;
        this.f23168e = z13;
    }

    public static a f(w wVar) {
        if (wVar != null) {
            return new a(wVar, false, false, false, false);
        }
        throw new NullPointerException("moshi == null");
    }

    public static Set<? extends Annotation> g(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(l.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.EMPTY_SET;
    }

    @Override // iv.h.a
    public h<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y yVar) {
        sm.h e10 = this.f23165a.e(type, g(annotationArr));
        if (this.b) {
            e10 = e10.lenient();
        }
        if (this.f23166c) {
            e10 = e10.failOnUnknown();
        }
        if (this.f23167d) {
            e10 = e10.serializeNulls();
        }
        return new b(e10, this.f23168e);
    }

    @Override // iv.h.a
    public h<ResponseBody, ?> d(Type type, Annotation[] annotationArr, y yVar) {
        sm.h e10 = this.f23165a.e(type, g(annotationArr));
        if (this.b) {
            e10 = e10.lenient();
        }
        if (this.f23166c) {
            e10 = e10.failOnUnknown();
        }
        if (this.f23167d) {
            e10 = e10.serializeNulls();
        }
        return new c(e10);
    }
}

package be;

import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3958a;
    public final Field b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f3959c;

    public f0(Object obj, Field field, Class cls) {
        this.f3958a = obj;
        this.b = field;
        this.f3959c = cls;
    }

    public final Object a() {
        try {
            return this.f3959c.cast(this.b.get(this.f3958a));
        } catch (Exception e10) {
            throw new h0(String.format("Failed to get value of field %s of type %s on object of type %s", this.b.getName(), this.f3958a.getClass().getName(), this.f3959c.getName()), e10);
        }
    }

    public final Field b() {
        return this.b;
    }

    public final void c(Object obj) {
        try {
            this.b.set(this.f3958a, obj);
        } catch (Exception e10) {
            throw new h0(String.format("Failed to set value of field %s of type %s on object of type %s", this.b.getName(), this.f3958a.getClass().getName(), this.f3959c.getName()), e10);
        }
    }
}

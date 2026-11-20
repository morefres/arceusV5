package jg;

import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Field f21683a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f21683a = field;
    }

    public String toString() {
        return this.f21683a.toString();
    }
}

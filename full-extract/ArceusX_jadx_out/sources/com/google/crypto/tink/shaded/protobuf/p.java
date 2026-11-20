package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class p {
    public static volatile p b;

    /* renamed from: c, reason: collision with root package name */
    public static final p f8570c = new p(true);

    /* renamed from: a, reason: collision with root package name */
    public final Map<a, y.e<?, ?>> f8571a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f8572a;
        public final int b;

        public a(Object obj, int i10) {
            this.f8572a = obj;
            this.b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f8572a == aVar.f8572a && this.b == aVar.b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f8572a) * 65535) + this.b;
        }
    }

    public p() {
        this.f8571a = new HashMap();
    }

    public static p b() {
        p pVar;
        if (c1.f8462d) {
            return f8570c;
        }
        p pVar2 = b;
        if (pVar2 != null) {
            return pVar2;
        }
        synchronized (p.class) {
            try {
                pVar = b;
                if (pVar == null) {
                    pVar = o.a();
                    b = pVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pVar;
    }

    public <ContainingType extends s0> y.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (y.e) this.f8571a.get(new a(containingtype, i10));
    }

    public p(boolean z10) {
        this.f8571a = Collections.EMPTY_MAP;
    }
}

package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.a.AbstractC0132a;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.s0;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0132a<MessageType, BuilderType>> implements s0 {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0132a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0132a<MessageType, BuilderType>> implements s0.a {
        public static m1 n(s0 s0Var) {
            return new m1(s0Var);
        }

        public abstract BuilderType j(MessageType messagetype);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.s0.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public BuilderType H(s0 s0Var) {
            if (f().getClass().isInstance(s0Var)) {
                return (BuilderType) j((a) s0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public h b() {
        try {
            h.C0133h l10 = h.l(c());
            i(l10.b());
            return l10.a();
        } catch (IOException e10) {
            throw new RuntimeException(k("ByteString"), e10);
        }
    }

    public int g() {
        throw new UnsupportedOperationException();
    }

    public int j(g1 g1Var) {
        int g10 = g();
        if (g10 != -1) {
            return g10;
        }
        int d10 = g1Var.d(this);
        m(d10);
        return d10;
    }

    public final String k(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public m1 l() {
        return new m1(this);
    }

    public void m(int i10) {
        throw new UnsupportedOperationException();
    }

    public byte[] n() {
        try {
            byte[] bArr = new byte[c()];
            k f02 = k.f0(bArr);
            i(f02);
            f02.c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(k("byte array"), e10);
        }
    }

    public void o(OutputStream outputStream) {
        k e02 = k.e0(outputStream, k.I(c()));
        i(e02);
        e02.b0();
    }
}

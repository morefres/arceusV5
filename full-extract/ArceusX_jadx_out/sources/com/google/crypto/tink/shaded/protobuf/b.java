package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.s0;

/* loaded from: classes2.dex */
public abstract class b<MessageType extends s0> implements a1<MessageType> {

    /* renamed from: a, reason: collision with root package name */
    public static final p f8442a = p.b();

    public final MessageType c(MessageType messagetype) {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw d(messagetype).a().k(messagetype);
    }

    public final m1 d(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).l() : new m1(messagetype);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a1
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType b(h hVar, p pVar) {
        return c(f(hVar, pVar));
    }

    public MessageType f(h hVar, p pVar) {
        i m10 = hVar.m();
        MessageType messagetype = (MessageType) a(m10, pVar);
        try {
            m10.a(0);
            return messagetype;
        } catch (b0 e10) {
            throw e10.k(messagetype);
        }
    }
}

package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.r0;

/* loaded from: classes.dex */
public abstract class b<MessageType extends r0> implements z0<MessageType> {

    /* renamed from: a, reason: collision with root package name */
    public static final o f1941a = o.b();

    public final MessageType c(MessageType messagetype) {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw d(messagetype).a().k(messagetype);
    }

    public final m1 d(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).n() : new m1(messagetype);
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType a(g gVar, o oVar) {
        return c(f(gVar, oVar));
    }

    public MessageType f(g gVar, o oVar) {
        h m10 = gVar.m();
        MessageType messagetype = (MessageType) b(m10, oVar);
        try {
            m10.a(0);
            return messagetype;
        } catch (a0 e10) {
            throw e10.k(messagetype);
        }
    }
}

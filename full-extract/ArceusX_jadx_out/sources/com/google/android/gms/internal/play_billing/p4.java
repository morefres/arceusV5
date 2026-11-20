package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.p4;
import com.google.android.gms.internal.play_billing.t4;

/* loaded from: classes.dex */
public class p4<MessageType extends t4<MessageType, BuilderType>, BuilderType extends p4<MessageType, BuilderType>> extends b3<MessageType, BuilderType> {

    /* renamed from: a, reason: collision with root package name */
    public final t4 f7251a;
    public t4 b;

    public p4(MessageType messagetype) {
        this.f7251a = messagetype;
        if (messagetype.l()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = messagetype.u();
    }

    public static void b(Object obj, Object obj2) {
        e6.a().b(obj.getClass()).c(obj, obj2);
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final p4 clone() {
        p4 p4Var = (p4) this.f7251a.p(5, null, null);
        p4Var.b = g();
        return p4Var;
    }

    public final p4 h(t4 t4Var) {
        if (!this.f7251a.equals(t4Var)) {
            if (!this.b.l()) {
                n();
            }
            b(this.b, t4Var);
        }
        return this;
    }

    public final MessageType i() {
        MessageType g10 = g();
        if (g10.zzo()) {
            return g10;
        }
        throw new s6(g10);
    }

    @Override // com.google.android.gms.internal.play_billing.w5
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public MessageType g() {
        if (!this.b.l()) {
            return (MessageType) this.b;
        }
        this.b.A();
        return (MessageType) this.b;
    }

    public final void k() {
        if (this.b.l()) {
            return;
        }
        n();
    }

    public void n() {
        t4 u8 = this.f7251a.u();
        b(u8, this.b);
        this.b = u8;
    }

    @Override // com.google.android.gms.internal.play_billing.y5
    public final boolean zzo() {
        boolean o8;
        o8 = t4.o(this.b, false);
        return o8;
    }
}

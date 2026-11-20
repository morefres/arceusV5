package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* loaded from: classes2.dex */
public class m1 extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final List<String> f8562a;

    public m1(s0 s0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f8562a = null;
    }

    public b0 a() {
        return new b0(getMessage());
    }
}

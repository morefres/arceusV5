package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
public final class a implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0121b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0121b c0121b = new DynamiteModule.b.C0121b();
        int b = aVar.b(context, str);
        c0121b.f5929a = b;
        c0121b.f5930c = b != 0 ? -1 : 0;
        return c0121b;
    }
}

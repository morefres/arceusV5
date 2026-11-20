package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
public final class f implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0121b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0121b c0121b = new DynamiteModule.b.C0121b();
        c0121b.f5929a = aVar.b(context, str);
        int i10 = 1;
        int a10 = aVar.a(context, str, true);
        c0121b.b = a10;
        int i11 = c0121b.f5929a;
        if (i11 == 0) {
            i11 = 0;
            if (a10 == 0) {
                i10 = 0;
                c0121b.f5930c = i10;
                return c0121b;
            }
        }
        if (i11 >= a10) {
            i10 = -1;
        }
        c0121b.f5930c = i10;
        return c0121b;
    }
}

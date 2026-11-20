package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
public final class g implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0121b a(Context context, String str, DynamiteModule.b.a aVar) {
        int a10;
        DynamiteModule.b.C0121b c0121b = new DynamiteModule.b.C0121b();
        int b = aVar.b(context, str);
        c0121b.f5929a = b;
        int i10 = 1;
        int i11 = 0;
        if (b != 0) {
            a10 = aVar.a(context, str, false);
            c0121b.b = a10;
        } else {
            a10 = aVar.a(context, str, true);
            c0121b.b = a10;
        }
        int i12 = c0121b.f5929a;
        if (i12 != 0) {
            i11 = i12;
        } else if (a10 == 0) {
            i10 = 0;
            c0121b.f5930c = i10;
            return c0121b;
        }
        if (i11 >= a10) {
            i10 = -1;
        }
        c0121b.f5930c = i10;
        return c0121b;
    }
}

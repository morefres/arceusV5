package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import c8.d;
import c8.h;
import c8.m;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements d {
    @Override // c8.d
    public m create(h hVar) {
        return new z7.d(hVar.b(), hVar.e(), hVar.d());
    }
}

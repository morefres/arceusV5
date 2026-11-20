package com.withpersona.sdk2.camera;

import androidx.camera.view.PreviewView;
import com.withpersona.sdk2.camera.e;
import dn.s;
import dn.t;
import dt.i;

/* loaded from: classes3.dex */
public final class f implements e.a {

    /* renamed from: a, reason: collision with root package name */
    public final t f10014a;

    public f(t tVar) {
        this.f10014a = tVar;
    }

    public static i<e.a> b(t tVar) {
        return dt.e.a(new f(tVar));
    }

    @Override // com.withpersona.sdk2.camera.e.a
    public e a(b bVar, PreviewView previewView, s sVar, boolean z10) {
        return this.f10014a.b(bVar, previewView, sVar, z10);
    }
}

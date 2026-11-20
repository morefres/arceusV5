package uf;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class i implements rf.h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f32694a = false;
    public boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    public rf.d f32695c;

    /* renamed from: d, reason: collision with root package name */
    public final f f32696d;

    public i(f fVar) {
        this.f32696d = fVar;
    }

    public final void a() {
        if (this.f32694a) {
            throw new rf.c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f32694a = true;
    }

    @Override // rf.h
    @NonNull
    public rf.h add(String str) {
        a();
        this.f32696d.d(this.f32695c, str, this.b);
        return this;
    }

    public void b(rf.d dVar, boolean z10) {
        this.f32694a = false;
        this.f32695c = dVar;
        this.b = z10;
    }

    @Override // rf.h
    @NonNull
    public rf.h add(boolean z10) {
        a();
        this.f32696d.i(this.f32695c, z10, this.b);
        return this;
    }
}

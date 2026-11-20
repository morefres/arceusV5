package n9;

import android.content.Intent;

/* loaded from: classes.dex */
public final class z extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f26013a;
    public final /* synthetic */ l9.j b;

    public z(Intent intent, l9.j jVar, int i10) {
        this.f26013a = intent;
        this.b = jVar;
    }

    @Override // n9.a0
    public final void a() {
        Intent intent = this.f26013a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}

package n9;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
public final class y extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f26009a;
    public final /* synthetic */ Activity b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26010c;

    public y(Intent intent, Activity activity, int i10) {
        this.f26009a = intent;
        this.b = activity;
        this.f26010c = i10;
    }

    @Override // n9.a0
    public final void a() {
        Intent intent = this.f26009a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.f26010c);
        }
    }
}

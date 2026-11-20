package com.google.android.gms.games.internal.v2.resolution;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.Task;
import fb.w0;
import sb.k;

/* loaded from: classes.dex */
final class zza extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final k f6249a;

    public zza() {
        super(new w0(Looper.getMainLooper()));
        this.f6249a = new k();
    }

    public final Task a() {
        return this.f6249a.a();
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        Intent intent;
        super.onReceiveResult(i10, bundle);
        boolean z10 = i10 == -1;
        if (bundle == null) {
            intent = new Intent();
        } else {
            intent = (Intent) bundle.getParcelable("resultData");
            if (intent == null) {
                intent = new Intent();
            }
        }
        this.f6249a.e(z10 ? la.a.a(intent) : la.a.b(intent));
    }
}

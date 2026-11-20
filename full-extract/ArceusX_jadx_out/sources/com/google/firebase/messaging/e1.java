package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.h1;

/* loaded from: classes2.dex */
public class e1 extends Binder {

    /* renamed from: a, reason: collision with root package name */
    public final a f8814a;

    public interface a {
        Task<Void> a(Intent intent);
    }

    public e1(a aVar) {
        this.f8814a = aVar;
    }

    public void b(final h1.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f8814a.a(aVar.f8831a).c(new e3.n(), new OnCompleteListener() { // from class: com.google.firebase.messaging.d1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                h1.a.this.d();
            }
        });
    }
}

package a9;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import k9.a;
import k9.e;

/* loaded from: classes.dex */
public abstract class b extends e<a.d.c> {

    /* renamed from: k, reason: collision with root package name */
    public static final a.g f259k;

    /* renamed from: l, reason: collision with root package name */
    public static final a.AbstractC0393a f260l;

    /* renamed from: m, reason: collision with root package name */
    public static final k9.a f261m;

    static {
        a.g gVar = new a.g();
        f259k = gVar;
        c cVar = new c();
        f260l = cVar;
        f261m = new k9.a("SmsRetriever.API", cVar, gVar);
    }

    public b(@NonNull Context context) {
        super(context, (k9.a<a.d.c>) f261m, a.d.Ko, e.a.f22460c);
    }

    @NonNull
    public abstract Task<Void> P();
}

package androidx.work;

import android.content.Context;
import androidx.work.a;
import java.util.Collections;
import java.util.List;
import x5.p0;
import x5.w;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements k5.b<p0> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3256a = w.i("WrkMgrInitializer");

    @Override // k5.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public p0 create(Context context) {
        w.e().a(f3256a, "Initializing WorkManager with default configuration.");
        p0.i(context, new a.C0060a().a());
        return p0.h(context);
    }

    @Override // k5.b
    public List<Class<? extends k5.b<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }
}

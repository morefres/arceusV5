package rd;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import pd.b;
import pd.d;
import pd.e;
import sb.m;

/* loaded from: classes2.dex */
public class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public pd.a f30186a;
    public e b;

    @Override // pd.b
    @NonNull
    public Task<e> a(@NonNull d dVar) {
        pd.a aVar = this.f30186a;
        if (aVar != null) {
            return m.e(aVar);
        }
        e eVar = this.b;
        return eVar != null ? m.f(eVar) : m.e(new IllegalStateException("FakeAgeSignalsManager not configured with a response or exception."));
    }

    public void b(@NonNull e eVar) {
        this.f30186a = null;
        this.b = eVar;
    }
}

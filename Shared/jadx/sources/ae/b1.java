package ae;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class b1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f411a;
    public final /* synthetic */ h b;

    public b1(h hVar, d dVar) {
        this.b = hVar;
        this.f411a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a1 a1Var;
        List i10;
        a1Var = this.b.b;
        List<String> b = this.f411a.b();
        i10 = h.i(this.f411a.a());
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt(NotificationCompat.CATEGORY_STATUS, 5);
        bundle.putInt("error_code", 0);
        if (!b.isEmpty()) {
            bundle.putStringArrayList("module_names", new ArrayList<>(b));
        }
        if (!i10.isEmpty()) {
            bundle.putStringArrayList("languages", new ArrayList<>(i10));
        }
        bundle.putLong("total_bytes_to_download", 0L);
        bundle.putLong("bytes_downloaded", 0L);
        a1Var.j(e.n(bundle));
    }
}

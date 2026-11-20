package l9;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Map;

/* loaded from: classes.dex */
public final class y implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sb.k f23397a;
    public final /* synthetic */ z b;

    public y(z zVar, sb.k kVar) {
        this.b = zVar;
        this.f23397a = kVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task) {
        Map map;
        map = this.b.b;
        map.remove(this.f23397a);
    }
}

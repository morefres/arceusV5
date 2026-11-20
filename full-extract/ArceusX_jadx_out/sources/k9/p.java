package k9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;

/* loaded from: classes.dex */
public final class p extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    public final Feature f22464a;

    public p(@NonNull Feature feature) {
        this.f22464a = feature;
    }

    @Override // java.lang.Throwable
    @NonNull
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f22464a));
    }
}

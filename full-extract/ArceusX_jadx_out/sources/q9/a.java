package q9;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Locale;
import n9.g;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f29615a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final g f29616c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29617d;

    public a(@NonNull String str, @NonNull String... strArr) {
        String sb2;
        if (strArr.length == 0) {
            sb2 = "";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            for (String str2 : strArr) {
                if (sb3.length() > 1) {
                    sb3.append(",");
                }
                sb3.append(str2);
            }
            sb3.append("] ");
            sb2 = sb3.toString();
        }
        this.b = sb2;
        this.f29615a = str;
        this.f29616c = new g(str);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f29615a, i10)) {
            i10++;
        }
        this.f29617d = i10;
    }

    public void a(@NonNull String str, @NonNull Object... objArr) {
        if (d(3)) {
            Log.d(this.f29615a, c(str, objArr));
        }
    }

    public void b(@NonNull String str, @NonNull Object... objArr) {
        Log.e(this.f29615a, c(str, objArr));
    }

    @NonNull
    public String c(@NonNull String str, @NonNull Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.b.concat(str);
    }

    public boolean d(int i10) {
        return this.f29617d <= i10;
    }
}

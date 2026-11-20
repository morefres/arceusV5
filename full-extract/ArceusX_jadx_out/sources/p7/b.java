package p7;

import androidx.annotation.NonNull;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes3.dex */
public class b implements f {
    @Override // p7.f
    @NonNull
    public d a(@NonNull String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new a(httpURLConnection);
    }
}

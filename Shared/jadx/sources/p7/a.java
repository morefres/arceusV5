package p7;

import androidx.annotation.NonNull;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes3.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final HttpURLConnection f28514a;

    public a(@NonNull HttpURLConnection httpURLConnection) {
        this.f28514a = httpURLConnection;
    }

    @Override // p7.d
    @NonNull
    public InputStream G0() {
        return this.f28514a.getInputStream();
    }

    public final String a(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb2.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f28514a.disconnect();
    }

    @Override // p7.d
    public boolean isSuccessful() {
        try {
            return this.f28514a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // p7.d
    public String u2() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f28514a.getURL() + ". Failed with " + this.f28514a.getResponseCode() + "\n" + a(this.f28514a);
        } catch (IOException e10) {
            s7.e.d("get error failed ", e10);
            return e10.getMessage();
        }
    }

    @Override // p7.d
    public String z0() {
        return this.f28514a.getContentType();
    }
}

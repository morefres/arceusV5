package ci;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import wu.b0;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, byte[]> f4945a = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4946a = new b();
    }

    public static b b() {
        return a.f4946a;
    }

    public synchronized byte[] a(Context context, String str) {
        if (this.f4945a.containsKey(str)) {
            return this.f4945a.get(str);
        }
        String str2 = "android/shared_compression_dictionaries/" + str + ".dict";
        if (rh.h.a().e1()) {
            ek.d.a(str2);
        }
        try {
            InputStream open = context.getAssets().open(str2);
            try {
                wu.g c10 = b0.c(b0.j(open));
                try {
                    byte[] V1 = c10.V1();
                    this.f4945a.put(str, V1);
                    c10.close();
                    if (open != null) {
                        open.close();
                    }
                    return V1;
                } finally {
                }
            } catch (Throwable th2) {
                if (open != null) {
                    try {
                        open.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException e10) {
            ek.q.f("DictionaryManager", "Error reading dictionary " + str, e10);
            return null;
        }
    }

    public synchronized void c() {
        this.f4945a.clear();
    }
}

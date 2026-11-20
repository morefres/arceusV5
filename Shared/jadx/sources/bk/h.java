package bk;

import android.os.Handler;
import com.roblox.engine.jni.memstorage.Callback;
import com.roblox.engine.jni.memstorage.Connection;
import com.roblox.engine.jni.memstorage.MemStorage;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f4302a = "UserThemeListener";
    public Connection b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f4303c;

    public h(Handler handler) {
        this.f4303c = handler;
    }

    public void a() {
        if (this.b == null) {
            this.b = MemStorage.bind("ThemeUpdate", new Callback() { // from class: bk.g
            });
        }
    }

    public void b() {
        Connection connection = this.b;
        if (connection != null) {
            connection.disconnect();
            this.b = null;
        }
    }
}

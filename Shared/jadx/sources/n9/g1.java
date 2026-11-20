package n9;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import androidx.core.os.EnvironmentCompat;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g1 implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h1 f25974a;

    public /* synthetic */ g1(h1 h1Var, byte[] bArr) {
        Objects.requireNonNull(h1Var);
        this.f25974a = h1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            h1 h1Var = this.f25974a;
            synchronized (h1Var.f()) {
                try {
                    e1 e1Var = (e1) message.obj;
                    f1 f1Var = (f1) h1Var.f().get(e1Var);
                    if (f1Var != null && f1Var.g()) {
                        if (f1Var.d()) {
                            f1Var.a("GmsClientSupervisor");
                        }
                        h1Var.f().remove(e1Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        h1 h1Var2 = this.f25974a;
        synchronized (h1Var2.f()) {
            try {
                e1 e1Var2 = (e1) message.obj;
                f1 f1Var2 = (f1) h1Var2.f().get(e1Var2);
                if (f1Var2 != null && f1Var2.e() == 3) {
                    String valueOf = String.valueOf(e1Var2);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(valueOf);
                    Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName i11 = f1Var2.i();
                    if (i11 == null) {
                        i11 = e1Var2.c();
                    }
                    if (i11 == null) {
                        String b = e1Var2.b();
                        m.l(b);
                        i11 = new ComponentName(b, EnvironmentCompat.MEDIA_UNKNOWN);
                    }
                    f1Var2.onServiceDisconnected(i11);
                }
            } finally {
            }
        }
        return true;
    }
}

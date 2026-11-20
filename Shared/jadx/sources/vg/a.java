package vg;

import android.view.f;
import android.view.s;
import androidx.annotation.NonNull;
import com.roblox.engine.jni.NativeGLInterface;
import ek.q;

/* loaded from: classes2.dex */
public class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f33408a = "rbx.datamodel";

    @Override // android.view.f
    public void onCreate(@NonNull s sVar) {
        q.b("rbx.datamodel", "onMenuOptionActivated");
        mk.a aVar = new mk.a(false);
        NativeGLInterface.nativeBroadcastEventWithNamespace(aVar.f24587a, aVar.b, aVar.f24588c);
    }

    @Override // android.view.f
    public void onDestroy(@NonNull s sVar) {
        q.b("rbx.datamodel", "onMenuOptionClosed");
        mk.a aVar = new mk.a(true);
        NativeGLInterface.nativeBroadcastEventWithNamespace(aVar.f24587a, aVar.b, aVar.f24588c);
    }
}

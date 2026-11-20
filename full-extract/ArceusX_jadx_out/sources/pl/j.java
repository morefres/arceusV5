package pl;

import android.content.Context;
import android.util.Log;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import java.util.Optional;
import td.c;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public Optional<td.c> f28653a;
    public Optional<c.InterfaceC0579c> b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final j f28654a = new j();
    }

    public static j j() {
        return a.f28654a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public km.l e(org.json.JSONObject r8) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.j.e(org.json.JSONObject):km.l");
    }

    public boolean f() {
        return true;
    }

    public final /* synthetic */ void g(c.InterfaceC0579c interfaceC0579c) {
        Log.d("DeviceIntegrityManager", "Successfully re-set integrity token provider");
        this.b = Optional.of(interfaceC0579c);
    }

    public final /* synthetic */ void h(c.InterfaceC0579c interfaceC0579c) {
        Log.d("DeviceIntegrityManager", "Successfully set integrity token provider");
        this.b = Optional.of(interfaceC0579c);
    }

    public synchronized void i(Context context) {
        td.c a10;
        if (this.b.isPresent()) {
            Log.d("DeviceIntegrityManager", "Token provider already initialized");
            return;
        }
        if (rh.h.a().a3()) {
            if (e.a(this.f28653a)) {
                this.f28653a = Optional.of(IntegrityManagerFactory.a(context.getApplicationContext()));
            }
            a10 = this.f28653a.get();
        } else {
            a10 = IntegrityManagerFactory.a(context.getApplicationContext());
        }
        a10.a(c.a.c().b(56711522248L).a()).g(new sb.g() { // from class: pl.f
            @Override // sb.g
            public final void onSuccess(Object obj) {
                j.this.h((c.InterfaceC0579c) obj);
            }
        }).e(new sb.f() { // from class: pl.g
            @Override // sb.f
            public final void onFailure(Exception exc) {
                Log.e("DeviceIntegrityManager", "Failed to set token provider " + exc.getMessage());
            }
        });
    }

    public j() {
        this.f28653a = Optional.empty();
        this.b = Optional.empty();
    }
}

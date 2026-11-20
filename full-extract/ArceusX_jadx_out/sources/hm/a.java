package hm;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.util.concurrent.atomic.AtomicBoolean;
import rh.h;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    public static a f19485f;

    /* renamed from: g, reason: collision with root package name */
    public static b f19486g = b.USER_INITIATED;
    public boolean b;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f19487a = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public boolean f19488c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19489d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19490e = false;

    /* renamed from: hm.a$a, reason: collision with other inner class name */
    public enum EnumC0347a {
        SPLASH,
        MAIN,
        GAME
    }

    public enum b {
        USER_INITIATED,
        BACKGROUND
    }

    public a(boolean z10) {
        this.b = z10;
    }

    public static void c(Context context) {
        if (f19485f == null) {
            f19485f = new a(context instanceof Activity);
        }
    }

    public static void i() {
        f19486g = b.BACKGROUND;
    }

    public static a j() {
        return f19485f;
    }

    public void a(EnumC0347a enumC0347a, Bundle bundle) {
        if (enumC0347a == EnumC0347a.SPLASH) {
            if (bundle != null || !this.b || f19486g == b.BACKGROUND || this.f19488c || this.f19489d) {
                LoggingProtocol.g("warm_start");
                return;
            } else if (!d()) {
                LoggingProtocol.h("cold_start", 1L);
                return;
            } else {
                LoggingProtocol.g("warm_start");
                LoggingProtocol.g("warm_start_pre_forked");
                return;
            }
        }
        if (h.a().M1() && enumC0347a == EnumC0347a.GAME) {
            if (bundle != null || !this.b || f19486g == b.BACKGROUND || this.f19490e) {
                LoggingProtocol.g("warm_start");
                LoggingProtocol.g("game_activity_warm_start");
            } else if (d()) {
                LoggingProtocol.g("warm_start");
                LoggingProtocol.g("game_activity_warm_start");
                LoggingProtocol.g("warm_start_pre_forked");
            } else {
                LoggingProtocol.h("cold_start", 1L);
                LoggingProtocol.g("game_activity_cold_start");
            }
            this.f19490e = true;
            return;
        }
        if (enumC0347a != EnumC0347a.MAIN || this.f19487a.getAndSet(false) || bundle == null) {
            return;
        }
        if (this.f19488c || this.f19489d) {
            LoggingProtocol.g("warm_start");
            LoggingProtocol.g("main_activity_warm_start");
            return;
        }
        if (d()) {
            LoggingProtocol.g("warm_start");
            LoggingProtocol.g("main_activity_warm_start");
            LoggingProtocol.g("warm_start_pre_forked");
            return;
        }
        boolean z10 = this.f19488c;
        if (!z10 && !this.f19489d) {
            LoggingProtocol.h("cold_start", 1L);
            LoggingProtocol.g("main_activity_cold_start");
        } else {
            if (z10 || !this.f19489d) {
                return;
            }
            LoggingProtocol.g("warm_start");
            LoggingProtocol.g("main_activity_warm_start_no_splash");
        }
    }

    public void b(EnumC0347a enumC0347a) {
        LoggingProtocol.g("app_paused");
    }

    public final boolean d() {
        return LoggingProtocol.getProcessTimestamp() > 30000;
    }

    public void e() {
        this.f19487a.set(true);
    }

    public void f() {
        this.f19490e = true;
    }

    public void g() {
        this.f19489d = true;
    }

    public void h() {
        this.f19488c = true;
    }
}

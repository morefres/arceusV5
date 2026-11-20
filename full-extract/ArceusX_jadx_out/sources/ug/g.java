package ug;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lug/g;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", ve.a.f33391e, "(Landroid/content/Context;)V", "Lorg/json/JSONObject;", "json", j6.b.f21518e, "(Lorg/json/JSONObject;Landroid/content/Context;)V", "Lug/h;", "c", "(Landroid/content/Context;)Lug/h;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f32746a = new g();

    public static final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences c10 = ek.z.e(context).c("backtrace_init_cache");
        Intrinsics.checkNotNullExpressionValue(c10, "get(...)");
        SharedPreferences.Editor edit = c10.edit();
        edit.putString("upload_url", rh.h.a().L4());
        edit.putString("upload_token", rh.h.a().z2());
        edit.putInt("anr_maximum_timeout", rh.h.a().t4());
        edit.putInt("crash_upload_percentage", rh.h.a().c4());
        edit.putInt("anr_upload_percentage", rh.h.a().P());
        edit.apply();
        ek.q.b("rbx.backtrace", "Persisted Backtrace init values to cache");
    }

    public static final void b(@NotNull JSONObject json, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences c10 = ek.z.e(context).c("backtrace_init_cache");
        Intrinsics.checkNotNullExpressionValue(c10, "get(...)");
        SharedPreferences.Editor edit = c10.edit();
        edit.putString("upload_url", json.optString("JavaCrashUploadToBacktraceUrl", rh.h.a().L4()));
        edit.putString("upload_token", json.optString("JavaCrashUploadToBacktraceToken", rh.h.a().z2()));
        edit.putInt("anr_maximum_timeout", json.optInt("JavaANRMaximumTimeout", rh.h.a().t4()));
        edit.putInt("crash_upload_percentage", json.optInt("JavaCrashUploadToBacktracePercentage", rh.h.a().c4()));
        edit.putInt("anr_upload_percentage", json.optInt("JavaANRUploadToBacktracePercentage", rh.h.a().P()));
        edit.apply();
        ek.q.b("rbx.backtrace", "Persisted Backtrace init values from fetch JSON");
    }

    @NotNull
    public static final BacktraceInitValues c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences c10 = ek.z.e(context).c("backtrace_init_cache");
        String string = c10.getString("upload_url", rh.h.a().L4());
        Intrinsics.checkNotNull(string);
        String string2 = c10.getString("upload_token", rh.h.a().z2());
        Intrinsics.checkNotNull(string2);
        BacktraceInitValues backtraceInitValues = new BacktraceInitValues(string, string2, c10.getInt("anr_maximum_timeout", rh.h.a().t4()), c10.getInt("crash_upload_percentage", rh.h.a().c4()), c10.getInt("anr_upload_percentage", rh.h.a().P()));
        Intrinsics.checkNotNull(c10);
        SharedPreferences.Editor edit = c10.edit();
        edit.clear();
        edit.commit();
        ek.q.b("rbx.backtrace", "Read and burned Backtrace init values from cache");
        return backtraceInitValues;
    }
}

package cm;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.FileProvider;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import rh.h;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public MessageBus f5011a;
    public Connection b = null;

    /* renamed from: c, reason: collision with root package name */
    public Connection f5012c = null;

    /* renamed from: d, reason: collision with root package name */
    public Connection f5013d = null;

    /* renamed from: e, reason: collision with root package name */
    public Connection f5014e = null;

    /* renamed from: f, reason: collision with root package name */
    public Connection f5015f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5016g = false;

    /* renamed from: h, reason: collision with root package name */
    public String f5017h;

    /* renamed from: cm.a$a, reason: collision with other inner class name */
    public class C0108a implements Callback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j.b f5018a;
        public final /* synthetic */ Intent b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f5019c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f5020d;

        public C0108a(j.b bVar, Intent intent, int i10, g gVar) {
            this.f5018a = bVar;
            this.b = intent;
            this.f5019c = i10;
            this.f5020d = gVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            try {
                a.i(this.f5018a, jSONObject.getString(Text.type), jSONObject.getString("context"), this.b, this.f5019c, this.f5020d);
            } catch (JSONException unused) {
                Log.e("ContentSharingProtocol", "Error parsing share text data.");
            }
        }
    }

    public class b implements Callback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j.b f5022a;
        public final /* synthetic */ Intent b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f5023c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f5024d;

        public b(j.b bVar, Intent intent, int i10, g gVar) {
            this.f5022a = bVar;
            this.b = intent;
            this.f5023c = i10;
            this.f5024d = gVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            try {
                a.i(this.f5022a, jSONObject.getString("url"), jSONObject.getString("context"), this.b, this.f5023c, this.f5024d);
            } catch (JSONException unused) {
                Log.e("ContentSharingProtocol", "Error parsing share url data.");
            }
        }
    }

    public class c implements Callback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j.b f5026a;
        public final /* synthetic */ Intent b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f5027c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f5028d;

        public c(j.b bVar, Intent intent, int i10, g gVar) {
            this.f5026a = bVar;
            this.b = intent;
            this.f5027c = i10;
            this.f5028d = gVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            try {
                a.h(this.f5026a, jSONObject.getString("image"), jSONObject.optString("url"), jSONObject.optString("context"), this.b, this.f5027c, this.f5028d);
            } catch (JSONException unused) {
                Log.e("ContentSharingProtocol", "Error parsing share image data.");
            }
        }
    }

    public class d implements Callback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j.b f5030a;
        public final /* synthetic */ Intent b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f5031c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f5032d;

        public d(j.b bVar, Intent intent, int i10, g gVar) {
            this.f5030a = bVar;
            this.b = intent;
            this.f5031c = i10;
            this.f5032d = gVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            try {
                String string = jSONObject.getString("video");
                String optString = jSONObject.optString("url");
                String optString2 = jSONObject.optString("context");
                if (h.a().c3()) {
                    a.this.f5017h = string;
                }
                a.j(this.f5030a, string, optString, optString2, this.b, this.f5031c, this.f5032d);
            } catch (JSONException unused) {
                Log.e("ContentSharingProtocol", "Error parsing share video data.");
            }
        }
    }

    public class e implements Callback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ClipboardManager f5034a;

        public e(ClipboardManager clipboardManager) {
            this.f5034a = clipboardManager;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            String optString = jSONObject.optString(Text.type, "");
            if (optString.isEmpty()) {
                Log.e("ContentSharingProtocol", "Error: setClipboardText received null content value for clipboard.");
            } else {
                this.f5034a.setPrimaryClip(ClipData.newPlainText("label", optString));
            }
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5035a = new a(null);
    }

    public interface g {
        void a(String str, String str2);
    }

    public a(MessageBus messageBus) {
        this.f5011a = messageBus == null ? MessageBus.f() : messageBus;
    }

    public static Uri b(j.b bVar, String str) {
        try {
            return FileProvider.getUriForFile(bVar, bVar.getPackageName() + ".fileprovider", new File(str));
        } catch (IllegalArgumentException e10) {
            Log.e("ContentSharingProtocol", "File outside declared FileProvider paths, falling back: " + str, e10);
            return c(bVar, str);
        }
    }

    public static Uri c(j.b bVar, String str) {
        File filesDir = bVar.getFilesDir();
        File parentFile = filesDir != null ? filesDir.getParentFile() : null;
        File parentFile2 = parentFile != null ? parentFile.getParentFile() : null;
        String absolutePath = parentFile2 != null ? parentFile2.getAbsolutePath() : "";
        if (!absolutePath.endsWith("/")) {
            absolutePath = absolutePath + "/";
        }
        return Uri.parse(str.replace(absolutePath, "content://"));
    }

    public static int d(int i10) {
        return Build.VERSION.SDK_INT >= 31 ? i10 | 33554432 : i10;
    }

    public static void f(j.b bVar, Intent intent, Intent intent2, int i10) {
        bVar.startActivityForResult(Intent.createChooser(intent, null, PendingIntent.getBroadcast(bVar, 0, intent2, d(134217728)).getIntentSender()), i10);
    }

    public static void g(j.b bVar, String str, String str2, String str3, String str4, Intent intent, int i10, g gVar) {
        if (gVar != null) {
            gVar.a(str4, str3);
        }
        boolean l10 = h.a().l();
        Uri b10 = l10 ? b(bVar, str) : c(bVar, str);
        Intent intent2 = new Intent("android.intent.action.SEND");
        intent2.setDataAndType(b10, str2);
        intent2.putExtra("android.intent.extra.STREAM", b10);
        intent2.addFlags(1);
        if (!TextUtils.isEmpty(str3)) {
            intent2.putExtra("android.intent.extra.TEXT", str3);
            if (l10 && "content".equals(b10.getScheme())) {
                intent2.setClipData(ClipData.newUri(bVar.getContentResolver(), "shared", b10));
            }
        }
        f(bVar, intent2, intent, i10);
    }

    public static void h(j.b bVar, String str, String str2, String str3, Intent intent, int i10, g gVar) {
        g(bVar, str, "image/*", str2, str3, intent, i10, gVar);
    }

    public static void i(j.b bVar, String str, String str2, Intent intent, int i10, g gVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (gVar != null) {
            gVar.a(str2, "");
        }
        Intent intent2 = new Intent("android.intent.action.SEND");
        intent2.setType("text/plain");
        intent2.putExtra("android.intent.extra.TEXT", str);
        f(bVar, intent2, intent, i10);
    }

    public static void j(j.b bVar, String str, String str2, String str3, Intent intent, int i10, g gVar) {
        g(bVar, str, "video/*", str2, str3, intent, i10, gVar);
    }

    public static a k() {
        return f.f5035a;
    }

    public void e(Intent intent) {
        if (h.a().c3() && this.f5017h != null) {
            File file = new File(this.f5017h);
            try {
                try {
                    if (file.exists()) {
                        Log.i("ContentSharingProtocol", "Deleted video file: " + file.delete() + " — " + this.f5017h);
                    } else {
                        Log.w("ContentSharingProtocol", "Video file not found: " + this.f5017h);
                    }
                    this.f5017h = null;
                } catch (Exception e10) {
                    Log.e("ContentSharingProtocol", "Error while deleting video file: " + this.f5017h, e10);
                    this.f5017h = null;
                }
            } catch (Throwable th2) {
                this.f5017h = null;
                throw th2;
            }
        }
    }

    public synchronized void l(j.b bVar, Intent intent, int i10, g gVar) {
        Throwable th2;
        try {
            try {
                if (this.f5016g) {
                    try {
                        Log.w("ContentSharingProtocol", "Attempted to set ExternalContentSharingProtocol callback, but one is already set.");
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                this.f5016g = true;
                try {
                    this.f5012c = this.f5011a.t(lm.c.b(), new C0108a(bVar, intent, i10, gVar));
                    this.f5013d = this.f5011a.t(lm.c.c(), new b(bVar, intent, i10, gVar));
                    this.b = this.f5011a.t(lm.c.a(), new c(bVar, intent, i10, gVar));
                    this.f5014e = this.f5011a.t(lm.c.d(), new d(bVar, intent, i10, gVar));
                    this.f5015f = this.f5011a.t("ExternalContentSharing.setClipboardText", new e((ClipboardManager) bVar.getSystemService("clipboard")));
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public synchronized void m() {
        if (!this.f5016g) {
            Log.w("ContentSharingProtocol", "Attempted to disconnect ExternalContentSharingProtocol callback, but one is not connected.");
            return;
        }
        this.b.a();
        this.b = null;
        this.f5012c.a();
        this.f5012c = null;
        this.f5013d.a();
        this.f5013d = null;
        this.f5014e.a();
        this.f5014e = null;
        this.f5015f.a();
        this.f5015f = null;
        this.f5016g = false;
    }
}

package com.roblox.protocols.mediapicker;

import android.app.Activity;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Log;
import com.roblox.protocols.mediapicker.MediaPickerProtocol;
import com.roblox.universalapp.messagebus.MessageBus;
import e.p;
import g.h;
import h.f;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import km.i;
import km.j;
import km.l;
import km.m;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MediaPickerProtocol {

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap<String, f.h> f9757f = new a();

    /* renamed from: a, reason: collision with root package name */
    public m f9758a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference<Activity> f9759c;

    /* renamed from: d, reason: collision with root package name */
    public g.c<h> f9760d;

    /* renamed from: e, reason: collision with root package name */
    public jl.f f9761e;

    public class a extends HashMap<String, f.h> {
        public a() {
            put(MediaPickerProtocol.getAssetTypeImages(), f.d.f18923a);
            put(MediaPickerProtocol.getAssetTypeVideos(), f.g.f18924a);
        }
    }

    public class b implements i {
        public b() {
        }

        @Override // km.i
        public l a(JSONObject jSONObject) {
            l lVar = new l();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(MediaPickerProtocol.getAvailableParamName(), true);
                lVar.f22865a = jSONObject2;
                return lVar;
            } catch (JSONException e10) {
                Log.e("MediaPickerProtocol", "Indicating available on Android failed with error: " + e10.getMessage());
                return null;
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public static final MediaPickerProtocol f9763a = new MediaPickerProtocol();
    }

    public class d implements j {
        public d() {
        }

        @Override // km.j
        public void a(JSONObject jSONObject, m mVar) {
            MediaPickerProtocol.this.f9758a = mVar;
            if (MediaPickerProtocol.this.f9759c == null || MediaPickerProtocol.this.f9759c.get() == null) {
                Log.e("MediaPickerProtocol", "No Activity found while checking permissions");
                return;
            }
            try {
                MediaPickerProtocol.this.b = jSONObject.getString(MediaPickerProtocol.getAssetTypeParamName());
                if (!f.c()) {
                    MediaPickerProtocol.this.f9761e.a();
                } else {
                    Log.i("MediaPickerProtocol", "Permissions already granted for photo album");
                    MediaPickerProtocol.this.n();
                }
            } catch (JSONException unused) {
                Log.e("MediaPickerProtocol", "Error parsing asset type.");
            }
        }
    }

    public MediaPickerProtocol() {
        MessageBus.f().q(getProtocolName(), getPickMediaId(), new d());
        MessageBus.f().p(getProtocolName(), getIsAvailableId(), new b());
    }

    private static native String getAssetFilePathParamName();

    public static native String getAssetTypeImages();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getAssetTypeParamName();

    public static native String getAssetTypeVideos();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getAvailableParamName();

    private static native String getErrorParamName();

    private static native String getIsAvailableId();

    private static native String getPermissionsParamName();

    private static native String getPickMediaId();

    private static native String getProtocolName();

    public static native String getSourceTypeCamera();

    public static native void initializeMediaPickerProtocol();

    public static synchronized MediaPickerProtocol o() {
        MediaPickerProtocol mediaPickerProtocol;
        synchronized (MediaPickerProtocol.class) {
            mediaPickerProtocol = c.f9763a;
        }
        return mediaPickerProtocol;
    }

    public static native void onMediaPickerResponse(long j10, byte[] bArr, String str);

    public final String i(Uri uri) {
        Cursor query;
        int columnIndex;
        WeakReference<Activity> weakReference = this.f9759c;
        String str = null;
        if (weakReference == null || weakReference.get() == null) {
            Log.e("MediaPickerProtocol", "No Activity found while checking permissions");
            return null;
        }
        Activity activity = this.f9759c.get();
        if (f.c()) {
            query = activity.getContentResolver().query(uri, null, null, null, null);
        } else {
            String[] split = DocumentsContract.getDocumentId(uri).split(":");
            String str2 = split[0];
            String str3 = split[1];
            query = "image".equals(str2) ? activity.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, "_id=?", new String[]{str3}, null) : "video".equals(str2) ? activity.getContentResolver().query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, null, "_id=?", new String[]{str3}, null) : null;
        }
        if (query == null) {
            Log.e("MediaPickerProtocol", "Picked URI is invalid");
            return null;
        }
        if (query.moveToFirst() && (columnIndex = query.getColumnIndex("_data")) != -1) {
            str = query.getString(columnIndex);
        }
        query.close();
        return str;
    }

    public void j(Uri uri) {
        if (uri == null) {
            Log.d("MediaPickerProtocol", "No media selected");
            l lVar = new l();
            lVar.f22866c = 1;
            try {
                lVar.f22865a.put(getAssetTypeParamName(), this.b);
                lVar.f22865a.put(getAssetFilePathParamName(), "");
                lVar.f22865a.put(getErrorParamName(), "");
                lVar.f22865a.put(getPermissionsParamName(), true);
            } catch (JSONException unused) {
                Log.e("MediaPickerProtocol", "Exception while writing response for pick media request");
            }
            this.f9758a.a(lVar);
            return;
        }
        String i10 = i(uri);
        Log.d("MediaPickerProtocol", "Selected file path: " + i10);
        l lVar2 = new l();
        try {
            lVar2.f22865a.put(getAssetTypeParamName(), this.b);
            lVar2.f22865a.put(getAssetFilePathParamName(), i10);
            lVar2.f22865a.put(getErrorParamName(), "");
            lVar2.f22865a.put(getPermissionsParamName(), true);
        } catch (JSONException unused2) {
            Log.e("MediaPickerProtocol", "Exception while handling pick media request");
        }
        this.f9758a.a(lVar2);
    }

    public final /* synthetic */ void k(f.h hVar) {
        this.f9760d.b(new h.a().d(hVar).a());
    }

    public void l(p pVar) {
        this.f9759c = new WeakReference<>(pVar);
        this.f9760d = pVar.h(new f(), new g.a() { // from class: jl.a
            @Override // g.a
            public final void a(Object obj) {
                MediaPickerProtocol.this.j((Uri) obj);
            }
        });
    }

    public void m(p pVar, jl.f fVar) {
        this.f9759c = new WeakReference<>(pVar);
        this.f9761e = fVar;
        initializeMediaPickerProtocol();
    }

    public final void n() {
        final f.h hVar = f9757f.get(this.b);
        if (hVar == null) {
            Log.e("MediaPickerProtocol", "Media Type must be either IMAGES or VIDEOS");
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: jl.b
                @Override // java.lang.Runnable
                public final void run() {
                    MediaPickerProtocol.this.k(hVar);
                }
            });
        }
    }
}

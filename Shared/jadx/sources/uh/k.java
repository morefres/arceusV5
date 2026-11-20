package uh;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import com.roblox.client.RobloxApplication;
import com.roblox.engine.jni.EngineJavaCallback2;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.model.NativeTextBoxInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class k extends EngineJavaCallback2 {
    public static OutputStream t(String str) {
        Uri uri;
        Uri insert;
        String u8 = u(str);
        if (Build.VERSION.SDK_INT < 29) {
            return new FileOutputStream(new File(u8.startsWith("image/") ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) : u8.startsWith("video/") ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), str));
        }
        ContentResolver contentResolver = RobloxApplication.f().getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", u8);
        contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
        if (u8.startsWith("image/")) {
            insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        } else if (u8.startsWith("video/")) {
            insert = contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
        } else {
            uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
            insert = contentResolver.insert(uri, contentValues);
        }
        Objects.requireNonNull(insert);
        return contentResolver.openOutputStream(insert);
    }

    public static String u(String str) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    public static void v(String str) {
        boolean z10;
        String str2;
        String name = new File(str).getName();
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            OutputStream t8 = t(name);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    break;
                } else {
                    t8.write(bArr, 0, read);
                }
            }
            fileInputStream.close();
            t8.close();
            str2 = "";
            z10 = true;
        } catch (IOException e10) {
            ek.q.k("DataModelJavaCallback", "saveImageToAlbum: Failed to save image with exception: \n" + e10);
            String message = e10.getMessage();
            z10 = false;
            str2 = message;
        }
        if (rh.h.a().w5() && u(name).equals("video/mp4")) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
        NativeGLInterface.nativeImageSavedToAlbumFinished(name, z10, str2);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void c(int i10) {
        if (i10 == 3) {
            s().e();
        }
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void d() {
        x0 s8 = s();
        if (s8 != null) {
            s8.a();
        }
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void g(String str) {
        x0 s8 = s();
        if (s8 != null) {
            s8.d(str);
        }
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void h() {
        x0 s8 = s();
        if (s8 != null) {
            s8.c();
        }
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void p(String str) {
        v(str);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void r(long j10, boolean z10, byte[] bArr, NativeTextBoxInfo nativeTextBoxInfo) {
        x0 s8 = s();
        if (s8 != null) {
            s8.b(j10, z10, new String(bArr, Charset.forName("UTF-8")), nativeTextBoxInfo);
        }
    }

    public abstract x0 s();
}

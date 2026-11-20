package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public class d0 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final URL f8809a;
    public volatile Future<?> b;

    /* renamed from: c, reason: collision with root package name */
    public Task<Bitmap> f8810c;

    public d0(URL url) {
        this.f8809a = url;
    }

    public static /* synthetic */ void a(d0 d0Var, sb.k kVar) {
        d0Var.getClass();
        try {
            kVar.c(d0Var.b());
        } catch (Exception e10) {
            kVar.b(e10);
        }
    }

    public static d0 d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new d0(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    public Bitmap b() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f8809a);
        }
        byte[] c10 = c();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(c10, 0, c10.length);
        if (decodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.f8809a);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f8809a);
        }
        return decodeByteArray;
    }

    public final byte[] c() {
        URLConnection openConnection = this.f8809a.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] d10 = b.d(b.b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + d10.length + " bytes from " + this.f8809a);
            }
            if (d10.length <= 1048576) {
                return d10;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.cancel(true);
    }

    public Task<Bitmap> e() {
        return (Task) n9.m.l(this.f8810c);
    }

    public void f(ExecutorService executorService) {
        final sb.k kVar = new sb.k();
        this.b = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.c0
            @Override // java.lang.Runnable
            public final void run() {
                d0.a(d0.this, kVar);
            }
        });
        this.f8810c = kVar.a();
    }
}

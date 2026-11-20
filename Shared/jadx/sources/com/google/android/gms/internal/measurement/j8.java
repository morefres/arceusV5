package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class j8 implements f8 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f6605a = new AtomicBoolean();
    public HashMap b = null;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f6606c = new HashMap(16, 1.0f);

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f6607d = new HashMap(16, 1.0f);

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f6608e = new HashMap(16, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f6609f = new HashMap(16, 1.0f);

    /* renamed from: g, reason: collision with root package name */
    public Object f6610g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6611h = false;

    /* renamed from: i, reason: collision with root package name */
    public final String[] f6612i = new String[0];

    @Override // com.google.android.gms.internal.measurement.f8
    public final String a(ContentResolver contentResolver, String str, String str2) {
        String str3;
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (this) {
            try {
                String str4 = null;
                if (this.b == null) {
                    this.f6605a.set(false);
                    this.b = new HashMap(16, 1.0f);
                    this.f6610g = new Object();
                    contentResolver.registerContentObserver(e8.f6474a, true, new h8(this, null));
                } else if (this.f6605a.getAndSet(false)) {
                    this.b.clear();
                    this.f6606c.clear();
                    this.f6607d.clear();
                    this.f6608e.clear();
                    this.f6609f.clear();
                    this.f6610g = new Object();
                    this.f6611h = false;
                }
                Object obj = this.f6610g;
                if (this.b.containsKey(str)) {
                    String str5 = (String) this.b.get(str);
                    if (str5 != null) {
                        str4 = str5;
                    }
                    return str4;
                }
                try {
                    Uri uri = e8.f6474a;
                    ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                    try {
                        if (acquireUnstableContentProviderClient == null) {
                            throw new i8("Unable to acquire ContentProviderClient");
                        }
                        try {
                            Cursor query = acquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                            try {
                                if (query == null) {
                                    throw new i8("ContentProvider query returned null cursor");
                                }
                                if (query.moveToFirst()) {
                                    str3 = query.getString(1);
                                    query.close();
                                    acquireUnstableContentProviderClient.release();
                                } else {
                                    query.close();
                                    acquireUnstableContentProviderClient.release();
                                    str3 = null;
                                }
                                if (str3 != null && str3.equals(null)) {
                                    str3 = null;
                                }
                                synchronized (this) {
                                    try {
                                        if (obj == this.f6610g) {
                                            this.b.put(str, str3);
                                        }
                                    } finally {
                                    }
                                }
                                if (str3 != null) {
                                    return str3;
                                }
                                return null;
                            } finally {
                            }
                        } catch (RemoteException e10) {
                            throw new i8("ContentProvider query failed", e10);
                        }
                    } catch (Throwable th2) {
                        acquireUnstableContentProviderClient.release();
                        throw th2;
                    }
                } catch (i8 unused) {
                    return null;
                }
            } finally {
            }
        }
    }

    public final /* synthetic */ AtomicBoolean b() {
        return this.f6605a;
    }
}

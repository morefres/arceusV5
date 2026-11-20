package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

/* loaded from: classes.dex */
public final class p8 implements t8 {

    /* renamed from: i, reason: collision with root package name */
    public static final ConcurrentMap f6774i = new ConcurrentHashMap();

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f6775j = {"key", "value"};

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f6776a;
    public final Uri b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f6777c;

    /* renamed from: g, reason: collision with root package name */
    public volatile Map f6781g;

    /* renamed from: d, reason: collision with root package name */
    public ContentObserver f6778d = null;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f6779e = true;

    /* renamed from: f, reason: collision with root package name */
    public final Object f6780f = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final List f6782h = new ArrayList();

    public p8(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        he.n.l(contentResolver);
        he.n.l(uri);
        this.f6776a = contentResolver;
        this.b = uri;
        this.f6777c = runnable;
    }

    public static p8 c(final ContentResolver contentResolver, final Uri uri, final Runnable runnable) {
        p8 p8Var = (p8) f6774i.computeIfAbsent(uri, new Function() { // from class: com.google.android.gms.internal.measurement.o8
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return p8.g(contentResolver, uri, runnable, (Uri) obj);
            }
        });
        try {
            if (!p8Var.f6779e) {
                return p8Var;
            }
            synchronized (p8Var) {
                try {
                    if (p8Var.f6779e) {
                        m8 m8Var = new m8(p8Var, null);
                        p8Var.f6776a.registerContentObserver(p8Var.b, false, m8Var);
                        p8Var.f6778d = m8Var;
                        p8Var.f6779e = false;
                    }
                } finally {
                }
            }
            return p8Var;
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static void f() {
        Iterator it = f6774i.values().iterator();
        while (it.hasNext()) {
            p8 p8Var = (p8) it.next();
            synchronized (p8Var) {
                try {
                    if (p8Var.f6779e) {
                        p8Var.f6779e = false;
                    } else {
                        ContentObserver contentObserver = p8Var.f6778d;
                        if (contentObserver != null) {
                            p8Var.f6776a.unregisterContentObserver(contentObserver);
                            p8Var.f6778d = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            it.remove();
        }
    }

    public static /* synthetic */ p8 g(ContentResolver contentResolver, Uri uri, Runnable runnable, Uri uri2) {
        return new p8(contentResolver, uri, runnable);
    }

    @Override // com.google.android.gms.internal.measurement.t8
    public final /* bridge */ /* synthetic */ Object b(String str) {
        return (String) d().get(str);
    }

    public final Map d() {
        Map map;
        Map map2 = this.f6781g;
        if (map2 == null) {
            synchronized (this.f6780f) {
                map2 = this.f6781g;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) t8.a(new s8() { // from class: com.google.android.gms.internal.measurement.n8
                                @Override // com.google.android.gms.internal.measurement.s8
                                public final /* synthetic */ Object zza() {
                                    return p8.this.h();
                                }
                            });
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (SQLiteException | IllegalStateException | SecurityException e10) {
                        Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e10);
                        map = Collections.EMPTY_MAP;
                    }
                    this.f6781g = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.EMPTY_MAP;
    }

    public final void e() {
        synchronized (this.f6780f) {
            this.f6781g = null;
            this.f6777c.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f6782h.iterator();
                while (it.hasNext()) {
                    ((q8) it.next()).zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ Map h() {
        ContentResolver contentResolver = this.f6776a;
        Uri uri = this.b;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (acquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            Cursor query = acquireUnstableContentProviderClient.query(uri, f6775j, null, null, null);
            try {
                if (query == null) {
                    Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                    return Collections.EMPTY_MAP;
                }
                int count = query.getCount();
                if (count == 0) {
                    Map map = Collections.EMPTY_MAP;
                    query.close();
                    return map;
                }
                Map aVar = count <= 256 ? new w1.a(count) : new HashMap(count, 1.0f);
                while (query.moveToNext()) {
                    aVar.put(query.getString(0), query.getString(1));
                }
                if (query.isAfterLast()) {
                    query.close();
                    return aVar;
                }
                Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                Map map2 = Collections.EMPTY_MAP;
                query.close();
                return map2;
            } finally {
            }
        } catch (RemoteException e10) {
            Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e10);
            return Collections.EMPTY_MAP;
        } finally {
            acquireUnstableContentProviderClient.release();
        }
    }
}

package q;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class c extends DataSetObservable {

    /* renamed from: m, reason: collision with root package name */
    public static final String f29257m = "c";

    /* renamed from: n, reason: collision with root package name */
    public static final Object f29258n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public static final Map<String, c> f29259o = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Context f29262d;

    /* renamed from: e, reason: collision with root package name */
    public final String f29263e;

    /* renamed from: f, reason: collision with root package name */
    public Intent f29264f;

    /* renamed from: a, reason: collision with root package name */
    public final Object f29260a = new Object();
    public final List<a> b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final List<d> f29261c = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public b f29265g = new C0510c();

    /* renamed from: h, reason: collision with root package name */
    public int f29266h = 50;

    /* renamed from: i, reason: collision with root package name */
    public boolean f29267i = true;

    /* renamed from: j, reason: collision with root package name */
    public boolean f29268j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f29269k = true;

    /* renamed from: l, reason: collision with root package name */
    public boolean f29270l = false;

    public static final class a implements Comparable<a> {

        /* renamed from: a, reason: collision with root package name */
        public final ResolveInfo f29271a;
        public float b;

        public a(ResolveInfo resolveInfo) {
            this.f29271a = resolveInfo;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Float.floatToIntBits(aVar.b) - Float.floatToIntBits(this.b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && a.class == obj.getClass() && Float.floatToIntBits(this.b) == Float.floatToIntBits(((a) obj).b);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.b) + 31;
        }

        public String toString() {
            return "[resolveInfo:" + this.f29271a.toString() + "; weight:" + new BigDecimal(this.b) + "]";
        }
    }

    public interface b {
        void a(Intent intent, List<a> list, List<d> list2);
    }

    /* renamed from: q.c$c, reason: collision with other inner class name */
    public static final class C0510c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final Map<ComponentName, a> f29272a = new HashMap();

        @Override // q.c.b
        public void a(Intent intent, List<a> list, List<d> list2) {
            Map<ComponentName, a> map = this.f29272a;
            map.clear();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar = list.get(i10);
                aVar.b = 0.0f;
                ActivityInfo activityInfo = aVar.f29271a.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), aVar);
            }
            float f10 = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                d dVar = list2.get(size2);
                a aVar2 = map.get(dVar.f29273a);
                if (aVar2 != null) {
                    aVar2.b += dVar.f29274c * f10;
                    f10 *= 0.95f;
                }
            }
            Collections.sort(list);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final ComponentName f29273a;
        public final long b;

        /* renamed from: c, reason: collision with root package name */
        public final float f29274c;

        public d(String str, long j10, float f10) {
            this(ComponentName.unflattenFromString(str), j10, f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            ComponentName componentName = this.f29273a;
            if (componentName == null) {
                if (dVar.f29273a != null) {
                    return false;
                }
            } else if (!componentName.equals(dVar.f29273a)) {
                return false;
            }
            return this.b == dVar.b && Float.floatToIntBits(this.f29274c) == Float.floatToIntBits(dVar.f29274c);
        }

        public int hashCode() {
            ComponentName componentName = this.f29273a;
            int hashCode = componentName == null ? 0 : componentName.hashCode();
            long j10 = this.b;
            return ((((hashCode + 31) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Float.floatToIntBits(this.f29274c);
        }

        public String toString() {
            return "[; activity:" + this.f29273a + "; time:" + this.b + "; weight:" + new BigDecimal(this.f29274c) + "]";
        }

        public d(ComponentName componentName, long j10, float f10) {
            this.f29273a = componentName;
            this.b = j10;
            this.f29274c = f10;
        }
    }

    public final class e extends AsyncTask<Object, Void, Void> {
        public e() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0074, code lost:
        
            if (r15 != null) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
        
            r15.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
        
            if (r15 == null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
        
            if (r15 == null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00d4, code lost:
        
            if (r15 == null) goto L33;
         */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Void doInBackground(java.lang.Object... r15) {
            /*
                Method dump skipped, instructions count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: q.c.e.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    public c(Context context, String str) {
        this.f29262d = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(".xml")) {
            this.f29263e = str;
            return;
        }
        this.f29263e = str + ".xml";
    }

    public static c d(Context context, String str) {
        c cVar;
        synchronized (f29258n) {
            try {
                Map<String, c> map = f29259o;
                cVar = map.get(str);
                if (cVar == null) {
                    cVar = new c(context, str);
                    map.put(str, cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    public final boolean a(d dVar) {
        boolean add = this.f29261c.add(dVar);
        if (add) {
            this.f29269k = true;
            l();
            k();
            p();
            notifyChanged();
        }
        return add;
    }

    public Intent b(int i10) {
        synchronized (this.f29260a) {
            try {
                if (this.f29264f == null) {
                    return null;
                }
                c();
                ActivityInfo activityInfo = this.b.get(i10).f29271a.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                Intent intent = new Intent(this.f29264f);
                intent.setComponent(componentName);
                a(new d(componentName, System.currentTimeMillis(), 1.0f));
                return intent;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        boolean j10 = j() | m();
        l();
        if (j10) {
            p();
            notifyChanged();
        }
    }

    public ResolveInfo e(int i10) {
        ResolveInfo resolveInfo;
        synchronized (this.f29260a) {
            c();
            resolveInfo = this.b.get(i10).f29271a;
        }
        return resolveInfo;
    }

    public int f() {
        int size;
        synchronized (this.f29260a) {
            c();
            size = this.b.size();
        }
        return size;
    }

    public int g(ResolveInfo resolveInfo) {
        synchronized (this.f29260a) {
            try {
                c();
                List<a> list = this.b;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (list.get(i10).f29271a == resolveInfo) {
                        return i10;
                    }
                }
                return -1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ResolveInfo h() {
        synchronized (this.f29260a) {
            try {
                c();
                if (this.b.isEmpty()) {
                    return null;
                }
                return this.b.get(0).f29271a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int i() {
        int size;
        synchronized (this.f29260a) {
            c();
            size = this.f29261c.size();
        }
        return size;
    }

    public final boolean j() {
        if (!this.f29270l || this.f29264f == null) {
            return false;
        }
        this.f29270l = false;
        this.b.clear();
        List<ResolveInfo> queryIntentActivities = this.f29262d.getPackageManager().queryIntentActivities(this.f29264f, 0);
        int size = queryIntentActivities.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.b.add(new a(queryIntentActivities.get(i10)));
        }
        return true;
    }

    public final void k() {
        if (!this.f29268j) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (this.f29269k) {
            this.f29269k = false;
            if (TextUtils.isEmpty(this.f29263e)) {
                return;
            }
            new e().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f29261c), this.f29263e);
        }
    }

    public final void l() {
        int size = this.f29261c.size() - this.f29266h;
        if (size <= 0) {
            return;
        }
        this.f29269k = true;
        for (int i10 = 0; i10 < size; i10++) {
            this.f29261c.remove(0);
        }
    }

    public final boolean m() {
        if (!this.f29267i || !this.f29269k || TextUtils.isEmpty(this.f29263e)) {
            return false;
        }
        this.f29267i = false;
        this.f29268j = true;
        n();
        return true;
    }

    public final void n() {
        try {
            FileInputStream openFileInput = this.f29262d.openFileInput(this.f29263e);
            try {
                try {
                    XmlPullParser newPullParser = Xml.newPullParser();
                    newPullParser.setInput(openFileInput, "UTF-8");
                    for (int i10 = 0; i10 != 1 && i10 != 2; i10 = newPullParser.next()) {
                    }
                    if (!"historical-records".equals(newPullParser.getName())) {
                        throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                    }
                    List<d> list = this.f29261c;
                    list.clear();
                    while (true) {
                        int next = newPullParser.next();
                        if (next == 1) {
                            if (openFileInput != null) {
                                openFileInput.close();
                                return;
                            }
                            return;
                        } else if (next != 3 && next != 4) {
                            if (!"historical-record".equals(newPullParser.getName())) {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                            list.add(new d(newPullParser.getAttributeValue(null, "activity"), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                        }
                    }
                } catch (IOException e10) {
                    Log.e(f29257m, "Error reading historical recrod file: " + this.f29263e, e10);
                    if (openFileInput == null) {
                        return;
                    }
                    openFileInput.close();
                } catch (XmlPullParserException e11) {
                    Log.e(f29257m, "Error reading historical recrod file: " + this.f29263e, e11);
                    if (openFileInput == null) {
                        return;
                    }
                    openFileInput.close();
                }
            } catch (Throwable th2) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused) {
                    }
                }
                throw th2;
            }
        } catch (FileNotFoundException | IOException unused2) {
        }
    }

    public void o(int i10) {
        synchronized (this.f29260a) {
            try {
                c();
                a aVar = this.b.get(i10);
                a aVar2 = this.b.get(0);
                float f10 = aVar2 != null ? (aVar2.b - aVar.b) + 5.0f : 1.0f;
                ActivityInfo activityInfo = aVar.f29271a.activityInfo;
                a(new d(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean p() {
        if (this.f29265g == null || this.f29264f == null || this.b.isEmpty() || this.f29261c.isEmpty()) {
            return false;
        }
        this.f29265g.a(this.f29264f, this.b, Collections.unmodifiableList(this.f29261c));
        return true;
    }
}

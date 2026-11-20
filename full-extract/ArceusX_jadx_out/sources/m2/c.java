package m2;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k2.r;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public Context f24229a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public String f24230c;

    /* renamed from: d, reason: collision with root package name */
    public Intent[] f24231d;

    /* renamed from: e, reason: collision with root package name */
    public ComponentName f24232e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f24233f;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f24234g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f24235h;

    /* renamed from: i, reason: collision with root package name */
    public IconCompat f24236i;

    /* renamed from: j, reason: collision with root package name */
    public r[] f24237j;

    /* renamed from: k, reason: collision with root package name */
    public Set<String> f24238k;

    /* renamed from: l, reason: collision with root package name */
    public l2.d f24239l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f24240m;

    /* renamed from: n, reason: collision with root package name */
    public int f24241n;

    /* renamed from: o, reason: collision with root package name */
    public PersistableBundle f24242o;

    /* renamed from: p, reason: collision with root package name */
    public long f24243p;

    /* renamed from: q, reason: collision with root package name */
    public UserHandle f24244q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f24245r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f24246s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f24247t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f24248u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f24249v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f24250w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f24251x;

    /* renamed from: y, reason: collision with root package name */
    public int f24252y;

    /* renamed from: z, reason: collision with root package name */
    public int f24253z;

    public static class a {
        public static void a(ShortcutInfo.Builder builder, int i10) {
            builder.setExcludedFromSurfaces(i10);
        }
    }

    public static List<c> b(Context context, List<ShortcutInfo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ShortcutInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, it.next()).a());
        }
        return arrayList;
    }

    public static l2.d h(ShortcutInfo shortcutInfo) {
        if (Build.VERSION.SDK_INT < 29) {
            return i(shortcutInfo.getExtras());
        }
        if (shortcutInfo.getLocusId() == null) {
            return null;
        }
        return l2.d.d(shortcutInfo.getLocusId());
    }

    public static l2.d i(PersistableBundle persistableBundle) {
        String string;
        if (persistableBundle == null || (string = persistableBundle.getString("extraLocusId")) == null) {
            return null;
        }
        return new l2.d(string);
    }

    public static r[] k(PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey("extraPersonCount")) {
            return null;
        }
        int i10 = persistableBundle.getInt("extraPersonCount");
        r[] rVarArr = new r[i10];
        int i11 = 0;
        while (i11 < i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("extraPerson_");
            int i12 = i11 + 1;
            sb2.append(i12);
            rVarArr[i11] = r.a(persistableBundle.getPersistableBundle(sb2.toString()));
            i11 = i12;
        }
        return rVarArr;
    }

    public final PersistableBundle a() {
        if (this.f24242o == null) {
            this.f24242o = new PersistableBundle();
        }
        r[] rVarArr = this.f24237j;
        if (rVarArr != null && rVarArr.length > 0) {
            this.f24242o.putInt("extraPersonCount", rVarArr.length);
            int i10 = 0;
            while (i10 < this.f24237j.length) {
                PersistableBundle persistableBundle = this.f24242o;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("extraPerson_");
                int i11 = i10 + 1;
                sb2.append(i11);
                persistableBundle.putPersistableBundle(sb2.toString(), this.f24237j[i10].k());
                i10 = i11;
            }
        }
        l2.d dVar = this.f24239l;
        if (dVar != null) {
            this.f24242o.putString("extraLocusId", dVar.a());
        }
        this.f24242o.putBoolean("extraLongLived", this.f24240m);
        return this.f24242o;
    }

    public Set<String> c() {
        return this.f24238k;
    }

    public PersistableBundle d() {
        return this.f24242o;
    }

    public IconCompat e() {
        return this.f24236i;
    }

    public String f() {
        return this.b;
    }

    public Intent g() {
        return this.f24231d[r0.length - 1];
    }

    public CharSequence j() {
        return this.f24234g;
    }

    public int l() {
        return this.f24241n;
    }

    public CharSequence m() {
        return this.f24233f;
    }

    public boolean n(int i10) {
        return (i10 & this.f24253z) != 0;
    }

    public ShortcutInfo o() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f24229a, this.b).setShortLabel(this.f24233f).setIntents(this.f24231d);
        IconCompat iconCompat = this.f24236i;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.p(this.f24229a));
        }
        if (!TextUtils.isEmpty(this.f24234g)) {
            intents.setLongLabel(this.f24234g);
        }
        if (!TextUtils.isEmpty(this.f24235h)) {
            intents.setDisabledMessage(this.f24235h);
        }
        ComponentName componentName = this.f24232e;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f24238k;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f24241n);
        PersistableBundle persistableBundle = this.f24242o;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r[] rVarArr = this.f24237j;
            if (rVarArr != null && rVarArr.length > 0) {
                int length = rVarArr.length;
                Person[] personArr = new Person[length];
                for (int i10 = 0; i10 < length; i10++) {
                    personArr[i10] = this.f24237j[i10].i();
                }
                intents.setPersons(personArr);
            }
            l2.d dVar = this.f24239l;
            if (dVar != null) {
                intents.setLocusId(dVar.c());
            }
            intents.setLongLived(this.f24240m);
        } else {
            intents.setExtras(a());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.a(intents, this.f24253z);
        }
        return intents.build();
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final c f24254a;
        public boolean b;

        /* renamed from: c, reason: collision with root package name */
        public Set<String> f24255c;

        /* renamed from: d, reason: collision with root package name */
        public Map<String, Map<String, List<String>>> f24256d;

        /* renamed from: e, reason: collision with root package name */
        public Uri f24257e;

        public b(Context context, String str) {
            c cVar = new c();
            this.f24254a = cVar;
            cVar.f24229a = context;
            cVar.b = str;
        }

        public c a() {
            if (TextUtils.isEmpty(this.f24254a.f24233f)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            c cVar = this.f24254a;
            Intent[] intentArr = cVar.f24231d;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            if (this.b) {
                if (cVar.f24239l == null) {
                    cVar.f24239l = new l2.d(cVar.b);
                }
                this.f24254a.f24240m = true;
            }
            if (this.f24255c != null) {
                c cVar2 = this.f24254a;
                if (cVar2.f24238k == null) {
                    cVar2.f24238k = new HashSet();
                }
                this.f24254a.f24238k.addAll(this.f24255c);
            }
            if (this.f24256d != null) {
                c cVar3 = this.f24254a;
                if (cVar3.f24242o == null) {
                    cVar3.f24242o = new PersistableBundle();
                }
                for (String str : this.f24256d.keySet()) {
                    Map<String, List<String>> map = this.f24256d.get(str);
                    this.f24254a.f24242o.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                    for (String str2 : map.keySet()) {
                        List<String> list = map.get(str2);
                        this.f24254a.f24242o.putStringArray(str + "/" + str2, list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                    }
                }
            }
            if (this.f24257e != null) {
                c cVar4 = this.f24254a;
                if (cVar4.f24242o == null) {
                    cVar4.f24242o = new PersistableBundle();
                }
                this.f24254a.f24242o.putString("extraSliceUri", t2.b.a(this.f24257e));
            }
            return this.f24254a;
        }

        public b b(ComponentName componentName) {
            this.f24254a.f24232e = componentName;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.f24254a.f24236i = iconCompat;
            return this;
        }

        public b d(Intent intent) {
            return e(new Intent[]{intent});
        }

        public b e(Intent[] intentArr) {
            this.f24254a.f24231d = intentArr;
            return this;
        }

        public b f(boolean z10) {
            this.f24254a.f24240m = z10;
            return this;
        }

        public b g(int i10) {
            this.f24254a.f24241n = i10;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f24254a.f24233f = charSequence;
            return this;
        }

        public b(Context context, ShortcutInfo shortcutInfo) {
            c cVar = new c();
            this.f24254a = cVar;
            cVar.f24229a = context;
            cVar.b = shortcutInfo.getId();
            cVar.f24230c = shortcutInfo.getPackage();
            Intent[] intents = shortcutInfo.getIntents();
            cVar.f24231d = (Intent[]) Arrays.copyOf(intents, intents.length);
            cVar.f24232e = shortcutInfo.getActivity();
            cVar.f24233f = shortcutInfo.getShortLabel();
            cVar.f24234g = shortcutInfo.getLongLabel();
            cVar.f24235h = shortcutInfo.getDisabledMessage();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                cVar.f24252y = shortcutInfo.getDisabledReason();
            } else {
                cVar.f24252y = shortcutInfo.isEnabled() ? 0 : 3;
            }
            cVar.f24238k = shortcutInfo.getCategories();
            cVar.f24237j = c.k(shortcutInfo.getExtras());
            cVar.f24244q = shortcutInfo.getUserHandle();
            cVar.f24243p = shortcutInfo.getLastChangedTimestamp();
            if (i10 >= 30) {
                cVar.f24245r = shortcutInfo.isCached();
            }
            cVar.f24246s = shortcutInfo.isDynamic();
            cVar.f24247t = shortcutInfo.isPinned();
            cVar.f24248u = shortcutInfo.isDeclaredInManifest();
            cVar.f24249v = shortcutInfo.isImmutable();
            cVar.f24250w = shortcutInfo.isEnabled();
            cVar.f24251x = shortcutInfo.hasKeyFieldsOnly();
            cVar.f24239l = c.h(shortcutInfo);
            cVar.f24241n = shortcutInfo.getRank();
            cVar.f24242o = shortcutInfo.getExtras();
        }
    }
}

package n2;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import e.j0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class e {

    public static class a {
        public static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final d[] f25700a;

        public c(d[] dVarArr) {
            this.f25700a = dVarArr;
        }

        public d[] a() {
            return this.f25700a;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f25701a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f25702c;

        /* renamed from: d, reason: collision with root package name */
        public final String f25703d;

        /* renamed from: e, reason: collision with root package name */
        public final int f25704e;

        /* renamed from: f, reason: collision with root package name */
        public final int f25705f;

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f25701a = str;
            this.b = i10;
            this.f25702c = z10;
            this.f25703d = str2;
            this.f25704e = i11;
            this.f25705f = i12;
        }

        public String a() {
            return this.f25701a;
        }

        public int b() {
            return this.f25705f;
        }

        public int c() {
            return this.f25704e;
        }

        public String d() {
            return this.f25703d;
        }

        public int e() {
            return this.b;
        }

        public boolean f() {
            return this.f25702c;
        }
    }

    /* renamed from: n2.e$e, reason: collision with other inner class name */
    public static final class C0451e implements b {

        /* renamed from: a, reason: collision with root package name */
        public final List<v2.e> f25706a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final int f25707c;

        /* renamed from: d, reason: collision with root package name */
        public final String f25708d;

        public C0451e(List<v2.e> list, int i10, int i11, String str) {
            this.f25706a = list;
            this.f25707c = i10;
            this.b = i11;
            this.f25708d = str;
        }

        public int a() {
            return this.f25707c;
        }

        public List<v2.e> b() {
            return this.f25706a;
        }

        public String c() {
            return this.f25708d;
        }

        public int d() {
            return this.b;
        }
    }

    public static int a(TypedArray typedArray, int i10) {
        return a.a(typedArray, i10);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return e(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(i(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(i(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static v2.e d(XmlPullParser xmlPullParser, Resources resources, String str, String str2, List<List<byte[]>> list) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), j2.g.B);
        try {
            String string = obtainAttributes.getString(j2.g.C);
            String string2 = obtainAttributes.getString(j2.g.D);
            String string3 = obtainAttributes.getString(j2.g.E);
            if (string == null) {
                throw new XmlPullParserException("query attribute must be set in fallback element");
            }
            while (xmlPullParser.next() != 3) {
                h(xmlPullParser);
            }
            v2.e eVar = new v2.e(str, str2, string, list, string2, string3);
            j0.a(obtainAttributes);
            return eVar;
        } catch (Throwable th2) {
            if (obtainAttributes == null) {
                throw th2;
            }
            try {
                j0.a(obtainAttributes);
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public static b e(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return f(xmlPullParser, resources);
        }
        h(xmlPullParser);
        return null;
    }

    public static b f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), j2.g.f21490h);
        String string = obtainAttributes.getString(j2.g.f21491i);
        String string2 = obtainAttributes.getString(j2.g.f21496n);
        String string3 = obtainAttributes.getString(j2.g.f21497o);
        String string4 = obtainAttributes.getString(j2.g.f21493k);
        int resourceId = obtainAttributes.getResourceId(j2.g.f21492j, 0);
        int integer = obtainAttributes.getInteger(j2.g.f21494l, 1);
        int integer2 = obtainAttributes.getInteger(j2.g.f21495m, 500);
        String string5 = obtainAttributes.getString(j2.g.f21498p);
        obtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(g(xmlPullParser, resources));
                    } else {
                        h(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new c((d[]) arrayList.toArray(new d[0]));
        }
        List<List<byte[]>> c10 = c(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("fallback")) {
                    arrayList2.add(d(xmlPullParser, resources, string, string2, c10));
                } else {
                    h(xmlPullParser);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            return new C0451e(arrayList2, integer, integer2, string5);
        }
        if (string3 == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new v2.e(string, string2, string3, c10, null, null));
        if (string4 != null) {
            arrayList2.add(new v2.e(string, string2, string4, c10, null, null));
        }
        return new C0451e(arrayList2, integer, integer2, string5);
    }

    public static d g(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), j2.g.f21499q);
        int i10 = obtainAttributes.getInt(obtainAttributes.hasValue(j2.g.f21508z) ? j2.g.f21508z : j2.g.f21501s, 400);
        boolean z10 = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(j2.g.f21506x) ? j2.g.f21506x : j2.g.f21502t, 0);
        int i11 = obtainAttributes.hasValue(j2.g.A) ? j2.g.A : j2.g.f21503u;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(j2.g.f21507y) ? j2.g.f21507y : j2.g.f21504v);
        int i12 = obtainAttributes.getInt(i11, 0);
        int i13 = obtainAttributes.hasValue(j2.g.f21505w) ? j2.g.f21505w : j2.g.f21500r;
        int resourceId = obtainAttributes.getResourceId(i13, 0);
        String string2 = obtainAttributes.getString(i13);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            h(xmlPullParser);
        }
        return new d(string2, i10, z10, string, i12, resourceId);
    }

    public static void h(XmlPullParser xmlPullParser) {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static List<byte[]> i(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}

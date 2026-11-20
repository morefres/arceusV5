package g2;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f18093a;
    public androidx.constraintlayout.widget.c b;

    /* renamed from: c, reason: collision with root package name */
    public int f18094c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f18095d = -1;

    /* renamed from: e, reason: collision with root package name */
    public SparseArray<C0322a> f18096e = new SparseArray<>();

    /* renamed from: f, reason: collision with root package name */
    public SparseArray<androidx.constraintlayout.widget.c> f18097f = new SparseArray<>();

    /* renamed from: g2.a$a, reason: collision with other inner class name */
    public static class C0322a {

        /* renamed from: a, reason: collision with root package name */
        public int f18098a;
        public ArrayList<b> b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        public int f18099c;

        /* renamed from: d, reason: collision with root package name */
        public androidx.constraintlayout.widget.c f18100d;

        public C0322a(Context context, XmlPullParser xmlPullParser) {
            this.f18099c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), d.P6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == d.Q6) {
                    this.f18098a = obtainStyledAttributes.getResourceId(index, this.f18098a);
                } else if (index == d.R6) {
                    this.f18099c = obtainStyledAttributes.getResourceId(index, this.f18099c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f18099c);
                    context.getResources().getResourceName(this.f18099c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.f18100d = cVar;
                        cVar.e(context, this.f18099c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void a(b bVar) {
            this.b.add(bVar);
        }

        public int b(float f10, float f11) {
            for (int i10 = 0; i10 < this.b.size(); i10++) {
                if (this.b.get(i10).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public float f18101a;
        public float b;

        /* renamed from: c, reason: collision with root package name */
        public float f18102c;

        /* renamed from: d, reason: collision with root package name */
        public float f18103d;

        /* renamed from: e, reason: collision with root package name */
        public int f18104e;

        /* renamed from: f, reason: collision with root package name */
        public androidx.constraintlayout.widget.c f18105f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f18101a = Float.NaN;
            this.b = Float.NaN;
            this.f18102c = Float.NaN;
            this.f18103d = Float.NaN;
            this.f18104e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), d.f18185i7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == d.f18194j7) {
                    this.f18104e = obtainStyledAttributes.getResourceId(index, this.f18104e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f18104e);
                    context.getResources().getResourceName(this.f18104e);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.f18105f = cVar;
                        cVar.e(context, this.f18104e);
                    }
                } else if (index == d.f18203k7) {
                    this.f18103d = obtainStyledAttributes.getDimension(index, this.f18103d);
                } else if (index == d.f18212l7) {
                    this.b = obtainStyledAttributes.getDimension(index, this.b);
                } else if (index == d.f18221m7) {
                    this.f18102c = obtainStyledAttributes.getDimension(index, this.f18102c);
                } else if (index == d.f18230n7) {
                    this.f18101a = obtainStyledAttributes.getDimension(index, this.f18101a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        public boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f18101a) && f10 < this.f18101a) {
                return false;
            }
            if (!Float.isNaN(this.b) && f11 < this.b) {
                return false;
            }
            if (Float.isNaN(this.f18102c) || f10 <= this.f18102c) {
                return Float.isNaN(this.f18103d) || f11 <= this.f18103d;
            }
            return false;
        }
    }

    public a(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f18093a = constraintLayout;
        a(context, i10);
    }

    public final void a(Context context, int i10) {
        String str;
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            C0322a c0322a = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                b(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                C0322a c0322a2 = new C0322a(context, xml);
                                this.f18096e.put(c0322a2.f18098a, c0322a2);
                                c0322a = c0322a2;
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b bVar = new b(context, xml);
                                if (c0322a != null) {
                                    c0322a.a(bVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (IOException e10) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i10, e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i10, e11);
        }
    }

    public final void b(Context context, XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                cVar.u(context, xmlPullParser);
                this.f18097f.put(identifier, cVar);
                return;
            }
        }
    }

    public void c(g2.b bVar) {
    }

    public void d(int i10, float f10, float f11) {
        int b10;
        int i11 = this.f18094c;
        if (i11 == i10) {
            C0322a valueAt = i10 == -1 ? this.f18096e.valueAt(0) : this.f18096e.get(i11);
            int i12 = this.f18095d;
            if ((i12 == -1 || !valueAt.b.get(i12).a(f10, f11)) && this.f18095d != (b10 = valueAt.b(f10, f11))) {
                androidx.constraintlayout.widget.c cVar = b10 == -1 ? this.b : valueAt.b.get(b10).f18105f;
                if (b10 != -1) {
                    int i13 = valueAt.b.get(b10).f18104e;
                }
                if (cVar == null) {
                    return;
                }
                this.f18095d = b10;
                cVar.c(this.f18093a);
                return;
            }
            return;
        }
        this.f18094c = i10;
        C0322a c0322a = this.f18096e.get(i10);
        int b11 = c0322a.b(f10, f11);
        androidx.constraintlayout.widget.c cVar2 = b11 == -1 ? c0322a.f18100d : c0322a.b.get(b11).f18105f;
        if (b11 != -1) {
            int i14 = c0322a.b.get(b11).f18104e;
        }
        if (cVar2 != null) {
            this.f18095d = b11;
            cVar2.c(this.f18093a);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =" + f10 + ", " + f11);
    }
}

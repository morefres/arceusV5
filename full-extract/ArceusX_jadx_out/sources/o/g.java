package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.q;
import i.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
import q.a1;
import q.k0;

/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class<?>[] f27471e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class<?>[] f27472f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f27473a;
    public final Object[] b;

    /* renamed from: c, reason: collision with root package name */
    public Context f27474c;

    /* renamed from: d, reason: collision with root package name */
    public Object f27475d;

    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        public static final Class<?>[] f27476c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        public Object f27477a;
        public Method b;

        public a(Object obj, String str) {
            this.f27477a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.b = cls.getMethod(str, f27476c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.b.invoke(this.f27477a, menuItem)).booleanValue();
                }
                this.b.invoke(this.f27477a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public class b {
        public androidx.core.view.b A;
        public CharSequence B;
        public CharSequence C;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;

        /* renamed from: a, reason: collision with root package name */
        public Menu f27478a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public int f27479c;

        /* renamed from: d, reason: collision with root package name */
        public int f27480d;

        /* renamed from: e, reason: collision with root package name */
        public int f27481e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f27482f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f27483g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f27484h;

        /* renamed from: i, reason: collision with root package name */
        public int f27485i;

        /* renamed from: j, reason: collision with root package name */
        public int f27486j;

        /* renamed from: k, reason: collision with root package name */
        public CharSequence f27487k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f27488l;

        /* renamed from: m, reason: collision with root package name */
        public int f27489m;

        /* renamed from: n, reason: collision with root package name */
        public char f27490n;

        /* renamed from: o, reason: collision with root package name */
        public int f27491o;

        /* renamed from: p, reason: collision with root package name */
        public char f27492p;

        /* renamed from: q, reason: collision with root package name */
        public int f27493q;

        /* renamed from: r, reason: collision with root package name */
        public int f27494r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f27495s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f27496t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f27497u;

        /* renamed from: v, reason: collision with root package name */
        public int f27498v;

        /* renamed from: w, reason: collision with root package name */
        public int f27499w;

        /* renamed from: x, reason: collision with root package name */
        public String f27500x;

        /* renamed from: y, reason: collision with root package name */
        public String f27501y;

        /* renamed from: z, reason: collision with root package name */
        public String f27502z;

        public b(Menu menu) {
            this.f27478a = menu;
            h();
        }

        public void a() {
            this.f27484h = true;
            i(this.f27478a.add(this.b, this.f27485i, this.f27486j, this.f27487k));
        }

        public SubMenu b() {
            this.f27484h = true;
            SubMenu addSubMenu = this.f27478a.addSubMenu(this.b, this.f27485i, this.f27486j, this.f27487k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public final char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public boolean d() {
            return this.f27484h;
        }

        public final <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f27474c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f27474c.obtainStyledAttributes(attributeSet, j.f20011q1);
            this.b = obtainStyledAttributes.getResourceId(j.f20021s1, 0);
            this.f27479c = obtainStyledAttributes.getInt(j.f20031u1, 0);
            this.f27480d = obtainStyledAttributes.getInt(j.f20036v1, 0);
            this.f27481e = obtainStyledAttributes.getInt(j.f20041w1, 0);
            this.f27482f = obtainStyledAttributes.getBoolean(j.f20026t1, true);
            this.f27483g = obtainStyledAttributes.getBoolean(j.f20016r1, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            a1 u8 = a1.u(g.this.f27474c, attributeSet, j.f20046x1);
            this.f27485i = u8.n(j.A1, 0);
            this.f27486j = (u8.k(j.D1, this.f27479c) & SupportMenu.CATEGORY_MASK) | (u8.k(j.E1, this.f27480d) & 65535);
            this.f27487k = u8.p(j.F1);
            this.f27488l = u8.p(j.G1);
            this.f27489m = u8.n(j.f20051y1, 0);
            this.f27490n = c(u8.o(j.H1));
            this.f27491o = u8.k(j.O1, 4096);
            this.f27492p = c(u8.o(j.I1));
            this.f27493q = u8.k(j.S1, 4096);
            if (u8.s(j.J1)) {
                this.f27494r = u8.a(j.J1, false) ? 1 : 0;
            } else {
                this.f27494r = this.f27481e;
            }
            this.f27495s = u8.a(j.B1, false);
            this.f27496t = u8.a(j.C1, this.f27482f);
            this.f27497u = u8.a(j.f20056z1, this.f27483g);
            this.f27498v = u8.k(j.T1, -1);
            this.f27502z = u8.o(j.K1);
            this.f27499w = u8.n(j.L1, 0);
            this.f27500x = u8.o(j.N1);
            String o8 = u8.o(j.M1);
            this.f27501y = o8;
            boolean z10 = o8 != null;
            if (z10 && this.f27499w == 0 && this.f27500x == null) {
                this.A = (androidx.core.view.b) e(o8, g.f27472f, g.this.b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = u8.p(j.P1);
            this.C = u8.p(j.U1);
            if (u8.s(j.R1)) {
                this.E = k0.e(u8.k(j.R1, -1), this.E);
            } else {
                this.E = null;
            }
            if (u8.s(j.Q1)) {
                this.D = u8.c(j.Q1);
            } else {
                this.D = null;
            }
            u8.x();
            this.f27484h = false;
        }

        public void h() {
            this.b = 0;
            this.f27479c = 0;
            this.f27480d = 0;
            this.f27481e = 0;
            this.f27482f = true;
            this.f27483g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f27495s).setVisible(this.f27496t).setEnabled(this.f27497u).setCheckable(this.f27494r >= 1).setTitleCondensed(this.f27488l).setIcon(this.f27489m);
            int i10 = this.f27498v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f27502z != null) {
                if (g.this.f27474c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f27502z));
            }
            if (this.f27494r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof p.c) {
                    ((p.c) menuItem).h(true);
                }
            }
            String str = this.f27500x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f27471e, g.this.f27473a));
                z10 = true;
            }
            int i11 = this.f27499w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                q.a(menuItem, bVar);
            }
            q.c(menuItem, this.B);
            q.g(menuItem, this.C);
            q.b(menuItem, this.f27490n, this.f27491o);
            q.f(menuItem, this.f27492p, this.f27493q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                q.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                q.d(menuItem, colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f27471e = clsArr;
        f27472f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f27474c = context;
        Object[] objArr = {context};
        this.f27473a = objArr;
        this.b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.f27475d == null) {
            this.f27475d = a(this.f27474c);
        }
        return this.f27475d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r15 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r15 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r15.equals(r8) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r15.equals("group") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0.d() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r15 = r0.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r15 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r15.a() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r15.equals("menu") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        if (r7 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (r15.equals("group") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        r0.f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        if (r15.equals("item") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        r0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        if (r15.equals("menu") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00af, code lost:
    
        c(r13, r14, r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b7, code lost:
    
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        r6 = false;
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r6 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (r15 == 1) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
        /*
            r12 = this;
            o.g$b r0 = new o.g$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r6
            r8 = r5
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r7 = r4
            r8 = r5
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.h()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.d()
            if (r15 != 0) goto Lb9
            androidx.core.view.b r15 = r0.A
            if (r15 == 0) goto L82
            boolean r15 = r15.a()
            if (r15 == 0) goto L82
            r0.b()
            goto Lb9
        L82:
            r0.a()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = r3
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.f(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.g(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.b()
            r12.c(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = r3
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.g.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof r2.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z10 = false;
        try {
            try {
                xmlResourceParser = this.f27474c.getResources().getLayout(i10);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof androidx.appcompat.view.menu.e) {
                    androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) menu;
                    if (eVar.F()) {
                        eVar.e0();
                        z10 = true;
                    }
                }
                c(xmlResourceParser, asAttributeSet, menu);
                if (z10) {
                    ((androidx.appcompat.view.menu.e) menu).d0();
                }
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th2) {
            if (z10) {
                ((androidx.appcompat.view.menu.e) menu).d0();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th2;
        }
    }
}

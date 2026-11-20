package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final f f1656a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final c f1657a;

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f1657a = new b(clipData, i10);
            } else {
                this.f1657a = new C0025d(clipData, i10);
            }
        }

        public d a() {
            return this.f1657a.build();
        }

        public a b(Bundle bundle) {
            this.f1657a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f1657a.b(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f1657a.a(uri);
            return this;
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final ContentInfo.Builder f1658a;

        public b(ClipData clipData, int i10) {
            this.f1658a = androidx.core.view.e.a(clipData, i10);
        }

        @Override // androidx.core.view.d.c
        public void a(Uri uri) {
            this.f1658a.setLinkUri(uri);
        }

        @Override // androidx.core.view.d.c
        public void b(int i10) {
            this.f1658a.setFlags(i10);
        }

        @Override // androidx.core.view.d.c
        public d build() {
            return new d(new e(this.f1658a.build()));
        }

        @Override // androidx.core.view.d.c
        public void setExtras(Bundle bundle) {
            this.f1658a.setExtras(bundle);
        }
    }

    public interface c {
        void a(Uri uri);

        void b(int i10);

        d build();

        void setExtras(Bundle bundle);
    }

    /* renamed from: androidx.core.view.d$d, reason: collision with other inner class name */
    public static final class C0025d implements c {

        /* renamed from: a, reason: collision with root package name */
        public ClipData f1659a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public int f1660c;

        /* renamed from: d, reason: collision with root package name */
        public Uri f1661d;

        /* renamed from: e, reason: collision with root package name */
        public Bundle f1662e;

        public C0025d(ClipData clipData, int i10) {
            this.f1659a = clipData;
            this.b = i10;
        }

        @Override // androidx.core.view.d.c
        public void a(Uri uri) {
            this.f1661d = uri;
        }

        @Override // androidx.core.view.d.c
        public void b(int i10) {
            this.f1660c = i10;
        }

        @Override // androidx.core.view.d.c
        public d build() {
            return new d(new g(this));
        }

        @Override // androidx.core.view.d.c
        public void setExtras(Bundle bundle) {
            this.f1662e = bundle;
        }
    }

    public static final class e implements f {

        /* renamed from: a, reason: collision with root package name */
        public final ContentInfo f1663a;

        public e(ContentInfo contentInfo) {
            this.f1663a = androidx.core.view.c.a(x2.g.g(contentInfo));
        }

        @Override // androidx.core.view.d.f
        public ContentInfo a() {
            return this.f1663a;
        }

        @Override // androidx.core.view.d.f
        public ClipData b() {
            return this.f1663a.getClip();
        }

        @Override // androidx.core.view.d.f
        public int c() {
            return this.f1663a.getFlags();
        }

        @Override // androidx.core.view.d.f
        public int getSource() {
            return this.f1663a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f1663a + "}";
        }
    }

    public interface f {
        ContentInfo a();

        ClipData b();

        int c();

        int getSource();
    }

    public static final class g implements f {

        /* renamed from: a, reason: collision with root package name */
        public final ClipData f1664a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1665c;

        /* renamed from: d, reason: collision with root package name */
        public final Uri f1666d;

        /* renamed from: e, reason: collision with root package name */
        public final Bundle f1667e;

        public g(C0025d c0025d) {
            this.f1664a = (ClipData) x2.g.g(c0025d.f1659a);
            this.b = x2.g.c(c0025d.b, 0, 5, Payload.SOURCE);
            this.f1665c = x2.g.f(c0025d.f1660c, 1);
            this.f1666d = c0025d.f1661d;
            this.f1667e = c0025d.f1662e;
        }

        @Override // androidx.core.view.d.f
        public ContentInfo a() {
            return null;
        }

        @Override // androidx.core.view.d.f
        public ClipData b() {
            return this.f1664a;
        }

        @Override // androidx.core.view.d.f
        public int c() {
            return this.f1665c;
        }

        @Override // androidx.core.view.d.f
        public int getSource() {
            return this.b;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f1664a.getDescription());
            sb2.append(", source=");
            sb2.append(d.e(this.b));
            sb2.append(", flags=");
            sb2.append(d.a(this.f1665c));
            if (this.f1666d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f1666d.toString().length() + ")";
            }
            sb2.append(str);
            sb2.append(this.f1667e != null ? ", hasExtras" : "");
            sb2.append("}");
            return sb2.toString();
        }
    }

    public d(f fVar) {
        this.f1656a = fVar;
    }

    public static String a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    public static String e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static d g(ContentInfo contentInfo) {
        return new d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f1656a.b();
    }

    public int c() {
        return this.f1656a.c();
    }

    public int d() {
        return this.f1656a.getSource();
    }

    public ContentInfo f() {
        ContentInfo a10 = this.f1656a.a();
        Objects.requireNonNull(a10);
        androidx.core.view.c.a(a10);
        return a10;
    }

    public String toString() {
        return this.f1656a.toString();
    }
}

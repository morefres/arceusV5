package k2;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f22320a;
    public final CharSequence b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence[] f22321c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f22322d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22323e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f22324f;

    /* renamed from: g, reason: collision with root package name */
    public final Set<String> f22325g;

    public static class a {
        public static RemoteInput a(t tVar) {
            RemoteInput.Builder addExtras = new RemoteInput.Builder(tVar.i()).setLabel(tVar.h()).setChoices(tVar.e()).setAllowFreeFormInput(tVar.c()).addExtras(tVar.g());
            Set<String> d10 = tVar.d();
            if (d10 != null) {
                Iterator<String> it = d10.iterator();
                while (it.hasNext()) {
                    b.a(addExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.a(addExtras, tVar.f());
            }
            return addExtras.build();
        }

        public static Bundle b(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    public static class b {
        public static RemoteInput.Builder a(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    public static class c {
        public static RemoteInput.Builder a(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f22326a;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f22328d;

        /* renamed from: e, reason: collision with root package name */
        public CharSequence[] f22329e;
        public final Set<String> b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        public final Bundle f22327c = new Bundle();

        /* renamed from: f, reason: collision with root package name */
        public boolean f22330f = true;

        /* renamed from: g, reason: collision with root package name */
        public int f22331g = 0;

        public d(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f22326a = str;
        }

        public t a() {
            return new t(this.f22326a, this.f22328d, this.f22329e, this.f22330f, this.f22331g, this.f22327c, this.b);
        }

        public d b(CharSequence charSequence) {
            this.f22328d = charSequence;
            return this;
        }
    }

    public t(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, Set<String> set) {
        this.f22320a = str;
        this.b = charSequence;
        this.f22321c = charSequenceArr;
        this.f22322d = z10;
        this.f22323e = i10;
        this.f22324f = bundle;
        this.f22325g = set;
        if (f() == 2 && !c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static RemoteInput a(t tVar) {
        return a.a(tVar);
    }

    public static RemoteInput[] b(t[] tVarArr) {
        if (tVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[tVarArr.length];
        for (int i10 = 0; i10 < tVarArr.length; i10++) {
            remoteInputArr[i10] = a(tVarArr[i10]);
        }
        return remoteInputArr;
    }

    public static Bundle j(Intent intent) {
        return a.b(intent);
    }

    public boolean c() {
        return this.f22322d;
    }

    public Set<String> d() {
        return this.f22325g;
    }

    public CharSequence[] e() {
        return this.f22321c;
    }

    public int f() {
        return this.f22323e;
    }

    public Bundle g() {
        return this.f22324f;
    }

    public CharSequence h() {
        return this.b;
    }

    public String i() {
        return this.f22320a;
    }

    public boolean k() {
        if (c()) {
            return false;
        }
        return ((e() != null && e().length != 0) || d() == null || d().isEmpty()) ? false : true;
    }
}

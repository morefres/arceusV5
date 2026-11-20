package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.annotation.NonNull;
import androidx.emoji2.text.c;
import androidx.emoji2.text.f;
import java.util.Arrays;
import java.util.Set;
import z3.i;
import z3.k;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final c.j f2250a;

    @NonNull
    public final f b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public c.e f2251c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2252d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f2253e;

    public static final class a {
        public static int a(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 < 0) {
                        return z10 ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i11--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i11--;
                    } else {
                        if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        z10 = true;
                    }
                }
                return i10;
            }
        }

        public static int b(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    if (i10 >= length) {
                        if (z10) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i11--;
                        i10++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i11--;
                        i10++;
                    } else {
                        if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i10++;
                        z10 = true;
                    }
                }
                return i10;
            }
        }
    }

    public static class b implements c<k> {

        /* renamed from: a, reason: collision with root package name */
        public k f2254a;
        public final c.j b;

        public b(k kVar, c.j jVar) {
            this.f2254a = kVar;
            this.b = jVar;
        }

        @Override // androidx.emoji2.text.d.c
        public boolean a(@NonNull CharSequence charSequence, int i10, int i11, i iVar) {
            if (iVar.k()) {
                return true;
            }
            if (this.f2254a == null) {
                this.f2254a = new k(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f2254a.setSpan(this.b.a(iVar), i10, i11, 33);
            return true;
        }

        @Override // androidx.emoji2.text.d.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public k b() {
            return this.f2254a;
        }
    }

    public interface c<T> {
        boolean a(@NonNull CharSequence charSequence, int i10, int i11, i iVar);

        T b();
    }

    /* renamed from: androidx.emoji2.text.d$d, reason: collision with other inner class name */
    public static class C0034d implements c<C0034d> {

        /* renamed from: a, reason: collision with root package name */
        public final String f2255a;

        public C0034d(String str) {
            this.f2255a = str;
        }

        @Override // androidx.emoji2.text.d.c
        public boolean a(@NonNull CharSequence charSequence, int i10, int i11, i iVar) {
            if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f2255a)) {
                return true;
            }
            iVar.l(true);
            return false;
        }

        @Override // androidx.emoji2.text.d.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C0034d b() {
            return this;
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public int f2256a = 1;
        public final f.a b;

        /* renamed from: c, reason: collision with root package name */
        public f.a f2257c;

        /* renamed from: d, reason: collision with root package name */
        public f.a f2258d;

        /* renamed from: e, reason: collision with root package name */
        public int f2259e;

        /* renamed from: f, reason: collision with root package name */
        public int f2260f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f2261g;

        /* renamed from: h, reason: collision with root package name */
        public final int[] f2262h;

        public e(f.a aVar, boolean z10, int[] iArr) {
            this.b = aVar;
            this.f2257c = aVar;
            this.f2261g = z10;
            this.f2262h = iArr;
        }

        public static boolean d(int i10) {
            return i10 == 65039;
        }

        public static boolean f(int i10) {
            return i10 == 65038;
        }

        public int a(int i10) {
            f.a a10 = this.f2257c.a(i10);
            int i11 = 2;
            if (this.f2256a != 2) {
                if (a10 == null) {
                    i11 = g();
                } else {
                    this.f2256a = 2;
                    this.f2257c = a10;
                    this.f2260f = 1;
                }
            } else if (a10 != null) {
                this.f2257c = a10;
                this.f2260f++;
            } else if (f(i10)) {
                i11 = g();
            } else if (!d(i10)) {
                if (this.f2257c.b() != null) {
                    i11 = 3;
                    if (this.f2260f != 1) {
                        this.f2258d = this.f2257c;
                        g();
                    } else if (h()) {
                        this.f2258d = this.f2257c;
                        g();
                    } else {
                        i11 = g();
                    }
                } else {
                    i11 = g();
                }
            }
            this.f2259e = i10;
            return i11;
        }

        public i b() {
            return this.f2257c.b();
        }

        public i c() {
            return this.f2258d.b();
        }

        public boolean e() {
            if (this.f2256a != 2 || this.f2257c.b() == null) {
                return false;
            }
            return this.f2260f > 1 || h();
        }

        public final int g() {
            this.f2256a = 1;
            this.f2257c = this.b;
            this.f2260f = 0;
            return 1;
        }

        public final boolean h() {
            if (this.f2257c.b().j() || d(this.f2259e)) {
                return true;
            }
            if (this.f2261g) {
                if (this.f2262h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f2262h, this.f2257c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public d(@NonNull f fVar, @NonNull c.j jVar, @NonNull c.e eVar, boolean z10, int[] iArr, @NonNull Set<int[]> set) {
        this.f2250a = jVar;
        this.b = fVar;
        this.f2251c = eVar;
        this.f2252d = z10;
        this.f2253e = iArr;
        g(set);
    }

    public static boolean a(@NonNull Editable editable, @NonNull KeyEvent keyEvent, boolean z10) {
        z3.e[] eVarArr;
        if (f(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!e(selectionStart, selectionEnd) && (eVarArr = (z3.e[]) editable.getSpans(selectionStart, selectionEnd, z3.e.class)) != null && eVarArr.length > 0) {
            for (z3.e eVar : eVarArr) {
                int spanStart = editable.getSpanStart(eVar);
                int spanEnd = editable.getSpanEnd(eVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(@NonNull InputConnection inputConnection, @NonNull Editable editable, int i10, int i11, boolean z10) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (e(selectionStart, selectionEnd)) {
                return false;
            }
            if (z10) {
                max = a.a(editable, selectionStart, Math.max(i10, 0));
                min = a.b(editable, selectionEnd, Math.max(i11, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i10, 0);
                min = Math.min(selectionEnd + i11, editable.length());
            }
            z3.e[] eVarArr = (z3.e[]) editable.getSpans(max, min, z3.e.class);
            if (eVarArr != null && eVarArr.length > 0) {
                for (z3.e eVar : eVarArr) {
                    int spanStart = editable.getSpanStart(eVar);
                    int spanEnd = editable.getSpanEnd(eVar);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public static boolean c(@NonNull Editable editable, int i10, @NonNull KeyEvent keyEvent) {
        if (!(i10 != 67 ? i10 != 112 ? false : a(editable, keyEvent, true) : a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    public static boolean e(int i10, int i11) {
        return i10 == -1 || i11 == -1 || i10 != i11;
    }

    public static boolean f(@NonNull KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    public final boolean d(CharSequence charSequence, int i10, int i11, i iVar) {
        if (iVar.d() == 0) {
            iVar.m(this.f2251c.a(charSequence, i10, i11, iVar.h()));
        }
        return iVar.d() == 2;
    }

    public final void g(@NonNull Set<int[]> set) {
        if (set.isEmpty()) {
            return;
        }
        for (int[] iArr : set) {
            String str = new String(iArr, 0, iArr.length);
            i(str, 0, str.length(), 1, true, new C0034d(str));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:64:0x000e, B:67:0x0013, B:69:0x0017, B:71:0x0024, B:10:0x003c, B:12:0x0044, B:14:0x0047, B:16:0x004b, B:18:0x0057, B:19:0x005a, B:29:0x0078), top: B:63:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.CharSequence h(@androidx.annotation.NonNull java.lang.CharSequence r11, int r12, int r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.d.h(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }

    public final <T> T i(@NonNull CharSequence charSequence, int i10, int i11, int i12, boolean z10, c<T> cVar) {
        int i13;
        e eVar = new e(this.b.f(), this.f2252d, this.f2253e);
        int i14 = 0;
        boolean z11 = true;
        int codePointAt = Character.codePointAt(charSequence, i10);
        loop0: while (true) {
            i13 = i10;
            while (i10 < i11 && i14 < i12 && z11) {
                int a10 = eVar.a(codePointAt);
                if (a10 == 1) {
                    i13 += Character.charCount(Character.codePointAt(charSequence, i13));
                    if (i13 < i11) {
                        codePointAt = Character.codePointAt(charSequence, i13);
                    }
                    i10 = i13;
                } else if (a10 == 2) {
                    i10 += Character.charCount(codePointAt);
                    if (i10 < i11) {
                        codePointAt = Character.codePointAt(charSequence, i10);
                    }
                } else if (a10 == 3) {
                    if (z10 || !d(charSequence, i13, i10, eVar.c())) {
                        z11 = cVar.a(charSequence, i13, i10, eVar.c());
                        i14++;
                    }
                }
            }
        }
        if (eVar.e() && i14 < i12 && z11 && (z10 || !d(charSequence, i13, i10, eVar.b()))) {
            cVar.a(charSequence, i13, i10, eVar.b());
        }
        return cVar.b();
    }
}

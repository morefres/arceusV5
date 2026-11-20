package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import u2.o;
import z3.g;
import z3.i;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a4.b f2273a;

    @NonNull
    public final char[] b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final a f2274c = new a(1024);

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final Typeface f2275d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray<a> f2276a;
        public i b;

        public a() {
            this(1);
        }

        public a a(int i10) {
            SparseArray<a> sparseArray = this.f2276a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i10);
        }

        public final i b() {
            return this.b;
        }

        public void c(@NonNull i iVar, int i10, int i11) {
            a a10 = a(iVar.b(i10));
            if (a10 == null) {
                a10 = new a();
                this.f2276a.put(iVar.b(i10), a10);
            }
            if (i11 > i10) {
                a10.c(iVar, i10 + 1, i11);
            } else {
                a10.b = iVar;
            }
        }

        public a(int i10) {
            this.f2276a = new SparseArray<>(i10);
        }
    }

    public f(@NonNull Typeface typeface, @NonNull a4.b bVar) {
        this.f2275d = typeface;
        this.f2273a = bVar;
        this.b = new char[bVar.k() * 2];
        a(bVar);
    }

    @NonNull
    public static f b(@NonNull Typeface typeface, @NonNull ByteBuffer byteBuffer) {
        try {
            o.a("EmojiCompat.MetadataRepo.create");
            return new f(typeface, g.b(byteBuffer));
        } finally {
            o.b();
        }
    }

    public final void a(a4.b bVar) {
        int k10 = bVar.k();
        for (int i10 = 0; i10 < k10; i10++) {
            i iVar = new i(this, i10);
            Character.toChars(iVar.f(), this.b, i10 * 2);
            h(iVar);
        }
    }

    @NonNull
    public char[] c() {
        return this.b;
    }

    @NonNull
    public a4.b d() {
        return this.f2273a;
    }

    public int e() {
        return this.f2273a.l();
    }

    @NonNull
    public a f() {
        return this.f2274c;
    }

    @NonNull
    public Typeface g() {
        return this.f2275d;
    }

    public void h(@NonNull i iVar) {
        x2.g.h(iVar, "emoji metadata cannot be null");
        x2.g.b(iVar.c() > 0, "invalid metadata codepoint length");
        this.f2274c.c(iVar, 0, iVar.c() - 1);
    }
}

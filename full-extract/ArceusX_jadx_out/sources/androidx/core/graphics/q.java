package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import n2.e;
import v2.g;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    public ConcurrentHashMap<Long, e.c> f1647a = new ConcurrentHashMap<>();

    public class a implements b<g.b> {
        public a() {
        }

        @Override // androidx.core.graphics.q.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(g.b bVar) {
            return bVar.g();
        }

        @Override // androidx.core.graphics.q.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(g.b bVar) {
            return bVar.h();
        }
    }

    public interface b<T> {
        boolean a(T t8);

        int b(T t8);
    }

    public static <T> T e(T[] tArr, int i10, b<T> bVar) {
        return (T) f(tArr, (i10 & 1) == 0 ? 400 : 700, (i10 & 2) != 0, bVar);
    }

    public static <T> T f(T[] tArr, int i10, boolean z10, b<T> bVar) {
        T t8 = null;
        int i11 = Integer.MAX_VALUE;
        for (T t10 : tArr) {
            int abs = (Math.abs(bVar.b(t10) - i10) * 2) + (bVar.a(t10) == z10 ? 0 : 1);
            if (t8 == null || i11 > abs) {
                t8 = t10;
                i11 = abs;
            }
        }
        return t8;
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i10) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        throw null;
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, List<g.b[]> list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        File d10 = r.d(context);
        if (d10 == null) {
            return null;
        }
        try {
            if (r.b(d10, resources, i10)) {
                return Typeface.createFromFile(d10.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d10.delete();
        }
    }

    public g.b g(g.b[] bVarArr, int i10) {
        return (g.b) e(bVarArr, i10, new a());
    }
}

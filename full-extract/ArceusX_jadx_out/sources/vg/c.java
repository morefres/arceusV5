package vg;

import android.content.Context;
import bk.d;
import rg.j0;

/* loaded from: classes2.dex */
public class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f33421a;
    public final int b;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33422a;

        static {
            int[] iArr = new int[ml.a.values().length];
            f33422a = iArr;
            try {
                iArr[ml.a.f24590c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33422a[ml.a.f24591d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33422a[ml.a.f24592e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public c(Context context) {
        this.f33421a = context.getResources().getColor(j0.f30316n);
        this.b = context.getResources().getColor(j0.f30311i);
    }

    @Override // bk.d
    public int a(ml.a aVar) {
        int i10 = a.f33422a[aVar.ordinal()];
        if (i10 == 1) {
            return this.f33421a;
        }
        if (i10 != 2) {
            return -1;
        }
        return this.b;
    }
}

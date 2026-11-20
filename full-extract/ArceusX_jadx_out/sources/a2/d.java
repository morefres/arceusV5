package a2;

import java.text.DecimalFormat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public String f81a;
    public int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public String f82c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f83d = 0;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<a> f84e = new ArrayList<>();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f85a;
        public float b;
    }

    public String toString() {
        String str = this.f81a;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        ArrayList<a> arrayList = this.f84e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            a aVar = arrayList.get(i10);
            i10++;
            str = str + "[" + aVar.f85a + " , " + decimalFormat.format(r5.b) + "] ";
        }
        return str;
    }
}

package oi;

import ek.t;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: c, reason: collision with root package name */
    public static ArrayList<f> f27878c;

    /* renamed from: d, reason: collision with root package name */
    public static f f27879d = new f("en_us", "en");

    /* renamed from: e, reason: collision with root package name */
    public static f f27880e = new f("es_es", "es");

    /* renamed from: f, reason: collision with root package name */
    public static f f27881f = new f("fr_fr", "fr");

    /* renamed from: g, reason: collision with root package name */
    public static f f27882g = new f("it_it", "it");

    /* renamed from: a, reason: collision with root package name */
    public String f27883a;
    public String b;

    static {
        ArrayList<f> arrayList = new ArrayList<>();
        f27878c = arrayList;
        arrayList.add(f27879d);
        f27878c.add(f27880e);
        f27878c.add(f27881f);
        f27878c.add(f27882g);
        f27878c.add(new f("de_de", "de"));
        f27878c.add(new f("id_id", "id"));
        f27878c.add(new f("ja_jp", "ja"));
        f27878c.add(new f("ko_kr", "ko"));
        f27878c.add(new f("pt_br", "pt"));
        f27878c.add(new f("ru_ru", "ru"));
        f27878c.add(new f("th_th", "th"));
        f27878c.add(new f("tr_tr", "tr"));
        f27878c.add(new f("vi_vn", "vi"));
        f27878c.add(new f("zh_tw", "zh_TW"));
        if (t.j()) {
            f27878c.add(new f("zh_cjv", "zh_CN"));
        } else {
            f27878c.add(new f("zh_cn", "zh_CN"));
        }
    }

    public f(String str, String str2) {
        this.f27883a = str;
        this.b = str2;
    }

    public static f a(String str) {
        ArrayList<f> arrayList = f27878c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            f fVar = arrayList.get(i10);
            i10++;
            f fVar2 = fVar;
            if (fVar2.c().equals(str) || fVar2.c().equals(str.split("_")[0])) {
                return fVar2;
            }
        }
        return null;
    }

    public static f b(String str) {
        ArrayList<f> arrayList = f27878c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            f fVar = arrayList.get(i10);
            i10++;
            f fVar2 = fVar;
            if (fVar2.d().equals(str)) {
                return fVar2;
            }
        }
        return null;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.f27883a;
    }

    public String toString() {
        return "LocaleValue{'" + this.f27883a + "','" + this.b + "'}";
    }
}

package n1;

import g0.k0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import n0.a2;
import x2.g;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<Integer, Set<Integer>> f25681a;
    public static final Map<Integer, Set<Integer>> b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map<Integer, Integer> f25682c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map<Integer, Integer> f25683d;

    /* renamed from: e, reason: collision with root package name */
    public static final Map<String, Map<k0, Integer>> f25684e;

    static {
        HashMap hashMap = new HashMap();
        f25681a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        HashMap hashMap3 = new HashMap();
        f25682c = hashMap3;
        HashMap hashMap4 = new HashMap();
        f25683d = hashMap4;
        HashMap hashMap5 = new HashMap();
        f25684e = hashMap5;
        hashMap.put(8, new HashSet(Collections.singletonList(8)));
        hashMap.put(10, new HashSet(Collections.singletonList(10)));
        hashMap.put(0, new HashSet(Arrays.asList(8, 10)));
        hashMap2.put(0, new HashSet(Arrays.asList(0, 1, 2, 3, 4)));
        hashMap2.put(1, new HashSet(Collections.singletonList(0)));
        hashMap2.put(2, new HashSet(Arrays.asList(1, 2, 3, 4)));
        hashMap2.put(3, new HashSet(Collections.singletonList(1)));
        hashMap2.put(4, new HashSet(Collections.singletonList(2)));
        hashMap2.put(5, new HashSet(Collections.singletonList(3)));
        hashMap2.put(6, new HashSet(Collections.singletonList(4)));
        hashMap3.put(8, 8);
        hashMap3.put(10, 10);
        hashMap4.put(0, 1);
        hashMap4.put(1, 3);
        hashMap4.put(2, 4);
        hashMap4.put(3, 5);
        hashMap4.put(4, 6);
        HashMap hashMap6 = new HashMap();
        k0 k0Var = k0.f17922d;
        hashMap6.put(k0Var, 1);
        k0 k0Var2 = k0.f17924f;
        hashMap6.put(k0Var2, 2);
        k0 k0Var3 = k0.f17925g;
        hashMap6.put(k0Var3, 4096);
        k0 k0Var4 = k0.f17926h;
        hashMap6.put(k0Var4, 8192);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(k0Var, 1);
        hashMap7.put(k0Var2, 2);
        hashMap7.put(k0Var3, 4096);
        hashMap7.put(k0Var4, 8192);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(k0Var, 1);
        hashMap8.put(k0Var2, 4);
        hashMap8.put(k0Var3, 4096);
        hashMap8.put(k0Var4, 16384);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(k0.f17927i, 256);
        hashMap9.put(k0.f17928j, 512);
        hashMap5.put("video/hevc", hashMap6);
        hashMap5.put("video/av01", hashMap7);
        hashMap5.put("video/x-vnd.on2.vp9", hashMap8);
        hashMap5.put("video/dolby-vision", hashMap9);
    }

    public static int a(String str, k0 k0Var) {
        Integer num;
        Map<k0, Integer> map = f25684e.get(str);
        if (map == null || (num = map.get(k0Var)) == null) {
            return -1;
        }
        return num.intValue();
    }

    public static Set<Integer> b(k0 k0Var) {
        Set<Integer> set = f25681a.get(Integer.valueOf(k0Var.a()));
        return set == null ? Collections.EMPTY_SET : set;
    }

    public static Set<Integer> c(k0 k0Var) {
        Set<Integer> set = b.get(Integer.valueOf(k0Var.b()));
        return set == null ? Collections.EMPTY_SET : set;
    }

    public static boolean d(int i10, k0 k0Var) {
        Set<Integer> set = f25681a.get(Integer.valueOf(k0Var.a()));
        return set != null && set.contains(Integer.valueOf(i10));
    }

    public static boolean e(int i10, k0 k0Var) {
        Set<Integer> set = b.get(Integer.valueOf(k0Var.b()));
        return set != null && set.contains(Integer.valueOf(i10));
    }

    public static boolean f(a2.c cVar, k0 k0Var) {
        return d(cVar.b(), k0Var) && e(cVar.g(), k0Var);
    }

    public static int g(int i10) {
        Map<Integer, Integer> map = f25682c;
        g.a(map.containsKey(Integer.valueOf(i10)));
        Integer num = map.get(Integer.valueOf(i10));
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public static int h(int i10) {
        Map<Integer, Integer> map = f25683d;
        g.a(map.containsKey(Integer.valueOf(i10)));
        Integer num = map.get(Integer.valueOf(i10));
        Objects.requireNonNull(num);
        return num.intValue();
    }
}

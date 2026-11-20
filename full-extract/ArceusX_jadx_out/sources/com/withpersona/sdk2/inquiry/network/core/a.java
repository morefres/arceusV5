package com.withpersona.sdk2.inquiry.network.core;

import android.util.Base64;
import gt.s;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.collections.k0;
import kotlin.collections.o;
import kotlin.collections.p;
import kotlin.collections.q;
import kotlin.collections.r0;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c0;
import kotlin.text.x;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f12220a = new a();

    /* renamed from: com.withpersona.sdk2.inquiry.network.core.a$a, reason: collision with other inner class name */
    public static final class C0228a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f12221a;

        @NotNull
        public final String b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f12222c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f12223d;

        public C0228a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            this.f12221a = str;
            this.b = str2;
            this.f12222c = str3;
            this.f12223d = str4;
        }

        @NotNull
        public final String a() {
            return this.f12222c;
        }

        @NotNull
        public final String b() {
            return this.f12221a;
        }

        @NotNull
        public final String c() {
            return this.f12223d;
        }

        @NotNull
        public final String d() {
            return this.b;
        }
    }

    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            Pair pair = (Pair) t8;
            Pair pair2 = (Pair) t10;
            return kt.a.a(CollectionsKt.m0(p.n(pair.c(), pair.d()), null, null, null, 0, null, null, 63, null), CollectionsKt.m0(p.n(pair2.c(), pair2.d()), null, null, null, 0, null, null, 63, null));
        }
    }

    public static /* synthetic */ Request a(a aVar, Request request, lp.e eVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = System.currentTimeMillis();
        }
        return aVar.a(request, eVar, j10);
    }

    public final String b(RequestBody requestBody) {
        wu.e eVar = new wu.e();
        requestBody.writeTo(eVar);
        return StringsKt.p1(eVar.S2()).toString();
    }

    @NotNull
    public final JSONArray c(@NotNull RequestBody requestBody) {
        List<Pair<String, Object>> c10 = f12220a.c(a(requestBody));
        ArrayList arrayList = new ArrayList(q.u(c10, 10));
        Iterator<T> it = c10.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) pair.a();
            String obj = pair.b().toString();
            arrayList.add(new Regex("^[+-]?\\d+(\\.\\d+)?$").f(obj) ? s.a(str, c0.B1(obj, 10)) : s.a(str, new Regex("\\s").replace(obj, "")));
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            if (((String) ((Pair) obj2).b()).length() > 0) {
                arrayList2.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.c(j0.f(q.u(arrayList2, 10)), 16));
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            linkedHashMap.put((String) ((Pair) obj3).c(), obj3);
        }
        List<Pair> F0 = CollectionsKt.F0(linkedHashMap.values(), new b());
        JSONArray jSONArray = new JSONArray();
        for (Pair pair2 : F0) {
            String str2 = (String) pair2.a();
            String str3 = (String) pair2.b();
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(str2);
            jSONArray2.put(str3);
            jSONArray.put(jSONArray2);
        }
        return jSONArray;
    }

    @NotNull
    public final Request a(@NotNull Request request, @NotNull lp.e eVar, long j10) {
        C0228a a10 = a(j10, request, eVar);
        return a10 != null ? request.newBuilder().addHeader("NHMJLNRS", a10.d()).addHeader("STPBWSBB", a10.b()).addHeader("DNLGNZLZ", a10.a()).addHeader("TLJLGGDG", a10.c()).build() : request;
    }

    public final boolean b(List<String> list) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (x.T((String) it.next(), "filename=", false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    public final C0228a a(long j10, Request request, lp.e eVar) {
        String str = request.headers().get("Authorization");
        RequestBody body = request.body();
        if (str == null || body == null) {
            return null;
        }
        try {
            String str2 = request.headers().get("User-Agent");
            if (str2 != null && !StringsKt.p0(str2)) {
                Map n10 = k0.n(s.a("User-Agent", str2), s.a("VTDGJLGG", request.headers().get("VTDGJLGG")), s.a("Persona-Device-Vendor-Id", request.headers().get("Persona-Device-Vendor-Id")), s.a("Persona-Version", request.headers().get("Persona-Version")), s.a("BMRWJMTB", request.headers().get("BMRWJMTB")));
                n10.put("TLJLGGDG", CollectionsKt.m0(r0.j(n10.keySet(), "TLJLGGDG"), ", ", null, null, 0, null, null, 62, null));
                Set keySet = n10.keySet();
                Collection values = n10.values();
                String str3 = (String) CollectionsKt.p0(StringsKt.split$default(str, new String[]{" "}, false, 0, 6, null));
                if (str3 == null) {
                    eVar.a("Auth token is null.", null);
                    return null;
                }
                String optString = new JSONObject(new String(Base64.decode((String) StringsKt.split$default(str3, new String[]{"."}, false, 0, 6, null).get(1), 0), Charsets.UTF_8)).optString("sub");
                if (optString != null && !StringsKt.p0(optString)) {
                    String valueOf = String.valueOf(j10 / 1000);
                    return new C0228a(a(CollectionsKt.m0(p.n(optString, valueOf, x.N(c(body).toString(), "\\/", "/", false, 4, null)), ":", null, null, 0, null, null, 62, null)), valueOf, a(CollectionsKt.m0(p.n(CollectionsKt.m0(values, "", null, null, 0, null, null, 62, null), valueOf, x.N(c(body).toString(), "\\/", "/", false, 4, null)), ":", null, null, 0, null, null, 62, null)), CollectionsKt.m0(keySet, ", ", null, null, 0, null, null, 62, null));
                }
                eVar.a("Session token is null.", null);
                return null;
            }
            eVar.a("User agent is null.", null);
            return null;
        } catch (Exception e10) {
            eVar.a("An unexpected error occurred: " + e10.getMessage() + ".", null);
            return null;
        }
    }

    @NotNull
    public final List<Pair<String, Object>> c(@NotNull List<? extends Pair<String, ? extends Object>> list) {
        while (true) {
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z10 = false;
            for (Pair<String, ? extends Object> pair : list) {
                String a10 = pair.a();
                Object b10 = pair.b();
                List split$default = StringsKt.split$default(a10, new String[]{_UrlKt.PATH_SEGMENT_ENCODE_SET_URI}, false, 2, 2, null);
                if (split$default.size() == 1) {
                    arrayList.add(s.a(a10, b10));
                } else {
                    String str = (String) split$default.get(0);
                    String str2 = (String) split$default.get(1);
                    if (linkedHashMap.get(str) == null) {
                        linkedHashMap.put(str, 0);
                    }
                    if (!linkedHashSet.add(a10) && !StringsKt.a0(str2, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI, false, 2, null)) {
                        Object obj = linkedHashMap.get(str);
                        if (obj != null) {
                            linkedHashMap.put(str, Integer.valueOf(((Number) obj).intValue() + 1));
                            linkedHashSet.clear();
                            linkedHashSet.add(a10);
                        } else {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    arrayList.add(s.a(str + "[" + linkedHashMap.get(str) + "]" + str2, b10));
                    z10 = true;
                }
            }
            if (!z10) {
                return arrayList;
            }
            list = arrayList;
        }
    }

    public final String a(String str) {
        return kotlin.text.e.i(MessageDigest.getInstance("SHA-256").digest(str.getBytes(Charsets.UTF_8)), null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r0v17, types: [org.json.JSONObject] */
    public final List<Pair<String, Object>> a(RequestBody requestBody) {
        List<String> k10;
        List d10;
        String str;
        List split$default;
        String str2;
        MediaType mediaType = requestBody.getMediaType();
        if (mediaType == null) {
            return o.d(s.a("", b(requestBody)));
        }
        if (Intrinsics.c(mediaType.subtype(), "json")) {
            String b10 = b(requestBody);
            if (!Intrinsics.c(b10, "{}") && !Intrinsics.c(b10, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI)) {
                if (x.T(b10, "{", false, 2, null)) {
                    str2 = new JSONObject(b10);
                } else if (x.T(b10, "[", false, 2, null)) {
                    str2 = new JSONArray(b10);
                }
                b10 = str2;
            }
            if (b10 instanceof String) {
                return o.d(s.a("", b10));
            }
            return a((Object) b10);
        }
        if (Intrinsics.c(mediaType.type(), "multipart")) {
            List<MultipartBody.Part> parts = ((MultipartBody) requestBody).parts();
            ArrayList arrayList = new ArrayList();
            for (MultipartBody.Part part : parts) {
                Headers headers = part.headers();
                if (headers != null && (str = headers.get("Content-Disposition")) != null && (split$default = StringsKt.split$default(str, new String[]{";"}, false, 0, 6, null)) != null) {
                    k10 = new ArrayList<>(q.u(split$default, 10));
                    Iterator it = split$default.iterator();
                    while (it.hasNext()) {
                        k10.add(StringsKt.p1((String) it.next()).toString());
                    }
                } else {
                    k10 = p.k();
                }
                a aVar = f12220a;
                String a10 = aVar.a(k10);
                if (a10 != null) {
                    if (aVar.b(k10)) {
                        d10 = o.d(s.a(a10, Long.valueOf(part.body().contentLength())));
                    } else {
                        List<Pair<String, Object>> a11 = aVar.a(part.body());
                        if (a11.isEmpty()) {
                            d10 = p.k();
                        } else if (a11.size() == 1) {
                            d10 = o.d(s.a(a10, a11.get(0).d()));
                        } else {
                            throw new IllegalArgumentException("Request body parts must contain a single value. Instead got: " + a11 + ". Part name: " + a10);
                        }
                    }
                    u.z(arrayList, d10);
                } else {
                    throw new IllegalArgumentException("Request body parts must have names.");
                }
            }
            return CollectionsKt.M0(arrayList);
        }
        if (Intrinsics.c(mediaType.type(), "image")) {
            return o.d(s.a("", Long.valueOf(requestBody.contentLength())));
        }
        throw new RuntimeException("Unsupported type: " + mediaType);
    }

    public final List<Pair<String, Object>> a(Object obj) {
        ArrayList arrayList = new ArrayList();
        a(this, obj, (String) null, arrayList, 2, (Object) null);
        return arrayList;
    }

    public static /* synthetic */ void a(a aVar, Object obj, String str, List list, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        aVar.a(obj, str, (List<Pair<String, Object>>) list);
    }

    public final void a(Object obj, String str, List<Pair<String, Object>> list) {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                a aVar = f12220a;
                Object opt = jSONObject.opt(next);
                if (str != null) {
                    next = str + "[" + next + "]";
                }
                aVar.a(opt, next, list);
            }
            return;
        }
        if (!(obj instanceof JSONArray)) {
            if (str == null) {
                str = "";
            }
            list.add(s.a(str, obj));
            return;
        }
        JSONArray jSONArray = (JSONArray) obj;
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            a(jSONArray.opt(i10), str == null ? "[" + i10 + "]" : str + "[" + i10 + "]", list);
        }
    }

    public final String a(List<String> list) {
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (x.T((String) obj, "name=", false, 2, null)) {
                break;
            }
        }
        String str = (String) obj;
        if (str != null) {
            return str.substring(6, str.length() - 1);
        }
        return null;
    }
}

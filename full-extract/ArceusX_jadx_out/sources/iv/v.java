package iv;

import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: l, reason: collision with root package name */
    public static final char[] f21228l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f21229m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a, reason: collision with root package name */
    public final String f21230a;
    public final HttpUrl b;

    /* renamed from: c, reason: collision with root package name */
    public String f21231c;

    /* renamed from: d, reason: collision with root package name */
    public HttpUrl.Builder f21232d;

    /* renamed from: e, reason: collision with root package name */
    public final Request.Builder f21233e = new Request.Builder();

    /* renamed from: f, reason: collision with root package name */
    public final Headers.Builder f21234f;

    /* renamed from: g, reason: collision with root package name */
    public MediaType f21235g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f21236h;

    /* renamed from: i, reason: collision with root package name */
    public MultipartBody.Builder f21237i;

    /* renamed from: j, reason: collision with root package name */
    public FormBody.Builder f21238j;

    /* renamed from: k, reason: collision with root package name */
    public RequestBody f21239k;

    public static class a extends RequestBody {

        /* renamed from: a, reason: collision with root package name */
        public final RequestBody f21240a;
        public final MediaType b;

        public a(RequestBody requestBody, MediaType mediaType) {
            this.f21240a = requestBody;
            this.b = mediaType;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return this.f21240a.contentLength();
        }

        @Override // okhttp3.RequestBody
        /* renamed from: contentType */
        public MediaType get$contentType() {
            return this.b;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(wu.f fVar) {
            this.f21240a.writeTo(fVar);
        }
    }

    public v(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z10, boolean z11, boolean z12) {
        this.f21230a = str;
        this.b = httpUrl;
        this.f21231c = str2;
        this.f21235g = mediaType;
        this.f21236h = z10;
        if (headers != null) {
            this.f21234f = headers.newBuilder();
        } else {
            this.f21234f = new Headers.Builder();
        }
        if (z11) {
            this.f21238j = new FormBody.Builder();
        } else if (z12) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.f21237i = builder;
            builder.setType(MultipartBody.FORM);
        }
    }

    public static String i(String str, boolean z10) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z10 && (codePointAt == 47 || codePointAt == 37))) {
                wu.e eVar = new wu.e();
                eVar.I0(str, 0, i10);
                j(eVar, str, i10, length, z10);
                return eVar.S2();
            }
            i10 += Character.charCount(codePointAt);
        }
        return str;
    }

    public static void j(wu.e eVar, String str, int i10, int i11, boolean z10) {
        wu.e eVar2 = null;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (!z10 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z10 && (codePointAt == 47 || codePointAt == 37))) {
                    if (eVar2 == null) {
                        eVar2 = new wu.e();
                    }
                    eVar2.T(codePointAt);
                    long size = eVar2.getSize();
                    for (long j10 = 0; j10 < size; j10++) {
                        byte j11 = eVar2.j(j10);
                        eVar.writeByte(37);
                        char[] cArr = f21228l;
                        eVar.writeByte(cArr[((j11 & 255) >> 4) & 15]);
                        eVar.writeByte(cArr[j11 & 15]);
                    }
                    eVar2.a();
                } else {
                    eVar.T(codePointAt);
                }
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    public void a(String str, String str2, boolean z10) {
        if (z10) {
            this.f21238j.addEncoded(str, str2);
        } else {
            this.f21238j.add(str, str2);
        }
    }

    public void b(String str, String str2, boolean z10) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            if (z10) {
                this.f21234f.addUnsafeNonAscii(str, str2);
                return;
            } else {
                this.f21234f.add(str, str2);
                return;
            }
        }
        try {
            this.f21235g = MediaType.get(str2);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e10);
        }
    }

    public void c(Headers headers) {
        this.f21234f.addAll(headers);
    }

    public void d(Headers headers, RequestBody requestBody) {
        this.f21237i.addPart(headers, requestBody);
    }

    public void e(MultipartBody.Part part) {
        this.f21237i.addPart(part);
    }

    public void f(String str, String str2, boolean z10) {
        if (this.f21231c == null) {
            throw new AssertionError();
        }
        String i10 = i(str2, z10);
        String replace = this.f21231c.replace("{" + str + "}", i10);
        if (!f21229m.matcher(replace).matches()) {
            this.f21231c = replace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    public void g(String str, String str2, boolean z10) {
        String str3 = this.f21231c;
        if (str3 != null) {
            HttpUrl.Builder newBuilder = this.b.newBuilder(str3);
            this.f21232d = newBuilder;
            if (newBuilder == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.b + ", Relative: " + this.f21231c);
            }
            this.f21231c = null;
        }
        if (z10) {
            this.f21232d.addEncodedQueryParameter(str, str2);
        } else {
            this.f21232d.addQueryParameter(str, str2);
        }
    }

    public <T> void h(Class<T> cls, T t8) {
        this.f21233e.tag((Class<? super Class<T>>) cls, (Class<T>) t8);
    }

    public Request.Builder k() {
        HttpUrl resolve;
        HttpUrl.Builder builder = this.f21232d;
        if (builder != null) {
            resolve = builder.build();
        } else {
            resolve = this.b.resolve(this.f21231c);
            if (resolve == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.b + ", Relative: " + this.f21231c);
            }
        }
        RequestBody requestBody = this.f21239k;
        if (requestBody == null) {
            FormBody.Builder builder2 = this.f21238j;
            if (builder2 != null) {
                requestBody = builder2.build();
            } else {
                MultipartBody.Builder builder3 = this.f21237i;
                if (builder3 != null) {
                    requestBody = builder3.build();
                } else if (this.f21236h) {
                    requestBody = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = this.f21235g;
        if (mediaType != null) {
            if (requestBody != null) {
                requestBody = new a(requestBody, mediaType);
            } else {
                this.f21234f.add("Content-Type", mediaType.toString());
            }
        }
        return this.f21233e.url(resolve).headers(this.f21234f.build()).method(this.f21230a, requestBody);
    }

    public void l(RequestBody requestBody) {
        this.f21239k = requestBody;
    }

    public void m(Object obj) {
        this.f21231c = obj.toString();
    }
}

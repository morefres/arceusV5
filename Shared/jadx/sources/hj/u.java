package hj;

import android.content.Context;
import java.util.HashMap;
import kj.j0;

/* loaded from: classes2.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public HashMap<String, j> f19468a;
    public HashMap<Long, String> b;

    public class a implements j {

        /* renamed from: a, reason: collision with root package name */
        public String f19469a;

        public a(String str) {
            this.f19469a = str;
        }

        @Override // hj.j
        public void a(Context context, String str) {
            ek.q.e("rbx.push", "PNS expireById() unknown type: " + this.f19469a);
        }

        @Override // hj.j
        public void c(Context context, j0 j0Var) {
            ek.q.e("rbx.push", "PNS put() unknown type: " + this.f19469a);
        }

        @Override // hj.j
        public void clear() {
            ek.q.e("rbx.push", "PNS clear() unknown type: " + this.f19469a);
        }

        @Override // hj.j
        public void d(Context context, long j10) {
            ek.q.e("rbx.push", "PNS expireToDate() unknown type: " + this.f19469a);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final u f19470a = new u();
    }

    public static u c() {
        return b.f19470a;
    }

    public void a() {
        this.b.clear();
        this.f19468a.clear();
        g();
    }

    public j b(String str) {
        return this.f19468a.get(str);
    }

    public j d(String str) {
        if (!this.f19468a.containsKey(str)) {
            this.f19468a.put(str, new a(str));
        }
        return this.f19468a.get(str);
    }

    public j e(String str, long j10) {
        if (!this.f19468a.containsKey(str)) {
            this.f19468a.put(str, new c(j10));
        }
        return this.f19468a.get(str);
    }

    public String f(long j10) {
        return this.b.get(Long.valueOf(j10));
    }

    public void g() {
        this.f19468a.put("FriendRequestReceived", new g());
        this.f19468a.put("FriendRequestAccepted", new f());
        this.f19468a.put("PrivateMessageReceived", new l());
    }

    public String h(long j10, String str) {
        return this.b.put(Long.valueOf(j10), str);
    }

    public void i(String str) {
        this.f19468a.remove(str);
    }

    public u() {
        this.f19468a = new HashMap<>();
        this.b = new HashMap<>();
        g();
    }
}

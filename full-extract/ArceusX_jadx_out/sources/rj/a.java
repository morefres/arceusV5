package rj;

import android.os.AsyncTask;
import androidx.annotation.NonNull;
import com.roblox.client.routing.model.RouteModel;
import ek.n;
import ek.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import jg.u;
import oh.g;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public ev.c f30659a;
    public rj.b b;

    /* renamed from: c, reason: collision with root package name */
    public Executor f30660c;

    /* renamed from: rj.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0536a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30661a;

        static {
            int[] iArr = new int[rj.c.values().length];
            f30661a = iArr;
            try {
                iArr[rj.c.PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30661a[rj.c.GAME_DETAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30662a = new a(ev.c.d(), new rj.b(), AsyncTask.THREAD_POOL_EXECUTOR);
    }

    public static class c extends AsyncTask<String, Void, List<d>> {

        /* renamed from: a, reason: collision with root package name */
        public ev.c f30663a;
        public rj.b b;

        /* renamed from: c, reason: collision with root package name */
        public Executor f30664c;

        /* renamed from: d, reason: collision with root package name */
        public String f30665d;

        /* renamed from: e, reason: collision with root package name */
        public String f30666e;

        /* renamed from: rj.a$c$a, reason: collision with other inner class name */
        public class RunnableC0537a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List f30667a;

            public RunnableC0537a(List list) {
                this.f30667a = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                String c10;
                for (d dVar : this.f30667a) {
                    q.h("AppRouter", "Trying to post event: " + dVar.a().b());
                    g b = g.b(dVar.a().b());
                    int i10 = C0536a.f30661a[dVar.a().ordinal()];
                    if (i10 == 1) {
                        String str = dVar.a().d()[0];
                        if (!dVar.b().containsKey(str)) {
                            c.this.b.c(dVar.a().b(), c.this.f30665d);
                            return;
                        } else {
                            try {
                                c10 = g.c(Long.valueOf(dVar.b().get(str)).longValue());
                            } catch (NumberFormatException unused) {
                                c.this.b.d(dVar.a().b(), c.this.f30665d);
                                return;
                            }
                        }
                    } else if (i10 != 2) {
                        c10 = null;
                    } else {
                        String str2 = dVar.a().d()[0];
                        if (!dVar.b().containsKey(str2)) {
                            c.this.b.c(dVar.a().b(), c.this.f30665d);
                            return;
                        } else {
                            try {
                                c10 = String.valueOf(Long.valueOf(dVar.b().get(str2)).longValue());
                            } catch (NumberFormatException unused2) {
                                c.this.b.d(dVar.a().b(), c.this.f30665d);
                                return;
                            }
                        }
                    }
                    if (c10 != null) {
                        b.i(c10);
                        c.this.b.i();
                    } else {
                        c.this.b.j();
                    }
                    c.this.f30663a.j(b);
                }
            }
        }

        public c(ev.c cVar, rj.b bVar, Executor executor) {
            this.f30663a = cVar;
            this.b = bVar;
            this.f30664c = executor;
        }

        public final List<d> d(List<String> list, HashMap<String, String> hashMap) {
            d dVar;
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                try {
                    rj.c valueOf = rj.c.valueOf(list.get(i10).toUpperCase());
                    if (i10 != list.size() - 1) {
                        dVar = new d(valueOf);
                    } else {
                        if (valueOf.c() != hashMap.size()) {
                            q.h("AppRouter", "Incorrect number of parameters. Stop building routes.");
                            this.b.f(valueOf.b(), this.f30665d);
                            return arrayList;
                        }
                        dVar = new d(valueOf, hashMap);
                    }
                    arrayList.add(dVar);
                } catch (IllegalArgumentException unused) {
                    q.h("AppRouter", "AppTarget not recognized. Stop building routes.");
                }
            }
            return arrayList;
        }

        @Override // android.os.AsyncTask
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<d> doInBackground(String... strArr) {
            this.b.h();
            RouteModel i10 = i(strArr[0]);
            if (i10 == null) {
                return Collections.EMPTY_LIST;
            }
            q.b("AppRouter", "defaultActionHandler: " + i10.default_action_handler + ". action: " + i10.default_action);
            if (!n(i10)) {
                this.b.a();
                q.b("AppRouter", "Should be handled by Lua.");
                return Collections.EMPTY_LIST;
            }
            this.b.b();
            String str = i10.default_action;
            this.f30665d = str;
            List<d> j10 = j(str);
            if (j10.size() == 0) {
                this.b.g(this.f30665d);
            }
            return j10;
        }

        public final String f(String str) {
            int indexOf = str.indexOf(47);
            if (indexOf == -1) {
                return null;
            }
            return str.substring(0, indexOf);
        }

        public final List<String> g(String str) {
            ArrayList arrayList = new ArrayList(Arrays.asList(str.split("/")));
            if (arrayList.size() != 0) {
                arrayList.remove(0);
                if (arrayList.size() != 0) {
                    String[] split = ((String) arrayList.get(arrayList.size() - 1)).split("\\?");
                    if (split.length != 0) {
                        arrayList.remove(arrayList.size() - 1);
                        arrayList.add(split[0]);
                        return arrayList;
                    }
                }
            }
            return arrayList;
        }

        public HashMap<String, String> h(String str) {
            String str2;
            String[] split = str.split("\\?");
            HashMap<String, String> hashMap = new HashMap<>();
            if (split.length >= 2 && (str2 = split[1]) != null) {
                for (String str3 : str2.split("&")) {
                    if (str3 != null) {
                        String[] split2 = str3.split("=");
                        if (split2.length == 2) {
                            hashMap.put(split2[0], split2[1]);
                        }
                    }
                }
            }
            return hashMap;
        }

        public final RouteModel i(String str) {
            try {
                return (RouteModel) n.a(str, RouteModel.class);
            } catch (u unused) {
                q.h("AppRouter", "Invalid json string.");
                this.b.e(str);
                return null;
            }
        }

        public final List<d> j(String str) {
            ArrayList arrayList = new ArrayList();
            String m10 = m(str);
            q.b("AppRouter", "Path: " + m10);
            if (m10 != null) {
                this.f30666e = f(m10);
                q.b("AppRouter", "ActionType: " + this.f30666e);
                List<String> g10 = g(m10);
                q.b("AppRouter", "Actions: " + g10);
                if (g10.size() != 0) {
                    return d(g10, h(m10));
                }
            }
            return arrayList;
        }

        public final void k(List<d> list) {
            this.f30664c.execute(new RunnableC0537a(list));
        }

        @Override // android.os.AsyncTask
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List<d> list) {
            super.onPostExecute(list);
            k(list);
        }

        public final String m(String str) {
            int indexOf = str.indexOf("://");
            if (indexOf == -1) {
                return null;
            }
            return str.substring(indexOf + 3);
        }

        public final boolean n(@NonNull RouteModel routeModel) {
            String str = routeModel.android_default_action_handler;
            return str != null ? "native".equals(str) : "native".equals(routeModel.default_action_handler);
        }
    }

    public a(ev.c cVar, rj.b bVar, Executor executor) {
        this.f30659a = cVar;
        this.b = bVar;
        this.f30660c = executor;
    }

    public static a a() {
        return b.f30662a;
    }

    public void b(String str) {
        new c(this.f30659a, this.b, this.f30660c).executeOnExecutor(this.f30660c, str);
    }
}

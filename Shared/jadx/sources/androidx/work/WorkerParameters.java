package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import x5.h0;
import x5.l;
import x5.u0;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a, reason: collision with root package name */
    public UUID f3257a;
    public b b;

    /* renamed from: c, reason: collision with root package name */
    public Set<String> f3258c;

    /* renamed from: d, reason: collision with root package name */
    public a f3259d;

    /* renamed from: e, reason: collision with root package name */
    public int f3260e;

    /* renamed from: f, reason: collision with root package name */
    public Executor f3261f;

    /* renamed from: g, reason: collision with root package name */
    public CoroutineContext f3262g;

    /* renamed from: h, reason: collision with root package name */
    public h6.b f3263h;

    /* renamed from: i, reason: collision with root package name */
    public u0 f3264i;

    /* renamed from: j, reason: collision with root package name */
    public h0 f3265j;

    /* renamed from: k, reason: collision with root package name */
    public l f3266k;

    /* renamed from: l, reason: collision with root package name */
    public int f3267l;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public List<String> f3268a;
        public List<Uri> b;

        /* renamed from: c, reason: collision with root package name */
        public Network f3269c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.f3268a = list;
            this.b = list;
        }
    }

    public WorkerParameters(UUID uuid, b bVar, Collection<String> collection, a aVar, int i10, int i11, Executor executor, CoroutineContext coroutineContext, h6.b bVar2, u0 u0Var, h0 h0Var, l lVar) {
        this.f3257a = uuid;
        this.b = bVar;
        this.f3258c = new HashSet(collection);
        this.f3259d = aVar;
        this.f3260e = i10;
        this.f3267l = i11;
        this.f3261f = executor;
        this.f3262g = coroutineContext;
        this.f3263h = bVar2;
        this.f3264i = u0Var;
        this.f3265j = h0Var;
        this.f3266k = lVar;
    }

    public Executor a() {
        return this.f3261f;
    }

    public l b() {
        return this.f3266k;
    }

    public UUID c() {
        return this.f3257a;
    }

    public b d() {
        return this.b;
    }

    public Network e() {
        return this.f3259d.f3269c;
    }

    public h0 f() {
        return this.f3265j;
    }

    public int g() {
        return this.f3260e;
    }

    public Set<String> h() {
        return this.f3258c;
    }

    public h6.b i() {
        return this.f3263h;
    }

    public List<String> j() {
        return this.f3259d.f3268a;
    }

    public List<Uri> k() {
        return this.f3259d.b;
    }

    public CoroutineContext l() {
        return this.f3262g;
    }

    public u0 m() {
        return this.f3264i;
    }
}

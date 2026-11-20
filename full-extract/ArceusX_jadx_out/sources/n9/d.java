package n9;

import android.accounts.Account;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Account f25939a;
    public final Set b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f25940c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f25941d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25942e;

    /* renamed from: f, reason: collision with root package name */
    public final View f25943f;

    /* renamed from: g, reason: collision with root package name */
    public final String f25944g;

    /* renamed from: h, reason: collision with root package name */
    public final String f25945h;

    /* renamed from: i, reason: collision with root package name */
    public final pb.a f25946i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f25947j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Account f25948a;
        public w1.b b;

        /* renamed from: c, reason: collision with root package name */
        public String f25949c;

        /* renamed from: d, reason: collision with root package name */
        public String f25950d;

        /* renamed from: e, reason: collision with root package name */
        public final pb.a f25951e = pb.a.f28527j;

        @NonNull
        public d a() {
            return new d(this.f25948a, this.b, null, 0, null, this.f25949c, this.f25950d, this.f25951e, false);
        }

        @NonNull
        public a b(@NonNull String str) {
            this.f25949c = str;
            return this;
        }

        @NonNull
        public final a c(@NonNull Collection collection) {
            if (this.b == null) {
                this.b = new w1.b();
            }
            this.b.addAll(collection);
            return this;
        }

        @NonNull
        public final a d(Account account) {
            this.f25948a = account;
            return this;
        }

        @NonNull
        public final a e(@NonNull String str) {
            this.f25950d = str;
            return this;
        }
    }

    public d(Account account, @NonNull Set set, @NonNull Map map, int i10, View view, @NonNull String str, @NonNull String str2, pb.a aVar, boolean z10) {
        this.f25939a = account;
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.b = unmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f25941d = map;
        this.f25943f = view;
        this.f25942e = i10;
        this.f25944g = str;
        this.f25945h = str2;
        this.f25946i = aVar == null ? pb.a.f28527j : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(((w) it.next()).f26005a);
        }
        this.f25940c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f25939a;
    }

    @Deprecated
    public String b() {
        Account account = this.f25939a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @NonNull
    public Account c() {
        Account account = this.f25939a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    @NonNull
    public Set<Scope> d() {
        return this.f25940c;
    }

    @NonNull
    public Set<Scope> e(@NonNull k9.a<?> aVar) {
        w wVar = (w) this.f25941d.get(aVar);
        if (wVar == null || wVar.f26005a.isEmpty()) {
            return this.b;
        }
        HashSet hashSet = new HashSet(this.b);
        hashSet.addAll(wVar.f26005a);
        return hashSet;
    }

    public int f() {
        return this.f25942e;
    }

    @NonNull
    public String g() {
        return this.f25944g;
    }

    @NonNull
    public Set<Scope> h() {
        return this.b;
    }

    public View i() {
        return this.f25943f;
    }

    @NonNull
    public final pb.a j() {
        return this.f25946i;
    }

    public final Integer k() {
        return this.f25947j;
    }

    public final String l() {
        return this.f25945h;
    }

    public final void m(@NonNull Integer num) {
        this.f25947j = num;
    }
}

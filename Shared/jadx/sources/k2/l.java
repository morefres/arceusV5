package k2;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k2.k;

/* loaded from: classes.dex */
public class l implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22282a;
    public final Notification.Builder b;

    /* renamed from: c, reason: collision with root package name */
    public final k.f f22283c;

    /* renamed from: d, reason: collision with root package name */
    public RemoteViews f22284d;

    /* renamed from: e, reason: collision with root package name */
    public RemoteViews f22285e;

    /* renamed from: f, reason: collision with root package name */
    public final List<Bundle> f22286f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f22287g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public int f22288h;

    /* renamed from: i, reason: collision with root package name */
    public RemoteViews f22289i;

    public static class a {
        public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        public static Notification.Builder e(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder f(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        public static Notification.Builder g(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        public static Notification.Builder h(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    public static class b {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    public static class c {
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        public static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    public static class d {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    public static class e {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        public static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        public static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    public static class f {
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    public static class g {
        public static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }

        public static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    public static class h {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        public static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    public static final class i {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.setShortCriticalText(str);
        }
    }

    public l(k.f fVar) {
        int i10;
        this.f22283c = fVar;
        Context context = fVar.f22243a;
        this.f22282a = context;
        Notification.Builder a10 = e.a(context, fVar.L);
        this.b = a10;
        Notification notification = fVar.T;
        int i11 = 0;
        a10.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, fVar.f22251j).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(fVar.f22246e).setContentText(fVar.f22247f).setContentInfo(fVar.f22253l).setContentIntent(fVar.f22249h).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(fVar.f22250i, (notification.flags & 128) != 0).setNumber(fVar.f22254m).setProgress(fVar.f22262u, fVar.f22263v, fVar.f22264w);
        IconCompat iconCompat = fVar.f22252k;
        c.b(a10, iconCompat == null ? null : iconCompat.p(context));
        a10.setSubText(fVar.f22259r).setUsesChronometer(fVar.f22257p).setPriority(fVar.f22255n);
        k.i iVar = fVar.f22258q;
        if (iVar instanceof k.g) {
            ArrayList<k.a> i12 = ((k.g) iVar).i();
            int size = i12.size();
            int i13 = 0;
            while (i13 < size) {
                k.a aVar = i12.get(i13);
                i13++;
                b(aVar);
            }
        } else {
            ArrayList<k.a> arrayList = fVar.b;
            int size2 = arrayList.size();
            int i14 = 0;
            while (i14 < size2) {
                k.a aVar2 = arrayList.get(i14);
                i14++;
                b(aVar2);
            }
        }
        Bundle bundle = fVar.E;
        if (bundle != null) {
            this.f22287g.putAll(bundle);
        }
        int i15 = Build.VERSION.SDK_INT;
        this.f22284d = fVar.I;
        this.f22285e = fVar.J;
        this.b.setShowWhen(fVar.f22256o);
        a.g(this.b, fVar.A);
        a.e(this.b, fVar.f22265x);
        a.h(this.b, fVar.f22267z);
        a.f(this.b, fVar.f22266y);
        this.f22288h = fVar.Q;
        b.b(this.b, fVar.D);
        b.c(this.b, fVar.F);
        b.f(this.b, fVar.G);
        b.d(this.b, fVar.H);
        b.e(this.b, notification.sound, notification.audioAttributes);
        List e10 = i15 < 28 ? e(g(fVar.f22244c), fVar.W) : fVar.W;
        if (e10 != null && !e10.isEmpty()) {
            Iterator it = e10.iterator();
            while (it.hasNext()) {
                b.a(this.b, (String) it.next());
            }
        }
        this.f22289i = fVar.K;
        if (fVar.f22245d.size() > 0) {
            Bundle bundle2 = fVar.d().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i16 = 0; i16 < fVar.f22245d.size(); i16++) {
                bundle4.putBundle(Integer.toString(i16), m.a(fVar.f22245d.get(i16)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            fVar.d().putBundle("android.car.EXTENSIONS", bundle2);
            this.f22287g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i17 = Build.VERSION.SDK_INT;
        Object obj = fVar.V;
        if (obj != null) {
            c.c(this.b, obj);
        }
        this.b.setExtras(fVar.E);
        d.e(this.b, fVar.f22261t);
        RemoteViews remoteViews = fVar.I;
        if (remoteViews != null) {
            d.c(this.b, remoteViews);
        }
        RemoteViews remoteViews2 = fVar.J;
        if (remoteViews2 != null) {
            d.b(this.b, remoteViews2);
        }
        RemoteViews remoteViews3 = fVar.K;
        if (remoteViews3 != null) {
            d.d(this.b, remoteViews3);
        }
        e.b(this.b, fVar.M);
        e.e(this.b, fVar.f22260s);
        e.f(this.b, fVar.N);
        e.g(this.b, fVar.P);
        e.d(this.b, fVar.Q);
        if (fVar.C) {
            e.c(this.b, fVar.B);
        }
        if (!TextUtils.isEmpty(fVar.L)) {
            this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i17 >= 28) {
            ArrayList<r> arrayList2 = fVar.f22244c;
            int size3 = arrayList2.size();
            while (i11 < size3) {
                r rVar = arrayList2.get(i11);
                i11++;
                f.a(this.b, rVar.i());
            }
        }
        int i18 = Build.VERSION.SDK_INT;
        if (i18 >= 29) {
            g.a(this.b, fVar.S);
            g.b(this.b, k.e.a(null));
            l2.d dVar = fVar.O;
            if (dVar != null) {
                g.d(this.b, dVar.c());
            }
        }
        if (i18 >= 31 && (i10 = fVar.R) != 0) {
            h.b(this.b, i10);
        }
        if (i18 >= 36) {
            i.a(this.b, fVar.f22248g);
        }
        if (fVar.U) {
            if (this.f22283c.f22266y) {
                this.f22288h = 2;
            } else {
                this.f22288h = 1;
            }
            this.b.setVibrate(null);
            this.b.setSound(null);
            int i19 = notification.defaults & (-4);
            notification.defaults = i19;
            this.b.setDefaults(i19);
            if (TextUtils.isEmpty(this.f22283c.f22265x)) {
                a.e(this.b, "silent");
            }
            e.d(this.b, this.f22288h);
        }
    }

    public static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        w1.b bVar = new w1.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    public static List<String> g(List<r> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<r> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().h());
        }
        return arrayList;
    }

    @Override // k2.j
    public Notification.Builder a() {
        return this.b;
    }

    public final void b(k.a aVar) {
        IconCompat d10 = aVar.d();
        Notification.Action.Builder a10 = c.a(d10 != null ? d10.o() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : t.b(aVar.e())) {
                a.c(a10, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i10 = Build.VERSION.SDK_INT;
        d.a(a10, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i10 >= 28) {
            f.b(a10, aVar.f());
        }
        if (i10 >= 29) {
            g.c(a10, aVar.j());
        }
        if (i10 >= 31) {
            h.a(a10, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(a10, bundle);
        a.a(this.b, a.d(a10));
    }

    public Notification c() {
        Bundle a10;
        RemoteViews f10;
        RemoteViews d10;
        k.i iVar = this.f22283c.f22258q;
        if (iVar != null) {
            iVar.b(this);
        }
        RemoteViews e10 = iVar != null ? iVar.e(this) : null;
        Notification d11 = d();
        if (e10 != null) {
            d11.contentView = e10;
        } else {
            RemoteViews remoteViews = this.f22283c.I;
            if (remoteViews != null) {
                d11.contentView = remoteViews;
            }
        }
        if (iVar != null && (d10 = iVar.d(this)) != null) {
            d11.bigContentView = d10;
        }
        if (iVar != null && (f10 = this.f22283c.f22258q.f(this)) != null) {
            d11.headsUpContentView = f10;
        }
        if (iVar != null && (a10 = k.a(d11)) != null) {
            iVar.a(a10);
        }
        return d11;
    }

    public Notification d() {
        return this.b.build();
    }

    public Context f() {
        return this.f22282a;
    }
}

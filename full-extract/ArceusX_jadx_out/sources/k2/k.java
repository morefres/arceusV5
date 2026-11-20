package k2;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public class k {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f22217a;
        public IconCompat b;

        /* renamed from: c, reason: collision with root package name */
        public final t[] f22218c;

        /* renamed from: d, reason: collision with root package name */
        public final t[] f22219d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f22220e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f22221f;

        /* renamed from: g, reason: collision with root package name */
        public final int f22222g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f22223h;

        /* renamed from: i, reason: collision with root package name */
        @Deprecated
        public int f22224i;

        /* renamed from: j, reason: collision with root package name */
        public CharSequence f22225j;

        /* renamed from: k, reason: collision with root package name */
        public PendingIntent f22226k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f22227l;

        /* renamed from: k2.k$a$a, reason: collision with other inner class name */
        public static final class C0391a {

            /* renamed from: a, reason: collision with root package name */
            public final IconCompat f22228a;
            public final CharSequence b;

            /* renamed from: c, reason: collision with root package name */
            public final PendingIntent f22229c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f22230d;

            /* renamed from: e, reason: collision with root package name */
            public final Bundle f22231e;

            /* renamed from: f, reason: collision with root package name */
            public ArrayList<t> f22232f;

            /* renamed from: g, reason: collision with root package name */
            public int f22233g;

            /* renamed from: h, reason: collision with root package name */
            public boolean f22234h;

            /* renamed from: i, reason: collision with root package name */
            public boolean f22235i;

            /* renamed from: j, reason: collision with root package name */
            public boolean f22236j;

            public C0391a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public C0391a a(t tVar) {
                if (this.f22232f == null) {
                    this.f22232f = new ArrayList<>();
                }
                if (tVar != null) {
                    this.f22232f.add(tVar);
                }
                return this;
            }

            public a b() {
                c();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<t> arrayList3 = this.f22232f;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size) {
                        t tVar = arrayList3.get(i10);
                        i10++;
                        t tVar2 = tVar;
                        if (tVar2.k()) {
                            arrayList.add(tVar2);
                        } else {
                            arrayList2.add(tVar2);
                        }
                    }
                }
                return new a(this.f22228a, this.b, this.f22229c, this.f22231e, arrayList2.isEmpty() ? null : (t[]) arrayList2.toArray(new t[arrayList2.size()]), arrayList.isEmpty() ? null : (t[]) arrayList.toArray(new t[arrayList.size()]), this.f22230d, this.f22233g, this.f22234h, this.f22235i, this.f22236j);
            }

            public final void c() {
                if (this.f22235i && this.f22229c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public C0391a d(boolean z10) {
                this.f22230d = z10;
                return this;
            }

            public C0391a e(boolean z10) {
                this.f22236j = z10;
                return this;
            }

            public C0391a f(boolean z10) {
                this.f22234h = z10;
                return this;
            }

            public C0391a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i10 != 0 ? IconCompat.e(null, "", i10) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public C0391a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, t[] tVarArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                this.f22230d = true;
                this.f22234h = true;
                this.f22228a = iconCompat;
                this.b = f.e(charSequence);
                this.f22229c = pendingIntent;
                this.f22231e = bundle;
                this.f22232f = tVarArr == null ? null : new ArrayList<>(Arrays.asList(tVarArr));
                this.f22230d = z10;
                this.f22233g = i10;
                this.f22234h = z11;
                this.f22235i = z12;
                this.f22236j = z13;
            }
        }

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.e(null, "", i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f22226k;
        }

        public boolean b() {
            return this.f22220e;
        }

        public Bundle c() {
            return this.f22217a;
        }

        public IconCompat d() {
            int i10;
            if (this.b == null && (i10 = this.f22224i) != 0) {
                this.b = IconCompat.e(null, "", i10);
            }
            return this.b;
        }

        public t[] e() {
            return this.f22218c;
        }

        public int f() {
            return this.f22222g;
        }

        public boolean g() {
            return this.f22221f;
        }

        public CharSequence h() {
            return this.f22225j;
        }

        public boolean i() {
            return this.f22227l;
        }

        public boolean j() {
            return this.f22223h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, t[] tVarArr, t[] tVarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f22221f = true;
            this.b = iconCompat;
            if (iconCompat != null && iconCompat.i() == 2) {
                this.f22224i = iconCompat.g();
            }
            this.f22225j = f.e(charSequence);
            this.f22226k = pendingIntent;
            this.f22217a = bundle == null ? new Bundle() : bundle;
            this.f22218c = tVarArr;
            this.f22219d = tVarArr2;
            this.f22220e = z10;
            this.f22222g = i10;
            this.f22221f = z11;
            this.f22223h = z12;
            this.f22227l = z13;
        }
    }

    public static class b {
        public static String a(Notification notification) {
            return notification.getGroup();
        }
    }

    public static class c extends i {

        /* renamed from: e, reason: collision with root package name */
        public IconCompat f22237e;

        /* renamed from: f, reason: collision with root package name */
        public IconCompat f22238f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f22239g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f22240h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f22241i;

        public static class a {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        public static class b {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        @Override // k2.k.i
        public void b(j jVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(jVar.a()).setBigContentTitle(this.b);
            IconCompat iconCompat = this.f22237e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    b.a(bigContentTitle, this.f22237e.p(jVar instanceof l ? ((l) jVar).f() : null));
                } else if (iconCompat.i() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f22237e.f());
                }
            }
            if (this.f22239g) {
                if (this.f22238f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f22238f.p(jVar instanceof l ? ((l) jVar).f() : null));
                }
            }
            if (this.f22281d) {
                bigContentTitle.setSummaryText(this.f22280c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                b.c(bigContentTitle, this.f22241i);
                b.b(bigContentTitle, this.f22240h);
            }
        }

        @Override // k2.k.i
        public String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public c h(Bitmap bitmap) {
            this.f22238f = bitmap == null ? null : IconCompat.c(bitmap);
            this.f22239g = true;
            return this;
        }

        public c i(Bitmap bitmap) {
            this.f22237e = bitmap == null ? null : IconCompat.c(bitmap);
            return this;
        }
    }

    public static class d extends i {

        /* renamed from: e, reason: collision with root package name */
        public CharSequence f22242e;

        @Override // k2.k.i
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // k2.k.i
        public void b(j jVar) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(jVar.a()).setBigContentTitle(this.b).bigText(this.f22242e);
            if (this.f22281d) {
                bigText.setSummaryText(this.f22280c);
            }
        }

        @Override // k2.k.i
        public String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public d h(CharSequence charSequence) {
            this.f22242e = f.e(charSequence);
            return this;
        }
    }

    public static final class e {
        public static Notification.BubbleMetadata a(e eVar) {
            return null;
        }
    }

    public static class g extends i {

        /* renamed from: e, reason: collision with root package name */
        public int f22268e;

        /* renamed from: f, reason: collision with root package name */
        public r f22269f;

        /* renamed from: g, reason: collision with root package name */
        public PendingIntent f22270g;

        /* renamed from: h, reason: collision with root package name */
        public PendingIntent f22271h;

        /* renamed from: i, reason: collision with root package name */
        public PendingIntent f22272i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f22273j;

        /* renamed from: k, reason: collision with root package name */
        public Integer f22274k;

        /* renamed from: l, reason: collision with root package name */
        public Integer f22275l;

        /* renamed from: m, reason: collision with root package name */
        public IconCompat f22276m;

        /* renamed from: n, reason: collision with root package name */
        public CharSequence f22277n;

        public static class a {
            public static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            public static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        public static class b {
            public static Parcelable a(Icon icon) {
                return icon;
            }

            public static void b(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        public static class c {
            public static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            public static Parcelable b(Person person) {
                return person;
            }
        }

        public static class d {
            public static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            public static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle d(Notification.CallStyle callStyle, int i10) {
                return callStyle.setAnswerButtonColorHint(i10);
            }

            public static Notification.CallStyle e(Notification.CallStyle callStyle, int i10) {
                return callStyle.setDeclineButtonColorHint(i10);
            }

            public static Notification.CallStyle f(Notification.CallStyle callStyle, boolean z10) {
                return callStyle.setIsVideo(z10);
            }

            public static Notification.CallStyle g(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            public static Notification.CallStyle h(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        public g() {
        }

        public static g h(r rVar, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "declineIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new g(1, rVar, null, pendingIntent, pendingIntent2);
        }

        @Override // k2.k.i
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putInt("android.callType", this.f22268e);
            bundle.putBoolean("android.callIsVideo", this.f22273j);
            r rVar = this.f22269f;
            if (rVar != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("android.callPerson", c.b(rVar.i()));
                } else {
                    bundle.putParcelable("android.callPersonCompat", rVar.j());
                }
            }
            IconCompat iconCompat = this.f22276m;
            if (iconCompat != null) {
                bundle.putParcelable("android.verificationIcon", b.a(iconCompat.p(this.f22279a.f22243a)));
            }
            bundle.putCharSequence("android.verificationText", this.f22277n);
            bundle.putParcelable("android.answerIntent", this.f22270g);
            bundle.putParcelable("android.declineIntent", this.f22271h);
            bundle.putParcelable("android.hangUpIntent", this.f22272i);
            Integer num = this.f22274k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f22275l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        @Override // k2.k.i
        public void b(j jVar) {
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            r2 = null;
            Notification.CallStyle a10 = null;
            charSequence = null;
            if (i10 < 31) {
                Notification.Builder a11 = jVar.a();
                r rVar = this.f22269f;
                a11.setContentTitle(rVar != null ? rVar.d() : null);
                Bundle bundle = this.f22279a.E;
                if (bundle != null && bundle.containsKey(NotificationCompat.EXTRA_TEXT)) {
                    charSequence = this.f22279a.E.getCharSequence(NotificationCompat.EXTRA_TEXT);
                }
                if (charSequence == null) {
                    charSequence = j();
                }
                a11.setContentText(charSequence);
                r rVar2 = this.f22269f;
                if (rVar2 != null) {
                    if (rVar2.b() != null) {
                        b.b(a11, this.f22269f.b().p(this.f22279a.f22243a));
                    }
                    if (i10 >= 28) {
                        c.a(a11, this.f22269f.i());
                    } else {
                        a.a(a11, this.f22269f.e());
                    }
                }
                a.b(a11, NotificationCompat.CATEGORY_CALL);
                return;
            }
            int i11 = this.f22268e;
            if (i11 == 1) {
                a10 = d.a(this.f22269f.i(), this.f22271h, this.f22270g);
            } else if (i11 == 2) {
                a10 = d.b(this.f22269f.i(), this.f22272i);
            } else if (i11 == 3) {
                a10 = d.c(this.f22269f.i(), this.f22272i, this.f22270g);
            } else if (Log.isLoggable("NotifCompat", 3)) {
                Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f22268e));
            }
            if (a10 != null) {
                a10.setBuilder(jVar.a());
                Integer num = this.f22274k;
                if (num != null) {
                    d.d(a10, num.intValue());
                }
                Integer num2 = this.f22275l;
                if (num2 != null) {
                    d.e(a10, num2.intValue());
                }
                d.h(a10, this.f22277n);
                IconCompat iconCompat = this.f22276m;
                if (iconCompat != null) {
                    d.g(a10, iconCompat.p(this.f22279a.f22243a));
                }
                d.f(a10, this.f22273j);
            }
        }

        @Override // k2.k.i
        public String c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        public ArrayList<a> i() {
            a n10 = n();
            a m10 = m();
            ArrayList<a> arrayList = new ArrayList<>(3);
            arrayList.add(n10);
            ArrayList<a> arrayList2 = this.f22279a.b;
            int i10 = 2;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    a aVar = arrayList2.get(i11);
                    i11++;
                    a aVar2 = aVar;
                    if (aVar2.j()) {
                        arrayList.add(aVar2);
                    } else if (!k(aVar2)) {
                        arrayList.add(aVar2);
                        i10--;
                    }
                    if (m10 != null && i10 == 1) {
                        arrayList.add(m10);
                        i10--;
                    }
                }
            }
            if (m10 != null && i10 >= 1) {
                arrayList.add(m10);
            }
            return arrayList;
        }

        public final String j() {
            int i10 = this.f22268e;
            if (i10 == 1) {
                return this.f22279a.f22243a.getResources().getString(j2.f.f21481e);
            }
            if (i10 == 2) {
                return this.f22279a.f22243a.getResources().getString(j2.f.f21482f);
            }
            if (i10 != 3) {
                return null;
            }
            return this.f22279a.f22243a.getResources().getString(j2.f.f21483g);
        }

        public final boolean k(a aVar) {
            return aVar != null && aVar.c().getBoolean("key_action_priority");
        }

        public final a l(int i10, int i11, Integer num, int i12, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(l2.b.c(this.f22279a.f22243a, i12));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f22279a.f22243a.getResources().getString(i11));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            a b10 = new a.C0391a(IconCompat.d(this.f22279a.f22243a, i10), spannableStringBuilder, pendingIntent).b();
            b10.c().putBoolean("key_action_priority", true);
            return b10;
        }

        public final a m() {
            int i10 = j2.d.b;
            int i11 = j2.d.f21451a;
            PendingIntent pendingIntent = this.f22270g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z10 = this.f22273j;
            return l(z10 ? i10 : i11, z10 ? j2.f.b : j2.f.f21478a, this.f22274k, j2.b.f21449a, pendingIntent);
        }

        public final a n() {
            int i10 = j2.d.f21452c;
            PendingIntent pendingIntent = this.f22271h;
            return pendingIntent == null ? l(i10, j2.f.f21480d, this.f22275l, j2.b.b, this.f22272i) : l(i10, j2.f.f21479c, this.f22275l, j2.b.b, pendingIntent);
        }

        public g o(int i10) {
            this.f22274k = Integer.valueOf(i10);
            return this;
        }

        public g p(int i10) {
            this.f22275l = Integer.valueOf(i10);
            return this;
        }

        public g(int i10, r rVar, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
            if (rVar == null || TextUtils.isEmpty(rVar.d())) {
                throw new IllegalArgumentException("person must have a non-empty a name");
            }
            this.f22268e = i10;
            this.f22269f = rVar;
            this.f22270g = pendingIntent3;
            this.f22271h = pendingIntent2;
            this.f22272i = pendingIntent;
        }
    }

    public static class h extends i {

        /* renamed from: e, reason: collision with root package name */
        public ArrayList<CharSequence> f22278e = new ArrayList<>();

        @Override // k2.k.i
        public void b(j jVar) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(jVar.a()).setBigContentTitle(this.b);
            if (this.f22281d) {
                bigContentTitle.setSummaryText(this.f22280c);
            }
            ArrayList<CharSequence> arrayList = this.f22278e;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                CharSequence charSequence = arrayList.get(i10);
                i10++;
                bigContentTitle.addLine(charSequence);
            }
        }

        @Override // k2.k.i
        public String c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        public h h(CharSequence charSequence) {
            if (charSequence != null) {
                this.f22278e.add(f.e(charSequence));
            }
            return this;
        }

        public h i(CharSequence charSequence) {
            this.b = f.e(charSequence);
            return this;
        }
    }

    public static abstract class i {

        /* renamed from: a, reason: collision with root package name */
        public f f22279a;
        public CharSequence b;

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f22280c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f22281d = false;

        public void a(Bundle bundle) {
            if (this.f22281d) {
                bundle.putCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT, this.f22280c);
            }
            CharSequence charSequence = this.b;
            if (charSequence != null) {
                bundle.putCharSequence(NotificationCompat.EXTRA_TITLE_BIG, charSequence);
            }
            String c10 = c();
            if (c10 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c10);
            }
        }

        public abstract void b(j jVar);

        public abstract String c();

        public RemoteViews d(j jVar) {
            return null;
        }

        public RemoteViews e(j jVar) {
            return null;
        }

        public RemoteViews f(j jVar) {
            return null;
        }

        public void g(f fVar) {
            if (this.f22279a != fVar) {
                this.f22279a = fVar;
                if (fVar != null) {
                    fVar.B(this);
                }
            }
        }
    }

    @Deprecated
    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static String b(Notification notification) {
        return b.a(notification);
    }

    public static boolean c(Notification notification) {
        return (notification.flags & 512) != 0;
    }

    public static Bitmap d(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(j2.c.b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(j2.c.f21450a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
    }

    public static class f {
        public boolean A;
        public boolean B;
        public boolean C;
        public String D;
        public Bundle E;
        public int F;
        public int G;
        public Notification H;
        public RemoteViews I;
        public RemoteViews J;
        public RemoteViews K;
        public String L;
        public int M;
        public String N;
        public l2.d O;
        public long P;
        public int Q;
        public int R;
        public boolean S;
        public Notification T;
        public boolean U;
        public Object V;

        @Deprecated
        public ArrayList<String> W;

        /* renamed from: a, reason: collision with root package name */
        public Context f22243a;
        public ArrayList<a> b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList<r> f22244c;

        /* renamed from: d, reason: collision with root package name */
        public ArrayList<a> f22245d;

        /* renamed from: e, reason: collision with root package name */
        public CharSequence f22246e;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f22247f;

        /* renamed from: g, reason: collision with root package name */
        public String f22248g;

        /* renamed from: h, reason: collision with root package name */
        public PendingIntent f22249h;

        /* renamed from: i, reason: collision with root package name */
        public PendingIntent f22250i;

        /* renamed from: j, reason: collision with root package name */
        public RemoteViews f22251j;

        /* renamed from: k, reason: collision with root package name */
        public IconCompat f22252k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f22253l;

        /* renamed from: m, reason: collision with root package name */
        public int f22254m;

        /* renamed from: n, reason: collision with root package name */
        public int f22255n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f22256o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f22257p;

        /* renamed from: q, reason: collision with root package name */
        public i f22258q;

        /* renamed from: r, reason: collision with root package name */
        public CharSequence f22259r;

        /* renamed from: s, reason: collision with root package name */
        public CharSequence f22260s;

        /* renamed from: t, reason: collision with root package name */
        public CharSequence[] f22261t;

        /* renamed from: u, reason: collision with root package name */
        public int f22262u;

        /* renamed from: v, reason: collision with root package name */
        public int f22263v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f22264w;

        /* renamed from: x, reason: collision with root package name */
        public String f22265x;

        /* renamed from: y, reason: collision with root package name */
        public boolean f22266y;

        /* renamed from: z, reason: collision with root package name */
        public String f22267z;

        public static class a {
            public static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            public static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        public f(Context context, String str) {
            this.b = new ArrayList<>();
            this.f22244c = new ArrayList<>();
            this.f22245d = new ArrayList<>();
            this.f22256o = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.Q = 0;
            this.R = 0;
            Notification notification = new Notification();
            this.T = notification;
            this.f22243a = context;
            this.L = str;
            notification.when = System.currentTimeMillis();
            this.T.audioStreamType = -1;
            this.f22255n = 0;
            this.W = new ArrayList<>();
            this.S = true;
        }

        public static CharSequence e(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public f A(Uri uri) {
            Notification notification = this.T;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder d10 = a.d(a.c(a.b(), 4), 5);
            this.T.audioAttributes = a.a(d10);
            return this;
        }

        public f B(i iVar) {
            if (this.f22258q != iVar) {
                this.f22258q = iVar;
                if (iVar != null) {
                    iVar.g(this);
                }
            }
            return this;
        }

        public f C(CharSequence charSequence) {
            this.T.tickerText = e(charSequence);
            return this;
        }

        public f D(long j10) {
            this.P = j10;
            return this;
        }

        public f E(long[] jArr) {
            this.T.vibrate = jArr;
            return this;
        }

        public f F(int i10) {
            this.G = i10;
            return this;
        }

        public f G(long j10) {
            this.T.when = j10;
            return this;
        }

        public f a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public f b(a aVar) {
            if (aVar != null) {
                this.b.add(aVar);
            }
            return this;
        }

        public Notification c() {
            return new l(this).c();
        }

        public Bundle d() {
            if (this.E == null) {
                this.E = new Bundle();
            }
            return this.E;
        }

        public f f(boolean z10) {
            o(16, z10);
            return this;
        }

        public f g(String str) {
            this.L = str;
            return this;
        }

        public f h(int i10) {
            this.F = i10;
            return this;
        }

        public f i(RemoteViews remoteViews) {
            this.T.contentView = remoteViews;
            return this;
        }

        public f j(PendingIntent pendingIntent) {
            this.f22249h = pendingIntent;
            return this;
        }

        public f k(CharSequence charSequence) {
            this.f22247f = e(charSequence);
            return this;
        }

        public f l(CharSequence charSequence) {
            this.f22246e = e(charSequence);
            return this;
        }

        public f m(int i10) {
            Notification notification = this.T;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public f n(PendingIntent pendingIntent) {
            this.T.deleteIntent = pendingIntent;
            return this;
        }

        public final void o(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.T;
                notification.flags = i10 | notification.flags;
            } else {
                Notification notification2 = this.T;
                notification2.flags = (~i10) & notification2.flags;
            }
        }

        public f p(PendingIntent pendingIntent, boolean z10) {
            this.f22250i = pendingIntent;
            o(128, z10);
            return this;
        }

        public f q(String str) {
            this.f22265x = str;
            return this;
        }

        public f r(boolean z10) {
            this.f22266y = z10;
            return this;
        }

        public f s(Bitmap bitmap) {
            this.f22252k = bitmap == null ? null : IconCompat.c(k.d(this.f22243a, bitmap));
            return this;
        }

        public f t(int i10, int i11, int i12) {
            Notification notification = this.T;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public f u(boolean z10) {
            this.A = z10;
            return this;
        }

        public f v(int i10) {
            this.f22254m = i10;
            return this;
        }

        public f w(boolean z10) {
            o(2, z10);
            return this;
        }

        public f x(int i10) {
            this.f22255n = i10;
            return this;
        }

        public f y(boolean z10) {
            this.f22256o = z10;
            return this;
        }

        public f z(int i10) {
            this.T.icon = i10;
            return this;
        }

        @Deprecated
        public f(Context context) {
            this(context, null);
        }
    }
}

package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.l;
import androidx.annotation.NonNull;
import androidx.fragment.app.h;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f2277a;
    public final ArrayList<String> b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f2278c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f2279d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2280e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2281f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2282g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2283h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f2284i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2285j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f2286k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList<String> f2287l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList<String> f2288m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2289n;

    public class a implements Parcelable.Creator<BackStackRecordState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState[] newArray(int i10) {
            return new BackStackRecordState[i10];
        }
    }

    public BackStackRecordState(androidx.fragment.app.a aVar) {
        int size = aVar.f2485c.size();
        this.f2277a = new int[size * 6];
        if (!aVar.f2491i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.b = new ArrayList<>(size);
        this.f2278c = new int[size];
        this.f2279d = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            h.a aVar2 = aVar.f2485c.get(i11);
            int i12 = i10 + 1;
            this.f2277a[i10] = aVar2.f2502a;
            ArrayList<String> arrayList = this.b;
            c cVar = aVar2.b;
            arrayList.add(cVar != null ? cVar.f2415f : null);
            int[] iArr = this.f2277a;
            iArr[i12] = aVar2.f2503c ? 1 : 0;
            iArr[i10 + 2] = aVar2.f2504d;
            iArr[i10 + 3] = aVar2.f2505e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = aVar2.f2506f;
            i10 += 6;
            iArr[i13] = aVar2.f2507g;
            this.f2278c[i11] = aVar2.f2508h.ordinal();
            this.f2279d[i11] = aVar2.f2509i.ordinal();
        }
        this.f2280e = aVar.f2490h;
        this.f2281f = aVar.f2493k;
        this.f2282g = aVar.f2360v;
        this.f2283h = aVar.f2494l;
        this.f2284i = aVar.f2495m;
        this.f2285j = aVar.f2496n;
        this.f2286k = aVar.f2497o;
        this.f2287l = aVar.f2498p;
        this.f2288m = aVar.f2499q;
        this.f2289n = aVar.f2500r;
    }

    public final void a(@NonNull androidx.fragment.app.a aVar) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.f2277a.length) {
                aVar.f2490h = this.f2280e;
                aVar.f2493k = this.f2281f;
                aVar.f2491i = true;
                aVar.f2494l = this.f2283h;
                aVar.f2495m = this.f2284i;
                aVar.f2496n = this.f2285j;
                aVar.f2497o = this.f2286k;
                aVar.f2498p = this.f2287l;
                aVar.f2499q = this.f2288m;
                aVar.f2500r = this.f2289n;
                return;
            }
            h.a aVar2 = new h.a();
            int i12 = i10 + 1;
            aVar2.f2502a = this.f2277a[i10];
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + this.f2277a[i12]);
            }
            aVar2.f2508h = l.b.values()[this.f2278c[i11]];
            aVar2.f2509i = l.b.values()[this.f2279d[i11]];
            int[] iArr = this.f2277a;
            int i13 = i10 + 2;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            aVar2.f2503c = z10;
            int i14 = iArr[i13];
            aVar2.f2504d = i14;
            int i15 = iArr[i10 + 3];
            aVar2.f2505e = i15;
            int i16 = i10 + 5;
            int i17 = iArr[i10 + 4];
            aVar2.f2506f = i17;
            i10 += 6;
            int i18 = iArr[i16];
            aVar2.f2507g = i18;
            aVar.f2486d = i14;
            aVar.f2487e = i15;
            aVar.f2488f = i17;
            aVar.f2489g = i18;
            aVar.e(aVar2);
            i11++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public androidx.fragment.app.a f(@NonNull FragmentManager fragmentManager) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        a(aVar);
        aVar.f2360v = this.f2282g;
        for (int i10 = 0; i10 < this.b.size(); i10++) {
            String str = this.b.get(i10);
            if (str != null) {
                aVar.f2485c.get(i10).b = fragmentManager.k0(str);
            }
        }
        aVar.u(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f2277a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.f2278c);
        parcel.writeIntArray(this.f2279d);
        parcel.writeInt(this.f2280e);
        parcel.writeString(this.f2281f);
        parcel.writeInt(this.f2282g);
        parcel.writeInt(this.f2283h);
        TextUtils.writeToParcel(this.f2284i, parcel, 0);
        parcel.writeInt(this.f2285j);
        TextUtils.writeToParcel(this.f2286k, parcel, 0);
        parcel.writeStringList(this.f2287l);
        parcel.writeStringList(this.f2288m);
        parcel.writeInt(this.f2289n ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f2277a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.f2278c = parcel.createIntArray();
        this.f2279d = parcel.createIntArray();
        this.f2280e = parcel.readInt();
        this.f2281f = parcel.readString();
        this.f2282g = parcel.readInt();
        this.f2283h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f2284i = (CharSequence) creator.createFromParcel(parcel);
        this.f2285j = parcel.readInt();
        this.f2286k = (CharSequence) creator.createFromParcel(parcel);
        this.f2287l = parcel.createStringArrayList();
        this.f2288m = parcel.createStringArrayList();
        this.f2289n = parcel.readInt() != 0;
    }
}

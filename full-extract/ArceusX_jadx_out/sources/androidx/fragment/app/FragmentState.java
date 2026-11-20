package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.l;
import androidx.annotation.NonNull;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f2344a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2345c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2346d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2347e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2348f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2349g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2350h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2351i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2352j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2353k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2354l;

    /* renamed from: m, reason: collision with root package name */
    public final String f2355m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2356n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f2357o;

    public class a implements Parcelable.Creator<FragmentState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentState[] newArray(int i10) {
            return new FragmentState[i10];
        }
    }

    public FragmentState(c cVar) {
        this.f2344a = cVar.getClass().getName();
        this.b = cVar.f2415f;
        this.f2345c = cVar.f2425p;
        this.f2346d = cVar.f2427r;
        this.f2347e = cVar.f2435z;
        this.f2348f = cVar.A;
        this.f2349g = cVar.B;
        this.f2350h = cVar.E;
        this.f2351i = cVar.f2422m;
        this.f2352j = cVar.D;
        this.f2353k = cVar.C;
        this.f2354l = cVar.U.ordinal();
        this.f2355m = cVar.f2418i;
        this.f2356n = cVar.f2419j;
        this.f2357o = cVar.M;
    }

    @NonNull
    public c a(@NonNull e eVar, @NonNull ClassLoader classLoader) {
        c a10 = eVar.a(classLoader, this.f2344a);
        a10.f2415f = this.b;
        a10.f2425p = this.f2345c;
        a10.f2427r = this.f2346d;
        a10.f2428s = true;
        a10.f2435z = this.f2347e;
        a10.A = this.f2348f;
        a10.B = this.f2349g;
        a10.E = this.f2350h;
        a10.f2422m = this.f2351i;
        a10.D = this.f2352j;
        a10.C = this.f2353k;
        a10.U = l.b.values()[this.f2354l];
        a10.f2418i = this.f2355m;
        a10.f2419j = this.f2356n;
        a10.M = this.f2357o;
        return a10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f2344a);
        sb2.append(" (");
        sb2.append(this.b);
        sb2.append(")}:");
        if (this.f2345c) {
            sb2.append(" fromLayout");
        }
        if (this.f2346d) {
            sb2.append(" dynamicContainer");
        }
        if (this.f2348f != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f2348f));
        }
        String str = this.f2349g;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f2349g);
        }
        if (this.f2350h) {
            sb2.append(" retainInstance");
        }
        if (this.f2351i) {
            sb2.append(" removing");
        }
        if (this.f2352j) {
            sb2.append(" detached");
        }
        if (this.f2353k) {
            sb2.append(" hidden");
        }
        if (this.f2355m != null) {
            sb2.append(" targetWho=");
            sb2.append(this.f2355m);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f2356n);
        }
        if (this.f2357o) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f2344a);
        parcel.writeString(this.b);
        parcel.writeInt(this.f2345c ? 1 : 0);
        parcel.writeInt(this.f2346d ? 1 : 0);
        parcel.writeInt(this.f2347e);
        parcel.writeInt(this.f2348f);
        parcel.writeString(this.f2349g);
        parcel.writeInt(this.f2350h ? 1 : 0);
        parcel.writeInt(this.f2351i ? 1 : 0);
        parcel.writeInt(this.f2352j ? 1 : 0);
        parcel.writeInt(this.f2353k ? 1 : 0);
        parcel.writeInt(this.f2354l);
        parcel.writeString(this.f2355m);
        parcel.writeInt(this.f2356n);
        parcel.writeInt(this.f2357o ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.f2344a = parcel.readString();
        this.b = parcel.readString();
        this.f2345c = parcel.readInt() != 0;
        this.f2346d = parcel.readInt() != 0;
        this.f2347e = parcel.readInt();
        this.f2348f = parcel.readInt();
        this.f2349g = parcel.readString();
        this.f2350h = parcel.readInt() != 0;
        this.f2351i = parcel.readInt() != 0;
        this.f2352j = parcel.readInt() != 0;
        this.f2353k = parcel.readInt() != 0;
        this.f2354l = parcel.readInt();
        this.f2355m = parcel.readString();
        this.f2356n = parcel.readInt();
        this.f2357o = parcel.readInt() != 0;
    }
}

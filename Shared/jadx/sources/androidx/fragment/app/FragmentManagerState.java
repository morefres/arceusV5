package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<String> f2337a;
    public ArrayList<String> b;

    /* renamed from: c, reason: collision with root package name */
    public BackStackRecordState[] f2338c;

    /* renamed from: d, reason: collision with root package name */
    public int f2339d;

    /* renamed from: e, reason: collision with root package name */
    public String f2340e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList<String> f2341f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList<BackStackState> f2342g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList<FragmentManager.LaunchedFragmentInfo> f2343h;

    public class a implements Parcelable.Creator<FragmentManagerState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState[] newArray(int i10) {
            return new FragmentManagerState[i10];
        }
    }

    public FragmentManagerState() {
        this.f2340e = null;
        this.f2341f = new ArrayList<>();
        this.f2342g = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f2337a);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.f2338c, i10);
        parcel.writeInt(this.f2339d);
        parcel.writeString(this.f2340e);
        parcel.writeStringList(this.f2341f);
        parcel.writeTypedList(this.f2342g);
        parcel.writeTypedList(this.f2343h);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f2340e = null;
        this.f2341f = new ArrayList<>();
        this.f2342g = new ArrayList<>();
        this.f2337a = parcel.createStringArrayList();
        this.b = parcel.createStringArrayList();
        this.f2338c = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f2339d = parcel.readInt();
        this.f2340e = parcel.readString();
        this.f2341f = parcel.createStringArrayList();
        this.f2342g = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f2343h = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}

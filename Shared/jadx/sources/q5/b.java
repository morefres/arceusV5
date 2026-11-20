package q5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f29543d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f29544e;

    /* renamed from: f, reason: collision with root package name */
    public final int f29545f;

    /* renamed from: g, reason: collision with root package name */
    public final int f29546g;

    /* renamed from: h, reason: collision with root package name */
    public final String f29547h;

    /* renamed from: i, reason: collision with root package name */
    public int f29548i;

    /* renamed from: j, reason: collision with root package name */
    public int f29549j;

    /* renamed from: k, reason: collision with root package name */
    public int f29550k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new w1.a(), new w1.a(), new w1.a());
    }

    @Override // q5.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f29544e.writeInt(-1);
        } else {
            this.f29544e.writeInt(bArr.length);
            this.f29544e.writeByteArray(bArr);
        }
    }

    @Override // q5.a
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f29544e, 0);
    }

    @Override // q5.a
    public void E(int i10) {
        this.f29544e.writeInt(i10);
    }

    @Override // q5.a
    public void G(Parcelable parcelable) {
        this.f29544e.writeParcelable(parcelable, 0);
    }

    @Override // q5.a
    public void I(String str) {
        this.f29544e.writeString(str);
    }

    @Override // q5.a
    public void a() {
        int i10 = this.f29548i;
        if (i10 >= 0) {
            int i11 = this.f29543d.get(i10);
            int dataPosition = this.f29544e.dataPosition();
            this.f29544e.setDataPosition(i11);
            this.f29544e.writeInt(dataPosition - i11);
            this.f29544e.setDataPosition(dataPosition);
        }
    }

    @Override // q5.a
    public a b() {
        Parcel parcel = this.f29544e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f29549j;
        if (i10 == this.f29545f) {
            i10 = this.f29546g;
        }
        return new b(parcel, dataPosition, i10, this.f29547h + "  ", this.f29541a, this.b, this.f29542c);
    }

    @Override // q5.a
    public boolean g() {
        return this.f29544e.readInt() != 0;
    }

    @Override // q5.a
    public byte[] i() {
        int readInt = this.f29544e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f29544e.readByteArray(bArr);
        return bArr;
    }

    @Override // q5.a
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f29544e);
    }

    @Override // q5.a
    public boolean m(int i10) {
        while (this.f29549j < this.f29546g) {
            int i11 = this.f29550k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f29544e.setDataPosition(this.f29549j);
            int readInt = this.f29544e.readInt();
            this.f29550k = this.f29544e.readInt();
            this.f29549j += readInt;
        }
        return this.f29550k == i10;
    }

    @Override // q5.a
    public int o() {
        return this.f29544e.readInt();
    }

    @Override // q5.a
    public <T extends Parcelable> T q() {
        return (T) this.f29544e.readParcelable(getClass().getClassLoader());
    }

    @Override // q5.a
    public String s() {
        return this.f29544e.readString();
    }

    @Override // q5.a
    public void w(int i10) {
        a();
        this.f29548i = i10;
        this.f29543d.put(i10, this.f29544e.dataPosition());
        E(0);
        E(i10);
    }

    @Override // q5.a
    public void y(boolean z10) {
        this.f29544e.writeInt(z10 ? 1 : 0);
    }

    public b(Parcel parcel, int i10, int i11, String str, w1.a<String, Method> aVar, w1.a<String, Method> aVar2, w1.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f29543d = new SparseIntArray();
        this.f29548i = -1;
        this.f29550k = -1;
        this.f29544e = parcel;
        this.f29545f = i10;
        this.f29546g = i11;
        this.f29549j = i10;
        this.f29547h = str;
    }
}

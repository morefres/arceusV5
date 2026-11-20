package n9;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;

/* loaded from: classes.dex */
public final class d1 implements Parcelable.Creator {
    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.n(parcel, 1, getServiceRequest.f5824f);
        o9.b.n(parcel, 2, getServiceRequest.f5825g);
        o9.b.n(parcel, 3, getServiceRequest.f5826h);
        o9.b.v(parcel, 4, getServiceRequest.f5827i, false);
        o9.b.m(parcel, 5, getServiceRequest.f5828j, false);
        o9.b.y(parcel, 6, getServiceRequest.f5829k, i10, false);
        o9.b.f(parcel, 7, getServiceRequest.f5830l, false);
        o9.b.t(parcel, 8, getServiceRequest.f5831m, i10, false);
        o9.b.y(parcel, 10, getServiceRequest.f5832n, i10, false);
        o9.b.y(parcel, 11, getServiceRequest.f5833o, i10, false);
        o9.b.c(parcel, 12, getServiceRequest.f5834p);
        o9.b.n(parcel, 13, getServiceRequest.f5835q);
        o9.b.c(parcel, 14, getServiceRequest.f5836r);
        o9.b.v(parcel, 15, getServiceRequest.v3(), false);
        o9.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        Scope[] scopeArr = GetServiceRequest.f5822t;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f5823u;
        Feature[] featureArr2 = featureArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 1:
                    i10 = o9.a.w(parcel, u8);
                    break;
                case 2:
                    i11 = o9.a.w(parcel, u8);
                    break;
                case 3:
                    i12 = o9.a.w(parcel, u8);
                    break;
                case 4:
                    str = o9.a.h(parcel, u8);
                    break;
                case 5:
                    iBinder = o9.a.v(parcel, u8);
                    break;
                case 6:
                    scopeArr = (Scope[]) o9.a.k(parcel, u8, Scope.CREATOR);
                    break;
                case 7:
                    bundle = o9.a.b(parcel, u8);
                    break;
                case 8:
                    account = (Account) o9.a.g(parcel, u8, Account.CREATOR);
                    break;
                case 9:
                default:
                    o9.a.C(parcel, u8);
                    break;
                case 10:
                    featureArr = (Feature[]) o9.a.k(parcel, u8, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) o9.a.k(parcel, u8, Feature.CREATOR);
                    break;
                case 12:
                    z10 = o9.a.o(parcel, u8);
                    break;
                case 13:
                    i13 = o9.a.w(parcel, u8);
                    break;
                case 14:
                    z11 = o9.a.o(parcel, u8);
                    break;
                case 15:
                    str2 = o9.a.h(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new GetServiceRequest(i10, i11, i12, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z10, i13, z11, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GetServiceRequest[i10];
    }
}

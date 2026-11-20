package ca;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        Double d10 = null;
        ArrayList arrayList2 = null;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
        Integer num = null;
        TokenBinding tokenBinding = null;
        String str = null;
        AuthenticationExtensions authenticationExtensions = null;
        String str2 = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 2:
                    publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) o9.a.g(parcel, u8, PublicKeyCredentialRpEntity.CREATOR);
                    break;
                case 3:
                    publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) o9.a.g(parcel, u8, PublicKeyCredentialUserEntity.CREATOR);
                    break;
                case 4:
                    bArr = o9.a.c(parcel, u8);
                    break;
                case 5:
                    arrayList = o9.a.l(parcel, u8, PublicKeyCredentialParameters.CREATOR);
                    break;
                case 6:
                    d10 = o9.a.r(parcel, u8);
                    break;
                case 7:
                    arrayList2 = o9.a.l(parcel, u8, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 8:
                    authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) o9.a.g(parcel, u8, AuthenticatorSelectionCriteria.CREATOR);
                    break;
                case 9:
                    num = o9.a.x(parcel, u8);
                    break;
                case 10:
                    tokenBinding = (TokenBinding) o9.a.g(parcel, u8, TokenBinding.CREATOR);
                    break;
                case 11:
                    str = o9.a.h(parcel, u8);
                    break;
                case 12:
                    authenticationExtensions = (AuthenticationExtensions) o9.a.g(parcel, u8, AuthenticationExtensions.CREATOR);
                    break;
                case 13:
                    str2 = o9.a.h(parcel, u8);
                    break;
                case 14:
                    resultReceiver = (ResultReceiver) o9.a.g(parcel, u8, ResultReceiver.CREATOR);
                    break;
                default:
                    o9.a.C(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, arrayList, d10, arrayList2, authenticatorSelectionCriteria, num, tokenBinding, str, authenticationExtensions, str2, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PublicKeyCredentialCreationOptions[i10];
    }
}

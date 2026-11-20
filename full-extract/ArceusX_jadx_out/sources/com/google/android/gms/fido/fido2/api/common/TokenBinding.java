package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eb.l0;
import java.util.Arrays;
import n9.m;

/* loaded from: classes.dex */
public class TokenBinding extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TokenBinding> CREATOR = new q();

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public static final TokenBinding f6061h = new TokenBinding(TokenBindingStatus.SUPPORTED.toString(), null);

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public static final TokenBinding f6062i = new TokenBinding(TokenBindingStatus.NOT_SUPPORTED.toString(), null);

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TokenBindingStatus f6063f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6064g;

    public enum TokenBindingStatus implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");


        @NonNull
        public static final Parcelable.Creator<TokenBindingStatus> CREATOR = new e();

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public final String f6068a;

        TokenBindingStatus(@NonNull String str) {
            this.f6068a = str;
        }

        @NonNull
        public static TokenBindingStatus a(@NonNull String str) {
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.f6068a)) {
                    return tokenBindingStatus;
                }
            }
            throw new a(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.f6068a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            parcel.writeString(this.f6068a);
        }
    }

    public static class a extends Exception {
        public a(@NonNull String str) {
            super(String.format("TokenBindingStatus %s not supported", str));
        }
    }

    public TokenBinding(@NonNull String str, String str2) {
        m.l(str);
        try {
            this.f6063f = TokenBindingStatus.a(str);
            this.f6064g = str2;
        } catch (a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        return l0.a(this.f6063f, tokenBinding.f6063f) && l0.a(this.f6064g, tokenBinding.f6064g);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6063f, this.f6064g});
    }

    public String v3() {
        return this.f6064g;
    }

    @NonNull
    public String w3() {
        return this.f6063f.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.v(parcel, 2, w3(), false);
        o9.b.v(parcel, 3, v3(), false);
        o9.b.b(parcel, a10);
    }
}

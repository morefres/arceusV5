package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.k;
import n9.m;
import z8.i;

@Deprecated
/* loaded from: classes.dex */
public class SavePasswordRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new i();

    /* renamed from: f, reason: collision with root package name */
    public final SignInPassword f5644f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5645g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5646h;

    @Deprecated
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public SignInPassword f5647a;
        public String b;

        /* renamed from: c, reason: collision with root package name */
        public int f5648c;

        @NonNull
        public SavePasswordRequest a() {
            return new SavePasswordRequest(this.f5647a, this.b, this.f5648c);
        }

        @NonNull
        public a b(@NonNull SignInPassword signInPassword) {
            this.f5647a = signInPassword;
            return this;
        }

        @NonNull
        public final a c(@NonNull String str) {
            this.b = str;
            return this;
        }

        @NonNull
        public final a d(int i10) {
            this.f5648c = i10;
            return this;
        }
    }

    public SavePasswordRequest(SignInPassword signInPassword, String str, int i10) {
        this.f5644f = (SignInPassword) m.l(signInPassword);
        this.f5645g = str;
        this.f5646h = i10;
    }

    @NonNull
    public static a v3() {
        return new a();
    }

    @NonNull
    public static a x3(@NonNull SavePasswordRequest savePasswordRequest) {
        m.l(savePasswordRequest);
        a v32 = v3();
        v32.b(savePasswordRequest.w3());
        v32.d(savePasswordRequest.f5646h);
        String str = savePasswordRequest.f5645g;
        if (str != null) {
            v32.c(str);
        }
        return v32;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        return k.b(this.f5644f, savePasswordRequest.f5644f) && k.b(this.f5645g, savePasswordRequest.f5645g) && this.f5646h == savePasswordRequest.f5646h;
    }

    public int hashCode() {
        return k.c(this.f5644f, this.f5645g);
    }

    @NonNull
    public SignInPassword w3() {
        return this.f5644f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.t(parcel, 1, w3(), i10, false);
        o9.b.v(parcel, 2, this.f5645g, false);
        o9.b.n(parcel, 3, this.f5646h);
        o9.b.b(parcel, a10);
    }
}

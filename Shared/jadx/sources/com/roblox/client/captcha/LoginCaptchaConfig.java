package com.roblox.client.captcha;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import rg.a1;

/* loaded from: classes2.dex */
public class LoginCaptchaConfig implements CaptchaConfig {
    public static final Parcelable.Creator<LoginCaptchaConfig> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public String f9027a;
    public String b;

    public class a implements Parcelable.Creator<LoginCaptchaConfig> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoginCaptchaConfig createFromParcel(Parcel parcel) {
            return new LoginCaptchaConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public LoginCaptchaConfig[] newArray(int i10) {
            return new LoginCaptchaConfig[i10];
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9028a;

        static {
            int[] iArr = new int[c.values().length];
            f9028a = iArr;
            try {
                iArr[c.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9028a[c.PHONE_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9028a[c.USERNAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum c {
        USERNAME,
        EMAIL,
        PHONE_NUMBER
    }

    public static String a(c cVar) {
        int i10 = b.f9028a[cVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? "username" : "phonenumber" : NotificationCompat.CATEGORY_EMAIL;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.roblox.client.captcha.CaptchaConfig
    public String getUrl() {
        return a1.p(this.f9027a, this.b);
    }

    public String toString() {
        return "CredentialType: " + this.f9027a + ". CredentialValue: " + this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9027a);
        parcel.writeString(this.b);
    }

    public LoginCaptchaConfig(c cVar, String str) {
        this.f9027a = a(cVar);
        this.b = str;
    }

    public LoginCaptchaConfig(Parcel parcel) {
        this.f9027a = parcel.readString();
        this.b = parcel.readString();
    }
}

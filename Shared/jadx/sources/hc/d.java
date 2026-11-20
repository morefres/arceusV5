package hc;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import e3.i0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lhc/d;", "Le3/i0;", "", "id", "idToken", "displayName", "familyName", "givenName", "Landroid/net/Uri;", "profilePictureUri", "phoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "m", j6.b.f21518e, ve.a.f33391e, "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d extends i0 {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f19213d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f19214e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f19215f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f19216g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public final String f19217h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public final Uri f19218i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public final String f19219j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public final String f19220k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    public final String f19221l;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\u0007J\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0007J\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0007J\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0007J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019¨\u0006\u001b"}, d2 = {"Lhc/d$a;", "", "<init>", "()V", "", "displayName", j6.b.f21518e, "(Ljava/lang/String;)Lhc/d$a;", "familyName", "c", "givenName", rl.d.f30696a, "id", "e", "idToken", "f", "phoneNumber", "g", "Landroid/net/Uri;", "profilePictureUri", "h", "(Landroid/net/Uri;)Lhc/d$a;", "Lhc/d;", ve.a.f33391e, "()Lhc/d;", "Ljava/lang/String;", "Landroid/net/Uri;", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public String f19222a = "";

        @NotNull
        public String b = "";

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        public String f19223c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        public String f19224d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        public String f19225e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        public Uri f19226f;

        /* renamed from: g, reason: collision with root package name */
        @Nullable
        public String f19227g;

        @NotNull
        public final d a() {
            return new d(this.f19222a, this.b, this.f19223c, this.f19224d, this.f19225e, this.f19226f, this.f19227g);
        }

        @NotNull
        public final a b(@Nullable String displayName) {
            this.f19223c = displayName;
            return this;
        }

        @NotNull
        public final a c(@Nullable String familyName) {
            this.f19224d = familyName;
            return this;
        }

        @NotNull
        public final a d(@Nullable String givenName) {
            this.f19225e = givenName;
            return this;
        }

        @NotNull
        public final a e(@NonNull String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f19222a = id2;
            return this;
        }

        @NotNull
        public final a f(@NonNull String idToken) {
            Intrinsics.checkNotNullParameter(idToken, "idToken");
            this.b = idToken;
            return this;
        }

        @NotNull
        public final a g(@Nullable String phoneNumber) {
            this.f19227g = phoneNumber;
            return this;
        }

        @NotNull
        public final a h(@Nullable Uri profilePictureUri) {
            this.f19226f = profilePictureUri;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJQ\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00078\u0000X\u0081T¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u0012\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00078\u0000X\u0081T¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u0012\u0004\b\u001e\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u00078\u0000X\u0081T¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u0012\u0004\b \u0010\u001cR\u001a\u0010!\u001a\u00020\u00078\u0000X\u0081T¢\u0006\f\n\u0004\b!\u0010\u0017\u0012\u0004\b\"\u0010\u001cR\u001a\u0010#\u001a\u00020\u00078\u0000X\u0081T¢\u0006\f\n\u0004\b#\u0010\u0017\u0012\u0004\b$\u0010\u001cR\u001a\u0010%\u001a\u00020\u00078\u0000X\u0081T¢\u0006\f\n\u0004\b%\u0010\u0017\u0012\u0004\b&\u0010\u001cR\u001a\u0010'\u001a\u00020\u00078\u0000X\u0081T¢\u0006\f\n\u0004\b'\u0010\u0017\u0012\u0004\b(\u0010\u001c¨\u0006)"}, d2 = {"Lhc/d$b;", "", "Landroid/os/Bundle;", "data", "Lhc/d;", ve.a.f33391e, "(Landroid/os/Bundle;)Lhc/d;", "", "idToken", "Lkotlin/Pair;", "parseIdToken", "(Ljava/lang/String;)Lkotlin/Pair;", "id", "displayName", "familyName", "givenName", "Landroid/net/Uri;", "profilePictureUri", "phoneNumber", "toBundle$java_com_google_android_libraries_identity_googleid_granule_granule", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)Landroid/os/Bundle;", "toBundle", "TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", "Ljava/lang/String;", "TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL", "BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "BUNDLE_KEY_ID", "getBUNDLE_KEY_ID$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "()V", "BUNDLE_KEY_ID_TOKEN", "getBUNDLE_KEY_ID_TOKEN$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_DISPLAY_NAME", "getBUNDLE_KEY_DISPLAY_NAME$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_FAMILY_NAME", "getBUNDLE_KEY_FAMILY_NAME$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_GIVEN_NAME", "getBUNDLE_KEY_GIVEN_NAME$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_PROFILE_PICTURE_URI", "getBUNDLE_KEY_PROFILE_PICTURE_URI$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_PHONE_NUMBER", "getBUNDLE_KEY_PHONE_NUMBER$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hc.d$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(@NonNull DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NonNull
        public static final /* synthetic */ Pair b(@NonNull Companion companion, @NonNull String str) {
            return c(str);
        }

        public static final Pair c(String str) {
            List split$default = StringsKt.split$default(str, new String[]{"."}, false, 0, 6, null);
            if (split$default.size() != 3) {
                throw new IllegalArgumentException("Invalid token format");
            }
            try {
                byte[] decode = Base64.decode((String) split$default.get(1), 8);
                Intrinsics.checkNotNull(decode);
                Charset UTF_8 = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                JSONObject jSONObject = new JSONObject(new String(decode, UTF_8));
                String optString = jSONObject.optString(NotificationCompat.CATEGORY_EMAIL);
                String str2 = null;
                if (optString.length() == 0) {
                    optString = null;
                }
                String optString2 = jSONObject.optString("sub");
                if (optString2.length() != 0) {
                    str2 = optString2;
                }
                if (str2 != null) {
                    return new Pair(optString, str2);
                }
                throw new IllegalArgumentException("ID token missing required field: sub");
            } catch (JSONException e10) {
                throw new IllegalArgumentException(e10);
            }
        }

        @NotNull
        public final d a(@NonNull Bundle data) {
            Intrinsics.checkNotNullParameter(data, "data");
            try {
                String string = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
                String string2 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
                String string3 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
                String string4 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
                String string5 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
                Uri uri = Build.VERSION.SDK_INT >= 33 ? (Uri) data.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class) : (Uri) data.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
                String string6 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
                Intrinsics.checkNotNull(string);
                Intrinsics.checkNotNull(string2);
                return new d(string, string2, string3, string4, string5, uri, string6);
            } catch (Exception e10) {
                throw new e(e10);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull java.lang.String r4, @org.jetbrains.annotations.Nullable java.lang.String r5, @org.jetbrains.annotations.Nullable java.lang.String r6, @org.jetbrains.annotations.Nullable java.lang.String r7, @org.jetbrains.annotations.Nullable android.net.Uri r8, @org.jetbrains.annotations.Nullable java.lang.String r9) {
        /*
            r2 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r1 = "idToken"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID"
            r0.putString(r1, r3)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN"
            r0.putString(r1, r4)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME"
            r0.putString(r1, r5)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME"
            r0.putString(r1, r6)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME"
            r0.putString(r1, r7)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER"
            r0.putString(r1, r9)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI"
            r0.putParcelable(r1, r8)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL"
            r2.<init>(r1, r0)
            r2.f19213d = r3
            r2.f19214e = r4
            r2.f19215f = r5
            r2.f19216g = r6
            r2.f19217h = r7
            r2.f19218i = r8
            r2.f19219j = r9
            int r3 = r3.length()
            if (r3 <= 0) goto L76
            int r3 = r4.length()
            if (r3 <= 0) goto L6e
            hc.d$b r3 = hc.d.INSTANCE
            kotlin.Pair r3 = hc.d.Companion.b(r3, r4)
            java.lang.Object r4 = r3.a()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.b()
            java.lang.String r3 = (java.lang.String) r3
            r2.f19220k = r4
            r2.f19221l = r3
            return
        L6e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "idToken should not be empty"
            r3.<init>(r4)
            throw r3
        L76:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "id should not be empty"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: hc.d.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.net.Uri, java.lang.String):void");
    }

    @NotNull
    /* renamed from: c, reason: from getter */
    public final String getF19214e() {
        return this.f19214e;
    }
}

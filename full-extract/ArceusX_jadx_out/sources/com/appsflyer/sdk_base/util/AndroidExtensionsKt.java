package com.appsflyer.sdk_base.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\f\u0010\b\u001a\u00020\u0004*\u00020\tH\u0007¨\u0006\n"}, d2 = {"getVersionCode", "", "Landroid/content/Context;", "packageName", "", "getVersionName", "signature", "Landroid/content/pm/PackageManager;", "bytesToUpperHexString", "", "sdk_base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidExtensionsKt {
    @NotNull
    public static final String bytesToUpperHexString(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return m.Z(bArr, "", null, null, 0, null, new Function1() { // from class: com.appsflyer.sdk_base.util.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence bytesToUpperHexString$lambda$0;
                bytesToUpperHexString$lambda$0 = AndroidExtensionsKt.bytesToUpperHexString$lambda$0(((Byte) obj).byteValue());
                return bytesToUpperHexString$lambda$0;
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence bytesToUpperHexString$lambda$0(byte b) {
        String format = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final long getVersionCode(@NotNull Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            return Build.VERSION.SDK_INT >= 28 ? context.getPackageManager().getPackageInfo(packageName, 0).getLongVersionCode() : r1.versionCode;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Nullable
    public static final String getVersionName(@NotNull Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            return context.getPackageManager().getPackageInfo(packageName, 0).versionName;
        } catch (Throwable unused) {
            return "";
        }
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    @Nullable
    public static final String signature(@NotNull PackageManager packageManager, @NotNull String packageName) {
        Signature[] signatureArr;
        SigningInfo signingInfo;
        SigningInfo signingInfo2;
        Intrinsics.checkNotNullParameter(packageManager, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(134217728L));
            Intrinsics.checkNotNullExpressionValue(packageInfo, "getPackageInfo(...)");
            signingInfo2 = packageInfo.signingInfo;
            if (signingInfo2 == null || (signatureArr = signingInfo2.getApkContentsSigners()) == null) {
                return null;
            }
        } else if (i10 >= 28) {
            signingInfo = packageManager.getPackageInfo(packageName, 134217728).signingInfo;
            if (signingInfo == null || (signatureArr = signingInfo.getApkContentsSigners()) == null) {
                return null;
            }
        } else {
            signatureArr = packageManager.getPackageInfo(packageName, 64).signatures;
            if (signatureArr == null) {
                return null;
            }
        }
        if (signatureArr.length == 0) {
            return null;
        }
        Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
        Intrinsics.d(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        messageDigest.update(((X509Certificate) generateCertificate).getEncoded());
        byte[] digest = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
        return bytesToUpperHexString(digest);
    }
}

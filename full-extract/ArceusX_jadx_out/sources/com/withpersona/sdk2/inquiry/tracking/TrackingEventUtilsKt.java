package com.withpersona.sdk2.inquiry.tracking;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import kotlin.Metadata;
import kotlin.text.Regex;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0004\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "data", "publicKeyPem", "Lcom/withpersona/sdk2/inquiry/tracking/ObfuscationResult;", "obfuscatePayload", "(Ljava/lang/String;Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "(Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "pem", "Ljava/security/PublicKey;", "parsePublicKeyPem", "(Ljava/lang/String;)Ljava/security/PublicKey;", "", "GCM_TAG_LENGTH_BITS", "I", "GCM_IV_LENGTH_BYTES", "AES_KEY_LENGTH_BYTES", "TEST_OBFUSCATION_KEY", "Ljava/lang/String;", "tracking-events_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrackingEventUtilsKt {
    private static final int AES_KEY_LENGTH_BYTES = 32;
    private static final int GCM_IV_LENGTH_BYTES = 12;
    private static final int GCM_TAG_LENGTH_BITS = 128;

    @NotNull
    private static final String TEST_OBFUSCATION_KEY = "4ERbfREmnh82jvK5QaXOv8jZ3OQq9hKg5o/Hbb3l9bk=";

    /* JADX WARN: Removed duplicated region for block: B:25:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object obfuscatePayload(@org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.NotNull java.lang.String r20, @org.jetbrains.annotations.NotNull mt.b<? super com.withpersona.sdk2.inquiry.tracking.ObfuscationResult> r21) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.tracking.TrackingEventUtilsKt.obfuscatePayload(java.lang.String, java.lang.String, mt.b):java.lang.Object");
    }

    private static final PublicKey parsePublicKeyPem(String str) {
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(new Regex("\\s").replace(x.N(x.N(str, "-----BEGIN PUBLIC KEY-----", "", false, 4, null), "-----END PUBLIC KEY-----", "", false, 4, null), ""), 0)));
        generatePublic.getClass();
        return generatePublic;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object obfuscatePayload(@org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull mt.b<? super java.lang.String> r14) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.tracking.TrackingEventUtilsKt.obfuscatePayload(java.lang.String, mt.b):java.lang.Object");
    }
}

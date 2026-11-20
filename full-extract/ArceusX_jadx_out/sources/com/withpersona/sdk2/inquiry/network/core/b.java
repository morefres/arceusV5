package com.withpersona.sdk2.inquiry.network.core;

import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Handshake;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class b extends EventListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<String, Unit> f12224a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Function1<? super String, Unit> function1) {
        this.f12224a = function1;
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(@NotNull Call call, @Nullable Handshake handshake) {
        List<Certificate> peerCertificates;
        Certificate certificate;
        if (handshake == null || (peerCertificates = handshake.peerCertificates()) == null || (certificate = (Certificate) CollectionsKt.firstOrNull(peerCertificates)) == null) {
            return;
        }
        this.f12224a.invoke(kotlin.text.e.i(MessageDigest.getInstance("SHA-256").digest(certificate.getEncoded()), null, 1, null));
    }
}

package com.withpersona.sdk2.inquiry.steps.ui.mdoc;

import com.withpersona.sdk2.inquiry.network.dto.ui.components.Mdoc;
import com.withpersona.sdk2.inquiry.steps.ui.mdoc.MdocRequestMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;", "Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata;", ve.a.f33391e, "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;)Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {
    @Nullable
    public static final MdocRequestMetadata a(@NotNull Mdoc.Provider provider) {
        Mdoc.ClientMetadata clientMetadata;
        String requestJsonString;
        String nonce;
        MdocRequestMetadata.a aVar;
        Intrinsics.checkNotNullParameter(provider, "<this>");
        if (!Intrinsics.c(provider.getProviderType(), "google_wallet") || (clientMetadata = provider.getClientMetadata()) == null || (requestJsonString = clientMetadata.getRequestJsonString()) == null) {
            return null;
        }
        try {
            new JSONObject(requestJsonString);
            nonce = provider.getNonce();
        } catch (Exception unused) {
        }
        if (nonce == null) {
            return null;
        }
        String idType = provider.getIdType();
        if (!Intrinsics.c(idType, "dl")) {
            if (Intrinsics.c(idType, "pp")) {
                aVar = MdocRequestMetadata.a.b;
            }
            return null;
        }
        aVar = MdocRequestMetadata.a.f13658a;
        return new MdocRequestMetadata.GoogleWalletRequestMetadata(nonce, aVar, requestJsonString);
    }
}

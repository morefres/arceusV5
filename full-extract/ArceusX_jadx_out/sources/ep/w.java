package ep;

import com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequest;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquirySessionRequest;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquirySessionResponse;
import com.withpersona.sdk2.inquiry.internal.network.ErrorRequest;
import com.withpersona.sdk2.inquiry.internal.network.ExchangeOneTimeLinkCodeRequest;
import com.withpersona.sdk2.inquiry.internal.network.ExchangeOneTimeLinkCodeResponse;
import com.withpersona.sdk2.inquiry.internal.network.TransitionBackRequest;
import com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest;
import com.withpersona.sdk2.inquiry.internal.network.VerifyDeviceIntegrityRequest;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import com.withpersona.sdk2.inquiry.ui.network.TransitionInquiryRequest;
import java.util.List;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\tJ,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\r\u0010\u000eJ@\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0018H§@¢\u0006\u0004\b\u0019\u0010\u001aJ4\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\u000e\b\u0001\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH§@¢\u0006\u0004\b!\u0010\"J4\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020#H§@¢\u0006\u0004\b$\u0010%J \u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0004H§@¢\u0006\u0004\b&\u0010'J*\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020(H§@¢\u0006\u0004\b)\u0010*J \u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00062\b\b\u0001\u0010\u0003\u001a\u00020+H§@¢\u0006\u0004\b-\u0010.¨\u0006/À\u0006\u0003"}, d2 = {"Lep/w;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;", "request", "", "fallbackMode", "Liv/x;", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;", "j", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;", "deviceId", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;", "c", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "sessionToken", "inquiryId", "include", j6.b.f21518e, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "Lokhttp3/ResponseBody;", "i", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;Lmt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/VerifyDeviceIntegrityRequest;", "k", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/VerifyDeviceIntegrityRequest;Lmt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;", ve.a.f33391e, "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;Lmt/b;)Ljava/lang/Object;", "", "Lokhttp3/MultipartBody$Part;", "body", rl.d.f30696a, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lmt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;", "f", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;Lmt/b;)Ljava/lang/Object;", "e", "(Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;", "h", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;Lmt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest;", "Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeResponse;", "g", "(Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest;Lmt/b;)Ljava/lang/Object;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface w {
    @lv.o("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    @Nullable
    Object a(@lv.i("Authorization") @NotNull String str, @lv.s("inquiryId") @NotNull String str2, @lv.a @NotNull TransitionInquiryRequest transitionInquiryRequest, @NotNull mt.b<? super iv.x<CheckInquiryResponse>> bVar);

    @lv.f("/api/internal/verify/v1/inquiries/{inquiryId}")
    @Nullable
    Object b(@lv.i("Authorization") @NotNull String str, @lv.i("Persona-Device-Id") @Nullable String str2, @lv.s("inquiryId") @NotNull String str3, @lv.t("include") @NotNull String str4, @NotNull mt.b<? super iv.x<CheckInquiryResponse>> bVar);

    @lv.o("/api/internal/verify/v1/inquiry-sessions")
    @Nullable
    Object c(@lv.a @NotNull CreateInquirySessionRequest createInquirySessionRequest, @lv.i("Persona-Device-Id") @Nullable String str, @NotNull mt.b<? super iv.x<CreateInquirySessionResponse>> bVar);

    @lv.l
    @lv.k({"Accept: multipart/form-data"})
    @Nullable
    @lv.o("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    Object d(@lv.i("Authorization") @NotNull String str, @lv.s("inquiryId") @NotNull String str2, @lv.q @NotNull List<MultipartBody.Part> list, @NotNull mt.b<? super iv.x<CheckInquiryResponse>> bVar);

    @lv.o("/api/internal/verify/v1/current-inquiry-session/cancel")
    @Nullable
    Object e(@lv.i("Authorization") @NotNull String str, @NotNull mt.b<? super iv.x<ResponseBody>> bVar);

    @lv.o("/api/internal/verify/v1/inquiries/{inquiryId}/transition-back")
    @Nullable
    Object f(@lv.i("Authorization") @NotNull String str, @lv.s("inquiryId") @NotNull String str2, @lv.a @NotNull TransitionBackRequest transitionBackRequest, @NotNull mt.b<? super iv.x<CheckInquiryResponse>> bVar);

    @lv.o("/api/internal/verify/v1/inquiry-sessions/exchange-one-time-link-code")
    @Nullable
    Object g(@lv.a @NotNull ExchangeOneTimeLinkCodeRequest exchangeOneTimeLinkCodeRequest, @NotNull mt.b<? super iv.x<ExchangeOneTimeLinkCodeResponse>> bVar);

    @lv.o("/api/internal/verify/v1/current-inquiry-session/error")
    @Nullable
    Object h(@lv.i("Authorization") @NotNull String str, @lv.a @NotNull ErrorRequest errorRequest, @NotNull mt.b<? super iv.x<ResponseBody>> bVar);

    @lv.n("/api/internal/verify/v1/current-inquiry-session")
    @Nullable
    Object i(@lv.i("Authorization") @NotNull String str, @lv.a @NotNull UpdateInquirySessionRequest updateInquirySessionRequest, @NotNull mt.b<? super iv.x<ResponseBody>> bVar);

    @lv.o("/api/internal/verify/v1/inquiries")
    @Nullable
    Object j(@lv.a @NotNull CreateInquiryRequest createInquiryRequest, @lv.i("Persona-Fallback-Mode") @Nullable String str, @NotNull mt.b<? super iv.x<CheckInquiryResponse>> bVar);

    @lv.o("/api/internal/verify/v1/current-inquiry-session/verify-device-integrity")
    @Nullable
    Object k(@lv.i("Authorization") @NotNull String str, @lv.a @NotNull VerifyDeviceIntegrityRequest verifyDeviceIntegrityRequest, @NotNull mt.b<? super iv.x<ResponseBody>> bVar);
}

package zl;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.tasks.Task;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import zl.m;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ%\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lzl/m;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Lorg/json/JSONObject;", "params", "Lzl/m$a;", "callback", "", "m", "(Landroid/app/Activity;Lorg/json/JSONObject;Lzl/m$a;)V", "y", t.f38095d, "Le9/b;", "x", "(Landroid/app/Activity;)Le9/b;", ve.a.f33391e, j6.b.f21518e, "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class m {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lzl/m$a;", "", "", "jsonResult", "requestType", "", ve.a.f33391e, "(Ljava/lang/String;Ljava/lang/String;)V", "", "errorCode", "errorMsg", j6.b.f21518e, "(ILjava/lang/String;)V", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        void a(@NotNull String jsonResult, @Nullable String requestType);

        void b(int errorCode, @Nullable String errorMsg);
    }

    public static final void A(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void B(a aVar, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Log.e("BlockStoreManager", "Error retrieving from Block Store: ", e10);
        aVar.b(0, e10.getMessage());
    }

    public static final Unit n(StoreBytesData.a aVar, e9.b bVar, final a aVar2, Boolean bool) {
        if (bool.booleanValue()) {
            aVar.d(true);
            Log.d("BlockStoreManager", "E2EE is available, enable backing up bytes to the cloud.");
        } else {
            Log.d("BlockStoreManager", "E2EE is not available, only store bytes for D2D restore.");
        }
        StoreBytesData a10 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        Task<Integer> h10 = bVar.h(a10);
        final Function1 function1 = new Function1() { // from class: zl.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit o8;
                o8 = m.o(m.a.this, (Integer) obj);
                return o8;
            }
        };
        h10.g(new sb.g() { // from class: zl.b
            @Override // sb.g
            public final void onSuccess(Object obj) {
                m.p(Function1.this, obj);
            }
        }).e(new sb.f() { // from class: zl.c
            @Override // sb.f
            public final void onFailure(Exception exc) {
                m.q(m.a.this, exc);
            }
        });
        return Unit.f22894a;
    }

    public static final Unit o(a aVar, Integer num) {
        aVar.a("", "keystore");
        return Unit.f22894a;
    }

    public static final void p(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void q(a aVar, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Log.e("BlockStoreManager", "Error storing to Block Store: ", e10);
        aVar.b(0, e10.getMessage());
    }

    public static final void r(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void s(a aVar, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Log.e("BlockStoreManager", "Error retrieving from Block Store: ", e10);
        aVar.b(0, e10.getMessage());
    }

    public static final Unit u(a aVar, Boolean bool) {
        aVar.a("", "keystore");
        return Unit.f22894a;
    }

    public static final void v(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void w(a aVar, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Log.e("BlockStoreManager", "Error deleting from Block Store: ", e10);
        aVar.b(0, e10.getMessage());
    }

    public static final Unit z(String str, a aVar, RetrieveBytesResponse retrieveBytesResponse) {
        RetrieveBytesResponse.BlockstoreData blockstoreData = retrieveBytesResponse.v3().get(str);
        if (blockstoreData == null) {
            aVar.b(6, "No credentials found in Block Store.");
            return Unit.f22894a;
        }
        try {
            byte[] v32 = blockstoreData.v3();
            Intrinsics.checkNotNullExpressionValue(v32, "getBytes(...)");
            aVar.a(x.A(v32, 0, 0, true, 3, null), "keystore");
        } catch (Exception unused) {
            aVar.b(4, "Failed to decode Block Store data.");
        }
        return Unit.f22894a;
    }

    public final void m(@NotNull Activity activity, @NotNull JSONObject params, @NotNull final a callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            String str = "roblox_credentials";
            JSONObject optJSONObject = params.optJSONObject("parameters");
            if (optJSONObject != null && optJSONObject.has("key")) {
                str = optJSONObject.getString("key");
                Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
            }
            String jSONObject = params.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = jSONObject.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            final StoreBytesData.a c10 = new StoreBytesData.a().b(bytes).c(str);
            Intrinsics.checkNotNull(c10);
            final e9.b x10 = x(activity);
            Task<Boolean> p8 = x10.p();
            final Function1 function1 = new Function1() { // from class: zl.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit n10;
                    n10 = m.n(StoreBytesData.a.this, x10, callback, (Boolean) obj);
                    return n10;
                }
            };
            p8.g(new sb.g() { // from class: zl.j
                @Override // sb.g
                public final void onSuccess(Object obj) {
                    m.r(Function1.this, obj);
                }
            }).e(new sb.f() { // from class: zl.k
                @Override // sb.f
                public final void onFailure(Exception exc) {
                    m.s(m.a.this, exc);
                }
            });
        } catch (JSONException e10) {
            Log.e("BlockStoreManager", "JSON Exception retrieving key from parameters: ", e10);
            callback.b(4, e10.getMessage());
        }
    }

    public final void t(@NotNull Activity activity, @NotNull JSONObject params, @NotNull final a callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            String str = "roblox_credentials";
            JSONObject optJSONObject = params.optJSONObject("parameters");
            if (optJSONObject != null && optJSONObject.has("key")) {
                str = optJSONObject.getString("key");
                Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
            }
            DeleteBytesRequest a10 = new DeleteBytesRequest.a().b(kotlin.collections.o.d(str)).a();
            Intrinsics.checkNotNull(a10);
            Task<Boolean> i10 = x(activity).i(a10);
            final Function1 function1 = new Function1() { // from class: zl.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit u8;
                    u8 = m.u(m.a.this, (Boolean) obj);
                    return u8;
                }
            };
            i10.g(new sb.g() { // from class: zl.g
                @Override // sb.g
                public final void onSuccess(Object obj) {
                    m.v(Function1.this, obj);
                }
            }).e(new sb.f() { // from class: zl.h
                @Override // sb.f
                public final void onFailure(Exception exc) {
                    m.w(m.a.this, exc);
                }
            });
        } catch (JSONException e10) {
            Log.e("BlockStoreManager", "JSON Exception retrieving key from parameters: ", e10);
            callback.b(4, e10.getMessage());
        }
    }

    public final e9.b x(Activity activity) {
        e9.b a10 = e9.a.a(activity);
        Intrinsics.checkNotNullExpressionValue(a10, "getClient(...)");
        return a10;
    }

    public final void y(@NotNull Activity activity, @NotNull JSONObject params, @NotNull final a callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            JSONObject optJSONObject = params.optJSONObject("parameters");
            String string = (optJSONObject == null || !optJSONObject.has("key")) ? "roblox_credentials" : optJSONObject.getString("key");
            Pair pair = new Pair(string, new RetrieveBytesRequest.a().b(kotlin.collections.o.d(string)).a());
            final String str = (String) pair.a();
            Object b = pair.b();
            Intrinsics.checkNotNullExpressionValue(b, "component2(...)");
            Task<RetrieveBytesResponse> e10 = x(activity).e((RetrieveBytesRequest) b);
            final Function1 function1 = new Function1() { // from class: zl.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit z10;
                    z10 = m.z(str, callback, (RetrieveBytesResponse) obj);
                    return z10;
                }
            };
            e10.g(new sb.g() { // from class: zl.d
                @Override // sb.g
                public final void onSuccess(Object obj) {
                    m.A(Function1.this, obj);
                }
            }).e(new sb.f() { // from class: zl.e
                @Override // sb.f
                public final void onFailure(Exception exc) {
                    m.B(m.a.this, exc);
                }
            });
        } catch (JSONException e11) {
            Log.e("BlockStoreManager", "JSON Exception retrieving key from parameters: ", e11);
            callback.b(4, e11.getMessage());
        }
    }
}

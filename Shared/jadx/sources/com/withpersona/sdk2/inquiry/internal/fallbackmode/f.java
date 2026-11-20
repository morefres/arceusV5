package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import android.content.Context;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.i;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import ep.InquiryAttributes;
import gt.n;
import gt.o;
import iv.x;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import sm.a0;
import sm.w;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;", "Lbp/a;", "Lsm/w;", "moshi", "Landroid/content/Context;", "context", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "staticTemplateSessionFactory", "", "staticTemplateResourceId", "<init>", "(Lsm/w;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;I)V", "Lep/e;", "attributes", "Lgt/n;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "c", "(Lep/e;Lmt/b;)Ljava/lang/Object;", "", "sessionToken", "Lokhttp3/RequestBody;", "body", "Liv/x;", j6.b.f21518e, "(Ljava/lang/String;Lokhttp3/RequestBody;Lmt/b;)Ljava/lang/Object;", ve.a.f33391e, "Lsm/w;", "Landroid/content/Context;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", rl.d.f30696a, "I", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements bp.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final w moshi;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final i.a staticTemplateSessionFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int staticTemplateResourceId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f$a;", "", "", "staticTemplateResourceId", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;", ve.a.f33391e, "(I)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        f a(int staticTemplateResourceId);
    }

    public f(@NotNull w moshi, @NotNull Context context, @NotNull i.a staticTemplateSessionFactory, int i10) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(staticTemplateSessionFactory, "staticTemplateSessionFactory");
        this.moshi = moshi;
        this.context = context;
        this.staticTemplateSessionFactory = staticTemplateSessionFactory;
        this.staticTemplateResourceId = i10;
    }

    @Override // bp.a
    @Nullable
    public Object a(@NotNull String str, @NotNull RequestBody requestBody, @NotNull mt.b<? super x<?>> bVar) {
        x i10 = x.i(null);
        Intrinsics.checkNotNullExpressionValue(i10, "success(...)");
        return i10;
    }

    @Override // bp.a
    @Nullable
    public Object b(@NotNull String str, @NotNull RequestBody requestBody, @NotNull mt.b<? super x<?>> bVar) {
        x i10 = x.i(null);
        Intrinsics.checkNotNullExpressionValue(i10, "success(...)");
        return i10;
    }

    @Override // bp.a
    @Nullable
    public Object c(@NotNull InquiryAttributes inquiryAttributes, @NotNull mt.b<? super n<i>> bVar) {
        String jSONArray;
        try {
            InputStream openRawResource = this.context.getResources().openRawResource(this.staticTemplateResourceId);
            Intrinsics.checkNotNullExpressionValue(openRawResource, "openRawResource(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, Charsets.UTF_8), 8192);
            try {
                String h10 = tt.n.h(bufferedReader);
                ArrayList arrayList = null;
                tt.c.a(bufferedReader, null);
                JSONArray optJSONArray = new JSONObject(h10).optJSONArray("steps");
                if (optJSONArray == null || (jSONArray = optJSONArray.toString()) == null) {
                    n.Companion companion = n.INSTANCE;
                    return n.b(o.a(new bp.b("Failed to open resource as static template")));
                }
                List list = (List) this.moshi.d(a0.j(List.class, NextStep.class)).fromJson(jSONArray);
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(q.u(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((NextStep) it.next());
                    }
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    n.Companion companion2 = n.INSTANCE;
                    return n.b(o.a(new bp.b("Expected steps to contain at least one step")));
                }
                n.Companion companion3 = n.INSTANCE;
                i.a aVar = this.staticTemplateSessionFactory;
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                return n.b(aVar.a(arrayList, uuid));
            } finally {
            }
        } catch (Exception unused) {
            n.Companion companion4 = n.INSTANCE;
            return n.b(o.a(new bp.b("Failed to open resource as static template. Resource not found.")));
        }
    }
}

package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.g1;
import ju.l0;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0016\u001fB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001d¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;", "", "Landroid/content/Context;", "applicationContext", "Lju/p0;", "coroutineScope", "<init>", "(Landroid/content/Context;Lju/p0;)V", "", "sessionToken", "inquiryId", "stepName", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "componentConfigs", "", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", rl.d.f30696a, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "c", "(Lmt/b;)Ljava/lang/Object;", ve.a.f33391e, "Lju/p0;", "Ljava/io/File;", j6.b.f21518e, "Ljava/io/File;", "configFile", "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$UiStepUiComponentConfig;", "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$UiStepUiComponentConfig;", "savedData", "UiStepUiComponentConfig", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UiStepSavedStateHelper {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 coroutineScope;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final File configFile;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public UiStepUiComponentConfig savedData;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$UiStepUiComponentConfig;", "Landroid/os/Parcelable;", "", "sessionToken", "inquiryId", "stepName", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "uiComponentConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", ve.a.f33391e, "Ljava/lang/String;", "y", "()Ljava/lang/String;", j6.b.f21518e, "c", "f", rl.d.f30696a, "Ljava/util/List;", "g", "()Ljava/util/List;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UiStepUiComponentConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UiStepUiComponentConfig> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String sessionToken;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String inquiryId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String stepName;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<UiComponentConfig> uiComponentConfig;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UiStepUiComponentConfig> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UiStepUiComponentConfig createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    arrayList.add(parcel.readParcelable(UiStepUiComponentConfig.class.getClassLoader()));
                }
                return new UiStepUiComponentConfig(readString, readString2, readString3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final UiStepUiComponentConfig[] newArray(int i10) {
                return new UiStepUiComponentConfig[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UiStepUiComponentConfig(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String stepName, @NotNull List<? extends UiComponentConfig> uiComponentConfig) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(uiComponentConfig, "uiComponentConfig");
            this.sessionToken = sessionToken;
            this.inquiryId = inquiryId;
            this.stepName = stepName;
            this.uiComponentConfig = uiComponentConfig;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        /* renamed from: f, reason: from getter */
        public final String getStepName() {
            return this.stepName;
        }

        @NotNull
        public final List<UiComponentConfig> g() {
            return this.uiComponentConfig;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.sessionToken);
            dest.writeString(this.inquiryId);
            dest.writeString(this.stepName);
            List<UiComponentConfig> list = this.uiComponentConfig;
            dest.writeInt(list.size());
            Iterator<UiComponentConfig> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }

        @NotNull
        /* renamed from: y, reason: from getter */
        public final String getSessionToken() {
            return this.sessionToken;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$clearSavedState$2", f = "UiStepSavedStateHelper.kt", l = {}, m = "invokeSuspend")
    public static final class b extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f11473t;

        public b(mt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return UiStepSavedStateHelper.this.new b(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f11473t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            UiStepSavedStateHelper.this.configFile.delete();
            UiStepSavedStateHelper.this.savedData = null;
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "<anonymous>", "(Lju/p0;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$restoreComponentConfigs$2", f = "UiStepSavedStateHelper.kt", l = {129, 162}, m = "invokeSuspend")
    public static final class c extends ot.m implements Function2<p0, mt.b<? super List<? extends UiComponentConfig>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f11475t;

        /* renamed from: u, reason: collision with root package name */
        public Object f11476u;

        /* renamed from: v, reason: collision with root package name */
        public int f11477v;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f11479x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f11480y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f11481z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$restoreComponentConfigs$2$1", f = "UiStepSavedStateHelper.kt", l = {}, m = "invokeSuspend")
        public static final class a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f11482t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ UiStepSavedStateHelper f11483u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ UiStepUiComponentConfig f11484v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(UiStepSavedStateHelper uiStepSavedStateHelper, UiStepUiComponentConfig uiStepUiComponentConfig, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f11483u = uiStepSavedStateHelper;
                this.f11484v = uiStepUiComponentConfig;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new a(this.f11483u, this.f11484v, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                nt.c.e();
                if (this.f11482t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                this.f11483u.savedData = this.f11484v;
                return Unit.f22894a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$restoreComponentConfigs$2$restoredData$1", f = "UiStepSavedStateHelper.kt", l = {}, m = "invokeSuspend")
        public static final class b extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f11485t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ UiStepSavedStateHelper f11486u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Parcel f11487v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(UiStepSavedStateHelper uiStepSavedStateHelper, Parcel parcel, mt.b<? super b> bVar) {
                super(2, bVar);
                this.f11486u = uiStepSavedStateHelper;
                this.f11487v = parcel;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new b(this.f11486u, this.f11487v, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                nt.c.e();
                if (this.f11485t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                FileInputStream fileInputStream = new FileInputStream(this.f11486u.configFile);
                Parcel parcel = this.f11487v;
                try {
                    byte[] c10 = tt.b.c(fileInputStream);
                    parcel.unmarshall(c10, 0, c10.length);
                    Unit unit = Unit.f22894a;
                    tt.c.a(fileInputStream, null);
                    return Unit.f22894a;
                } finally {
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, mt.b<? super c> bVar) {
            super(2, bVar);
            this.f11479x = str;
            this.f11480y = str2;
            this.f11481z = str3;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return UiStepSavedStateHelper.this.new c(this.f11479x, this.f11480y, this.f11481z, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00c5, code lost:
        
            if (ju.i.g(r9, r4, r8) == r1) goto L43;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v6, types: [android.os.Parcel] */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Class<com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$UiStepUiComponentConfig> r0 = com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper.UiStepUiComponentConfig.class
                java.lang.Object r1 = nt.c.e()
                int r2 = r8.f11477v
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L30
                if (r2 == r4) goto L26
                if (r2 != r3) goto L1e
                java.lang.Object r0 = r8.f11476u
                com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$UiStepUiComponentConfig r0 = (com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper.UiStepUiComponentConfig) r0
                java.lang.Object r1 = r8.f11475t
                android.os.Parcel r1 = (android.os.Parcel) r1
                gt.o.b(r9)     // Catch: java.lang.Exception -> Lcd
                goto Lc8
            L1e:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L26:
                java.lang.Object r2 = r8.f11475t
                android.os.Parcel r2 = (android.os.Parcel) r2
                gt.o.b(r9)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L80
                goto L5f
            L2e:
                r9 = move-exception
                goto L7c
            L30:
                gt.o.b(r9)
                com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper r9 = com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper.this
                java.io.File r9 = com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper.a(r9)
                boolean r9 = r9.exists()
                if (r9 != 0) goto L40
                return r5
            L40:
                android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch: java.lang.Exception -> Lcd
                java.lang.String r9 = "obtain(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r9)     // Catch: java.lang.Exception -> Lcd
                ju.l0 r9 = ju.g1.b()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L80
                com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$c$b r6 = new com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$c$b     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L80
                com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper r7 = com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper.this     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L80
                r6.<init>(r7, r2, r5)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L80
                r8.f11475t = r2     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L80
                r8.f11477v = r4     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L80
                java.lang.Object r9 = ju.i.g(r9, r6, r8)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L80
                if (r9 != r1) goto L5f
                goto Lc7
            L5f:
                r9 = 0
                r2.setDataPosition(r9)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L80
                java.lang.ClassLoader r9 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L80
                android.os.Bundle r9 = r2.readBundle(r9)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L80
                if (r9 == 0) goto L76
                java.lang.String r4 = "data"
                java.lang.Object r9 = u2.c.a(r9, r4, r0)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L80
                com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$UiStepUiComponentConfig r9 = (com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper.UiStepUiComponentConfig) r9     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L80
                goto L77
            L76:
                r9 = r5
            L77:
                r2.recycle()     // Catch: java.lang.Exception -> Lcd
                r0 = r9
                goto L84
            L7c:
                r2.recycle()     // Catch: java.lang.Exception -> Lcd
                throw r9     // Catch: java.lang.Exception -> Lcd
            L80:
                r2.recycle()     // Catch: java.lang.Exception -> Lcd
                r0 = r5
            L84:
                if (r0 != 0) goto L87
                return r5
            L87:
                java.lang.String r9 = r0.getSessionToken()     // Catch: java.lang.Exception -> Lcd
                java.lang.String r4 = r8.f11479x     // Catch: java.lang.Exception -> Lcd
                boolean r9 = kotlin.jvm.internal.Intrinsics.c(r9, r4)     // Catch: java.lang.Exception -> Lcd
                if (r9 == 0) goto Lcd
                java.lang.String r9 = r0.getInquiryId()     // Catch: java.lang.Exception -> Lcd
                java.lang.String r4 = r8.f11480y     // Catch: java.lang.Exception -> Lcd
                boolean r9 = kotlin.jvm.internal.Intrinsics.c(r9, r4)     // Catch: java.lang.Exception -> Lcd
                if (r9 == 0) goto Lcd
                java.lang.String r9 = r0.getStepName()     // Catch: java.lang.Exception -> Lcd
                java.lang.String r4 = r8.f11481z     // Catch: java.lang.Exception -> Lcd
                boolean r9 = kotlin.jvm.internal.Intrinsics.c(r9, r4)     // Catch: java.lang.Exception -> Lcd
                if (r9 != 0) goto Lac
                goto Lcd
            Lac:
                ju.n2 r9 = ju.g1.c()     // Catch: java.lang.Exception -> Lcd
                com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$c$a r4 = new com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$c$a     // Catch: java.lang.Exception -> Lcd
                com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper r6 = com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper.this     // Catch: java.lang.Exception -> Lcd
                r4.<init>(r6, r0, r5)     // Catch: java.lang.Exception -> Lcd
                java.lang.Object r2 = ot.l.a(r2)     // Catch: java.lang.Exception -> Lcd
                r8.f11475t = r2     // Catch: java.lang.Exception -> Lcd
                r8.f11476u = r0     // Catch: java.lang.Exception -> Lcd
                r8.f11477v = r3     // Catch: java.lang.Exception -> Lcd
                java.lang.Object r9 = ju.i.g(r9, r4, r8)     // Catch: java.lang.Exception -> Lcd
                if (r9 != r1) goto Lc8
            Lc7:
                return r1
            Lc8:
                java.util.List r5 = r0.g()     // Catch: java.lang.Exception -> Lcd
            Lcd:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super List<? extends UiComponentConfig>> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$saveComponentConfigs$2", f = "UiStepSavedStateHelper.kt", l = {96}, m = "invokeSuspend")
    public static final class d extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f11488t;

        /* renamed from: u, reason: collision with root package name */
        public int f11489u;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ UiStepUiComponentConfig f11491w;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$saveComponentConfigs$2$1", f = "UiStepSavedStateHelper.kt", l = {}, m = "invokeSuspend")
        public static final class a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f11492t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ UiStepSavedStateHelper f11493u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Bundle f11494v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(UiStepSavedStateHelper uiStepSavedStateHelper, Bundle bundle, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f11493u = uiStepSavedStateHelper;
                this.f11494v = bundle;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new a(this.f11493u, this.f11494v, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                nt.c.e();
                if (this.f11492t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                FileOutputStream fileOutputStream = new FileOutputStream(this.f11493u.configFile);
                Bundle bundle = this.f11494v;
                try {
                    Parcel obtain = Parcel.obtain();
                    Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
                    obtain.writeBundle(bundle);
                    fileOutputStream.write(obtain.marshall());
                    obtain.recycle();
                    Unit unit = Unit.f22894a;
                    tt.c.a(fileOutputStream, null);
                    return Unit.f22894a;
                } finally {
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(UiStepUiComponentConfig uiStepUiComponentConfig, mt.b<? super d> bVar) {
            super(2, bVar);
            this.f11491w = uiStepUiComponentConfig;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return UiStepSavedStateHelper.this.new d(this.f11491w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f11489u;
            try {
                if (i10 == 0) {
                    gt.o.b(obj);
                    File parentFile = UiStepSavedStateHelper.this.configFile.getParentFile();
                    if (parentFile != null) {
                        ot.b.a(parentFile.mkdirs());
                    }
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("data", this.f11491w);
                    l0 b = g1.b();
                    a aVar = new a(UiStepSavedStateHelper.this, bundle, null);
                    this.f11488t = ot.l.a(bundle);
                    this.f11489u = 1;
                    if (ju.i.g(b, aVar, this) == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                }
            } catch (Exception unused) {
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public UiStepSavedStateHelper(@NotNull Context applicationContext, @NotNull p0 coroutineScope) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        this.configFile = new File(new File(applicationContext.getFilesDir(), ".com.withpersona.sdk2.inquiry"), "ui_step_config");
    }

    @Nullable
    public final Object c(@NotNull mt.b<? super Unit> bVar) {
        Object g10 = ju.i.g(g1.c(), new b(null), bVar);
        return g10 == nt.c.e() ? g10 : Unit.f22894a;
    }

    @Nullable
    public final Object d(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull mt.b<? super List<? extends UiComponentConfig>> bVar) {
        return ju.i.g(g1.a(), new c(str, str2, str3, null), bVar);
    }

    public final void e(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String stepName, @Nullable List<? extends UiComponentConfig> componentConfigs) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        if (!Intrinsics.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            throw new IllegalArgumentException("saveComponentConfigs must be called on the main thread.");
        }
        if (componentConfigs == null) {
            return;
        }
        UiStepUiComponentConfig uiStepUiComponentConfig = this.savedData;
        if (Intrinsics.c(uiStepUiComponentConfig != null ? uiStepUiComponentConfig.getSessionToken() : null, sessionToken)) {
            UiStepUiComponentConfig uiStepUiComponentConfig2 = this.savedData;
            if (Intrinsics.c(uiStepUiComponentConfig2 != null ? uiStepUiComponentConfig2.getInquiryId() : null, inquiryId)) {
                UiStepUiComponentConfig uiStepUiComponentConfig3 = this.savedData;
                if (Intrinsics.c(uiStepUiComponentConfig3 != null ? uiStepUiComponentConfig3.getStepName() : null, stepName)) {
                    return;
                }
            }
        }
        UiStepUiComponentConfig uiStepUiComponentConfig4 = new UiStepUiComponentConfig(sessionToken, inquiryId, stepName, componentConfigs);
        this.savedData = uiStepUiComponentConfig4;
        ju.k.d(this.coroutineScope, null, null, new d(uiStepUiComponentConfig4, null), 3, null);
    }
}

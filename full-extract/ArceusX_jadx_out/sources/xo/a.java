package xo;

import android.os.Parcel;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.network.DocumentStepData;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdDetails;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdStepData;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.network.SelfieStepData;
import com.withpersona.sdk2.inquiry.shared.data_collection.StepData;
import com.withpersona.sdk2.inquiry.types.collected_data.CollectedData;
import com.withpersona.sdk2.inquiry.types.collected_data.CollectedGovernmentIdDetails;
import com.withpersona.sdk2.inquiry.types.collected_data.DocumentFile;
import com.withpersona.sdk2.inquiry.types.collected_data.GovernmentIdCapture;
import com.withpersona.sdk2.inquiry.types.collected_data.SelfieCapture;
import com.withpersona.sdk2.inquiry.types.collected_data.StepData;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import com.withpersona.sdk2.inquiry.ui.network.UiStepData;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\\\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\u0005*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u0005*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0005*\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\u0005*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"", "Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedData;", rl.d.f30696a, "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedData;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;", "h", "(Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;)Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentStepData;", "e", "(Lcom/withpersona/sdk2/inquiry/document/network/DocumentStepData;)Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdStepData;", "f", "(Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdStepData;)Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedGovernmentIdDetails;", ve.a.f33391e, "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedGovernmentIdDetails;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture;", j6.b.f21518e, "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;)Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfieStepData;", "g", "(Lcom/withpersona/sdk2/inquiry/selfie/network/SelfieStepData;)Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;", "c", "(Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;", "Lcom/withpersona/sdk2/inquiry/ui/network/UiStepData;", "i", "(Lcom/withpersona/sdk2/inquiry/ui/network/UiStepData;)Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;", "inquiry-internal_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: xo.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0657a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35794a;
        public static final /* synthetic */ int[] b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f35795c;

        static {
            int[] iArr = new int[GovernmentId.b.values().length];
            try {
                iArr[GovernmentId.b.f10506a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GovernmentId.b.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GovernmentId.b.f10507c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f35794a = iArr;
            int[] iArr2 = new int[GovernmentId.a.values().length];
            try {
                iArr2[GovernmentId.a.f10502a.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GovernmentId.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GovernmentId.a.f10503c.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
            int[] iArr3 = new int[Selfie.a.values().length];
            try {
                iArr3[Selfie.a.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[Selfie.a.f12465c.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f35795c = iArr3;
        }
    }

    public static final CollectedGovernmentIdDetails a(List<GovernmentIdDetails> list) {
        Iterator<GovernmentIdDetails> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                return new CollectedGovernmentIdDetails(null, null);
            }
            GovernmentIdDetails next = it.next();
            if ((next != null ? next.getDateOfBirth() : null) != null && next.getExpirationDate() != null) {
                return new CollectedGovernmentIdDetails(next.getDateOfBirth(), next.getExpirationDate());
            }
        }
    }

    public static final GovernmentIdCapture b(GovernmentId governmentId) {
        GovernmentIdCapture.c cVar;
        GovernmentIdCapture.a aVar;
        String idClassKey = governmentId.getIdClassKey();
        int i10 = C0657a.f35794a[governmentId.getSide().ordinal()];
        if (i10 == 1) {
            cVar = GovernmentIdCapture.c.f13751a;
        } else if (i10 == 2) {
            cVar = GovernmentIdCapture.c.b;
        } else {
            if (i10 != 3) {
                throw new gt.l();
            }
            cVar = GovernmentIdCapture.c.f13752c;
        }
        int i11 = C0657a.b[governmentId.getCaptureMethod().ordinal()];
        if (i11 == 1) {
            aVar = GovernmentIdCapture.a.b;
        } else if (i11 == 2) {
            aVar = GovernmentIdCapture.a.f13747a;
        } else {
            if (i11 != 3) {
                throw new gt.l();
            }
            aVar = GovernmentIdCapture.a.f13748c;
        }
        List<Frame> f32 = governmentId.f3();
        ArrayList arrayList = new ArrayList();
        for (Frame frame : f32) {
            File file = new File(frame.getAbsoluteFilePath());
            GovernmentIdCapture.Frame frame2 = file.exists() ? new GovernmentIdCapture.Frame(file, frame.getMimeType()) : null;
            if (frame2 != null) {
                arrayList.add(frame2);
            }
        }
        return new GovernmentIdCapture(idClassKey, cVar, aVar, arrayList);
    }

    public static final SelfieCapture c(Selfie selfie) {
        SelfieCapture.a aVar;
        if (!new File(selfie.getAbsoluteFilePath()).exists()) {
            return null;
        }
        int i10 = C0657a.f35795c[selfie.getCaptureMethod().ordinal()];
        if (i10 == 1) {
            aVar = SelfieCapture.a.b;
        } else {
            if (i10 != 2) {
                throw new gt.l();
            }
            aVar = SelfieCapture.a.f13756a;
        }
        return new SelfieCapture(aVar, new File(selfie.getAbsoluteFilePath()));
    }

    @Nullable
    public static final CollectedData d(@NotNull List<? extends StepData> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            com.withpersona.sdk2.inquiry.types.collected_data.StepData h10 = h((StepData) it.next());
            if (h10 != null) {
                arrayList.add(h10);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new CollectedData(arrayList);
    }

    public static final com.withpersona.sdk2.inquiry.types.collected_data.StepData e(DocumentStepData documentStepData) {
        DocumentFile documentFile;
        String stepName = documentStepData.getStepName();
        List<com.withpersona.sdk2.inquiry.document.DocumentFile> a10 = documentStepData.a();
        ArrayList arrayList = new ArrayList();
        for (com.withpersona.sdk2.inquiry.document.DocumentFile documentFile2 : a10) {
            if (documentFile2 instanceof DocumentFile.Local) {
                documentFile = new com.withpersona.sdk2.inquiry.types.collected_data.DocumentFile(new File(((DocumentFile.Local) documentFile2).getAbsoluteFilePath()));
            } else {
                if (!(documentFile2 instanceof DocumentFile.Remote)) {
                    throw new gt.l();
                }
                String absoluteFilePath = ((DocumentFile.Remote) documentFile2).getAbsoluteFilePath();
                documentFile = absoluteFilePath != null ? new com.withpersona.sdk2.inquiry.types.collected_data.DocumentFile(new File(absoluteFilePath)) : null;
            }
            if (documentFile != null) {
                arrayList.add(documentFile);
            }
        }
        return new StepData.DocumentStepData(stepName, arrayList);
    }

    public static final com.withpersona.sdk2.inquiry.types.collected_data.StepData f(GovernmentIdStepData governmentIdStepData) {
        String stepName = governmentIdStepData.getStepName();
        List<GovernmentId> a10 = governmentIdStepData.a();
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(a10, 10));
        Iterator<T> it = a10.iterator();
        while (it.hasNext()) {
            arrayList.add(b((GovernmentId) it.next()));
        }
        List<GovernmentId> a11 = governmentIdStepData.a();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : a11) {
            if (obj instanceof GovernmentId.GovernmentIdImage) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(kotlin.collections.q.u(arrayList2, 10));
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            arrayList3.add(((GovernmentId.GovernmentIdImage) obj2).getIdDetails());
        }
        return new StepData.GovernmentIdStepData(stepName, arrayList, a(arrayList3));
    }

    public static final com.withpersona.sdk2.inquiry.types.collected_data.StepData g(SelfieStepData selfieStepData) {
        String stepName = selfieStepData.getStepName();
        Selfie centerCapture = selfieStepData.getCenterCapture();
        SelfieCapture c10 = centerCapture != null ? c(centerCapture) : null;
        Selfie centerCapture2 = selfieStepData.getCenterCapture();
        SelfieCapture c11 = centerCapture2 != null ? c(centerCapture2) : null;
        Selfie centerCapture3 = selfieStepData.getCenterCapture();
        return new StepData.SelfieStepData(stepName, c10, c11, centerCapture3 != null ? c(centerCapture3) : null);
    }

    @Nullable
    public static final com.withpersona.sdk2.inquiry.types.collected_data.StepData h(@NotNull com.withpersona.sdk2.inquiry.shared.data_collection.StepData stepData) {
        Intrinsics.checkNotNullParameter(stepData, "<this>");
        if (stepData instanceof UiStepData) {
            return i((UiStepData) stepData);
        }
        if (stepData instanceof SelfieStepData) {
            return g((SelfieStepData) stepData);
        }
        if (stepData instanceof GovernmentIdStepData) {
            return f((GovernmentIdStepData) stepData);
        }
        if (stepData instanceof DocumentStepData) {
            return e((DocumentStepData) stepData);
        }
        return null;
    }

    @NotNull
    public static final com.withpersona.sdk2.inquiry.types.collected_data.StepData i(@NotNull UiStepData uiStepData) {
        Intrinsics.checkNotNullParameter(uiStepData, "<this>");
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = uiStepData.a().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            try {
                Object a10 = com.withpersona.sdk2.inquiry.ui.network.a.a((ComponentParam) entry.getValue());
                obtain.writeValue(a10);
                linkedHashMap.put(str, a10);
            } catch (RuntimeException unused) {
            }
        }
        obtain.recycle();
        return new StepData.UiStepData(uiStepData.getStepName(), linkedHashMap);
    }
}

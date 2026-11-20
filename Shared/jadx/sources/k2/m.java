package k2;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import k2.k;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f22290a = new Object();
    public static final Object b = new Object();

    public static Bundle a(k.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat d10 = aVar.d();
        bundle.putInt("icon", d10 != null ? d10.g() : 0);
        bundle.putCharSequence(Title.type, aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    public static Bundle b(t tVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", tVar.i());
        bundle.putCharSequence("label", tVar.h());
        bundle.putCharSequenceArray(InquiryField.ChoicesField.TYPE, tVar.e());
        bundle.putBoolean("allowFreeFormInput", tVar.c());
        bundle.putBundle("extras", tVar.g());
        Set<String> d10 = tVar.d();
        if (d10 != null && !d10.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(d10.size());
            Iterator<String> it = d10.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    public static Bundle[] c(t[] tVarArr) {
        if (tVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[tVarArr.length];
        for (int i10 = 0; i10 < tVarArr.length; i10++) {
            bundleArr[i10] = b(tVarArr[i10]);
        }
        return bundleArr;
    }
}

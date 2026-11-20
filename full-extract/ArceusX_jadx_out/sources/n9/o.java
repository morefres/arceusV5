package n9;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f25995a;
    public final String b;

    public o(@NonNull Context context) {
        m.l(context);
        Resources resources = context.getResources();
        this.f25995a = resources;
        this.b = resources.getResourcePackageName(j9.j.f21618a);
    }

    public String a(@NonNull String str) {
        String str2 = this.b;
        Resources resources = this.f25995a;
        int identifier = resources.getIdentifier(str, InquiryField.StringField.TYPE, str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}

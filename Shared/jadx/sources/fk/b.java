package fk;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import ek.q;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class b {
    public static SpannableStringBuilder a(SpannableStringBuilder spannableStringBuilder, String str, a... aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : aVarArr) {
            try {
                if (str.contains(aVar.a())) {
                    int c10 = aVar.c();
                    int b = aVar.b();
                    arrayList.add(aVar);
                    if (!c(arrayList, str, c10, b)) {
                        spannableStringBuilder.setSpan(aVar, c10, b, 33);
                    }
                }
            } catch (NullPointerException e10) {
                q.d("NullPointer Exception in generateClickableString(): " + e10.getMessage());
            }
        }
        return spannableStringBuilder;
    }

    public static void b(TextView textView, String str, a... aVarArr) {
        textView.setText(a(new SpannableStringBuilder(str), str, aVarArr));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static boolean c(ArrayList<a> arrayList, String str, int i10, int i11) {
        for (int i12 = 0; i12 < arrayList.size() - 1; i12++) {
            arrayList.get(i12).a();
            int c10 = arrayList.get(i12).c();
            int b = arrayList.get(i12).b();
            if ((i10 >= c10 && i10 <= b) || (i11 >= c10 && i11 <= b)) {
                return true;
            }
        }
        return false;
    }
}

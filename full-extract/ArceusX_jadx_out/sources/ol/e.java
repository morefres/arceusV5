package ol;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import sb.f;
import sb.g;

/* loaded from: classes2.dex */
public class e {

    public class a implements g<Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f27970a;

        public a(String str) {
            this.f27970a = str;
        }

        @Override // sb.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            Log.i(this.f27970a, "onSuccess.");
        }
    }

    public class b implements f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f27971a;

        public b(String str) {
            this.f27971a = str;
        }

        @Override // sb.f
        public void onFailure(@NonNull Exception exc) {
            Log.i(this.f27971a, "onFailure.");
        }
    }

    public void a(Context context, String str) {
        Task<Void> P = a9.a.a(context).P();
        P.g(new a(str));
        P.e(new b(str));
    }
}

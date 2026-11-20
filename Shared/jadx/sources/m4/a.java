package m4;

import android.os.Bundle;
import android.view.c1;
import android.view.s;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: m4.a$a, reason: collision with other inner class name */
    public interface InterfaceC0422a<D> {
        void a(@NonNull n4.b<D> bVar, D d10);

        @NonNull
        n4.b<D> b(int i10, Bundle bundle);

        void c(@NonNull n4.b<D> bVar);
    }

    @NonNull
    public static <T extends s & c1> a b(@NonNull T t8) {
        return new b(t8, t8.v());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @NonNull
    public abstract <D> n4.b<D> c(int i10, Bundle bundle, @NonNull InterfaceC0422a<D> interfaceC0422a);

    public abstract void d();
}

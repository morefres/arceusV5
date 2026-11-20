package h7;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final List<u> f19031a = new ArrayList();

    public void a(u uVar) {
        this.f19031a.add(uVar);
    }

    public void b(Path path) {
        for (int size = this.f19031a.size() - 1; size >= 0; size--) {
            s7.m.b(path, this.f19031a.get(size));
        }
    }
}

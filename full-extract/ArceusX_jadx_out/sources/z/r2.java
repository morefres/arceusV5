package z;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import z.k3;

/* loaded from: classes.dex */
public class r2 implements n0.m3 {
    public k3 b;

    /* renamed from: c, reason: collision with root package name */
    public List<n0.r3> f37404c;

    /* renamed from: e, reason: collision with root package name */
    public volatile n0.o3 f37406e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f37403a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f37405d = false;

    public r2(k3 k3Var, List<n0.r3> list) {
        x2.g.b(k3Var.f37266j == k3.c.OPENED, "CaptureSession state must be OPENED. Current state:" + k3Var.f37266j);
        this.b = k3Var;
        this.f37404c = Collections.unmodifiableList(new ArrayList(list));
    }

    public void a() {
        synchronized (this.f37403a) {
            this.f37405d = true;
            this.b = null;
            this.f37406e = null;
            this.f37404c = null;
        }
    }

    public void b(n0.o3 o3Var) {
        synchronized (this.f37403a) {
            this.f37406e = o3Var;
        }
    }
}

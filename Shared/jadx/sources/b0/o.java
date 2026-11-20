package b0;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final c f3634a;

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final List<i> f3636a;
        public final CameraCaptureSession.StateCallback b;

        /* renamed from: c, reason: collision with root package name */
        public final Executor f3637c;

        /* renamed from: d, reason: collision with root package name */
        public final int f3638d;

        /* renamed from: e, reason: collision with root package name */
        public h f3639e = null;

        /* renamed from: f, reason: collision with root package name */
        public CaptureRequest f3640f = null;

        public b(int i10, List<i> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f3638d = i10;
            this.f3636a = Collections.unmodifiableList(new ArrayList(list));
            this.b = stateCallback;
            this.f3637c = executor;
        }

        @Override // b0.o.c
        public h a() {
            return this.f3639e;
        }

        @Override // b0.o.c
        public CameraCaptureSession.StateCallback b() {
            return this.b;
        }

        @Override // b0.o.c
        public List<i> c() {
            return this.f3636a;
        }

        @Override // b0.o.c
        public void d(h hVar) {
            if (this.f3638d == 1) {
                throw new UnsupportedOperationException("Method not supported for high speed session types");
            }
            this.f3639e = hVar;
        }

        @Override // b0.o.c
        public Object e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Objects.equals(this.f3639e, bVar.f3639e) && this.f3638d == bVar.f3638d && this.f3636a.size() == bVar.f3636a.size()) {
                    for (int i10 = 0; i10 < this.f3636a.size(); i10++) {
                        if (!this.f3636a.get(i10).equals(bVar.f3636a.get(i10))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // b0.o.c
        public int f() {
            return this.f3638d;
        }

        @Override // b0.o.c
        public void g(CaptureRequest captureRequest) {
            this.f3640f = captureRequest;
        }

        @Override // b0.o.c
        public Executor getExecutor() {
            return this.f3637c;
        }

        public int hashCode() {
            int hashCode = this.f3636a.hashCode() ^ 31;
            int i10 = (hashCode << 5) - hashCode;
            h hVar = this.f3639e;
            int hashCode2 = (hVar == null ? 0 : hVar.hashCode()) ^ i10;
            return this.f3638d ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    public interface c {
        h a();

        CameraCaptureSession.StateCallback b();

        List<i> c();

        void d(h hVar);

        Object e();

        int f();

        void g(CaptureRequest captureRequest);

        Executor getExecutor();
    }

    public o(int i10, List<i> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f3634a = new b(i10, list, executor, stateCallback);
        } else {
            this.f3634a = new a(i10, list, executor, stateCallback);
        }
    }

    public static List<OutputConfiguration> h(List<i> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<i> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) it.next().i());
        }
        return arrayList;
    }

    public static List<i> i(List<OutputConfiguration> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<OutputConfiguration> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(i.j(it.next()));
        }
        return arrayList;
    }

    public Executor a() {
        return this.f3634a.getExecutor();
    }

    public h b() {
        return this.f3634a.a();
    }

    public List<i> c() {
        return this.f3634a.c();
    }

    public int d() {
        return this.f3634a.f();
    }

    public CameraCaptureSession.StateCallback e() {
        return this.f3634a.b();
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f3634a.equals(((o) obj).f3634a);
        }
        return false;
    }

    public void f(h hVar) {
        this.f3634a.d(hVar);
    }

    public void g(CaptureRequest captureRequest) {
        this.f3634a.g(captureRequest);
    }

    public int hashCode() {
        return this.f3634a.hashCode();
    }

    public Object j() {
        return this.f3634a.e();
    }

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final SessionConfiguration f3635a;
        public final List<i> b;

        public a(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f3635a = sessionConfiguration;
            this.b = Collections.unmodifiableList(o.i(sessionConfiguration.getOutputConfigurations()));
        }

        @Override // b0.o.c
        public h a() {
            return h.b(this.f3635a.getInputConfiguration());
        }

        @Override // b0.o.c
        public CameraCaptureSession.StateCallback b() {
            return this.f3635a.getStateCallback();
        }

        @Override // b0.o.c
        public List<i> c() {
            return this.b;
        }

        @Override // b0.o.c
        public void d(h hVar) {
            this.f3635a.setInputConfiguration((InputConfiguration) hVar.a());
        }

        @Override // b0.o.c
        public Object e() {
            return this.f3635a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Objects.equals(this.f3635a, ((a) obj).f3635a);
            }
            return false;
        }

        @Override // b0.o.c
        public int f() {
            return this.f3635a.getSessionType();
        }

        @Override // b0.o.c
        public void g(CaptureRequest captureRequest) {
            this.f3635a.setSessionParameters(captureRequest);
        }

        @Override // b0.o.c
        public Executor getExecutor() {
            return this.f3635a.getExecutor();
        }

        public int hashCode() {
            return this.f3635a.hashCode();
        }

        public a(int i10, List<i> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i10, o.h(list), executor, stateCallback));
        }
    }
}

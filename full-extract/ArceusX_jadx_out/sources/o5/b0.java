package o5;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import o5.q;

/* loaded from: classes.dex */
public class b0 extends q {
    public int S;
    public ArrayList<q> Q = new ArrayList<>();
    public boolean R = true;
    public boolean T = false;
    public int U = 0;

    public class a extends x {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f27606a;

        public a(q qVar) {
            this.f27606a = qVar;
        }

        @Override // o5.x, o5.q.h
        public void k(@NonNull q qVar) {
            this.f27606a.q0();
            qVar.m0(this);
        }
    }

    public class b extends x {
        public b() {
        }

        @Override // o5.x, o5.q.h
        public void a(@NonNull q qVar) {
            b0.this.Q.remove(qVar);
            if (b0.this.X()) {
                return;
            }
            b0.this.i0(q.i.f27728c, false);
            b0 b0Var = b0.this;
            b0Var.B = true;
            b0Var.i0(q.i.b, false);
        }
    }

    public static class c extends x {

        /* renamed from: a, reason: collision with root package name */
        public b0 f27608a;

        public c(b0 b0Var) {
            this.f27608a = b0Var;
        }

        @Override // o5.x, o5.q.h
        public void g(@NonNull q qVar) {
            b0 b0Var = this.f27608a;
            if (b0Var.T) {
                return;
            }
            b0Var.z0();
            this.f27608a.T = true;
        }

        @Override // o5.x, o5.q.h
        public void k(@NonNull q qVar) {
            b0 b0Var = this.f27608a;
            int i10 = b0Var.S - 1;
            b0Var.S = i10;
            if (i10 == 0) {
                b0Var.T = false;
                b0Var.w();
            }
            qVar.m0(this);
        }
    }

    @Override // o5.q
    public String A0(String str) {
        String A0 = super.A0(str);
        for (int i10 = 0; i10 < this.Q.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(A0);
            sb2.append("\n");
            sb2.append(this.Q.get(i10).A0(str + "  "));
            A0 = sb2.toString();
        }
        return A0;
    }

    @Override // o5.q
    @NonNull
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public b0 c(@NonNull q.h hVar) {
        return (b0) super.c(hVar);
    }

    @Override // o5.q
    @NonNull
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public b0 e(@NonNull View view) {
        for (int i10 = 0; i10 < this.Q.size(); i10++) {
            this.Q.get(i10).e(view);
        }
        return (b0) super.e(view);
    }

    @NonNull
    public b0 D0(@NonNull q qVar) {
        E0(qVar);
        long j10 = this.f27687c;
        if (j10 >= 0) {
            qVar.t0(j10);
        }
        if ((this.U & 1) != 0) {
            qVar.v0(D());
        }
        if ((this.U & 2) != 0) {
            qVar.x0(K());
        }
        if ((this.U & 4) != 0) {
            qVar.w0(J());
        }
        if ((this.U & 8) != 0) {
            qVar.u0(C());
        }
        return this;
    }

    public final void E0(@NonNull q qVar) {
        this.Q.add(qVar);
        qVar.f27702r = this;
    }

    public q F0(int i10) {
        if (i10 < 0 || i10 >= this.Q.size()) {
            return null;
        }
        return this.Q.get(i10);
    }

    public int G0() {
        return this.Q.size();
    }

    public final int H0(long j10) {
        for (int i10 = 1; i10 < this.Q.size(); i10++) {
            if (this.Q.get(i10).L > j10) {
                return i10 - 1;
            }
        }
        return this.Q.size() - 1;
    }

    @Override // o5.q
    @NonNull
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public b0 m0(@NonNull q.h hVar) {
        return (b0) super.m0(hVar);
    }

    @Override // o5.q
    @NonNull
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public b0 n0(@NonNull View view) {
        for (int i10 = 0; i10 < this.Q.size(); i10++) {
            this.Q.get(i10).n0(view);
        }
        return (b0) super.n0(view);
    }

    @Override // o5.q
    @NonNull
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public b0 t0(long j10) {
        ArrayList<q> arrayList;
        super.t0(j10);
        if (this.f27687c >= 0 && (arrayList = this.Q) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.Q.get(i10).t0(j10);
            }
        }
        return this;
    }

    @Override // o5.q
    @NonNull
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public b0 v0(TimeInterpolator timeInterpolator) {
        this.U |= 1;
        ArrayList<q> arrayList = this.Q;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.Q.get(i10).v0(timeInterpolator);
            }
        }
        return (b0) super.v0(timeInterpolator);
    }

    @NonNull
    public b0 M0(int i10) {
        if (i10 == 0) {
            this.R = true;
            return this;
        }
        if (i10 == 1) {
            this.R = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
    }

    @Override // o5.q
    @NonNull
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public b0 y0(long j10) {
        return (b0) super.y0(j10);
    }

    public final void O0() {
        c cVar = new c(this);
        ArrayList<q> arrayList = this.Q;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            q qVar = arrayList.get(i10);
            i10++;
            qVar.c(cVar);
        }
        this.S = this.Q.size();
    }

    @Override // o5.q
    public boolean X() {
        for (int i10 = 0; i10 < this.Q.size(); i10++) {
            if (this.Q.get(i10).X()) {
                return true;
            }
        }
        return false;
    }

    @Override // o5.q
    public boolean Y() {
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.Q.get(i10).Y()) {
                return false;
            }
        }
        return true;
    }

    @Override // o5.q
    public void cancel() {
        super.cancel();
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).cancel();
        }
    }

    @Override // o5.q
    public void j(@NonNull d0 d0Var) {
        if (a0(d0Var.b)) {
            ArrayList<q> arrayList = this.Q;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                q qVar = arrayList.get(i10);
                i10++;
                q qVar2 = qVar;
                if (qVar2.a0(d0Var.b)) {
                    qVar2.j(d0Var);
                    d0Var.f27619c.add(qVar2);
                }
            }
        }
    }

    @Override // o5.q
    public void j0(View view) {
        super.j0(view);
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).j0(view);
        }
    }

    @Override // o5.q
    public void l0() {
        this.J = 0L;
        b bVar = new b();
        for (int i10 = 0; i10 < this.Q.size(); i10++) {
            q qVar = this.Q.get(i10);
            qVar.c(bVar);
            qVar.l0();
            long U = qVar.U();
            if (this.R) {
                this.J = Math.max(this.J, U);
            } else {
                long j10 = this.J;
                qVar.L = j10;
                this.J = j10 + U;
            }
        }
    }

    @Override // o5.q
    public void n(d0 d0Var) {
        super.n(d0Var);
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).n(d0Var);
        }
    }

    @Override // o5.q
    public void o(@NonNull d0 d0Var) {
        if (a0(d0Var.b)) {
            ArrayList<q> arrayList = this.Q;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                q qVar = arrayList.get(i10);
                i10++;
                q qVar2 = qVar;
                if (qVar2.a0(d0Var.b)) {
                    qVar2.o(d0Var);
                    d0Var.f27619c.add(qVar2);
                }
            }
        }
    }

    @Override // o5.q
    public void o0(View view) {
        super.o0(view);
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).o0(view);
        }
    }

    @Override // o5.q
    public void q0() {
        if (this.Q.isEmpty()) {
            z0();
            w();
            return;
        }
        O0();
        int i10 = 0;
        if (this.R) {
            ArrayList<q> arrayList = this.Q;
            int size = arrayList.size();
            while (i10 < size) {
                q qVar = arrayList.get(i10);
                i10++;
                qVar.q0();
            }
            return;
        }
        for (int i11 = 1; i11 < this.Q.size(); i11++) {
            this.Q.get(i11 - 1).c(new a(this.Q.get(i11)));
        }
        q qVar2 = this.Q.get(0);
        if (qVar2 != null) {
            qVar2.q0();
        }
    }

    @Override // o5.q
    @NonNull
    /* renamed from: r */
    public q clone() {
        b0 b0Var = (b0) super.clone();
        b0Var.Q = new ArrayList<>();
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            b0Var.E0(this.Q.get(i10).clone());
        }
        return b0Var;
    }

    @Override // o5.q
    public void r0(boolean z10) {
        super.r0(z10);
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).r0(z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // o5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s0(long r20, long r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r22
            long r5 = r0.U()
            o5.b0 r7 = r0.f27702r
            r8 = 0
            if (r7 == 0) goto L22
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 >= 0) goto L18
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 < 0) goto Lc2
        L18:
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L22
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L22
            goto Lc2
        L22:
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r10 = 0
            r11 = 1
            if (r7 >= 0) goto L2a
            r12 = r11
            goto L2b
        L2a:
            r12 = r10
        L2b:
            int r13 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r13 < 0) goto L33
            int r14 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r14 < 0) goto L3b
        L33:
            int r14 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r14 > 0) goto L42
            int r14 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r14 <= 0) goto L42
        L3b:
            r0.B = r10
            o5.q$i r14 = o5.q.i.f27727a
            r0.i0(r14, r12)
        L42:
            boolean r14 = r0.R
            if (r14 == 0) goto L5f
        L46:
            java.util.ArrayList<o5.q> r7 = r0.Q
            int r7 = r7.size()
            if (r10 >= r7) goto L5c
            java.util.ArrayList<o5.q> r7 = r0.Q
            java.lang.Object r7 = r7.get(r10)
            o5.q r7 = (o5.q) r7
            r7.s0(r1, r3)
            int r10 = r10 + 1
            goto L46
        L5c:
            r16 = r8
            goto La7
        L5f:
            int r10 = r0.H0(r3)
            if (r7 < 0) goto L8a
        L65:
            java.util.ArrayList<o5.q> r7 = r0.Q
            int r7 = r7.size()
            if (r10 >= r7) goto L5c
            java.util.ArrayList<o5.q> r7 = r0.Q
            java.lang.Object r7 = r7.get(r10)
            o5.q r7 = (o5.q) r7
            long r14 = r7.L
            r16 = r8
            long r8 = r1 - r14
            int r18 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r18 >= 0) goto L80
            goto La7
        L80:
            long r14 = r3 - r14
            r7.s0(r8, r14)
            int r10 = r10 + 1
            r8 = r16
            goto L65
        L8a:
            r16 = r8
        L8c:
            if (r10 < 0) goto La7
            java.util.ArrayList<o5.q> r7 = r0.Q
            java.lang.Object r7 = r7.get(r10)
            o5.q r7 = (o5.q) r7
            long r8 = r7.L
            long r14 = r1 - r8
            long r8 = r3 - r8
            r7.s0(r14, r8)
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 < 0) goto La4
            goto La7
        La4:
            int r10 = r10 + (-1)
            goto L8c
        La7:
            o5.b0 r7 = r0.f27702r
            if (r7 == 0) goto Lc2
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto Lb3
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto Lb9
        Lb3:
            if (r13 >= 0) goto Lc2
            int r2 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r2 < 0) goto Lc2
        Lb9:
            if (r1 <= 0) goto Lbd
            r0.B = r11
        Lbd:
            o5.q$i r1 = o5.q.i.b
            r0.i0(r1, r12)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.b0.s0(long, long):void");
    }

    @Override // o5.q
    public void t(@NonNull ViewGroup viewGroup, @NonNull e0 e0Var, @NonNull e0 e0Var2, @NonNull ArrayList<d0> arrayList, @NonNull ArrayList<d0> arrayList2) {
        long P = P();
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = this.Q.get(i10);
            if (P > 0 && (this.R || i10 == 0)) {
                long P2 = qVar.P();
                if (P2 > 0) {
                    qVar.y0(P2 + P);
                } else {
                    qVar.y0(P);
                }
            }
            qVar.t(viewGroup, e0Var, e0Var2, arrayList, arrayList2);
        }
    }

    @Override // o5.q
    public void u0(q.e eVar) {
        super.u0(eVar);
        this.U |= 8;
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).u0(eVar);
        }
    }

    @Override // o5.q
    public void w0(k kVar) {
        super.w0(kVar);
        this.U |= 4;
        if (this.Q != null) {
            for (int i10 = 0; i10 < this.Q.size(); i10++) {
                this.Q.get(i10).w0(kVar);
            }
        }
    }

    @Override // o5.q
    public void x(ViewGroup viewGroup) {
        super.x(viewGroup);
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).x(viewGroup);
        }
    }

    @Override // o5.q
    public void x0(z zVar) {
        super.x0(zVar);
        this.U |= 2;
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).x0(zVar);
        }
    }
}

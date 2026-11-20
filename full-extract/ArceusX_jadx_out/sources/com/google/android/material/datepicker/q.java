package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.e;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public class q extends RecyclerView.h<b> {

    /* renamed from: d, reason: collision with root package name */
    public final e<?> f7970d;

    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7971a;

        public a(int i10) {
            this.f7971a = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            q.this.f7970d.v2(q.this.f7970d.m2().k(Month.j(this.f7971a, q.this.f7970d.o2().b)));
            q.this.f7970d.w2(e.l.DAY);
        }
    }

    public static class b extends RecyclerView.f0 {

        /* renamed from: u, reason: collision with root package name */
        public final TextView f7972u;

        public b(TextView textView) {
            super(textView);
            this.f7972u = textView;
        }
    }

    public q(e<?> eVar) {
        this.f7970d = eVar;
    }

    @NonNull
    public final View.OnClickListener D(int i10) {
        return new a(i10);
    }

    public int E(int i10) {
        return i10 - this.f7970d.m2().r().f7881c;
    }

    public int F(int i10) {
        return this.f7970d.m2().r().f7881c + i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void r(@NonNull b bVar, int i10) {
        int F = F(i10);
        bVar.f7972u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(F)));
        TextView textView = bVar.f7972u;
        textView.setContentDescription(c.e(textView.getContext(), F));
        com.google.android.material.datepicker.b n22 = this.f7970d.n2();
        Calendar g10 = p.g();
        com.google.android.material.datepicker.a aVar = g10.get(1) == F ? n22.f7895f : n22.f7893d;
        Iterator<Long> it = this.f7970d.p2().T2().iterator();
        while (it.hasNext()) {
            g10.setTimeInMillis(it.next().longValue());
            if (g10.get(1) == F) {
                aVar = n22.f7894e;
            }
        }
        aVar.d(bVar.f7972u);
        bVar.f7972u.setOnClickListener(D(F));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NonNull
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public b t(@NonNull ViewGroup viewGroup, int i10) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(ic.h.f20522s, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.f7970d.m2().s();
    }
}

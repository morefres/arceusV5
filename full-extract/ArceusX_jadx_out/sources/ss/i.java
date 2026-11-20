package ss;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;
import ss.e;

/* loaded from: classes3.dex */
public class i extends e {

    /* renamed from: a, reason: collision with root package name */
    public final TextView.BufferType f31660a;
    public final pn.f b;

    /* renamed from: c, reason: collision with root package name */
    public final n f31661c;

    /* renamed from: d, reason: collision with root package name */
    public final g f31662d;

    /* renamed from: e, reason: collision with root package name */
    public final List<j> f31663e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f31664f;

    public i(@NonNull TextView.BufferType bufferType, e.b bVar, @NonNull pn.f fVar, @NonNull n nVar, @NonNull g gVar, @NonNull List<j> list, boolean z10) {
        this.f31660a = bufferType;
        this.b = fVar;
        this.f31661c = nVar;
        this.f31662d = gVar;
        this.f31663e = list;
        this.f31664f = z10;
    }

    @Override // ss.e
    public void c(@NonNull TextView textView, @NonNull String str) {
        d(textView, e(str));
    }

    @Override // ss.e
    public void d(@NonNull TextView textView, @NonNull Spanned spanned) {
        Iterator<j> it = this.f31663e.iterator();
        while (it.hasNext()) {
            it.next().k(textView, spanned);
        }
        textView.setText(spanned, this.f31660a);
        Iterator<j> it2 = this.f31663e.iterator();
        while (it2.hasNext()) {
            it2.next().c(textView);
        }
    }

    @Override // ss.e
    @NonNull
    public Spanned e(@NonNull String str) {
        Spanned g10 = g(f(str));
        return (TextUtils.isEmpty(g10) && this.f31664f && !TextUtils.isEmpty(str)) ? new SpannableStringBuilder(str) : g10;
    }

    @NonNull
    public on.s f(@NonNull String str) {
        Iterator<j> it = this.f31663e.iterator();
        while (it.hasNext()) {
            str = it.next().g(str);
        }
        return this.b.b(str);
    }

    @NonNull
    public Spanned g(@NonNull on.s sVar) {
        Iterator<j> it = this.f31663e.iterator();
        while (it.hasNext()) {
            it.next().d(sVar);
        }
        m a10 = this.f31661c.a();
        sVar.a(a10);
        Iterator<j> it2 = this.f31663e.iterator();
        while (it2.hasNext()) {
            it2.next().j(sVar, a10);
        }
        return a10.builder().l();
    }
}

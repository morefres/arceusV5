package ym;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import ju.d2;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lym/r;", "Landroid/widget/EditText;", "view", "", j6.b.f21518e, "(Lym/r;Landroid/widget/EditText;)V", "Landroid/widget/TextView;", "Lkotlin/Function1;", "", "handler", "", "c", "(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;Lmt/b;)Ljava/lang/Object;", "wf1-core-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {1, 6, 0})
    @ot.f(c = "com.squareup.workflow1.ui.TextControllerControlEditTextKt$control$subscription$1", f = "TextControllerControlEditText.kt", l = {MotionEventCompat.AXIS_GENERIC_16}, m = "invokeSuspend")
    public static final class a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f36799t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f36800u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ r f36801v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ EditText f36802w;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "textValue", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
        @ot.f(c = "com.squareup.workflow1.ui.TextControllerControlEditTextKt$control$subscription$1$1", f = "TextControllerControlEditText.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ym.s$a$a, reason: collision with other inner class name */
        public static final class C0681a extends ot.m implements Function2<String, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f36803t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f36804u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ EditText f36805v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0681a(EditText editText, mt.b<? super C0681a> bVar) {
                super(2, bVar);
                this.f36805v = editText;
            }

            @Override // ot.a
            @NotNull
            public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
                C0681a c0681a = new C0681a(this.f36805v, bVar);
                c0681a.f36804u = obj;
                return c0681a;
            }

            @Override // ot.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                nt.c.e();
                if (this.f36803t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                String str = (String) this.f36804u;
                if (!Intrinsics.c(str, this.f36805v.getText().toString())) {
                    this.f36805v.setText(str);
                }
                return Unit.f22894a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull String str, @Nullable mt.b<? super Unit> bVar) {
                return ((C0681a) create(str, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "updatedText", "", ve.a.f33391e, "(Ljava/lang/CharSequence;)V"}, k = 3, mv = {1, 6, 0})
        public static final class b extends kotlin.jvm.internal.m implements Function1<CharSequence, Unit> {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ r f36806i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(r rVar) {
                super(1);
                this.f36806i = rVar;
            }

            public final void a(@Nullable CharSequence charSequence) {
                r rVar = this.f36806i;
                String obj = charSequence == null ? null : charSequence.toString();
                if (obj == null) {
                    obj = "";
                }
                rVar.c(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
                a(charSequence);
                return Unit.f22894a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r rVar, EditText editText, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f36801v = rVar;
            this.f36802w = editText;
        }

        @Override // ot.a
        @NotNull
        public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
            a aVar = new a(this.f36801v, this.f36802w, bVar);
            aVar.f36800u = obj;
            return aVar;
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f36799t;
            if (i10 == 0) {
                gt.o.b(obj);
                mu.j.z(mu.j.E(this.f36801v.a(), new C0681a(this.f36802w, null)), (p0) this.f36800u);
                EditText editText = this.f36802w;
                b bVar = new b(this.f36801v);
                this.f36799t = 1;
                if (s.c(editText, bVar, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            throw new gt.d();
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull p0 p0Var, @Nullable mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @ot.f(c = "com.squareup.workflow1.ui.TextControllerControlEditTextKt", f = "TextControllerControlEditText.kt", l = {91}, m = "listenForTextChangesUntilCancelled")
    public static final class b extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f36807t;

        /* renamed from: u, reason: collision with root package name */
        public Object f36808u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f36809v;

        /* renamed from: w, reason: collision with root package name */
        public int f36810w;

        public b(mt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36809v = obj;
            this.f36810w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return s.c(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", ve.a.f33391e, "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    public static final class c extends kotlin.jvm.internal.m implements Function1<Throwable, Unit> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ TextView f36811i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ d f36812j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TextView textView, d dVar) {
            super(1);
            this.f36811i = textView;
            this.f36812j = dVar;
        }

        public final void a(@Nullable Throwable th2) {
            this.f36811i.removeTextChangedListener(this.f36812j);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f22894a;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"ym/s$d", "Landroid/text/TextWatcher;", "", "s", "", "start", "before", "count", "", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "after", "beforeTextChanged", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class d implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1<CharSequence, Unit> f36813a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super CharSequence, Unit> function1) {
            this.f36813a = function1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@NotNull Editable s8) {
            Intrinsics.checkNotNullParameter(s8, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence s8, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence s8, int start, int before, int count) {
            this.f36813a.invoke(s8);
        }
    }

    public static final void b(@NotNull r rVar, @NotNull EditText view) {
        d2 subscription;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        Object tag = view.getTag(o.f36792a);
        v vVar = tag instanceof v ? (v) tag : null;
        if ((vVar == null ? null : vVar.getController()) == rVar && vVar.getSubscription().b()) {
            return;
        }
        if (vVar != null && (subscription = vVar.getSubscription()) != null) {
            d2.a.a(subscription, null, 1, null);
        }
        view.setText(rVar.b());
        view.setTag(o.f36792a, new v(rVar, b0.c(view, null, new a(rVar, view, null), 1, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(android.widget.TextView r4, kotlin.jvm.functions.Function1<? super java.lang.CharSequence, kotlin.Unit> r5, mt.b<?> r6) {
        /*
            boolean r0 = r6 instanceof ym.s.b
            if (r0 == 0) goto L13
            r0 = r6
            ym.s$b r0 = (ym.s.b) r0
            int r1 = r0.f36810w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36810w = r1
            goto L18
        L13:
            ym.s$b r0 = new ym.s$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f36809v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f36810w
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.f36808u
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            java.lang.Object r4 = r0.f36807t
            android.widget.TextView r4 = (android.widget.TextView) r4
            gt.o.b(r6)
            goto L6e
        L39:
            gt.o.b(r6)
            r0.f36807t = r4
            r0.f36808u = r5
            r0.f36810w = r3
            ju.p r6 = new ju.p
            mt.b r2 = nt.b.c(r0)
            r6.<init>(r2, r3)
            r6.F()
            ym.s$d r2 = new ym.s$d
            r2.<init>(r5)
            r4.addTextChangedListener(r2)
            ym.s$c r5 = new ym.s$c
            r5.<init>(r4, r2)
            r6.k(r5)
            java.lang.Object r4 = r6.z()
            java.lang.Object r5 = nt.c.e()
            if (r4 != r5) goto L6b
            ot.h.c(r0)
        L6b:
            if (r4 != r1) goto L6e
            return r1
        L6e:
            gt.d r4 = new gt.d
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ym.s.c(android.widget.TextView, kotlin.jvm.functions.Function1, mt.b):java.lang.Object");
    }
}

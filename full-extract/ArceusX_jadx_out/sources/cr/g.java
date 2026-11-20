package cr;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ym.r;
import ym.u;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\f\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001f\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0011\u0010\"\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010%\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010$¨\u0006&"}, d2 = {"Lcr/g;", "", "", "initialValue", "monthPlaceholder", "", "monthList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "year", "month", "day", ve.a.f33391e, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/List;", "getMonthList", "()Ljava/util/List;", "Lym/r;", j6.b.f21518e, "Lym/r;", "g", "()Lym/r;", "yearController", "c", rl.d.f30696a, "monthController", "dayController", "Lmu/h;", "e", "Lmu/h;", "()Lmu/h;", "onChanged", "f", "()Ljava/lang/String;", "value", "Ljava/util/Date;", "()Ljava/util/Date;", "dateValue", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> monthList;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final r yearController;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final r monthController;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final r dayController;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mu.h<String> onChanged;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/i;", "", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.steps.ui.components.utils.DateController$1", f = "DateController.kt", l = {60}, m = "invokeSuspend")
    public static final class a extends ot.m implements Function2<mu.i<? super String>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f14173t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f14174u;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: cr.g$a$a, reason: collision with other inner class name */
        public static final class C0275a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ mu.i<String> f14176a;
            public final /* synthetic */ g b;

            /* JADX WARN: Multi-variable type inference failed */
            public C0275a(mu.i<? super String> iVar, g gVar) {
                this.f14176a = iVar;
                this.b = gVar;
            }

            @Override // mu.i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, mt.b<? super Unit> bVar) {
                Object emit = this.f14176a.emit(this.b.f(), bVar);
                return emit == nt.c.e() ? emit : Unit.f22894a;
            }
        }

        public a(mt.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            a aVar = g.this.new a(bVar);
            aVar.f14174u = obj;
            return aVar;
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            mu.i iVar = (mu.i) this.f14174u;
            Object e10 = nt.c.e();
            int i10 = this.f14173t;
            if (i10 == 0) {
                gt.o.b(obj);
                mu.h C = mu.j.C(g.this.getYearController().a(), g.this.getMonthController().a(), g.this.getDayController().a());
                C0275a c0275a = new C0275a(iVar, g.this);
                this.f14174u = ot.l.a(iVar);
                this.f14173t = 1;
                if (C.collect(c0275a, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mu.i<? super String> iVar, mt.b<? super Unit> bVar) {
            return ((a) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public g(@Nullable String str, @Nullable String str2, @NotNull List<String> monthList) {
        String str3;
        Intrinsics.checkNotNullParameter(monthList, "monthList");
        this.monthList = monthList;
        List P0 = str != null ? StringsKt.P0(str, new char[]{'-'}, false, 0, 6, null) : null;
        P0 = (P0 == null || P0.size() != 3) ? kotlin.collections.p.n("", "", "") : P0;
        this.yearController = u.a((String) P0.get(0));
        try {
            str3 = monthList.get(Integer.parseInt((String) P0.get(1)) - 1);
        } catch (NumberFormatException unused) {
            str3 = str2 == null ? "" : str2;
        }
        this.monthController = u.a(str3);
        this.dayController = u.a((String) P0.get(2));
        this.onChanged = mu.j.w(new a(null));
    }

    public final String a(String year, String month, String day) {
        int h02 = CollectionsKt.h0(this.monthList, month);
        String y02 = h02 > -1 ? StringsKt.y0(String.valueOf(h02 + 1), 2, '0') : null;
        if (year == null || year.length() == 0 || y02 == null || y02.length() == 0 || day == null || day.length() == 0) {
            return "";
        }
        return year + "-" + y02 + "-" + day;
    }

    @Nullable
    public final Date b() {
        try {
            List P0 = StringsKt.P0(f(), new char[]{'-'}, false, 0, 6, null);
            Calendar calendar = Calendar.getInstance();
            calendar.set(1, Integer.parseInt((String) P0.get(0)));
            calendar.set(2, Integer.parseInt((String) P0.get(1)) - 1);
            calendar.set(5, Integer.parseInt((String) P0.get(2)));
            return calendar.getTime();
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    /* renamed from: c, reason: from getter */
    public final r getDayController() {
        return this.dayController;
    }

    @NotNull
    /* renamed from: d, reason: from getter */
    public final r getMonthController() {
        return this.monthController;
    }

    @NotNull
    public final mu.h<String> e() {
        return this.onChanged;
    }

    @NotNull
    public final String f() {
        return a(this.yearController.b(), this.monthController.b(), this.dayController.b());
    }

    @NotNull
    /* renamed from: g, reason: from getter */
    public final r getYearController() {
        return this.yearController;
    }
}

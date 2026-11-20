package v3;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.view.inputmethod.EditorInfoCompat;
import gt.h;
import gt.i;
import gt.o;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;
import ot.m;
import t3.g;
import yt.n;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010#\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u001dB\u0089\u0001\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012$\b\u0002\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0014\u0010\u0015By\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012$\b\u0002\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e¢\u0006\u0004\b\u0014\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010 R0\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R6\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010$R\u001b\u0010(\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001c\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lv3/a;", "T", "Lt3/g;", "Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "produceSharedPreferences", "", "", "keysToMigrate", "Lkotlin/Function2;", "Lmt/b;", "", "", "shouldRunMigration", "Lkotlin/Function3;", "Lv3/c;", "migrate", "Landroid/content/Context;", "context", "name", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lkotlin/jvm/functions/Function2;Lyt/n;Landroid/content/Context;Ljava/lang/String;)V", "sharedPreferencesName", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lkotlin/jvm/functions/Function2;Lyt/n;)V", "currentData", j6.b.f21518e, "(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;", ve.a.f33391e, "", "c", "(Lmt/b;)Ljava/lang/Object;", rl.d.f30696a, "(Landroid/content/Context;Ljava/lang/String;)V", "Lkotlin/jvm/functions/Function2;", "Lyt/n;", "Landroid/content/Context;", "Ljava/lang/String;", "e", "Lgt/h;", "()Landroid/content/SharedPreferences;", "sharedPrefs", "", "f", "Ljava/util/Set;", "keySet", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a<T> implements g<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function2<T, mt.b<? super Boolean>, Object> shouldRunMigration;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final n<v3.c, T, mt.b<? super T>, Object> migrate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Context context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String name;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h sharedPrefs;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Set<String> keySet;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.datastore.migrations.SharedPreferencesMigration$3", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    /* renamed from: v3.a$a, reason: collision with other inner class name */
    public static final class C0611a extends m implements Function2<T, mt.b<? super Boolean>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f33217t;

        public C0611a(mt.b<? super C0611a> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        @NotNull
        public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
            return new C0611a(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            nt.c.e();
            if (this.f33217t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return ot.b.a(true);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t8, @Nullable mt.b<? super Boolean> bVar) {
            return ((C0611a) create(t8, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Landroid/content/SharedPreferences;", j6.b.f21518e, "()Landroid/content/SharedPreferences;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends kotlin.jvm.internal.m implements Function0<SharedPreferences> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Context f33218i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f33219j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, String str) {
            super(0);
            this.f33218i = context;
            this.f33219j = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.f33218i.getSharedPreferences(this.f33219j, 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lv3/a$c;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "name", "", ve.a.f33391e, "(Landroid/content/Context;Ljava/lang/String;)Z", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f33220a = new c();

        public static final boolean a(@NotNull Context context, @NotNull String name) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.android.kt", l = {151}, m = "shouldMigrate")
    public static final class d extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f33221t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f33222u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ a<T> f33223v;

        /* renamed from: w, reason: collision with root package name */
        public int f33224w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a<T> aVar, mt.b<? super d> bVar) {
            super(bVar);
            this.f33223v = aVar;
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33222u = obj;
            this.f33224w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f33223v.b(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Function0<? extends SharedPreferences> function0, Set<String> set, Function2<? super T, ? super mt.b<? super Boolean>, ? extends Object> function2, n<? super v3.c, ? super T, ? super mt.b<? super T>, ? extends Object> nVar, Context context, String str) {
        this.shouldRunMigration = function2;
        this.migrate = nVar;
        this.context = context;
        this.name = str;
        this.sharedPrefs = i.b(function0);
        this.keySet = set == v3.b.a() ? null : CollectionsKt.P0(set);
    }

    @Override // t3.g
    @Nullable
    public Object a(T t8, @NotNull mt.b<? super T> bVar) {
        return this.migrate.invoke(new v3.c(e(), this.keySet), t8, bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r5.isEmpty() == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // t3.g
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(T r5, @org.jetbrains.annotations.NotNull mt.b<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof v3.a.d
            if (r0 == 0) goto L13
            r0 = r6
            v3.a$d r0 = (v3.a.d) r0
            int r1 = r0.f33224w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33224w = r1
            goto L18
        L13:
            v3.a$d r0 = new v3.a$d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f33222u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f33224w
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f33221t
            v3.a r5 = (v3.a) r5
            gt.o.b(r6)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            gt.o.b(r6)
            kotlin.jvm.functions.Function2<T, mt.b<? super java.lang.Boolean>, java.lang.Object> r6 = r4.shouldRunMigration
            r0.f33221t = r4
            r0.f33224w = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 0
            if (r6 != 0) goto L54
            java.lang.Boolean r5 = ot.b.a(r0)
            return r5
        L54:
            java.util.Set<java.lang.String> r6 = r5.keySet
            if (r6 != 0) goto L6e
            android.content.SharedPreferences r5 = r5.e()
            java.util.Map r5 = r5.getAll()
            java.lang.String r6 = "sharedPrefs.all"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L6c
            goto L98
        L6c:
            r3 = r0
            goto L98
        L6e:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            android.content.SharedPreferences r5 = r5.e()
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L82
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L82
            goto L6c
        L82:
            java.util.Iterator r6 = r6.iterator()
        L86:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L86
        L98:
            java.lang.Boolean r5 = ot.b.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.a.b(java.lang.Object, mt.b):java.lang.Object");
    }

    @Override // t3.g
    @Nullable
    public Object c(@NotNull mt.b<? super Unit> bVar) {
        Context context;
        String str;
        SharedPreferences.Editor edit = e().edit();
        Set<String> set = this.keySet;
        if (set == null) {
            edit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                edit.remove((String) it.next());
            }
        }
        if (!edit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (e().getAll().isEmpty() && (context = this.context) != null && (str = this.name) != null) {
            d(context, str);
        }
        Set<String> set2 = this.keySet;
        if (set2 != null) {
            set2.clear();
        }
        return Unit.f22894a;
    }

    public final void d(Context context, String name) {
        c.a(context, name);
    }

    public final SharedPreferences e() {
        return (SharedPreferences) this.sharedPrefs.getValue();
    }

    public /* synthetic */ a(Context context, String str, Set set, Function2 function2, n nVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? v3.b.a() : set, (i10 & 8) != 0 ? new C0611a(null) : function2, nVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, @NotNull String sharedPreferencesName, @NotNull Set<String> keysToMigrate, @NotNull Function2<? super T, ? super mt.b<? super Boolean>, ? extends Object> shouldRunMigration, @NotNull n<? super v3.c, ? super T, ? super mt.b<? super T>, ? extends Object> migrate) {
        this(new b(context, sharedPreferencesName), keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }
}

package lp;

import android.content.Context;
import gt.o;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import ju.a0;
import ju.g1;
import ju.h2;
import ju.l0;
import ju.p0;
import ju.q0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.x;
import lp.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.l;
import ot.m;
import tt.i;
import tt.k;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0018B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\f*\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J2\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Llp/b;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "subsystem", "Llp/a;", "level", "category", "message", "", "i", "(Ljava/lang/String;Llp/a;Ljava/lang/String;Ljava/lang/String;)V", "j", "(Ljava/lang/String;Llp/a;Lmt/b;)Ljava/lang/Object;", "f", "(Lmt/b;)Ljava/lang/Object;", "Ljava/io/File;", "g", "(Ljava/io/File;)V", "h", "(Ljava/lang/String;)Ljava/io/File;", ve.a.f33391e, "(Ljava/lang/String;Llp/a;Ljava/lang/String;Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "Landroid/content/Context;", "Ljava/text/SimpleDateFormat;", j6.b.f21518e, "Ljava/text/SimpleDateFormat;", "dateFormat", "Lju/p0;", "c", "Lju/p0;", "coroutineScope", "Lju/l0;", rl.d.f30696a, "Lju/l0;", "loggerContext", "e", "Ljava/io/File;", "errorLogsDir", "logger_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final SimpleDateFormat dateFormat;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 coroutineScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 loggerContext;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final File errorLogsDir;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)Ljava/lang/Object;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.logger.Logger$_log$2", f = "Logger.kt", l = {}, m = "invokeSuspend")
    /* renamed from: lp.b$b, reason: collision with other inner class name */
    public static final class C0416b extends m implements Function2<p0, mt.b<? super Object>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f23794t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f23796v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f23797w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ a f23798x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f23799y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0416b(String str, String str2, a aVar, String str3, mt.b<? super C0416b> bVar) {
            super(2, bVar);
            this.f23796v = str;
            this.f23797w = str2;
            this.f23798x = aVar;
            this.f23799y = str3;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return b.this.new C0416b(this.f23796v, this.f23797w, this.f23798x, this.f23799y, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, mt.b<? super Object> bVar) {
            return invoke2(p0Var, (mt.b<Object>) bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            String str;
            nt.c.e();
            if (this.f23794t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            try {
                File h10 = b.this.h(this.f23796v);
                File parentFile = h10.getParentFile();
                if (parentFile != null) {
                    ot.b.a(parentFile.mkdirs());
                }
                if (this.f23797w != null) {
                    str = this.f23798x.name() + "," + b.this.dateFormat.format(new Date()) + "," + this.f23797w + "," + this.f23799y + "\n";
                } else {
                    str = this.f23798x.name() + "," + b.this.dateFormat.format(new Date()) + "," + this.f23799y + "\n";
                }
                FileWriter fileWriter = new FileWriter(h10, true);
                try {
                    Writer append = fileWriter.append((CharSequence) str);
                    tt.c.a(fileWriter, null);
                    return append;
                } finally {
                }
            } catch (Exception unused) {
                return Unit.f22894a;
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, mt.b<Object> bVar) {
            return ((C0416b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.logger.Logger$deleteLogFiles$2", f = "Logger.kt", l = {}, m = "invokeSuspend")
    public static final class c extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f23800t;

        public c(mt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return b.this.new c(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f23800t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            if (b.this.errorLogsDir.exists()) {
                try {
                    ot.b.a(k.o(b.this.errorLogsDir));
                } catch (SecurityException unused) {
                }
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.logger.Logger$log$1", f = "Logger.kt", l = {88}, m = "invokeSuspend")
    public static final class d extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f23802t;

        /* renamed from: u, reason: collision with root package name */
        public int f23803u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f23804v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ b f23805w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f23806x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ a f23807y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f23808z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, b bVar, String str2, a aVar, String str3, mt.b<? super d> bVar2) {
            super(2, bVar2);
            this.f23804v = str;
            this.f23805w = bVar;
            this.f23806x = str2;
            this.f23807y = aVar;
            this.f23808z = str3;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new d(this.f23804v, this.f23805w, this.f23806x, this.f23807y, this.f23808z, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f23803u;
            if (i10 == 0) {
                o.b(obj);
                String N = x.N(this.f23804v, "\n", "\\n", false, 4, null);
                b bVar = this.f23805w;
                String str = this.f23806x;
                a aVar = this.f23807y;
                String str2 = this.f23808z;
                this.f23802t = l.a(N);
                this.f23803u = 1;
                if (bVar.a(str, aVar, str2, N, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.logger.Logger$readCsvLogsWith$2", f = "Logger.kt", l = {}, m = "invokeSuspend")
    public static final class e extends m implements Function2<p0, mt.b<? super String>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f23809t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f23811v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ a f23812w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, a aVar, mt.b<? super e> bVar) {
            super(2, bVar);
            this.f23811v = str;
            this.f23812w = aVar;
        }

        public static final Unit q(a aVar, String str, StringBuilder sb2, String str2) {
            String str3;
            List split$default = StringsKt.split$default(str2, new String[]{","}, false, 4, 2, null);
            String str4 = (String) split$default.get(0);
            String str5 = (String) split$default.get(1);
            if (Intrinsics.c(str4, aVar.name())) {
                if (split$default.size() == 4) {
                    str3 = str4 + "," + str5 + "," + ((String) split$default.get(2)) + "," + ((String) split$default.get(3)) + "\n";
                } else if (split$default.size() == 3) {
                    str3 = str4 + "," + str5 + "," + str + "," + ((String) split$default.get(2)) + "\n";
                } else {
                    str3 = "";
                }
                sb2.append(str3);
            }
            return Unit.f22894a;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return b.this.new e(this.f23811v, this.f23812w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f23809t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            try {
                File h10 = b.this.h(this.f23811v);
                if (!h10.exists()) {
                    return null;
                }
                final StringBuilder sb2 = new StringBuilder();
                final a aVar = this.f23812w;
                final String str = this.f23811v;
                i.e(h10, null, new Function1() { // from class: lp.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit q10;
                        q10 = b.e.q(a.this, str, sb2, (String) obj2);
                        return q10;
                    }
                }, 1, null);
                return sb2.toString();
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super String> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public b(@NotNull Context context) {
        a0 b;
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        l0 a10 = g1.a();
        b = h2.b(null, 1, null);
        this.coroutineScope = q0.a(a10.plus(b));
        this.loggerContext = l0.U(g1.b(), 1, null, 2, null);
        this.errorLogsDir = new File(context.getCacheDir(), "error_logs");
    }

    public final Object a(String str, a aVar, String str2, String str3, mt.b<? super Unit> bVar) {
        Object g10 = ju.i.g(this.loggerContext, new C0416b(str, str2, aVar, str3, null), bVar);
        return g10 == nt.c.e() ? g10 : Unit.f22894a;
    }

    @Nullable
    public final Object f(@NotNull mt.b<? super Unit> bVar) {
        Object g10 = ju.i.g(this.loggerContext, new c(null), bVar);
        return g10 == nt.c.e() ? g10 : Unit.f22894a;
    }

    public final void g(File file) {
        if (file.exists()) {
            if (!file.isFile()) {
                return;
            } else {
                file.delete();
            }
        }
        file.mkdirs();
    }

    public final File h(String subsystem) {
        String f12 = StringsKt.f1(subsystem, ".", null, 2, null);
        g(this.errorLogsDir);
        return new File(this.errorLogsDir, "persona_log_" + f12 + ".csv");
    }

    public final void i(@NotNull String subsystem, @NotNull a level, @Nullable String category, @NotNull String message) {
        Intrinsics.checkNotNullParameter(subsystem, "subsystem");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        ju.k.d(this.coroutineScope, null, null, new d(message, this, subsystem, level, category, null), 3, null);
    }

    @Nullable
    public final Object j(@NotNull String str, @NotNull a aVar, @NotNull mt.b<? super String> bVar) {
        return ju.i.g(this.loggerContext, new e(str, aVar, null), bVar);
    }
}

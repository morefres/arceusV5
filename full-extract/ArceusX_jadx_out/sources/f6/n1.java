package f6;

import androidx.work.b;
import f6.j0;
import g6.NetworkRequestCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x5.o0;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 -2\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00112\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u0014J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u0014J\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010'\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010$J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0016¢\u0006\u0004\b)\u0010&J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0016¢\u0006\u0004\b*\u0010&J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020!H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u00020!2\u0006\u00103\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020!2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b8\u00102J\u001f\u0010:\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u00109\u001a\u00020\u0018H\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010=\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010<\u001a\u00020+H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020!2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b?\u00107J\u0017\u0010@\u001a\u00020!2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b@\u00107J\u001f\u0010B\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010A\u001a\u00020!H\u0016¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020!2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010D\u001a\u00020+H\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020!H\u0016¢\u0006\u0004\bG\u00100J\u001f\u0010I\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010H\u001a\u00020!H\u0016¢\u0006\u0004\bI\u0010CR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010JR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00060K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010LR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00060N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010O¨\u0006Q"}, d2 = {"Lf6/n1;", "Lf6/k0;", "Lx4/u;", "__db", "<init>", "(Lx4/u;)V", "Lf6/j0;", "workSpec", "", "h", "(Lf6/j0;)V", "g", "", "id", "k", "(Ljava/lang/String;)Lf6/j0;", "name", "", "Lf6/j0$b;", "r", "(Ljava/lang/String;)Ljava/util/List;", "Lx5/o0$c;", "j", "(Ljava/lang/String;)Lx5/o0$c;", "Landroidx/work/b;", "n", "tag", "m", "i", "Lmu/h;", "", "s", "()Lmu/h;", "", "schedulerLimit", zl.t.f38095d, "(I)Ljava/util/List;", "x", "()Ljava/util/List;", "maxLimit", "o", "f", "w", "", "startingAt", rl.d.f30696a, "(J)Ljava/util/List;", "A", "()I", ve.a.f33391e, "(Ljava/lang/String;)V", "state", "c", "(Lx5/o0$c;Ljava/lang/String;)I", "l", "(Ljava/lang/String;)I", j6.b.f21518e, "output", "u", "(Ljava/lang/String;Landroidx/work/b;)V", "enqueueTime", "v", "(Ljava/lang/String;J)V", "z", "y", "overrideGeneration", "B", "(Ljava/lang/String;I)V", "startTime", "q", "(Ljava/lang/String;J)I", "p", "stopReason", "e", "Lx4/u;", "Lx4/f;", "Lx4/f;", "__insertAdapterOfWorkSpec", "Lx4/e;", "Lx4/e;", "__updateAdapterOfWorkSpec", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n1 implements k0 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x4.u __db;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final x4.f<j0> __insertAdapterOfWorkSpec;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x4.e<j0> __updateAdapterOfWorkSpec;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"f6/n1$a", "Lx4/f;", "Lf6/j0;", "", j6.b.f21518e, "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "g", "(Lf5/d;Lf6/j0;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends x4.f<j0> {
        @Override // x4.f
        public String b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // x4.f
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(f5.d statement, j0 entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.i0(1, entity.id);
            statement.z(2, v1.k(entity.state));
            statement.i0(3, entity.workerClassName);
            statement.i0(4, entity.inputMergerClassName);
            b.Companion companion = androidx.work.b.INSTANCE;
            statement.A(5, companion.e(entity.input));
            statement.A(6, companion.e(entity.output));
            statement.z(7, entity.initialDelay);
            statement.z(8, entity.intervalDuration);
            statement.z(9, entity.flexDuration);
            statement.z(10, entity.runAttemptCount);
            statement.z(11, v1.a(entity.backoffPolicy));
            statement.z(12, entity.backoffDelayDuration);
            statement.z(13, entity.lastEnqueueTime);
            statement.z(14, entity.minimumRetentionDuration);
            statement.z(15, entity.scheduleRequestedAt);
            statement.z(16, entity.expedited ? 1L : 0L);
            statement.z(17, v1.i(entity.outOfQuotaPolicy));
            statement.z(18, entity.getPeriodCount());
            statement.z(19, entity.getGeneration());
            statement.z(20, entity.getNextScheduleTimeOverride());
            statement.z(21, entity.getNextScheduleTimeOverrideGeneration());
            statement.z(22, entity.getStopReason());
            String traceTag = entity.getTraceTag();
            if (traceTag == null) {
                statement.C(23);
            } else {
                statement.i0(23, traceTag);
            }
            Boolean backOffOnSystemInterruptions = entity.getBackOffOnSystemInterruptions();
            if ((backOffOnSystemInterruptions != null ? Integer.valueOf(backOffOnSystemInterruptions.booleanValue() ? 1 : 0) : null) == null) {
                statement.C(24);
            } else {
                statement.z(24, r0.intValue());
            }
            x5.d dVar = entity.constraints;
            statement.z(25, v1.h(dVar.getRequiredNetworkType()));
            statement.A(26, v1.c(dVar.getRequiredNetworkRequestCompat()));
            statement.z(27, dVar.getRequiresCharging() ? 1L : 0L);
            statement.z(28, dVar.getRequiresDeviceIdle() ? 1L : 0L);
            statement.z(29, dVar.getRequiresBatteryNotLow() ? 1L : 0L);
            statement.z(30, dVar.getRequiresStorageNotLow() ? 1L : 0L);
            statement.z(31, dVar.getContentTriggerUpdateDelayMillis());
            statement.z(32, dVar.getContentTriggerMaxDelayMillis());
            statement.A(33, v1.j(dVar.c()));
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"f6/n1$b", "Lx4/e;", "Lf6/j0;", "", j6.b.f21518e, "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "e", "(Lf5/d;Lf6/j0;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends x4.e<j0> {
        @Override // x4.e
        public String b() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        @Override // x4.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(f5.d statement, j0 entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.i0(1, entity.id);
            statement.z(2, v1.k(entity.state));
            statement.i0(3, entity.workerClassName);
            statement.i0(4, entity.inputMergerClassName);
            b.Companion companion = androidx.work.b.INSTANCE;
            statement.A(5, companion.e(entity.input));
            statement.A(6, companion.e(entity.output));
            statement.z(7, entity.initialDelay);
            statement.z(8, entity.intervalDuration);
            statement.z(9, entity.flexDuration);
            statement.z(10, entity.runAttemptCount);
            statement.z(11, v1.a(entity.backoffPolicy));
            statement.z(12, entity.backoffDelayDuration);
            statement.z(13, entity.lastEnqueueTime);
            statement.z(14, entity.minimumRetentionDuration);
            statement.z(15, entity.scheduleRequestedAt);
            statement.z(16, entity.expedited ? 1L : 0L);
            statement.z(17, v1.i(entity.outOfQuotaPolicy));
            statement.z(18, entity.getPeriodCount());
            statement.z(19, entity.getGeneration());
            statement.z(20, entity.getNextScheduleTimeOverride());
            statement.z(21, entity.getNextScheduleTimeOverrideGeneration());
            statement.z(22, entity.getStopReason());
            String traceTag = entity.getTraceTag();
            if (traceTag == null) {
                statement.C(23);
            } else {
                statement.i0(23, traceTag);
            }
            Boolean backOffOnSystemInterruptions = entity.getBackOffOnSystemInterruptions();
            if ((backOffOnSystemInterruptions != null ? Integer.valueOf(backOffOnSystemInterruptions.booleanValue() ? 1 : 0) : null) == null) {
                statement.C(24);
            } else {
                statement.z(24, r0.intValue());
            }
            x5.d dVar = entity.constraints;
            statement.z(25, v1.h(dVar.getRequiredNetworkType()));
            statement.A(26, v1.c(dVar.getRequiredNetworkRequestCompat()));
            statement.z(27, dVar.getRequiresCharging() ? 1L : 0L);
            statement.z(28, dVar.getRequiresDeviceIdle() ? 1L : 0L);
            statement.z(29, dVar.getRequiresBatteryNotLow() ? 1L : 0L);
            statement.z(30, dVar.getRequiresStorageNotLow() ? 1L : 0L);
            statement.z(31, dVar.getContentTriggerUpdateDelayMillis());
            statement.z(32, dVar.getContentTriggerMaxDelayMillis());
            statement.A(33, v1.j(dVar.c()));
            statement.i0(34, entity.id);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf6/n1$c;", "", "<init>", "()V", "", "Lgu/c;", ve.a.f33391e, "()Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: f6.n1$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<gu.c<?>> a() {
            return kotlin.collections.p.k();
        }

        public Companion() {
        }
    }

    public n1(@NotNull x4.u __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfWorkSpec = new a();
        this.__updateAdapterOfWorkSpec = new b();
    }

    public static final int A0(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            r32.i0(1, str2);
            r32.i3();
            return c5.i.b(_connection);
        } finally {
            r32.close();
        }
    }

    public static final Unit B0(String str, long j10, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            r32.z(1, j10);
            r32.i0(2, str2);
            r32.i3();
            r32.close();
            return Unit.f22894a;
        } catch (Throwable th2) {
            r32.close();
            throw th2;
        }
    }

    public static final Unit C0(String str, androidx.work.b bVar, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            r32.A(1, androidx.work.b.INSTANCE.e(bVar));
            r32.i0(2, str2);
            r32.i3();
            r32.close();
            return Unit.f22894a;
        } catch (Throwable th2) {
            r32.close();
            throw th2;
        }
    }

    public static final int D0(String str, o0.c cVar, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            r32.z(1, v1.k(cVar));
            r32.i0(2, str2);
            r32.i3();
            return c5.i.b(_connection);
        } finally {
            r32.close();
        }
    }

    public static final Unit E0(String str, int i10, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            r32.z(1, i10);
            r32.i0(2, str2);
            r32.i3();
            r32.close();
            return Unit.f22894a;
        } catch (Throwable th2) {
            r32.close();
            throw th2;
        }
    }

    public static final Unit F0(n1 n1Var, j0 j0Var, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        n1Var.__updateAdapterOfWorkSpec.c(_connection, j0Var);
        return Unit.f22894a;
    }

    public static final int e0(String str, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            return r32.i3() ? (int) r32.getLong(0) : 0;
        } finally {
            r32.close();
        }
    }

    public static final Unit f0(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            r32.i0(1, str2);
            r32.i3();
            r32.close();
            return Unit.f22894a;
        } catch (Throwable th2) {
            r32.close();
            throw th2;
        }
    }

    public static final List g0(String str, int i10, f5.b _connection) {
        int i11;
        Integer valueOf;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            r32.z(1, i10);
            int c10 = c5.j.c(r32, "id");
            int c11 = c5.j.c(r32, "state");
            int c12 = c5.j.c(r32, "worker_class_name");
            int c13 = c5.j.c(r32, "input_merger_class_name");
            int c14 = c5.j.c(r32, "input");
            int c15 = c5.j.c(r32, "output");
            int c16 = c5.j.c(r32, "initial_delay");
            int c17 = c5.j.c(r32, "interval_duration");
            int c18 = c5.j.c(r32, "flex_duration");
            int c19 = c5.j.c(r32, "run_attempt_count");
            int c20 = c5.j.c(r32, "backoff_policy");
            int c21 = c5.j.c(r32, "backoff_delay_duration");
            int c22 = c5.j.c(r32, "last_enqueue_time");
            int c23 = c5.j.c(r32, "minimum_retention_duration");
            int c24 = c5.j.c(r32, "schedule_requested_at");
            int c25 = c5.j.c(r32, "run_in_foreground");
            int c26 = c5.j.c(r32, "out_of_quota_policy");
            int c27 = c5.j.c(r32, "period_count");
            int c28 = c5.j.c(r32, "generation");
            int c29 = c5.j.c(r32, "next_schedule_time_override");
            int c30 = c5.j.c(r32, "next_schedule_time_override_generation");
            int c31 = c5.j.c(r32, "stop_reason");
            int c32 = c5.j.c(r32, "trace_tag");
            int c33 = c5.j.c(r32, "backoff_on_system_interruptions");
            int c34 = c5.j.c(r32, "required_network_type");
            int c35 = c5.j.c(r32, "required_network_request");
            int c36 = c5.j.c(r32, "requires_charging");
            int c37 = c5.j.c(r32, "requires_device_idle");
            int c38 = c5.j.c(r32, "requires_battery_not_low");
            int c39 = c5.j.c(r32, "requires_storage_not_low");
            int c40 = c5.j.c(r32, "trigger_content_update_delay");
            int c41 = c5.j.c(r32, "trigger_max_content_delay");
            int c42 = c5.j.c(r32, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (r32.i3()) {
                String F2 = r32.F2(c10);
                int i12 = c22;
                int i13 = c23;
                o0.c g10 = v1.g((int) r32.getLong(c11));
                String F22 = r32.F2(c12);
                String F23 = r32.F2(c13);
                byte[] blob = r32.getBlob(c14);
                b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b a10 = companion.a(blob);
                androidx.work.b a11 = companion.a(r32.getBlob(c15));
                long j10 = r32.getLong(c16);
                long j11 = r32.getLong(c17);
                long j12 = r32.getLong(c18);
                int i14 = (int) r32.getLong(c19);
                int i15 = c10;
                int i16 = c11;
                x5.a d10 = v1.d((int) r32.getLong(c20));
                long j13 = r32.getLong(c21);
                long j14 = r32.getLong(i12);
                long j15 = r32.getLong(i13);
                int i17 = c24;
                long j16 = r32.getLong(i17);
                c24 = i17;
                int i18 = c25;
                int i19 = c12;
                boolean z10 = ((int) r32.getLong(i18)) != 0;
                int i20 = c26;
                int i21 = c13;
                x5.f0 f10 = v1.f((int) r32.getLong(i20));
                int i22 = c27;
                int i23 = (int) r32.getLong(i22);
                int i24 = c28;
                int i25 = (int) r32.getLong(i24);
                int i26 = c29;
                long j17 = r32.getLong(i26);
                int i27 = c30;
                int i28 = (int) r32.getLong(i27);
                c30 = i27;
                int i29 = c31;
                int i30 = (int) r32.getLong(i29);
                int i31 = c32;
                Boolean bool = null;
                String F24 = r32.isNull(i31) ? null : r32.F2(i31);
                int i32 = c33;
                if (r32.isNull(i32)) {
                    i11 = i31;
                    c31 = i29;
                    valueOf = null;
                } else {
                    i11 = i31;
                    c31 = i29;
                    valueOf = Integer.valueOf((int) r32.getLong(i32));
                }
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                Boolean bool2 = bool;
                int i33 = c34;
                x5.x e10 = v1.e((int) r32.getLong(i33));
                int i34 = c35;
                NetworkRequestCompat l10 = v1.l(r32.getBlob(i34));
                int i35 = c36;
                boolean z11 = ((int) r32.getLong(i35)) != 0;
                int i36 = c37;
                boolean z12 = ((int) r32.getLong(i36)) != 0;
                int i37 = c38;
                boolean z13 = ((int) r32.getLong(i37)) != 0;
                c38 = i37;
                int i38 = c39;
                int i39 = c40;
                int i40 = c41;
                c40 = i39;
                int i41 = c42;
                arrayList.add(new j0(F2, g10, F22, F23, a10, a11, j10, j11, j12, new x5.d(l10, e10, z11, z12, z13, ((int) r32.getLong(i38)) != 0, r32.getLong(i39), r32.getLong(i40), v1.b(r32.getBlob(i41))), i14, d10, j13, j14, j15, j16, z10, f10, i23, i25, j17, i28, i30, F24, bool2));
                c37 = i36;
                c13 = i21;
                c26 = i20;
                c27 = i22;
                c28 = i24;
                c29 = i26;
                c32 = i11;
                c33 = i32;
                c34 = i33;
                c35 = i34;
                c36 = i35;
                c42 = i41;
                c41 = i40;
                c39 = i38;
                c10 = i15;
                c22 = i12;
                c23 = i13;
                c11 = i16;
                c12 = i19;
                c25 = i18;
            }
            r32.close();
            return arrayList;
        } catch (Throwable th2) {
            r32.close();
            throw th2;
        }
    }

    public static final List h0(String str, int i10, f5.b _connection) {
        int i11;
        Integer valueOf;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            r32.z(1, i10);
            int c10 = c5.j.c(r32, "id");
            int c11 = c5.j.c(r32, "state");
            int c12 = c5.j.c(r32, "worker_class_name");
            int c13 = c5.j.c(r32, "input_merger_class_name");
            int c14 = c5.j.c(r32, "input");
            int c15 = c5.j.c(r32, "output");
            int c16 = c5.j.c(r32, "initial_delay");
            int c17 = c5.j.c(r32, "interval_duration");
            int c18 = c5.j.c(r32, "flex_duration");
            int c19 = c5.j.c(r32, "run_attempt_count");
            int c20 = c5.j.c(r32, "backoff_policy");
            int c21 = c5.j.c(r32, "backoff_delay_duration");
            int c22 = c5.j.c(r32, "last_enqueue_time");
            int c23 = c5.j.c(r32, "minimum_retention_duration");
            int c24 = c5.j.c(r32, "schedule_requested_at");
            int c25 = c5.j.c(r32, "run_in_foreground");
            int c26 = c5.j.c(r32, "out_of_quota_policy");
            int c27 = c5.j.c(r32, "period_count");
            int c28 = c5.j.c(r32, "generation");
            int c29 = c5.j.c(r32, "next_schedule_time_override");
            int c30 = c5.j.c(r32, "next_schedule_time_override_generation");
            int c31 = c5.j.c(r32, "stop_reason");
            int c32 = c5.j.c(r32, "trace_tag");
            int c33 = c5.j.c(r32, "backoff_on_system_interruptions");
            int c34 = c5.j.c(r32, "required_network_type");
            int c35 = c5.j.c(r32, "required_network_request");
            int c36 = c5.j.c(r32, "requires_charging");
            int c37 = c5.j.c(r32, "requires_device_idle");
            int c38 = c5.j.c(r32, "requires_battery_not_low");
            int c39 = c5.j.c(r32, "requires_storage_not_low");
            int c40 = c5.j.c(r32, "trigger_content_update_delay");
            int c41 = c5.j.c(r32, "trigger_max_content_delay");
            int c42 = c5.j.c(r32, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (r32.i3()) {
                String F2 = r32.F2(c10);
                int i12 = c22;
                int i13 = c23;
                o0.c g10 = v1.g((int) r32.getLong(c11));
                String F22 = r32.F2(c12);
                String F23 = r32.F2(c13);
                byte[] blob = r32.getBlob(c14);
                b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b a10 = companion.a(blob);
                androidx.work.b a11 = companion.a(r32.getBlob(c15));
                long j10 = r32.getLong(c16);
                long j11 = r32.getLong(c17);
                long j12 = r32.getLong(c18);
                int i14 = (int) r32.getLong(c19);
                int i15 = c10;
                int i16 = c11;
                x5.a d10 = v1.d((int) r32.getLong(c20));
                long j13 = r32.getLong(c21);
                long j14 = r32.getLong(i12);
                long j15 = r32.getLong(i13);
                int i17 = c24;
                long j16 = r32.getLong(i17);
                c24 = i17;
                int i18 = c25;
                int i19 = c12;
                boolean z10 = ((int) r32.getLong(i18)) != 0;
                int i20 = c26;
                int i21 = c13;
                x5.f0 f10 = v1.f((int) r32.getLong(i20));
                int i22 = c27;
                int i23 = (int) r32.getLong(i22);
                int i24 = c28;
                int i25 = (int) r32.getLong(i24);
                int i26 = c29;
                long j17 = r32.getLong(i26);
                int i27 = c30;
                int i28 = (int) r32.getLong(i27);
                c30 = i27;
                int i29 = c31;
                int i30 = (int) r32.getLong(i29);
                int i31 = c32;
                Boolean bool = null;
                String F24 = r32.isNull(i31) ? null : r32.F2(i31);
                int i32 = c33;
                if (r32.isNull(i32)) {
                    i11 = i31;
                    c31 = i29;
                    valueOf = null;
                } else {
                    i11 = i31;
                    c31 = i29;
                    valueOf = Integer.valueOf((int) r32.getLong(i32));
                }
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                Boolean bool2 = bool;
                int i33 = c34;
                x5.x e10 = v1.e((int) r32.getLong(i33));
                int i34 = c35;
                NetworkRequestCompat l10 = v1.l(r32.getBlob(i34));
                int i35 = c36;
                boolean z11 = ((int) r32.getLong(i35)) != 0;
                int i36 = c37;
                boolean z12 = ((int) r32.getLong(i36)) != 0;
                int i37 = c38;
                boolean z13 = ((int) r32.getLong(i37)) != 0;
                c38 = i37;
                int i38 = c39;
                int i39 = c40;
                int i40 = c41;
                c40 = i39;
                int i41 = c42;
                arrayList.add(new j0(F2, g10, F22, F23, a10, a11, j10, j11, j12, new x5.d(l10, e10, z11, z12, z13, ((int) r32.getLong(i38)) != 0, r32.getLong(i39), r32.getLong(i40), v1.b(r32.getBlob(i41))), i14, d10, j13, j14, j15, j16, z10, f10, i23, i25, j17, i28, i30, F24, bool2));
                c37 = i36;
                c13 = i21;
                c26 = i20;
                c27 = i22;
                c28 = i24;
                c29 = i26;
                c32 = i11;
                c33 = i32;
                c34 = i33;
                c35 = i34;
                c36 = i35;
                c42 = i41;
                c41 = i40;
                c39 = i38;
                c10 = i15;
                c22 = i12;
                c23 = i13;
                c11 = i16;
                c12 = i19;
                c25 = i18;
            }
            r32.close();
            return arrayList;
        } catch (Throwable th2) {
            r32.close();
            throw th2;
        }
    }

    public static final List i0(String str, f5.b _connection) {
        int i10;
        int i11;
        Integer valueOf;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            int c10 = c5.j.c(r32, "id");
            int c11 = c5.j.c(r32, "state");
            int c12 = c5.j.c(r32, "worker_class_name");
            int c13 = c5.j.c(r32, "input_merger_class_name");
            int c14 = c5.j.c(r32, "input");
            int c15 = c5.j.c(r32, "output");
            int c16 = c5.j.c(r32, "initial_delay");
            int c17 = c5.j.c(r32, "interval_duration");
            int c18 = c5.j.c(r32, "flex_duration");
            int c19 = c5.j.c(r32, "run_attempt_count");
            int c20 = c5.j.c(r32, "backoff_policy");
            int c21 = c5.j.c(r32, "backoff_delay_duration");
            int c22 = c5.j.c(r32, "last_enqueue_time");
            int c23 = c5.j.c(r32, "minimum_retention_duration");
            int c24 = c5.j.c(r32, "schedule_requested_at");
            int c25 = c5.j.c(r32, "run_in_foreground");
            int c26 = c5.j.c(r32, "out_of_quota_policy");
            int c27 = c5.j.c(r32, "period_count");
            int c28 = c5.j.c(r32, "generation");
            int c29 = c5.j.c(r32, "next_schedule_time_override");
            int c30 = c5.j.c(r32, "next_schedule_time_override_generation");
            int c31 = c5.j.c(r32, "stop_reason");
            int c32 = c5.j.c(r32, "trace_tag");
            int c33 = c5.j.c(r32, "backoff_on_system_interruptions");
            int c34 = c5.j.c(r32, "required_network_type");
            int c35 = c5.j.c(r32, "required_network_request");
            int c36 = c5.j.c(r32, "requires_charging");
            int c37 = c5.j.c(r32, "requires_device_idle");
            int c38 = c5.j.c(r32, "requires_battery_not_low");
            int c39 = c5.j.c(r32, "requires_storage_not_low");
            int c40 = c5.j.c(r32, "trigger_content_update_delay");
            int c41 = c5.j.c(r32, "trigger_max_content_delay");
            int c42 = c5.j.c(r32, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (r32.i3()) {
                String F2 = r32.F2(c10);
                int i12 = c23;
                ArrayList arrayList2 = arrayList;
                o0.c g10 = v1.g((int) r32.getLong(c11));
                String F22 = r32.F2(c12);
                String F23 = r32.F2(c13);
                byte[] blob = r32.getBlob(c14);
                b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b a10 = companion.a(blob);
                androidx.work.b a11 = companion.a(r32.getBlob(c15));
                long j10 = r32.getLong(c16);
                long j11 = r32.getLong(c17);
                long j12 = r32.getLong(c18);
                int i13 = (int) r32.getLong(c19);
                int i14 = c11;
                int i15 = c12;
                x5.a d10 = v1.d((int) r32.getLong(c20));
                long j13 = r32.getLong(c21);
                long j14 = r32.getLong(c22);
                long j15 = r32.getLong(i12);
                int i16 = c24;
                long j16 = r32.getLong(i16);
                int i17 = c10;
                int i18 = c25;
                boolean z10 = ((int) r32.getLong(i18)) != 0;
                int i19 = c26;
                int i20 = c13;
                x5.f0 f10 = v1.f((int) r32.getLong(i19));
                int i21 = c27;
                int i22 = c14;
                int i23 = (int) r32.getLong(i21);
                int i24 = c28;
                int i25 = (int) r32.getLong(i24);
                int i26 = c29;
                long j17 = r32.getLong(i26);
                int i27 = c30;
                int i28 = (int) r32.getLong(i27);
                int i29 = c31;
                int i30 = (int) r32.getLong(i29);
                int i31 = c32;
                Boolean bool = null;
                String F24 = r32.isNull(i31) ? null : r32.F2(i31);
                int i32 = c33;
                if (r32.isNull(i32)) {
                    i10 = i28;
                    i11 = i29;
                    valueOf = null;
                } else {
                    i10 = i28;
                    i11 = i29;
                    valueOf = Integer.valueOf((int) r32.getLong(i32));
                }
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                int i33 = c34;
                Boolean bool2 = bool;
                x5.x e10 = v1.e((int) r32.getLong(i33));
                int i34 = c35;
                NetworkRequestCompat l10 = v1.l(r32.getBlob(i34));
                c34 = i33;
                c35 = i34;
                int i35 = c36;
                boolean z11 = ((int) r32.getLong(i35)) != 0;
                c36 = i35;
                int i36 = c37;
                boolean z12 = ((int) r32.getLong(i36)) != 0;
                int i37 = c38;
                boolean z13 = ((int) r32.getLong(i37)) != 0;
                c38 = i37;
                int i38 = c39;
                int i39 = c40;
                int i40 = c41;
                int i41 = c42;
                c42 = i41;
                arrayList2.add(new j0(F2, g10, F22, F23, a10, a11, j10, j11, j12, new x5.d(l10, e10, z11, z12, z13, ((int) r32.getLong(i38)) != 0, r32.getLong(i39), r32.getLong(i40), v1.b(r32.getBlob(i41))), i13, d10, j13, j14, j15, j16, z10, f10, i23, i25, j17, i10, i30, F24, bool2));
                c39 = i38;
                c13 = i20;
                c26 = i19;
                c28 = i24;
                c31 = i11;
                c33 = i32;
                c40 = i39;
                c41 = i40;
                c11 = i14;
                c23 = i12;
                c12 = i15;
                arrayList = arrayList2;
                c10 = i17;
                c24 = i16;
                c25 = i18;
                c29 = i26;
                c30 = i27;
                c32 = i31;
                c37 = i36;
                c14 = i22;
                c27 = i21;
            }
            ArrayList arrayList3 = arrayList;
            r32.close();
            return arrayList3;
        } catch (Throwable th2) {
            r32.close();
            throw th2;
        }
    }

    public static final List j0(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            r32.i0(1, str2);
            ArrayList arrayList = new ArrayList();
            while (r32.i3()) {
                arrayList.add(androidx.work.b.INSTANCE.a(r32.getBlob(0)));
            }
            return arrayList;
        } finally {
            r32.close();
        }
    }

    public static final List k0(String str, long j10, f5.b _connection) {
        int i10;
        Integer valueOf;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            r32.z(1, j10);
            int c10 = c5.j.c(r32, "id");
            int c11 = c5.j.c(r32, "state");
            int c12 = c5.j.c(r32, "worker_class_name");
            int c13 = c5.j.c(r32, "input_merger_class_name");
            int c14 = c5.j.c(r32, "input");
            int c15 = c5.j.c(r32, "output");
            int c16 = c5.j.c(r32, "initial_delay");
            int c17 = c5.j.c(r32, "interval_duration");
            int c18 = c5.j.c(r32, "flex_duration");
            int c19 = c5.j.c(r32, "run_attempt_count");
            int c20 = c5.j.c(r32, "backoff_policy");
            int c21 = c5.j.c(r32, "backoff_delay_duration");
            int c22 = c5.j.c(r32, "last_enqueue_time");
            int c23 = c5.j.c(r32, "minimum_retention_duration");
            int c24 = c5.j.c(r32, "schedule_requested_at");
            int c25 = c5.j.c(r32, "run_in_foreground");
            int c26 = c5.j.c(r32, "out_of_quota_policy");
            int c27 = c5.j.c(r32, "period_count");
            int c28 = c5.j.c(r32, "generation");
            int c29 = c5.j.c(r32, "next_schedule_time_override");
            int c30 = c5.j.c(r32, "next_schedule_time_override_generation");
            int c31 = c5.j.c(r32, "stop_reason");
            int c32 = c5.j.c(r32, "trace_tag");
            int c33 = c5.j.c(r32, "backoff_on_system_interruptions");
            int c34 = c5.j.c(r32, "required_network_type");
            int c35 = c5.j.c(r32, "required_network_request");
            int c36 = c5.j.c(r32, "requires_charging");
            int c37 = c5.j.c(r32, "requires_device_idle");
            int c38 = c5.j.c(r32, "requires_battery_not_low");
            int c39 = c5.j.c(r32, "requires_storage_not_low");
            int c40 = c5.j.c(r32, "trigger_content_update_delay");
            int c41 = c5.j.c(r32, "trigger_max_content_delay");
            int c42 = c5.j.c(r32, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (r32.i3()) {
                String F2 = r32.F2(c10);
                int i11 = c22;
                int i12 = c23;
                o0.c g10 = v1.g((int) r32.getLong(c11));
                String F22 = r32.F2(c12);
                String F23 = r32.F2(c13);
                byte[] blob = r32.getBlob(c14);
                b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b a10 = companion.a(blob);
                androidx.work.b a11 = companion.a(r32.getBlob(c15));
                long j11 = r32.getLong(c16);
                long j12 = r32.getLong(c17);
                long j13 = r32.getLong(c18);
                int i13 = (int) r32.getLong(c19);
                int i14 = c10;
                int i15 = c11;
                x5.a d10 = v1.d((int) r32.getLong(c20));
                long j14 = r32.getLong(c21);
                long j15 = r32.getLong(i11);
                long j16 = r32.getLong(i12);
                int i16 = c24;
                long j17 = r32.getLong(i16);
                c24 = i16;
                int i17 = c25;
                int i18 = c12;
                boolean z10 = ((int) r32.getLong(i17)) != 0;
                int i19 = c26;
                int i20 = c13;
                x5.f0 f10 = v1.f((int) r32.getLong(i19));
                int i21 = c27;
                int i22 = (int) r32.getLong(i21);
                int i23 = c28;
                int i24 = (int) r32.getLong(i23);
                int i25 = c29;
                long j18 = r32.getLong(i25);
                int i26 = c30;
                int i27 = (int) r32.getLong(i26);
                c30 = i26;
                int i28 = c31;
                int i29 = (int) r32.getLong(i28);
                int i30 = c32;
                Boolean bool = null;
                String F24 = r32.isNull(i30) ? null : r32.F2(i30);
                int i31 = c33;
                if (r32.isNull(i31)) {
                    i10 = i30;
                    c31 = i28;
                    valueOf = null;
                } else {
                    i10 = i30;
                    c31 = i28;
                    valueOf = Integer.valueOf((int) r32.getLong(i31));
                }
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                Boolean bool2 = bool;
                int i32 = c34;
                x5.x e10 = v1.e((int) r32.getLong(i32));
                int i33 = c35;
                NetworkRequestCompat l10 = v1.l(r32.getBlob(i33));
                int i34 = c36;
                boolean z11 = ((int) r32.getLong(i34)) != 0;
                int i35 = c37;
                boolean z12 = ((int) r32.getLong(i35)) != 0;
                int i36 = c38;
                boolean z13 = ((int) r32.getLong(i36)) != 0;
                c38 = i36;
                int i37 = c39;
                int i38 = c40;
                int i39 = c41;
                c40 = i38;
                int i40 = c42;
                arrayList.add(new j0(F2, g10, F22, F23, a10, a11, j11, j12, j13, new x5.d(l10, e10, z11, z12, z13, ((int) r32.getLong(i37)) != 0, r32.getLong(i38), r32.getLong(i39), v1.b(r32.getBlob(i40))), i13, d10, j14, j15, j16, j17, z10, f10, i22, i24, j18, i27, i29, F24, bool2));
                c13 = i20;
                c26 = i19;
                c27 = i21;
                c28 = i23;
                c29 = i25;
                c32 = i10;
                c33 = i31;
                c34 = i32;
                c35 = i33;
                c36 = i34;
                c37 = i35;
                c42 = i40;
                c41 = i39;
                c39 = i37;
                c10 = i14;
                c22 = i11;
                c23 = i12;
                c11 = i15;
                c12 = i18;
                c25 = i17;
            }
            r32.close();
            return arrayList;
        } catch (Throwable th2) {
            r32.close();
            throw th2;
        }
    }

    public static final List l0(String str, f5.b _connection) {
        int i10;
        int i11;
        Integer valueOf;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            int c10 = c5.j.c(r32, "id");
            int c11 = c5.j.c(r32, "state");
            int c12 = c5.j.c(r32, "worker_class_name");
            int c13 = c5.j.c(r32, "input_merger_class_name");
            int c14 = c5.j.c(r32, "input");
            int c15 = c5.j.c(r32, "output");
            int c16 = c5.j.c(r32, "initial_delay");
            int c17 = c5.j.c(r32, "interval_duration");
            int c18 = c5.j.c(r32, "flex_duration");
            int c19 = c5.j.c(r32, "run_attempt_count");
            int c20 = c5.j.c(r32, "backoff_policy");
            int c21 = c5.j.c(r32, "backoff_delay_duration");
            int c22 = c5.j.c(r32, "last_enqueue_time");
            int c23 = c5.j.c(r32, "minimum_retention_duration");
            int c24 = c5.j.c(r32, "schedule_requested_at");
            int c25 = c5.j.c(r32, "run_in_foreground");
            int c26 = c5.j.c(r32, "out_of_quota_policy");
            int c27 = c5.j.c(r32, "period_count");
            int c28 = c5.j.c(r32, "generation");
            int c29 = c5.j.c(r32, "next_schedule_time_override");
            int c30 = c5.j.c(r32, "next_schedule_time_override_generation");
            int c31 = c5.j.c(r32, "stop_reason");
            int c32 = c5.j.c(r32, "trace_tag");
            int c33 = c5.j.c(r32, "backoff_on_system_interruptions");
            int c34 = c5.j.c(r32, "required_network_type");
            int c35 = c5.j.c(r32, "required_network_request");
            int c36 = c5.j.c(r32, "requires_charging");
            int c37 = c5.j.c(r32, "requires_device_idle");
            int c38 = c5.j.c(r32, "requires_battery_not_low");
            int c39 = c5.j.c(r32, "requires_storage_not_low");
            int c40 = c5.j.c(r32, "trigger_content_update_delay");
            int c41 = c5.j.c(r32, "trigger_max_content_delay");
            int c42 = c5.j.c(r32, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (r32.i3()) {
                String F2 = r32.F2(c10);
                int i12 = c23;
                ArrayList arrayList2 = arrayList;
                o0.c g10 = v1.g((int) r32.getLong(c11));
                String F22 = r32.F2(c12);
                String F23 = r32.F2(c13);
                byte[] blob = r32.getBlob(c14);
                b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b a10 = companion.a(blob);
                androidx.work.b a11 = companion.a(r32.getBlob(c15));
                long j10 = r32.getLong(c16);
                long j11 = r32.getLong(c17);
                long j12 = r32.getLong(c18);
                int i13 = (int) r32.getLong(c19);
                int i14 = c11;
                int i15 = c12;
                x5.a d10 = v1.d((int) r32.getLong(c20));
                long j13 = r32.getLong(c21);
                long j14 = r32.getLong(c22);
                long j15 = r32.getLong(i12);
                int i16 = c24;
                long j16 = r32.getLong(i16);
                int i17 = c10;
                int i18 = c25;
                boolean z10 = ((int) r32.getLong(i18)) != 0;
                int i19 = c26;
                int i20 = c13;
                x5.f0 f10 = v1.f((int) r32.getLong(i19));
                int i21 = c27;
                int i22 = c14;
                int i23 = (int) r32.getLong(i21);
                int i24 = c28;
                int i25 = (int) r32.getLong(i24);
                int i26 = c29;
                long j17 = r32.getLong(i26);
                int i27 = c30;
                int i28 = (int) r32.getLong(i27);
                int i29 = c31;
                int i30 = (int) r32.getLong(i29);
                int i31 = c32;
                Boolean bool = null;
                String F24 = r32.isNull(i31) ? null : r32.F2(i31);
                int i32 = c33;
                if (r32.isNull(i32)) {
                    i10 = i28;
                    i11 = i29;
                    valueOf = null;
                } else {
                    i10 = i28;
                    i11 = i29;
                    valueOf = Integer.valueOf((int) r32.getLong(i32));
                }
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                int i33 = c34;
                Boolean bool2 = bool;
                x5.x e10 = v1.e((int) r32.getLong(i33));
                int i34 = c35;
                NetworkRequestCompat l10 = v1.l(r32.getBlob(i34));
                c34 = i33;
                c35 = i34;
                int i35 = c36;
                boolean z11 = ((int) r32.getLong(i35)) != 0;
                c36 = i35;
                int i36 = c37;
                boolean z12 = ((int) r32.getLong(i36)) != 0;
                int i37 = c38;
                boolean z13 = ((int) r32.getLong(i37)) != 0;
                c38 = i37;
                int i38 = c39;
                int i39 = c40;
                int i40 = c41;
                int i41 = c42;
                c42 = i41;
                arrayList2.add(new j0(F2, g10, F22, F23, a10, a11, j10, j11, j12, new x5.d(l10, e10, z11, z12, z13, ((int) r32.getLong(i38)) != 0, r32.getLong(i39), r32.getLong(i40), v1.b(r32.getBlob(i41))), i13, d10, j13, j14, j15, j16, z10, f10, i23, i25, j17, i10, i30, F24, bool2));
                c39 = i38;
                c13 = i20;
                c26 = i19;
                c28 = i24;
                c31 = i11;
                c33 = i32;
                c40 = i39;
                c41 = i40;
                c11 = i14;
                c23 = i12;
                c12 = i15;
                arrayList = arrayList2;
                c10 = i17;
                c24 = i16;
                c25 = i18;
                c29 = i26;
                c30 = i27;
                c32 = i31;
                c37 = i36;
                c14 = i22;
                c27 = i21;
            }
            ArrayList arrayList3 = arrayList;
            r32.close();
            return arrayList3;
        } catch (Throwable th2) {
            r32.close();
            throw th2;
        }
    }

    public static final List m0(String str, f5.b _connection) {
        int i10;
        int i11;
        Integer valueOf;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            int c10 = c5.j.c(r32, "id");
            int c11 = c5.j.c(r32, "state");
            int c12 = c5.j.c(r32, "worker_class_name");
            int c13 = c5.j.c(r32, "input_merger_class_name");
            int c14 = c5.j.c(r32, "input");
            int c15 = c5.j.c(r32, "output");
            int c16 = c5.j.c(r32, "initial_delay");
            int c17 = c5.j.c(r32, "interval_duration");
            int c18 = c5.j.c(r32, "flex_duration");
            int c19 = c5.j.c(r32, "run_attempt_count");
            int c20 = c5.j.c(r32, "backoff_policy");
            int c21 = c5.j.c(r32, "backoff_delay_duration");
            int c22 = c5.j.c(r32, "last_enqueue_time");
            int c23 = c5.j.c(r32, "minimum_retention_duration");
            int c24 = c5.j.c(r32, "schedule_requested_at");
            int c25 = c5.j.c(r32, "run_in_foreground");
            int c26 = c5.j.c(r32, "out_of_quota_policy");
            int c27 = c5.j.c(r32, "period_count");
            int c28 = c5.j.c(r32, "generation");
            int c29 = c5.j.c(r32, "next_schedule_time_override");
            int c30 = c5.j.c(r32, "next_schedule_time_override_generation");
            int c31 = c5.j.c(r32, "stop_reason");
            int c32 = c5.j.c(r32, "trace_tag");
            int c33 = c5.j.c(r32, "backoff_on_system_interruptions");
            int c34 = c5.j.c(r32, "required_network_type");
            int c35 = c5.j.c(r32, "required_network_request");
            int c36 = c5.j.c(r32, "requires_charging");
            int c37 = c5.j.c(r32, "requires_device_idle");
            int c38 = c5.j.c(r32, "requires_battery_not_low");
            int c39 = c5.j.c(r32, "requires_storage_not_low");
            int c40 = c5.j.c(r32, "trigger_content_update_delay");
            int c41 = c5.j.c(r32, "trigger_max_content_delay");
            int c42 = c5.j.c(r32, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (r32.i3()) {
                String F2 = r32.F2(c10);
                int i12 = c23;
                ArrayList arrayList2 = arrayList;
                o0.c g10 = v1.g((int) r32.getLong(c11));
                String F22 = r32.F2(c12);
                String F23 = r32.F2(c13);
                byte[] blob = r32.getBlob(c14);
                b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b a10 = companion.a(blob);
                androidx.work.b a11 = companion.a(r32.getBlob(c15));
                long j10 = r32.getLong(c16);
                long j11 = r32.getLong(c17);
                long j12 = r32.getLong(c18);
                int i13 = (int) r32.getLong(c19);
                int i14 = c11;
                int i15 = c12;
                x5.a d10 = v1.d((int) r32.getLong(c20));
                long j13 = r32.getLong(c21);
                long j14 = r32.getLong(c22);
                long j15 = r32.getLong(i12);
                int i16 = c24;
                long j16 = r32.getLong(i16);
                int i17 = c10;
                int i18 = c25;
                boolean z10 = ((int) r32.getLong(i18)) != 0;
                int i19 = c26;
                int i20 = c13;
                x5.f0 f10 = v1.f((int) r32.getLong(i19));
                int i21 = c27;
                int i22 = c14;
                int i23 = (int) r32.getLong(i21);
                int i24 = c28;
                int i25 = (int) r32.getLong(i24);
                int i26 = c29;
                long j17 = r32.getLong(i26);
                int i27 = c30;
                int i28 = (int) r32.getLong(i27);
                int i29 = c31;
                int i30 = (int) r32.getLong(i29);
                int i31 = c32;
                Boolean bool = null;
                String F24 = r32.isNull(i31) ? null : r32.F2(i31);
                int i32 = c33;
                if (r32.isNull(i32)) {
                    i10 = i28;
                    i11 = i29;
                    valueOf = null;
                } else {
                    i10 = i28;
                    i11 = i29;
                    valueOf = Integer.valueOf((int) r32.getLong(i32));
                }
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                int i33 = c34;
                Boolean bool2 = bool;
                x5.x e10 = v1.e((int) r32.getLong(i33));
                int i34 = c35;
                NetworkRequestCompat l10 = v1.l(r32.getBlob(i34));
                c34 = i33;
                c35 = i34;
                int i35 = c36;
                boolean z11 = ((int) r32.getLong(i35)) != 0;
                c36 = i35;
                int i36 = c37;
                boolean z12 = ((int) r32.getLong(i36)) != 0;
                int i37 = c38;
                boolean z13 = ((int) r32.getLong(i37)) != 0;
                c38 = i37;
                int i38 = c39;
                int i39 = c40;
                int i40 = c41;
                int i41 = c42;
                c42 = i41;
                arrayList2.add(new j0(F2, g10, F22, F23, a10, a11, j10, j11, j12, new x5.d(l10, e10, z11, z12, z13, ((int) r32.getLong(i38)) != 0, r32.getLong(i39), r32.getLong(i40), v1.b(r32.getBlob(i41))), i13, d10, j13, j14, j15, j16, z10, f10, i23, i25, j17, i10, i30, F24, bool2));
                c39 = i38;
                c13 = i20;
                c26 = i19;
                c28 = i24;
                c31 = i11;
                c33 = i32;
                c40 = i39;
                c41 = i40;
                c11 = i14;
                c23 = i12;
                c12 = i15;
                arrayList = arrayList2;
                c10 = i17;
                c24 = i16;
                c25 = i18;
                c29 = i26;
                c30 = i27;
                c32 = i31;
                c37 = i36;
                c14 = i22;
                c27 = i21;
            }
            ArrayList arrayList3 = arrayList;
            r32.close();
            return arrayList3;
        } catch (Throwable th2) {
            r32.close();
            throw th2;
        }
    }

    public static final o0.c n0(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            r32.i0(1, str2);
            o0.c cVar = null;
            if (r32.i3()) {
                Integer valueOf = r32.isNull(0) ? null : Integer.valueOf((int) r32.getLong(0));
                if (valueOf != null) {
                    cVar = v1.g(valueOf.intValue());
                }
            }
            return cVar;
        } finally {
            r32.close();
        }
    }

    public static final List o0(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            r32.i0(1, str2);
            ArrayList arrayList = new ArrayList();
            while (r32.i3()) {
                arrayList.add(r32.F2(0));
            }
            return arrayList;
        } finally {
            r32.close();
        }
    }

    public static final List p0(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            r32.i0(1, str2);
            ArrayList arrayList = new ArrayList();
            while (r32.i3()) {
                arrayList.add(r32.F2(0));
            }
            return arrayList;
        } finally {
            r32.close();
        }
    }

    public static final j0 q0(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            r32.i0(1, str2);
            int c10 = c5.j.c(r32, "id");
            int c11 = c5.j.c(r32, "state");
            int c12 = c5.j.c(r32, "worker_class_name");
            int c13 = c5.j.c(r32, "input_merger_class_name");
            int c14 = c5.j.c(r32, "input");
            int c15 = c5.j.c(r32, "output");
            int c16 = c5.j.c(r32, "initial_delay");
            int c17 = c5.j.c(r32, "interval_duration");
            int c18 = c5.j.c(r32, "flex_duration");
            int c19 = c5.j.c(r32, "run_attempt_count");
            int c20 = c5.j.c(r32, "backoff_policy");
            int c21 = c5.j.c(r32, "backoff_delay_duration");
            int c22 = c5.j.c(r32, "last_enqueue_time");
            int c23 = c5.j.c(r32, "minimum_retention_duration");
            int c24 = c5.j.c(r32, "schedule_requested_at");
            int c25 = c5.j.c(r32, "run_in_foreground");
            int c26 = c5.j.c(r32, "out_of_quota_policy");
            int c27 = c5.j.c(r32, "period_count");
            int c28 = c5.j.c(r32, "generation");
            int c29 = c5.j.c(r32, "next_schedule_time_override");
            int c30 = c5.j.c(r32, "next_schedule_time_override_generation");
            int c31 = c5.j.c(r32, "stop_reason");
            int c32 = c5.j.c(r32, "trace_tag");
            int c33 = c5.j.c(r32, "backoff_on_system_interruptions");
            int c34 = c5.j.c(r32, "required_network_type");
            int c35 = c5.j.c(r32, "required_network_request");
            int c36 = c5.j.c(r32, "requires_charging");
            int c37 = c5.j.c(r32, "requires_device_idle");
            int c38 = c5.j.c(r32, "requires_battery_not_low");
            int c39 = c5.j.c(r32, "requires_storage_not_low");
            int c40 = c5.j.c(r32, "trigger_content_update_delay");
            int c41 = c5.j.c(r32, "trigger_max_content_delay");
            int c42 = c5.j.c(r32, "content_uri_triggers");
            j0 j0Var = null;
            Boolean bool = null;
            if (r32.i3()) {
                String F2 = r32.F2(c10);
                o0.c g10 = v1.g((int) r32.getLong(c11));
                String F22 = r32.F2(c12);
                String F23 = r32.F2(c13);
                byte[] blob = r32.getBlob(c14);
                b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b a10 = companion.a(blob);
                androidx.work.b a11 = companion.a(r32.getBlob(c15));
                long j10 = r32.getLong(c16);
                long j11 = r32.getLong(c17);
                long j12 = r32.getLong(c18);
                int i10 = (int) r32.getLong(c19);
                x5.a d10 = v1.d((int) r32.getLong(c20));
                long j13 = r32.getLong(c21);
                long j14 = r32.getLong(c22);
                long j15 = r32.getLong(c23);
                long j16 = r32.getLong(c24);
                boolean z10 = ((int) r32.getLong(c25)) != 0;
                x5.f0 f10 = v1.f((int) r32.getLong(c26));
                int i11 = (int) r32.getLong(c27);
                int i12 = (int) r32.getLong(c28);
                long j17 = r32.getLong(c29);
                int i13 = (int) r32.getLong(c30);
                int i14 = (int) r32.getLong(c31);
                String F24 = r32.isNull(c32) ? null : r32.F2(c32);
                Integer valueOf = r32.isNull(c33) ? null : Integer.valueOf((int) r32.getLong(c33));
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                j0Var = new j0(F2, g10, F22, F23, a10, a11, j10, j11, j12, new x5.d(v1.l(r32.getBlob(c35)), v1.e((int) r32.getLong(c34)), ((int) r32.getLong(c36)) != 0, ((int) r32.getLong(c37)) != 0, ((int) r32.getLong(c38)) != 0, ((int) r32.getLong(c39)) != 0, r32.getLong(c40), r32.getLong(c41), v1.b(r32.getBlob(c42))), i10, d10, j13, j14, j15, j16, z10, f10, i11, i12, j17, i13, i14, F24, bool);
            }
            r32.close();
            return j0Var;
        } catch (Throwable th2) {
            r32.close();
            throw th2;
        }
    }

    public static final List r0(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            r32.i0(1, str2);
            ArrayList arrayList = new ArrayList();
            while (r32.i3()) {
                arrayList.add(new j0.IdAndState(r32.F2(0), v1.g((int) r32.getLong(1))));
            }
            return arrayList;
        } finally {
            r32.close();
        }
    }

    public static final boolean s0(String str, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            boolean z10 = false;
            if (r32.i3()) {
                if (((int) r32.getLong(0)) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            r32.close();
        }
    }

    public static final Unit t0(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            r32.i0(1, str2);
            r32.i3();
            r32.close();
            return Unit.f22894a;
        } catch (Throwable th2) {
            r32.close();
            throw th2;
        }
    }

    public static final int u0(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            r32.i0(1, str2);
            r32.i3();
            return c5.i.b(_connection);
        } finally {
            r32.close();
        }
    }

    public static final Unit v0(n1 n1Var, j0 j0Var, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        n1Var.__insertAdapterOfWorkSpec.d(_connection, j0Var);
        return Unit.f22894a;
    }

    public static final int w0(String str, long j10, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            r32.z(1, j10);
            r32.i0(2, str2);
            r32.i3();
            return c5.i.b(_connection);
        } finally {
            r32.close();
        }
    }

    public static final int x0(String str, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            r32.i3();
            return c5.i.b(_connection);
        } finally {
            r32.close();
        }
    }

    public static final Unit y0(String str, String str2, int i10, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            r32.i0(1, str2);
            r32.z(2, i10);
            r32.i3();
            r32.close();
            return Unit.f22894a;
        } catch (Throwable th2) {
            r32.close();
            throw th2;
        }
    }

    public static final int z0(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            r32.i0(1, str2);
            r32.i3();
            return c5.i.b(_connection);
        } finally {
            r32.close();
        }
    }

    @Override // f6.k0
    public int A() {
        final String str = "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)";
        return ((Number) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.h1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int e02;
                e02 = n1.e0(str, (f5.b) obj);
                return Integer.valueOf(e02);
            }
        })).intValue();
    }

    @Override // f6.k0
    public void B(@NotNull final String id2, final int overrideGeneration) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        c5.a.c(this.__db, false, true, new Function1() { // from class: f6.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit y02;
                y02 = n1.y0(str, id2, overrideGeneration, (f5.b) obj);
                return y02;
            }
        });
    }

    @Override // f6.k0
    public void a(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "DELETE FROM workspec WHERE id=?";
        c5.a.c(this.__db, false, true, new Function1() { // from class: f6.i1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit f02;
                f02 = n1.f0(str, id2, (f5.b) obj);
                return f02;
            }
        });
    }

    @Override // f6.k0
    public void b(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        c5.a.c(this.__db, false, true, new Function1() { // from class: f6.a1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit t02;
                t02 = n1.t0(str, id2, (f5.b) obj);
                return t02;
            }
        });
    }

    @Override // f6.k0
    public int c(@NotNull final o0.c state, @NotNull final String id2) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET state=? WHERE id=?";
        return ((Number) c5.a.c(this.__db, false, true, new Function1() { // from class: f6.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int D0;
                D0 = n1.D0(str, state, id2, (f5.b) obj);
                return Integer.valueOf(D0);
            }
        })).intValue();
    }

    @Override // f6.k0
    @NotNull
    public List<j0> d(final long startingAt) {
        final String str = "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC";
        return (List) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List k02;
                k02 = n1.k0(str, startingAt, (f5.b) obj);
                return k02;
            }
        });
    }

    @Override // f6.k0
    public void e(@NotNull final String id2, final int stopReason) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET stop_reason=? WHERE id=?";
        c5.a.c(this.__db, false, true, new Function1() { // from class: f6.g1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit E0;
                E0 = n1.E0(str, stopReason, id2, (f5.b) obj);
                return E0;
            }
        });
    }

    @Override // f6.k0
    @NotNull
    public List<j0> f() {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1";
        return (List) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List m02;
                m02 = n1.m0(str, (f5.b) obj);
                return m02;
            }
        });
    }

    @Override // f6.k0
    public void g(@NotNull final j0 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        c5.a.c(this.__db, false, true, new Function1() { // from class: f6.c1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit F0;
                F0 = n1.F0(n1.this, workSpec, (f5.b) obj);
                return F0;
            }
        });
    }

    @Override // f6.k0
    public void h(@NotNull final j0 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        c5.a.c(this.__db, false, true, new Function1() { // from class: f6.w0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit v02;
                v02 = n1.v0(n1.this, workSpec, (f5.b) obj);
                return v02;
            }
        });
    }

    @Override // f6.k0
    @NotNull
    public List<String> i(@NotNull final String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        final String str = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        return (List) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List o02;
                o02 = n1.o0(str, name, (f5.b) obj);
                return o02;
            }
        });
    }

    @Override // f6.k0
    @Nullable
    public o0.c j(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "SELECT state FROM workspec WHERE id=?";
        return (o0.c) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.s0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                o0.c n02;
                n02 = n1.n0(str, id2, (f5.b) obj);
                return n02;
            }
        });
    }

    @Override // f6.k0
    @Nullable
    public j0 k(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "SELECT * FROM workspec WHERE id=?";
        return (j0) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                j0 q02;
                q02 = n1.q0(str, id2, (f5.b) obj);
                return q02;
            }
        });
    }

    @Override // f6.k0
    public int l(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        return ((Number) c5.a.c(this.__db, false, true, new Function1() { // from class: f6.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int A0;
                A0 = n1.A0(str, id2, (f5.b) obj);
                return Integer.valueOf(A0);
            }
        })).intValue();
    }

    @Override // f6.k0
    @NotNull
    public List<String> m(@NotNull final String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        final String str = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)";
        return (List) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.b1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List p02;
                p02 = n1.p0(str, tag, (f5.b) obj);
                return p02;
            }
        });
    }

    @Override // f6.k0
    @NotNull
    public List<androidx.work.b> n(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)";
        return (List) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.d1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List j02;
                j02 = n1.j0(str, id2, (f5.b) obj);
                return j02;
            }
        });
    }

    @Override // f6.k0
    @NotNull
    public List<j0> o(final int maxLimit) {
        final String str = "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?";
        return (List) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.k1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List g02;
                g02 = n1.g0(str, maxLimit, (f5.b) obj);
                return g02;
            }
        });
    }

    @Override // f6.k0
    public int p() {
        final String str = "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        return ((Number) c5.a.c(this.__db, false, true, new Function1() { // from class: f6.l1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int x02;
                x02 = n1.x0(str, (f5.b) obj);
                return Integer.valueOf(x02);
            }
        })).intValue();
    }

    @Override // f6.k0
    public int q(@NotNull final String id2, final long startTime) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        return ((Number) c5.a.c(this.__db, false, true, new Function1() { // from class: f6.p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int w02;
                w02 = n1.w0(str, startTime, id2, (f5.b) obj);
                return Integer.valueOf(w02);
            }
        })).intValue();
    }

    @Override // f6.k0
    @NotNull
    public List<j0.IdAndState> r(@NotNull final String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        final String str = "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        return (List) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.m1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List r02;
                r02 = n1.r0(str, name, (f5.b) obj);
                return r02;
            }
        });
    }

    @Override // f6.k0
    @NotNull
    public mu.h<Boolean> s() {
        final String str = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1";
        return z4.k.a(this.__db, false, new String[]{"workspec"}, new Function1() { // from class: f6.j1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean s02;
                s02 = n1.s0(str, (f5.b) obj);
                return Boolean.valueOf(s02);
            }
        });
    }

    @Override // f6.k0
    @NotNull
    public List<j0> t(final int schedulerLimit) {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))";
        return (List) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List h02;
                h02 = n1.h0(str, schedulerLimit, (f5.b) obj);
                return h02;
            }
        });
    }

    @Override // f6.k0
    public void u(@NotNull final String id2, @NotNull final androidx.work.b output) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(output, "output");
        final String str = "UPDATE workspec SET output=? WHERE id=?";
        c5.a.c(this.__db, false, true, new Function1() { // from class: f6.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit C0;
                C0 = n1.C0(str, output, id2, (f5.b) obj);
                return C0;
            }
        });
    }

    @Override // f6.k0
    public void v(@NotNull final String id2, final long enqueueTime) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        c5.a.c(this.__db, false, true, new Function1() { // from class: f6.x0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit B0;
                B0 = n1.B0(str, enqueueTime, id2, (f5.b) obj);
                return B0;
            }
        });
    }

    @Override // f6.k0
    @NotNull
    public List<j0> w() {
        final String str = "SELECT * FROM workspec WHERE state=1";
        return (List) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List l02;
                l02 = n1.l0(str, (f5.b) obj);
                return l02;
            }
        });
    }

    @Override // f6.k0
    @NotNull
    public List<j0> x() {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time";
        return (List) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.f1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List i02;
                i02 = n1.i0(str, (f5.b) obj);
                return i02;
            }
        });
    }

    @Override // f6.k0
    public int y(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        return ((Number) c5.a.c(this.__db, false, true, new Function1() { // from class: f6.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int z02;
                z02 = n1.z0(str, id2, (f5.b) obj);
                return Integer.valueOf(z02);
            }
        })).intValue();
    }

    @Override // f6.k0
    public int z(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        return ((Number) c5.a.c(this.__db, false, true, new Function1() { // from class: f6.e1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int u02;
                u02 = n1.u0(str, id2, (f5.b) obj);
                return Integer.valueOf(u02);
            }
        })).intValue();
    }
}

package kh;

import androidx.core.view.MotionEventCompat;
import gt.o;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import lh.NotificationId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00042\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lkh/i;", "", "", "notificationId", "", j6.b.f21518e, "(Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "", "Llh/b;", "notificationIds", "", "c", "([Llh/b;Lmt/b;)Ljava/lang/Object;", ve.a.f33391e, "", "maxRowsCount", "e", "(ILmt/b;)Ljava/lang/Object;", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f22656a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkh/i$a;", "", "<init>", "()V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: kh.i$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f22656a = new Companion();
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.db.dao.NotificationIdDao$safeInsertNotificationIds$2", f = "NotificationIdDao.kt", l = {MotionEventCompat.AXIS_BRAKE}, m = "invokeSuspend", v = 1)
    public static final class b extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f22657t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ NotificationId[] f22659v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(NotificationId[] notificationIdArr, mt.b<? super b> bVar) {
            super(1, bVar);
            this.f22659v = notificationIdArr;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return i.this.new b(this.f22659v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f22657t;
            if (i10 == 0) {
                o.b(obj);
                i iVar = i.this;
                NotificationId[] notificationIdArr = this.f22659v;
                NotificationId[] notificationIdArr2 = (NotificationId[]) Arrays.copyOf(notificationIdArr, notificationIdArr.length);
                this.f22657t = 1;
                if (iVar.c(notificationIdArr2, this) == e10) {
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

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((b) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    static /* synthetic */ Object d(i iVar, NotificationId[] notificationIdArr, mt.b<? super Boolean> bVar) {
        return h.b("NotificationIdDao", iVar.new b(notificationIdArr, null), bVar);
    }

    @Nullable
    default Object a(@NotNull NotificationId[] notificationIdArr, @NotNull mt.b<? super Boolean> bVar) {
        return d(this, notificationIdArr, bVar);
    }

    @Nullable
    Object b(@NotNull String str, @NotNull mt.b<? super Boolean> bVar);

    @Nullable
    Object c(@NotNull NotificationId[] notificationIdArr, @NotNull mt.b<? super Unit> bVar);

    @Nullable
    Object e(int i10, @NotNull mt.b<? super Integer> bVar);
}

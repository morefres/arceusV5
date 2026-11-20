package ym;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wm.Snapshot;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/os/Parcelable;", "Lwm/i;", ve.a.f33391e, "(Landroid/os/Parcelable;)Lwm/i;", "wf1-core-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwu/f;", "bufferedSink", "", ve.a.f33391e, "(Lwu/f;)V"}, k = 3, mv = {1, 6, 0})
    public static final class a extends kotlin.jvm.internal.m implements Function1<wu.f, Unit> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Parcelable f36798i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Parcelable parcelable) {
            super(1);
            this.f36798i = parcelable;
        }

        public final void a(@NotNull wu.f bufferedSink) {
            Intrinsics.checkNotNullParameter(bufferedSink, "bufferedSink");
            Parcel obtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
            obtain.writeParcelable(this.f36798i, 0);
            byte[] byteArray = obtain.marshall();
            Intrinsics.checkNotNullExpressionValue(byteArray, "byteArray");
            bufferedSink.write(byteArray);
            obtain.recycle();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(wu.f fVar) {
            a(fVar);
            return Unit.f22894a;
        }
    }

    @NotNull
    public static final Snapshot a(@NotNull Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(parcelable, "<this>");
        return Snapshot.INSTANCE.c(new a(parcelable));
    }
}

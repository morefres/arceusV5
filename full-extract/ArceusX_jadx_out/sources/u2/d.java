package u2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Lkotlin/Pair;", "", "", "pairs", "Landroid/os/Bundle;", ve.a.f33391e, "([Lkotlin/Pair;)Landroid/os/Bundle;", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {
    @NotNull
    public static final Bundle a(@NotNull Pair<String, ? extends Object>... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair<String, ? extends Object> pair : pairArr) {
            String a10 = pair.a();
            Object b = pair.b();
            if (b == null) {
                bundle.putString(a10, null);
            } else if (b instanceof Boolean) {
                bundle.putBoolean(a10, ((Boolean) b).booleanValue());
            } else if (b instanceof Byte) {
                bundle.putByte(a10, ((Number) b).byteValue());
            } else if (b instanceof Character) {
                bundle.putChar(a10, ((Character) b).charValue());
            } else if (b instanceof Double) {
                bundle.putDouble(a10, ((Number) b).doubleValue());
            } else if (b instanceof Float) {
                bundle.putFloat(a10, ((Number) b).floatValue());
            } else if (b instanceof Integer) {
                bundle.putInt(a10, ((Number) b).intValue());
            } else if (b instanceof Long) {
                bundle.putLong(a10, ((Number) b).longValue());
            } else if (b instanceof Short) {
                bundle.putShort(a10, ((Number) b).shortValue());
            } else if (b instanceof Bundle) {
                bundle.putBundle(a10, (Bundle) b);
            } else if (b instanceof CharSequence) {
                bundle.putCharSequence(a10, (CharSequence) b);
            } else if (b instanceof Parcelable) {
                bundle.putParcelable(a10, (Parcelable) b);
            } else if (b instanceof boolean[]) {
                bundle.putBooleanArray(a10, (boolean[]) b);
            } else if (b instanceof byte[]) {
                bundle.putByteArray(a10, (byte[]) b);
            } else if (b instanceof char[]) {
                bundle.putCharArray(a10, (char[]) b);
            } else if (b instanceof double[]) {
                bundle.putDoubleArray(a10, (double[]) b);
            } else if (b instanceof float[]) {
                bundle.putFloatArray(a10, (float[]) b);
            } else if (b instanceof int[]) {
                bundle.putIntArray(a10, (int[]) b);
            } else if (b instanceof long[]) {
                bundle.putLongArray(a10, (long[]) b);
            } else if (b instanceof short[]) {
                bundle.putShortArray(a10, (short[]) b);
            } else if (b instanceof Object[]) {
                Class<?> componentType = b.getClass().getComponentType();
                Intrinsics.checkNotNull(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Intrinsics.d(b, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(a10, (Parcelable[]) b);
                } else if (String.class.isAssignableFrom(componentType)) {
                    Intrinsics.d(b, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(a10, (String[]) b);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    Intrinsics.d(b, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(a10, (CharSequence[]) b);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + a10 + '\"');
                    }
                    bundle.putSerializable(a10, (Serializable) b);
                }
            } else if (b instanceof Serializable) {
                bundle.putSerializable(a10, (Serializable) b);
            } else if (b instanceof IBinder) {
                bundle.putBinder(a10, (IBinder) b);
            } else if (b instanceof Size) {
                b.a(bundle, a10, (Size) b);
            } else {
                if (!(b instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + b.getClass().getCanonicalName() + " for key \"" + a10 + '\"');
                }
                b.b(bundle, a10, (SizeF) b);
            }
        }
        return bundle;
    }
}

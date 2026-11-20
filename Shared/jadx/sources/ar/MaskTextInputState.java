package ar;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\f¨\u0006\u001b"}, d2 = {"Lar/r3;", "", "", "prefill", "mask", "", "secure", "label", "placeholder", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/lang/String;", rl.d.f30696a, j6.b.f21518e, "c", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: ar.r3, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class MaskTextInputState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String prefill;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String mask;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Boolean secure;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String label;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String placeholder;

    public MaskTextInputState(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable String str4) {
        this.prefill = str;
        this.mask = str2;
        this.secure = bool;
        this.label = str3;
        this.placeholder = str4;
    }

    @Nullable
    /* renamed from: a, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    /* renamed from: b, reason: from getter */
    public final String getMask() {
        return this.mask;
    }

    @Nullable
    /* renamed from: c, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @Nullable
    /* renamed from: d, reason: from getter */
    public final String getPrefill() {
        return this.prefill;
    }

    @Nullable
    /* renamed from: e, reason: from getter */
    public final Boolean getSecure() {
        return this.secure;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MaskTextInputState)) {
            return false;
        }
        MaskTextInputState maskTextInputState = (MaskTextInputState) other;
        return Intrinsics.c(this.prefill, maskTextInputState.prefill) && Intrinsics.c(this.mask, maskTextInputState.mask) && Intrinsics.c(this.secure, maskTextInputState.secure) && Intrinsics.c(this.label, maskTextInputState.label) && Intrinsics.c(this.placeholder, maskTextInputState.placeholder);
    }

    public int hashCode() {
        String str = this.prefill;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mask;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.secure;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.label;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.placeholder;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MaskTextInputState(prefill=" + this.prefill + ", mask=" + this.mask + ", secure=" + this.secure + ", label=" + this.label + ", placeholder=" + this.placeholder + ")";
    }
}

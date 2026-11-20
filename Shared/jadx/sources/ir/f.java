package ir;

import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\f\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000e\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0019"}, d2 = {"Lir/f;", "", "", "fontFamilyName", "url", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontStyle;", "fontStyle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontStyle;)V", ve.a.f33391e, "Ljava/lang/String;", "()Ljava/lang/String;", j6.b.f21518e, "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", rl.d.f30696a, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontStyle;", "getFontStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontStyle;", "", "()Z", "isItalic", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String fontFamilyName;

    /* renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String url;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final StyleElements.FontWeight fontWeight;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final StyleElements.FontStyle fontStyle;

    public f(@Nullable String str, @Nullable String str2, @Nullable StyleElements.FontWeight fontWeight, @Nullable StyleElements.FontStyle fontStyle) {
        this.fontFamilyName = str;
        this.url = str2;
        this.fontWeight = fontWeight;
        this.fontStyle = fontStyle;
    }

    @Nullable
    /* renamed from: a, reason: from getter */
    public final String getFontFamilyName() {
        return this.fontFamilyName;
    }

    @Nullable
    /* renamed from: b, reason: from getter */
    public final StyleElements.FontWeight getFontWeight() {
        return this.fontWeight;
    }

    @Nullable
    /* renamed from: c, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final boolean d() {
        return this.fontStyle == StyleElements.FontStyle.ITALIC;
    }
}

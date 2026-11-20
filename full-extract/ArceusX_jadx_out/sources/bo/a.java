package bo;

import android.content.Context;
import com.withpersona.sdk2.inquiry.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import j6.b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rl.d;
import tt.c;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u00162\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\r*\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u0004\u0018\u00010\r*\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!¨\u0006#"}, d2 = {"Lbo/a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "error", "", "g", "(Ljava/lang/Throwable;)V", ve.a.f33391e, "()V", "", "e", "()Ljava/lang/String;", "", "f", "()Z", "Ljava/io/File;", d.f30696a, "()Ljava/io/File;", b.f21518e, "(Ljava/lang/Throwable;)Ljava/lang/String;", "c", "file", "h", "(Ljava/io/File;)V", "i", "(Ljava/io/File;)Ljava/lang/String;", Text.type, "j", "(Ljava/io/File;Ljava/lang/String;)V", "Ljava/io/File;", "errDir", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f4320c = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final File errDir;

    public a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.errDir = new File(new File(context.getFilesDir(), ".com.withpersona.sdk2.inquiry"), "errors");
    }

    public final void a() {
        d().delete();
    }

    public final String b(Throwable th2) {
        while (th2 != null) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
                if (x.T(className, BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, null)) {
                    return stackTraceElement.getClassName() + " in " + stackTraceElement.getMethodName() + " at line " + stackTraceElement.getLineNumber();
                }
            }
            th2 = th2.getCause();
        }
        return null;
    }

    public final String c(Throwable th2) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        StackTraceElement stackTraceElement = (StackTraceElement) m.L(stackTrace);
        if (stackTraceElement == null) {
            return null;
        }
        return stackTraceElement.getClassName() + " in " + stackTraceElement.getMethodName() + " at line " + stackTraceElement.getLineNumber();
    }

    public final File d() {
        return new File(this.errDir, "last_error.txt");
    }

    @Nullable
    public final String e() {
        return i(d());
    }

    public final boolean f() {
        return d().exists();
    }

    public final void g(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        h(this.errDir);
        File d10 = d();
        if (d10.isDirectory()) {
            d10.delete();
        }
        String canonicalName = error.getClass().getCanonicalName();
        String b = b(error);
        if (b == null) {
            b = c(error);
        }
        j(d10, canonicalName + " in " + b);
    }

    public final void h(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            } else {
                file.delete();
            }
        }
        file.mkdirs();
    }

    public final String i(File file) {
        if (!file.exists() || !file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                    Charset UTF_8 = f4320c;
                    Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                    String str = new String(byteArray, UTF_8);
                    c.a(fileInputStream, null);
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } finally {
            }
        }
    }

    public final void j(File file, String text) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f4320c);
        try {
            outputStreamWriter.write(text);
            Unit unit = Unit.f22894a;
            c.a(outputStreamWriter, null);
        } finally {
        }
    }
}

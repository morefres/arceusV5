package zn;

import java.io.File;
import java.io.FileInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mu.c0;
import mu.j;
import mu.p0;
import mu.r0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wu.f;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0014B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lzn/d;", "Lokhttp3/RequestBody;", "Ljava/io/File;", "file", "Lokhttp3/MediaType;", "mediaType", "<init>", "(Ljava/io/File;Lokhttp3/MediaType;)V", "contentType", "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Lwu/f;", "sink", "", "writeTo", "(Lwu/f;)V", "Lmu/p0;", "", ve.a.f33391e, "()Lmu/p0;", "Ljava/io/File;", j6.b.f21518e, "Lokhttp3/MediaType;", "Lmu/c0;", "c", "Lmu/c0;", "flow", rl.d.f30696a, "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends RequestBody {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final File file;

    /* renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final MediaType mediaType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<Integer> flow;

    public d(@NotNull File file, @Nullable MediaType mediaType) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.file = file;
        this.mediaType = mediaType;
        this.flow = r0.a(0);
    }

    @NotNull
    public final p0<Integer> a() {
        return j.a(this.flow);
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return this.file.length();
    }

    @Override // okhttp3.RequestBody
    @Nullable
    /* renamed from: contentType, reason: from getter */
    public MediaType getMediaType() {
        return this.mediaType;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(@NotNull f sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        float length = this.file.length();
        byte[] bArr = new byte[2048];
        FileInputStream fileInputStream = new FileInputStream(this.file);
        try {
            int read = fileInputStream.read(bArr);
            long j10 = 0;
            int i10 = 0;
            while (read != -1) {
                j10 += read;
                sink.write(bArr, 0, read);
                read = fileInputStream.read(bArr);
                int d10 = bu.b.d((j10 / length) * 100.0f);
                if (d10 - i10 > 1 || d10 >= 100) {
                    this.flow.a(Integer.valueOf(d10));
                    i10 = d10;
                }
            }
            Unit unit = Unit.f22894a;
            tt.c.a(fileInputStream, null);
        } finally {
        }
    }
}

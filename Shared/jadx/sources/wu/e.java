package wu;

import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001_B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0018\u0010(\u001a\u00020$2\u0006\u0010'\u001a\u00020\u0010H\u0087\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0010H\u0016¢\u0006\u0004\b0\u0010#J\u000f\u00101\u001a\u00020*H\u0016¢\u0006\u0004\b1\u0010,J\u000f\u00102\u001a\u00020-H\u0016¢\u0006\u0004\b2\u0010/J\u000f\u00103\u001a\u00020\u0010H\u0016¢\u0006\u0004\b3\u0010#J\u000f\u00104\u001a\u00020\u0010H\u0016¢\u0006\u0004\b4\u0010#J\u000f\u00105\u001a\u00020\u0010H\u0016¢\u0006\u0004\b5\u0010#J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u0002062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020-2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u001f\u0010@\u001a\u00020\u00122\u0006\u0010?\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u00102\u0006\u0010?\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020E2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020E2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u001f\u0010N\u001a\u00020E2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020EH\u0016¢\u0006\u0004\bP\u0010GJ\u0017\u0010R\u001a\u00020E2\u0006\u0010Q\u001a\u00020\u0010H\u0016¢\u0006\u0004\bR\u0010IJ\u000f\u0010S\u001a\u00020-H\u0016¢\u0006\u0004\bS\u0010/J\u000f\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u00020T2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\u00122\u0006\u0010?\u001a\u00020TH\u0016¢\u0006\u0004\bY\u0010ZJ'\u0010[\u001a\u00020-2\u0006\u0010?\u001a\u00020T2\u0006\u0010\u001d\u001a\u00020-2\u0006\u0010\u0011\u001a\u00020-H\u0016¢\u0006\u0004\b[\u0010\\J\u0017\u0010[\u001a\u00020-2\u0006\u0010?\u001a\u00020]H\u0016¢\u0006\u0004\b[\u0010^J\r\u0010_\u001a\u00020\u0012¢\u0006\u0004\b_\u0010\u0006J\u0017\u0010`\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b`\u0010\u0014J\u0017\u0010b\u001a\u00020\u00002\u0006\u0010a\u001a\u000206H\u0016¢\u0006\u0004\bb\u0010cJ\u0017\u0010e\u001a\u00020\u00002\u0006\u0010d\u001a\u00020EH\u0016¢\u0006\u0004\be\u0010fJ'\u0010i\u001a\u00020\u00002\u0006\u0010d\u001a\u00020E2\u0006\u0010g\u001a\u00020-2\u0006\u0010h\u001a\u00020-H\u0016¢\u0006\u0004\bi\u0010jJ\u0017\u0010l\u001a\u00020\u00002\u0006\u0010k\u001a\u00020-H\u0016¢\u0006\u0004\bl\u0010mJ\u001f\u0010n\u001a\u00020\u00002\u0006\u0010d\u001a\u00020E2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bn\u0010oJ/\u0010p\u001a\u00020\u00002\u0006\u0010d\u001a\u00020E2\u0006\u0010g\u001a\u00020-2\u0006\u0010h\u001a\u00020-2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bp\u0010qJ\u0017\u0010s\u001a\u00020\u00002\u0006\u0010r\u001a\u00020TH\u0016¢\u0006\u0004\bs\u0010tJ'\u0010u\u001a\u00020\u00002\u0006\u0010r\u001a\u00020T2\u0006\u0010\u001d\u001a\u00020-2\u0006\u0010\u0011\u001a\u00020-H\u0016¢\u0006\u0004\bu\u0010vJ\u0017\u0010w\u001a\u00020-2\u0006\u0010r\u001a\u00020]H\u0016¢\u0006\u0004\bw\u0010^J\u0017\u0010y\u001a\u00020\u00102\u0006\u0010r\u001a\u00020xH\u0016¢\u0006\u0004\by\u0010zJ\u001f\u0010{\u001a\u00020\u00002\u0006\u0010r\u001a\u00020x2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b{\u0010|J\u0017\u0010~\u001a\u00020\u00002\u0006\u0010}\u001a\u00020-H\u0016¢\u0006\u0004\b~\u0010mJ\u0019\u0010\u0080\u0001\u001a\u00020\u00002\u0006\u0010\u007f\u001a\u00020-H\u0016¢\u0006\u0005\b\u0080\u0001\u0010mJ\u001a\u0010\u0082\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020-H\u0016¢\u0006\u0005\b\u0082\u0001\u0010mJ\u001a\u0010\u0083\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020-H\u0016¢\u0006\u0005\b\u0083\u0001\u0010mJ\u001b\u0010\u0085\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001b\u0010\u0087\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0086\u0001J\u001b\u0010\u0088\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0086\u0001J\u001c\u0010\u008b\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u0089\u0001\u001a\u00020-H\u0000¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u001f\u0010w\u001a\u00020\u00122\u0006\u0010r\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\bw\u0010AJ \u0010[\u001a\u00020\u00102\u0006\u0010?\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0005\b[\u0010\u008d\u0001J,\u0010\u0090\u0001\u001a\u00020\u00102\u0006\u0010}\u001a\u00020$2\u0007\u0010\u008e\u0001\u001a\u00020\u00102\u0007\u0010\u008f\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001b\u0010\u0093\u0001\u001a\u00020\u00102\u0007\u0010\u0092\u0001\u001a\u000206H\u0016¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J$\u0010\u0095\u0001\u001a\u00020\u00102\u0007\u0010\u0092\u0001\u001a\u0002062\u0007\u0010\u008e\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J-\u0010\u0097\u0001\u001a\u00020\u00102\u0007\u0010\u0092\u0001\u001a\u0002062\u0007\u0010\u008e\u0001\u001a\u00020\u00102\u0007\u0010\u008f\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u001b\u0010\u009a\u0001\u001a\u00020\u00102\u0007\u0010\u0099\u0001\u001a\u000206H\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u0094\u0001J$\u0010\u009b\u0001\u001a\u00020\u00102\u0007\u0010\u0099\u0001\u001a\u0002062\u0007\u0010\u008e\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u0096\u0001J#\u0010\u009c\u0001\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00102\u0007\u0010\u0092\u0001\u001a\u000206H\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J4\u0010\u009f\u0001\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00102\u0007\u0010\u0092\u0001\u001a\u0002062\u0007\u0010\u009e\u0001\u001a\u00020-2\u0006\u0010\u0011\u001a\u00020-H\u0016¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u0011\u0010¡\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b¡\u0001\u0010\u0006J\u0011\u0010¢\u0001\u001a\u00020\rH\u0016¢\u0006\u0005\b¢\u0001\u0010\u000fJ\u0011\u0010£\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b£\u0001\u0010\u0006J\u0013\u0010¥\u0001\u001a\u00030¤\u0001H\u0016¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u001f\u0010©\u0001\u001a\u00020\r2\n\u0010¨\u0001\u001a\u0005\u0018\u00010§\u0001H\u0096\u0002¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u0011\u0010«\u0001\u001a\u00020-H\u0016¢\u0006\u0005\b«\u0001\u0010/J\u0011\u0010¬\u0001\u001a\u00020EH\u0016¢\u0006\u0005\b¬\u0001\u0010GJ\u000f\u0010\u00ad\u0001\u001a\u00020\u0000¢\u0006\u0005\b\u00ad\u0001\u0010\bJ\u000f\u0010}\u001a\u00020\u0000H\u0016¢\u0006\u0004\b}\u0010\bJ\u000f\u0010®\u0001\u001a\u000206¢\u0006\u0005\b®\u0001\u00108J\u0018\u0010¯\u0001\u001a\u0002062\u0006\u0010\u0011\u001a\u00020-¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u001d\u0010\u007f\u001a\u00030±\u00012\n\b\u0002\u0010²\u0001\u001a\u00030±\u0001H\u0007¢\u0006\u0005\b\u007f\u0010³\u0001R\u001b\u0010µ\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u0007\n\u0005\b_\u0010´\u0001R/\u0010¸\u0001\u001a\u00020\u00102\u0007\u0010¶\u0001\u001a\u00020\u00108\u0007@@X\u0086\u000e¢\u0006\u0015\n\u0005\b}\u0010·\u0001\u001a\u0005\b¸\u0001\u0010#\"\u0005\b¹\u0001\u0010\u0014R\u0016\u0010»\u0001\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bº\u0001\u0010\b¨\u0006¼\u0001"}, d2 = {"Lwu/e;", "Lwu/g;", "Lwu/f;", "", "Ljava/nio/channels/ByteChannel;", "<init>", "()V", "O", "()Lwu/e;", "Ljava/io/OutputStream;", "l3", "()Ljava/io/OutputStream;", "h", "", "X1", "()Z", "", "byteCount", "", "v1", "(J)V", "request", "(J)Z", "peek", "()Lwu/g;", "Ljava/io/InputStream;", "s3", "()Ljava/io/InputStream;", "out", "offset", "f", "(Lwu/e;JJ)Lwu/e;", "C0", "(Ljava/io/OutputStream;J)Lwu/e;", "c", "()J", "", "readByte", "()B", "pos", "j", "(J)B", "", "readShort", "()S", "", "readInt", "()I", "readLong", "i1", "M2", "l1", "h2", "o3", "Lwu/h;", "G2", "()Lwu/h;", "I1", "(J)Lwu/h;", "Lwu/f0;", "options", "y0", "(Lwu/f0;)I", "sink", "d0", "(Lwu/e;J)V", "Lwu/p0;", "K2", "(Lwu/p0;)J", "", "S2", "()Ljava/lang/String;", "E1", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "A2", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "P", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "Z0", "limit", "l0", "B2", "", "V1", "()[B", "x", "(J)[B", "readFully", "([B)V", "read", "([BII)I", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", ve.a.f33391e, "skip", "byteString", "Z", "(Lwu/h;)Lwu/e;", InquiryField.StringField.TYPE, "F0", "(Ljava/lang/String;)Lwu/e;", "beginIndex", "endIndex", "H0", "(Ljava/lang/String;II)Lwu/e;", "codePoint", "J0", "(I)Lwu/e;", "B0", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lwu/e;", "x0", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lwu/e;", Payload.SOURCE, "c0", "([B)Lwu/e;", "e0", "([BII)Lwu/e;", "write", "Lwu/r0;", "d3", "(Lwu/r0;)J", "a0", "(Lwu/r0;J)Lwu/e;", j6.b.f21518e, "g0", "s", "w0", "i", "q0", "u0", "v", "v0", "(J)Lwu/e;", "j0", "o0", "minimumCapacity", "Lwu/m0;", "Y", "(I)Lwu/m0;", "(Lwu/e;J)J", "fromIndex", "toIndex", "n", "(BJJ)J", "bytes", "y2", "(Lwu/h;)J", "o", "(Lwu/h;J)J", "g2", "(Lwu/h;JJ)J", "targetBytes", "p1", "q", "b1", "(JLwu/h;)Z", "bytesOffset", "r", "(JLwu/h;II)Z", "flush", "isOpen", "close", "Lwu/s0;", "timeout", "()Lwu/s0;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "e", "W", "X", "(I)Lwu/h;", "Lwu/e$a;", "unsafeCursor", "(Lwu/e$a;)Lwu/e$a;", "Lwu/m0;", "head", "value", "J", "size", "U", "k", "buffer", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e implements g, f, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public m0 head;

    /* renamed from: b, reason: from kotlin metadata */
    public long size;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0003R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R$\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u0016\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b$\u0010\"¨\u0006&"}, d2 = {"Lwu/e$a;", "Ljava/io/Closeable;", "<init>", "()V", "", j6.b.f21518e, "()I", "", "offset", rl.d.f30696a, "(J)I", "newSize", "c", "(J)J", "", "close", "Lwu/e;", ve.a.f33391e, "Lwu/e;", "buffer", "", "Z", "readWrite", "Lwu/m0;", "Lwu/m0;", "()Lwu/m0;", "e", "(Lwu/m0;)V", "segment", "J", "", "[B", "data", "f", "I", "start", "g", "end", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Closeable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public e buffer;

        /* renamed from: b, reason: from kotlin metadata */
        public boolean readWrite;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public m0 segment;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public byte[] data;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public long offset = -1;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        public int start = -1;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        public int end = -1;

        @Nullable
        /* renamed from: a, reason: from getter */
        public final m0 getSegment() {
            return this.segment;
        }

        public final int b() {
            long j10 = this.offset;
            e eVar = this.buffer;
            Intrinsics.checkNotNull(eVar);
            if (j10 == eVar.getSize()) {
                throw new IllegalStateException("no more bytes");
            }
            long j11 = this.offset;
            return d(j11 == -1 ? 0L : j11 + (this.end - this.start));
        }

        public final long c(long newSize) {
            e eVar = this.buffer;
            if (eVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.readWrite) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long size = eVar.getSize();
            if (newSize <= size) {
                if (newSize < 0) {
                    throw new IllegalArgumentException(("newSize < 0: " + newSize).toString());
                }
                long j10 = size - newSize;
                while (true) {
                    if (j10 <= 0) {
                        break;
                    }
                    m0 m0Var = eVar.head;
                    Intrinsics.checkNotNull(m0Var);
                    m0 m0Var2 = m0Var.prev;
                    Intrinsics.checkNotNull(m0Var2);
                    int i10 = m0Var2.limit;
                    long j11 = i10 - m0Var2.pos;
                    if (j11 > j10) {
                        m0Var2.limit = i10 - ((int) j10);
                        break;
                    }
                    eVar.head = m0Var2.b();
                    n0.b(m0Var2);
                    j10 -= j11;
                }
                e(null);
                this.offset = newSize;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (newSize > size) {
                long j12 = newSize - size;
                boolean z10 = true;
                while (j12 > 0) {
                    m0 Y = eVar.Y(1);
                    int min = (int) Math.min(j12, 8192 - Y.limit);
                    Y.limit += min;
                    j12 -= min;
                    if (z10) {
                        e(Y);
                        this.offset = size;
                        this.data = Y.data;
                        int i11 = Y.limit;
                        this.start = i11 - min;
                        this.end = i11;
                        z10 = false;
                    }
                }
            }
            eVar.U(newSize);
            return size;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.buffer = null;
            e(null);
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final int d(long offset) {
            m0 m0Var;
            e eVar = this.buffer;
            if (eVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (offset < -1 || offset > eVar.getSize()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + offset + " > size=" + eVar.getSize());
            }
            if (offset == -1 || offset == eVar.getSize()) {
                e(null);
                this.offset = offset;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long size = eVar.getSize();
            m0 m0Var2 = eVar.head;
            long j10 = 0;
            if (getSegment() != null) {
                long j11 = this.offset;
                int i10 = this.start;
                Intrinsics.checkNotNull(getSegment());
                long j12 = j11 - (i10 - r9.pos);
                if (j12 > offset) {
                    m0Var = m0Var2;
                    m0Var2 = getSegment();
                    size = j12;
                } else {
                    m0Var = getSegment();
                    j10 = j12;
                }
            } else {
                m0Var = m0Var2;
            }
            if (size - offset > offset - j10) {
                while (true) {
                    Intrinsics.checkNotNull(m0Var);
                    int i11 = m0Var.limit;
                    int i12 = m0Var.pos;
                    if (offset < (i11 - i12) + j10) {
                        break;
                    }
                    j10 += i11 - i12;
                    m0Var = m0Var.next;
                }
            } else {
                while (size > offset) {
                    Intrinsics.checkNotNull(m0Var2);
                    m0Var2 = m0Var2.prev;
                    Intrinsics.checkNotNull(m0Var2);
                    size -= m0Var2.limit - m0Var2.pos;
                }
                j10 = size;
                m0Var = m0Var2;
            }
            if (this.readWrite) {
                Intrinsics.checkNotNull(m0Var);
                if (m0Var.shared) {
                    m0 f10 = m0Var.f();
                    if (eVar.head == m0Var) {
                        eVar.head = f10;
                    }
                    m0Var = m0Var.c(f10);
                    m0 m0Var3 = m0Var.prev;
                    Intrinsics.checkNotNull(m0Var3);
                    m0Var3.b();
                }
            }
            e(m0Var);
            this.offset = offset;
            Intrinsics.checkNotNull(m0Var);
            this.data = m0Var.data;
            int i13 = m0Var.pos + ((int) (offset - j10));
            this.start = i13;
            int i14 = m0Var.limit;
            this.end = i14;
            return i14 - i13;
        }

        public final void e(@Nullable m0 m0Var) {
            this.segment = m0Var;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"wu/e$c", "Ljava/io/OutputStream;", "", j6.b.f21518e, "", "write", "(I)V", "", "data", "offset", "byteCount", "([BII)V", "flush", "()V", "close", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends OutputStream {
        public c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return e.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int b) {
            e.this.writeByte(b);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int offset, int byteCount) {
            Intrinsics.checkNotNullParameter(data, "data");
            e.this.write(data, offset, byteCount);
        }
    }

    public static /* synthetic */ e D0(e eVar, OutputStream outputStream, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = eVar.size;
        }
        return eVar.C0(outputStream, j10);
    }

    public static /* synthetic */ a w(e eVar, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = wu.b.d();
        }
        return eVar.s(aVar);
    }

    @Override // wu.g
    @NotNull
    public String A2(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return P(this.size, charset);
    }

    @NotNull
    public e B0(@NotNull String string, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return x0(string, 0, string.length(), charset);
    }

    @Override // wu.g
    public int B2() {
        int i10;
        int i11;
        int i12;
        if (getSize() == 0) {
            throw new EOFException();
        }
        byte j10 = j(0L);
        if ((j10 & 128) == 0) {
            i10 = j10 & Byte.MAX_VALUE;
            i12 = 0;
            i11 = 1;
        } else if ((j10 & 224) == 192) {
            i10 = j10 & 31;
            i11 = 2;
            i12 = 128;
        } else if ((j10 & 240) == 224) {
            i10 = j10 & 15;
            i11 = 3;
            i12 = 2048;
        } else {
            if ((j10 & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i10 = j10 & 7;
            i11 = 4;
            i12 = 65536;
        }
        long j11 = i11;
        if (getSize() < j11) {
            throw new EOFException("size < " + i11 + ": " + getSize() + " (to read code point prefixed 0x" + wu.b.k(j10) + ')');
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j12 = i13;
            byte j13 = j(j12);
            if ((j13 & 192) != 128) {
                skip(j12);
                return 65533;
            }
            i10 = (i10 << 6) | (j13 & 63);
        }
        skip(j11);
        if (i10 > 1114111) {
            return 65533;
        }
        if ((55296 > i10 || i10 >= 57344) && i10 >= i12) {
            return i10;
        }
        return 65533;
    }

    @NotNull
    public final e C0(@NotNull OutputStream out, long byteCount) {
        Intrinsics.checkNotNullParameter(out, "out");
        wu.b.b(this.size, 0L, byteCount);
        m0 m0Var = this.head;
        long j10 = byteCount;
        while (j10 > 0) {
            Intrinsics.checkNotNull(m0Var);
            int min = (int) Math.min(j10, m0Var.limit - m0Var.pos);
            out.write(m0Var.data, m0Var.pos, min);
            int i10 = m0Var.pos + min;
            m0Var.pos = i10;
            long j11 = min;
            this.size -= j11;
            j10 -= j11;
            if (i10 == m0Var.limit) {
                m0 b10 = m0Var.b();
                this.head = b10;
                n0.b(m0Var);
                m0Var = b10;
            }
        }
        return this;
    }

    @Override // wu.g
    @NotNull
    public String E1(long byteCount) {
        return P(byteCount, Charsets.UTF_8);
    }

    @Override // wu.f
    @NotNull
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public e A0(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return I0(string, 0, string.length());
    }

    @Override // wu.g
    @NotNull
    public h G2() {
        return I1(getSize());
    }

    @Override // wu.f
    @NotNull
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public e I0(@NotNull String string, int beginIndex, int endIndex) {
        char charAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (beginIndex < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + beginIndex).toString());
        }
        if (endIndex < beginIndex) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + endIndex + " < " + beginIndex).toString());
        }
        if (endIndex > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + endIndex + " > " + string.length()).toString());
        }
        while (beginIndex < endIndex) {
            char charAt2 = string.charAt(beginIndex);
            if (charAt2 < 128) {
                m0 Y = Y(1);
                byte[] bArr = Y.data;
                int i10 = Y.limit - beginIndex;
                int min = Math.min(endIndex, 8192 - i10);
                int i11 = beginIndex + 1;
                bArr[beginIndex + i10] = (byte) charAt2;
                while (true) {
                    beginIndex = i11;
                    if (beginIndex >= min || (charAt = string.charAt(beginIndex)) >= 128) {
                        break;
                    }
                    i11 = beginIndex + 1;
                    bArr[beginIndex + i10] = (byte) charAt;
                }
                int i12 = Y.limit;
                int i13 = (i10 + beginIndex) - i12;
                Y.limit = i12 + i13;
                U(getSize() + i13);
            } else {
                if (charAt2 < 2048) {
                    m0 Y2 = Y(2);
                    byte[] bArr2 = Y2.data;
                    int i14 = Y2.limit;
                    bArr2[i14] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i14 + 1] = (byte) ((charAt2 & '?') | 128);
                    Y2.limit = i14 + 2;
                    U(getSize() + 2);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    m0 Y3 = Y(3);
                    byte[] bArr3 = Y3.data;
                    int i15 = Y3.limit;
                    bArr3[i15] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i15 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i15 + 2] = (byte) ((charAt2 & '?') | 128);
                    Y3.limit = i15 + 3;
                    U(getSize() + 3);
                } else {
                    int i16 = beginIndex + 1;
                    char charAt3 = i16 < endIndex ? string.charAt(i16) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        writeByte(63);
                        beginIndex = i16;
                    } else {
                        int i17 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        m0 Y4 = Y(4);
                        byte[] bArr4 = Y4.data;
                        int i18 = Y4.limit;
                        bArr4[i18] = (byte) ((i17 >> 18) | 240);
                        bArr4[i18 + 1] = (byte) (((i17 >> 12) & 63) | 128);
                        bArr4[i18 + 2] = (byte) (((i17 >> 6) & 63) | 128);
                        bArr4[i18 + 3] = (byte) ((i17 & 63) | 128);
                        Y4.limit = i18 + 4;
                        U(getSize() + 4);
                        beginIndex += 2;
                    }
                }
                beginIndex++;
            }
        }
        return this;
    }

    @Override // wu.g
    @NotNull
    public h I1(long byteCount) {
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (getSize() < byteCount) {
            throw new EOFException();
        }
        if (byteCount < 4096) {
            return new h(x(byteCount));
        }
        h X = X((int) byteCount);
        skip(byteCount);
        return X;
    }

    @Override // wu.f
    @NotNull
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public e T(int codePoint) {
        if (codePoint < 128) {
            writeByte(codePoint);
            return this;
        }
        if (codePoint < 2048) {
            m0 Y = Y(2);
            byte[] bArr = Y.data;
            int i10 = Y.limit;
            bArr[i10] = (byte) ((codePoint >> 6) | 192);
            bArr[i10 + 1] = (byte) ((codePoint & 63) | 128);
            Y.limit = i10 + 2;
            U(getSize() + 2);
            return this;
        }
        if (55296 <= codePoint && codePoint < 57344) {
            writeByte(63);
            return this;
        }
        if (codePoint < 65536) {
            m0 Y2 = Y(3);
            byte[] bArr2 = Y2.data;
            int i11 = Y2.limit;
            bArr2[i11] = (byte) ((codePoint >> 12) | 224);
            bArr2[i11 + 1] = (byte) (((codePoint >> 6) & 63) | 128);
            bArr2[i11 + 2] = (byte) ((codePoint & 63) | 128);
            Y2.limit = i11 + 3;
            U(getSize() + 3);
            return this;
        }
        if (codePoint > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + wu.b.l(codePoint));
        }
        m0 Y3 = Y(4);
        byte[] bArr3 = Y3.data;
        int i12 = Y3.limit;
        bArr3[i12] = (byte) ((codePoint >> 18) | 240);
        bArr3[i12 + 1] = (byte) (((codePoint >> 12) & 63) | 128);
        bArr3[i12 + 2] = (byte) (((codePoint >> 6) & 63) | 128);
        bArr3[i12 + 3] = (byte) ((codePoint & 63) | 128);
        Y3.limit = i12 + 4;
        U(getSize() + 4);
        return this;
    }

    @Override // wu.g
    public long K2(@NotNull p0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = getSize();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    @Override // wu.g
    public int M2() {
        return wu.b.h(readInt());
    }

    @Override // wu.g
    @NotNull
    public e O() {
        return this;
    }

    @NotNull
    public String P(long byteCount, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (this.size < byteCount) {
            throw new EOFException();
        }
        if (byteCount == 0) {
            return "";
        }
        m0 m0Var = this.head;
        Intrinsics.checkNotNull(m0Var);
        int i10 = m0Var.pos;
        if (i10 + byteCount > m0Var.limit) {
            return new String(x(byteCount), charset);
        }
        int i11 = (int) byteCount;
        String str = new String(m0Var.data, i10, i11, charset);
        int i12 = m0Var.pos + i11;
        m0Var.pos = i12;
        this.size -= byteCount;
        if (i12 == m0Var.limit) {
            this.head = m0Var.b();
            n0.b(m0Var);
        }
        return str;
    }

    @Override // wu.g
    @NotNull
    public String S2() {
        return P(this.size, Charsets.UTF_8);
    }

    public final void U(long j10) {
        this.size = j10;
    }

    @Override // wu.g
    @NotNull
    public byte[] V1() {
        return x(getSize());
    }

    @NotNull
    public final h W() {
        if (getSize() <= 2147483647L) {
            return X((int) getSize());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + getSize()).toString());
    }

    @NotNull
    public final h X(int byteCount) {
        if (byteCount == 0) {
            return h.f34820e;
        }
        wu.b.b(getSize(), 0L, byteCount);
        m0 m0Var = this.head;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < byteCount) {
            Intrinsics.checkNotNull(m0Var);
            int i13 = m0Var.limit;
            int i14 = m0Var.pos;
            if (i13 == i14) {
                throw new AssertionError("s.limit == s.pos");
            }
            i11 += i13 - i14;
            i12++;
            m0Var = m0Var.next;
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[i12 * 2];
        m0 m0Var2 = this.head;
        int i15 = 0;
        while (i10 < byteCount) {
            Intrinsics.checkNotNull(m0Var2);
            bArr[i15] = m0Var2.data;
            i10 += m0Var2.limit - m0Var2.pos;
            iArr[i15] = Math.min(i10, byteCount);
            iArr[i15 + i12] = m0Var2.pos;
            m0Var2.shared = true;
            i15++;
            m0Var2 = m0Var2.next;
        }
        return new o0(bArr, iArr);
    }

    @Override // wu.g
    public boolean X1() {
        return this.size == 0;
    }

    @NotNull
    public final m0 Y(int minimumCapacity) {
        if (minimumCapacity < 1 || minimumCapacity > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        m0 m0Var = this.head;
        if (m0Var != null) {
            Intrinsics.checkNotNull(m0Var);
            m0 m0Var2 = m0Var.prev;
            Intrinsics.checkNotNull(m0Var2);
            return (m0Var2.limit + minimumCapacity > 8192 || !m0Var2.owner) ? m0Var2.c(n0.c()) : m0Var2;
        }
        m0 c10 = n0.c();
        this.head = c10;
        c10.prev = c10;
        c10.next = c10;
        return c10;
    }

    @Override // wu.f
    @NotNull
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public e s2(@NotNull h byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.Q(this, 0, byteString.I());
        return this;
    }

    @Override // wu.g
    @NotNull
    public String Z0() {
        return l0(Long.MAX_VALUE);
    }

    public final void a() {
        skip(getSize());
    }

    @NotNull
    public e a0(@NotNull r0 source, long byteCount) {
        Intrinsics.checkNotNullParameter(source, "source");
        while (byteCount > 0) {
            long read = source.read(this, byteCount);
            if (read == -1) {
                throw new EOFException();
            }
            byteCount -= read;
        }
        return this;
    }

    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e clone() {
        return e();
    }

    @Override // wu.g
    public boolean b1(long offset, @NotNull h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return r(offset, bytes, 0, bytes.I());
    }

    public final long c() {
        long size = getSize();
        if (size == 0) {
            return 0L;
        }
        m0 m0Var = this.head;
        Intrinsics.checkNotNull(m0Var);
        m0 m0Var2 = m0Var.prev;
        Intrinsics.checkNotNull(m0Var2);
        return (m0Var2.limit >= 8192 || !m0Var2.owner) ? size : size - (r3 - m0Var2.pos);
    }

    @Override // wu.f
    @NotNull
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public e write(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return write(source, 0, source.length);
    }

    @Override // wu.r0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // wu.g
    public void d0(@NotNull e sink, long byteCount) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (getSize() >= byteCount) {
            sink.write(this, byteCount);
        } else {
            sink.write(this, getSize());
            throw new EOFException();
        }
    }

    @Override // wu.f
    public long d3(@NotNull r0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long read = source.read(this, 8192L);
            if (read == -1) {
                return j10;
            }
            j10 += read;
        }
    }

    @NotNull
    public final e e() {
        e eVar = new e();
        if (getSize() == 0) {
            return eVar;
        }
        m0 m0Var = this.head;
        Intrinsics.checkNotNull(m0Var);
        m0 d10 = m0Var.d();
        eVar.head = d10;
        d10.prev = d10;
        d10.next = d10;
        for (m0 m0Var2 = m0Var.next; m0Var2 != m0Var; m0Var2 = m0Var2.next) {
            m0 m0Var3 = d10.prev;
            Intrinsics.checkNotNull(m0Var3);
            Intrinsics.checkNotNull(m0Var2);
            m0Var3.c(m0Var2.d());
        }
        eVar.U(getSize());
        return eVar;
    }

    @Override // wu.f
    @NotNull
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public e write(@NotNull byte[] source, int offset, int byteCount) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = byteCount;
        wu.b.b(source.length, offset, j10);
        int i10 = byteCount + offset;
        while (offset < i10) {
            m0 Y = Y(1);
            int min = Math.min(i10 - offset, 8192 - Y.limit);
            int i11 = offset + min;
            kotlin.collections.l.f(source, Y.data, Y.limit, offset, i11);
            Y.limit += min;
            offset = i11;
        }
        U(getSize() + j10);
        return this;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        if (getSize() != eVar.getSize()) {
            return false;
        }
        if (getSize() == 0) {
            return true;
        }
        m0 m0Var = this.head;
        Intrinsics.checkNotNull(m0Var);
        m0 m0Var2 = eVar.head;
        Intrinsics.checkNotNull(m0Var2);
        int i10 = m0Var.pos;
        int i11 = m0Var2.pos;
        long j10 = 0;
        while (j10 < getSize()) {
            long min = Math.min(m0Var.limit - i10, m0Var2.limit - i11);
            long j11 = 0;
            while (j11 < min) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (m0Var.data[i10] != m0Var2.data[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == m0Var.limit) {
                m0Var = m0Var.next;
                Intrinsics.checkNotNull(m0Var);
                i10 = m0Var.pos;
            }
            if (i11 == m0Var2.limit) {
                m0Var2 = m0Var2.next;
                Intrinsics.checkNotNull(m0Var2);
                i11 = m0Var2.pos;
            }
            j10 += min;
        }
        return true;
    }

    @NotNull
    public final e f(@NotNull e out, long offset, long byteCount) {
        Intrinsics.checkNotNullParameter(out, "out");
        long j10 = offset;
        wu.b.b(getSize(), j10, byteCount);
        if (byteCount != 0) {
            out.U(out.getSize() + byteCount);
            m0 m0Var = this.head;
            while (true) {
                Intrinsics.checkNotNull(m0Var);
                int i10 = m0Var.limit;
                int i11 = m0Var.pos;
                if (j10 < i10 - i11) {
                    break;
                }
                j10 -= i10 - i11;
                m0Var = m0Var.next;
            }
            m0 m0Var2 = m0Var;
            long j11 = byteCount;
            while (j11 > 0) {
                Intrinsics.checkNotNull(m0Var2);
                m0 d10 = m0Var2.d();
                int i12 = d10.pos + ((int) j10);
                d10.pos = i12;
                d10.limit = Math.min(i12 + ((int) j11), d10.limit);
                m0 m0Var3 = out.head;
                if (m0Var3 == null) {
                    d10.prev = d10;
                    d10.next = d10;
                    out.head = d10;
                } else {
                    Intrinsics.checkNotNull(m0Var3);
                    m0 m0Var4 = m0Var3.prev;
                    Intrinsics.checkNotNull(m0Var4);
                    m0Var4.c(d10);
                }
                j11 -= d10.limit - d10.pos;
                m0Var2 = m0Var2.next;
                j10 = 0;
            }
        }
        return this;
    }

    @Override // wu.f, wu.p0, java.io.Flushable
    public void flush() {
    }

    @Override // wu.f
    @NotNull
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public e writeByte(int b10) {
        m0 Y = Y(1);
        byte[] bArr = Y.data;
        int i10 = Y.limit;
        Y.limit = i10 + 1;
        bArr[i10] = (byte) b10;
        U(getSize() + 1);
        return this;
    }

    @Override // wu.g
    public long g2(@NotNull h bytes, long fromIndex, long toIndex) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return xu.a.c(this, bytes, fromIndex, toIndex, 0, 0, 24, null);
    }

    @Override // wu.f
    @NotNull
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public e h0() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
    
        U(getSize() - r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
    
        if (r2 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
    
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b0, code lost:
    
        if (r1 >= r14) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b8, code lost:
    
        if (getSize() == r17) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ba, code lost:
    
        if (r2 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bc, code lost:
    
        r1 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e4, code lost:
    
        throw new java.lang.NumberFormatException(r1 + " but was 0x" + wu.b.k(j(r17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bf, code lost:
    
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ea, code lost:
    
        throw new java.io.EOFException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00eb, code lost:
    
        if (r2 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ed, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ef, code lost:
    
        return -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00af, code lost:
    
        r14 = 1;
     */
    @Override // wu.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long h2() {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wu.e.h2():long");
    }

    public int hashCode() {
        m0 m0Var = this.head;
        if (m0Var == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = m0Var.limit;
            for (int i12 = m0Var.pos; i12 < i11; i12++) {
                i10 = (i10 * 31) + m0Var.data[i12];
            }
            m0Var = m0Var.next;
            Intrinsics.checkNotNull(m0Var);
        } while (m0Var != this.head);
        return i10;
    }

    @Override // wu.g
    public short i1() {
        return wu.b.j(readShort());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final byte j(long pos) {
        wu.b.b(getSize(), pos, 1L);
        m0 m0Var = this.head;
        if (m0Var == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (getSize() - pos < pos) {
            long size = getSize();
            while (size > pos) {
                m0Var = m0Var.prev;
                Intrinsics.checkNotNull(m0Var);
                size -= m0Var.limit - m0Var.pos;
            }
            Intrinsics.checkNotNull(m0Var);
            return m0Var.data[(int) ((m0Var.pos + pos) - size)];
        }
        long j10 = 0;
        while (true) {
            long j11 = (m0Var.limit - m0Var.pos) + j10;
            if (j11 > pos) {
                Intrinsics.checkNotNull(m0Var);
                return m0Var.data[(int) ((m0Var.pos + pos) - j10)];
            }
            m0Var = m0Var.next;
            Intrinsics.checkNotNull(m0Var);
            j10 = j11;
        }
    }

    @Override // wu.f
    @NotNull
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public e y1(long v5) {
        boolean z10;
        int e10;
        if (v5 == 0) {
            return writeByte(48);
        }
        if (v5 < 0) {
            v5 = -v5;
            if (v5 < 0) {
                return A0("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        e10 = xu.a.e(v5);
        if (z10) {
            e10++;
        }
        m0 Y = Y(e10);
        byte[] bArr = Y.data;
        int i10 = Y.limit + e10;
        while (v5 != 0) {
            long j10 = 10;
            i10--;
            bArr[i10] = xu.a.f()[(int) (v5 % j10)];
            v5 /= j10;
        }
        if (z10) {
            bArr[i10 - 1] = 45;
        }
        Y.limit += e10;
        U(getSize() + e10);
        return this;
    }

    @Override // wu.g, wu.f
    @NotNull
    public e k() {
        return this;
    }

    @Override // wu.g
    @NotNull
    public String l0(long limit) {
        if (limit < 0) {
            throw new IllegalArgumentException(("limit < 0: " + limit).toString());
        }
        long j10 = limit != Long.MAX_VALUE ? limit + 1 : Long.MAX_VALUE;
        long n10 = n((byte) 10, 0L, j10);
        if (n10 != -1) {
            return xu.a.h(this, n10);
        }
        if (j10 < getSize() && j(j10 - 1) == 13 && j(j10) == 10) {
            return xu.a.h(this, j10);
        }
        e eVar = new e();
        f(eVar, 0L, Math.min(32, getSize()));
        throw new EOFException("\\n not found: limit=" + Math.min(getSize(), limit) + " content=" + eVar.G2().r() + (char) 8230);
    }

    @Override // wu.g
    public long l1() {
        return wu.b.i(readLong());
    }

    @Override // wu.f
    @NotNull
    public OutputStream l3() {
        return new c();
    }

    public long n(byte b10, long fromIndex, long toIndex) {
        m0 m0Var;
        int i10;
        long j10 = 0;
        if (0 > fromIndex || fromIndex > toIndex) {
            throw new IllegalArgumentException(("size=" + getSize() + " fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
        }
        if (toIndex > getSize()) {
            toIndex = getSize();
        }
        if (fromIndex == toIndex || (m0Var = this.head) == null) {
            return -1L;
        }
        if (getSize() - fromIndex < fromIndex) {
            j10 = getSize();
            while (j10 > fromIndex) {
                m0Var = m0Var.prev;
                Intrinsics.checkNotNull(m0Var);
                j10 -= m0Var.limit - m0Var.pos;
            }
            while (j10 < toIndex) {
                byte[] bArr = m0Var.data;
                int min = (int) Math.min(m0Var.limit, (m0Var.pos + toIndex) - j10);
                i10 = (int) ((m0Var.pos + fromIndex) - j10);
                while (i10 < min) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                j10 += m0Var.limit - m0Var.pos;
                m0Var = m0Var.next;
                Intrinsics.checkNotNull(m0Var);
                fromIndex = j10;
            }
            return -1L;
        }
        while (true) {
            long j11 = (m0Var.limit - m0Var.pos) + j10;
            if (j11 > fromIndex) {
                break;
            }
            m0Var = m0Var.next;
            Intrinsics.checkNotNull(m0Var);
            j10 = j11;
        }
        while (j10 < toIndex) {
            byte[] bArr2 = m0Var.data;
            int min2 = (int) Math.min(m0Var.limit, (m0Var.pos + toIndex) - j10);
            i10 = (int) ((m0Var.pos + fromIndex) - j10);
            while (i10 < min2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            j10 += m0Var.limit - m0Var.pos;
            m0Var = m0Var.next;
            Intrinsics.checkNotNull(m0Var);
            fromIndex = j10;
        }
        return -1L;
        return (i10 - m0Var.pos) + j10;
    }

    public long o(@NotNull h bytes, long fromIndex) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return g2(bytes, fromIndex, Long.MAX_VALUE);
    }

    @Override // wu.f
    @NotNull
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public e E2(long v5) {
        if (v5 == 0) {
            return writeByte(48);
        }
        long j10 = (v5 >>> 1) | v5;
        long j11 = j10 | (j10 >>> 2);
        long j12 = j11 | (j11 >>> 4);
        long j13 = j12 | (j12 >>> 8);
        long j14 = j13 | (j13 >>> 16);
        long j15 = j14 | (j14 >>> 32);
        long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
        long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
        long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
        long j19 = j18 + (j18 >>> 8);
        long j20 = j19 + (j19 >>> 16);
        int i10 = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + 3) / 4);
        m0 Y = Y(i10);
        byte[] bArr = Y.data;
        int i11 = Y.limit;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = xu.a.f()[(int) (15 & v5)];
            v5 >>>= 4;
        }
        Y.limit += i10;
        U(getSize() + i10);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7 A[EDGE_INSN: B:40:0x00a7->B:37:0x00a7 BREAK  A[LOOP:0: B:4:0x000d->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    @Override // wu.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long o3() {
        /*
            r14 = this;
            long r0 = r14.getSize()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb1
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            wu.m0 r6 = r14.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L18:
            if (r8 >= r9) goto L93
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L74
            r11 = 70
            if (r10 > r11) goto L74
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            wu.e r0 = new wu.e
            r0.<init>()
            wu.e r0 = r0.E2(r4)
            wu.e r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.S2()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L74:
            if (r0 == 0) goto L78
            r1 = 1
            goto L93
        L78:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = wu.b.k(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L93:
            if (r8 != r9) goto L9f
            wu.m0 r7 = r6.b()
            r14.head = r7
            wu.n0.b(r6)
            goto La1
        L9f:
            r6.pos = r8
        La1:
            if (r1 != 0) goto La7
            wu.m0 r6 = r14.head
            if (r6 != 0) goto Ld
        La7:
            long r1 = r14.getSize()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.U(r1)
            return r4
        Lb1:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wu.e.o3():long");
    }

    @Override // wu.g
    public long p1(@NotNull h targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return q(targetBytes, 0L);
    }

    @Override // wu.g
    @NotNull
    public g peek() {
        return b0.c(new i0(this));
    }

    public long q(@NotNull h targetBytes, long fromIndex) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long j10 = 0;
        if (fromIndex < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + fromIndex).toString());
        }
        m0 m0Var = this.head;
        if (m0Var == null) {
            return -1L;
        }
        if (getSize() - fromIndex < fromIndex) {
            j10 = getSize();
            while (j10 > fromIndex) {
                m0Var = m0Var.prev;
                Intrinsics.checkNotNull(m0Var);
                j10 -= m0Var.limit - m0Var.pos;
            }
            if (targetBytes.I() == 2) {
                byte j11 = targetBytes.j(0);
                byte j12 = targetBytes.j(1);
                while (j10 < getSize()) {
                    byte[] bArr = m0Var.data;
                    i10 = (int) ((m0Var.pos + fromIndex) - j10);
                    int i12 = m0Var.limit;
                    while (i10 < i12) {
                        byte b10 = bArr[i10];
                        if (b10 != j11 && b10 != j12) {
                            i10++;
                        }
                        i11 = m0Var.pos;
                    }
                    j10 += m0Var.limit - m0Var.pos;
                    m0Var = m0Var.next;
                    Intrinsics.checkNotNull(m0Var);
                    fromIndex = j10;
                }
            } else {
                byte[] w5 = targetBytes.w();
                while (j10 < getSize()) {
                    byte[] bArr2 = m0Var.data;
                    i10 = (int) ((m0Var.pos + fromIndex) - j10);
                    int i13 = m0Var.limit;
                    while (i10 < i13) {
                        byte b11 = bArr2[i10];
                        for (byte b12 : w5) {
                            if (b11 == b12) {
                                i11 = m0Var.pos;
                            }
                        }
                        i10++;
                    }
                    j10 += m0Var.limit - m0Var.pos;
                    m0Var = m0Var.next;
                    Intrinsics.checkNotNull(m0Var);
                    fromIndex = j10;
                }
            }
            return -1L;
        }
        while (true) {
            long j13 = (m0Var.limit - m0Var.pos) + j10;
            if (j13 > fromIndex) {
                break;
            }
            m0Var = m0Var.next;
            Intrinsics.checkNotNull(m0Var);
            j10 = j13;
        }
        if (targetBytes.I() == 2) {
            byte j14 = targetBytes.j(0);
            byte j15 = targetBytes.j(1);
            while (j10 < getSize()) {
                byte[] bArr3 = m0Var.data;
                i10 = (int) ((m0Var.pos + fromIndex) - j10);
                int i14 = m0Var.limit;
                while (i10 < i14) {
                    byte b13 = bArr3[i10];
                    if (b13 != j14 && b13 != j15) {
                        i10++;
                    }
                    i11 = m0Var.pos;
                }
                j10 += m0Var.limit - m0Var.pos;
                m0Var = m0Var.next;
                Intrinsics.checkNotNull(m0Var);
                fromIndex = j10;
            }
        } else {
            byte[] w10 = targetBytes.w();
            while (j10 < getSize()) {
                byte[] bArr4 = m0Var.data;
                i10 = (int) ((m0Var.pos + fromIndex) - j10);
                int i15 = m0Var.limit;
                while (i10 < i15) {
                    byte b14 = bArr4[i10];
                    for (byte b15 : w10) {
                        if (b14 == b15) {
                            i11 = m0Var.pos;
                        }
                    }
                    i10++;
                }
                j10 += m0Var.limit - m0Var.pos;
                m0Var = m0Var.next;
                Intrinsics.checkNotNull(m0Var);
                fromIndex = j10;
            }
        }
        return -1L;
        return (i10 - i11) + j10;
    }

    @Override // wu.f
    @NotNull
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public e writeInt(int i10) {
        m0 Y = Y(4);
        byte[] bArr = Y.data;
        int i11 = Y.limit;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        Y.limit = i11 + 4;
        U(getSize() + 4);
        return this;
    }

    public boolean r(long offset, @NotNull h bytes, int bytesOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return byteCount >= 0 && offset >= 0 && ((long) byteCount) + offset <= getSize() && bytesOffset >= 0 && bytesOffset + byteCount <= bytes.I() && (byteCount == 0 || xu.a.b(this, bytes, offset, offset + 1, bytesOffset, byteCount) != -1);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        m0 m0Var = this.head;
        if (m0Var == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), m0Var.limit - m0Var.pos);
        sink.put(m0Var.data, m0Var.pos, min);
        int i10 = m0Var.pos + min;
        m0Var.pos = i10;
        this.size -= min;
        if (i10 == m0Var.limit) {
            this.head = m0Var.b();
            n0.b(m0Var);
        }
        return min;
    }

    @Override // wu.g
    public byte readByte() {
        if (getSize() == 0) {
            throw new EOFException();
        }
        m0 m0Var = this.head;
        Intrinsics.checkNotNull(m0Var);
        int i10 = m0Var.pos;
        int i11 = m0Var.limit;
        int i12 = i10 + 1;
        byte b10 = m0Var.data[i10];
        U(getSize() - 1);
        if (i12 != i11) {
            m0Var.pos = i12;
            return b10;
        }
        this.head = m0Var.b();
        n0.b(m0Var);
        return b10;
    }

    @Override // wu.g
    public void readFully(@NotNull byte[] sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int read = read(sink, i10, sink.length - i10);
            if (read == -1) {
                throw new EOFException();
            }
            i10 += read;
        }
    }

    @Override // wu.g
    public int readInt() {
        if (getSize() < 4) {
            throw new EOFException();
        }
        m0 m0Var = this.head;
        Intrinsics.checkNotNull(m0Var);
        int i10 = m0Var.pos;
        int i11 = m0Var.limit;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = m0Var.data;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        U(getSize() - 4);
        if (i14 != i11) {
            m0Var.pos = i14;
            return i15;
        }
        this.head = m0Var.b();
        n0.b(m0Var);
        return i15;
    }

    @Override // wu.g
    public long readLong() {
        if (getSize() < 8) {
            throw new EOFException();
        }
        m0 m0Var = this.head;
        Intrinsics.checkNotNull(m0Var);
        int i10 = m0Var.pos;
        int i11 = m0Var.limit;
        if (i11 - i10 < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = m0Var.data;
        int i12 = i10 + 7;
        long j10 = ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (bArr[i12] & 255);
        U(getSize() - 8);
        if (i13 != i11) {
            m0Var.pos = i13;
            return j11;
        }
        this.head = m0Var.b();
        n0.b(m0Var);
        return j11;
    }

    @Override // wu.g
    public short readShort() {
        if (getSize() < 2) {
            throw new EOFException();
        }
        m0 m0Var = this.head;
        Intrinsics.checkNotNull(m0Var);
        int i10 = m0Var.pos;
        int i11 = m0Var.limit;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = m0Var.data;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        U(getSize() - 2);
        if (i14 == i11) {
            this.head = m0Var.b();
            n0.b(m0Var);
        } else {
            m0Var.pos = i14;
        }
        return (short) i15;
    }

    @Override // wu.g
    public boolean request(long byteCount) {
        return this.size >= byteCount;
    }

    @NotNull
    public final a s(@NotNull a unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return xu.a.d(this, unsafeCursor);
    }

    @Override // wu.g
    @NotNull
    public InputStream s3() {
        return new b();
    }

    /* renamed from: size, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @Override // wu.g
    public void skip(long byteCount) {
        while (byteCount > 0) {
            m0 m0Var = this.head;
            if (m0Var == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(byteCount, m0Var.limit - m0Var.pos);
            long j10 = min;
            U(getSize() - j10);
            byteCount -= j10;
            int i10 = m0Var.pos + min;
            m0Var.pos = i10;
            if (i10 == m0Var.limit) {
                this.head = m0Var.b();
                n0.b(m0Var);
            }
        }
    }

    @Override // wu.r0
    @NotNull
    /* renamed from: timeout */
    public s0 getF34806a() {
        return s0.NONE;
    }

    @NotNull
    public String toString() {
        return W().toString();
    }

    @NotNull
    public e u0(int i10) {
        return writeInt(wu.b.h(i10));
    }

    @NotNull
    public e v0(long v5) {
        m0 Y = Y(8);
        byte[] bArr = Y.data;
        int i10 = Y.limit;
        bArr[i10] = (byte) ((v5 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((v5 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((v5 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((v5 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((v5 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((v5 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((v5 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (v5 & 255);
        Y.limit = i10 + 8;
        U(getSize() + 8);
        return this;
    }

    @Override // wu.g
    public void v1(long byteCount) {
        if (this.size < byteCount) {
            throw new EOFException();
        }
    }

    @Override // wu.f
    @NotNull
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public e writeShort(int s8) {
        m0 Y = Y(2);
        byte[] bArr = Y.data;
        int i10 = Y.limit;
        bArr[i10] = (byte) ((s8 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (s8 & 255);
        Y.limit = i10 + 2;
        U(getSize() + 2);
        return this;
    }

    @NotNull
    public byte[] x(long byteCount) {
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (getSize() < byteCount) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) byteCount];
        readFully(bArr);
        return bArr;
    }

    @NotNull
    public e x0(@NotNull String string, int beginIndex, int endIndex, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (beginIndex < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + beginIndex).toString());
        }
        if (endIndex < beginIndex) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + endIndex + " < " + beginIndex).toString());
        }
        if (endIndex > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + endIndex + " > " + string.length()).toString());
        }
        if (Intrinsics.c(charset, Charsets.UTF_8)) {
            return I0(string, beginIndex, endIndex);
        }
        String substring = string.substring(beginIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        byte[] bytes = substring.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return write(bytes, 0, bytes.length);
    }

    @Override // wu.g
    public int y0(@NotNull f0 options) {
        Intrinsics.checkNotNullParameter(options, "options");
        int j10 = xu.a.j(this, options, false, 2, null);
        if (j10 == -1) {
            return -1;
        }
        skip(options.getByteStrings()[j10].I());
        return j10;
    }

    @Override // wu.g
    public long y2(@NotNull h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return o(bytes, 0L);
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"wu/e$b", "Ljava/io/InputStream;", "", "read", "()I", "", "sink", "offset", "byteCount", "([BII)I", "available", "", "close", "()V", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends InputStream {
        public b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(e.this.getSize(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (e.this.getSize() > 0) {
                return e.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int offset, int byteCount) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return e.this.read(sink, offset, byteCount);
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int remaining = source.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            m0 Y = Y(1);
            int min = Math.min(i10, 8192 - Y.limit);
            source.get(Y.data, Y.limit, min);
            i10 -= min;
            Y.limit += min;
        }
        this.size += remaining;
        return remaining;
    }

    public int read(@NotNull byte[] sink, int offset, int byteCount) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        wu.b.b(sink.length, offset, byteCount);
        m0 m0Var = this.head;
        if (m0Var == null) {
            return -1;
        }
        int min = Math.min(byteCount, m0Var.limit - m0Var.pos);
        byte[] bArr = m0Var.data;
        int i10 = m0Var.pos;
        kotlin.collections.l.f(bArr, sink, offset, i10, i10 + min);
        m0Var.pos += min;
        U(getSize() - min);
        if (m0Var.pos == m0Var.limit) {
            this.head = m0Var.b();
            n0.b(m0Var);
        }
        return min;
    }

    @Override // wu.p0
    public void write(@NotNull e source, long byteCount) {
        m0 m0Var;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source != this) {
            wu.b.b(source.getSize(), 0L, byteCount);
            while (byteCount > 0) {
                m0 m0Var2 = source.head;
                Intrinsics.checkNotNull(m0Var2);
                int i10 = m0Var2.limit;
                Intrinsics.checkNotNull(source.head);
                if (byteCount < i10 - r1.pos) {
                    m0 m0Var3 = this.head;
                    if (m0Var3 != null) {
                        Intrinsics.checkNotNull(m0Var3);
                        m0Var = m0Var3.prev;
                    } else {
                        m0Var = null;
                    }
                    if (m0Var != null && m0Var.owner) {
                        if ((m0Var.limit + byteCount) - (m0Var.shared ? 0 : m0Var.pos) <= 8192) {
                            m0 m0Var4 = source.head;
                            Intrinsics.checkNotNull(m0Var4);
                            m0Var4.g(m0Var, (int) byteCount);
                            source.U(source.getSize() - byteCount);
                            U(getSize() + byteCount);
                            return;
                        }
                    }
                    m0 m0Var5 = source.head;
                    Intrinsics.checkNotNull(m0Var5);
                    source.head = m0Var5.e((int) byteCount);
                }
                m0 m0Var6 = source.head;
                Intrinsics.checkNotNull(m0Var6);
                long j10 = m0Var6.limit - m0Var6.pos;
                source.head = m0Var6.b();
                m0 m0Var7 = this.head;
                if (m0Var7 == null) {
                    this.head = m0Var6;
                    m0Var6.prev = m0Var6;
                    m0Var6.next = m0Var6;
                } else {
                    Intrinsics.checkNotNull(m0Var7);
                    m0 m0Var8 = m0Var7.prev;
                    Intrinsics.checkNotNull(m0Var8);
                    m0Var8.c(m0Var6).a();
                }
                source.U(source.getSize() - j10);
                U(getSize() + j10);
                byteCount -= j10;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // wu.r0
    public long read(@NotNull e sink, long byteCount) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (getSize() == 0) {
            return -1L;
        }
        if (byteCount > getSize()) {
            byteCount = getSize();
        }
        sink.write(this, byteCount);
        return byteCount;
    }
}

.class public interface abstract Lwu/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwu/r0;
.implements Ljava/nio/channels/ReadableByteChannel;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0005\n\u0002\u0008\u0002\n\u0002\u0010\n\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0012\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\'\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H&\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H&\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H&\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u001f\u0010\u001cJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008 \u0010\rJ\u000f\u0010\"\u001a\u00020!H&\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010$\u001a\u00020!2\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008$\u0010%J\u0017\u0010(\u001a\u00020\u00172\u0006\u0010\'\u001a\u00020&H&\u00a2\u0006\u0004\u0008(\u0010)J\u000f\u0010+\u001a\u00020*H&\u00a2\u0006\u0004\u0008+\u0010,J\u0017\u0010.\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020*H&\u00a2\u0006\u0004\u0008.\u0010/J\u001f\u00100\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u00080\u00101J\u0017\u00103\u001a\u00020\t2\u0006\u0010-\u001a\u000202H&\u00a2\u0006\u0004\u00083\u00104J\u000f\u00106\u001a\u000205H&\u00a2\u0006\u0004\u00086\u00107J\u0017\u00108\u001a\u0002052\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u00088\u00109J\u000f\u0010:\u001a\u000205H&\u00a2\u0006\u0004\u0008:\u00107J\u0017\u0010<\u001a\u0002052\u0006\u0010;\u001a\u00020\tH&\u00a2\u0006\u0004\u0008<\u00109J\u000f\u0010=\u001a\u00020\u0017H&\u00a2\u0006\u0004\u0008=\u0010\u0019J\u0017\u0010@\u001a\u0002052\u0006\u0010?\u001a\u00020>H&\u00a2\u0006\u0004\u0008@\u0010AJ\u0017\u0010C\u001a\u00020\t2\u0006\u0010B\u001a\u00020!H&\u00a2\u0006\u0004\u0008C\u0010DJ\'\u0010G\u001a\u00020\t2\u0006\u0010B\u001a\u00020!2\u0006\u0010E\u001a\u00020\t2\u0006\u0010F\u001a\u00020\tH&\u00a2\u0006\u0004\u0008G\u0010HJ\u0017\u0010J\u001a\u00020\t2\u0006\u0010I\u001a\u00020!H&\u00a2\u0006\u0004\u0008J\u0010DJ\u001f\u0010L\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\t2\u0006\u0010B\u001a\u00020!H&\u00a2\u0006\u0004\u0008L\u0010MJ\u000f\u0010N\u001a\u00020\u0000H&\u00a2\u0006\u0004\u0008N\u0010OJ\u000f\u0010Q\u001a\u00020PH&\u00a2\u0006\u0004\u0008Q\u0010RR\u0014\u0010T\u001a\u00020\u00038&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008S\u0010\u0005\u0082\u0001\u0002\u0003U\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006V\u00c0\u0006\u0001"
    }
    d2 = {
        "Lwu/g;",
        "Lwu/r0;",
        "Ljava/nio/channels/ReadableByteChannel;",
        "Lwu/e;",
        "O",
        "()Lwu/e;",
        "",
        "X1",
        "()Z",
        "",
        "byteCount",
        "",
        "v1",
        "(J)V",
        "request",
        "(J)Z",
        "",
        "readByte",
        "()B",
        "",
        "readShort",
        "()S",
        "i1",
        "",
        "readInt",
        "()I",
        "M2",
        "readLong",
        "()J",
        "l1",
        "h2",
        "o3",
        "skip",
        "Lwu/h;",
        "G2",
        "()Lwu/h;",
        "I1",
        "(J)Lwu/h;",
        "Lwu/f0;",
        "options",
        "y0",
        "(Lwu/f0;)I",
        "",
        "V1",
        "()[B",
        "sink",
        "readFully",
        "([B)V",
        "d0",
        "(Lwu/e;J)V",
        "Lwu/p0;",
        "K2",
        "(Lwu/p0;)J",
        "",
        "S2",
        "()Ljava/lang/String;",
        "E1",
        "(J)Ljava/lang/String;",
        "Z0",
        "limit",
        "l0",
        "B2",
        "Ljava/nio/charset/Charset;",
        "charset",
        "A2",
        "(Ljava/nio/charset/Charset;)Ljava/lang/String;",
        "bytes",
        "y2",
        "(Lwu/h;)J",
        "fromIndex",
        "toIndex",
        "g2",
        "(Lwu/h;JJ)J",
        "targetBytes",
        "p1",
        "offset",
        "b1",
        "(JLwu/h;)Z",
        "peek",
        "()Lwu/g;",
        "Ljava/io/InputStream;",
        "s3",
        "()Ljava/io/InputStream;",
        "k",
        "buffer",
        "Lwu/l0;",
        "okio"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract A2(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .param p1    # Ljava/nio/charset/Charset;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract B2()I
.end method

.method public abstract E1(J)Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract G2()Lwu/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract I1(J)Lwu/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract K2(Lwu/p0;)J
    .param p1    # Lwu/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract M2()I
.end method

.method public abstract O()Lwu/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract S2()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract V1()[B
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract X1()Z
.end method

.method public abstract Z0()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract b1(JLwu/h;)Z
    .param p3    # Lwu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract d0(Lwu/e;J)V
    .param p1    # Lwu/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract g2(Lwu/h;JJ)J
    .param p1    # Lwu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract h2()J
.end method

.method public abstract i1()S
.end method

.method public abstract k()Lwu/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract l0(J)Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract l1()J
.end method

.method public abstract o3()J
.end method

.method public abstract p1(Lwu/h;)J
    .param p1    # Lwu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract peek()Lwu/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract readByte()B
.end method

.method public abstract readFully([B)V
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract readInt()I
.end method

.method public abstract readLong()J
.end method

.method public abstract readShort()S
.end method

.method public abstract request(J)Z
.end method

.method public abstract s3()Ljava/io/InputStream;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract skip(J)V
.end method

.method public abstract v1(J)V
.end method

.method public abstract y0(Lwu/f0;)I
    .param p1    # Lwu/f0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract y2(Lwu/h;)J
    .param p1    # Lwu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

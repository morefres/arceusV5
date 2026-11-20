.class public final Lwm/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0011\u0010\u000c\u001a\u00020\u0008*\u00020\u0005\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lwu/f;",
        "",
        "str",
        "d",
        "(Lwu/f;Ljava/lang/String;)Lwu/f;",
        "Lwu/g;",
        "b",
        "(Lwu/g;)Ljava/lang/String;",
        "Lwu/h;",
        "bytes",
        "c",
        "(Lwu/f;Lwu/h;)Lwu/f;",
        "a",
        "(Lwu/g;)Lwu/h;",
        "wf1-workflow-core"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lwu/g;)Lwu/h;
    .locals 2
    .param p0    # Lwu/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lwu/g;->readInt()I

    move-result v0

    int-to-long v0, v0

    invoke-interface {p0, v0, v1}, Lwu/g;->I1(J)Lwu/h;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lwu/g;)Ljava/lang/String;
    .locals 1
    .param p0    # Lwu/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lwm/j;->a(Lwu/g;)Lwu/h;

    move-result-object p0

    invoke-virtual {p0}, Lwu/h;->P()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lwu/f;Lwu/h;)Lwu/f;
    .locals 1
    .param p0    # Lwu/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lwu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lwu/h;->I()I

    move-result v0

    invoke-interface {p0, v0}, Lwu/f;->writeInt(I)Lwu/f;

    move-result-object v0

    invoke-interface {v0, p1}, Lwu/f;->s2(Lwu/h;)Lwu/f;

    return-object p0
.end method

.method public static final d(Lwu/f;Ljava/lang/String;)Lwu/f;
    .locals 1
    .param p0    # Lwu/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "str"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lwu/h;->d:Lwu/h$a;

    invoke-virtual {v0, p1}, Lwu/h$a;->d(Ljava/lang/String;)Lwu/h;

    move-result-object p1

    invoke-static {p0, p1}, Lwm/j;->c(Lwu/f;Lwu/h;)Lwu/f;

    move-result-object p0

    return-object p0
.end method

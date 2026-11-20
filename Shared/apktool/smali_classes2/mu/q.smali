.class public final synthetic Lmu/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a9\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a-\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\u0005\u001a-\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u0005\u00a8\u0006\u000e"
    }
    d2 = {
        "T",
        "Lmu/h;",
        "",
        "timeoutMillis",
        "b",
        "(Lmu/h;J)Lmu/h;",
        "Lkotlin/Function1;",
        "timeoutMillisSelector",
        "d",
        "(Lmu/h;Lkotlin/jvm/functions/Function1;)Lmu/h;",
        "Lkotlin/time/a;",
        "timeout",
        "e",
        "f",
        "kotlinx-coroutines-core"
    }
    k = 0x5
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
    xs = "kotlinx/coroutines/flow/FlowKt"
.end annotation


# direct methods
.method public static synthetic a(JLjava/lang/Object;)J
    .locals 0

    invoke-static {p0, p1, p2}, Lmu/q;->c(JLjava/lang/Object;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final b(Lmu/h;J)Lmu/h;
    .locals 2
    .param p0    # Lmu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lmu/h<",
            "+TT;>;J)",
            "Lmu/h<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_1

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lmu/p;

    invoke-direct {v0, p1, p2}, Lmu/p;-><init>(J)V

    invoke-static {p0, v0}, Lmu/q;->d(Lmu/h;Lkotlin/jvm/functions/Function1;)Lmu/h;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Debounce timeout should not be negative"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final c(JLjava/lang/Object;)J
    .locals 0

    return-wide p0
.end method

.method public static final d(Lmu/h;Lkotlin/jvm/functions/Function1;)Lmu/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lmu/h<",
            "+TT;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Ljava/lang/Long;",
            ">;)",
            "Lmu/h<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lmu/q$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lmu/q$a;-><init>(Lkotlin/jvm/functions/Function1;Lmu/h;Lmt/b;)V

    invoke-static {v0}, Lnu/o;->b(Lyt/n;)Lmu/h;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lmu/h;J)Lmu/h;
    .locals 0
    .param p0    # Lmu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lmu/h<",
            "+TT;>;J)",
            "Lmu/h<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p0, p1, p2}, Lmu/q;->f(Lmu/h;J)Lmu/h;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lmu/h;J)Lmu/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lmu/h<",
            "+TT;>;J)",
            "Lmu/h<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lmu/q$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p0, v1}, Lmu/q$b;-><init>(JLmu/h;Lmt/b;)V

    invoke-static {v0}, Lnu/o;->b(Lyt/n;)Lmu/h;

    move-result-object p0

    return-object p0
.end method

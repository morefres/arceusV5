.class public final synthetic Lmu/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0018\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\u0008\u00030\u0000H\u0086@\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a%\u0010\u0008\u001a\u00020\u0007\"\u0004\u0008\u0000\u0010\u0004*\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001aD\u0010\u000e\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0004*\u0008\u0012\u0004\u0012\u00028\u00000\u00002\"\u0010\r\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\nH\u0086@\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a.\u0010\u0012\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0004*\u0008\u0012\u0004\u0012\u00028\u00000\u00102\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0000H\u0086@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lmu/h;",
        "",
        "a",
        "(Lmu/h;Lmt/b;)Ljava/lang/Object;",
        "T",
        "Lju/p0;",
        "scope",
        "Lju/d2;",
        "d",
        "(Lmu/h;Lju/p0;)Lju/d2;",
        "Lkotlin/Function2;",
        "Lmt/b;",
        "",
        "action",
        "b",
        "(Lmu/h;Lkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;",
        "Lmu/i;",
        "flow",
        "c",
        "(Lmu/i;Lmu/h;Lmt/b;)Ljava/lang/Object;",
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
.method public static final a(Lmu/h;Lmt/b;)Ljava/lang/Object;
    .locals 1
    .param p0    # Lmu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lmt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmu/h<",
            "*>;",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    sget-object v0, Lnu/s;->a:Lnu/s;

    invoke-interface {p0, v0, p1}, Lmu/h;->collect(Lmu/i;Lmt/b;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final b(Lmu/h;Lkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;
    .locals 2
    .param p0    # Lmu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lmt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lmu/h<",
            "+TT;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-TT;-",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0, p1}, Lmu/j;->A(Lmu/h;Lkotlin/jvm/functions/Function2;)Lmu/h;

    move-result-object p0

    const/4 p1, 0x0

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p0, v1, p1, v0, p1}, Lmu/j;->c(Lmu/h;ILlu/a;ILjava/lang/Object;)Lmu/h;

    move-result-object p0

    invoke-static {p0, p2}, Lmu/j;->i(Lmu/h;Lmt/b;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final c(Lmu/i;Lmu/h;Lmt/b;)Ljava/lang/Object;
    .locals 0
    .param p0    # Lmu/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lmu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lmt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lmu/i<",
            "-TT;>;",
            "Lmu/h<",
            "+TT;>;",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0}, Lmu/j;->r(Lmu/i;)V

    invoke-interface {p1, p0, p2}, Lmu/h;->collect(Lmu/i;Lmt/b;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final d(Lmu/h;Lju/p0;)Lju/d2;
    .locals 6
    .param p0    # Lmu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lju/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lmu/h<",
            "+TT;>;",
            "Lju/p0;",
            ")",
            "Lju/d2;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v3, Lmu/m$a;

    const/4 v0, 0x0

    invoke-direct {v3, p0, v0}, Lmu/m$a;-><init>(Lmu/h;Lmt/b;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lju/i;->d(Lju/p0;Lkotlin/coroutines/CoroutineContext;Lju/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lju/d2;

    move-result-object p0

    return-object p0
.end method

.class public final Liv/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u0001\n\u0002\u0008\u0003\u001a$\u0010\u0003\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a(\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002H\u0087@\u00a2\u0006\u0004\u0008\u0005\u0010\u0004\u001a\u001a\u0010\u0007\u001a\u00020\u0006*\u0008\u0012\u0004\u0012\u00020\u00060\u0002H\u0087@\u00a2\u0006\u0004\u0008\u0007\u0010\u0004\u001a&\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008\"\u0004\u0008\u0000\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@\u00a2\u0006\u0004\u0008\t\u0010\u0004\u001a\u0014\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0080@\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "",
        "T",
        "Liv/d;",
        "a",
        "(Liv/d;Lmt/b;)Ljava/lang/Object;",
        "b",
        "",
        "d",
        "Liv/x;",
        "c",
        "",
        "",
        "e",
        "(Ljava/lang/Throwable;Lmt/b;)Ljava/lang/Object;",
        "retrofit"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Liv/d;Lmt/b;)Ljava/lang/Object;
    .locals 3
    .param p0    # Liv/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lmt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Liv/d<",
            "TT;>;",
            "Lmt/b<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance v0, Lju/p;

    invoke-static {p1}, Lnt/b;->c(Lmt/b;)Lmt/b;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lju/p;-><init>(Lmt/b;I)V

    invoke-virtual {v0}, Lju/p;->F()V

    new-instance v1, Liv/p$a;

    invoke-direct {v1, p0}, Liv/p$a;-><init>(Liv/d;)V

    invoke-interface {v0, v1}, Lju/n;->k(Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Liv/p$b;

    invoke-direct {v1, v0}, Liv/p$b;-><init>(Lju/n;)V

    invoke-interface {p0, v1}, Liv/d;->F(Liv/f;)V

    invoke-virtual {v0}, Lju/p;->z()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lot/h;->c(Lmt/b;)V

    :cond_0
    return-object p0
.end method

.method public static final b(Liv/d;Lmt/b;)Ljava/lang/Object;
    .locals 3
    .param p0    # Liv/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lmt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Liv/d<",
            "TT;>;",
            "Lmt/b<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance v0, Lju/p;

    invoke-static {p1}, Lnt/b;->c(Lmt/b;)Lmt/b;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lju/p;-><init>(Lmt/b;I)V

    invoke-virtual {v0}, Lju/p;->F()V

    new-instance v1, Liv/p$c;

    invoke-direct {v1, p0}, Liv/p$c;-><init>(Liv/d;)V

    invoke-interface {v0, v1}, Lju/n;->k(Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Liv/p$d;

    invoke-direct {v1, v0}, Liv/p$d;-><init>(Lju/n;)V

    invoke-interface {p0, v1}, Liv/d;->F(Liv/f;)V

    invoke-virtual {v0}, Lju/p;->z()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lot/h;->c(Lmt/b;)V

    :cond_0
    return-object p0
.end method

.method public static final c(Liv/d;Lmt/b;)Ljava/lang/Object;
    .locals 3
    .param p0    # Liv/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lmt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Liv/d<",
            "TT;>;",
            "Lmt/b<",
            "-",
            "Liv/x<",
            "TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance v0, Lju/p;

    invoke-static {p1}, Lnt/b;->c(Lmt/b;)Lmt/b;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lju/p;-><init>(Lmt/b;I)V

    invoke-virtual {v0}, Lju/p;->F()V

    new-instance v1, Liv/p$e;

    invoke-direct {v1, p0}, Liv/p$e;-><init>(Liv/d;)V

    invoke-interface {v0, v1}, Lju/n;->k(Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Liv/p$f;

    invoke-direct {v1, v0}, Liv/p$f;-><init>(Lju/n;)V

    invoke-interface {p0, v1}, Liv/d;->F(Liv/f;)V

    invoke-virtual {v0}, Lju/p;->z()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lot/h;->c(Lmt/b;)V

    :cond_0
    return-object p0
.end method

.method public static final d(Liv/d;Lmt/b;)Ljava/lang/Object;
    .locals 1
    .param p0    # Liv/d;
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
            "Liv/d<",
            "Lkotlin/Unit;",
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

    const-string v0, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Liv/p;->b(Liv/d;Lmt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/lang/Throwable;Lmt/b;)Ljava/lang/Object;
    .locals 4
    .param p0    # Ljava/lang/Throwable;
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
            "Ljava/lang/Throwable;",
            "Lmt/b<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p1, Liv/p$g;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Liv/p$g;

    iget v1, v0, Liv/p$g;->v:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Liv/p$g;->v:I

    goto :goto_0

    :cond_0
    new-instance v0, Liv/p$g;

    invoke-direct {v0, p1}, Liv/p$g;-><init>(Lmt/b;)V

    :goto_0
    iget-object p1, v0, Liv/p$g;->u:Ljava/lang/Object;

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Liv/p$g;->v:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    iget-object p0, v0, Liv/p$g;->t:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Throwable;

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    iput-object p0, v0, Liv/p$g;->t:Ljava/lang/Object;

    iput v3, v0, Liv/p$g;->v:I

    invoke-static {}, Lju/g1;->a()Lju/l0;

    move-result-object p1

    invoke-interface {v0}, Lmt/b;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    new-instance v3, Liv/p$h;

    invoke-direct {v3, v0, p0}, Liv/p$h;-><init>(Lmt/b;Ljava/lang/Throwable;)V

    invoke-virtual {p1, v2, v3}, Lju/l0;->y(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_3

    invoke-static {v0}, Lot/h;->c(Lmt/b;)V

    :cond_3
    if-ne p0, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    new-instance p0, Lgt/d;

    invoke-direct {p0}, Lgt/d;-><init>()V

    throw p0
.end method

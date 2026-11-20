.class public final Lbi/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lql/v;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbi/k$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001e\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u000c0\u0008H\u0096@\u00a2\u0006\u0004\u0008\u0007\u0010\u000eJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u0013*\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0012J\u0013\u0010\u0017\u001a\u00020\u0010*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lbi/k;",
        "Lql/v;",
        "Lda/a;",
        "achievementsClient",
        "<init>",
        "(Lda/a;)V",
        "Lql/a;",
        "a",
        "Lgt/n;",
        "",
        "b",
        "(Lql/a;Lmt/b;)Ljava/lang/Object;",
        "",
        "Lql/u;",
        "(Lmt/b;)Ljava/lang/Object;",
        "Lcom/google/android/gms/games/achievement/Achievement;",
        "Lbi/l;",
        "h",
        "(Lcom/google/android/gms/games/achievement/Achievement;)Ljava/lang/String;",
        "Lbi/j;",
        "g",
        "(Lql/a;)Ljava/lang/String;",
        "f",
        "i",
        "Lda/a;",
        "NativeShell_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Lbi/k$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lie/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lie/q<",
            "Lbi/l;",
            "Lbi/j;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lda/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lbi/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbi/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lbi/k;->b:Lbi/k$a;

    new-instance v0, Lie/q$a;

    invoke-direct {v0}, Lie/q$a;-><init>()V

    const-string v1, "AchievementOneNameManyFaces"

    invoke-static {v1}, Lbi/l;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbi/l;->a(Ljava/lang/String;)Lbi/l;

    move-result-object v1

    const-string v2, "CgkIyM-UotMBEAIQAg"

    invoke-static {v2}, Lbi/j;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lbi/j;->a(Ljava/lang/String;)Lbi/j;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lie/q$a;->m(Ljava/lang/Object;Ljava/lang/Object;)Lie/q$a;

    move-result-object v0

    invoke-static {}, Lbi/b;->c()Lbi/a;

    move-result-object v1

    invoke-virtual {v1}, Lbi/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbi/l;->a(Ljava/lang/String;)Lbi/l;

    move-result-object v1

    invoke-static {}, Lbi/b;->c()Lbi/a;

    move-result-object v2

    invoke-virtual {v2}, Lbi/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lbi/j;->a(Ljava/lang/String;)Lbi/j;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lie/q$a;->m(Ljava/lang/Object;Ljava/lang/Object;)Lie/q$a;

    move-result-object v0

    invoke-static {}, Lbi/b;->b()Lbi/a;

    move-result-object v1

    invoke-virtual {v1}, Lbi/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbi/l;->a(Ljava/lang/String;)Lbi/l;

    move-result-object v1

    invoke-static {}, Lbi/b;->b()Lbi/a;

    move-result-object v2

    invoke-virtual {v2}, Lbi/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lbi/j;->a(Ljava/lang/String;)Lbi/j;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lie/q$a;->m(Ljava/lang/Object;Ljava/lang/Object;)Lie/q$a;

    move-result-object v0

    invoke-static {}, Lbi/b;->d()Lbi/a;

    move-result-object v1

    invoke-virtual {v1}, Lbi/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbi/l;->a(Ljava/lang/String;)Lbi/l;

    move-result-object v1

    invoke-static {}, Lbi/b;->d()Lbi/a;

    move-result-object v2

    invoke-virtual {v2}, Lbi/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lbi/j;->a(Ljava/lang/String;)Lbi/j;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lie/q$a;->m(Ljava/lang/Object;Ljava/lang/Object;)Lie/q$a;

    move-result-object v0

    const-string v1, "AchievementMarathon"

    invoke-static {v1}, Lbi/l;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbi/l;->a(Ljava/lang/String;)Lbi/l;

    move-result-object v1

    const-string v2, "CgkIyM-UotMBEAIQBg"

    invoke-static {v2}, Lbi/j;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lbi/j;->a(Ljava/lang/String;)Lbi/j;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lie/q$a;->m(Ljava/lang/Object;Ljava/lang/Object;)Lie/q$a;

    move-result-object v0

    const-string v1, "AchievementFoursCompany"

    invoke-static {v1}, Lbi/l;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbi/l;->a(Ljava/lang/String;)Lbi/l;

    move-result-object v1

    const-string v2, "CgkIyM-UotMBEAIQBw"

    invoke-static {v2}, Lbi/j;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lbi/j;->a(Ljava/lang/String;)Lbi/j;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lie/q$a;->m(Ljava/lang/Object;Ljava/lang/Object;)Lie/q$a;

    move-result-object v0

    const-string v1, "AchievementPollster"

    invoke-static {v1}, Lbi/l;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbi/l;->a(Ljava/lang/String;)Lbi/l;

    move-result-object v1

    const-string v2, "CgkIyM-UotMBEAIQCA"

    invoke-static {v2}, Lbi/j;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lbi/j;->a(Ljava/lang/String;)Lbi/j;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lie/q$a;->m(Ljava/lang/Object;Ljava/lang/Object;)Lie/q$a;

    move-result-object v0

    const-string v1, "AchievementScout"

    invoke-static {v1}, Lbi/l;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbi/l;->a(Ljava/lang/String;)Lbi/l;

    move-result-object v1

    const-string v2, "CgkIyM-UotMBEAIQCQ"

    invoke-static {v2}, Lbi/j;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lbi/j;->a(Ljava/lang/String;)Lbi/j;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lie/q$a;->m(Ljava/lang/Object;Ljava/lang/Object;)Lie/q$a;

    move-result-object v0

    const-string v1, "AchievementExplorer"

    invoke-static {v1}, Lbi/l;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbi/l;->a(Ljava/lang/String;)Lbi/l;

    move-result-object v1

    const-string v2, "CgkIyM-UotMBEAIQCg"

    invoke-static {v2}, Lbi/j;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lbi/j;->a(Ljava/lang/String;)Lbi/j;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lie/q$a;->m(Ljava/lang/Object;Ljava/lang/Object;)Lie/q$a;

    move-result-object v0

    const-string v1, "AchievementTrailblazer"

    invoke-static {v1}, Lbi/l;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbi/l;->a(Ljava/lang/String;)Lbi/l;

    move-result-object v1

    const-string v2, "CgkIyM-UotMBEAIQCw"

    invoke-static {v2}, Lbi/j;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lbi/j;->a(Ljava/lang/String;)Lbi/j;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lie/q$a;->m(Ljava/lang/Object;Ljava/lang/Object;)Lie/q$a;

    move-result-object v0

    const-string v1, "AchievementStrengthInNumbers"

    invoke-static {v1}, Lbi/l;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbi/l;->a(Ljava/lang/String;)Lbi/l;

    move-result-object v1

    const-string v2, "CgkIyM-UotMBEAIQDA"

    invoke-static {v2}, Lbi/j;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lbi/j;->a(Ljava/lang/String;)Lbi/j;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lie/q$a;->m(Ljava/lang/Object;Ljava/lang/Object;)Lie/q$a;

    move-result-object v0

    invoke-virtual {v0}, Lie/q$a;->k()Lie/q;

    move-result-object v0

    sput-object v0, Lbi/k;->c:Lie/q;

    return-void
.end method

.method public constructor <init>(Lda/a;)V
    .locals 1
    .param p1    # Lda/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "achievementsClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbi/k;->a:Lda/a;

    return-void
.end method

.method public static final synthetic c(Lbi/k;)Lda/a;
    .locals 0

    iget-object p0, p0, Lbi/k;->a:Lda/a;

    return-object p0
.end method

.method public static final synthetic d(Lbi/k;Lql/a;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lbi/k;->g(Lql/a;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lbi/k;Lcom/google/android/gms/games/achievement/Achievement;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lbi/k;->h(Lcom/google/android/gms/games/achievement/Achievement;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lmt/b;)Ljava/lang/Object;
    .locals 5
    .param p1    # Lmt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmt/b<",
            "-",
            "Lgt/n<",
            "+",
            "Ljava/util/List<",
            "Lql/u;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p1, Lbi/k$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lbi/k$d;

    iget v1, v0, Lbi/k$d;->v:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lbi/k$d;->v:I

    goto :goto_0

    :cond_0
    new-instance v0, Lbi/k$d;

    invoke-direct {v0, p0, p1}, Lbi/k$d;-><init>(Lbi/k;Lmt/b;)V

    :goto_0
    iget-object p1, v0, Lbi/k$d;->t:Ljava/lang/Object;

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lbi/k$d;->v:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    invoke-static {}, Lju/g1;->b()Lju/l0;

    move-result-object p1

    new-instance v2, Lbi/k$e;

    const/4 v4, 0x0

    invoke-direct {v2, p0, v4}, Lbi/k$e;-><init>(Lbi/k;Lmt/b;)V

    iput v3, v0, Lbi/k$d;->v:I

    invoke-static {p1, v2, v0}, Lju/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lgt/n;

    invoke-virtual {p1}, Lgt/n;->j()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Lql/a;Lmt/b;)Ljava/lang/Object;
    .locals 5
    .param p1    # Lql/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lmt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lql/a;",
            "Lmt/b<",
            "-",
            "Lgt/n<",
            "Ljava/lang/Boolean;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p2, Lbi/k$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lbi/k$b;

    iget v1, v0, Lbi/k$b;->w:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lbi/k$b;->w:I

    goto :goto_0

    :cond_0
    new-instance v0, Lbi/k$b;

    invoke-direct {v0, p0, p2}, Lbi/k$b;-><init>(Lbi/k;Lmt/b;)V

    :goto_0
    iget-object p2, v0, Lbi/k$b;->u:Ljava/lang/Object;

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lbi/k$b;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lbi/k$b;->t:Ljava/lang/Object;

    check-cast p1, Lql/a;

    invoke-static {p2}, Lgt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lgt/o;->b(Ljava/lang/Object;)V

    invoke-static {}, Lju/g1;->b()Lju/l0;

    move-result-object p2

    new-instance v2, Lbi/k$c;

    const/4 v4, 0x0

    invoke-direct {v2, p0, p1, v4}, Lbi/k$c;-><init>(Lbi/k;Lql/a;Lmt/b;)V

    invoke-static {p1}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lbi/k$b;->t:Ljava/lang/Object;

    iput v3, v0, Lbi/k$b;->w:I

    invoke-static {p2, v2, v0}, Lju/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lgt/n;

    invoke-virtual {p2}, Lgt/n;->j()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lcom/google/android/gms/games/achievement/Achievement;)Ljava/lang/String;
    .locals 1

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->F0()Ljava/lang/String;

    move-result-object p1

    const-string v0, "getAchievementId(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lbi/j;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final g(Lql/a;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lbi/k;->c:Lie/q;

    invoke-virtual {p0, p1}, Lbi/k;->i(Lql/a;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lbi/l;->a(Ljava/lang/String;)Lbi/l;

    move-result-object p1

    invoke-virtual {v0, p1}, Lie/u;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbi/j;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lbi/j;->g()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final h(Lcom/google/android/gms/games/achievement/Achievement;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lbi/k;->c:Lie/q;

    invoke-virtual {v0}, Lie/q;->r()Lie/q;

    move-result-object v0

    invoke-virtual {p0, p1}, Lbi/k;->f(Lcom/google/android/gms/games/achievement/Achievement;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lbi/j;->a(Ljava/lang/String;)Lbi/j;

    move-result-object p1

    invoke-virtual {v0, p1}, Lie/u;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbi/l;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lbi/l;->g()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final i(Lql/a;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Lql/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lbi/l;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

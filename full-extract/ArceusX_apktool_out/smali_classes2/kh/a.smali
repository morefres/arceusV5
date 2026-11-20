.class public interface abstract Lkh/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkh/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008g\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\u0010\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001e\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001e\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@\u00a2\u0006\u0004\u0008\n\u0010\tJ$\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000c\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00070\u000b\"\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ$\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u000c\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00070\u000b\"\u00020\u0007H\u0096@\u00a2\u0006\u0004\u0008\u0011\u0010\u000fJ\u001e\u0010\u0012\u001a\u00020\r2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\r2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0004\u0008\u0018\u0010\u0017\u00a8\u0006\u0019\u00c0\u0006\u0003"
    }
    d2 = {
        "Lkh/a;",
        "",
        "",
        "g",
        "(Lmt/b;)Ljava/lang/Object;",
        "batchSize",
        "",
        "Llh/a;",
        "c",
        "(ILmt/b;)Ljava/lang/Object;",
        "h",
        "",
        "events",
        "",
        "d",
        "([Llh/a;Lmt/b;)Ljava/lang/Object;",
        "",
        "k",
        "a",
        "(Ljava/util/List;Lmt/b;)Ljava/lang/Object;",
        "j",
        "event",
        "i",
        "(Llh/a;Lmt/b;)Ljava/lang/Object;",
        "l",
        "database_googleProdRelease"
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
.field public static final a:Lkh/a$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lkh/a$a;->a:Lkh/a$a;

    sput-object v0, Lkh/a;->a:Lkh/a$a;

    return-void
.end method

.method public static synthetic b(Lkh/a;ILmt/b;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkh/a;",
            "I",
            "Lmt/b<",
            "-",
            "Ljava/util/List<",
            "Llh/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkh/a$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lkh/a$c;-><init>(Lkh/a;ILmt/b;)V

    const-string p0, "AnalyticEventDao"

    invoke-static {p0, v0, p2}, Lkh/h;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lmt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkh/a;Llh/a;Lmt/b;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkh/a;",
            "Llh/a;",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkh/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lkh/a$b;-><init>(Lkh/a;Llh/a;Lmt/b;)V

    const-string p0, "AnalyticEventDao"

    invoke-static {p0, v0, p2}, Lkh/h;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lmt/b;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic f(Lkh/a;[Llh/a;Lmt/b;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkh/a;",
            "[",
            "Llh/a;",
            "Lmt/b<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkh/a$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lkh/a$d;-><init>(Lkh/a;[Llh/a;Lmt/b;)V

    const-string p0, "AnalyticEventDao"

    invoke-static {p0, v0, p2}, Lkh/h;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lmt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lkh/a;Ljava/util/List;Lmt/b;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkh/a;",
            "Ljava/util/List<",
            "Llh/a;",
            ">;",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkh/a$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lkh/a$e;-><init>(Lkh/a;Ljava/util/List;Lmt/b;)V

    const-string p0, "AnalyticEventDao"

    invoke-static {p0, v0, p2}, Lkh/h;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lmt/b;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public abstract a(Ljava/util/List;Lmt/b;)Ljava/lang/Object;
    .param p1    # Ljava/util/List;
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
            "Ljava/util/List<",
            "Llh/a;",
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
.end method

.method public abstract c(ILmt/b;)Ljava/lang/Object;
    .param p2    # Lmt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lmt/b<",
            "-",
            "Ljava/util/List<",
            "Llh/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract d([Llh/a;Lmt/b;)Ljava/lang/Object;
    .param p1    # [Llh/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lmt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Llh/a;",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract g(Lmt/b;)Ljava/lang/Object;
    .param p1    # Lmt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmt/b<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public h(ILmt/b;)Ljava/lang/Object;
    .locals 0
    .param p2    # Lmt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lmt/b<",
            "-",
            "Ljava/util/List<",
            "Llh/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0, p1, p2}, Lkh/a;->b(Lkh/a;ILmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract i(Llh/a;Lmt/b;)Ljava/lang/Object;
    .param p1    # Llh/a;
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
            "Llh/a;",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public j(Ljava/util/List;Lmt/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/util/List;
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
            "Ljava/util/List<",
            "Llh/a;",
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

    invoke-static {p0, p1, p2}, Lkh/a;->m(Lkh/a;Ljava/util/List;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public k([Llh/a;Lmt/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # [Llh/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lmt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Llh/a;",
            "Lmt/b<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0, p1, p2}, Lkh/a;->f(Lkh/a;[Llh/a;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public l(Llh/a;Lmt/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Llh/a;
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
            "Llh/a;",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0, p1, p2}, Lkh/a;->e(Lkh/a;Llh/a;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

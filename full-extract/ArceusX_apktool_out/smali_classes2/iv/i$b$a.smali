.class public Liv/i$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Liv/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liv/i$b;->F(Liv/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Liv/f<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Liv/f;

.field public final synthetic b:Liv/i$b;


# direct methods
.method public constructor <init>(Liv/i$b;Liv/f;)V
    .locals 0

    iput-object p1, p0, Liv/i$b$a;->b:Liv/i$b;

    iput-object p2, p0, Liv/i$b$a;->a:Liv/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic c(Liv/i$b$a;Liv/f;Ljava/lang/Throwable;)V
    .locals 0

    iget-object p0, p0, Liv/i$b$a;->b:Liv/i$b;

    invoke-interface {p1, p0, p2}, Liv/f;->a(Liv/d;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic d(Liv/i$b$a;Liv/f;Liv/x;)V
    .locals 1

    iget-object v0, p0, Liv/i$b$a;->b:Liv/i$b;

    iget-object v0, v0, Liv/i$b;->b:Liv/d;

    invoke-interface {v0}, Liv/d;->isCanceled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Liv/i$b$a;->b:Liv/i$b;

    new-instance p2, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p0, p2}, Liv/f;->a(Liv/d;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object p0, p0, Liv/i$b$a;->b:Liv/i$b;

    invoke-interface {p1, p0, p2}, Liv/f;->b(Liv/d;Liv/x;)V

    return-void
.end method


# virtual methods
.method public a(Liv/d;Ljava/lang/Throwable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liv/d<",
            "TT;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    iget-object p1, p0, Liv/i$b$a;->b:Liv/i$b;

    iget-object p1, p1, Liv/i$b;->a:Ljava/util/concurrent/Executor;

    iget-object v0, p0, Liv/i$b$a;->a:Liv/f;

    new-instance v1, Liv/k;

    invoke-direct {v1, p0, v0, p2}, Liv/k;-><init>(Liv/i$b$a;Liv/f;Ljava/lang/Throwable;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(Liv/d;Liv/x;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liv/d<",
            "TT;>;",
            "Liv/x<",
            "TT;>;)V"
        }
    .end annotation

    iget-object p1, p0, Liv/i$b$a;->b:Liv/i$b;

    iget-object p1, p1, Liv/i$b;->a:Ljava/util/concurrent/Executor;

    iget-object v0, p0, Liv/i$b$a;->a:Liv/f;

    new-instance v1, Liv/j;

    invoke-direct {v1, p0, v0, p2}, Liv/j;-><init>(Liv/i$b$a;Liv/f;Liv/x;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

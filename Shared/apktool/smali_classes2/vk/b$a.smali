.class public Lvk/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Liv/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvk/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Liv/f<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:Liv/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Liv/f<",
            "TT;>;"
        }
    .end annotation
.end field

.field public b:Z

.field public final synthetic c:Lvk/b;


# direct methods
.method public constructor <init>(Lvk/b;Liv/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liv/f<",
            "TT;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lvk/b$a;-><init>(Lvk/b;Liv/f;Z)V

    return-void
.end method

.method public constructor <init>(Lvk/b;Liv/f;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liv/f<",
            "TT;>;Z)V"
        }
    .end annotation

    .line 2
    iput-object p1, p0, Lvk/b$a;->c:Lvk/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lvk/b$a;->a:Liv/f;

    .line 4
    iput-boolean p3, p0, Lvk/b$a;->b:Z

    return-void
.end method

.method public static bridge synthetic c(Lvk/b$a;)Liv/f;
    .locals 0

    iget-object p0, p0, Lvk/b$a;->a:Liv/f;

    return-object p0
.end method


# virtual methods
.method public a(Liv/d;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liv/d<",
            "TT;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    iget-object p1, p0, Lvk/b$a;->c:Lvk/b;

    iget-object p1, p1, Lvk/b;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lvk/b$a$b;

    invoke-direct {v0, p0, p2}, Lvk/b$a$b;-><init>(Lvk/b$a;Ljava/lang/Throwable;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(Liv/d;Liv/x;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liv/d<",
            "TT;>;",
            "Liv/x<",
            "TT;>;)V"
        }
    .end annotation

    invoke-virtual {p2}, Liv/x;->b()I

    move-result p1

    const/16 v0, 0x193

    if-ne p1, v0, :cond_0

    invoke-virtual {p2}, Liv/x;->f()Lokhttp3/Headers;

    move-result-object p1

    const-string v0, "X-CSRF-TOKEN"

    invoke-virtual {p1, v0}, Lokhttp3/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lvk/b$a;->b:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lvk/b$a;->c:Lvk/b;

    iget-object p1, p1, Lvk/b;->b:Liv/d;

    invoke-interface {p1}, Liv/d;->clone()Liv/d;

    move-result-object p1

    new-instance p2, Lvk/b$a;

    iget-object v0, p0, Lvk/b$a;->c:Lvk/b;

    iget-object v1, p0, Lvk/b$a;->a:Liv/f;

    const/4 v2, 0x1

    invoke-direct {p2, v0, v1, v2}, Lvk/b$a;-><init>(Lvk/b;Liv/f;Z)V

    invoke-interface {p1, p2}, Liv/d;->F(Liv/f;)V

    return-void

    :cond_0
    iget-object p1, p0, Lvk/b$a;->c:Lvk/b;

    iget-object p1, p1, Lvk/b;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lvk/b$a$a;

    invoke-direct {v0, p0, p2}, Lvk/b$a$a;-><init>(Lvk/b$a;Liv/x;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.class public Lev/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Lev/i;

.field public final b:Lev/c;


# direct methods
.method public constructor <init>(Lev/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lev/a;->b:Lev/c;

    new-instance p1, Lev/i;

    invoke-direct {p1}, Lev/i;-><init>()V

    iput-object p1, p0, Lev/a;->a:Lev/i;

    return-void
.end method


# virtual methods
.method public a(Lev/n;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p1, p2}, Lev/h;->a(Lev/n;Ljava/lang/Object;)Lev/h;

    move-result-object p1

    iget-object p2, p0, Lev/a;->a:Lev/i;

    invoke-virtual {p2, p1}, Lev/i;->a(Lev/h;)V

    iget-object p1, p0, Lev/a;->b:Lev/c;

    invoke-virtual {p1}, Lev/c;->e()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, Lev/a;->a:Lev/i;

    invoke-virtual {v0}, Lev/i;->b()Lev/h;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lev/a;->b:Lev/c;

    invoke-virtual {v1, v0}, Lev/c;->g(Lev/h;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No pending post available"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.class public abstract Lih/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lih/b$c;
    }
.end annotation


# instance fields
.field public a:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lih/c;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lih/b$c;

.field public c:Landroid/os/Handler;

.field public d:Lih/a;

.field public e:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lih/b$c;->a:Lih/b$c;

    iput-object v0, p0, Lih/b;->b:Lih/b$c;

    new-instance v0, Lih/b$a;

    invoke-direct {v0, p0}, Lih/b$a;-><init>(Lih/b;)V

    iput-object v0, p0, Lih/b;->d:Lih/a;

    new-instance v0, Lih/b$b;

    invoke-direct {v0, p0}, Lih/b$b;-><init>(Lih/b;)V

    iput-object v0, p0, Lih/b;->e:Ljava/lang/Runnable;

    new-instance v0, Ljava/util/concurrent/ArrayBlockingQueue;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lih/b;->a:Ljava/util/Queue;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Landroid/os/Looper;->prepare()V

    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lih/b;->c:Landroid/os/Handler;

    return-void
.end method

.method public static bridge synthetic a(Lih/b;Lih/b$c;)V
    .locals 0

    iput-object p1, p0, Lih/b;->b:Lih/b$c;

    return-void
.end method


# virtual methods
.method public b(Lih/c;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lih/b;->a:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "RbxBlockingQueue"

    const-string v0, "Queue full! Cannot add more reports."

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    invoke-virtual {p0}, Lih/b;->c()V

    return-void
.end method

.method public c()V
    .locals 4

    iget-object v0, p0, Lih/b;->b:Lih/b$c;

    sget-object v1, Lih/b$c;->a:Lih/b$c;

    if-ne v0, v1, :cond_2

    sget-object v0, Lih/b$c;->b:Lih/b$c;

    iput-object v0, p0, Lih/b;->b:Lih/b$c;

    iget-object v0, p0, Lih/b;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lih/c;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lih/c;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lih/b;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lih/c;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lih/b;->d:Lih/a;

    invoke-interface {v0, v1}, Lih/c;->a(Lih/a;)V

    return-void

    :cond_0
    iput-object v1, p0, Lih/b;->b:Lih/b$c;

    return-void

    :cond_1
    iput-object v1, p0, Lih/b;->b:Lih/b$c;

    iget-object v0, p0, Lih/b;->c:Landroid/os/Handler;

    iget-object v1, p0, Lih/b;->e:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lih/b;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lih/b;->c:Landroid/os/Handler;

    iget-object v1, p0, Lih/b;->e:Ljava/lang/Runnable;

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_2
    return-void
.end method

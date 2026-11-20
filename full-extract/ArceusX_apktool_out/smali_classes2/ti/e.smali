.class public Lti/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lti/e$d;,
        Lti/e$e;
    }
.end annotation


# instance fields
.field public a:Z

.field public final b:Landroid/os/Handler;

.field public final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lti/e$e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lti/e;->b:Landroid/os/Handler;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lti/e;->c:Ljava/util/ArrayList;

    return-void
.end method

.method public synthetic constructor <init>(Lti/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lti/e;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(Lti/e;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lti/e;->c:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static c()Lti/e;
    .locals 1

    invoke-static {}, Lti/e$d;->a()Lti/e;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b(Lti/e$e;)V
    .locals 2

    iget-boolean v0, p0, Lti/e;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lti/e;->b:Landroid/os/Handler;

    new-instance v1, Lti/e$a;

    invoke-direct {v1, p0, p1}, Lti/e$a;-><init>(Lti/e;Lti/e$e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "NotificationManager was not initialized"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(Landroid/content/Context;)V
    .locals 1

    const-string p1, "NotificationManager"

    const-string v0, "init:"

    invoke-static {p1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lti/e;->a:Z

    return-void
.end method

.method public final e(ILandroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lti/e;->b:Landroid/os/Handler;

    new-instance v1, Lti/e$c;

    invoke-direct {v1, p0, p1, p2}, Lti/e$c;-><init>(Lti/e;ILandroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public f(ILandroid/os/Bundle;)V
    .locals 1

    iget-boolean v0, p0, Lti/e;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lti/e;->e(ILandroid/os/Bundle;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "NotificationManager was not initialized"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public g(Lti/e$e;)V
    .locals 2

    iget-boolean v0, p0, Lti/e;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lti/e;->b:Landroid/os/Handler;

    new-instance v1, Lti/e$b;

    invoke-direct {v1, p0, p1}, Lti/e$b;-><init>(Lti/e;Lti/e$e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "NotificationManager was not initialized"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

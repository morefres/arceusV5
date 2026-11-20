.class public final Lfn/r0$d;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfn/r0;->q(Lmt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lot/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lju/p0;",
        "Lmt/b<",
        "-",
        "Ljava/io/File;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lju/p0;",
        "Ljava/io/File;",
        "<anonymous>",
        "(Lju/p0;)Ljava/io/File;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lot/f;
    c = "com.withpersona.sdk2.camera.camera2.MediaRecorderWrapper$stopRecording$2"
    f = "MediaRecorderWrapper.kt"
    l = {
        0xd4
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public w:I

.field public final synthetic x:Lfn/r0;


# direct methods
.method public constructor <init>(Lfn/r0;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfn/r0;",
            "Lmt/b<",
            "-",
            "Lfn/r0$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfn/r0$d;->x:Lfn/r0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lot/m;-><init>(ILmt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lmt/b;)Lmt/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lmt/b<",
            "*>;)",
            "Lmt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lfn/r0$d;

    iget-object v0, p0, Lfn/r0$d;->x:Lfn/r0;

    invoke-direct {p1, v0, p2}, Lfn/r0$d;-><init>(Lfn/r0;Lmt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lju/p0;

    check-cast p2, Lmt/b;

    invoke-virtual {p0, p1, p2}, Lfn/r0$d;->invoke(Lju/p0;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lju/p0;Lmt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lju/p0;",
            "Lmt/b<",
            "-",
            "Ljava/io/File;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lfn/r0$d;->create(Ljava/lang/Object;Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lfn/r0$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lfn/r0$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lfn/r0$d;->w:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lfn/r0$d;->u:Ljava/lang/Object;

    check-cast v0, Lfn/r0;

    iget-object v1, p0, Lfn/r0$d;->t:Ljava/lang/Object;

    check-cast v1, Ltu/a;

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lfn/r0$d;->x:Lfn/r0;

    invoke-static {p1}, Lfn/r0;->c(Lfn/r0;)Ltu/a;

    move-result-object v1

    iget-object p1, p0, Lfn/r0$d;->x:Lfn/r0;

    iput-object v1, p0, Lfn/r0$d;->t:Ljava/lang/Object;

    iput-object p1, p0, Lfn/r0$d;->u:Ljava/lang/Object;

    iput v2, p0, Lfn/r0$d;->v:I

    iput v3, p0, Lfn/r0$d;->w:I

    invoke-interface {v1, v4, p0}, Ltu/a;->c(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    :goto_0
    :try_start_0
    invoke-static {v0}, Lfn/r0;->d(Lfn/r0;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_3

    invoke-interface {v1, v4}, Ltu/a;->f(Ljava/lang/Object;)V

    return-object v4

    :cond_3
    :try_start_1
    invoke-static {v0}, Lfn/r0;->b(Lfn/r0;)Landroid/media/MediaRecorder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/media/MediaRecorder;->stop()V

    invoke-static {v0}, Lfn/r0;->a(Lfn/r0;)Ljava/io/File;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    :try_start_2
    invoke-static {v0}, Lfn/r0;->a(Lfn/r0;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-object p1, v4

    :goto_1
    invoke-static {v0}, Lfn/r0;->b(Lfn/r0;)Landroid/media/MediaRecorder;

    move-result-object v3

    invoke-virtual {v3}, Landroid/media/MediaRecorder;->release()V

    invoke-static {v0}, Lfn/r0;->d(Lfn/r0;)Z

    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v3, :cond_4

    invoke-interface {v1, v4}, Ltu/a;->f(Ljava/lang/Object;)V

    return-object p1

    :cond_4
    :try_start_3
    invoke-static {v0}, Lfn/r0;->e(Lfn/r0;)Landroid/media/MediaRecorder;

    move-result-object v3

    invoke-static {v0, v3}, Lfn/r0;->g(Lfn/r0;Landroid/media/MediaRecorder;)V

    invoke-static {v0, v2}, Lfn/r0;->f(Lfn/r0;Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-interface {v1, v4}, Ltu/a;->f(Ljava/lang/Object;)V

    return-object p1

    :goto_2
    invoke-interface {v1, v4}, Ltu/a;->f(Ljava/lang/Object;)V

    throw p1
.end method

.class public final Lfn/s$e;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfn/s;->V(ZLmt/b;)Ljava/lang/Object;
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
        "Lfn/g0;",
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
        "Lfn/g0;",
        "<anonymous>",
        "(Lju/p0;)Lfn/g0;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lot/f;
    c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$createCameraCaptureSession$2"
    f = "Camera2Manager.kt"
    l = {
        0x13d,
        0x14f,
        0x174
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:I

.field public final synthetic x:Lfn/s;

.field public final synthetic y:Z


# direct methods
.method public constructor <init>(Lfn/s;ZLmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfn/s;",
            "Z",
            "Lmt/b<",
            "-",
            "Lfn/s$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfn/s$e;->x:Lfn/s;

    iput-boolean p2, p0, Lfn/s$e;->y:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lot/m;-><init>(ILmt/b;)V

    return-void
.end method

.method public static synthetic o(Lfn/s;Ljava/lang/Exception;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lfn/s$e;->s(Lfn/s;Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lfn/s;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lfn/s$e;->r(Lfn/s;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final r(Lfn/s;)Lkotlin/Unit;
    .locals 2

    invoke-static {p0}, Lfn/s;->G(Lfn/s;)Lmu/c0;

    move-result-object v0

    invoke-interface {v0}, Lmu/c0;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lfn/s$d$d;

    if-eqz v1, :cond_0

    check-cast v0, Lfn/s$d$d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lfn/s$d$d;->a()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lfn/s;->G(Lfn/s;)Lmu/c0;

    move-result-object p0

    new-instance v0, Lfn/s$d$d;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lfn/s$d$d;-><init>(Z)V

    invoke-interface {p0, v0}, Lmu/c0;->setValue(Ljava/lang/Object;)V

    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final s(Lfn/s;Ljava/lang/Exception;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lfn/s;->b0()Lfn/h0;

    move-result-object v0

    invoke-static {p0}, Lfn/s;->F(Lfn/s;)Lkn/a;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "createCaptureSession failed on first attempt for choice "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " (videoCaptureMethod="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "): "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ". Retrying."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lmt/b;)Lmt/b;
    .locals 2
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

    new-instance p1, Lfn/s$e;

    iget-object v0, p0, Lfn/s$e;->x:Lfn/s;

    iget-boolean v1, p0, Lfn/s$e;->y:Z

    invoke-direct {p1, v0, v1, p2}, Lfn/s$e;-><init>(Lfn/s;ZLmt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lju/p0;

    check-cast p2, Lmt/b;

    invoke-virtual {p0, p1, p2}, Lfn/s$e;->invoke(Lju/p0;Lmt/b;)Ljava/lang/Object;

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
            "Lfn/g0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lfn/s$e;->create(Ljava/lang/Object;Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lfn/s$e;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lfn/s$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v0, p0, Lfn/s$e;->w:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v4, :cond_2

    if-eq v0, v3, :cond_1

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lfn/s$e;->v:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    iget-object v0, p0, Lfn/s$e;->u:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, p0, Lfn/s$e;->t:Ljava/lang/Object;

    check-cast v0, Landroid/hardware/camera2/CameraDevice;

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    move-object v13, p0

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lfn/s$e;->u:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    iget-object v0, p0, Lfn/s$e;->t:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Landroid/hardware/camera2/CameraDevice;

    :try_start_0
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v13, p0

    goto/16 :goto_1

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v13, p0

    goto/16 :goto_3

    :cond_2
    iget-object v0, p0, Lfn/s$e;->t:Ljava/lang/Object;

    check-cast v0, Lfn/s;

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lfn/s$e;->x:Lfn/s;

    invoke-static {p1}, Lfn/s;->n(Lfn/s;)Landroid/hardware/camera2/CameraDevice;

    move-result-object p1

    if-nez p1, :cond_5

    iget-object v0, p0, Lfn/s$e;->x:Lfn/s;

    invoke-static {v0}, Lfn/s;->p(Lfn/s;)Landroid/hardware/camera2/CameraManager;

    move-result-object p1

    iget-object v5, p0, Lfn/s$e;->x:Lfn/s;

    invoke-virtual {v5}, Lfn/s;->b0()Lfn/h0;

    move-result-object v5

    invoke-virtual {v5}, Lfn/h0;->d()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lfn/s$e;->x:Lfn/s;

    invoke-static {v6}, Lfn/s;->o(Lfn/s;)Landroid/os/Handler;

    move-result-object v6

    iput-object v0, p0, Lfn/s$e;->t:Ljava/lang/Object;

    iput v4, p0, Lfn/s$e;->w:I

    invoke-static {v0, p1, v5, v6, p0}, Lfn/s;->L(Lfn/s;Landroid/hardware/camera2/CameraManager;Ljava/lang/String;Landroid/os/Handler;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    move-object v13, p0

    goto/16 :goto_4

    :cond_4
    :goto_0
    check-cast p1, Landroid/hardware/camera2/CameraDevice;

    invoke-static {v0, p1}, Lfn/s;->O(Lfn/s;Landroid/hardware/camera2/CameraDevice;)V

    :cond_5
    iget-object p1, p0, Lfn/s$e;->x:Lfn/s;

    invoke-static {p1}, Lfn/s;->n(Lfn/s;)Landroid/hardware/camera2/CameraDevice;

    move-result-object v9

    if-eqz v9, :cond_b

    iget-object p1, p0, Lfn/s$e;->x:Lfn/s;

    invoke-virtual {p1}, Lfn/s;->d0()Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;

    move-result-object p1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object p1

    iget-object v0, p0, Lfn/s$e;->x:Lfn/s;

    invoke-static {v0}, Lfn/s;->w(Lfn/s;)Landroid/media/ImageReader;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    move-result-object v0

    filled-new-array {p1, v0}, [Landroid/view/Surface;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/p;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    iget-object p1, p0, Lfn/s$e;->x:Lfn/s;

    invoke-static {p1}, Lfn/s;->F(Lfn/s;)Lkn/a;

    move-result-object p1

    sget-object v0, Lkn/a;->b:Lkn/a;

    if-ne p1, v0, :cond_6

    iget-object p1, p0, Lfn/s$e;->x:Lfn/s;

    invoke-static {p1}, Lfn/s;->E(Lfn/s;)Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, Lfn/s$e;->x:Lfn/s;

    invoke-static {p1}, Lfn/s;->y(Lfn/s;)Lfn/r0;

    move-result-object p1

    invoke-virtual {p1}, Lfn/r0;->m()V

    iget-object p1, p0, Lfn/s$e;->x:Lfn/s;

    invoke-static {p1}, Lfn/s;->y(Lfn/s;)Lfn/r0;

    move-result-object p1

    invoke-virtual {p1}, Lfn/r0;->i()Landroid/view/Surface;

    move-result-object p1

    invoke-interface {v8, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    :try_start_1
    sget-object v5, Lfn/g0;->l:Lfn/g0$a;

    iget-object p1, p0, Lfn/s$e;->x:Lfn/s;

    invoke-virtual {p1}, Lfn/s;->b0()Lfn/h0;

    move-result-object v6

    iget-object p1, p0, Lfn/s$e;->x:Lfn/s;

    invoke-static {p1}, Lfn/s;->r(Lfn/s;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v7

    iget-object p1, p0, Lfn/s$e;->x:Lfn/s;

    invoke-static {p1}, Lfn/s;->o(Lfn/s;)Landroid/os/Handler;

    move-result-object v10

    iget-object p1, p0, Lfn/s$e;->x:Lfn/s;

    new-instance v11, Lfn/t;

    invoke-direct {v11, p1}, Lfn/t;-><init>(Lfn/s;)V

    iget-object p1, p0, Lfn/s$e;->x:Lfn/s;

    invoke-static {p1}, Lfn/s;->t(Lfn/s;)Ljq/a;

    move-result-object v12

    invoke-static {v9}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lfn/s$e;->t:Ljava/lang/Object;

    invoke-static {v8}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lfn/s$e;->u:Ljava/lang/Object;

    iput v3, p0, Lfn/s$e;->w:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    move-object v13, p0

    :try_start_2
    invoke-virtual/range {v5 .. v13}, Lfn/g0$a;->a(Lfn/h0;Landroid/hardware/camera2/CameraCharacteristics;Ljava/util/List;Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;Lkotlin/jvm/functions/Function0;Ljq/a;Lmt/b;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    if-ne p1, v1, :cond_7

    goto/16 :goto_4

    :cond_7
    move-object v3, v8

    move-object v5, v9

    :goto_1
    :try_start_3
    iget-object v0, v13, Lfn/s$e;->x:Lfn/s;

    move-object v6, p1

    check-cast v6, Lfn/g0;

    invoke-static {v0, v6}, Lfn/s;->S(Lfn/s;Lfn/g0;)V

    check-cast p1, Lfn/g0;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    return-object p1

    :catch_1
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :catch_2
    move-exception v0

    :goto_2
    move-object p1, v0

    move-object v3, v8

    move-object v5, v9

    goto :goto_3

    :catch_3
    move-exception v0

    move-object v13, p0

    goto :goto_2

    :goto_3
    iget-object v0, v13, Lfn/s$e;->x:Lfn/s;

    invoke-static {v0}, Lfn/s;->D(Lfn/s;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v6

    iget-object v0, v13, Lfn/s$e;->x:Lfn/s;

    new-instance v8, Lfn/u;

    invoke-direct {v8, v0, p1}, Lfn/u;-><init>(Lfn/s;Ljava/lang/Exception;)V

    const/4 v10, 0x4

    const/4 v11, 0x0

    const-string v7, "camera"

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logDebugLogEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZILjava/lang/Object;)V

    iget-boolean v0, v13, Lfn/s$e;->y:Z

    if-eqz v0, :cond_a

    iget-object v0, v13, Lfn/s$e;->x:Lfn/s;

    invoke-static {v0}, Lfn/s;->F(Lfn/s;)Lkn/a;

    move-result-object v0

    sget-object v6, Lkn/a;->b:Lkn/a;

    if-ne v0, v6, :cond_8

    iget-object v0, v13, Lfn/s$e;->x:Lfn/s;

    invoke-static {v0}, Lfn/s;->I(Lfn/s;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, v13, Lfn/s$e;->x:Lfn/s;

    invoke-static {v0, v4}, Lfn/s;->T(Lfn/s;Z)V

    :cond_8
    iget-object v0, v13, Lfn/s$e;->x:Lfn/s;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v0, v4}, Lfn/s;->N(Lfn/s;F)V

    iget-object v0, v13, Lfn/s$e;->x:Lfn/s;

    invoke-static {v0}, Lfn/s;->J(Lfn/s;)Landroid/media/ImageReader;

    move-result-object v4

    invoke-static {v0, v4}, Lfn/s;->Q(Lfn/s;Landroid/media/ImageReader;)V

    iget-object v0, v13, Lfn/s$e;->x:Lfn/s;

    invoke-static {v5}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v13, Lfn/s$e;->t:Ljava/lang/Object;

    invoke-static {v3}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v13, Lfn/s$e;->u:Ljava/lang/Object;

    invoke-static {p1}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v13, Lfn/s$e;->v:Ljava/lang/Object;

    iput v2, v13, Lfn/s$e;->w:I

    const/4 p1, 0x0

    invoke-static {v0, p1, p0}, Lfn/s;->l(Lfn/s;ZLmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_4
    return-object v1

    :cond_9
    :goto_5
    check-cast p1, Lfn/g0;

    return-object p1

    :cond_a
    throw p1

    :cond_b
    move-object v13, p0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Unable to open camera"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

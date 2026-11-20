.class public final Lfn/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Ljn/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Loq/c;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lfn/i0;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Ljq/a;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lnq/c;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Leo/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Ljn/a;",
            ">;",
            "Ldt/i<",
            "Loq/c;",
            ">;",
            "Ldt/i<",
            "Lfn/i0;",
            ">;",
            "Ldt/i<",
            "Ljq/a;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;",
            "Ldt/i<",
            "Lnq/c;",
            ">;",
            "Ldt/i<",
            "Leo/e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn/c0;->a:Ldt/i;

    iput-object p2, p0, Lfn/c0;->b:Ldt/i;

    iput-object p3, p0, Lfn/c0;->c:Ldt/i;

    iput-object p4, p0, Lfn/c0;->d:Ldt/i;

    iput-object p5, p0, Lfn/c0;->e:Ldt/i;

    iput-object p6, p0, Lfn/c0;->f:Ldt/i;

    iput-object p7, p0, Lfn/c0;->g:Ldt/i;

    iput-object p8, p0, Lfn/c0;->h:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)Lfn/c0;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Ljn/a;",
            ">;",
            "Ldt/i<",
            "Loq/c;",
            ">;",
            "Ldt/i<",
            "Lfn/i0;",
            ">;",
            "Ldt/i<",
            "Ljq/a;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;",
            "Ldt/i<",
            "Lnq/c;",
            ">;",
            "Ldt/i<",
            "Leo/e;",
            ">;)",
            "Lfn/c0;"
        }
    .end annotation

    new-instance v0, Lfn/c0;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lfn/c0;-><init>(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljn/a;Loq/c;Lfn/i0;Ljq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lnq/c;Leo/e;Lfn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lfn/g;Lkn/a;Lsr/a;Z)Lfn/b0;
    .locals 15
    .param p12    # Lsr/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    new-instance v0, Lfn/b0;

    move-object v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    invoke-direct/range {v0 .. v14}, Lfn/b0;-><init>(Landroid/content/Context;Ljn/a;Loq/c;Lfn/i0;Ljq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lnq/c;Leo/e;Lfn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lfn/g;Lkn/a;Lsr/a;Z)V

    return-object v0
.end method


# virtual methods
.method public b(Lfn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lfn/g;Lkn/a;Lsr/a;Z)Lfn/b0;
    .locals 16
    .param p5    # Lsr/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    move-object/from16 v0, p0

    iget-object v1, v0, Lfn/c0;->a:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroid/content/Context;

    iget-object v1, v0, Lfn/c0;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljn/a;

    iget-object v1, v0, Lfn/c0;->c:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Loq/c;

    iget-object v1, v0, Lfn/c0;->d:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lfn/i0;

    iget-object v1, v0, Lfn/c0;->e:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ljq/a;

    iget-object v1, v0, Lfn/c0;->f:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    iget-object v1, v0, Lfn/c0;->g:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lnq/c;

    iget-object v1, v0, Lfn/c0;->h:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Leo/e;

    move-object/from16 v10, p1

    move-object/from16 v11, p2

    move-object/from16 v12, p3

    move-object/from16 v13, p4

    move-object/from16 v14, p5

    move/from16 v15, p6

    invoke-static/range {v2 .. v15}, Lfn/c0;->c(Landroid/content/Context;Ljn/a;Loq/c;Lfn/i0;Ljq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lnq/c;Leo/e;Lfn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lfn/g;Lkn/a;Lsr/a;Z)Lfn/b0;

    move-result-object v1

    return-object v1
.end method

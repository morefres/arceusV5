.class public final Lfn/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lfn/b0$a;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lfn/i0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lju/p0;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;Ldt/i;Ldt/i;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lfn/b0$a;",
            ">;",
            "Ldt/i<",
            "Lfn/i0;",
            ">;",
            "Ldt/i<",
            "Lju/p0;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn/e;->a:Ldt/i;

    iput-object p2, p0, Lfn/e;->b:Ldt/i;

    iput-object p3, p0, Lfn/e;->c:Ldt/i;

    iput-object p4, p0, Lfn/e;->d:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;Ldt/i;Ldt/i;)Lfn/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lfn/b0$a;",
            ">;",
            "Ldt/i<",
            "Lfn/i0;",
            ">;",
            "Ldt/i<",
            "Lju/p0;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)",
            "Lfn/e;"
        }
    .end annotation

    new-instance v0, Lfn/e;

    invoke-direct {v0, p0, p1, p2, p3}, Lfn/e;-><init>(Ldt/i;Ldt/i;Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Lfn/b0$a;Lfn/i0;Lju/p0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lfn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lfn/g;Lkn/a;Lsr/a;Z)Lfn/c;
    .locals 11
    .param p8    # Lsr/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    new-instance v0, Lfn/c;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v0 .. v10}, Lfn/c;-><init>(Lfn/b0$a;Lfn/i0;Lju/p0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lfn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lfn/g;Lkn/a;Lsr/a;Z)V

    return-object v0
.end method


# virtual methods
.method public b(Lfn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lfn/g;Lkn/a;Lsr/a;Z)Lfn/c;
    .locals 11
    .param p5    # Lsr/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lfn/e;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lfn/b0$a;

    iget-object v0, p0, Lfn/e;->b:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lfn/i0;

    iget-object v0, p0, Lfn/e;->c:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lju/p0;

    iget-object v0, p0, Lfn/e;->d:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move-object v8, p4

    move-object/from16 v9, p5

    move/from16 v10, p6

    invoke-static/range {v1 .. v10}, Lfn/e;->c(Lfn/b0$a;Lfn/i0;Lju/p0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lfn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lfn/g;Lkn/a;Lsr/a;Z)Lfn/c;

    move-result-object p1

    return-object p1
.end method

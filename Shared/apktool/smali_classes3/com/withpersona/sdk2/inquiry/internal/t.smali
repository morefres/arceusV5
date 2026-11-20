.class public final Lcom/withpersona/sdk2/inquiry/internal/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lep/w;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lco/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Leo/e;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lep/w;",
            ">;",
            "Ldt/i<",
            "Lco/a;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;",
            ">;",
            "Ldt/i<",
            "Leo/e;",
            ">;",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/t;->a:Ldt/i;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/t;->b:Ldt/i;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/internal/t;->c:Ldt/i;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/internal/t;->d:Ldt/i;

    iput-object p5, p0, Lcom/withpersona/sdk2/inquiry/internal/t;->e:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)Lcom/withpersona/sdk2/inquiry/internal/t;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lep/w;",
            ">;",
            "Ldt/i<",
            "Lco/a;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;",
            ">;",
            "Ldt/i<",
            "Leo/e;",
            ">;",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/internal/t;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/t;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/internal/t;-><init>(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;Lep/w;Lco/a;Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;Leo/e;Landroid/content/Context;)Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;
    .locals 13
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/FieldMapping;",
            ">;",
            "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;",
            "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;",
            "Lep/w;",
            "Lco/a;",
            "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;",
            "Leo/e;",
            "Landroid/content/Context;",
            ")",
            "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v0 .. v12}, Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;Lep/w;Lco/a;Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;Leo/e;Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;)Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;
    .locals 13
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/FieldMapping;",
            ">;",
            "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;",
            "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;",
            ")",
            "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;"
        }
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/t;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lep/w;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/t;->b:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lco/a;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/t;->c:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/t;->d:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Leo/e;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/t;->e:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/content/Context;

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    invoke-static/range {v1 .. v12}, Lcom/withpersona/sdk2/inquiry/internal/t;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;Lep/w;Lco/a;Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;Leo/e;Landroid/content/Context;)Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker;

    move-result-object p1

    return-object p1
.end method

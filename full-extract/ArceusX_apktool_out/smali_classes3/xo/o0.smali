.class public final Lxo/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;",
        ">;"
    }
.end annotation


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
            "Lju/p0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Lju/p0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxo/o0;->a:Ldt/i;

    iput-object p2, p0, Lxo/o0;->b:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;)Lxo/o0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Lju/p0;",
            ">;)",
            "Lxo/o0;"
        }
    .end annotation

    new-instance v0, Lxo/o0;

    invoke-direct {v0, p0, p1}, Lxo/o0;-><init>(Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lju/p0;)Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;-><init>(Landroid/content/Context;Lju/p0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;
    .locals 2

    iget-object v0, p0, Lxo/o0;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lxo/o0;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lju/p0;

    invoke-static {v0, v1}, Lxo/o0;->c(Landroid/content/Context;Lju/p0;)Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxo/o0;->b()Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;

    move-result-object v0

    return-object v0
.end method

.class public final Lqr/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lpr/g1$e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lpr/g1$e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqr/d;->a:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;)Lqr/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lpr/g1$e;",
            ">;)",
            "Lqr/d;"
        }
    .end annotation

    new-instance v0, Lqr/d;

    invoke-direct {v0, p0}, Lqr/d;-><init>(Ldt/i;)V

    return-object v0
.end method

.method public static c(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lpr/g1$e;)Lcom/withpersona/sdk2/inquiry/ui/uiStep/b;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/ui/uiStep/b;

    invoke-direct {v0, p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/uiStep/b;-><init>(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lpr/g1$e;)V

    return-object v0
.end method


# virtual methods
.method public b(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/ui/uiStep/b;
    .locals 1

    iget-object v0, p0, Lqr/d;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpr/g1$e;

    invoke-static {p1, p2, v0}, Lqr/d;->c(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lpr/g1$e;)Lcom/withpersona/sdk2/inquiry/ui/uiStep/b;

    move-result-object p1

    return-object p1
.end method

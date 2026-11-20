.class public final Lcom/withpersona/sdk2/inquiry/ui/uiStep/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/ui/uiStep/b$a;


# instance fields
.field public final a:Lqr/d;


# direct methods
.method public constructor <init>(Lqr/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/uiStep/c;->a:Lqr/d;

    return-void
.end method

.method public static b(Lqr/d;)Ldt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqr/d;",
            ")",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/uiStep/b$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/ui/uiStep/c;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/ui/uiStep/c;-><init>(Lqr/d;)V

    invoke-static {v0}, Ldt/e;->a(Ljava/lang/Object;)Ldt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/ui/uiStep/b;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/uiStep/c;->a:Lqr/d;

    invoke-virtual {v0, p1, p2}, Lqr/d;->b(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/ui/uiStep/b;

    move-result-object p1

    return-object p1
.end method

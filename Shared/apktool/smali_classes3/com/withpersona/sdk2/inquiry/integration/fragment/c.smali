.class public final Lcom/withpersona/sdk2/inquiry/integration/fragment/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/integration/fragment/b$c;


# instance fields
.field public final a:Lwo/h;


# direct methods
.method public constructor <init>(Lwo/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/integration/fragment/c;->a:Lwo/h;

    return-void
.end method

.method public static b(Lwo/h;)Ldt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwo/h;",
            ")",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/integration/fragment/b$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/integration/fragment/c;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/integration/fragment/c;-><init>(Lwo/h;)V

    invoke-static {v0}, Ldt/e;->a(Ljava/lang/Object;)Ldt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/integration/fragment/b;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/fragment/c;->a:Lwo/h;

    invoke-virtual {v0, p1, p2}, Lwo/h;->b(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/integration/fragment/b;

    move-result-object p1

    return-object p1
.end method

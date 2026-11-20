.class public final Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$c;


# instance fields
.field public final a:Loo/d1;


# direct methods
.method public constructor <init>(Loo/d1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/c;->a:Loo/d1;

    return-void
.end method

.method public static b(Loo/d1;)Ldt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loo/d1;",
            ")",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/c;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/c;-><init>(Loo/d1;)V

    invoke-static {v0}, Ldt/e;->a(Ljava/lang/Object;)Ldt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/c;->a:Loo/d1;

    invoke-virtual {v0, p1, p2}, Loo/d1;->b(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

    move-result-object p1

    return-object p1
.end method

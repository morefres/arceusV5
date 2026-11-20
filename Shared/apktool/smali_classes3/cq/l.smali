.class public final Lcq/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Ldq/k2$d;",
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
            "Ldq/k2$d;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcq/l;->a:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;)Lcq/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Ldq/k2$d;",
            ">;)",
            "Lcq/l;"
        }
    .end annotation

    new-instance v0, Lcq/l;

    invoke-direct {v0, p0}, Lcq/l;-><init>(Ldt/i;)V

    return-object v0
.end method

.method public static c(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Ldq/k2$d;)Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b;

    invoke-direct {v0, p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b;-><init>(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Ldq/k2$d;)V

    return-object v0
.end method


# virtual methods
.method public b(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b;
    .locals 1

    iget-object v0, p0, Lcq/l;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldq/k2$d;

    invoke-static {p1, p2, v0}, Lcq/l;->c(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Ldq/k2$d;)Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b;

    move-result-object p1

    return-object p1
.end method

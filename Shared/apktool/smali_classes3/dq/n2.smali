.class public final Ldq/n2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldq/k2$d;


# instance fields
.field public final a:Ldq/m2;


# direct methods
.method public constructor <init>(Ldq/m2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldq/n2;->a:Ldq/m2;

    return-void
.end method

.method public static b(Ldq/m2;)Ldt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldq/m2;",
            ")",
            "Ldt/i<",
            "Ldq/k2$d;",
            ">;"
        }
    .end annotation

    new-instance v0, Ldq/n2;

    invoke-direct {v0, p0}, Ldq/n2;-><init>(Ldq/m2;)V

    invoke-static {v0}, Ldt/e;->a(Ljava/lang/Object;)Ldt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Landroidx/lifecycle/l0;)Ldq/k2;
    .locals 1

    iget-object v0, p0, Ldq/n2;->a:Ldq/m2;

    invoke-virtual {v0, p1, p2}, Ldq/m2;->b(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Landroidx/lifecycle/l0;)Ldq/k2;

    move-result-object p1

    return-object p1
.end method

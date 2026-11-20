.class public final Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b$a;


# instance fields
.field public final a:Lcq/l;


# direct methods
.method public constructor <init>(Lcq/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/c;->a:Lcq/l;

    return-void
.end method

.method public static b(Lcq/l;)Ldt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcq/l;",
            ")",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/c;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/c;-><init>(Lcq/l;)V

    invoke-static {v0}, Ldt/e;->a(Ljava/lang/Object;)Ldt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/c;->a:Lcq/l;

    invoke-virtual {v0, p1, p2}, Lcq/l;->b(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b;

    move-result-object p1

    return-object p1
.end method

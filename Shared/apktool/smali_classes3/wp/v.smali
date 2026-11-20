.class public final Lwp/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Ldn/n0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Loq/c;",
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
            "Ldn/n0;",
            ">;",
            "Ldt/i<",
            "Loq/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwp/v;->a:Ldt/i;

    iput-object p2, p0, Lwp/v;->b:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;)Lwp/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Ldn/n0;",
            ">;",
            "Ldt/i<",
            "Loq/c;",
            ">;)",
            "Lwp/v;"
        }
    .end annotation

    new-instance v0, Lwp/v;

    invoke-direct {v0, p0, p1}, Lwp/v;-><init>(Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Lat/a;Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;ZLcom/withpersona/sdk2/inquiry/selfie/g;Loq/c;)Lcom/withpersona/sdk2/inquiry/selfie/e;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lat/a<",
            "Ldn/n0;",
            ">;",
            "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;",
            "Z",
            "Lcom/withpersona/sdk2/inquiry/selfie/g;",
            "Loq/c;",
            ")",
            "Lcom/withpersona/sdk2/inquiry/selfie/e;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/e;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/selfie/e;-><init>(Lat/a;Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;ZLcom/withpersona/sdk2/inquiry/selfie/g;Loq/c;)V

    return-object v0
.end method


# virtual methods
.method public b(Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;ZLcom/withpersona/sdk2/inquiry/selfie/g;)Lcom/withpersona/sdk2/inquiry/selfie/e;
    .locals 2

    iget-object v0, p0, Lwp/v;->a:Ldt/i;

    invoke-static {v0}, Ldt/c;->b(Ldt/i;)Lat/a;

    move-result-object v0

    iget-object v1, p0, Lwp/v;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Loq/c;

    invoke-static {v0, p1, p2, p3, v1}, Lwp/v;->c(Lat/a;Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;ZLcom/withpersona/sdk2/inquiry/selfie/g;Loq/c;)Lcom/withpersona/sdk2/inquiry/selfie/e;

    move-result-object p1

    return-object p1
.end method

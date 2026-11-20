.class public final Lzp/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Landroidx/lifecycle/l0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lju/p0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;Ldt/i;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroidx/lifecycle/l0;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;",
            ">;",
            "Ldt/i<",
            "Lju/p0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzp/a;->a:Ldt/i;

    iput-object p2, p0, Lzp/a;->b:Ldt/i;

    iput-object p3, p0, Lzp/a;->c:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;Ldt/i;)Lzp/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroidx/lifecycle/l0;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;",
            ">;",
            "Ldt/i<",
            "Lju/p0;",
            ">;)",
            "Lzp/a;"
        }
    .end annotation

    new-instance v0, Lzp/a;

    invoke-direct {v0, p0, p1, p2}, Lzp/a;-><init>(Ldt/i;Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;Lju/p0;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

    invoke-direct {v0, p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;-><init>(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;Lju/p0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;
    .locals 3

    iget-object v0, p0, Lzp/a;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/l0;

    iget-object v1, p0, Lzp/a;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;

    iget-object v2, p0, Lzp/a;->c:Ldt/i;

    invoke-interface {v2}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lju/p0;

    invoke-static {v0, v1, v2}, Lzp/a;->c(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;Lju/p0;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzp/a;->b()Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

    move-result-object v0

    return-object v0
.end method

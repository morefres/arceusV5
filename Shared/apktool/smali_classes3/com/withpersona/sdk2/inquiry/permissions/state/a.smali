.class public final Lcom/withpersona/sdk2/inquiry/permissions/state/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$c;


# instance fields
.field public final a:Lsp/l;


# direct methods
.method public constructor <init>(Lsp/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/a;->a:Lsp/l;

    return-void
.end method

.method public static b(Lsp/l;)Ldt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsp/l;",
            ")",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/state/a;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/permissions/state/a;-><init>(Lsp/l;)V

    invoke-static {v0}, Ldt/e;->a(Ljava/lang/Object;)Ldt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/state/a;->a:Lsp/l;

    invoke-virtual {v0, p1, p2}, Lsp/l;->b(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;

    move-result-object p1

    return-object p1
.end method

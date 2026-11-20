.class public final Lcom/withpersona/sdk2/inquiry/internal/e$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpp/l1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/internal/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "n"
.end annotation


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

.field public final b:Lcom/withpersona/sdk2/inquiry/internal/e$n;

.field public c:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/d$a;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lpp/j;

.field public e:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public f:Lsp/l;

.field public g:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$c;",
            ">;"
        }
    .end annotation
.end field

.field public h:Lrp/c;

.field public i:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/e$f;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->b:Lcom/withpersona/sdk2/inquiry/internal/e$n;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/internal/e$n;->b(Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$n;->c(Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;)V

    return-void
.end method

.method public final b(Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;)V
    .locals 4

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Ldt/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->j1:Ldt/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->L:Ldt/i;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/permissions/e;->a(Ldt/i;Ldt/i;Ldt/i;)Lcom/withpersona/sdk2/inquiry/permissions/e;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->c:Ldt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->k1:Ldt/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Ldt/i;

    invoke-static {v0, p1}, Lpp/j;->a(Ldt/i;Ldt/i;)Lpp/j;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->d:Lpp/j;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/permissions/b;->b(Lpp/j;)Ldt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->e:Ldt/i;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Ldt/i;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->c:Ldt/i;

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->L:Ldt/i;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->E1:Ldt/i;

    invoke-static {v1, v2, p1, v3, v0}, Lsp/l;->a(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)Lsp/l;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->f:Lsp/l;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/permissions/state/a;->b(Lsp/l;)Ldt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->g:Ldt/i;

    invoke-static {p1}, Lrp/c;->a(Ldt/i;)Lrp/c;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->h:Lrp/c;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/d;->b(Lrp/c;)Ldt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->i:Ldt/i;

    return-void
.end method

.method public c(Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$n;->d(Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;)Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;

    return-void
.end method

.method public final d(Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;)Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/e$f;->a()Lbt/b;

    move-result-object v0

    invoke-static {p1, v0}, Lmq/b;->a(Lmq/a;Lbt/b;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->i:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c$a;

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/a;->a(Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c$a;)V

    return-object p1
.end method

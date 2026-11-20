.class public final synthetic Lrp/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/widget/FrameLayout;

.field public final synthetic b:Lpp/i;

.field public final synthetic c:Lj/b;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/FrameLayout;Lpp/i;Lj/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrp/b;->a:Landroid/widget/FrameLayout;

    iput-object p2, p0, Lrp/b;->b:Lpp/i;

    iput-object p3, p0, Lrp/b;->c:Lj/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lrp/b;->a:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lrp/b;->b:Lpp/i;

    iget-object v2, p0, Lrp/b;->c:Lj/b;

    invoke-static {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;->j2(Landroid/widget/FrameLayout;Lpp/i;Lj/b;)V

    return-void
.end method

.class public Luh/a$a;
.super Llk/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luh/a;->L2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic d:Luh/a;


# direct methods
.method public constructor <init>(Luh/a;Landroid/content/Context;Llk/a$a;)V
    .locals 0

    iput-object p1, p0, Luh/a$a;->d:Luh/a;

    invoke-direct {p0, p2, p3}, Llk/a;-><init>(Landroid/content/Context;Llk/a$a;)V

    return-void
.end method


# virtual methods
.method public b()Llk/b;
    .locals 4

    iget-object v0, p0, Luh/a$a;->d:Luh/a;

    invoke-virtual {v0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Luh/a$a;->d:Luh/a;

    invoke-static {v1}, Luh/a;->G2(Luh/a;)Landroid/view/SurfaceView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    iget-object v2, p0, Luh/a$a;->d:Luh/a;

    invoke-static {v2}, Luh/a;->B2(Luh/a;)Landroid/view/View;

    move-result-object v2

    iget-object v3, p0, Luh/a$a;->d:Luh/a;

    invoke-virtual {v3}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v3

    check-cast v3, Lcom/roblox/client/a;

    invoke-virtual {v3}, Lcom/roblox/client/b;->G1()Lki/a;

    move-result-object v3

    invoke-virtual {v3}, Lki/a;->c()Landroid/graphics/Rect;

    move-result-object v3

    invoke-static {v1, v0, v2, v3}, Llk/b;->a(Landroid/view/View;Landroid/view/WindowManager;Landroid/view/View;Landroid/graphics/Rect;)Llk/b;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

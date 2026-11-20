.class public Lcom/roblox/client/hybrid/RBHybridWebView;
.super Lrk/d;
.source "SourceFile"


# instance fields
.field public d:Ldh/j;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lrk/d;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lrk/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roblox/client/hybrid/RBHybridWebView;->d:Ldh/j;

    invoke-super {p0}, Lrk/d;->a()V

    return-void
.end method

.method public d(Landroid/content/Context;)V
    .locals 1

    invoke-super {p0, p1}, Lrk/d;->d(Landroid/content/Context;)V

    new-instance p1, Ldh/j;

    invoke-direct {p1}, Ldh/j;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/hybrid/RBHybridWebView;->d:Ldh/j;

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->K0()I

    move-result v0

    invoke-virtual {p1, v0}, Ldh/j;->a(I)V

    return-void
.end method

.method public g(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Lhi/o;

    invoke-direct {v0}, Lhi/o;-><init>()V

    invoke-virtual {p0, v0}, Lrk/d;->f(Lrk/b;)V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->y5()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lhi/d;

    invoke-direct {v0}, Lhi/d;-><init>()V

    invoke-virtual {p0, v0}, Lrk/d;->f(Lrk/b;)V

    :cond_0
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->A()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lhi/a;

    invoke-direct {v0}, Lhi/a;-><init>()V

    invoke-virtual {p0, v0}, Lrk/d;->f(Lrk/b;)V

    :cond_1
    new-instance v0, Lhi/e;

    invoke-direct {v0}, Lhi/e;-><init>()V

    invoke-virtual {p0, v0}, Lrk/d;->f(Lrk/b;)V

    new-instance v0, Lhi/b;

    invoke-direct {v0}, Lhi/b;-><init>()V

    invoke-virtual {p0, v0}, Lrk/d;->f(Lrk/b;)V

    new-instance v0, Lhi/m;

    invoke-direct {v0}, Lhi/m;-><init>()V

    invoke-virtual {p0, v0}, Lrk/d;->f(Lrk/b;)V

    new-instance v0, Lhi/l;

    invoke-direct {v0, p1}, Lhi/l;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lrk/d;->f(Lrk/b;)V

    new-instance p1, Lhi/h;

    invoke-direct {p1}, Lhi/h;-><init>()V

    invoke-virtual {p0, p1}, Lrk/d;->f(Lrk/b;)V

    new-instance p1, Lhi/j;

    invoke-direct {p1}, Lhi/j;-><init>()V

    invoke-virtual {p0, p1}, Lrk/d;->f(Lrk/b;)V

    new-instance p1, Lhi/g;

    invoke-direct {p1}, Lhi/g;-><init>()V

    invoke-virtual {p0, p1}, Lrk/d;->f(Lrk/b;)V

    return-void
.end method

.method public h()V
    .locals 0

    return-void
.end method

.method public i()V
    .locals 1

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->Q2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lug/c0;->t()V

    :cond_0
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->L2()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/roblox/client/hybrid/RBHybridWebView;->a()V

    :cond_1
    return-void
.end method

.method public onFilterTouchEventForSecurity(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/hybrid/RBHybridWebView;->d:Ldh/j;

    invoke-virtual {v0, p1}, Ldh/j;->b(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->onFilterTouchEventForSecurity(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

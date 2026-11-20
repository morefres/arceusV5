.class public Lcom/roblox/client/c;
.super Lrg/x0;
.source "SourceFile"

# interfaces
.implements Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/c$j;,
        Lcom/roblox/client/c$i;,
        Lcom/roblox/client/c$k;,
        Lcom/roblox/client/c$h;
    }
.end annotation


# instance fields
.field public H0:Landroid/widget/TextView;

.field public I0:Lcom/roblox/client/hybrid/RBHybridWebView;

.field public J0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

.field public K0:Ljava/lang/String;

.field public L0:I

.field public M0:I

.field public N0:Ljava/lang/String;

.field public O0:Ljava/lang/String;

.field public P0:Landroid/app/ProgressDialog;

.field public Q0:Landroid/widget/FrameLayout;

.field public R0:Z

.field public S0:Lcom/roblox/client/c$j;

.field public T0:Lcom/roblox/client/c$i;

.field public U0:Landroid/webkit/ValueCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/webkit/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field public V0:Z

.field public W0:Z

.field public X0:Z

.field public Y0:Ljava/lang/String;

.field public Z0:Lvg/c;

.field public a1:Landroid/webkit/PermissionRequest;

.field public final b1:Lg/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg/c<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final c1:Lcj/o;

.field public final d1:Lcj/o;

.field public final e1:Lcj/o;

.field public final f1:Lcj/o;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lrg/x0;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roblox/client/c;->H0:Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    iput-object v0, p0, Lcom/roblox/client/c;->J0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iput-object v0, p0, Lcom/roblox/client/c;->K0:Ljava/lang/String;

    const/4 v1, 0x0

    iput v1, p0, Lcom/roblox/client/c;->L0:I

    iput v1, p0, Lcom/roblox/client/c;->M0:I

    iput-object v0, p0, Lcom/roblox/client/c;->N0:Ljava/lang/String;

    iput-boolean v1, p0, Lcom/roblox/client/c;->V0:Z

    iput-boolean v1, p0, Lcom/roblox/client/c;->W0:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/roblox/client/c;->X0:Z

    iput-object v0, p0, Lcom/roblox/client/c;->Y0:Ljava/lang/String;

    new-instance v0, Lh/h;

    invoke-direct {v0}, Lh/h;-><init>()V

    new-instance v1, Lrg/c1;

    invoke-direct {v1, p0}, Lrg/c1;-><init>(Lcom/roblox/client/c;)V

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/c;->h(Lh/a;Lg/a;)Lg/c;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/c;->b1:Lg/c;

    new-instance v0, Lcom/roblox/client/c$c;

    invoke-direct {v0, p0}, Lcom/roblox/client/c$c;-><init>(Lcom/roblox/client/c;)V

    iput-object v0, p0, Lcom/roblox/client/c;->c1:Lcj/o;

    new-instance v0, Lcom/roblox/client/c$d;

    invoke-direct {v0, p0}, Lcom/roblox/client/c$d;-><init>(Lcom/roblox/client/c;)V

    iput-object v0, p0, Lcom/roblox/client/c;->d1:Lcj/o;

    new-instance v0, Lcom/roblox/client/c$e;

    invoke-direct {v0, p0}, Lcom/roblox/client/c$e;-><init>(Lcom/roblox/client/c;)V

    iput-object v0, p0, Lcom/roblox/client/c;->e1:Lcj/o;

    new-instance v0, Lcom/roblox/client/c$f;

    invoke-direct {v0, p0}, Lcom/roblox/client/c$f;-><init>(Lcom/roblox/client/c;)V

    iput-object v0, p0, Lcom/roblox/client/c;->f1:Lcj/o;

    return-void
.end method

.method public static synthetic A2(Lcom/roblox/client/c;Le4/q;Lcj/p;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/c;->k3(Le4/q;Lcj/p;)V

    return-void
.end method

.method public static synthetic B2(Lcom/roblox/client/c;Le4/q;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/c;->p3(Le4/q;)V

    return-void
.end method

.method public static synthetic C2(Le4/q;Ljava/lang/String;Landroid/content/DialogInterface;I)V
    .locals 0

    new-instance p2, Lim/a;

    const-string p3, "rbx.web"

    invoke-direct {p2, p3}, Lim/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0, p1, p1}, Lim/a;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic D2(Lcom/roblox/client/c;Le4/q;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/c;->m3(Le4/q;)V

    return-void
.end method

.method public static synthetic E2(Lcom/roblox/client/c;Le4/q;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/c;->i3(Le4/q;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic F2(Lcom/roblox/client/c;Le4/q;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/c;->l3(Le4/q;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic G2(Lcom/roblox/client/c;ZLjava/lang/String;Lcom/roblox/protocols/webview/DomainAllowListChecker$a;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/roblox/client/c;->o3(ZLjava/lang/String;Lcom/roblox/protocols/webview/DomainAllowListChecker$a;)V

    return-void
.end method

.method public static synthetic H2(Lcom/roblox/client/c;Ljava/lang/Boolean;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/c;->n3(Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic I2(Lcom/roblox/client/c;Le4/q;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/c;->j3(Le4/q;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic J2(Lcom/roblox/protocols/webview/DomainAllowListChecker$a;)V
    .locals 1

    sget-object v0, Lcom/roblox/client/c$g;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    return-void

    :cond_0
    sget-object p0, Lug/c0$c;->m:Lug/c0$c;

    invoke-static {p0}, Lug/c0;->v(Lug/c0$c;)V

    return-void

    :cond_1
    sget-object p0, Lug/c0$c;->l:Lug/c0$c;

    invoke-static {p0}, Lug/c0;->v(Lug/c0$c;)V

    return-void

    :cond_2
    sget-object p0, Lug/c0$c;->k:Lug/c0$c;

    invoke-static {p0}, Lug/c0;->v(Lug/c0$c;)V

    return-void
.end method

.method public static bridge synthetic K2(Lcom/roblox/client/c;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/roblox/client/c;->R0:Z

    return p0
.end method

.method public static bridge synthetic L2(Lcom/roblox/client/c;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/c;->J0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    return-object p0
.end method

.method public static bridge synthetic M2(Lcom/roblox/client/c;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/c;->H0:Landroid/widget/TextView;

    return-object p0
.end method

.method public static bridge synthetic N2(Lcom/roblox/client/c;)Lcom/roblox/client/c$i;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/c;->T0:Lcom/roblox/client/c$i;

    return-object p0
.end method

.method public static bridge synthetic O2(Lcom/roblox/client/c;)Lcom/roblox/client/c$j;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/c;->S0:Lcom/roblox/client/c$j;

    return-object p0
.end method

.method public static bridge synthetic P2(Lcom/roblox/client/c;)Lg/c;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/c;->b1:Lg/c;

    return-object p0
.end method

.method public static bridge synthetic Q2(Lcom/roblox/client/c;Landroid/webkit/PermissionRequest;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/c;->a1:Landroid/webkit/PermissionRequest;

    return-void
.end method

.method public static bridge synthetic R2(Lcom/roblox/client/c;Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/c;->f3(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic S2(Lcom/roblox/client/c;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/c;->g3()V

    return-void
.end method

.method public static bridge synthetic T2(Lcom/roblox/client/c;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/c;->r3(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic U2(Lcom/roblox/client/c;Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/c;->s3(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic V2(Lcom/roblox/client/c;Ljava/lang/String;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/c;->E3(Ljava/lang/String;Z)V

    return-void
.end method

.method public static bridge synthetic W2(Lcom/roblox/client/c;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/c;->F3()V

    return-void
.end method


# virtual methods
.method public A0(IILandroid/content/Intent;)V
    .locals 1

    const/16 v0, 0x4e9b

    if-ne p1, v0, :cond_1

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    filled-new-array {p1}, [Landroid/net/Uri;

    move-result-object p1

    iget-object p2, p0, Lcom/roblox/client/c;->U0:Landroid/webkit/ValueCallback;

    invoke-interface {p2, p1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    return-void

    :cond_0
    const-string p1, "rbx.web"

    const-string p2, "Result of file chooser invalid."

    invoke-static {p1, p2}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/c;->U0:Landroid/webkit/ValueCallback;

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public A3(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/client/c;->W0:Z

    return-void
.end method

.method public B3(Lcom/roblox/client/c$i;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/c;->T0:Lcom/roblox/client/c$i;

    return-void
.end method

.method public C3(Lcom/roblox/client/c$j;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/c;->S0:Lcom/roblox/client/c$j;

    return-void
.end method

.method public D3(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/client/c;->X0:Z

    return-void
.end method

.method public final E3(Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "sponsored"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    xor-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    return-void
.end method

.method public F0(Landroid/os/Bundle;)V
    .locals 7

    invoke-super {p0, p1}, Lrg/x0;->F0(Landroid/os/Bundle;)V

    invoke-static {}, Lsk/b;->a()Lev/c;

    move-result-object p1

    invoke-virtual {p1, p0}, Lev/c;->n(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/fragment/app/c;->t()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_2

    const-string v0, "DEFAULT_URL"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCreate: default-URL = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "."

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v5, "rbx.web"

    invoke-static {v5, v2}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v0, :cond_1

    const-string v2, "/giftcards?"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_0

    const-string v6, "/shopgiftcards?"

    invoke-virtual {v0, v2, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iput-object v0, p0, Lcom/roblox/client/c;->N0:Ljava/lang/String;

    iget-object v2, p0, Lcom/roblox/client/c;->K0:Ljava/lang/String;

    if-nez v2, :cond_1

    iput-object v0, p0, Lcom/roblox/client/c;->K0:Ljava/lang/String;

    sget-object v2, Lcom/roblox/protocols/webview/DomainAllowListChecker;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker;

    invoke-virtual {v2}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->enableDomainAllowListChecker()Z

    move-result v2

    if-eqz v2, :cond_1

    iput-object v0, p0, Lcom/roblox/client/c;->Y0:Ljava/lang/String;

    :cond_1
    const-string v0, "WEB_VIEW_TAG"

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/c;->O0:Ljava/lang/String;

    const-string v0, "USE_APP_HYBRID"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/roblox/client/c;->V0:Z

    :cond_2
    new-instance p1, Lvg/c;

    invoke-virtual {p0}, Landroidx/fragment/app/c;->w()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Lvg/c;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/roblox/client/c;->Z0:Lvg/c;

    return-void
.end method

.method public final F3()V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lrg/k1;

    invoke-direct {v1, p0, v0}, Lrg/k1;-><init>(Lcom/roblox/client/c;Le4/q;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final G3(Lcj/p;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, v0}, Lcj/p;->c(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1}, Lcj/p;->f()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0, v0}, Lrg/x0;->v2(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lrg/x0;->V(Ljava/lang/String;)V

    return-void
.end method

.method public H3(Lll/a;)V
    .locals 1

    iget-object v0, p1, Lll/a;->c:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/roblox/client/c;->D3(Z)V

    :cond_0
    iget-object p1, p1, Lll/a;->e:Ljava/lang/Boolean;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/roblox/client/c;->A3(Z)V

    :cond_1
    return-void
.end method

.method public I3()Lug/c0$b;
    .locals 1

    sget-object v0, Lug/c0$b;->e:Lug/c0$b;

    return-object v0
.end method

.method public J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    sget p3, Lrg/n0;->i:I

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    sget p2, Lrg/m0;->k0:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/view/ViewGroup;

    sget p3, Lrg/m0;->w0:I

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, p0, Lcom/roblox/client/c;->H0:Landroid/widget/TextView;

    new-instance p3, Lcom/roblox/client/c$k;

    invoke-direct {p3, p0}, Lcom/roblox/client/c$k;-><init>(Lcom/roblox/client/c;)V

    invoke-virtual {p0}, Lcom/roblox/client/c;->a3()Lcom/roblox/client/hybrid/RBHybridWebView;

    move-result-object v1

    iput-object v1, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v1

    invoke-interface {v1}, Lrh/i;->m2()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    new-instance v2, Lrg/x;

    invoke-direct {v2}, Lrg/x;-><init>()V

    invoke-virtual {v1, v2}, Lrk/d;->setCommandListener(Lrk/d$b;)V

    :cond_0
    iget-object v1, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v2, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p2, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p2, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    iget-object v1, p0, Lcom/roblox/client/c;->O0:Ljava/lang/String;

    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p2, p3}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    iget-object p2, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    iget-object p2, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    new-instance v1, Lcom/roblox/client/c$b;

    invoke-direct {v1, p0}, Lcom/roblox/client/c$b;-><init>(Lcom/roblox/client/c;)V

    invoke-virtual {p2, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    :try_start_0
    iget-object p2, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p2

    invoke-virtual {p2, p3}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    iget-object p2, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p2

    invoke-virtual {p2, p3}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    iget-object p2, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p2

    invoke-static {}, Lrg/a1;->a1()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p2

    invoke-virtual {p2, v3}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    iget-object p2, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p2, v0}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    iget-object p2, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p2, v0}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    invoke-static {}, Lmh/b;->a()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {p3}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    :cond_1
    iget-object p2, p0, Lcom/roblox/client/c;->K0:Ljava/lang/String;

    if-eqz p2, :cond_3

    sget-object p2, Lcom/roblox/protocols/webview/DomainAllowListChecker;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker;

    invoke-virtual {p2}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->enableDomainAllowListChecker()Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/roblox/client/c;->K0:Ljava/lang/String;

    invoke-virtual {p0, p2, p3}, Lcom/roblox/client/c;->z3(Ljava/lang/String;Z)V

    goto :goto_1

    :cond_2
    sget-object p2, Lug/c0$c;->n:Lug/c0$c;

    invoke-static {p2}, Lug/c0;->v(Lug/c0$c;)V

    iget-object p2, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    iget-object v1, p0, Lcom/roblox/client/c;->K0:Ljava/lang/String;

    invoke-virtual {p2, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :goto_1
    const/4 p2, 0x0

    iput-object p2, p0, Lcom/roblox/client/c;->K0:Ljava/lang/String;

    :cond_3
    sget p2, Lrg/m0;->k0:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iput-object p2, p0, Lcom/roblox/client/c;->J0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-virtual {p2, p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;)V

    iget-object p2, p0, Lcom/roblox/client/c;->J0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    sget v1, Lrg/j0;->b:I

    sget v2, Lrg/j0;->o:I

    filled-new-array {v1, v1, v2, v2}, [I

    move-result-object v1

    invoke-virtual {p2, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setColorSchemeResources([I)V

    sget p2, Lrg/m0;->l0:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/FrameLayout;

    iput-object p2, p0, Lcom/roblox/client/c;->Q0:Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Landroidx/fragment/app/c;->t()Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_4

    const-string v1, "dialogHeight"

    invoke-virtual {p2, v1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lcom/roblox/client/c;->L0:I

    const-string v1, "dialogWidth"

    invoke-virtual {p2, v1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lcom/roblox/client/c;->M0:I

    iget-object v1, p0, Lcom/roblox/client/c;->J0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-virtual {v1, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    const-string v1, "USING_LOGIN_WEB_URL"

    invoke-virtual {p2, v1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/roblox/client/c;->R0:Z

    const-string v1, "VISIBLE"

    invoke-virtual {p2, v1, p3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p3

    iput-boolean p3, p0, Lcom/roblox/client/c;->X0:Z

    const-string p3, "BACK_NAVIGATION_DISABLED"

    invoke-virtual {p2, p3, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p2

    iput-boolean p2, p0, Lcom/roblox/client/c;->W0:Z

    :cond_4
    invoke-virtual {p0}, Lrg/x0;->u2()Z

    iget-object p2, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p2}, Lcom/roblox/client/hybrid/RBHybridWebView;->h()V

    return-object p1
.end method

.method public K0()V
    .locals 2

    invoke-static {}, Lsk/b;->a()Lev/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lev/c;->p(Ljava/lang/Object;)V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->M5()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/c;->a1:Landroid/webkit/PermissionRequest;

    if-eqz v0, :cond_0

    const-string v0, "rbx.web"

    const-string v1, "onDestroy: Cleaning up pending permission request"

    invoke-static {v0, v1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/c;->a1:Landroid/webkit/PermissionRequest;

    invoke-virtual {v0}, Landroid/webkit/PermissionRequest;->deny()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roblox/client/c;->a1:Landroid/webkit/PermissionRequest;

    :cond_0
    invoke-super {p0}, Landroidx/fragment/app/c;->K0()V

    return-void
.end method

.method public M0()V
    .locals 1

    invoke-super {p0}, Le4/k;->M0()V

    iget-object v0, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v0}, Lcom/roblox/client/hybrid/RBHybridWebView;->i()V

    return-void
.end method

.method public P0(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/fragment/app/c;->P0(Z)V

    if-nez p1, :cond_0

    invoke-static {}, Lth/m;->b()Lth/m;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lth/m;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->reload()V

    :cond_0
    return-void
.end method

.method public V0()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/c;->V0()V

    iget-object v0, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/webkit/WebView;->onPause()V

    :cond_0
    return-void
.end method

.method public final X2(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lrg/e1;

    invoke-direct {v1, p0, v0, p1}, Lrg/e1;-><init>(Lcom/roblox/client/c;Le4/q;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public Y2(Lcj/p;)V
    .locals 3

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->r1()Z

    move-result v0

    if-eqz v0, :cond_0

    instance-of v0, p1, Lcj/j;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcj/j;

    invoke-interface {v0}, Lcj/j;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p1}, Lcj/p;->d()Z

    move-result v2

    invoke-interface {v0}, Lcj/j;->a()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, v1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeMarketplacePurchaseFinished(ZLjava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v1, Lrg/f1;

    invoke-direct {v1, p0, v0, p1}, Lrg/f1;-><init>(Lcom/roblox/client/c;Le4/q;Lcj/p;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public final Z2(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/ProgressDialog;
    .locals 1

    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p2}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, p3}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    return-object v0
.end method

.method public a0(Lml/a;)V
    .locals 2

    invoke-super {p0, p1}, Lrg/x0;->a0(Lml/a;)V

    iget-object p1, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    iget-object v0, p0, Lcom/roblox/client/c;->Z0:Lvg/c;

    invoke-static {}, Ldk/c;->c()Ldk/c;

    move-result-object v1

    invoke-virtual {v1}, Ldk/c;->g()Lml/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvg/c;->a(Lml/a;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public a1()V
    .locals 3

    invoke-super {p0}, Landroidx/fragment/app/c;->a1()V

    invoke-virtual {p0}, Le4/k;->h2()Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/roblox/client/c;->L0:I

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Le4/k;->h2()Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_1

    iget v1, p0, Lcom/roblox/client/c;->M0:I

    if-nez v1, :cond_0

    const/4 v1, -0x2

    iget v2, p0, Lcom/roblox/client/c;->L0:I

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    goto :goto_0

    :cond_0
    iget v2, p0, Lcom/roblox/client/c;->L0:I

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/webkit/WebView;->onResume()V

    :cond_2
    return-void
.end method

.method public a3()Lcom/roblox/client/hybrid/RBHybridWebView;
    .locals 3

    iget-boolean v0, p0, Lcom/roblox/client/c;->V0:Z

    if-eqz v0, :cond_0

    new-instance v0, Lgi/a;

    invoke-virtual {p0}, Landroidx/fragment/app/c;->w()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/roblox/client/c$a;

    invoke-direct {v2, p0}, Lcom/roblox/client/c$a;-><init>(Lcom/roblox/client/c;)V

    invoke-direct {v0, v1, v2}, Lgi/a;-><init>(Landroid/content/Context;Lgi/a$b;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p0}, Landroidx/fragment/app/c;->w()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/roblox/client/hybrid/RBHybridWebView;-><init>(Landroid/content/Context;)V

    :goto_0
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v1

    invoke-interface {v1}, Lrh/i;->S1()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, Lrg/a1;->O()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Luk/e;->A(Ljava/lang/String;)V

    :cond_1
    return-object v0
.end method

.method public final b3(Ljava/lang/String;Z)V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p2}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lrg/d1;

    invoke-direct {v0, p0, p2, p1}, Lrg/d1;-><init>(Lcom/roblox/client/c;Le4/q;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public c1()V
    .locals 0

    invoke-super {p0}, Lrg/x0;->c1()V

    return-void
.end method

.method public c3()Ljava/lang/String;
    .locals 1

    const-string v0, "undefinedWebContext"

    return-object v0
.end method

.method public d1()V
    .locals 0

    invoke-super {p0}, Lrg/x0;->d1()V

    return-void
.end method

.method public d3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/c;->K0:Ljava/lang/String;

    return-object v0

    :cond_0
    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/a;

    invoke-virtual {v0}, Lcom/roblox/client/a;->N1()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->reload()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/c;->J0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    :cond_1
    return-void
.end method

.method public e3()Z
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/c;->E3(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public final f3(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "mailto:"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SENDTO"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    goto :goto_0

    :cond_0
    const-string v0, "tel:"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.DIAL"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    const/4 p1, 0x0

    return p1

    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/c;->w()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lek/t;->a(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result p1

    const/4 v1, 0x1

    if-eqz p1, :cond_3

    invoke-virtual {p0, v0}, Landroidx/fragment/app/c;->X1(Landroid/content/Intent;)V

    return v1

    :cond_3
    sget p1, Lrg/q0;->U:I

    invoke-virtual {p0, p1, v1}, Lrg/x0;->y2(II)V

    return v1
.end method

.method public final g3()V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lrg/g1;

    invoke-direct {v1, p0, v0}, Lrg/g1;-><init>(Lcom/roblox/client/c;Le4/q;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public h3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/client/c;->W0:Z

    return v0
.end method

.method public final synthetic i3(Le4/q;Landroid/content/DialogInterface;)V
    .locals 0

    iget-object p2, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p2}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Le/p;->onBackPressed()V

    :cond_0
    return-void
.end method

.method public final synthetic j3(Le4/q;Ljava/lang/String;)V
    .locals 3

    new-instance v0, Landroidx/appcompat/app/a$a;

    invoke-direct {v0, p1}, Landroidx/appcompat/app/a$a;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/a$a;->d(Z)Landroidx/appcompat/app/a$a;

    move-result-object v0

    sget v1, Lrg/q0;->p0:I

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/a$a;->p(I)Landroidx/appcompat/app/a$a;

    move-result-object v0

    sget v1, Lrg/q0;->o0:I

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/a$a;->g(I)Landroidx/appcompat/app/a$a;

    move-result-object v0

    sget v1, Lrg/q0;->r:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/a$a;->i(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/a$a;

    move-result-object v0

    sget v1, Lrg/q0;->s:I

    new-instance v2, Lrg/i1;

    invoke-direct {v2, p1, p2}, Lrg/i1;-><init>(Le4/q;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/a$a;->m(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/a$a;

    move-result-object p2

    new-instance v0, Lrg/j1;

    invoke-direct {v0, p0, p1}, Lrg/j1;-><init>(Lcom/roblox/client/c;Le4/q;)V

    invoke-virtual {p2, v0}, Landroidx/appcompat/app/a$a;->k(Landroid/content/DialogInterface$OnDismissListener;)Landroidx/appcompat/app/a$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/a$a;->r()Landroidx/appcompat/app/a;

    return-void
.end method

.method public final synthetic k3(Le4/q;Lcj/p;)V
    .locals 1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/c;->g3()V

    invoke-virtual {p0, p2}, Lcom/roblox/client/c;->G3(Lcj/p;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final synthetic l3(Le4/q;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/roblox/client/c;->H0:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final synthetic m3(Le4/q;)V
    .locals 1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/roblox/client/c;->P0:Landroid/app/ProgressDialog;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/roblox/client/c;->P0:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final synthetic n3(Ljava/lang/Boolean;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Camera permission result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.web"

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/c;->a1:Landroid/webkit/PermissionRequest;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "Camera permission granted by user, granting to webview"

    invoke-static {v1, p1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/c;->a1:Landroid/webkit/PermissionRequest;

    const-string v0, "android.webkit.resource.VIDEO_CAPTURE"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/webkit/PermissionRequest;->grant([Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p1, "Camera permission denied by user, denying to webview"

    invoke-static {v1, p1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/c;->a1:Landroid/webkit/PermissionRequest;

    invoke-virtual {p1}, Landroid/webkit/PermissionRequest;->deny()V

    :goto_0
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/roblox/client/c;->a1:Landroid/webkit/PermissionRequest;

    return-void

    :cond_1
    const-string p1, "Camera permission callback received but no pending request"

    invoke-static {v1, p1}, Lek/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final synthetic o3(ZLjava/lang/String;Lcom/roblox/protocols/webview/DomainAllowListChecker$a;)V
    .locals 2

    sget-object v0, Lcom/roblox/client/c$g;->a:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p3, v0, p3

    const/4 v0, 0x1

    if-eq p3, v0, :cond_4

    const/4 v1, 0x2

    if-eq p3, v1, :cond_2

    const/4 v0, 0x3

    if-eq p3, v0, :cond_0

    const/4 v0, 0x4

    if-eq p3, v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    sget-object p1, Lug/c0$c;->m:Lug/c0$c;

    invoke-static {p1}, Lug/c0;->v(Lug/c0$c;)V

    :cond_1
    invoke-virtual {p0, p2}, Lcom/roblox/client/c;->X2(Ljava/lang/String;)V

    return-void

    :cond_2
    if-eqz p1, :cond_3

    sget-object p1, Lug/c0$c;->l:Lug/c0$c;

    invoke-static {p1}, Lug/c0;->v(Lug/c0$c;)V

    :cond_3
    invoke-virtual {p0, p2, v0}, Lcom/roblox/client/c;->b3(Ljava/lang/String;Z)V

    return-void

    :cond_4
    if-eqz p1, :cond_5

    sget-object p1, Lug/c0$c;->k:Lug/c0$c;

    invoke-static {p1}, Lug/c0;->v(Lug/c0$c;)V

    :cond_5
    const/4 p1, 0x0

    invoke-virtual {p0, p2, p1}, Lcom/roblox/client/c;->b3(Ljava/lang/String;Z)V

    return-void
.end method

.method public onEmitRbHybridEvent(Lsk/a;)V
    .locals 0
    .annotation runtime Lev/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    iget-object p1, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    throw p1
.end method

.method public final synthetic p3(Le4/q;)V
    .locals 2

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/c;->P0:Landroid/app/ProgressDialog;

    if-nez v0, :cond_1

    sget v0, Lrg/q0;->P:I

    invoke-virtual {p0, v0}, Landroidx/fragment/app/c;->e0(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lcom/roblox/client/c;->Z2(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/ProgressDialog;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/c;->P0:Landroid/app/ProgressDialog;

    :cond_1
    iget-object p1, p0, Lcom/roblox/client/c;->P0:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    :cond_2
    :goto_0
    return-void
.end method

.method public q3(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/client/c;->I3()Lug/c0$b;

    move-result-object v0

    invoke-static {v0, p1}, Lug/c0;->w(Lug/c0$b;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/roblox/client/c;->K0:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/roblox/protocols/webview/DomainAllowListChecker;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker;

    invoke-virtual {v0}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->enableDomainAllowListChecker()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/c;->z3(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_1
    sget-object v0, Lug/c0$c;->n:Lug/c0$c;

    invoke-static {v0}, Lug/c0;->v(Lug/c0$c;)V

    iget-object v0, p0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :goto_0
    sget-object v0, Lcom/roblox/protocols/webview/DomainAllowListChecker;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker;

    invoke-virtual {v0}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->enableDomainAllowListChecker()Z

    move-result v0

    if-eqz v0, :cond_2

    iput-object p1, p0, Lcom/roblox/client/c;->Y0:Ljava/lang/String;

    :cond_2
    return-void
.end method

.method public final r3(Ljava/lang/String;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/roblox/protocols/webview/DomainAllowListChecker;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker;

    iget-object v1, p0, Lcom/roblox/client/c;->Y0:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->isKnownTrustedDomain(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object p1, Lug/c0$c;->k:Lug/c0$c;

    invoke-static {p1}, Lug/c0;->v(Lug/c0$c;)V

    return-void

    :cond_1
    iget-object v1, p0, Lcom/roblox/client/c;->Y0:Ljava/lang/String;

    new-instance v2, Lrg/h1;

    invoke-direct {v2}, Lrg/h1;-><init>()V

    invoke-virtual {v0, p1, v1, v2}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->checkDomainAllowList(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/protocols/webview/DomainAllowListChecker$Callback;)V

    return-void
.end method

.method public final s3(Ljava/lang/String;)Z
    .locals 2

    new-instance v0, Lxj/b;

    const-string v1, "rbx.web"

    invoke-direct {v0, v1}, Lxj/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lxj/b;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p1}, Lxj/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public t3(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public u3()V
    .locals 0

    return-void
.end method

.method public v3(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public w3(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public x3(Landroid/webkit/WebView;I)V
    .locals 0

    return-void
.end method

.method public y3(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/c;->z3(Ljava/lang/String;Z)V

    return-void
.end method

.method public final z3(Ljava/lang/String;Z)V
    .locals 3

    sget-object v0, Lcom/roblox/protocols/webview/DomainAllowListChecker;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker;

    iget-object v1, p0, Lcom/roblox/client/c;->Y0:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->isKnownTrustedDomain(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz p2, :cond_0

    sget-object p2, Lug/c0$c;->k:Lug/c0$c;

    invoke-static {p2}, Lug/c0;->v(Lug/c0$c;)V

    :cond_0
    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/c;->b3(Ljava/lang/String;Z)V

    return-void

    :cond_1
    iget-object v1, p0, Lcom/roblox/client/c;->Y0:Ljava/lang/String;

    new-instance v2, Lrg/b1;

    invoke-direct {v2, p0, p2, p1}, Lrg/b1;-><init>(Lcom/roblox/client/c;ZLjava/lang/String;)V

    invoke-virtual {v0, p1, v1, v2}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->checkDomainAllowList(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/protocols/webview/DomainAllowListChecker$Callback;)V

    return-void
.end method

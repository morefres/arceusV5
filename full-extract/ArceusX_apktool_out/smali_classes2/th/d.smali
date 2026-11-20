.class public Lth/d;
.super Lcom/roblox/client/c;
.source "SourceFile"


# instance fields
.field public A1:Lvi/f;

.field public B1:Lvi/i;

.field public C1:Landroid/app/ProgressDialog;

.field public g1:Ljava/lang/String;

.field public h1:Z

.field public i1:I

.field public j1:Ljava/lang/String;

.field public k1:Z

.field public l1:Z

.field public m1:Z

.field public n1:Lorg/json/JSONObject;

.field public o1:Z

.field public p1:Lcom/roblox/client/components/RobloxToolbar;

.field public q1:Landroid/widget/ImageView;

.field public r1:Lcom/roblox/client/components/RobloxToolbar$c;

.field public s1:Lvi/d;

.field public t1:Landroid/view/Menu;

.field public u1:Z

.field public v1:Z

.field public w1:Z

.field public x1:Z

.field public y1:Z

.field public z1:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/roblox/client/c;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lth/d;->g1:Ljava/lang/String;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lth/d;->h1:Z

    const/4 v2, -0x1

    iput v2, p0, Lth/d;->i1:I

    iput-boolean v1, p0, Lth/d;->l1:Z

    iput-boolean v1, p0, Lth/d;->m1:Z

    iput-boolean v1, p0, Lth/d;->u1:Z

    iput-boolean v1, p0, Lth/d;->v1:Z

    iput-boolean v1, p0, Lth/d;->w1:Z

    const/4 v2, 0x1

    iput-boolean v2, p0, Lth/d;->x1:Z

    iput-boolean v1, p0, Lth/d;->y1:Z

    iput-object v0, p0, Lth/d;->z1:Landroid/view/View;

    return-void
.end method

.method public static synthetic J3(Lth/d;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Lth/d;->S3(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic K3(Lth/d;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Lth/d;->R3(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic L3(Lth/d;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Lth/d;->Q3(Landroid/view/View;)V

    return-void
.end method

.method public static bridge synthetic M3(Lth/d;)V
    .locals 0

    invoke-virtual {p0}, Lth/d;->O3()V

    return-void
.end method


# virtual methods
.method public D3(Z)V
    .locals 1

    invoke-super {p0, p1}, Lcom/roblox/client/c;->D3(Z)V

    iget-object v0, p0, Lth/d;->z1:Landroid/view/View;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public F0(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Lcom/roblox/client/c;->F0(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/c;->t()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "TITLE_ID"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lth/d;->i1:I

    const-string v1, "TITLE_STRING"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lth/d;->j1:Ljava/lang/String;

    const-string v1, "REPORTING_TAB_NAME"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lth/d;->g1:Ljava/lang/String;

    const-string v1, "HAS_PARENT"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lth/d;->h1:Z

    const-string v1, "HIDE_ACCESSORY_BUTTONS"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lth/d;->l1:Z

    const-string v1, "SHOW_DOMAIN_AS_TITLE"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lth/d;->k1:Z

    const-string v1, "CLOSE_FRAGMENT_ON_RESTORED"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lth/d;->o1:Z

    const-string v1, "hideNativeHeader"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lth/d;->m1:Z

    const-string v1, "BACK_NAVIGATION_DISABLED"

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lth/d;->x1:Z

    if-eqz v1, :cond_0

    iput-boolean v2, p0, Lth/d;->u1:Z

    invoke-virtual {p0, v3}, Lcom/roblox/client/c;->A3(Z)V

    :cond_0
    const-string v1, "SEARCH_PARAMS"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lth/d;->n1:Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lth/d;->o1:Z

    if-eqz p1, :cond_2

    const-string p1, "rbx.web"

    const-string v0, "onCreate: ... Closing this web fragment on restored."

    invoke-static {p1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->r()Landroidx/fragment/app/h;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/fragment/app/h;->m(Landroidx/fragment/app/c;)Landroidx/fragment/app/h;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/h;->h()I

    :cond_2
    iget-object p1, p0, Lth/d;->n1:Lorg/json/JSONObject;

    if-nez p1, :cond_3

    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    iput-object p1, p0, Lth/d;->n1:Lorg/json/JSONObject;

    :cond_3
    return-void
.end method

.method public H3(Lll/a;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/roblox/client/c;->H3(Lll/a;)V

    iget-object p1, p1, Lll/a;->b:Ljava/lang/String;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lth/d;->p1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->setTitle(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public I3()Lug/c0$b;
    .locals 1

    sget-object v0, Lug/c0$b;->l:Lug/c0$b;

    return-object v0
.end method

.method public J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    sget v0, Lrg/n0;->E:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    new-instance v0, Lcom/roblox/client/components/RobloxToolbar$c;

    invoke-direct {v0}, Lcom/roblox/client/components/RobloxToolbar$c;-><init>()V

    iput-object v0, p0, Lth/d;->r1:Lcom/roblox/client/components/RobloxToolbar$c;

    sget v0, Lrg/m0;->n0:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/components/RobloxToolbar;

    iput-object v0, p0, Lth/d;->p1:Lcom/roblox/client/components/RobloxToolbar;

    iget-boolean v2, p0, Lth/d;->m1:Z

    if-eqz v2, :cond_0

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Lcom/roblox/client/components/RobloxToolbar;->setVisibility(I)V

    goto :goto_0

    :cond_0
    new-instance v2, Lth/a;

    invoke-direct {v2, p0}, Lth/a;-><init>(Lth/d;)V

    invoke-virtual {v0, v2}, Lcom/roblox/client/components/RobloxToolbar;->h0(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lth/d;->p1:Lcom/roblox/client/components/RobloxToolbar;

    const v2, 0x800013

    invoke-virtual {v0, v2}, Lcom/roblox/client/components/RobloxToolbar;->setCloseButtonGravity(I)V

    :goto_0
    sget v0, Lrg/m0;->h:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    invoke-super {p0, p1, v0, p3}, Lcom/roblox/client/c;->J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean p1, p0, Lth/d;->m1:Z

    if-eqz p1, :cond_1

    sget p1, Lrg/m0;->D:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lth/d;->q1:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p1, p0, Lth/d;->q1:Landroid/widget/ImageView;

    iget-object p3, p0, Lth/d;->r1:Lcom/roblox/client/components/RobloxToolbar$c;

    invoke-static {}, Ldk/c;->c()Ldk/c;

    move-result-object v0

    invoke-virtual {v0}, Ldk/c;->g()Lml/a;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/roblox/client/components/RobloxToolbar$c;->a(Lml/a;)I

    move-result p3

    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object p1, p0, Lth/d;->q1:Landroid/widget/ImageView;

    new-instance p3, Lth/b;

    invoke-direct {p3, p0}, Lth/b;-><init>(Lth/d;)V

    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    iget-object p1, p0, Lth/d;->p1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->H1()Le4/q;

    move-result-object p3

    invoke-virtual {p3}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object p3

    invoke-virtual {p0, p1, p3}, Lth/d;->X3(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    iput-object p2, p0, Lth/d;->z1:Landroid/view/View;

    iget-boolean p1, p0, Lcom/roblox/client/c;->X0:Z

    if-nez p1, :cond_2

    invoke-virtual {p0, v1}, Lth/d;->D3(Z)V

    :cond_2
    return-object p2
.end method

.method public M0()V
    .locals 0

    invoke-virtual {p0}, Lth/d;->O3()V

    invoke-super {p0}, Lcom/roblox/client/c;->M0()V

    return-void
.end method

.method public final N3(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
    .locals 1

    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, p2}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    const/4 p2, 0x1

    invoke-virtual {v0, p2}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    const/4 p2, 0x0

    invoke-virtual {v0, p2}, Landroid/app/Dialog;->setCancelable(Z)V

    invoke-virtual {v0, p2}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    return-object v0
.end method

.method public final O3()V
    .locals 1

    iget-object v0, p0, Lth/d;->C1:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lth/d;->C1:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method

.method public P0(Z)V
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lth/d;->y1:Z

    :cond_0
    invoke-super {p0, p1}, Lcom/roblox/client/c;->P0(Z)V

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lth/d;->Z3()V

    :cond_1
    return-void
.end method

.method public P3(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 1

    new-instance v0, Lvi/d;

    invoke-direct {v0, p0}, Lvi/d;-><init>(Landroidx/fragment/app/c;)V

    iput-object v0, p0, Lth/d;->s1:Lvi/d;

    invoke-virtual {v0, p1, p2}, Lvi/d;->d(Landroid/view/Menu;Landroid/view/MenuInflater;)Landroid/view/MenuItem;

    return-void
.end method

.method public final synthetic Q3(Landroid/view/View;)V
    .locals 0

    sget-object p1, Lug/c0$a;->b:Lug/c0$a;

    invoke-virtual {p0, p1}, Lth/d;->U3(Lug/c0$a;)V

    return-void
.end method

.method public final synthetic R3(Landroid/view/View;)V
    .locals 0

    sget-object p1, Lug/c0$a;->b:Lug/c0$a;

    invoke-virtual {p0, p1}, Lth/d;->U3(Lug/c0$a;)V

    return-void
.end method

.method public final synthetic S3(Landroid/view/View;)V
    .locals 1

    iget-boolean p1, p0, Lth/d;->x1:Z

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lth/d;->e3()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    if-nez p1, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->onBackPressed()V

    :cond_1
    return-void
.end method

.method public T3(Landroid/app/Activity;Loi/h;Loi/h$c;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p2, p1, v0, p3}, Loi/h;->b(Landroid/content/Context;ZLoi/h$c;)V

    return-void
.end method

.method public U3(Lug/c0$a;)V
    .locals 1

    iget-boolean v0, p0, Lth/d;->y1:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lth/d;->y1:Z

    invoke-static {p1}, Lug/c0;->q(Lug/c0$a;)V

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->onBackPressed()V

    :cond_1
    return-void
.end method

.method public V3(Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, Lth/d;->w1:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lth/d;->w1:Z

    invoke-static {p1}, Lug/c0;->r(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final W3(Ljava/lang/String;)V
    .locals 3

    const-string v0, ""

    :try_start_0
    new-instance v1, Ljava/net/URI;

    invoke-direct {v1, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object p1

    const-string v2, "https"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    invoke-virtual {v1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v1

    const-string v2, "www."

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz p1, :cond_1

    const-string p1, "\ud83d\udd12 "

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_1
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :goto_2
    const-string v1, "rbx.web"

    const-string v2, "Failed to parse domain for title"

    invoke-static {v1, v2, p1}, Lek/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_3
    iget-object p1, p0, Lth/d;->p1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {p1, v0}, Lcom/roblox/client/components/RobloxToolbar;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public X3(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 2

    iput-object p1, p0, Lth/d;->t1:Landroid/view/Menu;

    iget-boolean v0, p0, Lth/d;->l1:Z

    if-nez v0, :cond_0

    const/16 v0, 0x22

    invoke-virtual {p0, p1, p2, v0}, Lth/d;->Y3(Landroid/view/Menu;Landroid/view/MenuInflater;I)V

    new-instance v0, Lvi/e;

    iget-object v1, p0, Lth/d;->g1:Ljava/lang/String;

    invoke-direct {v0, p0, v1}, Lvi/e;-><init>(Lrg/x0;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p2}, Lvi/e;->e(Landroid/view/Menu;Landroid/view/MenuInflater;)Landroid/view/MenuItem;

    invoke-virtual {p0, p1, p2}, Lth/d;->P3(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    return-void

    :cond_0
    iget-object v0, p0, Lth/d;->n1:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-lez v0, :cond_1

    const/16 v0, 0x36

    invoke-virtual {p0, p1, p2, v0}, Lth/d;->Y3(Landroid/view/Menu;Landroid/view/MenuInflater;I)V

    :cond_1
    return-void
.end method

.method public Y3(Landroid/view/Menu;Landroid/view/MenuInflater;I)V
    .locals 3

    iget-object v0, p0, Lth/d;->n1:Lorg/json/JSONObject;

    const-string v1, "searchType"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lvi/g;

    invoke-direct {v1, p0, v0}, Lvi/g;-><init>(Lcom/roblox/client/c;Ljava/lang/String;)V

    iput-object v1, p0, Lth/d;->B1:Lvi/i;

    :cond_0
    iget-object v0, p0, Lth/d;->B1:Lvi/i;

    if-nez v0, :cond_1

    new-instance v0, Lvi/i;

    invoke-direct {v0, p0}, Lvi/i;-><init>(Lcom/roblox/client/c;)V

    iput-object v0, p0, Lth/d;->B1:Lvi/i;

    :cond_1
    new-instance v0, Lvi/f;

    invoke-direct {v0, p0}, Lvi/f;-><init>(Landroidx/fragment/app/c;)V

    iput-object v0, p0, Lth/d;->A1:Lvi/f;

    invoke-virtual {v0, p1}, Lvi/f;->n(Landroid/view/Menu;)V

    iget-object v0, p0, Lth/d;->A1:Lvi/f;

    iget-object v1, p0, Lth/d;->p1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, v1}, Lvi/f;->p(Lcom/roblox/client/components/RobloxToolbar;)V

    iget-object v0, p0, Lth/d;->A1:Lvi/f;

    iget-object v1, p0, Lth/d;->B1:Lvi/i;

    invoke-virtual {v0, v1}, Lvi/f;->o(Lvi/f$e;)V

    iget-object v0, p0, Lth/d;->A1:Lvi/f;

    invoke-virtual {v0, p1, p2}, Lvi/f;->k(Landroid/view/Menu;Landroid/view/MenuInflater;)Landroid/view/MenuItem;

    iget-object p1, p0, Lth/d;->p1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {p0}, Landroidx/fragment/app/c;->w()Landroid/content/Context;

    move-result-object p2

    sget v0, Lrg/m0;->c:I

    invoke-static {p1, p2, v0, p3}, Ldh/h;->a(Landroidx/appcompat/widget/Toolbar;Landroid/content/Context;II)V

    return-void
.end method

.method public final Z3()V
    .locals 1

    iget-object v0, p0, Lth/d;->s1:Lvi/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lvi/d;->j()V

    :cond_0
    return-void
.end method

.method public a0(Lml/a;)V
    .locals 2

    iget-object v0, p0, Lth/d;->p1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->a0(Lml/a;)V

    iget-boolean v0, p0, Lth/d;->m1:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lth/d;->q1:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lth/d;->r1:Lcom/roblox/client/components/RobloxToolbar$c;

    invoke-virtual {v1, p1}, Lcom/roblox/client/components/RobloxToolbar$c;->a(Lml/a;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lth/d;->p1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v1}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/Menu;->clear()V

    invoke-virtual {v0}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lth/d;->X3(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    :cond_1
    invoke-super {p0, p1}, Lcom/roblox/client/c;->a0(Lml/a;)V

    return-void
.end method

.method public a1()V
    .locals 1

    invoke-super {p0}, Lcom/roblox/client/c;->a1()V

    invoke-virtual {p0}, Lth/d;->Z3()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lth/d;->y1:Z

    return-void
.end method

.method public final a4(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lth/d;->A1:Lvi/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lth/d;->B1:Lvi/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lvi/i;->f(Ljava/lang/String;)V

    iget-object p1, p0, Lth/d;->A1:Lvi/f;

    invoke-virtual {p1}, Lvi/f;->r()V

    :cond_0
    return-void
.end method

.method public final b4(Z)V
    .locals 1

    iget-boolean v0, p0, Lth/d;->x1:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lth/d;->u1:Z

    if-ne v0, p1, :cond_0

    goto :goto_1

    :cond_0
    iput-boolean p1, p0, Lth/d;->u1:Z

    iget-object v0, p0, Lth/d;->p1:Lcom/roblox/client/components/RobloxToolbar;

    if-eqz p1, :cond_1

    new-instance p1, Lth/c;

    invoke-direct {p1, p0}, Lth/c;-><init>(Lth/d;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public c1()V
    .locals 1

    invoke-super {p0}, Lcom/roblox/client/c;->c1()V

    invoke-static {}, Lev/c;->d()Lev/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lev/c;->n(Ljava/lang/Object;)V

    return-void
.end method

.method public d1()V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->v0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lth/d;->y1:Z

    if-nez v0, :cond_0

    sget-object v0, Lug/c0$a;->d:Lug/c0$a;

    invoke-static {v0}, Lug/c0;->q(Lug/c0$a;)V

    :cond_0
    invoke-static {}, Lev/c;->d()Lev/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lev/c;->p(Ljava/lang/Object;)V

    invoke-super {p0}, Lcom/roblox/client/c;->d1()V

    return-void
.end method

.method public e3()Z
    .locals 1

    iget-boolean v0, p0, Lth/d;->y1:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-super {p0}, Lcom/roblox/client/c;->e3()Z

    move-result v0

    return v0
.end method

.method public onAppLocaleChangeEvent(Loh/a;)V
    .locals 2
    .annotation runtime Lev/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p1

    if-eqz p1, :cond_0

    sget v0, Lrg/q0;->K:I

    invoke-virtual {p0, v0}, Landroidx/fragment/app/c;->e0(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lth/d;->N3(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lth/d;->C1:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    new-instance v0, Loi/h;

    invoke-direct {v0}, Loi/h;-><init>()V

    new-instance v1, Lth/d$a;

    invoke-direct {v1, p0, p1}, Lth/d$a;-><init>(Lth/d;Landroid/app/Activity;)V

    invoke-virtual {p0, p1, v0, v1}, Lth/d;->T3(Landroid/app/Activity;Loi/h;Loi/h$c;)V

    :cond_0
    return-void
.end method

.method public onUnreadNotificationCountEvent(Loh/i;)V
    .locals 1
    .annotation runtime Lev/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "GWF.onUnreadNotificationCountEvent() "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p1, 0x0

    throw p1
.end method

.method public t3(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lth/d;->v1:Z

    iget-boolean v0, p0, Lth/d;->k1:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lth/d;->W3(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0, p1}, Lth/d;->a4(Ljava/lang/String;)V

    return-void
.end method

.method public u3()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lth/d;->v1:Z

    return-void
.end method

.method public v3(Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, Lth/d;->v1:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/c;->x0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lth/d;->V3(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public x3(Landroid/webkit/WebView;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/roblox/client/c;->x3(Landroid/webkit/WebView;I)V

    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoBack()Z

    move-result p1

    invoke-virtual {p0, p1}, Lth/d;->b4(Z)V

    return-void
.end method

.method public z0(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lrg/x0;->z0(Landroid/os/Bundle;)V

    iget-boolean p1, p0, Lth/d;->k1:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lth/d;->j1:Ljava/lang/String;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lth/d;->p1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->setTitle(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    iget p1, p0, Lth/d;->i1:I

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lth/d;->p1:Lcom/roblox/client/components/RobloxToolbar;

    sget v0, Lrg/q0;->x:I

    invoke-virtual {p1, v0}, Lcom/roblox/client/components/RobloxToolbar;->setTitle(I)V

    return-void

    :cond_1
    iget-object v0, p0, Lth/d;->p1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->setTitle(I)V

    :cond_2
    return-void
.end method

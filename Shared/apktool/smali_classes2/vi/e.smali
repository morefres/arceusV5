.class public Lvi/e;
.super Lvi/a;
.source "SourceFile"


# instance fields
.field public b:Ljava/lang/String;

.field public c:Lbk/c;


# direct methods
.method public constructor <init>(Lrg/x0;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p1

    invoke-direct {p0, p1}, Lvi/a;-><init>(Le4/q;)V

    iput-object p2, p0, Lvi/e;->b:Ljava/lang/String;

    new-instance p1, Lbk/f;

    invoke-direct {p1}, Lbk/f;-><init>()V

    iput-object p1, p0, Lvi/e;->c:Lbk/c;

    return-void
.end method


# virtual methods
.method public final c(Lml/a;)I
    .locals 1

    sget-object v0, Lvi/e$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    sget p1, Lrg/r0;->b:I

    return p1

    :cond_0
    sget p1, Lrg/r0;->a:I

    return p1
.end method

.method public final d(Lml/a;)I
    .locals 0

    sget p1, Lrg/l0;->y:I

    return p1
.end method

.method public e(Landroid/view/Menu;Landroid/view/MenuInflater;)Landroid/view/MenuItem;
    .locals 1

    sget v0, Lrg/o0;->b:I

    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    sget p2, Lrg/m0;->b:I

    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object p2

    new-instance v0, Lvi/e$a;

    invoke-direct {v0, p0}, Lvi/e$a;-><init>(Lvi/e;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget v0, Lrg/m0;->H:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iget-object v0, p0, Lvi/e;->c:Lbk/c;

    invoke-interface {v0}, Lbk/c;->getTheme()Lml/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lvi/e;->d(Lml/a;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    return-object p1
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lvi/e;->g(Landroidx/lifecycle/r;)V

    return-void
.end method

.method public g(Landroidx/lifecycle/r;)V
    .locals 8

    invoke-virtual {p0}, Lvi/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lvi/a;->a:Le4/q;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, p0, Lvi/a;->a:Le4/q;

    invoke-virtual {v0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->U0()Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-static {}, Lek/t;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lvi/a;->a:Le4/q;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lrg/k0;->f:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    const-string v1, ""

    goto :goto_0

    :cond_2
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->F0()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lvi/h;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lvi/a;->b()I

    move-result v0

    goto :goto_0

    :cond_3
    invoke-static {}, Lrg/a1;->F0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lvi/a;->b()I

    move-result v0

    :goto_0
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "showRobux"

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v3

    invoke-interface {v3}, Lrh/i;->F0()Z

    move-result v3

    if-eqz v3, :cond_4

    const-string v3, "hideNativeHeader"

    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_4
    iget-object v3, p0, Lvi/a;->a:Le4/q;

    sget v5, Lrg/m0;->j:I

    invoke-virtual {v3, v5}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    if-nez v3, :cond_5

    invoke-static {}, Lti/g;->b()Lti/g;

    move-result-object v3

    const-string v5, "robux_menuoption_no_container_for_purchase"

    invoke-virtual {v3, v5}, Lti/g;->q(Ljava/lang/String;)V

    :cond_5
    iget-object v3, p0, Lvi/a;->a:Le4/q;

    invoke-virtual {v3}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v3

    iget-object v5, p0, Lvi/a;->a:Le4/q;

    sget v6, Lrg/m0;->j:I

    invoke-virtual {v5, v6}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v5

    const-string v6, "dialog"

    const-string v7, "RobuxMenuOption"

    if-eqz v5, :cond_8

    new-instance v0, Lth/j;

    invoke-direct {v0}, Lth/j;-><init>()V

    invoke-virtual {v0, v2}, Landroidx/fragment/app/c;->O1(Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Lrg/y1;->T2(Ljava/lang/String;)V

    if-eqz p1, :cond_6

    invoke-virtual {v0}, Landroidx/fragment/app/c;->a()Landroidx/lifecycle/l;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_6
    invoke-virtual {v3}, Landroidx/fragment/app/FragmentManager;->U0()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, Lti/g;->b()Lti/g;

    move-result-object p1

    const-string v1, "robux_menuoption_committed_after_state_save"

    invoke-virtual {p1, v1}, Lti/g;->q(Ljava/lang/String;)V

    const-string p1, "State has already been saved. Attempting to show premium fragment, allowing state loss."

    invoke-static {v7, p1}, Lek/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    invoke-virtual {v3}, Landroidx/fragment/app/FragmentManager;->r()Landroidx/fragment/app/h;

    move-result-object p1

    const-string v1, "robuxPurchase"

    invoke-virtual {p1, v1}, Landroidx/fragment/app/h;->f(Ljava/lang/String;)Landroidx/fragment/app/h;

    move-result-object p1

    sget v1, Lrg/m0;->j:I

    invoke-virtual {p1, v1, v0, v6}, Landroidx/fragment/app/h;->b(ILandroidx/fragment/app/c;Ljava/lang/String;)Landroidx/fragment/app/h;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/h;->h()I

    goto :goto_1

    :cond_8
    const-string v5, "dialogHeight"

    invoke-virtual {v2, v5, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    new-instance v0, Lth/g;

    invoke-direct {v0}, Lth/g;-><init>()V

    invoke-virtual {v0, v2}, Landroidx/fragment/app/c;->O1(Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Lcom/roblox/client/c;->q3(Ljava/lang/String;)V

    iget-object v1, p0, Lvi/e;->c:Lbk/c;

    invoke-interface {v1}, Lbk/c;->getTheme()Lml/a;

    move-result-object v1

    invoke-virtual {p0, v1}, Lvi/e;->c(Lml/a;)I

    move-result v1

    invoke-virtual {v0, v4, v1}, Le4/k;->r2(II)V

    if-eqz p1, :cond_9

    invoke-virtual {v0}, Landroidx/fragment/app/c;->a()Landroidx/lifecycle/l;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_9
    invoke-virtual {v3}, Landroidx/fragment/app/FragmentManager;->U0()Z

    move-result p1

    if-nez p1, :cond_a

    invoke-virtual {v0, v3, v6}, Le4/k;->t2(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    goto :goto_1

    :cond_a
    invoke-static {}, Lti/g;->b()Lti/g;

    move-result-object p1

    const-string v0, "robux_menuoption_not_shown_after_state_save"

    invoke-virtual {p1, v0}, Lti/g;->q(Ljava/lang/String;)V

    const-string p1, "State has already been saved. Do not show premium dialog fragment."

    invoke-static {v7, p1}, Lek/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    const-string p1, "robux"

    iget-object v0, p0, Lvi/e;->b:Ljava/lang/String;

    const-string v1, "nativeMain"

    invoke-static {v1, p1, v0}, Lrg/t0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_b
    :goto_2
    invoke-static {}, Lti/g;->b()Lti/g;

    move-result-object p1

    const-string v0, "robux_menuoption_attempt_after_state_save"

    invoke-virtual {p1, v0}, Lti/g;->q(Ljava/lang/String;)V

    return-void
.end method

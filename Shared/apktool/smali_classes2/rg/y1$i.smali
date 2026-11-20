.class public Lrg/y1$i;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrg/y1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "i"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public final synthetic b:Lrg/y1;


# direct methods
.method public constructor <init>(Lrg/y1;)V
    .locals 0

    iput-object p1, p0, Lrg/y1$i;->b:Lrg/y1;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lrg/y1$i;->a:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(Lrg/y1$i;Ljava/lang/String;Ljava/lang/String;Le4/q;Landroid/webkit/WebView;Z)V
    .locals 0

    invoke-virtual/range {p0 .. p5}, Lrg/y1$i;->g(Ljava/lang/String;Ljava/lang/String;Le4/q;Landroid/webkit/WebView;Z)V

    return-void
.end method

.method public static synthetic b(Lrg/y1$i;Le4/q;Ljava/lang/String;Landroid/webkit/WebView;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lrg/y1$i;->f(Le4/q;Ljava/lang/String;Landroid/webkit/WebView;)V

    return-void
.end method

.method public static synthetic c(Lrg/y1$i;)V
    .locals 0

    invoke-virtual {p0}, Lrg/y1$i;->e()V

    return-void
.end method


# virtual methods
.method public final d(Landroid/webkit/WebView;Ljava/lang/String;ZZ)Z
    .locals 14

    move-object/from16 v2, p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "-> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.web"

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    if-nez v2, :cond_0

    const-string v2, "RWF.shouldOverrideUrlLoading() urlString is null!"

    invoke-static {v1, v2}, Lek/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v0

    :cond_0
    iget-object v3, p0, Lrg/y1$i;->b:Lrg/y1;

    invoke-virtual {v3}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v4

    const/4 v6, 0x1

    if-eqz v4, :cond_12

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_a

    :cond_1
    :try_start_0
    iget-object v3, p0, Lrg/y1$i;->b:Lrg/y1;

    invoke-virtual {v3}, Lrg/y1;->D2()Lcom/roblox/client/a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roblox/client/a;->N1()Z

    move-result v3
    :try_end_0
    .catch Lrg/u0; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v3, :cond_2

    return v6

    :catch_0
    invoke-static {}, Lrg/y1;->v2()V

    :cond_2
    iget-object v3, p0, Lrg/y1$i;->b:Lrg/y1;

    invoke-static {v3, v2}, Lrg/y1;->p2(Lrg/y1;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    return v6

    :cond_3
    sget-object v3, Lcom/roblox/protocols/webview/DomainAllowListChecker;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker;

    invoke-virtual {v3}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->enableDomainAllowListChecker()Z

    move-result v3

    if-nez v3, :cond_4

    iget-object v3, p0, Lrg/y1$i;->b:Lrg/y1;

    invoke-static {v3, v2}, Lrg/y1;->r2(Lrg/y1;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    const-string v0, "Navigating social media Link..."

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return v6

    :cond_4
    invoke-static {}, Lrg/a1;->z0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v0, p0, Lrg/y1$i;->b:Lrg/y1;

    invoke-static {v0}, Lrg/y1;->o2(Lrg/y1;)Lrg/y1$h;

    return v6

    :cond_5
    invoke-static {v2}, Lrg/a1;->m0(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v3, p0, Lrg/y1$i;->b:Lrg/y1;

    invoke-static {v3}, Lrg/y1;->l2(Lrg/y1;)Z

    move-result v3

    if-nez v3, :cond_6

    const-string v3, "RWF.shouldOverrideUrlLoading() The URL is a LOGIN type!"

    invoke-static {v1, v3}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_1
    iget-object v1, p0, Lrg/y1$i;->b:Lrg/y1;

    invoke-virtual {v1}, Lrg/y1;->D2()Lcom/roblox/client/a;

    move-result-object v1

    iget-object v3, p0, Lrg/y1$i;->b:Lrg/y1;

    invoke-virtual {v3}, Landroidx/fragment/app/c;->w()Landroid/content/Context;

    move-result-object v3

    sget v5, Lrg/q0;->o:I

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v3, v5, v0}, Lpi/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v6}, Lcom/roblox/client/b;->L1(Ljava/lang/String;I)V
    :try_end_1
    .catch Lrg/u0; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    invoke-static {}, Lrg/y1;->v2()V

    :goto_0
    invoke-static {}, Lti/b;->f()Lti/b;

    move-result-object v0

    sget-object v1, Lti/b$d;->d:Lti/b$d;

    invoke-virtual {v0, v4, v1}, Lti/b;->i(Landroid/app/Activity;Lti/b$d;)V

    invoke-static {v2}, Lrg/a1;->V(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, Lti/h;->e()Lti/h;

    move-result-object v0

    new-instance v1, Lrg/y1$i$a;

    invoke-direct {v1, p0}, Lrg/y1$i$a;-><init>(Lrg/y1$i;)V

    invoke-virtual {v0, v1}, Lti/h;->d(Lci/m;)V

    return v6

    :cond_6
    iget-object v0, p0, Lrg/y1$i;->b:Lrg/y1;

    iget-object v0, v0, Lrg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object v0, p0, Lrg/y1$i;->b:Lrg/y1;

    invoke-static {v0, v2, v6}, Lrg/y1;->t2(Lrg/y1;Ljava/lang/String;Z)V

    const-string v0, "mobile-app-upgrades/buy?"

    invoke-virtual {v2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_f

    move-object v11, v4

    check-cast v11, Lcom/roblox/client/a;

    invoke-static {}, Ldk/c;->c()Ldk/c;

    move-result-object v0

    invoke-virtual {v0}, Ldk/c;->k()Ljava/lang/String;

    move-result-object v8

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v9

    const-string v0, "id"

    invoke-virtual {v9, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lek/t;->i()Z

    move-result v3

    const-string v4, "NullPointerException thrown while parsing paymentSession parameter for purchase url"

    const-string v5, "paymentSessionId"

    const-string v7, "rbx.purchaseflow"

    if-eqz v3, :cond_9

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->D5()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->W2()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {v9, v5}, Lek/e0;->c(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_1

    :cond_7
    :try_start_2
    invoke-virtual {v9, v5}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :catch_2
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UnsupportedOperationException thrown while parsing paymentSession parameter for purchase url "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v1, v0}, Lek/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    :catch_3
    invoke-static {v7, v4}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    invoke-static {v11}, Lgj/b;->a(Landroid/content/Context;)Lgj/b;

    :try_start_3
    iget-object v0, p0, Lrg/y1$i;->b:Lrg/y1;

    invoke-virtual {v0}, Lrg/y1;->D2()Lcom/roblox/client/a;

    move-result-object v0

    sget v1, Lrg/q0;->x1:I

    invoke-virtual {v0, v1}, Lcom/roblox/client/b;->T(I)V
    :try_end_3
    .catch Lrg/u0; {:try_start_3 .. :try_end_3} :catch_4

    goto/16 :goto_8

    :catch_4
    invoke-static {}, Lrg/y1;->v2()V

    goto/16 :goto_8

    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RobloxWebFragment to start an in-app purchase. Username = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v11}, Lgj/a;->a(Landroid/content/Context;)Lgj/a;

    :try_start_4
    iget-object v0, p0, Lrg/y1$i;->b:Lrg/y1;

    invoke-virtual {v0}, Lrg/y1;->D2()Lcom/roblox/client/a;

    move-result-object v0

    sget v1, Lrg/q0;->B1:I

    invoke-virtual {v0, v1}, Lcom/roblox/client/b;->T(I)V
    :try_end_4
    .catch Lrg/u0; {:try_start_4 .. :try_end_4} :catch_5

    goto/16 :goto_8

    :catch_5
    invoke-static {}, Lrg/y1;->v2()V

    goto/16 :goto_8

    :cond_9
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v2

    invoke-interface {v2}, Lrh/i;->O()Z

    move-result v2

    if-eqz v2, :cond_a

    const-string v2, "ctx"

    invoke-virtual {v9, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "type"

    invoke-virtual {v9, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v9, v5}, Lek/e0;->c(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-eqz v2, :cond_a

    if-eqz v3, :cond_a

    const-string v12, "subscription"

    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    const-string v1, "RobloxWebFragment to start an in-app subscription purchase."

    invoke-static {v7, v1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, "GooglePlayStore"

    invoke-static {v3, v0, v1, v10}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativePerformSubscriptionPurchase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v6

    :cond_a
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v2

    invoke-interface {v2}, Lrh/i;->H1()Z

    move-result v2

    const-string v3, "purchaseStart"

    if-eqz v2, :cond_b

    const-string v1, "PaymentsProtocolV2: tryStartInAppPurchase."

    invoke-static {v7, v1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v11}, Ldj/a0;->R(Landroid/content/Context;)Ldj/a0;

    move-result-object v7

    iget-object v1, p0, Lrg/y1$i;->b:Lrg/y1;

    invoke-virtual {v1}, Lrg/y1;->F2()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lrg/t0;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lrg/y1$i;->b:Lrg/y1;

    iget-object v12, v1, Lrg/y1;->y0:Lcj/o;

    new-instance v13, Lrg/z1;

    invoke-direct {v13, p0}, Lrg/z1;-><init>(Lrg/y1$i;)V

    move-object v10, v8

    move-object v8, v0

    invoke-interface/range {v7 .. v13}, Lcj/k;->e(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Le4/q;Lcj/o;Ljava/lang/Runnable;)V

    goto/16 :goto_8

    :cond_b
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v2

    invoke-interface {v2}, Lrh/i;->n3()Z

    move-result v2

    const-string v10, "UnsupportedOperationException thrown while parsing paymentSession parameter for purchase url"

    if-eqz v2, :cond_c

    sget-object v2, Lcom/roblox/client/purchase/IAPPurchaseManager;->l:Ljava/lang/String;

    invoke-static {v2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetMetricsPurchaseType(Ljava/lang/String;)V

    :try_start_5
    invoke-virtual {v9, v5}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_5
    .catch Ljava/lang/NullPointerException; {:try_start_5 .. :try_end_5} :catch_7
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_5 .. :try_end_5} :catch_6

    goto :goto_3

    :catch_6
    invoke-static {v7, v10}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :catch_7
    invoke-static {v7, v4}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :goto_2
    const-string v2, ""

    :goto_3
    invoke-static {v11}, Ldj/m;->F0(Landroid/content/Context;)Ldj/m;

    move-result-object v3

    invoke-interface {v3, v1}, Lcj/k;->i(Ljava/lang/String;)Z

    invoke-interface {v3, v6}, Lcj/k;->k(Z)V

    invoke-static {v6}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentsProtocolIsInApp(Z)V

    invoke-static {v2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentSessionId(Ljava/lang/String;)V

    invoke-interface {v3, v0}, Lcj/k;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetProviderCurrencyCode(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeBeginPaymentsProtocolPurchase(Ljava/lang/String;)V

    goto/16 :goto_8

    :cond_c
    invoke-static {v11}, Ldj/m;->F0(Landroid/content/Context;)Ldj/m;

    move-result-object v2

    if-nez v2, :cond_d

    :try_start_6
    iget-object v0, p0, Lrg/y1$i;->b:Lrg/y1;

    invoke-virtual {v0}, Lrg/y1;->D2()Lcom/roblox/client/a;

    move-result-object v0

    sget v1, Lrg/q0;->B1:I

    invoke-virtual {v0, v1}, Lcom/roblox/client/b;->T(I)V
    :try_end_6
    .catch Lrg/u0; {:try_start_6 .. :try_end_6} :catch_8

    goto/16 :goto_8

    :catch_8
    invoke-static {}, Lrg/y1;->v2()V

    goto :goto_8

    :cond_d
    iget-object v12, p0, Lrg/y1$i;->b:Lrg/y1;

    invoke-virtual {v12}, Lrg/y1;->F2()Ljava/lang/String;

    move-result-object v12

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v12, v3}, Lrg/t0;->d(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_7
    const-string v3, "recurring"

    invoke-virtual {v9, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_7
    .catch Ljava/lang/NullPointerException; {:try_start_7 .. :try_end_7} :catch_a
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_7 .. :try_end_7} :catch_9

    goto :goto_5

    :catch_9
    const-string v3, "UnsupportedOperationException thrown while parsing recurring parameter for purchase url"

    invoke-static {v7, v3}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :catch_a
    const-string v3, "NullPointerException thrown while parsing recurring parameter for purchase url"

    invoke-static {v7, v3}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :goto_4
    move-object v3, v1

    :goto_5
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    :try_start_8
    invoke-virtual {v9, v5}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_8
    .catch Ljava/lang/NullPointerException; {:try_start_8 .. :try_end_8} :catch_c
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_8 .. :try_end_8} :catch_b

    :goto_6
    move-object v13, v1

    goto :goto_7

    :catch_b
    invoke-static {v7, v10}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_6

    :catch_c
    invoke-static {v7, v4}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_6

    :goto_7
    iget-object v1, p0, Lrg/y1$i;->b:Lrg/y1;

    iget-object v1, v1, Lrg/y1;->y0:Lcj/o;

    move-object v9, v0

    move-object v7, v2

    move-object v10, v11

    move-object v11, v1

    invoke-interface/range {v7 .. v13}, Lcj/k;->b(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lcj/o;ZLjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_e

    :try_start_9
    iget-object v0, p0, Lrg/y1$i;->b:Lrg/y1;

    invoke-virtual {v0}, Lrg/y1;->D2()Lcom/roblox/client/a;

    move-result-object v0

    sget v1, Lrg/q0;->w1:I

    invoke-virtual {v0, v1}, Lcom/roblox/client/b;->T(I)V
    :try_end_9
    .catch Lrg/u0; {:try_start_9 .. :try_end_9} :catch_d

    goto :goto_8

    :catch_d
    invoke-static {}, Lrg/y1;->v2()V

    :cond_e
    :goto_8
    return v6

    :cond_f
    invoke-static/range {p2 .. p3}, Lrg/f2;->a(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_10

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v1

    invoke-interface {v1}, Lrh/i;->J0()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v1

    invoke-interface {v1}, Lrh/i;->d1()Z

    move-result v1

    if-eqz v1, :cond_10

    move/from16 v1, p4

    invoke-static {v2, v1}, Lrg/f2;->c(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-static {}, Lim/f;->F()Lim/f;

    move-result-object v0

    const-string v1, "android_webview"

    invoke-virtual {v0, v2, v1}, Lim/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_10
    move-object v3, v0

    new-instance v0, Lrg/a2;

    move-object v1, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lrg/a2;-><init>(Lrg/y1$i;Ljava/lang/String;Ljava/lang/String;Le4/q;Landroid/webkit/WebView;)V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v1

    invoke-interface {v1}, Lrh/i;->J0()Z

    move-result v1

    if-eqz v1, :cond_11

    if-eqz v3, :cond_11

    invoke-static {}, Lim/f;->F()Lim/f;

    move-result-object v1

    invoke-virtual {v1, v3, v0}, Lim/f;->o(Ljava/lang/String;Lim/f$k;)V

    goto :goto_9

    :cond_11
    invoke-static {}, Lim/f;->F()Lim/f;

    move-result-object v1

    invoke-virtual {v1, v2, v0}, Lim/f;->r(Ljava/lang/String;Lim/f$k;)V

    :goto_9
    return v6

    :cond_12
    :goto_a
    const-string v0, "RWF.shouldOverrideUrlLoading() activity is null or finishing"

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return v6
.end method

.method public final synthetic e()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lrg/y1$i;->b:Lrg/y1;

    invoke-virtual {v0}, Lrg/y1;->D2()Lcom/roblox/client/a;

    move-result-object v0

    sget v1, Lrg/q0;->w1:I

    invoke-virtual {v0, v1}, Lcom/roblox/client/b;->T(I)V
    :try_end_0
    .catch Lrg/u0; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    invoke-static {}, Lrg/y1;->v2()V

    return-void
.end method

.method public final synthetic f(Le4/q;Ljava/lang/String;Landroid/webkit/WebView;)V
    .locals 1

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lrg/y1$i;->b:Lrg/y1;

    invoke-static {p1}, Lrg/y1;->n2(Lrg/y1;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p3, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final synthetic g(Ljava/lang/String;Ljava/lang/String;Le4/q;Landroid/webkit/WebView;Z)V
    .locals 2

    if-eqz p5, :cond_3

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p3

    invoke-interface {p3}, Lrh/i;->d1()Z

    move-result p3

    const/4 p4, 0x0

    const-string p5, "android_webview"

    if-eqz p3, :cond_2

    invoke-static {}, Lim/f;->F()Lim/f;

    move-result-object p3

    invoke-virtual {p3, p1, p5, p4}, Lim/f;->z(Ljava/lang/String;Ljava/lang/String;Z)V

    if-nez p2, :cond_0

    invoke-virtual {p3, p1, p5}, Lim/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :cond_0
    invoke-static {}, Lev/c;->d()Lev/c;

    move-result-object p4

    new-instance p5, Lrg/y1$g;

    iget-object v0, p0, Lrg/y1$i;->b:Lrg/y1;

    invoke-direct {p5, v0}, Lrg/y1$g;-><init>(Lrg/y1;)V

    invoke-virtual {p4, p5}, Lev/c;->j(Ljava/lang/Object;)V

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_1

    invoke-virtual {p3, p2}, Lim/f;->j(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {p3, p1}, Lim/f;->m(Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-static {}, Lev/c;->d()Lev/c;

    move-result-object p2

    new-instance p3, Lrg/y1$g;

    iget-object v0, p0, Lrg/y1$i;->b:Lrg/y1;

    invoke-direct {p3, v0}, Lrg/y1$g;-><init>(Lrg/y1;)V

    invoke-virtual {p2, p3}, Lev/c;->j(Ljava/lang/Object;)V

    invoke-static {}, Lim/f;->F()Lim/f;

    move-result-object p2

    invoke-virtual {p2, p1, p5, p4}, Lim/f;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {}, Lim/f;->F()Lim/f;

    move-result-object p2

    invoke-virtual {p2, p1}, Lim/f;->k(Ljava/lang/String;)V

    return-void

    :cond_3
    if-eqz p2, :cond_4

    invoke-static {}, Lim/f;->F()Lim/f;

    move-result-object p5

    const-string v0, "success"

    const-string v1, "handled_in_webview"

    invoke-virtual {p5, p2, v0, v1}, Lim/f;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    sget-object p2, Lcom/roblox/protocols/webview/DomainAllowListChecker;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker;

    invoke-virtual {p2}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->enableDomainAllowListChecker()Z

    move-result p2

    if-eqz p2, :cond_5

    iget-object p2, p0, Lrg/y1$i;->b:Lrg/y1;

    invoke-static {p2, p1}, Lrg/y1;->s2(Lrg/y1;Ljava/lang/String;)V

    return-void

    :cond_5
    new-instance p2, Lrg/b2;

    invoke-direct {p2, p0, p3, p1, p4}, Lrg/b2;-><init>(Lrg/y1$i;Le4/q;Ljava/lang/String;Landroid/webkit/WebView;)V

    invoke-virtual {p3, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V

    invoke-static {}, Luk/h;->j()Luk/h;

    move-result-object p1

    invoke-static {}, Lrg/a1;->g()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Luk/h;->n(Ljava/lang/String;)V

    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lrg/y1$i;->b:Lrg/y1;

    invoke-static {v0}, Lrg/y1;->m2(Lrg/y1;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onPageFinished. url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.web"

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lrg/y1$i;->b:Lrg/y1;

    invoke-virtual {v0, p2}, Lrg/y1;->X2(Ljava/lang/String;)V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->S1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Luk/h;->j()Luk/h;

    move-result-object v0

    invoke-static {}, Lrg/a1;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Luk/h;->n(Ljava/lang/String;)V

    :cond_0
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->l2()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    :cond_1
    sget-object p1, Lcom/roblox/protocols/webview/DomainAllowListChecker;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker;

    invoke-virtual {p1}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->enableDomainAllowListChecker()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    iput-object p1, p0, Lrg/y1$i;->a:Ljava/lang/String;

    :cond_2
    invoke-static {}, Lth/m;->b()Lth/m;

    move-result-object p1

    invoke-virtual {p1, p2}, Lth/m;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lrg/y1$i;->b:Lrg/y1;

    iget-object p1, p1, Lrg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->reload()V

    :cond_3
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "-> "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p3, "rbx.web"

    invoke-static {p3, p1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lrg/y1$i;->b:Lrg/y1;

    invoke-virtual {p1, p2}, Lrg/y1;->W2(Ljava/lang/String;)V

    iget-object p1, p0, Lrg/y1$i;->b:Lrg/y1;

    invoke-static {p1}, Lrg/y1;->m2(Lrg/y1;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 2

    sget-object v0, Lcom/roblox/protocols/webview/DomainAllowListChecker;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker;

    invoke-virtual {v0}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->enableDomainAllowListChecker()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lrg/y1$i;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->hasGesture()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Skipping duplicate shouldOverrideUrlLoading call for URL: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "rbx.web"

    invoke-static {p2, p1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x1

    return p1

    :cond_0
    iput-object v0, p0, Lrg/y1$i;->a:Ljava/lang/String;

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->hasGesture()Z

    move-result v1

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result p2

    invoke-virtual {p0, p1, v0, v1, p2}, Lrg/y1$i;->d(Landroid/webkit/WebView;Ljava/lang/String;ZZ)Z

    move-result p1

    return p1

    :cond_1
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->hasGesture()Z

    move-result v1

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result p2

    invoke-virtual {p0, p1, v0, v1, p2}, Lrg/y1$i;->d(Landroid/webkit/WebView;Ljava/lang/String;ZZ)Z

    move-result p1

    return p1
.end method

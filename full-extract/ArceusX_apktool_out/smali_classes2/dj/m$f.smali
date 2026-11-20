.class public Ldj/m$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldj/m;->U1(Lcom/android/billingclient/api/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ldj/m;


# direct methods
.method public constructor <init>(Ldj/m;)V
    .locals 0

    iput-object p1, p0, Ldj/m$f;->a:Ldj/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/android/billingclient/api/d;)V
    .locals 1

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result p1

    const-string v0, "rbx.purchaseflow"

    if-nez p1, :cond_0

    const-string p1, "Google Billing Client is setup"

    invoke-static {v0, p1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Ldj/m$f;->a:Ldj/m;

    sget-object v0, Ldj/m$o;->c:Ldj/m$o;

    invoke-static {p1, v0}, Ldj/m;->G(Ldj/m;Ldj/m$o;)V

    goto :goto_0

    :cond_0
    const-string p1, "Google Billing Client is not setup"

    invoke-static {v0, p1}, Lek/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Ldj/m$f;->a:Ldj/m;

    sget-object v0, Ldj/m$o;->a:Ldj/m$o;

    invoke-static {p1, v0}, Ldj/m;->G(Ldj/m;Ldj/m$o;)V

    :goto_0
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->n3()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Ldj/m$f;->a:Ldj/m;

    invoke-static {p1}, Ldj/m;->w(Ldj/m;)Ldj/h0;

    move-result-object p1

    const-string v0, "fff"

    invoke-interface {p1, v0}, Ldj/h0;->e(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Ldj/m$f;->a:Ldj/m;

    invoke-static {p1}, Ldj/m;->w(Ldj/m;)Ldj/h0;

    move-result-object p1

    const-string v0, "subscriptions"

    invoke-interface {p1, v0}, Ldj/h0;->e(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_1

    iget-object p1, p0, Ldj/m$f;->a:Ldj/m;

    invoke-static {p1, v0}, Ldj/m;->e0(Ldj/m;Ldj/m$r;)V

    :cond_1
    iget-object p1, p0, Ldj/m$f;->a:Ldj/m;

    invoke-static {p1, v0}, Ldj/m;->d0(Ldj/m;Ldj/m$r;)V

    :cond_2
    return-void
.end method

.method public b()V
    .locals 2

    const-string v0, "rbx.purchaseflow"

    const-string v1, "Google Billing Client disconnected"

    invoke-static {v0, v1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Ldj/m$f;->a:Ldj/m;

    sget-object v1, Ldj/m$o;->a:Ldj/m$o;

    invoke-static {v0, v1}, Ldj/m;->G(Ldj/m;Ldj/m$o;)V

    return-void
.end method

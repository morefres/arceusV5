.class public Ldj/m$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcj/r$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldj/m;->j1(Lv7/k;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lv7/k;

.field public final synthetic b:Ldj/m;


# direct methods
.method public constructor <init>(Ldj/m;Lv7/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ldj/m$l;->b:Ldj/m;

    iput-object p2, p0, Ldj/m$l;->a:Lv7/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcj/r$b;Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)V
    .locals 7

    iget-object v0, p0, Ldj/m$l;->b:Ldj/m;

    invoke-static {v0}, Ldj/m;->B(Ldj/m;)Lti/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "VerifyPurchase. Response="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ".ReceiptId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ldj/m$l;->a:Lv7/k;

    invoke-virtual {v2}, Lv7/k;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lti/g;->l(Ljava/lang/String;)V

    iget-object v0, p0, Ldj/m$l;->b:Ldj/m;

    invoke-static {v0}, Ldj/m;->A(Ldj/m;)Lcj/o;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldj/m$l;->b:Ldj/m;

    invoke-static {v0}, Ldj/m;->A(Ldj/m;)Lcj/o;

    move-result-object v0

    invoke-interface {v0}, Lcj/o;->e()V

    :cond_0
    sget-object v0, Lcj/r$b;->a:Lcj/r$b;

    if-eq p1, v0, :cond_1

    iget-object v0, p0, Ldj/m$l;->a:Lv7/k;

    invoke-virtual {v0}, Lv7/k;->i()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ldj/m$l;->b:Ldj/m;

    invoke-static {v0}, Ldj/m;->q0(Ldj/m;)V

    :cond_1
    sget-object v0, Ldj/m$e;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 p2, 0x2

    if-eq p1, p2, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    iget-object p1, p0, Ldj/m$l;->b:Ldj/m;

    invoke-static {p1}, Ldj/m;->u0(Ldj/m;)V

    iget-object p1, p0, Ldj/m$l;->b:Ldj/m;

    iget-object p2, p0, Ldj/m$l;->a:Lv7/k;

    invoke-virtual {p1, p2}, Ldj/m;->v0(Lv7/k;)Ljava/lang/String;

    move-result-object p2

    sget-object v0, Ldj/e$b;->w:Ldj/e$b;

    const-string v1, "launchVerifyPurchaseReceipt unknown error"

    invoke-static {p1, p2, v0, v1}, Ldj/m;->c0(Ldj/m;Ljava/lang/String;Ldj/e$b;Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object p1, p0, Ldj/m$l;->b:Ldj/m;

    invoke-static {p1}, Ldj/m;->s0(Ldj/m;)V

    iget-object p1, p0, Ldj/m$l;->b:Ldj/m;

    iget-object p2, p0, Ldj/m$l;->a:Lv7/k;

    invoke-virtual {p1, p2}, Ldj/m;->v0(Lv7/k;)Ljava/lang/String;

    move-result-object p2

    sget-object v0, Ldj/e$b;->q:Ldj/e$b;

    const-string v1, "launchVerifyPurchaseReceipt empty response"

    invoke-static {p1, p2, v0, v1}, Ldj/m;->c0(Ldj/m;Ljava/lang/String;Ldj/e$b;Ljava/lang/String;)V

    return-void

    :cond_3
    iget-object p1, p0, Ldj/m$l;->b:Ldj/m;

    invoke-static {p1}, Ldj/m;->t0(Ldj/m;)V

    iget-object p1, p0, Ldj/m$l;->b:Ldj/m;

    iget-object p2, p0, Ldj/m$l;->a:Lv7/k;

    invoke-virtual {p1, p2}, Ldj/m;->v0(Lv7/k;)Ljava/lang/String;

    move-result-object p2

    sget-object v0, Ldj/e$b;->p:Ldj/e$b;

    const-string v1, "launchVerifyPurchaseReceipt error"

    invoke-static {p1, p2, v0, v1}, Ldj/m;->c0(Ldj/m;Ljava/lang/String;Ldj/e$b;Ljava/lang/String;)V

    return-void

    :cond_4
    iget-object p1, p0, Ldj/m$l;->b:Ldj/m;

    iget-object v0, p0, Ldj/m$l;->a:Lv7/k;

    invoke-virtual {p1, v0}, Ldj/m;->v0(Lv7/k;)Ljava/lang/String;

    move-result-object v2

    iget-object p1, p0, Ldj/m$l;->b:Ldj/m;

    iget-object v0, p0, Ldj/m$l;->a:Lv7/k;

    invoke-static {p1, v0}, Ldj/m;->X(Ldj/m;Lv7/k;)Z

    move-result p1

    if-eqz p1, :cond_7

    const-string p1, "Receipt Verification Successful for Subscription"

    const-string v0, "rbx.purchaseflow"

    invoke-static {v0, p1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Ldj/m$l;->b:Ldj/m;

    invoke-static {p1, v2}, Ldj/m;->W(Ldj/m;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, Ldk/c;->c()Ldk/c;

    move-result-object p1

    invoke-static {}, Ldk/c;->c()Ldk/c;

    move-result-object v1

    invoke-virtual {v1}, Ldk/c;->f()I

    move-result v1

    invoke-static {v2}, Lcj/p;->e(Ljava/lang/String;)I

    move-result v3

    add-int/2addr v1, v3

    invoke-virtual {p1, v1}, Ldk/c;->t(I)V

    :cond_5
    iget-object p1, p0, Ldj/m$l;->b:Ldj/m;

    iget-object v1, p0, Ldj/m$l;->a:Lv7/k;

    invoke-static {p1, v1}, Ldj/m;->X(Ldj/m;Lv7/k;)Z

    move-result p1

    iget-object v1, p0, Ldj/m$l;->b:Ldj/m;

    invoke-static {v1, v2, p1}, Ldj/m;->Q(Ldj/m;Ljava/lang/String;Z)Lcom/android/billingclient/api/e;

    move-result-object v1

    iget-object v3, p0, Ldj/m$l;->b:Ldj/m;

    const/4 v4, 0x0

    invoke-static {v3, v2, v1, p1, v4}, Ldj/m;->a0(Ldj/m;Ljava/lang/String;Lcom/android/billingclient/api/e;ZZ)Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v0, p0, Ldj/m$l;->b:Ldj/m;

    invoke-static {v0}, Ldj/m;->B(Ldj/m;)Lti/g;

    move-result-object v0

    invoke-static {v1, p1}, Ldj/m;->K0(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Ldj/m$l;->b:Ldj/m;

    invoke-static {v4, v1, p1}, Ldj/m;->R(Ldj/m;Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, p1}, Ldj/m;->L0(Lcom/android/billingclient/api/e;Z)J

    move-result-wide v5

    move-object v1, v0

    invoke-virtual/range {v1 .. v6}, Lti/g;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    goto :goto_0

    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to find skuDetails: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    :goto_0
    iget-object p1, p0, Ldj/m$l;->b:Ldj/m;

    iget-object v0, p0, Ldj/m$l;->a:Lv7/k;

    invoke-static {p1, v0, p2}, Ldj/m;->K(Ldj/m;Lv7/k;Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)V

    return-void
.end method

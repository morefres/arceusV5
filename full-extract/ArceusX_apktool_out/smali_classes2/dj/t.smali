.class public final synthetic Ldj/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/c;


# instance fields
.field public final synthetic a:Ldj/a0;

.field public final synthetic b:Lv7/k;

.field public final synthetic c:Z

.field public final synthetic d:Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;


# direct methods
.method public synthetic constructor <init>(Ldj/a0;Lv7/k;ZLcom/roblox/client/purchase/model/PurchaseVerificationResponse;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldj/t;->a:Ldj/a0;

    iput-object p2, p0, Ldj/t;->b:Lv7/k;

    iput-boolean p3, p0, Ldj/t;->c:Z

    iput-object p4, p0, Ldj/t;->d:Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/billingclient/api/d;)V
    .locals 4

    iget-object v0, p0, Ldj/t;->a:Ldj/a0;

    iget-object v1, p0, Ldj/t;->b:Lv7/k;

    iget-boolean v2, p0, Ldj/t;->c:Z

    iget-object v3, p0, Ldj/t;->d:Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;

    invoke-static {v0, v1, v2, v3, p1}, Ldj/a0;->w(Ldj/a0;Lv7/k;ZLcom/roblox/client/purchase/model/PurchaseVerificationResponse;Lcom/android/billingclient/api/d;)V

    return-void
.end method

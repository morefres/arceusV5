.class public final synthetic Ldj/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcj/r$c;


# instance fields
.field public final synthetic a:Ldj/a0;

.field public final synthetic b:Lv7/k;


# direct methods
.method public synthetic constructor <init>(Ldj/a0;Lv7/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldj/s;->a:Ldj/a0;

    iput-object p2, p0, Ldj/s;->b:Lv7/k;

    return-void
.end method


# virtual methods
.method public final a(Lcj/r$b;Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)V
    .locals 2

    iget-object v0, p0, Ldj/s;->a:Ldj/a0;

    iget-object v1, p0, Ldj/s;->b:Lv7/k;

    invoke-static {v0, v1, p1, p2}, Ldj/a0;->z(Ldj/a0;Lv7/k;Lcj/r$b;Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)V

    return-void
.end method

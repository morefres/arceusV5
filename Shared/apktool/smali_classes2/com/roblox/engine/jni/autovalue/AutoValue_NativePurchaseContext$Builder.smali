.class final Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext$Builder;
.super Lcom/roblox/engine/jni/autovalue/NativePurchaseContext$Builder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private isInApp:Z

.field private paymentSessionId:Ljava/lang/String;

.field private purchaseType:Ljava/lang/String;

.field private set$0:B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/engine/jni/autovalue/NativePurchaseContext$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/roblox/engine/jni/autovalue/NativePurchaseContext;
    .locals 5

    iget-byte v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext$Builder;->set$0:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext$Builder;->purchaseType:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext;

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext$Builder;->paymentSessionId:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext$Builder;->isInApp:Z

    const/4 v4, 0x0

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext;-><init>(Ljava/lang/String;Ljava/lang/String;ZLcom/roblox/engine/jni/autovalue/b;)V

    return-object v1

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext$Builder;->purchaseType:Ljava/lang/String;

    if-nez v2, :cond_2

    const-string v2, " purchaseType"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-byte v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext$Builder;->set$0:B

    and-int/2addr v1, v2

    if-nez v1, :cond_3

    const-string v1, " isInApp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public setIsInApp(Z)Lcom/roblox/engine/jni/autovalue/NativePurchaseContext$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext$Builder;->isInApp:Z

    iget-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext$Builder;->set$0:B

    or-int/lit8 p1, p1, 0x1

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext$Builder;->set$0:B

    return-object p0
.end method

.method public setPaymentSessionId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/NativePurchaseContext$Builder;
    .locals 0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext$Builder;->paymentSessionId:Ljava/lang/String;

    return-object p0
.end method

.method public setPurchaseType(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/NativePurchaseContext$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext$Builder;->purchaseType:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null purchaseType"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

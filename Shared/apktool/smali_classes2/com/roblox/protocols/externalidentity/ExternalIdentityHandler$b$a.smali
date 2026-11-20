.class public final Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lmu/i;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    iput-wide p1, p0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b$a;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ldm/g;Lmt/b;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldm/g;",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p2, Ldm/g$c;->a:Ldm/g$c;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    sget-object p2, Ldm/g$a;->a:Ldm/g$a;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->INSTANCE:Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;

    iget-wide v0, p0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b$a;->a:J

    invoke-static {p1, v0, v1}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->access$onGoogleProofCancelled(Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;J)V

    goto :goto_0

    :cond_0
    instance-of p2, p1, Ldm/g$b;

    if-eqz p2, :cond_1

    sget-object p2, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->INSTANCE:Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;

    iget-wide v0, p0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b$a;->a:J

    check-cast p1, Ldm/g$b;

    invoke-virtual {p1}, Ldm/g$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, v0, v1, p1}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->access$onGoogleProofError(Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;JLjava/lang/String;)V

    goto :goto_0

    :cond_1
    instance-of p2, p1, Ldm/g$d;

    if-eqz p2, :cond_2

    sget-object p2, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->INSTANCE:Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;

    iget-wide v0, p0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b$a;->a:J

    check-cast p1, Ldm/g$d;

    invoke-virtual {p1}, Ldm/g$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, v0, v1, p1}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->access$onGoogleProofSuccess(Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;JLjava/lang/String;)V

    goto :goto_0

    :cond_2
    new-instance p1, Lgt/l;

    invoke-direct {p1}, Lgt/l;-><init>()V

    throw p1

    :cond_3
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldm/g;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b$a;->b(Ldm/g;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

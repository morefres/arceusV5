.class public Lcom/roblox/client/implementation/AppImplementations;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvj/a;
.implements Lyi/a;
.implements Lii/a;
.implements Lyg/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAppsFlyerManager()Lti/d;
    .locals 1

    invoke-static {}, Lcom/roblox/client/appsflyer/a;->I()Lcom/roblox/client/appsflyer/a;

    move-result-object v0

    return-object v0
.end method

.method public getIdentityProtocol()Lgm/f;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {}, Lgm/f;->z()Lgm/f;

    move-result-object v0

    return-object v0
.end method

.method public getPermissionsProtocol()Lmm/k;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {}, Lmm/r;->f0()Lmm/r;

    move-result-object v0

    return-object v0
.end method

.method public getRtcAudioManager(Landroid/content/Context;)Lyg/a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lyg/c;

    invoke-direct {v0, p1}, Lyg/c;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

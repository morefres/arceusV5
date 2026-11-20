.class public Lok/a;
.super Lcom/roblox/engine/jni/model/PlatformParams;
.source "SourceFile"


# instance fields
.field public isLuaChatEnabled:Z

.field public isLuaGamesPageEnabled:Z

.field public isLuaHomePageEnabled:Z

.field public isTablet:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lok/a;-><init>(Lcom/roblox/engine/jni/model/PlatformParams;)V

    return-void
.end method

.method public constructor <init>(Lcom/roblox/engine/jni/model/PlatformParams;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/roblox/engine/jni/model/PlatformParams;-><init>()V

    .line 3
    invoke-virtual {p0, p1}, Lok/a;->a(Lcom/roblox/engine/jni/model/PlatformParams;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/roblox/engine/jni/model/PlatformParams;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/roblox/engine/jni/model/PlatformParams;->a(Lcom/roblox/engine/jni/model/PlatformParams;)V

    instance-of v0, p1, Lok/a;

    if-eqz v0, :cond_0

    check-cast p1, Lok/a;

    invoke-virtual {p0, p1}, Lok/a;->b(Lok/a;)V

    :cond_0
    return-void
.end method

.method public final b(Lok/a;)V
    .locals 1

    iget-boolean v0, p1, Lok/a;->isLuaHomePageEnabled:Z

    iput-boolean v0, p0, Lok/a;->isLuaHomePageEnabled:Z

    iget-boolean v0, p1, Lok/a;->isLuaGamesPageEnabled:Z

    iput-boolean v0, p0, Lok/a;->isLuaGamesPageEnabled:Z

    iget-boolean v0, p1, Lok/a;->isLuaChatEnabled:Z

    iput-boolean v0, p0, Lok/a;->isLuaChatEnabled:Z

    iget-boolean p1, p1, Lok/a;->isTablet:Z

    iput-boolean p1, p0, Lok/a;->isTablet:Z

    return-void
.end method

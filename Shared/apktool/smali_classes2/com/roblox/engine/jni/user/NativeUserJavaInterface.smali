.class public Lcom/roblox/engine/jni/user/NativeUserJavaInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static sImplementation:Lqk/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getAlternateName()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/user/NativeUserJavaInterface;->sImplementation:Lqk/a;

    invoke-virtual {v0}, Lqk/a;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getDisplayName()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/user/NativeUserJavaInterface;->sImplementation:Lqk/a;

    invoke-virtual {v0}, Lqk/a;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getHasRobloxSubscription()Z
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/user/NativeUserJavaInterface;->sImplementation:Lqk/a;

    invoke-virtual {v0}, Lqk/a;->h()Z

    move-result v0

    return v0
.end method

.method public static getIsUnder13()Z
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/user/NativeUserJavaInterface;->sImplementation:Lqk/a;

    invoke-virtual {v0}, Lqk/a;->i()Z

    move-result v0

    return v0
.end method

.method public static getMembershipType()I
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/user/NativeUserJavaInterface;->sImplementation:Lqk/a;

    invoke-virtual {v0}, Lqk/a;->c()I

    move-result v0

    return v0
.end method

.method public static getPlatformName()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/user/NativeUserJavaInterface;->sImplementation:Lqk/a;

    invoke-virtual {v0}, Lqk/a;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getTheme()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/user/NativeUserJavaInterface;->sImplementation:Lqk/a;

    invoke-virtual {v0}, Lqk/a;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getUserId()J
    .locals 2

    sget-object v0, Lcom/roblox/engine/jni/user/NativeUserJavaInterface;->sImplementation:Lqk/a;

    invoke-virtual {v0}, Lqk/a;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public static getUsername()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/user/NativeUserJavaInterface;->sImplementation:Lqk/a;

    invoke-virtual {v0}, Lqk/a;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static setImplementation(Lqk/a;)V
    .locals 0

    if-eqz p0, :cond_0

    sput-object p0, Lcom/roblox/engine/jni/user/NativeUserJavaInterface;->sImplementation:Lqk/a;

    :cond_0
    return-void
.end method

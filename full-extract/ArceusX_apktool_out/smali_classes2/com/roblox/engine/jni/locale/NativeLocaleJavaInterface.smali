.class public Lcom/roblox/engine/jni/locale/NativeLocaleJavaInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static sImplementation:Lnk/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnk/a;

    invoke-direct {v0}, Lnk/a;-><init>()V

    sput-object v0, Lcom/roblox/engine/jni/locale/NativeLocaleJavaInterface;->sImplementation:Lnk/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getGameLocale()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/locale/NativeLocaleJavaInterface;->sImplementation:Lnk/a;

    invoke-virtual {v0}, Lnk/a;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getLocale()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/locale/NativeLocaleJavaInterface;->sImplementation:Lnk/a;

    invoke-virtual {v0}, Lnk/a;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getRobloxLocale()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/locale/NativeLocaleJavaInterface;->sImplementation:Lnk/a;

    invoke-virtual {v0}, Lnk/a;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static setImplementation(Lnk/a;)V
    .locals 0

    sput-object p0, Lcom/roblox/engine/jni/locale/NativeLocaleJavaInterface;->sImplementation:Lnk/a;

    return-void
.end method

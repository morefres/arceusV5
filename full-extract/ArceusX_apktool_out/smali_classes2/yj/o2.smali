.class public final enum Lyj/o2;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lyj/o2;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lyj/o2;

.field public static final enum b:Lyj/o2;

.field public static final synthetic c:[Lyj/o2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lyj/o2;

    const-string v1, "ROBLOX"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lyj/o2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyj/o2;->a:Lyj/o2;

    new-instance v0, Lyj/o2;

    const-string v1, "ZSTD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lyj/o2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyj/o2;->b:Lyj/o2;

    invoke-static {}, Lyj/o2;->a()[Lyj/o2;

    move-result-object v0

    sput-object v0, Lyj/o2;->c:[Lyj/o2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic a()[Lyj/o2;
    .locals 2

    sget-object v0, Lyj/o2;->a:Lyj/o2;

    sget-object v1, Lyj/o2;->b:Lyj/o2;

    filled-new-array {v0, v1}, [Lyj/o2;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lyj/o2;
    .locals 1

    const-class v0, Lyj/o2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lyj/o2;

    return-object p0
.end method

.method public static values()[Lyj/o2;
    .locals 1

    sget-object v0, Lyj/o2;->c:[Lyj/o2;

    invoke-virtual {v0}, [Lyj/o2;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lyj/o2;

    return-object v0
.end method

.class public final enum Ljk/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljk/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Ljk/f;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "d",
        "e",
        "NativeShell_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum a:Ljk/f;

.field public static final enum b:Ljk/f;

.field public static final enum c:Ljk/f;

.field public static final enum d:Ljk/f;

.field public static final enum e:Ljk/f;

.field public static final synthetic f:[Ljk/f;

.field public static final synthetic g:Lpt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljk/f;

    const-string v1, "Update"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljk/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljk/f;->a:Ljk/f;

    new-instance v0, Ljk/f;

    const-string v1, "Remove"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljk/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljk/f;->b:Ljk/f;

    new-instance v0, Ljk/f;

    const-string v1, "SizeChange"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ljk/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljk/f;->c:Ljk/f;

    new-instance v0, Ljk/f;

    const-string v1, "Enable"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ljk/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljk/f;->d:Ljk/f;

    new-instance v0, Ljk/f;

    const-string v1, "Disable"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ljk/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljk/f;->e:Ljk/f;

    invoke-static {}, Ljk/f;->a()[Ljk/f;

    move-result-object v0

    sput-object v0, Ljk/f;->f:[Ljk/f;

    invoke-static {v0}, Lpt/b;->a([Ljava/lang/Enum;)Lpt/a;

    move-result-object v0

    sput-object v0, Ljk/f;->g:Lpt/a;

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

.method public static final synthetic a()[Ljk/f;
    .locals 5

    sget-object v0, Ljk/f;->a:Ljk/f;

    sget-object v1, Ljk/f;->b:Ljk/f;

    sget-object v2, Ljk/f;->c:Ljk/f;

    sget-object v3, Ljk/f;->d:Ljk/f;

    sget-object v4, Ljk/f;->e:Ljk/f;

    filled-new-array {v0, v1, v2, v3, v4}, [Ljk/f;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljk/f;
    .locals 1

    const-class v0, Ljk/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljk/f;

    return-object p0
.end method

.method public static values()[Ljk/f;
    .locals 1

    sget-object v0, Ljk/f;->f:[Ljk/f;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljk/f;

    return-object v0
.end method

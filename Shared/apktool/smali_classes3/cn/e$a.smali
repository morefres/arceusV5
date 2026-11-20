.class public final enum Lcn/e$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcn/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcn/e$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcn/e$a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "wf1-container-common"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum a:Lcn/e$a;

.field public static final enum b:Lcn/e$a;

.field public static final enum c:Lcn/e$a;

.field public static final synthetic d:[Lcn/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcn/e$a;

    const-string v1, "POSITIVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcn/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcn/e$a;->a:Lcn/e$a;

    new-instance v0, Lcn/e$a;

    const-string v1, "NEGATIVE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcn/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcn/e$a;->b:Lcn/e$a;

    new-instance v0, Lcn/e$a;

    const-string v1, "NEUTRAL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcn/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcn/e$a;->c:Lcn/e$a;

    invoke-static {}, Lcn/e$a;->a()[Lcn/e$a;

    move-result-object v0

    sput-object v0, Lcn/e$a;->d:[Lcn/e$a;

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

.method public static final synthetic a()[Lcn/e$a;
    .locals 3

    sget-object v0, Lcn/e$a;->a:Lcn/e$a;

    sget-object v1, Lcn/e$a;->b:Lcn/e$a;

    sget-object v2, Lcn/e$a;->c:Lcn/e$a;

    filled-new-array {v0, v1, v2}, [Lcn/e$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcn/e$a;
    .locals 1

    const-class v0, Lcn/e$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcn/e$a;

    return-object p0
.end method

.method public static values()[Lcn/e$a;
    .locals 1

    sget-object v0, Lcn/e$a;->d:[Lcn/e$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcn/e$a;

    return-object v0
.end method

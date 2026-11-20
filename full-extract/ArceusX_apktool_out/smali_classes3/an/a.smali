.class public final enum Lan/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lan/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lan/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0087\u0001\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lan/a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "c",
        "d",
        "e",
        "wf1-container-android"
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
.field public static final a:Lan/a$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lan/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum c:Lan/a;

.field public static final enum d:Lan/a;

.field public static final enum e:Lan/a;

.field public static final synthetic f:[Lan/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lan/a;

    const-string v1, "None"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lan/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lan/a;->c:Lan/a;

    new-instance v1, Lan/a;

    const-string v2, "First"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lan/a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lan/a;->d:Lan/a;

    new-instance v1, Lan/a;

    const-string v2, "Other"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lan/a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lan/a;->e:Lan/a;

    invoke-static {}, Lan/a;->a()[Lan/a;

    move-result-object v1

    sput-object v1, Lan/a;->f:[Lan/a;

    new-instance v1, Lan/a$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lan/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lan/a;->a:Lan/a$a;

    sput-object v0, Lan/a;->b:Lan/a;

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

.method public static final synthetic a()[Lan/a;
    .locals 3

    sget-object v0, Lan/a;->c:Lan/a;

    sget-object v1, Lan/a;->d:Lan/a;

    sget-object v2, Lan/a;->e:Lan/a;

    filled-new-array {v0, v1, v2}, [Lan/a;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic b()Lan/a;
    .locals 1

    sget-object v0, Lan/a;->b:Lan/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lan/a;
    .locals 1

    const-class v0, Lan/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lan/a;

    return-object p0
.end method

.method public static values()[Lan/a;
    .locals 1

    sget-object v0, Lan/a;->f:[Lan/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lan/a;

    return-object v0
.end method

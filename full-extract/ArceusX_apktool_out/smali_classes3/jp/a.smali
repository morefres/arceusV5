.class public final enum Ljp/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljp/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljp/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\u0008j\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Ljp/a;",
        "",
        "",
        "rawValue",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "a",
        "Ljava/lang/String;",
        "c",
        "()Ljava/lang/String;",
        "b",
        "d",
        "e",
        "jp-my-number_release"
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
.field public static final b:Ljp/a$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum c:Ljp/a;

.field public static final enum d:Ljp/a;

.field public static final enum e:Ljp/a;

.field public static final synthetic f:[Ljp/a;

.field public static final synthetic g:Lpt/a;


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljp/a;

    const/4 v1, 0x0

    const-string v2, "sha256"

    const-string v3, "Sha256"

    invoke-direct {v0, v3, v1, v2}, Ljp/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ljp/a;->c:Ljp/a;

    new-instance v0, Ljp/a;

    const/4 v1, 0x1

    const-string v2, "sha384"

    const-string v3, "Sha384"

    invoke-direct {v0, v3, v1, v2}, Ljp/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ljp/a;->d:Ljp/a;

    new-instance v0, Ljp/a;

    const/4 v1, 0x2

    const-string v2, "sha512"

    const-string v3, "Sha512"

    invoke-direct {v0, v3, v1, v2}, Ljp/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ljp/a;->e:Ljp/a;

    invoke-static {}, Ljp/a;->a()[Ljp/a;

    move-result-object v0

    sput-object v0, Ljp/a;->f:[Ljp/a;

    invoke-static {v0}, Lpt/b;->a([Ljava/lang/Enum;)Lpt/a;

    move-result-object v0

    sput-object v0, Ljp/a;->g:Lpt/a;

    new-instance v0, Ljp/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljp/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ljp/a;->b:Ljp/a$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ljp/a;->a:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a()[Ljp/a;
    .locals 3

    sget-object v0, Ljp/a;->c:Ljp/a;

    sget-object v1, Ljp/a;->d:Ljp/a;

    sget-object v2, Ljp/a;->e:Ljp/a;

    filled-new-array {v0, v1, v2}, [Ljp/a;

    move-result-object v0

    return-object v0
.end method

.method public static b()Lpt/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lpt/a<",
            "Ljp/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Ljp/a;->g:Lpt/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljp/a;
    .locals 1

    const-class v0, Ljp/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljp/a;

    return-object p0
.end method

.method public static values()[Ljp/a;
    .locals 1

    sget-object v0, Ljp/a;->f:[Ljp/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljp/a;

    return-object v0
.end method


# virtual methods
.method public final c()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Ljp/a;->a:Ljava/lang/String;

    return-object v0
.end method

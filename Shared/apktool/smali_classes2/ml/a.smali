.class public final enum Lml/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lml/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lml/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0008B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lml/a;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "toString",
        "()Ljava/lang/String;",
        "a",
        "Ljava/lang/String;",
        "b",
        "c",
        "d",
        "e",
        "theme"
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
.field public static final b:Lml/a$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum c:Lml/a;

.field public static final enum d:Lml/a;

.field public static final enum e:Lml/a;

.field public static final synthetic f:[Lml/a;

.field public static final synthetic g:Lpt/a;


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lml/a;

    const/4 v1, 0x0

    const-string v2, "Light"

    const-string v3, "LIGHT"

    invoke-direct {v0, v3, v1, v2}, Lml/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lml/a;->c:Lml/a;

    new-instance v0, Lml/a;

    const/4 v1, 0x1

    const-string v2, "Dark"

    const-string v3, "DARK"

    invoke-direct {v0, v3, v1, v2}, Lml/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lml/a;->d:Lml/a;

    new-instance v0, Lml/a;

    const/4 v1, 0x2

    const-string v2, "Classic"

    const-string v3, "CLASSIC"

    invoke-direct {v0, v3, v1, v2}, Lml/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lml/a;->e:Lml/a;

    invoke-static {}, Lml/a;->a()[Lml/a;

    move-result-object v0

    sput-object v0, Lml/a;->f:[Lml/a;

    invoke-static {v0}, Lpt/b;->a([Ljava/lang/Enum;)Lpt/a;

    move-result-object v0

    sput-object v0, Lml/a;->g:Lpt/a;

    new-instance v0, Lml/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lml/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lml/a;->b:Lml/a$a;

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

    iput-object p3, p0, Lml/a;->a:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a()[Lml/a;
    .locals 3

    sget-object v0, Lml/a;->c:Lml/a;

    sget-object v1, Lml/a;->d:Lml/a;

    sget-object v2, Lml/a;->e:Lml/a;

    filled-new-array {v0, v1, v2}, [Lml/a;

    move-result-object v0

    return-object v0
.end method

.method public static final b(Ljava/lang/String;)Lml/a;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lml/a;->b:Lml/a$a;

    invoke-virtual {v0, p0}, Lml/a$a;->a(Ljava/lang/String;)Lml/a;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lml/a;
    .locals 1

    const-class v0, Lml/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lml/a;

    return-object p0
.end method

.method public static values()[Lml/a;
    .locals 1

    sget-object v0, Lml/a;->f:[Lml/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lml/a;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lml/a;->a:Ljava/lang/String;

    return-object v0
.end method

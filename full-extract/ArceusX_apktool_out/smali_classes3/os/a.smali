.class public final enum Los/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Los/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Los/a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "operations-stdlib_release"
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
.field public static final enum a:Los/a;

.field public static final enum b:Los/a;

.field public static final enum c:Los/a;

.field public static final enum d:Los/a;

.field public static final enum e:Los/a;

.field public static final enum f:Los/a;

.field public static final enum g:Los/a;

.field public static final synthetic h:[Los/a;

.field public static final synthetic i:Lpt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Los/a;

    const-string v1, "MILLISECOND"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Los/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Los/a;->a:Los/a;

    new-instance v0, Los/a;

    const-string v1, "SECOND"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Los/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Los/a;->b:Los/a;

    new-instance v0, Los/a;

    const-string v1, "MINUTE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Los/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Los/a;->c:Los/a;

    new-instance v0, Los/a;

    const-string v1, "HOUR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Los/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Los/a;->d:Los/a;

    new-instance v0, Los/a;

    const-string v1, "DAY"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Los/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Los/a;->e:Los/a;

    new-instance v0, Los/a;

    const-string v1, "MONTH"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Los/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Los/a;->f:Los/a;

    new-instance v0, Los/a;

    const-string v1, "YEAR"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Los/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Los/a;->g:Los/a;

    invoke-static {}, Los/a;->a()[Los/a;

    move-result-object v0

    sput-object v0, Los/a;->h:[Los/a;

    invoke-static {v0}, Lpt/b;->a([Ljava/lang/Enum;)Lpt/a;

    move-result-object v0

    sput-object v0, Los/a;->i:Lpt/a;

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

.method public static final synthetic a()[Los/a;
    .locals 7

    sget-object v0, Los/a;->a:Los/a;

    sget-object v1, Los/a;->b:Los/a;

    sget-object v2, Los/a;->c:Los/a;

    sget-object v3, Los/a;->d:Los/a;

    sget-object v4, Los/a;->e:Los/a;

    sget-object v5, Los/a;->f:Los/a;

    sget-object v6, Los/a;->g:Los/a;

    filled-new-array/range {v0 .. v6}, [Los/a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Los/a;
    .locals 1

    const-class v0, Los/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Los/a;

    return-object p0
.end method

.method public static values()[Los/a;
    .locals 1

    sget-object v0, Los/a;->h:[Los/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Los/a;

    return-object v0
.end method

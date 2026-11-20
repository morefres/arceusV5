.class public final enum Lgv/e$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgv/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lgv/e$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lgv/e$b;

.field public static final enum b:Lgv/e$b;

.field public static final enum c:Lgv/e$b;

.field public static final enum d:Lgv/e$b;

.field public static final enum e:Lgv/e$b;

.field public static final synthetic f:[Lgv/e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lgv/e$b;

    const-string v1, "SPEAKER_PHONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lgv/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgv/e$b;->a:Lgv/e$b;

    new-instance v0, Lgv/e$b;

    const-string v1, "WIRED_HEADSET"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lgv/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgv/e$b;->b:Lgv/e$b;

    new-instance v0, Lgv/e$b;

    const-string v1, "EARPIECE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lgv/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgv/e$b;->c:Lgv/e$b;

    new-instance v0, Lgv/e$b;

    const-string v1, "BLUETOOTH"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lgv/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgv/e$b;->d:Lgv/e$b;

    new-instance v0, Lgv/e$b;

    const-string v1, "NONE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lgv/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgv/e$b;->e:Lgv/e$b;

    invoke-static {}, Lgv/e$b;->a()[Lgv/e$b;

    move-result-object v0

    sput-object v0, Lgv/e$b;->f:[Lgv/e$b;

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

.method public static synthetic a()[Lgv/e$b;
    .locals 5

    sget-object v0, Lgv/e$b;->a:Lgv/e$b;

    sget-object v1, Lgv/e$b;->b:Lgv/e$b;

    sget-object v2, Lgv/e$b;->c:Lgv/e$b;

    sget-object v3, Lgv/e$b;->d:Lgv/e$b;

    sget-object v4, Lgv/e$b;->e:Lgv/e$b;

    filled-new-array {v0, v1, v2, v3, v4}, [Lgv/e$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lgv/e$b;
    .locals 1

    const-class v0, Lgv/e$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgv/e$b;

    return-object p0
.end method

.method public static values()[Lgv/e$b;
    .locals 1

    sget-object v0, Lgv/e$b;->f:[Lgv/e$b;

    invoke-virtual {v0}, [Lgv/e$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgv/e$b;

    return-object v0
.end method

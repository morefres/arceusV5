.class public final enum Lgv/e$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgv/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lgv/e$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lgv/e$c;

.field public static final enum b:Lgv/e$c;

.field public static final synthetic c:[Lgv/e$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lgv/e$c;

    const-string v1, "UNINITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lgv/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgv/e$c;->a:Lgv/e$c;

    new-instance v0, Lgv/e$c;

    const-string v1, "RUNNING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lgv/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgv/e$c;->b:Lgv/e$c;

    invoke-static {}, Lgv/e$c;->a()[Lgv/e$c;

    move-result-object v0

    sput-object v0, Lgv/e$c;->c:[Lgv/e$c;

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

.method public static synthetic a()[Lgv/e$c;
    .locals 2

    sget-object v0, Lgv/e$c;->a:Lgv/e$c;

    sget-object v1, Lgv/e$c;->b:Lgv/e$c;

    filled-new-array {v0, v1}, [Lgv/e$c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lgv/e$c;
    .locals 1

    const-class v0, Lgv/e$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgv/e$c;

    return-object p0
.end method

.method public static values()[Lgv/e$c;
    .locals 1

    sget-object v0, Lgv/e$c;->c:[Lgv/e$c;

    invoke-virtual {v0}, [Lgv/e$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgv/e$c;

    return-object v0
.end method

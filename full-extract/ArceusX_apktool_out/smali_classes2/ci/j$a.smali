.class public final enum Lci/j$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lci/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lci/j$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lci/j$a;

.field public static final enum b:Lci/j$a;

.field public static final synthetic c:[Lci/j$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lci/j$a;

    const-string v1, "GET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lci/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lci/j$a;->a:Lci/j$a;

    new-instance v0, Lci/j$a;

    const-string v1, "POST"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lci/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lci/j$a;->b:Lci/j$a;

    invoke-static {}, Lci/j$a;->a()[Lci/j$a;

    move-result-object v0

    sput-object v0, Lci/j$a;->c:[Lci/j$a;

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

.method public static synthetic a()[Lci/j$a;
    .locals 2

    sget-object v0, Lci/j$a;->a:Lci/j$a;

    sget-object v1, Lci/j$a;->b:Lci/j$a;

    filled-new-array {v0, v1}, [Lci/j$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lci/j$a;
    .locals 1

    const-class v0, Lci/j$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lci/j$a;

    return-object p0
.end method

.method public static values()[Lci/j$a;
    .locals 1

    sget-object v0, Lci/j$a;->c:[Lci/j$a;

    invoke-virtual {v0}, [Lci/j$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lci/j$a;

    return-object v0
.end method

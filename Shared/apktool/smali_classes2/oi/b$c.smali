.class public final enum Loi/b$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loi/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Loi/b$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Loi/b$c;

.field public static final enum b:Loi/b$c;

.field public static final synthetic c:[Loi/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Loi/b$c;

    const-string v1, "LOCALE_MODE_LOGIN_SIGN_UP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Loi/b$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Loi/b$c;->a:Loi/b$c;

    new-instance v0, Loi/b$c;

    const-string v1, "LOCALE_MODE_GENERAL_EXPERIENCE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Loi/b$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Loi/b$c;->b:Loi/b$c;

    invoke-static {}, Loi/b$c;->a()[Loi/b$c;

    move-result-object v0

    sput-object v0, Loi/b$c;->c:[Loi/b$c;

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

.method public static synthetic a()[Loi/b$c;
    .locals 2

    sget-object v0, Loi/b$c;->a:Loi/b$c;

    sget-object v1, Loi/b$c;->b:Loi/b$c;

    filled-new-array {v0, v1}, [Loi/b$c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Loi/b$c;
    .locals 1

    const-class v0, Loi/b$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Loi/b$c;

    return-object p0
.end method

.method public static values()[Loi/b$c;
    .locals 1

    sget-object v0, Loi/b$c;->c:[Loi/b$c;

    invoke-virtual {v0}, [Loi/b$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Loi/b$c;

    return-object v0
.end method

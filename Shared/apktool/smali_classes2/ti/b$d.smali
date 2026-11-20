.class public final enum Lti/b$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lti/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lti/b$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lti/b$d;

.field public static final enum b:Lti/b$d;

.field public static final enum c:Lti/b$d;

.field public static final enum d:Lti/b$d;

.field public static final enum e:Lti/b$d;

.field public static final synthetic f:[Lti/b$d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lti/b$d;

    const-string v1, "LOGOUT_BY_USER_IN_NATIVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lti/b$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lti/b$d;->a:Lti/b$d;

    new-instance v0, Lti/b$d;

    const-string v1, "LOGOUT_BY_USER_IN_LUA"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lti/b$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lti/b$d;->b:Lti/b$d;

    new-instance v0, Lti/b$d;

    const-string v1, "LOGOUT_BY_401_ERROR_IN_NATIVE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lti/b$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lti/b$d;->c:Lti/b$d;

    new-instance v0, Lti/b$d;

    const-string v1, "LOGOUT_BY_401_ERROR_IN_WEB"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lti/b$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lti/b$d;->d:Lti/b$d;

    new-instance v0, Lti/b$d;

    const-string v1, "LOGOUT_BY_401_ERROR_IN_LUA"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lti/b$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lti/b$d;->e:Lti/b$d;

    invoke-static {}, Lti/b$d;->a()[Lti/b$d;

    move-result-object v0

    sput-object v0, Lti/b$d;->f:[Lti/b$d;

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

.method public static synthetic a()[Lti/b$d;
    .locals 5

    sget-object v0, Lti/b$d;->a:Lti/b$d;

    sget-object v1, Lti/b$d;->b:Lti/b$d;

    sget-object v2, Lti/b$d;->c:Lti/b$d;

    sget-object v3, Lti/b$d;->d:Lti/b$d;

    sget-object v4, Lti/b$d;->e:Lti/b$d;

    filled-new-array {v0, v1, v2, v3, v4}, [Lti/b$d;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lti/b$d;
    .locals 1

    const-class v0, Lti/b$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lti/b$d;

    return-object p0
.end method

.method public static values()[Lti/b$d;
    .locals 1

    sget-object v0, Lti/b$d;->f:[Lti/b$d;

    invoke-virtual {v0}, [Lti/b$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lti/b$d;

    return-object v0
.end method

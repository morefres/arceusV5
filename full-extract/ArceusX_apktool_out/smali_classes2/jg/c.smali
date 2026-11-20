.class public abstract enum Ljg/c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljg/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljg/c;",
        ">;",
        "Ljg/d;"
    }
.end annotation


# static fields
.field public static final enum a:Ljg/c;

.field public static final enum b:Ljg/c;

.field public static final enum c:Ljg/c;

.field public static final enum d:Ljg/c;

.field public static final enum e:Ljg/c;

.field public static final enum f:Ljg/c;

.field public static final enum g:Ljg/c;

.field public static final synthetic h:[Ljg/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljg/c$a;

    const-string v1, "IDENTITY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljg/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljg/c;->a:Ljg/c;

    new-instance v0, Ljg/c$b;

    const-string v1, "UPPER_CAMEL_CASE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljg/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljg/c;->b:Ljg/c;

    new-instance v0, Ljg/c$c;

    const-string v1, "UPPER_CAMEL_CASE_WITH_SPACES"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ljg/c$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljg/c;->c:Ljg/c;

    new-instance v0, Ljg/c$d;

    const-string v1, "UPPER_CASE_WITH_UNDERSCORES"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ljg/c$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljg/c;->d:Ljg/c;

    new-instance v0, Ljg/c$e;

    const-string v1, "LOWER_CASE_WITH_UNDERSCORES"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ljg/c$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljg/c;->e:Ljg/c;

    new-instance v0, Ljg/c$f;

    const-string v1, "LOWER_CASE_WITH_DASHES"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Ljg/c$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljg/c;->f:Ljg/c;

    new-instance v0, Ljg/c$g;

    const-string v1, "LOWER_CASE_WITH_DOTS"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Ljg/c$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljg/c;->g:Ljg/c;

    invoke-static {}, Ljg/c;->c()[Ljg/c;

    move-result-object v0

    sput-object v0, Ljg/c;->h:[Ljg/c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjg/c$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Ljg/c;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic c()[Ljg/c;
    .locals 7

    sget-object v0, Ljg/c;->a:Ljg/c;

    sget-object v1, Ljg/c;->b:Ljg/c;

    sget-object v2, Ljg/c;->c:Ljg/c;

    sget-object v3, Ljg/c;->d:Ljg/c;

    sget-object v4, Ljg/c;->e:Ljg/c;

    sget-object v5, Ljg/c;->f:Ljg/c;

    sget-object v6, Ljg/c;->g:Ljg/c;

    filled-new-array/range {v0 .. v6}, [Ljg/c;

    move-result-object v0

    return-object v0
.end method

.method public static d(Ljava/lang/String;C)Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_3

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isLetter(C)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {v3}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v0

    const/4 v3, 0x1

    if-nez v2, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/2addr v2, v3

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Ljg/c;
    .locals 1

    const-class v0, Ljg/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljg/c;

    return-object p0
.end method

.method public static values()[Ljg/c;
    .locals 1

    sget-object v0, Ljg/c;->h:[Ljg/c;

    invoke-virtual {v0}, [Ljg/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljg/c;

    return-object v0
.end method

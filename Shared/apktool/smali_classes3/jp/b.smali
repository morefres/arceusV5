.class public final enum Ljp/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljp/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljp/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0013\u0008\u0086\u0081\u0002\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0008B\u0019\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fj\u0002\u0008\u000ej\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Ljp/b;",
        "",
        "",
        "rawValue",
        "",
        "requiredPasswordCount",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;I)V",
        "a",
        "Ljava/lang/String;",
        "c",
        "()Ljava/lang/String;",
        "b",
        "I",
        "d",
        "()I",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "k",
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
.field public static final c:Ljp/b$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum d:Ljp/b;

.field public static final enum e:Ljp/b;

.field public static final enum f:Ljp/b;

.field public static final enum g:Ljp/b;

.field public static final enum h:Ljp/b;

.field public static final enum i:Ljp/b;

.field public static final enum j:Ljp/b;

.field public static final enum k:Ljp/b;

.field public static final synthetic l:[Ljp/b;

.field public static final synthetic m:Lpt/a;


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ljp/b;

    const-string v1, "MnSignForAuth"

    const/4 v2, 0x0

    const-string v3, "mn_sign_for_auth"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Ljp/b;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljp/b;->d:Ljp/b;

    new-instance v0, Ljp/b;

    const-string v1, "MnSign"

    const-string v2, "mn_sign"

    invoke-direct {v0, v1, v4, v2, v4}, Ljp/b;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljp/b;->e:Ljp/b;

    new-instance v0, Ljp/b;

    const-string v1, "mn_read_with_ver_number_b"

    const-string v2, "MnReadWithVerNumberB"

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3, v1, v4}, Ljp/b;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljp/b;->f:Ljp/b;

    new-instance v0, Ljp/b;

    const/4 v1, 0x3

    const-string v2, "mn_read"

    const-string v5, "MnRead"

    invoke-direct {v0, v5, v1, v2, v4}, Ljp/b;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljp/b;->g:Ljp/b;

    new-instance v0, Ljp/b;

    const/4 v1, 0x4

    const-string v2, "dl_read"

    const-string v5, "DlRead"

    invoke-direct {v0, v5, v1, v2, v3}, Ljp/b;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljp/b;->h:Ljp/b;

    new-instance v0, Ljp/b;

    const/4 v1, 0x5

    const-string v2, "mn_dl_read"

    const-string v5, "MnDlRead"

    invoke-direct {v0, v5, v1, v2, v4}, Ljp/b;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljp/b;->i:Ljp/b;

    new-instance v0, Ljp/b;

    const/4 v1, 0x6

    const-string v2, "mn_dl_combined_read"

    const-string v5, "MnDlCombinedRead"

    invoke-direct {v0, v5, v1, v2, v3}, Ljp/b;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljp/b;->j:Ljp/b;

    new-instance v0, Ljp/b;

    const/4 v1, 0x7

    const-string v2, "res_read"

    const-string v3, "ResRead"

    invoke-direct {v0, v3, v1, v2, v4}, Ljp/b;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ljp/b;->k:Ljp/b;

    invoke-static {}, Ljp/b;->a()[Ljp/b;

    move-result-object v0

    sput-object v0, Ljp/b;->l:[Ljp/b;

    invoke-static {v0}, Lpt/b;->a([Ljava/lang/Enum;)Lpt/a;

    move-result-object v0

    sput-object v0, Ljp/b;->m:Lpt/a;

    new-instance v0, Ljp/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljp/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ljp/b;->c:Ljp/b$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ljp/b;->a:Ljava/lang/String;

    iput p4, p0, Ljp/b;->b:I

    return-void
.end method

.method public static final synthetic a()[Ljp/b;
    .locals 8

    sget-object v0, Ljp/b;->d:Ljp/b;

    sget-object v1, Ljp/b;->e:Ljp/b;

    sget-object v2, Ljp/b;->f:Ljp/b;

    sget-object v3, Ljp/b;->g:Ljp/b;

    sget-object v4, Ljp/b;->h:Ljp/b;

    sget-object v5, Ljp/b;->i:Ljp/b;

    sget-object v6, Ljp/b;->j:Ljp/b;

    sget-object v7, Ljp/b;->k:Ljp/b;

    filled-new-array/range {v0 .. v7}, [Ljp/b;

    move-result-object v0

    return-object v0
.end method

.method public static b()Lpt/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lpt/a<",
            "Ljp/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Ljp/b;->m:Lpt/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljp/b;
    .locals 1

    const-class v0, Ljp/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljp/b;

    return-object p0
.end method

.method public static values()[Ljp/b;
    .locals 1

    sget-object v0, Ljp/b;->l:[Ljp/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljp/b;

    return-object v0
.end method


# virtual methods
.method public final c()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Ljp/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Ljp/b;->b:I

    return v0
.end method

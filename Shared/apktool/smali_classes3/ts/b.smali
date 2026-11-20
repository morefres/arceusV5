.class public abstract Lts/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lts/b$a;
    }
.end annotation


# static fields
.field public static final a:Lss/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lss/p<",
            "Lts/b$a;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lss/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lss/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lss/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lss/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lss/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lss/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lss/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lss/p<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lss/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lss/p<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Lss/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lss/p<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "list-item-type"

    invoke-static {v0}, Lss/p;->b(Ljava/lang/String;)Lss/p;

    move-result-object v0

    sput-object v0, Lts/b;->a:Lss/p;

    const-string v0, "bullet-list-item-level"

    invoke-static {v0}, Lss/p;->b(Ljava/lang/String;)Lss/p;

    move-result-object v0

    sput-object v0, Lts/b;->b:Lss/p;

    const-string v0, "ordered-list-item-number"

    invoke-static {v0}, Lss/p;->b(Ljava/lang/String;)Lss/p;

    move-result-object v0

    sput-object v0, Lts/b;->c:Lss/p;

    const-string v0, "heading-level"

    invoke-static {v0}, Lss/p;->b(Ljava/lang/String;)Lss/p;

    move-result-object v0

    sput-object v0, Lts/b;->d:Lss/p;

    const-string v0, "link-destination"

    invoke-static {v0}, Lss/p;->b(Ljava/lang/String;)Lss/p;

    move-result-object v0

    sput-object v0, Lts/b;->e:Lss/p;

    const-string v0, "paragraph-is-in-tight-list"

    invoke-static {v0}, Lss/p;->b(Ljava/lang/String;)Lss/p;

    move-result-object v0

    sput-object v0, Lts/b;->f:Lss/p;

    const-string v0, "code-block-info"

    invoke-static {v0}, Lss/p;->b(Ljava/lang/String;)Lss/p;

    move-result-object v0

    sput-object v0, Lts/b;->g:Lss/p;

    return-void
.end method

.class public abstract Lws/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lss/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lss/p<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lss/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lss/p<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lss/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lss/p<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "image-destination"

    invoke-static {v0}, Lss/p;->b(Ljava/lang/String;)Lss/p;

    move-result-object v0

    sput-object v0, Lws/c;->a:Lss/p;

    const-string v0, "image-replacement-text-is-link"

    invoke-static {v0}, Lss/p;->b(Ljava/lang/String;)Lss/p;

    move-result-object v0

    sput-object v0, Lws/c;->b:Lss/p;

    const-string v0, "image-size"

    invoke-static {v0}, Lss/p;->b(Ljava/lang/String;)Lss/p;

    move-result-object v0

    sput-object v0, Lws/c;->c:Lss/p;

    return-void
.end method

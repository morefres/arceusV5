.class public final Ljp/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lg/c<",
        "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderConfig;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Ljp/c;


# direct methods
.method public constructor <init>(Ljp/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljp/f;->a:Ljp/c;

    return-void
.end method

.method public static a(Ljp/c;)Ljp/f;
    .locals 1

    new-instance v0, Ljp/f;

    invoke-direct {v0, p0}, Ljp/f;-><init>(Ljp/c;)V

    return-object v0
.end method

.method public static c(Ljp/c;)Lg/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljp/c;",
            ")",
            "Lg/c<",
            "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderConfig;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Ljp/c;->a()Lg/c;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg/c;

    return-object p0
.end method


# virtual methods
.method public b()Lg/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg/c<",
            "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderConfig;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ljp/f;->a:Ljp/c;

    invoke-static {v0}, Ljp/f;->c(Ljp/c;)Lg/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljp/f;->b()Lg/c;

    move-result-object v0

    return-object v0
.end method

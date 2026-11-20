.class public final Lop/h;
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
        "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Lop/e;


# direct methods
.method public constructor <init>(Lop/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lop/h;->a:Lop/e;

    return-void
.end method

.method public static a(Lop/e;)Lop/h;
    .locals 1

    new-instance v0, Lop/h;

    invoke-direct {v0, p0}, Lop/h;-><init>(Lop/e;)V

    return-object v0
.end method

.method public static c(Lop/e;)Lg/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lop/e;",
            ")",
            "Lg/c<",
            "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lop/e;->a()Lg/c;

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
            "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lop/h;->a:Lop/e;

    invoke-static {v0}, Lop/h;->c(Lop/e;)Lg/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lop/h;->b()Lg/c;

    move-result-object v0

    return-object v0
.end method

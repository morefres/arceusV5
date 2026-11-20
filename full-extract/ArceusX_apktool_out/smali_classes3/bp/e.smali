.class public final Lbp/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lcom/withpersona/sdk2/inquiry/FallbackMode;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lbp/c;


# direct methods
.method public constructor <init>(Lbp/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbp/e;->a:Lbp/c;

    return-void
.end method

.method public static a(Lbp/c;)Lbp/e;
    .locals 1

    new-instance v0, Lbp/e;

    invoke-direct {v0, p0}, Lbp/e;-><init>(Lbp/c;)V

    return-object v0
.end method

.method public static b(Lbp/c;)Lcom/withpersona/sdk2/inquiry/FallbackMode;
    .locals 0

    invoke-virtual {p0}, Lbp/c;->b()Lcom/withpersona/sdk2/inquiry/FallbackMode;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/FallbackMode;

    return-object p0
.end method


# virtual methods
.method public c()Lcom/withpersona/sdk2/inquiry/FallbackMode;
    .locals 1

    iget-object v0, p0, Lbp/e;->a:Lbp/c;

    invoke-static {v0}, Lbp/e;->b(Lbp/c;)Lcom/withpersona/sdk2/inquiry/FallbackMode;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbp/e;->c()Lcom/withpersona/sdk2/inquiry/FallbackMode;

    move-result-object v0

    return-object v0
.end method

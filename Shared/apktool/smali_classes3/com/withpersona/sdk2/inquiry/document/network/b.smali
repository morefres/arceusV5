.class public final Lcom/withpersona/sdk2/inquiry/document/network/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lcom/withpersona/sdk2/inquiry/document/network/a$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lzn/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lzn/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/b;->a:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;)Lcom/withpersona/sdk2/inquiry/document/network/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lzn/c;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/document/network/b;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/network/b;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/document/network/b;-><init>(Ldt/i;)V

    return-object v0
.end method

.method public static c(Lzn/c;)Lcom/withpersona/sdk2/inquiry/document/network/a$a;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/network/a$a;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/document/network/a$a;-><init>(Lzn/c;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/document/network/a$a;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/b;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzn/c;

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/document/network/b;->c(Lzn/c;)Lcom/withpersona/sdk2/inquiry/document/network/a$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/network/b;->b()Lcom/withpersona/sdk2/inquiry/document/network/a$a;

    move-result-object v0

    return-object v0
.end method

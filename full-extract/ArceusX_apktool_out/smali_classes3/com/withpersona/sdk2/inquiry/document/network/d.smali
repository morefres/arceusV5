.class public final Lcom/withpersona/sdk2/inquiry/document/network/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lcom/withpersona/sdk2/inquiry/document/network/c$a;",
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

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lhq/k;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lzn/c;",
            ">;",
            "Ldt/i<",
            "Lhq/k;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/d;->a:Ldt/i;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/network/d;->b:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;)Lcom/withpersona/sdk2/inquiry/document/network/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lzn/c;",
            ">;",
            "Ldt/i<",
            "Lhq/k;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/document/network/d;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/network/d;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/document/network/d;-><init>(Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Lzn/c;Lhq/k;)Lcom/withpersona/sdk2/inquiry/document/network/c$a;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/network/c$a;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/document/network/c$a;-><init>(Lzn/c;Lhq/k;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/document/network/c$a;
    .locals 2

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/d;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzn/c;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/document/network/d;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhq/k;

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/document/network/d;->c(Lzn/c;Lhq/k;)Lcom/withpersona/sdk2/inquiry/document/network/c$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/network/d;->b()Lcom/withpersona/sdk2/inquiry/document/network/c$a;

    move-result-object v0

    return-object v0
.end method

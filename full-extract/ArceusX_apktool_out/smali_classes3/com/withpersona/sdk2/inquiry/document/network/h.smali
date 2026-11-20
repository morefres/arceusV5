.class public final Lcom/withpersona/sdk2/inquiry/document/network/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lcom/withpersona/sdk2/inquiry/document/network/g$a;",
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
            "Lco/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lkq/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;Ldt/i;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lzn/c;",
            ">;",
            "Ldt/i<",
            "Lco/a;",
            ">;",
            "Ldt/i<",
            "Lkq/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/h;->a:Ldt/i;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/network/h;->b:Ldt/i;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/document/network/h;->c:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;Ldt/i;)Lcom/withpersona/sdk2/inquiry/document/network/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lzn/c;",
            ">;",
            "Ldt/i<",
            "Lco/a;",
            ">;",
            "Ldt/i<",
            "Lkq/a;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/document/network/h;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/network/h;

    invoke-direct {v0, p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/network/h;-><init>(Ldt/i;Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Lzn/c;Lco/a;Lkq/a;)Lcom/withpersona/sdk2/inquiry/document/network/g$a;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/network/g$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/network/g$a;-><init>(Lzn/c;Lco/a;Lkq/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/document/network/g$a;
    .locals 3

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/h;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzn/c;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/document/network/h;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/a;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/network/h;->c:Ldt/i;

    invoke-interface {v2}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkq/a;

    invoke-static {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/document/network/h;->c(Lzn/c;Lco/a;Lkq/a;)Lcom/withpersona/sdk2/inquiry/document/network/g$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/network/h;->b()Lcom/withpersona/sdk2/inquiry/document/network/g$a;

    move-result-object v0

    return-object v0
.end method

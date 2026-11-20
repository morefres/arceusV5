.class public final Lcom/withpersona/sdk2/inquiry/governmentid/network/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lpq/a;",
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
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;",
            ">;",
            "Ldt/i<",
            "Lpq/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/a;->a:Ldt/i;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/a;->b:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;)Lcom/withpersona/sdk2/inquiry/governmentid/network/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;",
            ">;",
            "Ldt/i<",
            "Lpq/a;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/a;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/network/a;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/a;-><init>(Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Lcom/withpersona/sdk2/inquiry/governmentid/network/b;Lpq/a;)Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/network/b;Lpq/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;
    .locals 2

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/a;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/network/b;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/a;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpq/a;

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/a;->c(Lcom/withpersona/sdk2/inquiry/governmentid/network/b;Lpq/a;)Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/network/a;->b()Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;

    move-result-object v0

    return-object v0
.end method

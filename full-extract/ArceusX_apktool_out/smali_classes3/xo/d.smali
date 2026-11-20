.class public final Lxo/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
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
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxo/d;->a:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;)Lxo/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            ">;)",
            "Lxo/d;"
        }
    .end annotation

    new-instance v0, Lxo/d;

    invoke-direct {v0, p0}, Lxo/d;-><init>(Ldt/i;)V

    return-object v0
.end method

.method public static c(Lep/e;Lcom/withpersona/sdk2/inquiry/internal/network/e;)Lcom/withpersona/sdk2/inquiry/internal/c;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/c;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/c;-><init>(Lep/e;Lcom/withpersona/sdk2/inquiry/internal/network/e;)V

    return-object v0
.end method


# virtual methods
.method public b(Lep/e;)Lcom/withpersona/sdk2/inquiry/internal/c;
    .locals 1

    iget-object v0, p0, Lxo/d;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/network/e;

    invoke-static {p1, v0}, Lxo/d;->c(Lep/e;Lcom/withpersona/sdk2/inquiry/internal/network/e;)Lcom/withpersona/sdk2/inquiry/internal/c;

    move-result-object p1

    return-object p1
.end method

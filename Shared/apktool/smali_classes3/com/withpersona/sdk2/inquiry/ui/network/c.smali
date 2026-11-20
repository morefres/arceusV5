.class public final Lcom/withpersona/sdk2/inquiry/ui/network/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lor/c;",
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
            "Lor/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/network/c;->a:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;)Lcom/withpersona/sdk2/inquiry/ui/network/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lor/c;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/ui/network/c;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/ui/network/c;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/ui/network/c;-><init>(Ldt/i;)V

    return-object v0
.end method

.method public static c(Lor/c;)Lcom/withpersona/sdk2/inquiry/ui/network/b$a;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/ui/network/b$a;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/ui/network/b$a;-><init>(Lor/c;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/ui/network/b$a;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/network/c;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lor/c;

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/ui/network/c;->c(Lor/c;)Lcom/withpersona/sdk2/inquiry/ui/network/b$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/network/c;->b()Lcom/withpersona/sdk2/inquiry/ui/network/b$a;

    move-result-object v0

    return-object v0
.end method

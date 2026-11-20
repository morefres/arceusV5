.class public final Ldn/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lcom/withpersona/sdk2/camera/b;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Loq/c;",
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
            "Loq/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldn/q;->a:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;)Ldn/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Loq/c;",
            ">;)",
            "Ldn/q;"
        }
    .end annotation

    new-instance v0, Ldn/q;

    invoke-direct {v0, p0}, Ldn/q;-><init>(Ldt/i;)V

    return-object v0
.end method

.method public static c(Loq/c;)Lcom/withpersona/sdk2/camera/b;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/camera/b;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/camera/b;-><init>(Loq/c;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/camera/b;
    .locals 1

    iget-object v0, p0, Ldn/q;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loq/c;

    invoke-static {v0}, Ldn/q;->c(Loq/c;)Lcom/withpersona/sdk2/camera/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ldn/q;->b()Lcom/withpersona/sdk2/camera/b;

    move-result-object v0

    return-object v0
.end method

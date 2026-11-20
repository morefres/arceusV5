.class public final Ldn/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Ljn/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Loq/c;",
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
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Ljn/a;",
            ">;",
            "Ldt/i<",
            "Loq/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldn/t;->a:Ldt/i;

    iput-object p2, p0, Ldn/t;->b:Ldt/i;

    iput-object p3, p0, Ldn/t;->c:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;Ldt/i;)Ldn/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Ljn/a;",
            ">;",
            "Ldt/i<",
            "Loq/c;",
            ">;)",
            "Ldn/t;"
        }
    .end annotation

    new-instance v0, Ldn/t;

    invoke-direct {v0, p0, p1, p2}, Ldn/t;-><init>(Ldt/i;Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljn/a;Loq/c;Lcom/withpersona/sdk2/camera/b;Landroidx/camera/view/PreviewView;Ldn/s;Z)Lcom/withpersona/sdk2/camera/e;
    .locals 8

    new-instance v0, Lcom/withpersona/sdk2/camera/e;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/withpersona/sdk2/camera/e;-><init>(Landroid/content/Context;Ljn/a;Loq/c;Lcom/withpersona/sdk2/camera/b;Landroidx/camera/view/PreviewView;Ldn/s;Z)V

    return-object v0
.end method


# virtual methods
.method public b(Lcom/withpersona/sdk2/camera/b;Landroidx/camera/view/PreviewView;Ldn/s;Z)Lcom/withpersona/sdk2/camera/e;
    .locals 8

    iget-object v0, p0, Ldn/t;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, Ldn/t;->b:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljn/a;

    iget-object v0, p0, Ldn/t;->c:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Loq/c;

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move v7, p4

    invoke-static/range {v1 .. v7}, Ldn/t;->c(Landroid/content/Context;Ljn/a;Loq/c;Lcom/withpersona/sdk2/camera/b;Landroidx/camera/view/PreviewView;Ldn/s;Z)Lcom/withpersona/sdk2/camera/e;

    move-result-object p1

    return-object p1
.end method

.class public final Lcom/withpersona/sdk2/camera/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/camera/e$a;


# instance fields
.field public final a:Ldn/t;


# direct methods
.method public constructor <init>(Ldn/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/camera/f;->a:Ldn/t;

    return-void
.end method

.method public static b(Ldn/t;)Ldt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldn/t;",
            ")",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/camera/e$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/camera/f;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/camera/f;-><init>(Ldn/t;)V

    invoke-static {v0}, Ldt/e;->a(Ljava/lang/Object;)Ldt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/withpersona/sdk2/camera/b;Landroidx/camera/view/PreviewView;Ldn/s;Z)Lcom/withpersona/sdk2/camera/e;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/camera/f;->a:Ldn/t;

    invoke-virtual {v0, p1, p2, p3, p4}, Ldn/t;->b(Lcom/withpersona/sdk2/camera/b;Landroidx/camera/view/PreviewView;Ldn/s;Z)Lcom/withpersona/sdk2/camera/e;

    move-result-object p1

    return-object p1
.end method

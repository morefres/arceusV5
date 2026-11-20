.class public final Lmo/b;
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
            "Ldn/x;",
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
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Ldn/x;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmo/b;->a:Ldt/i;

    iput-object p2, p0, Lmo/b;->b:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;)Lmo/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Ldn/x;",
            ">;)",
            "Lmo/b;"
        }
    .end annotation

    new-instance v0, Lmo/b;

    invoke-direct {v0, p0, p1}, Lmo/b;-><init>(Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ldn/x;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lmo/a;
    .locals 1

    new-instance v0, Lmo/a;

    invoke-direct {v0, p0, p1, p2}, Lmo/a;-><init>(Landroid/content/Context;Ldn/x;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)V

    return-object v0
.end method


# virtual methods
.method public b(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lmo/a;
    .locals 2

    iget-object v0, p0, Lmo/b;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lmo/b;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldn/x;

    invoke-static {v0, v1, p1}, Lmo/b;->c(Landroid/content/Context;Ldn/x;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lmo/a;

    move-result-object p1

    return-object p1
.end method

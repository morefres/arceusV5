.class public final Lcom/withpersona/sdk2/inquiry/governmentid/g;
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
            "Ldn/x;",
            ">;",
            "Ldt/i<",
            "Loq/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/g;->a:Ldt/i;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/g;->b:Ldt/i;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/governmentid/g;->c:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;Ldt/i;)Lcom/withpersona/sdk2/inquiry/governmentid/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Ldn/x;",
            ">;",
            "Ldt/i<",
            "Loq/c;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/governmentid/g;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/g;

    invoke-direct {v0, p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/g;-><init>(Ldt/i;Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ldn/x;Loq/c;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/f;
    .locals 6

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/f;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/governmentid/f;-><init>(Landroid/content/Context;Ldn/x;Loq/c;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public b(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/f;
    .locals 3

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/g;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/g;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldn/x;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/g;->c:Ldt/i;

    invoke-interface {v2}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Loq/c;

    invoke-static {v0, v1, v2, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/g;->c(Landroid/content/Context;Ldn/x;Loq/c;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/f;

    move-result-object p1

    return-object p1
.end method

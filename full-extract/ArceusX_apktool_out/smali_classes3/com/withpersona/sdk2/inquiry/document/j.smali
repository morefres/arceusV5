.class public final Lcom/withpersona/sdk2/inquiry/document/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lcom/withpersona/sdk2/inquiry/document/i$b;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lg/c<",
            "[",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lg/c<",
            "Lg/h;",
            ">;>;"
        }
    .end annotation
.end field

.field public final c:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Loq/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;Ldt/i;Ldt/i;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lg/c<",
            "[",
            "Ljava/lang/String;",
            ">;>;",
            "Ldt/i<",
            "Lg/c<",
            "Lg/h;",
            ">;>;",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Loq/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/j;->a:Ldt/i;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/j;->b:Ldt/i;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/document/j;->c:Ldt/i;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/document/j;->d:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;Ldt/i;Ldt/i;)Lcom/withpersona/sdk2/inquiry/document/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lg/c<",
            "[",
            "Ljava/lang/String;",
            ">;>;",
            "Ldt/i<",
            "Lg/c<",
            "Lg/h;",
            ">;>;",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Loq/c;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/document/j;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/j;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/document/j;-><init>(Ldt/i;Ldt/i;Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Lg/c;Lg/c;Landroid/content/Context;Loq/c;)Lcom/withpersona/sdk2/inquiry/document/i$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg/c<",
            "[",
            "Ljava/lang/String;",
            ">;",
            "Lg/c<",
            "Lg/h;",
            ">;",
            "Landroid/content/Context;",
            "Loq/c;",
            ")",
            "Lcom/withpersona/sdk2/inquiry/document/i$b;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/i$b;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/document/i$b;-><init>(Lg/c;Lg/c;Landroid/content/Context;Loq/c;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/document/i$b;
    .locals 4

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/j;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg/c;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/document/j;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg/c;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/j;->c:Ldt/i;

    invoke-interface {v2}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/document/j;->d:Ldt/i;

    invoke-interface {v3}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Loq/c;

    invoke-static {v0, v1, v2, v3}, Lcom/withpersona/sdk2/inquiry/document/j;->c(Lg/c;Lg/c;Landroid/content/Context;Loq/c;)Lcom/withpersona/sdk2/inquiry/document/i$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/j;->b()Lcom/withpersona/sdk2/inquiry/document/i$b;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/withpersona/sdk2/inquiry/internal/e$t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhp/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/internal/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "t"
.end annotation


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

.field public final b:Lcom/withpersona/sdk2/inquiry/internal/e$t;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/e$f;Lhp/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$t;->b:Lcom/withpersona/sdk2/inquiry/internal/e$t;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$t;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lhp/b;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$t;->b(Lhp/b;)V

    return-void
.end method

.method public b(Lhp/b;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$t;->c(Lhp/b;)Lhp/b;

    return-void
.end method

.method public final c(Lhp/b;)Lhp/b;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$t;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/e$f;->a()Lbt/b;

    move-result-object v0

    invoke-static {p1, v0}, Lmq/b;->a(Lmq/a;Lbt/b;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$t;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->W:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lym/c0;

    invoke-static {p1, v0}, Lhp/d;->b(Lhp/b;Lym/c0;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$t;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->D0:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltq/a;

    invoke-static {p1, v0}, Lhp/d;->a(Lhp/b;Ltq/a;)V

    return-object p1
.end method

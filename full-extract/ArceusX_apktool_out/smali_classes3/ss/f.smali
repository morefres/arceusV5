.class public Lss/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lss/e$a;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lss/j;",
            ">;"
        }
    .end annotation
.end field

.field public c:Landroid/widget/TextView$BufferType;

.field public d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lss/f;->b:Ljava/util/List;

    sget-object v0, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    iput-object v0, p0, Lss/f;->c:Landroid/widget/TextView$BufferType;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lss/f;->d:Z

    iput-object p1, p0, Lss/f;->a:Landroid/content/Context;

    return-void
.end method

.method public static b(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .param p0    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lss/j;",
            ">;)",
            "Ljava/util/List<",
            "Lss/j;",
            ">;"
        }
    .end annotation

    new-instance v0, Lss/q;

    invoke-direct {v0, p0}, Lss/q;-><init>(Ljava/util/List;)V

    invoke-virtual {v0}, Lss/q;->b()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lss/j;)Lss/e$a;
    .locals 1
    .param p1    # Lss/j;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lss/f;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public build()Lss/e;
    .locals 14
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lss/f;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lss/f;->b:Ljava/util/List;

    invoke-static {v0}, Lss/f;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lpn/f$a;

    invoke-direct {v1}, Lpn/f$a;-><init>()V

    iget-object v2, p0, Lss/f;->a:Landroid/content/Context;

    invoke-static {v2}, Lts/c;->i(Landroid/content/Context;)Lts/c$a;

    move-result-object v2

    new-instance v3, Lss/g$a;

    invoke-direct {v3}, Lss/g$a;-><init>()V

    new-instance v4, Lss/o$a;

    invoke-direct {v4}, Lss/o$a;-><init>()V

    new-instance v5, Lss/l$a;

    invoke-direct {v5}, Lss/l$a;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lss/j;

    invoke-interface {v7, v1}, Lss/j;->b(Lpn/f$a;)V

    invoke-interface {v7, v2}, Lss/j;->e(Lts/c$a;)V

    invoke-interface {v7, v3}, Lss/j;->i(Lss/g$a;)V

    invoke-interface {v7, v4}, Lss/j;->a(Lss/m$b;)V

    invoke-interface {v7, v5}, Lss/j;->f(Lss/k$a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lts/c$a;->z()Lts/c;

    move-result-object v2

    invoke-interface {v5}, Lss/k$a;->build()Lss/k;

    move-result-object v5

    invoke-virtual {v3, v2, v5}, Lss/g$a;->h(Lts/c;Lss/k;)Lss/g;

    move-result-object v11

    invoke-static {v4, v11}, Lss/n;->b(Lss/m$b;Lss/g;)Lss/n;

    move-result-object v10

    new-instance v6, Lss/i;

    iget-object v7, p0, Lss/f;->c:Landroid/widget/TextView$BufferType;

    invoke-virtual {v1}, Lpn/f$a;->k()Lpn/f;

    move-result-object v9

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v12

    iget-boolean v13, p0, Lss/f;->d:Z

    const/4 v8, 0x0

    invoke-direct/range {v6 .. v13}, Lss/i;-><init>(Landroid/widget/TextView$BufferType;Lss/e$b;Lpn/f;Lss/n;Lss/g;Ljava/util/List;Z)V

    return-object v6

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No plugins were added to this builder. Use #usePlugin method to add them"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.class public final synthetic Lfr/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lfr/m;

.field public final synthetic b:Landroidx/recyclerview/widget/RecyclerView$f0;


# direct methods
.method public synthetic constructor <init>(Lfr/m;Landroidx/recyclerview/widget/RecyclerView$f0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfr/l;->a:Lfr/m;

    iput-object p2, p0, Lfr/l;->b:Landroidx/recyclerview/widget/RecyclerView$f0;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lfr/l;->a:Lfr/m;

    iget-object v1, p0, Lfr/l;->b:Landroidx/recyclerview/widget/RecyclerView$f0;

    invoke-static {v0, v1, p1}, Lfr/m;->D(Lfr/m;Landroidx/recyclerview/widget/RecyclerView$f0;Landroid/view/View;)V

    return-void
.end method

.class public final synthetic Lhq/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyt/n;


# instance fields
.field public final synthetic a:Lyt/n;


# direct methods
.method public synthetic constructor <init>(Lyt/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhq/a;->a:Lyt/n;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lhq/a;->a:Lyt/n;

    check-cast p2, Lr5/a;

    check-cast p3, Landroidx/recyclerview/widget/RecyclerView$f0;

    invoke-static {v0, p1, p2, p3}, Lhq/e;->d(Lyt/n;Ljava/lang/Object;Lr5/a;Landroidx/recyclerview/widget/RecyclerView$f0;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method

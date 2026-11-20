.class public final synthetic Lfr/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/c0;

.field public final synthetic b:Lfr/m;

.field public final synthetic c:Lfr/j;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/c0;Lfr/m;Lfr/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfr/d;->a:Lkotlin/jvm/internal/c0;

    iput-object p2, p0, Lfr/d;->b:Lfr/m;

    iput-object p3, p0, Lfr/d;->c:Lfr/j;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lfr/d;->a:Lkotlin/jvm/internal/c0;

    iget-object v1, p0, Lfr/d;->b:Lfr/m;

    iget-object v2, p0, Lfr/d;->c:Lfr/j;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, v2, p1}, Lfr/j;->c(Lkotlin/jvm/internal/c0;Lfr/m;Lfr/j;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method

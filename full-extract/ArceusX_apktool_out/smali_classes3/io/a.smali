.class public final synthetic Lio/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lio/m;

.field public final synthetic b:Lar/y4;

.field public final synthetic c:Llo/b;


# direct methods
.method public synthetic constructor <init>(Lio/m;Lar/y4;Llo/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/a;->a:Lio/m;

    iput-object p2, p0, Lio/a;->b:Lar/y4;

    iput-object p3, p0, Lio/a;->c:Llo/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lio/a;->a:Lio/m;

    iget-object v1, p0, Lio/a;->b:Lar/y4;

    iget-object v2, p0, Lio/a;->c:Llo/b;

    invoke-static {v0, v1, v2}, Lio/m;->l(Lio/m;Lar/y4;Llo/b;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

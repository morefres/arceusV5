.class public final synthetic Lio/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lio/m;

.field public final synthetic b:Llo/b;


# direct methods
.method public synthetic constructor <init>(Lio/m;Llo/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/l;->a:Lio/m;

    iput-object p2, p0, Lio/l;->b:Llo/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lio/l;->a:Lio/m;

    iget-object v1, p0, Lio/l;->b:Llo/b;

    invoke-static {v0, v1}, Lio/m;->o(Lio/m;Llo/b;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

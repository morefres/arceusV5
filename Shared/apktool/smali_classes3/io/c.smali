.class public final synthetic Lio/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lio/m;


# direct methods
.method public synthetic constructor <init>(Lio/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/c;->a:Lio/m;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lio/c;->a:Lio/m;

    invoke-static {v0}, Lio/m;->j(Lio/m;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

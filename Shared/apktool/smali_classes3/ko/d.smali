.class public final synthetic Lko/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Llo/c;


# direct methods
.method public synthetic constructor <init>(Llo/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lko/d;->a:Llo/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lko/d;->a:Llo/c;

    invoke-static {v0}, Lko/h;->f(Llo/c;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

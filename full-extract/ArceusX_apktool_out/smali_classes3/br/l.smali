.class public final synthetic Lbr/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Llq/d;


# direct methods
.method public synthetic constructor <init>(Llq/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbr/l;->a:Llq/d;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lbr/l;->a:Llq/d;

    invoke-static {v0}, Lbr/n;->g(Llq/d;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

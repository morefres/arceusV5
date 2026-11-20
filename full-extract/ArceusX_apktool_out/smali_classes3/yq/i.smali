.class public final synthetic Lyq/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lyq/p;


# direct methods
.method public synthetic constructor <init>(Lyq/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyq/i;->a:Lyq/p;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lyq/i;->a:Lyq/p;

    invoke-static {v0}, Lyq/p;->f(Lyq/p;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

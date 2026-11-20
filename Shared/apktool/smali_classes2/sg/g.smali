.class public final synthetic Lsg/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lsg/i;


# direct methods
.method public synthetic constructor <init>(Lsg/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsg/g;->a:Lsg/i;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lsg/g;->a:Lsg/i;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lsg/i;->b(Lsg/i;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method

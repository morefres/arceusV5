.class public final synthetic Lmj/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lnj/f;


# direct methods
.method public synthetic constructor <init>(Lnj/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmj/g;->a:Lnj/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lmj/g;->a:Lnj/f;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lmj/j;->b(Lnj/f;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method

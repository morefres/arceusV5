.class public final synthetic Lkh/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkh/g;

.field public final synthetic b:Llh/a;


# direct methods
.method public synthetic constructor <init>(Lkh/g;Llh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkh/e;->a:Lkh/g;

    iput-object p2, p0, Lkh/e;->b:Llh/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lkh/e;->a:Lkh/g;

    iget-object v1, p0, Lkh/e;->b:Llh/a;

    check-cast p1, Lf5/b;

    invoke-static {v0, v1, p1}, Lkh/g;->q(Lkh/g;Llh/a;Lf5/b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method

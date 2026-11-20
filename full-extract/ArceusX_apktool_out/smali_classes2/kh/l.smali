.class public final synthetic Lkh/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkh/m;

.field public final synthetic b:[Llh/b;


# direct methods
.method public synthetic constructor <init>(Lkh/m;[Llh/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkh/l;->a:Lkh/m;

    iput-object p2, p0, Lkh/l;->b:[Llh/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lkh/l;->a:Lkh/m;

    iget-object v1, p0, Lkh/l;->b:[Llh/b;

    check-cast p1, Lf5/b;

    invoke-static {v0, v1, p1}, Lkh/m;->h(Lkh/m;[Llh/b;Lf5/b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method

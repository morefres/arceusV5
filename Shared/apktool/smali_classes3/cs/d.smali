.class public final synthetic Lcs/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lcs/e;


# direct methods
.method public synthetic constructor <init>(Lcs/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcs/d;->a:Lcs/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcs/d;->a:Lcs/e;

    check-cast p1, Lbs/b;

    check-cast p2, Lur/l;

    invoke-static {v0, p1, p2}, Lcs/e;->c(Lcs/e;Lbs/b;Lur/l;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

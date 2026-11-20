.class public final synthetic Lzl/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lzl/m$a;


# direct methods
.method public synthetic constructor <init>(Lzl/m$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzl/l;->a:Lzl/m$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lzl/l;->a:Lzl/m$a;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v0, p1}, Lzl/m;->d(Lzl/m$a;Ljava/lang/Integer;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method

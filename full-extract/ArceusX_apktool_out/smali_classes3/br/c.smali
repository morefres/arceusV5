.class public final synthetic Lbr/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lbr/n;


# direct methods
.method public synthetic constructor <init>(Lbr/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbr/c;->a:Lbr/n;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lbr/c;->a:Lbr/n;

    invoke-static {v0}, Lbr/n;->m(Lbr/n;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

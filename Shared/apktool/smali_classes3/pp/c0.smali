.class public final synthetic Lpp/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lpp/g0;


# direct methods
.method public synthetic constructor <init>(Lpp/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpp/c0;->a:Lpp/g0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpp/c0;->a:Lpp/g0;

    invoke-static {v0}, Lpp/g0;->f(Lpp/g0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.class public final synthetic Lpr/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lpr/g1;


# direct methods
.method public synthetic constructor <init>(Lpr/g1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpr/z0;->a:Lpr/g1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpr/z0;->a:Lpr/g1;

    invoke-static {v0}, Lpr/g1;->F(Lpr/g1;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
